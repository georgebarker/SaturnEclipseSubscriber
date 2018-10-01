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
 * Details of percentage (from an observation set) of vehicles whose speeds fall below a stated value.
 * 
 * <p>Java class for SpeedPercentile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedPercentile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiclePercentage" type="{http://datex2.eu/schema/2/2_0}PercentageValue"/>
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2/2_0}SpeedValue"/>
 *         &lt;element name="speedPercentileExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "speedPercentileExtension"
})
public class SpeedPercentile {

    @XmlElement(required = true)
    protected PercentageValue vehiclePercentage;
    @XmlElement(required = true)
    protected SpeedValue speedPercentile;
    protected ExtensionType speedPercentileExtension;

    /**
     * Gets the value of the vehiclePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getVehiclePercentage() {
        return vehiclePercentage;
    }

    /**
     * Sets the value of the vehiclePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setVehiclePercentage(PercentageValue value) {
        this.vehiclePercentage = value;
    }

    /**
     * Gets the value of the speedPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Sets the value of the speedPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setSpeedPercentile(SpeedValue value) {
        this.speedPercentile = value;
    }

    /**
     * Gets the value of the speedPercentileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Sets the value of the speedPercentileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

}
