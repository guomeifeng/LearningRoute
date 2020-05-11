//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Notification of Daily Imbalance
 * 
 * &lt;p&gt;Java class for DailyImbalanceNotification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DailyImbalanceNotification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="DailyImbalanceData"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="DailyImbalance" type="{urn:aseXML:r38}QuantityOfGasMJ"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *                 &amp;lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *                 &amp;lt;attribute name="networkID" use="required" type="{urn:aseXML:r38}NetworkID" /&amp;gt;
 *                 &amp;lt;attribute name="participantID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r34" default="r34" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyImbalanceNotification", propOrder = {
    "dailyImbalanceData"
})
public class DailyImbalanceNotification {

    @XmlElement(name = "DailyImbalanceData", required = true)
    protected List<DailyImbalanceNotification.DailyImbalanceData> dailyImbalanceData;
    @XmlAttribute(name = "version")
    protected R34 version;

    /**
     * Gets the value of the dailyImbalanceData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dailyImbalanceData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDailyImbalanceData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DailyImbalanceNotification.DailyImbalanceData }
     * 
     * 
     */
    public List<DailyImbalanceNotification.DailyImbalanceData> getDailyImbalanceData() {
        if (dailyImbalanceData == null) {
            dailyImbalanceData = new ArrayList<DailyImbalanceNotification.DailyImbalanceData>();
        }
        return this.dailyImbalanceData;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R34 }
     *     
     */
    public R34 getVersion() {
        if (version == null) {
            return R34 .R_34;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R34 }
     *     
     */
    public void setVersion(R34 value) {
        this.version = value;
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
     *         &amp;lt;element name="DailyImbalance" type="{urn:aseXML:r38}QuantityOfGasMJ"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *       &amp;lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
     *       &amp;lt;attribute name="networkID" use="required" type="{urn:aseXML:r38}NetworkID" /&amp;gt;
     *       &amp;lt;attribute name="participantID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dailyImbalance"
    })
    public static class DailyImbalanceData {

        @XmlElement(name = "DailyImbalance")
        @XmlSchemaType(name = "integer")
        protected long dailyImbalance;
        @XmlAttribute(name = "gasDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar gasDate;
        @XmlAttribute(name = "networkID", required = true)
        protected String networkID;
        @XmlAttribute(name = "participantID", required = true)
        protected String participantID;

        /**
         * Gets the value of the dailyImbalance property.
         * 
         */
        public long getDailyImbalance() {
            return dailyImbalance;
        }

        /**
         * Sets the value of the dailyImbalance property.
         * 
         */
        public void setDailyImbalance(long value) {
            this.dailyImbalance = value;
        }

        /**
         * Gets the value of the gasDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGasDate() {
            return gasDate;
        }

        /**
         * Sets the value of the gasDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGasDate(XMLGregorianCalendar value) {
            this.gasDate = value;
        }

        /**
         * Gets the value of the networkID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkID() {
            return networkID;
        }

        /**
         * Sets the value of the networkID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkID(String value) {
            this.networkID = value;
        }

        /**
         * Gets the value of the participantID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipantID() {
            return participantID;
        }

        /**
         * Sets the value of the participantID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipantID(String value) {
            this.participantID = value;
        }

    }

}
