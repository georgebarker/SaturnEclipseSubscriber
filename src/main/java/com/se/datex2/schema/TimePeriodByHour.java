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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Specification of a continuous period within a 24 hour period by times.
 * 
 * <p>Java class for TimePeriodByHour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodByHour">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TimePeriodOfDay">
 *       &lt;sequence>
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/2/2_0}Time"/>
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/2/2_0}Time"/>
 *         &lt;element name="timePeriodByHourExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodByHour", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "timePeriodByHourExtension"
})
public class TimePeriodByHour
    extends TimePeriodOfDay
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar startTimeOfPeriod;
    @XmlElement(required = true)
    protected XMLGregorianCalendar endTimeOfPeriod;
    protected ExtensionType timePeriodByHourExtension;

    /**
     * Gets the value of the startTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Sets the value of the startTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeOfPeriod(XMLGregorianCalendar value) {
        this.startTimeOfPeriod = value;
    }

    /**
     * Gets the value of the endTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Sets the value of the endTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeOfPeriod(XMLGregorianCalendar value) {
        this.endTimeOfPeriod = value;
    }

    /**
     * Gets the value of the timePeriodByHourExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodByHourExtension() {
        return timePeriodByHourExtension;
    }

    /**
     * Sets the value of the timePeriodByHourExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodByHourExtension(ExtensionType value) {
        this.timePeriodByHourExtension = value;
    }

}
