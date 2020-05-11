//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Provide upper limits on whole intermittent generator in StPasa time frame
 * 
 * &lt;p&gt;Java class for MMSUpperLimitsIntermittentGenAvailability complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MMSUpperLimitsIntermittentGenAvailability"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MMSPeriod" maxOccurs="48"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="MMSPeriodId" type="{urn:aseXML:r38}MMSPeriodId"/&amp;gt;
 *                   &amp;lt;element name="UpperLimit" type="{urn:aseXML:r38}UpperLimit"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMSUpperLimitsIntermittentGenAvailability", propOrder = {
    "mmsPeriod"
})
public class MMSUpperLimitsIntermittentGenAvailability {

    @XmlElement(name = "MMSPeriod", required = true)
    protected List<MMSUpperLimitsIntermittentGenAvailability.MMSPeriod> mmsPeriod;

    /**
     * Gets the value of the mmsPeriod property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the mmsPeriod property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMMSPeriod().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MMSUpperLimitsIntermittentGenAvailability.MMSPeriod }
     * 
     * 
     */
    public List<MMSUpperLimitsIntermittentGenAvailability.MMSPeriod> getMMSPeriod() {
        if (mmsPeriod == null) {
            mmsPeriod = new ArrayList<MMSUpperLimitsIntermittentGenAvailability.MMSPeriod>();
        }
        return this.mmsPeriod;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="MMSPeriodId" type="{urn:aseXML:r38}MMSPeriodId"/&amp;gt;
     *         &amp;lt;element name="UpperLimit" type="{urn:aseXML:r38}UpperLimit"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mmsPeriodId",
        "upperLimit"
    })
    public static class MMSPeriod {

        @XmlElement(name = "MMSPeriodId")
        @XmlSchemaType(name = "integer")
        protected int mmsPeriodId;
        @XmlElement(name = "UpperLimit", required = true)
        protected BigInteger upperLimit;

        /**
         * Gets the value of the mmsPeriodId property.
         * 
         */
        public int getMMSPeriodId() {
            return mmsPeriodId;
        }

        /**
         * Sets the value of the mmsPeriodId property.
         * 
         */
        public void setMMSPeriodId(int value) {
            this.mmsPeriodId = value;
        }

        /**
         * Gets the value of the upperLimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUpperLimit() {
            return upperLimit;
        }

        /**
         * Sets the value of the upperLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUpperLimit(BigInteger value) {
            this.upperLimit = value;
        }

    }

}
