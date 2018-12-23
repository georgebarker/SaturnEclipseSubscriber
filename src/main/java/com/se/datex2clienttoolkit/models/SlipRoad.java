package com.se.datex2clienttoolkit.models;

import com.se.datex2.schema.CarriagewayEnum;

public class SlipRoad {
	private int linkId;
	private String roadNumber;
	private String roadName;
	private int junctionNumber;
	private CarriagewayEnum slipRoadType;

	public SlipRoad(int linkId, String roadNumber, String roadName, int junctionNumber, CarriagewayEnum slipRoadType) {
		this.linkId = linkId;
		this.roadNumber = roadNumber;
		this.slipRoadType = slipRoadType;
		this.roadName = roadName;
		this.setJunctionNumber(junctionNumber);
	}

	public int getLinkId() {
		return linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public String getRoadNumber() {
		return roadNumber;
	}

	public void setRoadNumber(String roadNumber) {
		this.roadNumber = roadNumber;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public CarriagewayEnum getSlipRoadType() {
		return slipRoadType;
	}

	public void setSlipRoadType(CarriagewayEnum slipRoadType) {
		this.slipRoadType = slipRoadType;
	}

	public int getJunctionNumber() {
		return junctionNumber;
	}

	public void setJunctionNumber(int junctionNumber) {
		this.junctionNumber = junctionNumber;
	}

	@Override
	public String toString() {
		return "SlipRoad [linkId=" + linkId + ", roadNumber=" + roadNumber + ", roadName=" + roadName
				+ ", junctionNumber=" + junctionNumber + ", slipRoadType=" + slipRoadType + "]";
	}
}
