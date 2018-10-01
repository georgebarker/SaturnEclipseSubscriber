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
 * Details of a Uniform Resource Locator (URL) address pointing to a resource available on the Internet from where further relevant information may be obtained.
 * 
 * <p>Java class for UrlLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2/2_0}Url"/>
 *         &lt;element name="urlLinkDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="urlLinkType" type="{http://datex2.eu/schema/2/2_0}UrlLinkTypeEnum" minOccurs="0"/>
 *         &lt;element name="urlLinkExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlLink", propOrder = {
    "urlLinkAddress",
    "urlLinkDescription",
    "urlLinkType",
    "urlLinkExtension"
})
public class UrlLink {

    @XmlElement(required = true)
    protected String urlLinkAddress;
    protected MultilingualString urlLinkDescription;
    protected UrlLinkTypeEnum urlLinkType;
    protected ExtensionType urlLinkExtension;

    /**
     * Gets the value of the urlLinkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Sets the value of the urlLinkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    /**
     * Gets the value of the urlLinkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getUrlLinkDescription() {
        return urlLinkDescription;
    }

    /**
     * Sets the value of the urlLinkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setUrlLinkDescription(MultilingualString value) {
        this.urlLinkDescription = value;
    }

    /**
     * Gets the value of the urlLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public UrlLinkTypeEnum getUrlLinkType() {
        return urlLinkType;
    }

    /**
     * Sets the value of the urlLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public void setUrlLinkType(UrlLinkTypeEnum value) {
        this.urlLinkType = value;
    }

    /**
     * Gets the value of the urlLinkExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getUrlLinkExtension() {
        return urlLinkExtension;
    }

    /**
     * Sets the value of the urlLinkExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setUrlLinkExtension(ExtensionType value) {
        this.urlLinkExtension = value;
    }

}
