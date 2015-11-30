//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The status of an individual lane.
 * 
 * <p>Java class for IndividualLane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualLane">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="laneIdentifier" type="{http://datex2.eu/schema/2/2_0}LaneEnum"/>
 *         &lt;element name="laneStatus" type="{http://datex2.eu/schema/2/2_0}LaneStatusEnum"/>
 *         &lt;element name="individualLaneExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualLane", propOrder = {
    "laneIdentifier",
    "laneStatus",
    "individualLaneExtension"
})
public class IndividualLane {

    @XmlElement(required = true)
    protected LaneEnum laneIdentifier;
    @XmlElement(required = true)
    protected LaneStatusEnum laneStatus;
    protected ExtensionType individualLaneExtension;

    /**
     * Gets the value of the laneIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getLaneIdentifier() {
        return laneIdentifier;
    }

    /**
     * Sets the value of the laneIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setLaneIdentifier(LaneEnum value) {
        this.laneIdentifier = value;
    }

    /**
     * Gets the value of the laneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LaneStatusEnum }
     *     
     */
    public LaneStatusEnum getLaneStatus() {
        return laneStatus;
    }

    /**
     * Sets the value of the laneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneStatusEnum }
     *     
     */
    public void setLaneStatus(LaneStatusEnum value) {
        this.laneStatus = value;
    }

    /**
     * Gets the value of the individualLaneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualLaneExtension() {
        return individualLaneExtension;
    }

    /**
     * Sets the value of the individualLaneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualLaneExtension(ExtensionType value) {
        this.individualLaneExtension = value;
    }

}
