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
 * A descriptor for describing an area location.
 * 
 * <p>Java class for TpegAreaDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03AreaDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", propOrder = {
    "tpegAreaDescriptorType",
    "tpegAreaDescriptorExtension"
})
public class TpegAreaDescriptor
    extends TpegDescriptor
{

    @XmlElement(required = true)
    protected TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    protected ExtensionType tpegAreaDescriptorExtension;

    /**
     * Gets the value of the tpegAreaDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Sets the value of the tpegAreaDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    /**
     * Gets the value of the tpegAreaDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaDescriptorExtension() {
        return tpegAreaDescriptorExtension;
    }

    /**
     * Sets the value of the tpegAreaDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaDescriptorExtension(ExtensionType value) {
        this.tpegAreaDescriptorExtension = value;
    }

}
