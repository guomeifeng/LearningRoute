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
 * &lt;p&gt;Java class for MIRNStatus.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="MIRNStatus"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Commissioned"/&amp;gt;
 *     &amp;lt;enumeration value="Decommissioned"/&amp;gt;
 *     &amp;lt;enumeration value="Deregistered"/&amp;gt;
 *     &amp;lt;enumeration value="Registered"/&amp;gt;
 *     &amp;lt;enumeration value="Unclaimed"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "MIRNStatus")
@XmlEnum
public enum MIRNStatus {

    @XmlEnumValue("Commissioned")
    COMMISSIONED("Commissioned"),
    @XmlEnumValue("Decommissioned")
    DECOMMISSIONED("Decommissioned"),
    @XmlEnumValue("Deregistered")
    DEREGISTERED("Deregistered"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Unclaimed")
    UNCLAIMED("Unclaimed");
    private final String value;

    MIRNStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIRNStatus fromValue(String v) {
        for (MIRNStatus c: MIRNStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}