//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RebateType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RebateType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Pension Card"/&amp;gt;
 *     &amp;lt;enumeration value="Health Care Card"/&amp;gt;
 *     &amp;lt;enumeration value="Health Benefit Card"/&amp;gt;
 *     &amp;lt;enumeration value="Veteran Affairs Card"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RebateType")
@XmlEnum
public enum RebateType {

    @XmlEnumValue("Pension Card")
    PENSION_CARD("Pension Card"),
    @XmlEnumValue("Health Care Card")
    HEALTH_CARE_CARD("Health Care Card"),
    @XmlEnumValue("Health Benefit Card")
    HEALTH_BENEFIT_CARD("Health Benefit Card"),
    @XmlEnumValue("Veteran Affairs Card")
    VETERAN_AFFAIRS_CARD("Veteran Affairs Card");
    private final String value;

    RebateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RebateType fromValue(String v) {
        for (RebateType c: RebateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}