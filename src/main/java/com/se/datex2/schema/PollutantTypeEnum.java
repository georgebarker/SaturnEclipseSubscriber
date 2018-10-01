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
 * <p>Java class for PollutantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PollutantTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="benzeneTolueneXylene"/>
 *     &lt;enumeration value="carbonMonoxide"/>
 *     &lt;enumeration value="lead"/>
 *     &lt;enumeration value="methane"/>
 *     &lt;enumeration value="nitricOxide"/>
 *     &lt;enumeration value="nitrogenDioxide"/>
 *     &lt;enumeration value="nitrogenMonoxide"/>
 *     &lt;enumeration value="nitrogenOxides"/>
 *     &lt;enumeration value="nonMethaneHydrocarbons"/>
 *     &lt;enumeration value="ozone"/>
 *     &lt;enumeration value="particulates10"/>
 *     &lt;enumeration value="polycyclicAromaticHydrocarbons"/>
 *     &lt;enumeration value="primaryParticulate"/>
 *     &lt;enumeration value="sulphurDioxide"/>
 *     &lt;enumeration value="totalHydrocarbons"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PollutantTypeEnum")
@XmlEnum
public enum PollutantTypeEnum {


    /**
     * Benzene, toluene or xylene.
     * 
     */
    @XmlEnumValue("benzeneTolueneXylene")
    BENZENE_TOLUENE_XYLENE("benzeneTolueneXylene"),

    /**
     * Carbon monoxide.
     * 
     */
    @XmlEnumValue("carbonMonoxide")
    CARBON_MONOXIDE("carbonMonoxide"),

    /**
     * Lead.
     * 
     */
    @XmlEnumValue("lead")
    LEAD("lead"),

    /**
     * Methane.
     * 
     */
    @XmlEnumValue("methane")
    METHANE("methane"),

    /**
     * Nitric oxide.
     * 
     */
    @XmlEnumValue("nitricOxide")
    NITRIC_OXIDE("nitricOxide"),

    /**
     * Nitrogen dioxide.
     * 
     */
    @XmlEnumValue("nitrogenDioxide")
    NITROGEN_DIOXIDE("nitrogenDioxide"),

    /**
     * Nitrogen monoxide.
     * 
     */
    @XmlEnumValue("nitrogenMonoxide")
    NITROGEN_MONOXIDE("nitrogenMonoxide"),

    /**
     * Nitrogen oxides.
     * 
     */
    @XmlEnumValue("nitrogenOxides")
    NITROGEN_OXIDES("nitrogenOxides"),

    /**
     * Non-methane hydrocarbons.
     * 
     */
    @XmlEnumValue("nonMethaneHydrocarbons")
    NON_METHANE_HYDROCARBONS("nonMethaneHydrocarbons"),

    /**
     * Ozone.
     * 
     */
    @XmlEnumValue("ozone")
    OZONE("ozone"),

    /**
     * Particulate matter which passes through a size-selective inlet with a 50% cut-off efficiency at an aerodynamic diameter of 10 micrometres.
     * 
     */
    @XmlEnumValue("particulates10")
    PARTICULATES_10("particulates10"),

    /**
     * Polycyclic aromatic hydrocarbons.
     * 
     */
    @XmlEnumValue("polycyclicAromaticHydrocarbons")
    POLYCYCLIC_AROMATIC_HYDROCARBONS("polycyclicAromaticHydrocarbons"),

    /**
     * Primary particulate particles.
     * 
     */
    @XmlEnumValue("primaryParticulate")
    PRIMARY_PARTICULATE("primaryParticulate"),

    /**
     * Sulphur dioxide.
     * 
     */
    @XmlEnumValue("sulphurDioxide")
    SULPHUR_DIOXIDE("sulphurDioxide"),

    /**
     * Total hydrocarbons, i.e. including methane and non-methane.
     * 
     */
    @XmlEnumValue("totalHydrocarbons")
    TOTAL_HYDROCARBONS("totalHydrocarbons");
    private final String value;

    PollutantTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollutantTypeEnum fromValue(String v) {
        for (PollutantTypeEnum c: PollutantTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
