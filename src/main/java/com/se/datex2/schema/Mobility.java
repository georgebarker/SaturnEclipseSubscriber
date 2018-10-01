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
 * An indication of whether the associated instance of a SituationRecord is mobile (e.g. a march or parade moving along a road) or stationary.
 * 
 * <p>Java class for Mobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mobility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobilityType" type="{http://datex2.eu/schema/2/2_0}MobilityEnum"/>
 *         &lt;element name="mobilityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mobility", propOrder = {
    "mobilityType",
    "mobilityExtension"
})
public class Mobility {

    @XmlElement(required = true)
    protected MobilityEnum mobilityType;
    protected ExtensionType mobilityExtension;

    /**
     * Gets the value of the mobilityType property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnum }
     *     
     */
    public MobilityEnum getMobilityType() {
        return mobilityType;
    }

    /**
     * Sets the value of the mobilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnum }
     *     
     */
    public void setMobilityType(MobilityEnum value) {
        this.mobilityType = value;
    }

    /**
     * Gets the value of the mobilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMobilityExtension() {
        return mobilityExtension;
    }

    /**
     * Sets the value of the mobilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMobilityExtension(ExtensionType value) {
        this.mobilityExtension = value;
    }

}
