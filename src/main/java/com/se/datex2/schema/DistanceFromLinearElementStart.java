//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Distance of a point along a linear element measured from the start node of the linear element, where start node is relative to the element definition rather than the direction of traffic flow.
 * 
 * <p>Java class for DistanceFromLinearElementStart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceFromLinearElementStart">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement">
 *       &lt;sequence>
 *         &lt;element name="distanceAlong" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/>
 *         &lt;element name="distanceFromLinearElementStartExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceFromLinearElementStart", propOrder = {
    "distanceAlong",
    "distanceFromLinearElementStartExtension"
})
public class DistanceFromLinearElementStart
    extends DistanceAlongLinearElement
{

    protected float distanceAlong;
    protected ExtensionType distanceFromLinearElementStartExtension;

    /**
     * Gets the value of the distanceAlong property.
     * 
     */
    public float getDistanceAlong() {
        return distanceAlong;
    }

    /**
     * Sets the value of the distanceAlong property.
     * 
     */
    public void setDistanceAlong(float value) {
        this.distanceAlong = value;
    }

    /**
     * Gets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceFromLinearElementStartExtension() {
        return distanceFromLinearElementStartExtension;
    }

    /**
     * Sets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceFromLinearElementStartExtension(ExtensionType value) {
        this.distanceFromLinearElementStartExtension = value;
    }

}
