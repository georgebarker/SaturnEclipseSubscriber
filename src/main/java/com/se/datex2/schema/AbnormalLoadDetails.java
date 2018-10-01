//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional details of an Abnormal Load Event.
 * 
 * <p>Java class for AbnormalLoadDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbnormalLoadDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isEscorted" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="maximumSpeed" type="{http://datex2.eu/schema/2/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="routeDescription" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="currentLocation" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalLoadDetails", propOrder = {
    "isEscorted",
    "maximumSpeed",
    "routeDescription",
    "currentLocation"
})
public class AbnormalLoadDetails {

    protected Boolean isEscorted;
    protected Float maximumSpeed;
    @XmlElement(required = true)
    protected String routeDescription;
    protected Location currentLocation;

    /**
     * Gets the value of the isEscorted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEscorted() {
        return isEscorted;
    }

    /**
     * Sets the value of the isEscorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEscorted(Boolean value) {
        this.isEscorted = value;
    }

    /**
     * Gets the value of the maximumSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Sets the value of the maximumSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumSpeed(Float value) {
        this.maximumSpeed = value;
    }

    /**
     * Gets the value of the routeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDescription() {
        return routeDescription;
    }

    /**
     * Sets the value of the routeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDescription(String value) {
        this.routeDescription = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setCurrentLocation(Location value) {
        this.currentLocation = value;
    }

}
