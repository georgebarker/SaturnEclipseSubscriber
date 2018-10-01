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
 * <p>Java class for FaultSeverityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultSeverityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultSeverityEnum")
@XmlEnum
public enum FaultSeverityEnum {


    /**
     * The fault is of low severity and has only limited impact on the usability of the equipment or the value of the data generated by the equipment.
     * 
     */
    @XmlEnumValue("low")
    LOW("low"),

    /**
     * The fault is of medium severity which will significantly limit the usability of the equipment or devalue the usefulness of the data generated by the equipment.
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * The fault is of high severity which will render the equipment unusable or any data generated by the equipment to be of no value.
     * 
     */
    @XmlEnumValue("high")
    HIGH("high"),

    /**
     * The fault is of unknown severity and hence its effect on the usability of the equipment or the usefulness of the data generated by the equipment can not be assessed.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    FaultSeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultSeverityEnum fromValue(String v) {
        for (FaultSeverityEnum c: FaultSeverityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
