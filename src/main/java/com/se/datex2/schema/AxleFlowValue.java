//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of the flow rate of vehicle axles.
 * 
 * <p>Java class for AxleFlowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleFlowValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="axleFlowRate" type="{http://datex2.eu/schema/2/2_0}AxlesPerHour"/>
 *         &lt;element name="axleFlowValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleFlowValue", propOrder = {
    "axleFlowRate",
    "axleFlowValueExtension"
})
public class AxleFlowValue
    extends DataValue
{

    @XmlElement(required = true)
    protected BigInteger axleFlowRate;
    protected ExtensionType axleFlowValueExtension;

    /**
     * Gets the value of the axleFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleFlowRate() {
        return axleFlowRate;
    }

    /**
     * Sets the value of the axleFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleFlowRate(BigInteger value) {
        this.axleFlowRate = value;
    }

    /**
     * Gets the value of the axleFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleFlowValueExtension() {
        return axleFlowValueExtension;
    }

    /**
     * Sets the value of the axleFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleFlowValueExtension(ExtensionType value) {
        this.axleFlowValueExtension = value;
    }

}
