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
 * &lt;p&gt;Java class for WorkType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="WorkType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;maxLength value="50"/&amp;gt;
 *     &amp;lt;enumeration value="Exchange Equipment"/&amp;gt;
 *     &amp;lt;enumeration value="Install Equipment"/&amp;gt;
 *     &amp;lt;enumeration value="Remove Equipment"/&amp;gt;
 *     &amp;lt;enumeration value="Relocate"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "WorkType")
@XmlEnum
public enum WorkType {

    @XmlEnumValue("Exchange Equipment")
    EXCHANGE_EQUIPMENT("Exchange Equipment"),
    @XmlEnumValue("Install Equipment")
    INSTALL_EQUIPMENT("Install Equipment"),
    @XmlEnumValue("Remove Equipment")
    REMOVE_EQUIPMENT("Remove Equipment"),
    @XmlEnumValue("Relocate")
    RELOCATE("Relocate");
    private final String value;

    WorkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkType fromValue(String v) {
        for (WorkType c: WorkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}