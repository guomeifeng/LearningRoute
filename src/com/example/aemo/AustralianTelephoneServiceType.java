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
 * &lt;p&gt;Java class for AustralianTelephoneServiceType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AustralianTelephoneServiceType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Fixed Voice"/&amp;gt;
 *     &amp;lt;enumeration value="Mobile Voice"/&amp;gt;
 *     &amp;lt;enumeration value="Fax"/&amp;gt;
 *     &amp;lt;enumeration value="Modem"/&amp;gt;
 *     &amp;lt;enumeration value="Pager"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AustralianTelephoneServiceType")
@XmlEnum
public enum AustralianTelephoneServiceType {

    @XmlEnumValue("Fixed Voice")
    FIXED_VOICE("Fixed Voice"),
    @XmlEnumValue("Mobile Voice")
    MOBILE_VOICE("Mobile Voice"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Modem")
    MODEM("Modem"),
    @XmlEnumValue("Pager")
    PAGER("Pager");
    private final String value;

    AustralianTelephoneServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AustralianTelephoneServiceType fromValue(String v) {
        for (AustralianTelephoneServiceType c: AustralianTelephoneServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
