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
 * <p>Java class for TpegLoc01LinearLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01LinearLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="segment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01LinearLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01LinearLocationSubtypeEnum {


    /**
     * A segment (or link) of the road network corresponding to the way in which the road operator has segmented the network.
     * 
     */
    @XmlEnumValue("segment")
    SEGMENT("segment");
    private final String value;

    TpegLoc01LinearLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01LinearLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01LinearLocationSubtypeEnum c: TpegLoc01LinearLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
