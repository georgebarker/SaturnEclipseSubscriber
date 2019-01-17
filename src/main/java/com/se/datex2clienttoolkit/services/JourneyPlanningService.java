package com.se.datex2clienttoolkit.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.datex2.schema.CarriagewayEnum;
import com.se.datex2.schema.DistanceFromLinearElementReferent;
import com.se.datex2.schema.Linear;
import com.se.datex2.schema.NetworkLocation;
import com.se.datex2.schema.Point;
import com.se.datex2clienttoolkit.datastores.NwkLinkStaticDataStore;
import com.se.datex2clienttoolkit.datastores.NwkNodeStaticDataStore;
import com.se.datex2clienttoolkit.datastores.data.NwkLinkStaticData;
import com.se.datex2clienttoolkit.datastores.data.NwkNodeStaticData;
import com.se.datex2clienttoolkit.models.NetworkLinkDTO;
import com.se.datex2clienttoolkit.models.SlipRoad;

/**
 * 
 * This service assists with the transformation of the static data in the
 * predefined client toolkit data stores, into data transfer objects specialised
 * for the journey planning system.
 * 
 * @author George Barker
 *
 */
@Service
public class JourneyPlanningService {

	private static final char SPACE = ' ';
	private static final char J = 'J';
	private static final String DIGITS_ONLY_REGEX = "[\\D.]";
	private static final String EMPTY_STRING = "";

	@Autowired
	NwkLinkStaticDataStore nwkLinkStaticDataStore;

	@Autowired
	NwkNodeStaticDataStore nwkNodeStaticDataStore;

	public Map<String, List<SlipRoad>> getSlipRoads(CarriagewayEnum slipRoadType) {
		List<NwkLinkStaticData> networkLinks = nwkLinkStaticDataStore.getAllNwkLinkStaticData();
		Map<String, List<SlipRoad>> slipRoads = new TreeMap<>(getMapComparator());

		for (NwkLinkStaticData networkLink : networkLinks) {
			if (isSpecifiedSlipRoadType(networkLink, slipRoadType)) {
				int linkId = Integer.valueOf(networkLink.getNwkLinkStaticIdentifier());
				String roadName = retrieveRoadNameFromNetworkLink(networkLink);
				String roadNumber = retrieveRoadNumberFromNetworkLink(networkLink);
				int junctionNumber = retrieveJunctionNumberFromRoadName(roadName);
				SlipRoad slipRoad = new SlipRoad(linkId, roadNumber, roadName, junctionNumber, slipRoadType);

				List<SlipRoad> retrievedSlipRoads = slipRoads.get(roadNumber);

				if (retrievedSlipRoads != null) {
					retrievedSlipRoads.add(slipRoad);
					orderListByJunctionNumbersAscending(retrievedSlipRoads);
				} else {
					List<SlipRoad> newSlipRoadList = new ArrayList<>();
					newSlipRoadList.add(slipRoad);
					slipRoads.put(roadNumber, newSlipRoadList);
				}
			}
		}
		return slipRoads;
	}
	
	public List<NetworkLinkDTO> getNetworkLinks() {
		List<NwkLinkStaticData> nwkLinkStaticDataList = nwkLinkStaticDataStore.getAllNwkLinkStaticData();
		List<NetworkLinkDTO> networkLinks = new ArrayList<>();
		
		for (NwkLinkStaticData nwkLinkStaticData : nwkLinkStaticDataList) {
			networkLinks.add(translateNwkLinkStaticDataToDTO(nwkLinkStaticData));
		}
		
		return networkLinks;
	}

	public NetworkLinkDTO getNetworkLinkFromLinkId(long linkId) {
		NwkLinkStaticData nwkLinkStaticData = (NwkLinkStaticData) nwkLinkStaticDataStore
				.getData(String.valueOf(linkId));
		
		return translateNwkLinkStaticDataToDTO(nwkLinkStaticData);
	}
	
