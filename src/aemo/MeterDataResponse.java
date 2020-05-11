//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigInteger;
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
 * 
 * Application - Meter Data Management
 * TransactionExchange - Meter Data Delivery
 * TransactionGroup - MDMT
 * Priority - Low
 * Purpose - Provide acknowledgment of the loading of meter data into MDM
 * Detail - Any errors are reported via Event elements.
 * 			
 * 
 * &lt;p&gt;Java class for MeterDataResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeterDataResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityID" type="{urn:aseXML:r38}MDMActivityIdentifier"/&amp;gt;
 *         &amp;lt;element name="AcceptedCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="LoadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterDataResponse", propOrder = {
    "activityID",
    "acceptedCount",
    "loadDate",
    "event"
})
public class MeterDataResponse {

    @XmlElement(name = "ActivityID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected long activityID;
    @XmlElement(name = "AcceptedCount", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger acceptedCount;
    @XmlElement(name = "LoadDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loadDate;
    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlAttribute(name = "version")
    protected R29 version;

    /**
     * Gets the value of the activityID property.
     * 
     */
    public long getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     */
    public void setActivityID(long value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the acceptedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcceptedCount() {
        return acceptedCount;
    }

    /**
     * Sets the value of the acceptedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcceptedCount(BigInteger value) {
        this.acceptedCount = value;
    }

    /**
     * Gets the value of the loadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoadDate() {
        return loadDate;
    }

    /**
     * Sets the value of the loadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoadDate(XMLGregorianCalendar value) {
        this.loadDate = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the event property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEvent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R29 }
     *     
     */
    public R29 getVersion() {
        if (version == null) {
            return R29 .R_29;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R29 }
     *     
     */
    public void setVersion(R29 value) {
        this.version = value;
    }

}