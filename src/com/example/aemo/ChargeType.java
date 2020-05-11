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
 * &lt;p&gt;Java class for ChargeType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ChargeType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NUOS Charge"/&amp;gt;
 *     &amp;lt;enumeration value="Event Based Charge"/&amp;gt;
 *     &amp;lt;enumeration value="GSL Credit Charge"/&amp;gt;
 *     &amp;lt;enumeration value="Excluded Service Charge"/&amp;gt;
 *     &amp;lt;enumeration value="Interest Charge"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ChargeType")
@XmlEnum
public enum ChargeType {

    @XmlEnumValue("NUOS Charge")
    NUOS_CHARGE("NUOS Charge"),
    @XmlEnumValue("Event Based Charge")
    EVENT_BASED_CHARGE("Event Based Charge"),
    @XmlEnumValue("GSL Credit Charge")
    GSL_CREDIT_CHARGE("GSL Credit Charge"),
    @XmlEnumValue("Excluded Service Charge")
    EXCLUDED_SERVICE_CHARGE("Excluded Service Charge"),
    @XmlEnumValue("Interest Charge")
    INTEREST_CHARGE("Interest Charge");
    private final String value;

    ChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeType fromValue(String v) {
        for (ChargeType c: ChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
