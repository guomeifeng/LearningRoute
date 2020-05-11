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
 * &lt;p&gt;Java class for MeterReadingGroupType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="MeterReadingGroupType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NMI"/&amp;gt;
 *     &amp;lt;enumeration value="Site"/&amp;gt;
 *     &amp;lt;enumeration value="Route"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "MeterReadingGroupType")
@XmlEnum
public enum MeterReadingGroupType {

    NMI("NMI"),
    @XmlEnumValue("Site")
    SITE("Site"),
    @XmlEnumValue("Route")
    ROUTE("Route");
    private final String value;

    MeterReadingGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeterReadingGroupType fromValue(String v) {
        for (MeterReadingGroupType c: MeterReadingGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
