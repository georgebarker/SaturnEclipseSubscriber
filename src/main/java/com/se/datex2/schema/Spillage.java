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
 * Spillage information.
 * 
 * <p>Java class for Spillage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spillage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spillageContents" type="{http://datex2.eu/schema/2/2_0}SpillageContentsEnum"/>
 *         &lt;element name="spillageSeverity" type="{http://datex2.eu/schema/2/2_0}SeverityEnum"/>
 *         &lt;element name="spillageExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spillage", propOrder = {
    "spillageContents",
    "spillageSeverity",
    "spillageExtension"
})
public class Spillage {

    @XmlElement(required = true)
    protected SpillageContentsEnum spillageContents;
    @XmlElement(required = true)
    protected SeverityEnum spillageSeverity;
    protected ExtensionType spillageExtension;

    /**
     * Gets the value of the spillageContents property.
     * 
     * @return
     *     possible object is
     *     {@link SpillageContentsEnum }
     *     
     */
    public SpillageContentsEnum getSpillageContents() {
        return spillageContents;
    }

    /**
     * Sets the value of the spillageContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpillageContentsEnum }
     *     
     */
    public void setSpillageContents(SpillageContentsEnum value) {
        this.spillageContents = value;
    }

    /**
     * Gets the value of the spillageSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnum }
     *     
     */
    public SeverityEnum getSpillageSeverity() {
        return spillageSeverity;
    }

    /**
     * Sets the value of the spillageSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnum }
     *     
     */
    public void setSpillageSeverity(SeverityEnum value) {
        this.spillageSeverity = value;
    }

    /**
     * Gets the value of the spillageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpillageExtension() {
        return spillageExtension;
    }

    /**
     * Sets the value of the spillageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpillageExtension(ExtensionType value) {
        this.spillageExtension = value;
    }

}
