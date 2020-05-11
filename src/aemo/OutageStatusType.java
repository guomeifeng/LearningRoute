//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Outage status information to be sent to a TNSP
 * 
 * &lt;p&gt;Java class for OutageStatusType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OutageStatusType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CompanyBookingId" type="{urn:aseXML:r38}CompanyBookingIdType"/&amp;gt;
 *         &amp;lt;element name="CompanyOutageId" type="{urn:aseXML:r38}CompanyOutageIdType"/&amp;gt;
 *         &amp;lt;element name="Status" type="{urn:aseXML:r38}EnumOutageStatusType"/&amp;gt;
 *         &amp;lt;element name="ChangedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="ChangedBy" type="{urn:aseXML:r38}NOSUserIdType"/&amp;gt;
 *         &amp;lt;element name="RequestedFor" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutageStatusType", propOrder = {
    "companyBookingId",
    "companyOutageId",
    "status",
    "changedOn",
    "changedBy",
    "requestedFor"
})
public class OutageStatusType {

    @XmlElement(name = "CompanyBookingId", required = true)
    protected String companyBookingId;
    @XmlElement(name = "CompanyOutageId", required = true)
    protected String companyOutageId;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected EnumOutageStatusType status;
    @XmlElement(name = "ChangedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedOn;
    @XmlElement(name = "ChangedBy", required = true)
    protected String changedBy;
    @XmlElement(name = "RequestedFor")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedFor;

    /**
     * Gets the value of the companyBookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBookingId() {
        return companyBookingId;
    }

    /**
     * Sets the value of the companyBookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBookingId(String value) {
        this.companyBookingId = value;
    }

    /**
     * Gets the value of the companyOutageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyOutageId() {
        return companyOutageId;
    }

    /**
     * Sets the value of the companyOutageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyOutageId(String value) {
        this.companyOutageId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOutageStatusType }
     *     
     */
    public EnumOutageStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOutageStatusType }
     *     
     */
    public void setStatus(EnumOutageStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the changedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedOn() {
        return changedOn;
    }

    /**
     * Sets the value of the changedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedOn(XMLGregorianCalendar value) {
        this.changedOn = value;
    }

    /**
     * Gets the value of the changedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * Sets the value of the changedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedBy(String value) {
        this.changedBy = value;
    }

    /**
     * Gets the value of the requestedFor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedFor() {
        return requestedFor;
    }

    /**
     * Sets the value of the requestedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedFor(XMLGregorianCalendar value) {
        this.requestedFor = value;
    }

}