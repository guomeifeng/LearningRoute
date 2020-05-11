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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a request for current information about a specific Booking or a particular Outage within a Repeating Booking. The attribute, "InfoType" specifies the type of Booking Information to be returned.
 * 
 * &lt;p&gt;Java class for BookingInfoRequestKeyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BookingInfoRequestKeyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CompanyBookingId" type="{urn:aseXML:r38}CompanyBookingIdType"/&amp;gt;
 *         &amp;lt;element name="CompanyOutageId" type="{urn:aseXML:r38}CompanyOutageIdType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TNSPId" type="{urn:aseXML:r38}PartyIdentifier" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="infoType" default="all"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;enumeration value="all"/&amp;gt;
 *             &amp;lt;enumeration value="NEMMCO"/&amp;gt;
 *             &amp;lt;enumeration value="TNSP"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingInfoRequestKeyType", propOrder = {
    "companyBookingId",
    "companyOutageId",
    "tnspId"
})
public class BookingInfoRequestKeyType {

    @XmlElement(name = "CompanyBookingId", required = true)
    protected String companyBookingId;
    @XmlElement(name = "CompanyOutageId")
    protected String companyOutageId;
    @XmlElement(name = "TNSPId")
    protected PartyIdentifier tnspId;
    @XmlAttribute(name = "infoType")
    protected String infoType;

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
     * Gets the value of the tnspId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getTNSPId() {
        return tnspId;
    }

    /**
     * Sets the value of the tnspId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setTNSPId(PartyIdentifier value) {
        this.tnspId = value;
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        if (infoType == null) {
            return "all";
        } else {
            return infoType;
        }
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

}
