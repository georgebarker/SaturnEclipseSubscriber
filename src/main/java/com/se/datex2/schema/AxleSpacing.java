//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The spacing details between the axle sets of an individual vehicle numbered from the front to the back of the vehicle. 
 * 
 * <p>Java class for AxleSpacing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleSpacing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axleSpacing" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/>
 *         &lt;element name="axleSpacingSequenceIdentifier" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="axleSpacingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleSpacing", propOrder = {
    "axleSpacing",
    "axleSpacingSequenceIdentifier",
    "axleSpacingExtension"
})
public class AxleSpacing {

    protected float axleSpacing;
    @XmlElement(required = true)
    protected BigInteger axleSpacingSequenceIdentifier;
    protected ExtensionType axleSpacingExtension;

    /**
     * Gets the value of the axleSpacing property.
     * 
     */
    public float getAxleSpacing() {
        return axleSpacing;
    }

    /**
     * Sets the value of the axleSpacing property.
     * 
     */
    public void setAxleSpacing(float value) {
        this.axleSpacing = value;
    }

    /**
     * Gets the value of the axleSpacingSequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleSpacingSequenceIdentifier() {
        return axleSpacingSequenceIdentifier;
    }

    /**
     * Sets the value of the axleSpacingSequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleSpacingSequenceIdentifier(BigInteger value) {
        this.axleSpacingSequenceIdentifier = value;
    }

    /**
     * Gets the value of the axleSpacingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleSpacingExtension() {
        return axleSpacingExtension;
    }

    /**
     * Sets the value of the axleSpacingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleSpacingExtension(ExtensionType value) {
        this.axleSpacingExtension = value;
    }

}
