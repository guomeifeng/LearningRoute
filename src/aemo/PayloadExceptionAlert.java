//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for PayloadExceptionAlert complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PayloadExceptionAlert"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InitiatingAPIReference" type="{urn:aseXML:r38}APIReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MessageType" type="{urn:aseXML:r38}HubMessageType"/&amp;gt;
 *         &amp;lt;element name="MessageInitiator" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="MessageID" type="{urn:aseXML:r38}MessageIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InitiatingMessageID" type="{urn:aseXML:r38}MessageIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MessageContextID" type="{urn:aseXML:r38}MessageContextID"/&amp;gt;
 *         &amp;lt;element name="AlertDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r37" default="r37" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadExceptionAlert", propOrder = {
    "initiatingAPIReference",
    "messageType",
    "messageInitiator",
    "messageID",
    "initiatingMessageID",
    "messageContextID",
    "alertDateTime",
    "event"
})
public class PayloadExceptionAlert {

    @XmlElement(name = "InitiatingAPIReference")
    protected APIReference initiatingAPIReference;
    @XmlElement(name = "MessageType", required = true)
    @XmlSchemaType(name = "string")
    protected HubMessageType messageType;
    @XmlElement(name = "MessageInitiator", required = true)
    protected PartyIdentifier messageInitiator;
    @XmlElement(name = "MessageID")
    protected String messageID;
    @XmlElement(name = "InitiatingMessageID")
    protected String initiatingMessageID;
    @XmlElement(name = "MessageContextID", required = true)
    protected String messageContextID;
    @XmlElement(name = "AlertDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertDateTime;
    @XmlElement(name = "Event", required = true)
    protected Event event;
    @XmlAttribute(name = "version")
    protected R37 version;

    /**
     * Gets the value of the initiatingAPIReference property.
     * 
     * @return
     *     possible object is
     *     {@link APIReference }
     *     
     */
    public APIReference getInitiatingAPIReference() {
        return initiatingAPIReference;
    }

    /**
     * Sets the value of the initiatingAPIReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIReference }
     *     
     */
    public void setInitiatingAPIReference(APIReference value) {
        this.initiatingAPIReference = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link HubMessageType }
     *     
     */
    public HubMessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HubMessageType }
     *     
     */
    public void setMessageType(HubMessageType value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getMessageInitiator() {
        return messageInitiator;
    }

    /**
     * Sets the value of the messageInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setMessageInitiator(PartyIdentifier value) {
        this.messageInitiator = value;
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
     * Gets the value of the initiatingMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingMessageID() {
        return initiatingMessageID;
    }

    /**
     * Sets the value of the initiatingMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingMessageID(String value) {
        this.initiatingMessageID = value;
    }

    /**
     * Gets the value of the messageContextID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContextID() {
        return messageContextID;
    }

    /**
     * Sets the value of the messageContextID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContextID(String value) {
        this.messageContextID = value;
    }

    /**
     * Gets the value of the alertDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertDateTime() {
        return alertDateTime;
    }

    /**
     * Sets the value of the alertDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertDateTime(XMLGregorianCalendar value) {
        this.alertDateTime = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R37 }
     *     
     */
    public R37 getVersion() {
        if (version == null) {
            return R37 .R_37;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R37 }
     *     
     */
    public void setVersion(R37 value) {
        this.version = value;
    }

}