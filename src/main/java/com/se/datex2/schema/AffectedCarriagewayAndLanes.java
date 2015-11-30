//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary positional information which details carriageway and lane locations. Several instances may exist where the element being described extends over more than one carriageway.
 * 
 * <p>Java class for AffectedCarriagewayAndLanes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedCarriagewayAndLanes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/2/2_0}CarriagewayEnum"/>
 *         &lt;element name="lane" type="{http://datex2.eu/schema/2/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="affectedCarriagewayAndLanesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCarriagewayAndLanes", propOrder = {
    "carriageway",
    "lane",
    "footpath",
    "lengthAffected",
    "affectedCarriagewayAndLanesExtension"
})
public class AffectedCarriagewayAndLanes {

    @XmlElement(required = true)
    protected CarriagewayEnum carriageway;
    protected List<LaneEnum> lane;
    protected Boolean footpath;
    protected Float lengthAffected;
    protected ExtensionType affectedCarriagewayAndLanesExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * @return
     *     possible object is
     *     {@link CarriagewayEnum }
     *     
     */
    public CarriagewayEnum getCarriageway() {
        return carriageway;
    }

    /**
     * Sets the value of the carriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarriagewayEnum }
     *     
     */
    public void setCarriageway(CarriagewayEnum value) {
        this.carriageway = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getLane() {
        if (lane == null) {
            lane = new ArrayList<LaneEnum>();
        }
        return this.lane;
    }

    /**
     * Gets the value of the footpath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Sets the value of the footpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    /**
     * Gets the value of the lengthAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Sets the value of the lengthAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the affectedCarriagewayAndLanesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAffectedCarriagewayAndLanesExtension() {
        return affectedCarriagewayAndLanesExtension;
    }

    /**
     * Sets the value of the affectedCarriagewayAndLanesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAffectedCarriagewayAndLanesExtension(ExtensionType value) {
        this.affectedCarriagewayAndLanesExtension = value;
    }

}
