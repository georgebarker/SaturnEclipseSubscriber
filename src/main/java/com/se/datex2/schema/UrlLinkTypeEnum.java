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
 * <p>Java class for UrlLinkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UrlLinkTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="documentPdf"/>
 *     &lt;enumeration value="html"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="rss"/>
 *     &lt;enumeration value="videoStream"/>
 *     &lt;enumeration value="voiceStream"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrlLinkTypeEnum")
@XmlEnum
public enum UrlLinkTypeEnum {


    /**
     * URL link to a pdf document.
     * 
     */
    @XmlEnumValue("documentPdf")
    DOCUMENT_PDF("documentPdf"),

    /**
     * URL link to an html page.
     * 
     */
    @XmlEnumValue("html")
    HTML("html"),

    /**
     * URL link to an image.
     * 
     */
    @XmlEnumValue("image")
    IMAGE("image"),

    /**
     * URL link to an RSS feed.
     * 
     */
    @XmlEnumValue("rss")
    RSS("rss"),

    /**
     * URL link to a video stream.
     * 
     */
    @XmlEnumValue("videoStream")
    VIDEO_STREAM("videoStream"),

    /**
     * URL link to a voice stream.
     * 
     */
    @XmlEnumValue("voiceStream")
    VOICE_STREAM("voiceStream"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UrlLinkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrlLinkTypeEnum fromValue(String v) {
        for (UrlLinkTypeEnum c: UrlLinkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
