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
 * &lt;p&gt;Java class for TroubleCause.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TroubleCause"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Animal or bird damage"/&amp;gt;
 *     &amp;lt;enumeration value="Associated to work on a nearby outage"/&amp;gt;
 *     &amp;lt;enumeration value="Associated with planned outage"/&amp;gt;
 *     &amp;lt;enumeration value="Damage caused by tree"/&amp;gt;
 *     &amp;lt;enumeration value="False call"/&amp;gt;
 *     &amp;lt;enumeration value="No access"/&amp;gt;
 *     &amp;lt;enumeration value="No identified cause"/&amp;gt;
 *     &amp;lt;enumeration value="OK on arrival"/&amp;gt;
 *     &amp;lt;enumeration value="Pollution buildup"/&amp;gt;
 *     &amp;lt;enumeration value="Problem in zone substation"/&amp;gt;
 *     &amp;lt;enumeration value="Problem on customer's property"/&amp;gt;
 *     &amp;lt;enumeration value="Problem with overhead cable or equipment"/&amp;gt;
 *     &amp;lt;enumeration value="Problem with underground cable"/&amp;gt;
 *     &amp;lt;enumeration value="Problem with underground equipment"/&amp;gt;
 *     &amp;lt;enumeration value="Reconnection / restoration"/&amp;gt;
 *     &amp;lt;enumeration value="Storm damage"/&amp;gt;
 *     &amp;lt;enumeration value="Third party damage"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TroubleCause")
@XmlEnum
public enum TroubleCause {

    @XmlEnumValue("Animal or bird damage")
    ANIMAL_OR_BIRD_DAMAGE("Animal or bird damage"),
    @XmlEnumValue("Associated to work on a nearby outage")
    ASSOCIATED_TO_WORK_ON_A_NEARBY_OUTAGE("Associated to work on a nearby outage"),
    @XmlEnumValue("Associated with planned outage")
    ASSOCIATED_WITH_PLANNED_OUTAGE("Associated with planned outage"),
    @XmlEnumValue("Damage caused by tree")
    DAMAGE_CAUSED_BY_TREE("Damage caused by tree"),
    @XmlEnumValue("False call")
    FALSE_CALL("False call"),
    @XmlEnumValue("No access")
    NO_ACCESS("No access"),
    @XmlEnumValue("No identified cause")
    NO_IDENTIFIED_CAUSE("No identified cause"),
    @XmlEnumValue("OK on arrival")
    OK_ON_ARRIVAL("OK on arrival"),
    @XmlEnumValue("Pollution buildup")
    POLLUTION_BUILDUP("Pollution buildup"),
    @XmlEnumValue("Problem in zone substation")
    PROBLEM_IN_ZONE_SUBSTATION("Problem in zone substation"),
    @XmlEnumValue("Problem on customer's property")
    PROBLEM_ON_CUSTOMER_S_PROPERTY("Problem on customer's property"),
    @XmlEnumValue("Problem with overhead cable or equipment")
    PROBLEM_WITH_OVERHEAD_CABLE_OR_EQUIPMENT("Problem with overhead cable or equipment"),
    @XmlEnumValue("Problem with underground cable")
    PROBLEM_WITH_UNDERGROUND_CABLE("Problem with underground cable"),
    @XmlEnumValue("Problem with underground equipment")
    PROBLEM_WITH_UNDERGROUND_EQUIPMENT("Problem with underground equipment"),
    @XmlEnumValue("Reconnection / restoration")
    RECONNECTION_RESTORATION("Reconnection / restoration"),
    @XmlEnumValue("Storm damage")
    STORM_DAMAGE("Storm damage"),
    @XmlEnumValue("Third party damage")
    THIRD_PARTY_DAMAGE("Third party damage");
    private final String value;

    TroubleCause(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TroubleCause fromValue(String v) {
        for (TroubleCause c: TroubleCause.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
