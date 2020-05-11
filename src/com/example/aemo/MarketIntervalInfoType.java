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
 * &lt;p&gt;Java class for MarketIntervalInfoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MarketIntervalInfoType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CurrentInterval" type="{urn:aseXML:r38}GasIntervalInfoType"/&amp;gt;
 *         &amp;lt;element name="NextInterval" type="{urn:aseXML:r38}GasIntervalInfoType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIntervalInfoType", propOrder = {
    "currentInterval",
    "nextInterval"
})
public class MarketIntervalInfoType {

    @XmlElement(name = "CurrentInterval", required = true)
    protected GasIntervalInfoType currentInterval;
    @XmlElement(name = "NextInterval", required = true)
    protected GasIntervalInfoType nextInterval;

    /**
     * Gets the value of the currentInterval property.
     * 
     * @return
     *     possible object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public GasIntervalInfoType getCurrentInterval() {
        return currentInterval;
    }

    /**
     * Sets the value of the currentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public void setCurrentInterval(GasIntervalInfoType value) {
        this.currentInterval = value;
    }

    /**
     * Gets the value of the nextInterval property.
     * 
     * @return
     *     possible object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public GasIntervalInfoType getNextInterval() {
        return nextInterval;
    }

    /**
     * Sets the value of the nextInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public void setNextInterval(GasIntervalInfoType value) {
        this.nextInterval = value;
    }

}
