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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for GasAgencyNomDetailType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasAgencyNomDetailType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NomineeId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NominationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreferenceOrder" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="10"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="NominationStatus" type="{urn:aseXML:r38}GasNominationStatusType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastModifiedBy" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasAgencyNomDetailType", propOrder = {
    "nomineeId",
    "quantity",
    "headerId",
    "nominationId",
    "preferenceOrder",
    "nominationStatus",
    "lastModifiedBy",
    "lastModifiedDate"
})
public class GasAgencyNomDetailType {

    @XmlElement(name = "NomineeId")
    protected int nomineeId;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "HeaderId")
    protected Long headerId;
    @XmlElement(name = "NominationId")
    protected Long nominationId;
    @XmlElement(name = "PreferenceOrder")
    protected Integer preferenceOrder;
    @XmlElement(name = "NominationStatus")
    @XmlSchemaType(name = "string")
    protected GasNominationStatusType nominationStatus;
    @XmlElement(name = "LastModifiedBy")
    protected String lastModifiedBy;
    @XmlElement(name = "LastModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;

    /**
     * Gets the value of the nomineeId property.
     * 
     */
    public int getNomineeId() {
        return nomineeId;
    }

    /**
     * Sets the value of the nomineeId property.
     * 
     */
    public void setNomineeId(int value) {
        this.nomineeId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeaderId(Long value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the nominationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNominationId() {
        return nominationId;
    }

    /**
     * Sets the value of the nominationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNominationId(Long value) {
        this.nominationId = value;
    }

    /**
     * Gets the value of the preferenceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreferenceOrder() {
        return preferenceOrder;
    }

    /**
     * Sets the value of the preferenceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreferenceOrder(Integer value) {
        this.preferenceOrder = value;
    }

    /**
     * Gets the value of the nominationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GasNominationStatusType }
     *     
     */
    public GasNominationStatusType getNominationStatus() {
        return nominationStatus;
    }

    /**
     * Sets the value of the nominationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasNominationStatusType }
     *     
     */
    public void setNominationStatus(GasNominationStatusType value) {
        this.nominationStatus = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

}
