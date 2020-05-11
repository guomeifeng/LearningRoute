//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Parameter definition for a Missing Data (null) Report
 * Report Name - MissingData
 * MSATS Report - RM11
 * 			
 * 
 * &lt;p&gt;Java class for MDMTMissingDataReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MDMTMissingDataReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}MDMTSettlementDateGroup"/&amp;gt;
 *         &amp;lt;element name="MDP" type="{urn:aseXML:r38}PartyIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMIBase" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DataType" type="{urn:aseXML:r38}MDMTReportsDataStreamType"/&amp;gt;
 *         &amp;lt;element name="NMISelection" type="{urn:aseXML:r38}MDMNMISelectionType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r10" default="r10" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDMTMissingDataReportParameters", propOrder = {
    "fromDate",
    "toDate",
    "asAtDate",
    "lastSequenceNumber",
    "mdp",
    "nmi",
    "dataType",
    "nmiSelection"
})
public class MDMTMissingDataReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "AsAtDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asAtDate;
    @XmlElement(name = "LastSequenceNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lastSequenceNumber;
    @XmlElement(name = "MDP")
    protected PartyIdentifier mdp;
    @XmlElement(name = "NMI")
    protected String nmi;
    @XmlElement(name = "DataType", required = true)
    protected String dataType;
    @XmlElement(name = "NMISelection", required = true)
    @XmlSchemaType(name = "string")
    protected MDMNMISelectionType nmiSelection;
    @XmlAttribute(name = "version")
    protected R10 version;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the asAtDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsAtDate() {
        return asAtDate;
    }

    /**
     * Sets the value of the asAtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsAtDate(XMLGregorianCalendar value) {
        this.asAtDate = value;
    }

    /**
     * Gets the value of the lastSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastSequenceNumber() {
        return lastSequenceNumber;
    }

    /**
     * Sets the value of the lastSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastSequenceNumber(BigInteger value) {
        this.lastSequenceNumber = value;
    }

    /**
     * Gets the value of the mdp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getMDP() {
        return mdp;
    }

    /**
     * Sets the value of the mdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setMDP(PartyIdentifier value) {
        this.mdp = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMI(String value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the nmiSelection property.
     * 
     * @return
     *     possible object is
     *     {@link MDMNMISelectionType }
     *     
     */
    public MDMNMISelectionType getNMISelection() {
        return nmiSelection;
    }

    /**
     * Sets the value of the nmiSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMNMISelectionType }
     *     
     */
    public void setNMISelection(MDMNMISelectionType value) {
        this.nmiSelection = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R10 }
     *     
     */
    public R10 getVersion() {
        if (version == null) {
            return R10 .R_10;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R10 }
     *     
     */
    public void setVersion(R10 value) {
        this.version = value;
    }

}
