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
 * 
 * Purpose - Define the contents of the aseXML message header
 * Detail - Every aseXML message carries a header. It is used to indicate information pertaining to the message as a whole.
 * When not provided, a default value of NEM will be assumed for the market.  
 * 
 * 
 * &lt;p&gt;Java class for Header complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Header"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="From" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="To" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="MessageID" type="{urn:aseXML:r38}MessageIdentifier"/&amp;gt;
 *         &amp;lt;element name="MessageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="TransactionGroup" type="{urn:aseXML:r38}TransactionGroup"/&amp;gt;
 *         &amp;lt;element name="Priority" type="{urn:aseXML:r38}TransactionPriority" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SecurityContext" type="{urn:aseXML:r38}MessageSecurityContext" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Market" type="{urn:aseXML:r38}EnergyMarket" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "from",
    "to",
    "messageID",
    "messageDate",
    "transactionGroup",
    "priority",
    "securityContext",
    "market"
})
public class Header {

    @XmlElement(name = "From", required = true)
    protected PartyIdentifier from;
    @XmlElement(name = "To", required = true)
    protected PartyIdentifier to;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "MessageDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageDate;
    @XmlElement(name = "TransactionGroup", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionGroup transactionGroup;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected TransactionPriority priority;
    @XmlElement(name = "SecurityContext")
    protected String securityContext;
    @XmlElement(name = "Market", defaultValue = "NEM")
    @XmlSchemaType(name = "string")
    protected EnergyMarket market;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setFrom(PartyIdentifier value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setTo(PartyIdentifier value) {
        this.to = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the messageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDate() {
        return messageDate;
    }

    /**
     * Sets the value of the messageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDate(XMLGregorianCalendar value) {
        this.messageDate = value;
    }

    /**
     * Gets the value of the transactionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionGroup }
     *     
     */
    public TransactionGroup getTransactionGroup() {
        return transactionGroup;
    }

    /**
     * Sets the value of the transactionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionGroup }
     *     
     */
    public void setTransactionGroup(TransactionGroup value) {
        this.transactionGroup = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPriority }
     *     
     */
    public TransactionPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPriority }
     *     
     */
    public void setPriority(TransactionPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the securityContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityContext() {
        return securityContext;
    }

    /**
     * Sets the value of the securityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityContext(String value) {
        this.securityContext = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyMarket }
     *     
     */
    public EnergyMarket getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyMarket }
     *     
     */
    public void setMarket(EnergyMarket value) {
        this.market = value;
    }

}