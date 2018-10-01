//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Distance of a point along a linear element measured from the start node expressed as a percentage of the whole length of the linear element, where start node is relative to the element definition rather than the direction of traffic flow.
 * 
 * <p>Java class for PercentageDistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageDistanceAlongLinearElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement">
 *       &lt;sequence>
 *         &lt;element name="percentageDistanceAlong" type="{http://datex2.eu/schema/2/2_0}Percentage"/>
 *         &lt;element name="percentageDistanceAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageDistanceAlongLinearElement", propOrder = {
    "percentageDistanceAlong",
    "percentageDistanceAlongLinearElementExtension"
})
public class PercentageDistanceAlongLinearElement
    extends DistanceAlongLinearElement
{

    protected float percentageDistanceAlong;
    protected ExtensionType percentageDistanceAlongLinearElementExtension;

    /**
     * Gets the value of the percentageDistanceAlong property.
     * 
     */
    public float getPercentageDistanceAlong() {
        return percentageDistanceAlong;
    }

    /**
     * Sets the value of the percentageDistanceAlong property.
     * 
     */
    public void setPercentageDistanceAlong(float value) {
        this.percentageDistanceAlong = value;
    }

    /**
     * Gets the value of the percentageDistanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPercentageDistanceAlongLinearElementExtension() {
        return percentageDistanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the percentageDistanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPercentageDistanceAlongLinearElementExtension(ExtensionType value) {
        this.percentageDistanceAlongLinearElementExtension = value;
    }

}
