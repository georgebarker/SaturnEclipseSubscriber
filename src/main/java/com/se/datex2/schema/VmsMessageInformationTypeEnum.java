//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.01 at 09:59:58 PM BST 
//


package com.se.datex2.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsMessageInformationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsMessageInformationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="campaignMessage"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="futureInformation"/>
 *     &lt;enumeration value="instructionOrMessage"/>
 *     &lt;enumeration value="situationWarning"/>
 *     &lt;enumeration value="temperature"/>
 *     &lt;enumeration value="trafficManagement"/>
 *     &lt;enumeration value="travelTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsMessageInformationTypeEnum")
@XmlEnum
public enum VmsMessageInformationTypeEnum {


    /**
     * Campaign type information which is non time specific that may request certain actions (e.g. "do not drink and drive") or which is intended to influence drivers' behaviour.
     * 
     */
    @XmlEnumValue("campaignMessage")
    CAMPAIGN_MESSAGE("campaignMessage"),

    /**
     * Current date and/or time information.
     * 
     */
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),

    /**
     * Information which may inform road users about future situations which potentially may cause congestion or influence future travel plans (e.g. future roadworks, closures, sporting events, public concerts, suspension of train or ferry services).
     * 
     */
    @XmlEnumValue("futureInformation")
    FUTURE_INFORMATION("futureInformation"),

    /**
     * Instructions or messages to road users which are relevant at the current time, (e.g. "do not throw out any burning objects" or an Amber alert message).
     * 
     */
    @XmlEnumValue("instructionOrMessage")
    INSTRUCTION_OR_MESSAGE("instructionOrMessage"),

    /**
     * Information warning of a current situation likely to affect traffic on the road ahead.
     * 
     */
    @XmlEnumValue("situationWarning")
    SITUATION_WARNING("situationWarning"),

    /**
     * Temperature information.
     * 
     */
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),

    /**
     * Information comprising traffic management instructions.
     * 
     */
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),

    /**
     * Travel time information.
     * 
     */
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime");
    private final String value;

    VmsMessageInformationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsMessageInformationTypeEnum fromValue(String v) {
        for (VmsMessageInformationTypeEnum c: VmsMessageInformationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
