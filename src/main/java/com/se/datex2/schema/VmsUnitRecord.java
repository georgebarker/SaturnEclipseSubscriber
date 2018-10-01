//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A versioned single VMS unit entry/record in the VMS Unit table that defines the characteristics of the VMS unit.
 * 
 * <p>Java class for VmsUnitRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsUnitRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfVms" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="vmsUnitIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="vmsUnitIPAddress" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="vmsUnitElectronicAddress" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="vmsRecord" type="{http://datex2.eu/schema/2/2_0}_VmsUnitRecordVmsIndexVmsRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsUnitRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsUnitRecord", propOrder = {
    "numberOfVms",
    "vmsUnitIdentifier",
    "vmsUnitIPAddress",
    "vmsUnitElectronicAddress",
    "vmsRecord",
    "vmsUnitRecordExtension"
})
public class VmsUnitRecord {

    protected BigInteger numberOfVms;
    protected String vmsUnitIdentifier;
    protected String vmsUnitIPAddress;
    protected String vmsUnitElectronicAddress;
    protected List<VmsUnitRecordVmsIndexVmsRecord> vmsRecord;
    protected ExtensionType vmsUnitRecordExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the numberOfVms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVms() {
        return numberOfVms;
    }

    /**
     * Sets the value of the numberOfVms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVms(BigInteger value) {
        this.numberOfVms = value;
    }

    /**
     * Gets the value of the vmsUnitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsUnitIdentifier() {
        return vmsUnitIdentifier;
    }

    /**
     * Sets the value of the vmsUnitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsUnitIdentifier(String value) {
        this.vmsUnitIdentifier = value;
    }

    /**
     * Gets the value of the vmsUnitIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsUnitIPAddress() {
        return vmsUnitIPAddress;
    }

    /**
     * Sets the value of the vmsUnitIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsUnitIPAddress(String value) {
        this.vmsUnitIPAddress = value;
    }

    /**
     * Gets the value of the vmsUnitElectronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsUnitElectronicAddress() {
        return vmsUnitElectronicAddress;
    }

    /**
     * Sets the value of the vmsUnitElectronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsUnitElectronicAddress(String value) {
        this.vmsUnitElectronicAddress = value;
    }

    /**
     * Gets the value of the vmsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsUnitRecordVmsIndexVmsRecord }
     * 
     * 
     */
    public List<VmsUnitRecordVmsIndexVmsRecord> getVmsRecord() {
        if (vmsRecord == null) {
            vmsRecord = new ArrayList<VmsUnitRecordVmsIndexVmsRecord>();
        }
        return this.vmsRecord;
    }

    /**
     * Gets the value of the vmsUnitRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsUnitRecordExtension() {
        return vmsUnitRecordExtension;
    }

    /**
     * Sets the value of the vmsUnitRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsUnitRecordExtension(ExtensionType value) {
        this.vmsUnitRecordExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
