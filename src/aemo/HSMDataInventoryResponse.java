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
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HSMDataInventoryResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HSMDataInventoryResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ResponseData" type="{urn:aseXML:r38}HSMDataInventoryResponseData"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="vendorSoftwareVersion" use="required" type="{urn:aseXML:r38}HSMVendorSoftwareVersion" /&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r26" default="r26" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMDataInventoryResponse", propOrder = {
    "responseData",
    "event"
})
public class HSMDataInventoryResponse {

    @XmlElement(name = "ResponseData", required = true)
    protected HSMDataInventoryResponseData responseData;
    @XmlElement(name = "Event", required = true)
    protected Event event;
    @XmlAttribute(name = "vendorSoftwareVersion", required = true)
    protected String vendorSoftwareVersion;
    @XmlAttribute(name = "version")
    protected R26 version;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link HSMDataInventoryResponseData }
     *     
     */
    public HSMDataInventoryResponseData getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMDataInventoryResponseData }
     *     
     */
    public void setResponseData(HSMDataInventoryResponseData value) {
        this.responseData = value;
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
     * Gets the value of the vendorSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorSoftwareVersion() {
        return vendorSoftwareVersion;
    }

    /**
     * Sets the value of the vendorSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorSoftwareVersion(String value) {
        this.vendorSoftwareVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R26 }
     *     
     */
    public R26 getVersion() {
        if (version == null) {
            return R26 .R_26;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R26 }
     *     
     */
    public void setVersion(R26 value) {
        this.version = value;
    }

}