	private NetworkLinkDTO translateNwkLinkStaticDataToDTO(NwkLinkStaticData nwkLinkStaticData) {
		if (nwkLinkStaticData == null) {
			return null;
		}

		long linkId = Long.valueOf(nwkLinkStaticData.getNwkLinkStaticIdentifier());
		float linkLength = getLinkLengthFromNwkLinkStaticData(nwkLinkStaticData);
		long lanes = getLanesFromNwkLinkStaticData(nwkLinkStaticData);
		String carriageway = getCarriagewayFromNwkLinkStaticData(nwkLinkStaticData);
		String direction = getDirectionFromNwkLinkStaticData(nwkLinkStaticData);
		String linkName = retrieveRoadNameFromNetworkLink(nwkLinkStaticData);

		NwkNodeStaticData startNode = getStartNodeFromNwkLinkStaticData(nwkLinkStaticData);
		NwkNodeStaticData endNode = getEndNodeFromNwkLinkStaticData(nwkLinkStaticData);

		double startNodeLatitude = getLatitudeFromNwkNodeStaticData(startNode);
		double startNodeLongitude = getLongitudeFromNwkNodeStaticData(startNode);
		double endNodeLatitude = getLatitudeFromNwkNodeStaticData(endNode);
		double endNodeLongitude = getLongitudeFromNwkNodeStaticData(endNode);

		long startNodeId = Long.valueOf(startNode.getNwkNodeStaticIdentifier());
		long endNodeId = Long.valueOf(endNode.getNwkNodeStaticIdentifier());

		//linkCost and linkType are still Null.
		NetworkLinkDTO networkLink = new NetworkLinkDTO(linkLength, 50D, linkId, lanes, carriageway, direction,
				linkName, null, endNodeLatitude, endNodeLongitude, startNodeLatitude, startNodeLongitude, endNodeId,
				startNodeId);
		
		return networkLink;
	}

	private double getLatitudeFromNwkNodeStaticData(NwkNodeStaticData nwkNodeStaticData) {
		Point point = (Point) nwkNodeStaticData.getNwkNodeStaticData().getLocation();
		return point.getPointByCoordinates().getPointCoordinates().getLatitude();
	}

	private double getLongitudeFromNwkNodeStaticData(NwkNodeStaticData nwkNodeStaticData) {
		Point point = (Point) nwkNodeStaticData.getNwkNodeStaticData().getLocation();
		return point.getPointByCoordinates().getPointCoordinates().getLongitude();
	}

	// Verify these two are the right way around
	private NwkNodeStaticData getStartNodeFromNwkLinkStaticData(NwkLinkStaticData networkLink) {
		DistanceFromLinearElementReferent fromPointReferent = (DistanceFromLinearElementReferent) getLinearFromNetworkLink(
				networkLink).getLinearWithinLinearElement().getFromPoint();

		String fromPointNetworkNode = fromPointReferent.getFromReferent().getReferentIdentifier();
		return getNetworkNodeFromNwkLinkStaticData(fromPointNetworkNode);
	}

	private NwkNodeStaticData getEndNodeFromNwkLinkStaticData(NwkLinkStaticData networkLink) {
		DistanceFromLinearElementReferent towardsPointReferent = (DistanceFromLinearElementReferent) getLinearFromNetworkLink(
				networkLink).getLinearWithinLinearElement().getToPoint();

		// Although it would make sense to use towardsPointReferent#getTowardsReferent
		// here, the code actually uses getFromReferent.
		String towardsPointNetworkNode = towardsPointReferent.getFromReferent().getReferentIdentifier();
		return getNetworkNodeFromNwkLinkStaticData(towardsPointNetworkNode);
	}

	private NwkNodeStaticData getNetworkNodeFromNwkLinkStaticData(String linkId) {
		return (NwkNodeStaticData) nwkNodeStaticDataStore.getData(linkId);
	}

