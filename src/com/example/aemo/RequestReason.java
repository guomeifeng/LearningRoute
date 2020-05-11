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
 * &lt;p&gt;Java class for RequestReason.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RequestReason"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Returned Mail"/&amp;gt;
 *     &amp;lt;enumeration value="Missing Customer Details"/&amp;gt;
 *     &amp;lt;enumeration value="Confirm Life Support"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *     &amp;lt;enumeration value="Transfer Complete, no CDN Received"/&amp;gt;
 *     &amp;lt;enumeration value="New Connection, no CDN Received"/&amp;gt;
 *     &amp;lt;enumeration value="No response to rejected CDN"/&amp;gt;
 *     &amp;lt;enumeration value="Data Quality Issue"/&amp;gt;
 *     &amp;lt;enumeration value="Rec - confirm no SensitiveLoad"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RequestReason")
@XmlEnum
public enum RequestReason {

    @XmlEnumValue("Returned Mail")
    RETURNED_MAIL("Returned Mail"),
    @XmlEnumValue("Missing Customer Details")
    MISSING_CUSTOMER_DETAILS("Missing Customer Details"),
    @XmlEnumValue("Confirm Life Support")
    CONFIRM_LIFE_SUPPORT("Confirm Life Support"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Transfer Complete, no CDN Received")
    TRANSFER_COMPLETE_NO_CDN_RECEIVED("Transfer Complete, no CDN Received"),
    @XmlEnumValue("New Connection, no CDN Received")
    NEW_CONNECTION_NO_CDN_RECEIVED("New Connection, no CDN Received"),
    @XmlEnumValue("No response to rejected CDN")
    NO_RESPONSE_TO_REJECTED_CDN("No response to rejected CDN"),
    @XmlEnumValue("Data Quality Issue")
    DATA_QUALITY_ISSUE("Data Quality Issue"),
    @XmlEnumValue("Rec - confirm no SensitiveLoad")
    REC_CONFIRM_NO_SENSITIVE_LOAD("Rec - confirm no SensitiveLoad");
    private final String value;

    RequestReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestReason fromValue(String v) {
        for (RequestReason c: RequestReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
