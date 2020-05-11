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
 * &lt;p&gt;Java class for GasAgencyNomStatusHistoryType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasAgencyNomStatusHistoryType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NominationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NominationStatus" type="{urn:aseXML:r38}GasNominationStatusType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NominationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NominationConfirmedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WithdrawalConfirmedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasAgencyNomStatusHistoryType", propOrder = {
    "headerId",
    "nominationId",
    "nominationStatus",
    "nominationDate",
    "nominationConfirmedDate",
    "withdrawalDate",
    "withdrawalConfirmedDate",
    "createdDate"
})
public class GasAgencyNomStatusHistoryType {

    @XmlElement(name = "HeaderId")
    protected Long headerId;
    @XmlElement(name = "NominationId")
    protected Long nominationId;
    @XmlElement(name = "NominationStatus")
    @XmlSchemaType(name = "string")
    protected GasNominationStatusType nominationStatus;
    @XmlElement(name = "NominationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nominationDate;
    @XmlElement(name = "NominationConfirmedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nominationConfirmedDate;
    @XmlElement(name = "WithdrawalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar withdrawalDate;
    @XmlElement(name = "WithdrawalConfirmedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar withdrawalConfirmedDate;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;

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
     * Gets the value of the nominationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNominationDate() {
        return nominationDate;
    }

    /**
     * Sets the value of the nominationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNominationDate(XMLGregorianCalendar value) {
        this.nominationDate = value;
    }

    /**
     * Gets the value of the nominationConfirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNominationConfirmedDate() {
        return nominationConfirmedDate;
    }

    /**
     * Sets the value of the nominationConfirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNominationConfirmedDate(XMLGregorianCalendar value) {
        this.nominationConfirmedDate = value;
    }

    /**
     * Gets the value of the withdrawalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalDate() {
        return withdrawalDate;
    }

    /**
     * Sets the value of the withdrawalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalDate(XMLGregorianCalendar value) {
        this.withdrawalDate = value;
    }

    /**
     * Gets the value of the withdrawalConfirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalConfirmedDate() {
        return withdrawalConfirmedDate;
    }

    /**
     * Sets the value of the withdrawalConfirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalConfirmedDate(XMLGregorianCalendar value) {
        this.withdrawalConfirmedDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

}