	private String getDirectionFromNwkLinkStaticData(NwkLinkStaticData nwkLinkStaticData) {
		return getLinearFromNetworkLink(nwkLinkStaticData).getLinearWithinLinearElement()
				.getDirectionBoundOnLinearSection().toString();
	}

	private String getCarriagewayFromNwkLinkStaticData(NwkLinkStaticData nwkLinkStaticData) {
		return getLinearFromNetworkLink(nwkLinkStaticData).getSupplementaryPositionalDescription()
				.getAffectedCarriagewayAndLanes().get(0).getCarriageway().toString();
	}

	private float getLinkLengthFromNwkLinkStaticData(NwkLinkStaticData nwkLinkStaticData) {
		return getLinearFromNetworkLink(nwkLinkStaticData).getSupplementaryPositionalDescription()
				.getAffectedCarriagewayAndLanes().get(0).getLengthAffected();
	}

	private long getLanesFromNwkLinkStaticData(NwkLinkStaticData nwkLinkStaticData) {

		// don't think this is right, there's always only one lane?!
		// Do we even care though?
		return getLinearFromNetworkLink(nwkLinkStaticData).getSupplementaryPositionalDescription()
				.getAffectedCarriagewayAndLanes().size();
	}

	private boolean isSpecifiedSlipRoadType(NwkLinkStaticData networkLink, CarriagewayEnum slipRoadType) {
		NetworkLocation nwkLocation = (NetworkLocation) networkLink.getNwkLinkStaticData().getLocation();
		return slipRoadType == nwkLocation.getSupplementaryPositionalDescription().getAffectedCarriagewayAndLanes()
				.get(0).getCarriageway();
	}

	private String retrieveRoadNameFromNetworkLink(NwkLinkStaticData networkLink) {
		return networkLink.getNwkLinkStaticData().getPredefinedLocationName().getValues().getValue().get(0).getValue();
	}

	private String retrieveRoadNumberFromNetworkLink(NwkLinkStaticData networkLink) {
		Linear linear = getLinearFromNetworkLink(networkLink);
		return linear.getLinearWithinLinearElement().getLinearElement().getRoadNumber();
	}

	private Linear getLinearFromNetworkLink(NwkLinkStaticData networkLink) {
		return (Linear) networkLink.getNwkLinkStaticData().getLocation();
	}

	private int retrieveJunctionNumberFromRoadName(String roadName) {
		int indexOfJ = roadName.indexOf(J);

		// If there's no letter J then it is not a numbered junction, so just return -1.
		if (indexOfJ == -1) {
			return indexOfJ;
		}

		// Trims the string down so the junction number is at the start.
		String junctionNumber = roadName.substring(indexOfJ + 1);
		int indexOfSpace = junctionNumber.indexOf(SPACE);

		/*
		 * if the junction number is the last thing in the String, there will be no
		 * space. If there is a space, trim the String down so that the only thing left
		 * is the junction number
		 */
		if (indexOfSpace != -1) {
			junctionNumber = junctionNumber.substring(0, indexOfSpace);
		}

		/*
		 * Check if the String still contains any non-numeric characters and strip them
		 * (for example, junction 6A)
		 */
		junctionNumber = removeNonNumericCharacters(junctionNumber);

		return Integer.valueOf(junctionNumber);

	}

	private void orderListByJunctionNumbersAscending(List<SlipRoad> slipRoads) {
		slipRoads.sort(new Comparator<SlipRoad>() {
			@Override
			public int compare(SlipRoad o1, SlipRoad o2) {
				return o1.getJunctionNumber() - o2.getJunctionNumber();
			}
		});
	}

	private String removeNonNumericCharacters(String text) {
		return text.replaceAll(DIGITS_ONLY_REGEX, EMPTY_STRING);
	}

	/*
	 * This is used to ensure that the road list is A Roads then M roads, and
	 * ordered by number.
	 */
	private Comparator<String> getMapComparator() {
		return new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		};
	}
}
