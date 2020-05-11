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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Equipment/Services Affected by the Booking.  
 * 
 * &lt;p&gt;Java class for BookingElementType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BookingElementType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CompanyElementId" type="{urn:aseXML:r38}CompanyElementIdType"/&amp;gt;
 *         &amp;lt;element name="ServiceAffected" type="{urn:aseXML:r38}EnumBookingElementServiceAffectedType"/&amp;gt;
 *         &amp;lt;element name="ServiceAffectedDetail" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="60"/&amp;gt;
 *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
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
@XmlType(name = "BookingElementType", propOrder = {
    "companyElementId",
    "serviceAffected",
    "serviceAffectedDetail"
})
public class BookingElementType {

    @XmlElement(name = "CompanyElementId", required = true)
    protected String companyElementId;
    @XmlElement(name = "ServiceAffected", required = true)
    @XmlSchemaType(name = "string")
    protected EnumBookingElementServiceAffectedType serviceAffected;
    @XmlElement(name = "ServiceAffectedDetail")
    protected String serviceAffectedDetail;

    /**
     * Gets the value of the companyElementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyElementId() {
        return companyElementId;
    }

    /**
     * Sets the value of the companyElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyElementId(String value) {
        this.companyElementId = value;
    }

    /**
     * Gets the value of the serviceAffected property.
     * 
     * @return
     *     possible object is
     *     {@link EnumBookingElementServiceAffectedType }
     *     
     */
    public EnumBookingElementServiceAffectedType getServiceAffected() {
        return serviceAffected;
    }

    /**
     * Sets the value of the serviceAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumBookingElementServiceAffectedType }
     *     
     */
    public void setServiceAffected(EnumBookingElementServiceAffectedType value) {
        this.serviceAffected = value;
    }

    /**
     * Gets the value of the serviceAffectedDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAffectedDetail() {
        return serviceAffectedDetail;
    }

    /**
     * Sets the value of the serviceAffectedDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAffectedDetail(String value) {
        this.serviceAffectedDetail = value;
    }

}
