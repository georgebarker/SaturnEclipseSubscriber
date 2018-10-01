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
 * Situation/event attendance information for a particular emergency service.
 * 
 * <p>Java class for EmergencyServiceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmergencyServiceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{http://datex2.eu/schema/2/2_0}EmergencyServiceTypeEnum"/>
 *         &lt;element name="serviceStatus" type="{http://datex2.eu/schema/2/2_0}EmergencyServiceStatusEnum"/>
 *         &lt;element name="emergencyServiceStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmergencyServiceStatus", propOrder = {
    "serviceType",
    "serviceStatus",
    "emergencyServiceStatusExtension"
})
public class EmergencyServiceStatus {

    @XmlElement(required = true)
    protected EmergencyServiceTypeEnum serviceType;
    @XmlElement(required = true)
    protected EmergencyServiceStatusEnum serviceStatus;
    protected ExtensionType emergencyServiceStatusExtension;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyServiceTypeEnum }
     *     
     */
    public EmergencyServiceTypeEnum getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyServiceTypeEnum }
     *     
     */
    public void setServiceType(EmergencyServiceTypeEnum value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyServiceStatusEnum }
     *     
     */
    public EmergencyServiceStatusEnum getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyServiceStatusEnum }
     *     
     */
    public void setServiceStatus(EmergencyServiceStatusEnum value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the emergencyServiceStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEmergencyServiceStatusExtension() {
        return emergencyServiceStatusExtension;
    }

    /**
     * Sets the value of the emergencyServiceStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEmergencyServiceStatusExtension(ExtensionType value) {
        this.emergencyServiceStatusExtension = value;
    }

}
