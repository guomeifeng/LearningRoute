//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ElectricityHSMMonitorsResponseData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityHSMMonitorsResponseData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}HSMMonitorsResponseData"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="MonitorRollCalls" type="{urn:aseXML:r38}HSMMonitorRollCalls"/&amp;gt;
 *         &amp;lt;element name="MonitorCapabilities" type="{urn:aseXML:r38}HSMMonitorCapabilities"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="responseName" use="required" type="{urn:aseXML:r38}HSMMonitors" /&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r26" default="r26" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityHSMMonitorsResponseData", propOrder = {
    "monitorRollCalls",
    "monitorCapabilities"
})
public class ElectricityHSMMonitorsResponseData
    extends HSMMonitorsResponseData
{

    @XmlElementRef(name = "MonitorRollCalls", type = JAXBElement.class, required = false)
    protected JAXBElement<HSMMonitorRollCalls> monitorRollCalls;
    @XmlElementRef(name = "MonitorCapabilities", type = JAXBElement.class, required = false)
    protected JAXBElement<HSMMonitorCapabilities> monitorCapabilities;
    @XmlAttribute(name = "responseName", required = true)
    protected HSMMonitors responseName;
    @XmlAttribute(name = "version")
    protected R26 version;

    /**
     * Gets the value of the monitorRollCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HSMMonitorRollCalls }{@code >}
     *     
     */
    public JAXBElement<HSMMonitorRollCalls> getMonitorRollCalls() {
        return monitorRollCalls;
    }

    /**
     * Sets the value of the monitorRollCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HSMMonitorRollCalls }{@code >}
     *     
     */
    public void setMonitorRollCalls(JAXBElement<HSMMonitorRollCalls> value) {
        this.monitorRollCalls = value;
    }

    /**
     * Gets the value of the monitorCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HSMMonitorCapabilities }{@code >}
     *     
     */
    public JAXBElement<HSMMonitorCapabilities> getMonitorCapabilities() {
        return monitorCapabilities;
    }

    /**
     * Sets the value of the monitorCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HSMMonitorCapabilities }{@code >}
     *     
     */
    public void setMonitorCapabilities(JAXBElement<HSMMonitorCapabilities> value) {
        this.monitorCapabilities = value;
    }

    /**
     * Gets the value of the responseName property.
     * 
     * @return
     *     possible object is
     *     {@link HSMMonitors }
     *     
     */
    public HSMMonitors getResponseName() {
        return responseName;
    }

    /**
     * Sets the value of the responseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMMonitors }
     *     
     */
    public void setResponseName(HSMMonitors value) {
        this.responseName = value;
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
