//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GasSubmissionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="GasSubmissionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Current Day"/&amp;gt;
 *     &amp;lt;enumeration value="Day Plus One"/&amp;gt;
 *     &amp;lt;enumeration value="Day Plus Two"/&amp;gt;
 *     &amp;lt;enumeration value="Standing"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "GasSubmissionType")
@XmlEnum
public enum GasSubmissionType {

    @XmlEnumValue("Current Day")
    CURRENT_DAY("Current Day"),
    @XmlEnumValue("Day Plus One")
    DAY_PLUS_ONE("Day Plus One"),
    @XmlEnumValue("Day Plus Two")
    DAY_PLUS_TWO("Day Plus Two"),
    @XmlEnumValue("Standing")
    STANDING("Standing");
    private final String value;

    GasSubmissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GasSubmissionType fromValue(String v) {
        for (GasSubmissionType c: GasSubmissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
