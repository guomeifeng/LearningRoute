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
 * &lt;p&gt;Java class for NOSInfoType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="NOSInfoType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Booking Response"/&amp;gt;
 *     &amp;lt;enumeration value="Equipment Response"/&amp;gt;
 *     &amp;lt;enumeration value="Notification"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "NOSInfoType")
@XmlEnum
public enum NOSInfoType {

    @XmlEnumValue("Booking Response")
    BOOKING_RESPONSE("Booking Response"),
    @XmlEnumValue("Equipment Response")
    EQUIPMENT_RESPONSE("Equipment Response"),
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final String value;

    NOSInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NOSInfoType fromValue(String v) {
        for (NOSInfoType c: NOSInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
