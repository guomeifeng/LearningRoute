//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Purpose - Network charge record type - "810, 921" - RemittanceDetail
 * 
 * &lt;p&gt;Java class for RemittanceDetail complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RemittanceDetail"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InvoiceNumber" type="{urn:aseXML:r38}InvoiceNumber"/&amp;gt;
 *         &amp;lt;element name="TransactionID" type="{urn:aseXML:r38}TransactionID"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMIWithChecksum"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="Payment" type="{urn:aseXML:r38}PaymentData"/&amp;gt;
 *           &amp;lt;element name="TotalPaid" type="{urn:aseXML:r38}Amount"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="DatePaid" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentReference" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="60"/&amp;gt;
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
@XmlType(name = "RemittanceDetail", propOrder = {
    "invoiceNumber",
    "transactionID",
    "nmi",
    "payment",
    "totalPaid",
    "datePaid",
    "paymentReference"
})
public class RemittanceDetail {

    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "NMI", required = true)
    protected NMIWithChecksum nmi;
    @XmlElement(name = "Payment")
    protected PaymentData payment;
    @XmlElement(name = "TotalPaid")
    protected BigDecimal totalPaid;
    @XmlElement(name = "DatePaid")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePaid;
    @XmlElement(name = "PaymentReference")
    protected String paymentReference;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMIWithChecksum }
     *     
     */
    public NMIWithChecksum getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIWithChecksum }
     *     
     */
    public void setNMI(NMIWithChecksum value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentData }
     *     
     */
    public PaymentData getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentData }
     *     
     */
    public void setPayment(PaymentData value) {
        this.payment = value;
    }

    /**
     * Gets the value of the totalPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    /**
     * Sets the value of the totalPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPaid(BigDecimal value) {
        this.totalPaid = value;
    }

    /**
     * Gets the value of the datePaid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePaid() {
        return datePaid;
    }

    /**
     * Sets the value of the datePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePaid(XMLGregorianCalendar value) {
        this.datePaid = value;
    }

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

}
