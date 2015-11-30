//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Measured or derived values relating to traffic or individual vehicle movements on a specific section or at a specific point on the road network.
 * 
 * <p>Java class for TrafficData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData">
 *       &lt;sequence>
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="trafficDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficData", propOrder = {
    "forVehiclesWithCharacteristicsOf",
    "trafficDataExtension"
})
@XmlSeeAlso({
    TrafficHeadway.class,
    IndividualVehicleDataValues.class,
    TrafficSpeed.class,
    TrafficFlow.class,
    TrafficConcentration.class
})
public abstract class TrafficData
    extends BasicData
{

    protected VehicleCharacteristics forVehiclesWithCharacteristicsOf;
    protected ExtensionType trafficDataExtension;

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getForVehiclesWithCharacteristicsOf() {
        return forVehiclesWithCharacteristicsOf;
    }

    /**
     * Sets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        this.forVehiclesWithCharacteristicsOf = value;
    }

    /**
     * Gets the value of the trafficDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficDataExtension() {
        return trafficDataExtension;
    }

    /**
     * Sets the value of the trafficDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficDataExtension(ExtensionType value) {
        this.trafficDataExtension = value;
    }

}
