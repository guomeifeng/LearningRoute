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
 * Purpose - Parameters for a CATS NMI Audit Report
 * Report Name - NMIAudit
 * MSATS Report - C2
 * 			
 * 
 * &lt;p&gt;Java class for CATSNMIAuditReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSNMIAuditReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="AsAtFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="AsAtToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSNMIAuditReportParameters", propOrder = {
    "fromDate",
    "toDate",
    "asAtFromDate",
    "asAtToDate",
    "nmi"
})
public class CATSNMIAuditReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "AsAtFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asAtFromDate;
    @XmlElement(name = "AsAtToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asAtToDate;
    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;

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
     * Gets the value of the asAtFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsAtFromDate() {
        return asAtFromDate;
    }

    /**
     * Sets the value of the asAtFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsAtFromDate(XMLGregorianCalendar value) {
        this.asAtFromDate = value;
    }

    /**
     * Gets the value of the asAtToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsAtToDate() {
        return asAtToDate;
    }

    /**
     * Sets the value of the asAtToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsAtToDate(XMLGregorianCalendar value) {
        this.asAtToDate = value;
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

}