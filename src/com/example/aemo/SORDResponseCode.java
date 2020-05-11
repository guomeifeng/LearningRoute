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
 * &lt;p&gt;Java class for SORDResponseCode.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SORDResponseCode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Customer On-Site"/&amp;gt;
 *     &amp;lt;enumeration value="Customer Prevented"/&amp;gt;
 *     &amp;lt;enumeration value="De-energisation Not Completed Due To A Re-energisation"/&amp;gt;
 *     &amp;lt;enumeration value="Documentation Not Provided"/&amp;gt;
 *     &amp;lt;enumeration value="Metering Problem"/&amp;gt;
 *     &amp;lt;enumeration value="Meter Reading Only Undertaken Due To Prior Re-energisation"/&amp;gt;
 *     &amp;lt;enumeration value="New Customer On-Site"/&amp;gt;
 *     &amp;lt;enumeration value="No Supply"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *     &amp;lt;enumeration value="Reading Problem"/&amp;gt;
 *     &amp;lt;enumeration value="Request Submitted By Another Initiator"/&amp;gt;
 *     &amp;lt;enumeration value="Initiator Cancellation"/&amp;gt;
 *     &amp;lt;enumeration value="Sensitive Load"/&amp;gt;
 *     &amp;lt;enumeration value="Recipient Cancellation"/&amp;gt;
 *     &amp;lt;enumeration value="Unable To Access"/&amp;gt;
 *     &amp;lt;enumeration value="Unknown Load"/&amp;gt;
 *     &amp;lt;enumeration value="Unsafe"/&amp;gt;
 *     &amp;lt;enumeration value="Tariff Change Not Approved"/&amp;gt;
 *     &amp;lt;enumeration value="Inadequate infrastructure"/&amp;gt;
 *     &amp;lt;enumeration value="No Comms"/&amp;gt;
 *     &amp;lt;enumeration value="Life Support"/&amp;gt;
 *     &amp;lt;enumeration value="Meter Not Retrieved"/&amp;gt;
 *     &amp;lt;enumeration value="Metering not compatible with proposed Tariff Change"/&amp;gt;
 *     &amp;lt;enumeration value="Shared Supply Point"/&amp;gt;
 *     &amp;lt;enumeration value="Site Already Energised"/&amp;gt;
 *     &amp;lt;enumeration value="Unknown Connection Status"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SORDResponseCode")
@XmlEnum
public enum SORDResponseCode {

    @XmlEnumValue("Customer On-Site")
    CUSTOMER_ON_SITE("Customer On-Site"),
    @XmlEnumValue("Customer Prevented")
    CUSTOMER_PREVENTED("Customer Prevented"),
    @XmlEnumValue("De-energisation Not Completed Due To A Re-energisation")
    DE_ENERGISATION_NOT_COMPLETED_DUE_TO_A_RE_ENERGISATION("De-energisation Not Completed Due To A Re-energisation"),
    @XmlEnumValue("Documentation Not Provided")
    DOCUMENTATION_NOT_PROVIDED("Documentation Not Provided"),
    @XmlEnumValue("Metering Problem")
    METERING_PROBLEM("Metering Problem"),
    @XmlEnumValue("Meter Reading Only Undertaken Due To Prior Re-energisation")
    METER_READING_ONLY_UNDERTAKEN_DUE_TO_PRIOR_RE_ENERGISATION("Meter Reading Only Undertaken Due To Prior Re-energisation"),
    @XmlEnumValue("New Customer On-Site")
    NEW_CUSTOMER_ON_SITE("New Customer On-Site"),
    @XmlEnumValue("No Supply")
    NO_SUPPLY("No Supply"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Reading Problem")
    READING_PROBLEM("Reading Problem"),
    @XmlEnumValue("Request Submitted By Another Initiator")
    REQUEST_SUBMITTED_BY_ANOTHER_INITIATOR("Request Submitted By Another Initiator"),
    @XmlEnumValue("Initiator Cancellation")
    INITIATOR_CANCELLATION("Initiator Cancellation"),
    @XmlEnumValue("Sensitive Load")
    SENSITIVE_LOAD("Sensitive Load"),
    @XmlEnumValue("Recipient Cancellation")
    RECIPIENT_CANCELLATION("Recipient Cancellation"),
    @XmlEnumValue("Unable To Access")
    UNABLE_TO_ACCESS("Unable To Access"),
    @XmlEnumValue("Unknown Load")
    UNKNOWN_LOAD("Unknown Load"),
    @XmlEnumValue("Unsafe")
    UNSAFE("Unsafe"),
    @XmlEnumValue("Tariff Change Not Approved")
    TARIFF_CHANGE_NOT_APPROVED("Tariff Change Not Approved"),
    @XmlEnumValue("Inadequate infrastructure")
    INADEQUATE_INFRASTRUCTURE("Inadequate infrastructure"),
    @XmlEnumValue("No Comms")
    NO_COMMS("No Comms"),
    @XmlEnumValue("Life Support")
    LIFE_SUPPORT("Life Support"),
    @XmlEnumValue("Meter Not Retrieved")
    METER_NOT_RETRIEVED("Meter Not Retrieved"),
    @XmlEnumValue("Metering not compatible with proposed Tariff Change")
    METERING_NOT_COMPATIBLE_WITH_PROPOSED_TARIFF_CHANGE("Metering not compatible with proposed Tariff Change"),
    @XmlEnumValue("Shared Supply Point")
    SHARED_SUPPLY_POINT("Shared Supply Point"),
    @XmlEnumValue("Site Already Energised")
    SITE_ALREADY_ENERGISED("Site Already Energised"),
    @XmlEnumValue("Unknown Connection Status")
    UNKNOWN_CONNECTION_STATUS("Unknown Connection Status");
    private final String value;

    SORDResponseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SORDResponseCode fromValue(String v) {
        for (SORDResponseCode c: SORDResponseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
