//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ElectricityHSMMonitorsRequestData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityHSMMonitorsRequestData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}HSMMonitorsRequestData"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MonitorIdentities" type="{urn:aseXML:r38}HSMMonitorIdentities"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="requestName" use="required" type="{urn:aseXML:r38}HSMMonitors" /&amp;gt;
 *       &amp;lt;attribute name="allMonitors" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r26" default="r26" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityHSMMonitorsRequestData", propOrder = {
    "monitorIdentities"
})
public class ElectricityHSMMonitorsRequestData
    extends HSMMonitorsRequestData
{

    @XmlElement(name = "MonitorIdentities", required = true, nillable = true)
    protected HSMMonitorIdentities monitorIdentities;
    @XmlAttribute(name = "requestName", required = true)
    protected HSMMonitors requestName;
    @XmlAttribute(name = "allMonitors", required = true)
    protected boolean allMonitors;
    @XmlAttribute(name = "version")
    protected R26 version;

    /**
     * Gets the value of the monitorIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link HSMMonitorIdentities }
     *     
     */
    public HSMMonitorIdentities getMonitorIdentities() {
        return monitorIdentities;
    }

    /**
     * Sets the value of the monitorIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMMonitorIdentities }
     *     
     */
    public void setMonitorIdentities(HSMMonitorIdentities value) {
        this.monitorIdentities = value;
    }

    /**
     * Gets the value of the requestName property.
     * 
     * @return
     *     possible object is
     *     {@link HSMMonitors }
     *     
     */
    public HSMMonitors getRequestName() {
        return requestName;
    }

    /**
     * Sets the value of the requestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMMonitors }
     *     
     */
    public void setRequestName(HSMMonitors value) {
        this.requestName = value;
    }

    /**
     * Gets the value of the allMonitors property.
     * 
     */
    public boolean isAllMonitors() {
        return allMonitors;
    }

    /**
     * Sets the value of the allMonitors property.
     * 
     */
    public void setAllMonitors(boolean value) {
        this.allMonitors = value;
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
