//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsUnitVmsIndexVms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsUnitVmsIndexVms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vms" type="{http://datex2.eu/schema/2/2_0}Vms"/>
 *       &lt;/sequence>
 *       &lt;attribute name="vmsIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsUnitVmsIndexVms", propOrder = {
    "vms"
})
public class VmsUnitVmsIndexVms {

    @XmlElement(required = true)
    protected Vms vms;
    @XmlAttribute(name = "vmsIndex", required = true)
    protected int vmsIndex;

    /**
     * Gets the value of the vms property.
     * 
     * @return
     *     possible object is
     *     {@link Vms }
     *     
     */
    public Vms getVms() {
        return vms;
    }

    /**
     * Sets the value of the vms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vms }
     *     
     */
    public void setVms(Vms value) {
        this.vms = value;
    }

    /**
     * Gets the value of the vmsIndex property.
     * 
     */
    public int getVmsIndex() {
        return vmsIndex;
    }

    /**
     * Sets the value of the vmsIndex property.
     * 
     */
    public void setVmsIndex(int value) {
        this.vmsIndex = value;
    }

}
