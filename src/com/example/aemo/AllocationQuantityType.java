//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * &lt;p&gt;Java class for AllocationQuantityType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AllocationQuantityType"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;urn:aseXML:r38&amp;gt;EnergyQuantity"&amp;gt;
 *       &amp;lt;attribute name="type" type="{urn:aseXML:r38}AllocationType" /&amp;gt;
 *       &amp;lt;attribute name="usagePrecedence" type="{urn:aseXML:r38}UsagePrecedenceType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationQuantityType", propOrder = {
    "value"
})
public class AllocationQuantityType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "type")
    protected AllocationType type;
    @XmlAttribute(name = "usagePrecedence")
    protected Integer usagePrecedence;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationType }
     *     
     */
    public AllocationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationType }
     *     
     */
    public void setType(AllocationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the usagePrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsagePrecedence() {
        return usagePrecedence;
    }

    /**
     * Sets the value of the usagePrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsagePrecedence(Integer value) {
        this.usagePrecedence = value;
    }

}
