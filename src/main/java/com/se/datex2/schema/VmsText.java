//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A page of text (comprising one or more ordered lines) that are displayed simultaneously on the VMS. Where more than one page is defined these are sequentially displayed according to their "pageNumber".
 * 
 * <p>Java class for VmsText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsLegendCode" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="vmsTextImageUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/>
 *         &lt;element name="vmsTextLine" type="{http://datex2.eu/schema/2/2_0}_VmsTextLineIndexVmsTextLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsTextExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsText", propOrder = {
    "vmsLegendCode",
    "vmsTextImageUrl",
    "vmsTextLine",
    "vmsTextExtension"
})
public class VmsText {

    protected String vmsLegendCode;
    protected String vmsTextImageUrl;
    protected List<VmsTextLineIndexVmsTextLine> vmsTextLine;
    protected ExtensionType vmsTextExtension;

    /**
     * Gets the value of the vmsLegendCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsLegendCode() {
        return vmsLegendCode;
    }

    /**
     * Sets the value of the vmsLegendCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsLegendCode(String value) {
        this.vmsLegendCode = value;
    }

    /**
     * Gets the value of the vmsTextImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsTextImageUrl() {
        return vmsTextImageUrl;
    }

    /**
     * Sets the value of the vmsTextImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsTextImageUrl(String value) {
        this.vmsTextImageUrl = value;
    }

    /**
     * Gets the value of the vmsTextLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsTextLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsTextLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsTextLineIndexVmsTextLine }
     * 
     * 
     */
    public List<VmsTextLineIndexVmsTextLine> getVmsTextLine() {
        if (vmsTextLine == null) {
            vmsTextLine = new ArrayList<VmsTextLineIndexVmsTextLine>();
        }
        return this.vmsTextLine;
    }

    /**
     * Gets the value of the vmsTextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsTextExtension() {
        return vmsTextExtension;
    }

    /**
     * Sets the value of the vmsTextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsTextExtension(ExtensionType value) {
        this.vmsTextExtension = value;
    }

}
