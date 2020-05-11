//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GasANType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasANType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NominationHeader" type="{urn:aseXML:r38}GasANHeaderType"/&amp;gt;
 *         &amp;lt;element name="MDQNS" type="{urn:aseXML:r38}GasANAMDQSType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasANType", propOrder = {
    "nominationHeader",
    "mdqns"
})
public class GasANType {

    @XmlElement(name = "NominationHeader", required = true)
    protected GasANHeaderType nominationHeader;
    @XmlElement(name = "MDQNS", required = true)
    protected GasANAMDQSType mdqns;

    /**
     * Gets the value of the nominationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link GasANHeaderType }
     *     
     */
    public GasANHeaderType getNominationHeader() {
        return nominationHeader;
    }

    /**
     * Sets the value of the nominationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasANHeaderType }
     *     
     */
    public void setNominationHeader(GasANHeaderType value) {
        this.nominationHeader = value;
    }

    /**
     * Gets the value of the mdqns property.
     * 
     * @return
     *     possible object is
     *     {@link GasANAMDQSType }
     *     
     */
    public GasANAMDQSType getMDQNS() {
        return mdqns;
    }

    /**
     * Sets the value of the mdqns property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasANAMDQSType }
     *     
     */
    public void setMDQNS(GasANAMDQSType value) {
        this.mdqns = value;
    }

}
