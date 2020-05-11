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
 * &lt;p&gt;Java class for SupplyPointCode.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SupplyPointCode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Basic"/&amp;gt;
 *     &amp;lt;enumeration value="Interval"/&amp;gt;
 *     &amp;lt;enumeration value="Transmission"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SupplyPointCode")
@XmlEnum
public enum SupplyPointCode {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Interval")
    INTERVAL("Interval"),
    @XmlEnumValue("Transmission")
    TRANSMISSION("Transmission");
    private final String value;

    SupplyPointCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplyPointCode fromValue(String v) {
        for (SupplyPointCode c: SupplyPointCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
