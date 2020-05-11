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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Defines license data structure for the tradesman performing the service.
 * 
 * &lt;p&gt;Java class for License complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="License"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Licensee" type="{urn:aseXML:r38}PersonName" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BusinessName" type="{urn:aseXML:r38}BusinessName" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PhoneNumber" type="{urn:aseXML:r38}AustralianPhoneNumber" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LicenseNumber" type="{urn:aseXML:r38}LicenseNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SafetyCertificate" type="{urn:aseXML:r38}SafetyCertificateType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentReference" type="{urn:aseXML:r38}DocumentReferenceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AttendanceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License", propOrder = {
    "licensee",
    "businessName",
    "phoneNumber",
    "licenseNumber",
    "safetyCertificate",
    "documentReference",
    "attendanceRequired"
})
public class License {

    @XmlElement(name = "Licensee")
    protected PersonName licensee;
    @XmlElement(name = "BusinessName")
    protected BusinessName businessName;
    @XmlElement(name = "PhoneNumber")
    protected List<AustralianPhoneNumber> phoneNumber;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "SafetyCertificate")
    protected SafetyCertificateType safetyCertificate;
    @XmlElement(name = "DocumentReference")
    protected DocumentReferenceType documentReference;
    @XmlElement(name = "AttendanceRequired")
    protected Boolean attendanceRequired;

    /**
     * Gets the value of the licensee property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getLicensee() {
        return licensee;
    }

    /**
     * Sets the value of the licensee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setLicensee(PersonName value) {
        this.licensee = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessName }
     *     
     */
    public BusinessName getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessName }
     *     
     */
    public void setBusinessName(BusinessName value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the phoneNumber property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPhoneNumber().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AustralianPhoneNumber }
     * 
     * 
     */
    public List<AustralianPhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<AustralianPhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the safetyCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link SafetyCertificateType }
     *     
     */
    public SafetyCertificateType getSafetyCertificate() {
        return safetyCertificate;
    }

    /**
     * Sets the value of the safetyCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyCertificateType }
     *     
     */
    public void setSafetyCertificate(SafetyCertificateType value) {
        this.safetyCertificate = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the attendanceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendanceRequired() {
        return attendanceRequired;
    }

    /**
     * Sets the value of the attendanceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendanceRequired(Boolean value) {
        this.attendanceRequired = value;
    }

}
