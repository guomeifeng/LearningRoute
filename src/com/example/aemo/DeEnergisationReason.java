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
 * &lt;p&gt;Java class for De-energisationReason.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="De-energisationReason"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;maxLength value="40"/&amp;gt;
 *     &amp;lt;enumeration value="Customer Requested"/&amp;gt;
 *     &amp;lt;enumeration value="Move Out"/&amp;gt;
 *     &amp;lt;enumeration value="Non-Payment (DNP)"/&amp;gt;
 *     &amp;lt;enumeration value="Unauthorised Usage (DNI)"/&amp;gt;
 *     &amp;lt;enumeration value="Illegal Usage"/&amp;gt;
 *     &amp;lt;enumeration value="No Access"/&amp;gt;
 *     &amp;lt;enumeration value="Safety"/&amp;gt;
 *     &amp;lt;enumeration value="Defect"/&amp;gt;
 *     &amp;lt;enumeration value="Site Works"/&amp;gt;
 *     &amp;lt;enumeration value="Breach of Contract"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "De-energisationReason")
@XmlEnum
public enum DeEnergisationReason {

    @XmlEnumValue("Customer Requested")
    CUSTOMER_REQUESTED("Customer Requested"),
    @XmlEnumValue("Move Out")
    MOVE_OUT("Move Out"),
    @XmlEnumValue("Non-Payment (DNP)")
    NON_PAYMENT_DNP("Non-Payment (DNP)"),
    @XmlEnumValue("Unauthorised Usage (DNI)")
    UNAUTHORISED_USAGE_DNI("Unauthorised Usage (DNI)"),
    @XmlEnumValue("Illegal Usage")
    ILLEGAL_USAGE("Illegal Usage"),
    @XmlEnumValue("No Access")
    NO_ACCESS("No Access"),
    @XmlEnumValue("Safety")
    SAFETY("Safety"),
    @XmlEnumValue("Defect")
    DEFECT("Defect"),
    @XmlEnumValue("Site Works")
    SITE_WORKS("Site Works"),
    @XmlEnumValue("Breach of Contract")
    BREACH_OF_CONTRACT("Breach of Contract"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DeEnergisationReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeEnergisationReason fromValue(String v) {
        for (DeEnergisationReason c: DeEnergisationReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
