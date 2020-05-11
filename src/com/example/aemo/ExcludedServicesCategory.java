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
 * &lt;p&gt;Java class for ExcludedServicesCategory.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ExcludedServicesCategory"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;maxLength value="20"/&amp;gt;
 *     &amp;lt;enumeration value="Logger"/&amp;gt;
 *     &amp;lt;enumeration value="Mains"/&amp;gt;
 *     &amp;lt;enumeration value="Meter"/&amp;gt;
 *     &amp;lt;enumeration value="O+M"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *     &amp;lt;enumeration value="Service"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ExcludedServicesCategory")
@XmlEnum
public enum ExcludedServicesCategory {

    @XmlEnumValue("Logger")
    LOGGER("Logger"),
    @XmlEnumValue("Mains")
    MAINS("Mains"),
    @XmlEnumValue("Meter")
    METER("Meter"),
    @XmlEnumValue("O+M")
    O_M("O+M"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Service")
    SERVICE("Service");
    private final String value;

    ExcludedServicesCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExcludedServicesCategory fromValue(String v) {
        for (ExcludedServicesCategory c: ExcludedServicesCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
