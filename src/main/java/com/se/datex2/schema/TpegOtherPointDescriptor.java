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
 * General descriptor for describing a point.
 * 
 * <p>Java class for TpegOtherPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegOtherPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegOtherPointDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03OtherPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegOtherPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegOtherPointDescriptor", propOrder = {
    "tpegOtherPointDescriptorType",
    "tpegOtherPointDescriptorExtension"
})
public class TpegOtherPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    protected TpegLoc03OtherPointDescriptorSubtypeEnum tpegOtherPointDescriptorType;
    protected ExtensionType tpegOtherPointDescriptorExtension;

    /**
     * Gets the value of the tpegOtherPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03OtherPointDescriptorSubtypeEnum getTpegOtherPointDescriptorType() {
        return tpegOtherPointDescriptorType;
    }

    /**
     * Sets the value of the tpegOtherPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegOtherPointDescriptorType = value;
    }

    /**
     * Gets the value of the tpegOtherPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegOtherPointDescriptorExtension() {
        return tpegOtherPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegOtherPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegOtherPointDescriptorExtension(ExtensionType value) {
        this.tpegOtherPointDescriptorExtension = value;
    }

}
