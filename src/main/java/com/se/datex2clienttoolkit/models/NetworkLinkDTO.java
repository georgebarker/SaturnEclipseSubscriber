package com.se.datex2clienttoolkit.models;

public class NetworkLinkDTO {
	
	private long linkId;

	private Float linkLength;
	private Double linkCost;

	private long lanes;

	private String carriageway;
	private String direction;
	private String linkName;
	private String linkType;

	private long startNodeId;
	private long endNodeId;

	private double startNodeLatitude;
	private double startNodeLongitude;

	private double endNodeLatitude;
	private double endNodeLongitude;
	
	public NetworkLinkDTO(Float linkLength, Double linkCost, long linkId, long lanes, String carriageway,
			String direction, String linkName, String linkType, double endNodeLatitude, double endNodeLongitude,
			double startNodeLatitude, double startNodeLongitude, long endNodeId, long startNodeId) {
		super();
		this.linkLength = linkLength;
		this.linkCost = linkCost;
		this.linkId = linkId;
		this.lanes = lanes;
		this.carriageway = carriageway;
		this.direction = direction;
		this.linkName = linkName;
		this.linkType = linkType;
		this.endNodeLatitude = endNodeLatitude;
		this.endNodeLongitude = endNodeLongitude;
		this.startNodeLatitude = startNodeLatitude;
		this.startNodeLongitude = startNodeLongitude;
		this.endNodeId = endNodeId;
		this.startNodeId = startNodeId;
	}

	public Float getLinkLength() {
		return linkLength;
	}

	public void setLinkLength(Float linkLength) {
		this.linkLength = linkLength;
	}

	public Double getLinkCost() {
		return linkCost;
	}

	public void setLinkCost(Double linkCost) {
		this.linkCost = linkCost;
	}

	public long getLinkId() {
		return linkId;
	}

	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}

	public long getLanes() {
		return lanes;
	}

	public void setLanes(long lanes) {
		this.lanes = lanes;
	}

	public String getCarriageway() {
		return carriageway;
	}

	public void setCarriageway(String carriageway) {
		this.carriageway = carriageway;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkType() {
		return linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public double getEndNodeLatitude() {
		return endNodeLatitude;
	}

	public void setEndNodeLatitude(double endNodeLatitude) {
		this.endNodeLatitude = endNodeLatitude;
	}

	public double getEndNodeLongitude() {
		return endNodeLongitude;
	}

	public void setEndNodeLongitude(double endNodeLongitude) {
		this.endNodeLongitude = endNodeLongitude;
	}

	public double getStartNodeLatitude() {
		return startNodeLatitude;
	}

	public void setStartNodeLatitude(double startNodeLatitude) {
		this.startNodeLatitude = startNodeLatitude;
	}

	public double getStartNodeLongitude() {
		return startNodeLongitude;
	}

	public void setStartNodeLongitude(double startNodeLongitude) {
		this.startNodeLongitude = startNodeLongitude;
	}

	public long getEndNodeId() {
		return endNodeId;
	}

	public void setEndNodeId(long endNodeId) {
		this.endNodeId = endNodeId;
	}

	public long getStartNodeId() {
		return startNodeId;
	}

	public void setStartNodeId(long startNodeId) {
		this.startNodeId = startNodeId;
	}

}
