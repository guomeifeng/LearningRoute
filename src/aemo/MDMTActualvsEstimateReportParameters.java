//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Parameter definition for an Actual vs Estimate Data Report
 * Report Name - ActualvsEstimate
 * MSATS Report - RM9
 * 			
 * 
 * &lt;p&gt;Java class for MDMTActualvsEstimateReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MDMTActualvsEstimateReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}MDMTSettlementDateGroup"/&amp;gt;
 *         &amp;lt;element name="DataType" type="{urn:aseXML:r38}MDMTReportsDataStreamType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MDP" type="{urn:aseXML:r38}PartyIdentifier" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDMTActualvsEstimateReportParameters", propOrder = {
    "fromDate",
    "toDate",
    "asAtDate",
    "lastSequenceNumber",
    "dataType",
    "mdp"
})
public class MDMTActualvsEstimateReportParameters
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
    @XmlElement(name = "DataType")
    protected String dataType;
    @XmlElement(name = "MDP")
    protected PartyIdentifier mdp;

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

}