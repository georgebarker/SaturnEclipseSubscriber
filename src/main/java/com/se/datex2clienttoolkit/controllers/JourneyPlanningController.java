package com.se.datex2clienttoolkit.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.datex2clienttoolkit.datastores.SlipRoadsDataStore;
import com.se.datex2clienttoolkit.models.NetworkLinkDTO;
import com.se.datex2clienttoolkit.models.SlipRoad;
import com.se.datex2clienttoolkit.services.JourneyPlanningService;



/**
 * 
 * This HTTP controller provides a URL to retrieve data objects relevant to the
 * Optimal Journey Planning project.
 * 
 * @author George Barker
 *
 */

@RestController
@RequestMapping("/api")
public class JourneyPlanningController {
	
	@Autowired
	SlipRoadsDataStore slipRoadsDataStore;
	
	@Autowired
	JourneyPlanningService journeyPlanningService;
	
	@RequestMapping("/entrySlipRoad/all")
	public Map<String, List<SlipRoad>> entrySlipRoadAll() {
		return slipRoadsDataStore.getEntrySlipRoads();
	}
	
	@RequestMapping("/exitSlipRoad/all")
	public Map<String, List<SlipRoad>> exitSlipRoadAll() {
		return slipRoadsDataStore.getExitSlipRoads();
	}
	
	@RequestMapping("/networkLink/{linkId}")
	public NetworkLinkDTO networkLinkFromLinkId(@PathVariable long linkId) {
		return journeyPlanningService.getNetworkLinkFromLinkId(linkId);
	}
	
	@RequestMapping("/networkLink")
	public List<NetworkLinkDTO> networkLinksAll() {
		return journeyPlanningService.getNetworkLinks();
	}
	

}
