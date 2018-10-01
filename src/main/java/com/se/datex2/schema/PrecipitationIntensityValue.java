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
 * A measured or calculated value of the accumulation rate of precipitation.
 * 
 * <p>Java class for PrecipitationIntensityValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationIntensityValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="millimetresPerHourIntensity" type="{http://datex2.eu/schema/2/2_0}IntensityMillimetresPerHour"/>
 *         &lt;element name="precipitationIntensityValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationIntensityValue", propOrder = {
    "millimetresPerHourIntensity",
    "precipitationIntensityValueExtension"
})
public class PrecipitationIntensityValue
    extends DataValue
{

    protected float millimetresPerHourIntensity;
    protected ExtensionType precipitationIntensityValueExtension;

    /**
     * Gets the value of the millimetresPerHourIntensity property.
     * 
     */
    public float getMillimetresPerHourIntensity() {
        return millimetresPerHourIntensity;
    }

    /**
     * Sets the value of the millimetresPerHourIntensity property.
     * 
     */
    public void setMillimetresPerHourIntensity(float value) {
        this.millimetresPerHourIntensity = value;
    }

    /**
     * Gets the value of the precipitationIntensityValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationIntensityValueExtension() {
        return precipitationIntensityValueExtension;
    }

    /**
     * Sets the value of the precipitationIntensityValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationIntensityValueExtension(ExtensionType value) {
        this.precipitationIntensityValueExtension = value;
    }

}
