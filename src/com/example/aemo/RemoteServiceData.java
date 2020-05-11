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
 * Schema - RemoteService
 * 			r36.1  WL.    Change Meters element to be optional.
 * 			
 * 
 * &lt;p&gt;Java class for RemoteServiceData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RemoteServiceData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestID" type="{urn:aseXML:r38}ServiceRequestID"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *         &amp;lt;element name="Meters" type="{urn:aseXML:r38}MeterSerialNumbers" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ServiceType" type="{urn:aseXML:r38}RemoteServiceType"/&amp;gt;
 *         &amp;lt;element name="RequestCode" type="{urn:aseXML:r38}RemoteServiceRequestCode"/&amp;gt;
 *         &amp;lt;element name="ResponseFormat" type="{urn:aseXML:r38}ResponseFormat"/&amp;gt;
 *         &amp;lt;element name="FromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UserDef" type="{urn:aseXML:r38}UserDefData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteServiceData", propOrder = {
    "requestID",
    "nmi",
    "meters",
    "serviceType",
    "requestCode",
    "responseFormat",
    "fromDateTime",
    "toDateTime",
    "userDef"
})
public class RemoteServiceData {

    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;
    @XmlElement(name = "Meters")
    protected MeterSerialNumbers meters;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "RequestCode", required = true)
    protected String requestCode;
    @XmlElement(name = "ResponseFormat", required = true)
    protected String responseFormat;
    @XmlElement(name = "FromDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDateTime;
    @XmlElement(name = "ToDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDateTime;
    @XmlElement(name = "UserDef")
    protected UserDefData userDef;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMI }
     *     
     */
    public NMI getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMI }
     *     
     */
    public void setNMI(NMI value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the meters property.
     * 
     * @return
     *     possible object is
     *     {@link MeterSerialNumbers }
     *     
     */
    public MeterSerialNumbers getMeters() {
        return meters;
    }

    /**
     * Sets the value of the meters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterSerialNumbers }
     *     
     */
    public void setMeters(MeterSerialNumbers value) {
        this.meters = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the requestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCode() {
        return requestCode;
    }

    /**
     * Sets the value of the requestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCode(String value) {
        this.requestCode = value;
    }

    /**
     * Gets the value of the responseFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseFormat() {
        return responseFormat;
    }

    /**
     * Sets the value of the responseFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseFormat(String value) {
        this.responseFormat = value;
    }

    /**
     * Gets the value of the fromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Sets the value of the fromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDateTime(XMLGregorianCalendar value) {
        this.fromDateTime = value;
    }

    /**
     * Gets the value of the toDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDateTime() {
        return toDateTime;
    }

    /**
     * Sets the value of the toDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDateTime(XMLGregorianCalendar value) {
        this.toDateTime = value;
    }

    /**
     * Gets the value of the userDef property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefData }
     *     
     */
    public UserDefData getUserDef() {
        return userDef;
    }

    /**
     * Sets the value of the userDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefData }
     *     
     */
    public void setUserDef(UserDefData value) {
        this.userDef = value;
    }

}
