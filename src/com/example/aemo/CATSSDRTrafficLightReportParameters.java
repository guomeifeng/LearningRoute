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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Parameter definition for  SDR Traffic Light Report
 * Report Name - SDR Export
 * MSATS Report - STND_DAT_TRAFFICLGHT
 * 			
 * 
 * &lt;p&gt;Java class for CATSSDRTrafficLightReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSSDRTrafficLightReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="StatsDate" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r19" default="r19" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSSDRTrafficLightReportParameters", propOrder = {
    "statsDate"
})
public class CATSSDRTrafficLightReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "StatsDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statsDate;
    @XmlAttribute(name = "version")
    protected R19 version;

    /**
     * Gets the value of the statsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatsDate() {
        return statsDate;
    }

    /**
     * Sets the value of the statsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatsDate(XMLGregorianCalendar value) {
        this.statsDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R19 }
     *     
     */
    public R19 getVersion() {
        if (version == null) {
            return R19 .R_19;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R19 }
     *     
     */
    public void setVersion(R19 value) {
        this.version = value;
    }

}
