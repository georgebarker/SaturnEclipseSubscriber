//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsUnitRecordVmsIndexVmsRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsUnitRecordVmsIndexVmsRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsRecord" type="{http://datex2.eu/schema/2/2_0}VmsRecord"/>
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
@XmlType(name = "_VmsUnitRecordVmsIndexVmsRecord", propOrder = {
    "vmsRecord"
})
public class VmsUnitRecordVmsIndexVmsRecord {

    @XmlElement(required = true)
    protected VmsRecord vmsRecord;
    @XmlAttribute(name = "vmsIndex", required = true)
    protected int vmsIndex;

    /**
     * Gets the value of the vmsRecord property.
     * 
     * @return
     *     possible object is
     *     {@link VmsRecord }
     *     
     */
    public VmsRecord getVmsRecord() {
        return vmsRecord;
    }

    /**
     * Sets the value of the vmsRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsRecord }
     *     
     */
    public void setVmsRecord(VmsRecord value) {
        this.vmsRecord = value;
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
