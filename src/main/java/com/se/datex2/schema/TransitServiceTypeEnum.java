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
 * <p>Java class for TransitServiceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransitServiceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="air"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="ferry"/>
 *     &lt;enumeration value="hydrofoil"/>
 *     &lt;enumeration value="rail"/>
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="undergroundMetro"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransitServiceTypeEnum")
@XmlEnum
public enum TransitServiceTypeEnum {


    /**
     * Air service.
     * 
     */
    @XmlEnumValue("air")
    AIR("air"),

    /**
     * Bus service.
     * 
     */
    @XmlEnumValue("bus")
    BUS("bus"),

    /**
     * Ferry service.
     * 
     */
    @XmlEnumValue("ferry")
    FERRY("ferry"),

    /**
     * Hydrofoil service.
     * 
     */
    @XmlEnumValue("hydrofoil")
    HYDROFOIL("hydrofoil"),

    /**
     * Rail service.
     * 
     */
    @XmlEnumValue("rail")
    RAIL("rail"),

    /**
     * Tram service.
     * 
     */
    @XmlEnumValue("tram")
    TRAM("tram"),

    /**
     * Underground or metro service.
     * 
     */
    @XmlEnumValue("undergroundMetro")
    UNDERGROUND_METRO("undergroundMetro");
    private final String value;

    TransitServiceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitServiceTypeEnum fromValue(String v) {
        for (TransitServiceTypeEnum c: TransitServiceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
