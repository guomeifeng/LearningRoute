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
 * &lt;p&gt;Java class for r5.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="r5"&amp;gt;
 *   &amp;lt;restriction base="{urn:aseXML:r38}ReleaseIdentifier"&amp;gt;
 *     &amp;lt;enumeration value="r5"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "r5")
@XmlEnum
public enum R5 {

    @XmlEnumValue("r5")
    R_5("r5");
    private final String value;

    R5(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static R5 fromValue(String v) {
        for (R5 c: R5 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
