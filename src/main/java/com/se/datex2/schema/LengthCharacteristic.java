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
 * Length characteristic of a vehicle.
 * 
 * <p>Java class for LengthCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="vehicleLength" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/>
 *         &lt;element name="lengthCharacteristicExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleLength",
    "lengthCharacteristicExtension"
})
public class LengthCharacteristic {

    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float vehicleLength;
    protected ExtensionType lengthCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the vehicleLength property.
     * 
     */
    public float getVehicleLength() {
        return vehicleLength;
    }

    /**
     * Sets the value of the vehicleLength property.
     * 
     */
    public void setVehicleLength(float value) {
        this.vehicleLength = value;
    }

    /**
     * Gets the value of the lengthCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLengthCharacteristicExtension() {
        return lengthCharacteristicExtension;
    }

    /**
     * Sets the value of the lengthCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLengthCharacteristicExtension(ExtensionType value) {
        this.lengthCharacteristicExtension = value;
    }

}
