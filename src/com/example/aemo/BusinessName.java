//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * &lt;p&gt;Java class for BusinessName complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BusinessName"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;urn:aseXML:r38&amp;gt;BusinessNameBase"&amp;gt;
 *       &amp;lt;attribute name="businessNameTypeCode" type="{urn:aseXML:r38}BusinessNameTypeCode" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessName", propOrder = {
    "value"
})
public class BusinessName {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "businessNameTypeCode")
    protected BusinessNameTypeCode businessNameTypeCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the businessNameTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessNameTypeCode }
     *     
     */
    public BusinessNameTypeCode getBusinessNameTypeCode() {
        return businessNameTypeCode;
    }

    /**
     * Sets the value of the businessNameTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessNameTypeCode }
     *     
     */
    public void setBusinessNameTypeCode(BusinessNameTypeCode value) {
        this.businessNameTypeCode = value;
    }

}
