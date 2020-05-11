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


/**
 * Purpose - Define the structure of Control Equipment detail.
 * 
 * &lt;p&gt;Java class for ControlEquipment complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ControlEquipment"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ControlEquipmentNumber" type="{urn:aseXML:r38}ControlEquipmentSerialNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ControlEquipmentType" type="{urn:aseXML:r38}ControlEquipmentType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ControlChannel" type="{urn:aseXML:r38}ControlChannel" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConnectedMeters" type="{urn:aseXML:r38}ConnectedMeters" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlEquipment", propOrder = {
    "controlEquipmentNumber",
    "controlEquipmentType",
    "controlChannel",
    "connectedMeters"
})
public class ControlEquipment {

    @XmlElement(name = "ControlEquipmentNumber")
    protected String controlEquipmentNumber;
    @XmlElement(name = "ControlEquipmentType")
    @XmlSchemaType(name = "string")
    protected ControlEquipmentType controlEquipmentType;
    @XmlElement(name = "ControlChannel")
    protected String controlChannel;
    @XmlElement(name = "ConnectedMeters")
    protected ConnectedMeters connectedMeters;

    /**
     * Gets the value of the controlEquipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlEquipmentNumber() {
        return controlEquipmentNumber;
    }

    /**
     * Sets the value of the controlEquipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlEquipmentNumber(String value) {
        this.controlEquipmentNumber = value;
    }

    /**
     * Gets the value of the controlEquipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlEquipmentType }
     *     
     */
    public ControlEquipmentType getControlEquipmentType() {
        return controlEquipmentType;
    }

    /**
     * Sets the value of the controlEquipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlEquipmentType }
     *     
     */
    public void setControlEquipmentType(ControlEquipmentType value) {
        this.controlEquipmentType = value;
    }

    /**
     * Gets the value of the controlChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlChannel() {
        return controlChannel;
    }

    /**
     * Sets the value of the controlChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlChannel(String value) {
        this.controlChannel = value;
    }

    /**
     * Gets the value of the connectedMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedMeters }
     *     
     */
    public ConnectedMeters getConnectedMeters() {
        return connectedMeters;
    }

    /**
     * Sets the value of the connectedMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedMeters }
     *     
     */
    public void setConnectedMeters(ConnectedMeters value) {
        this.connectedMeters = value;
    }

}