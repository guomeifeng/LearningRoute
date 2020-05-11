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
 * Schema - MeterDataManagement
 * 
 * &lt;p&gt;Java class for MeterDataMissingNotification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeterDataMissingNotification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="MissingMeterData" type="{urn:aseXML:r38}NMITransactionBase"/&amp;gt;
 *         &amp;lt;element name="CSVMissingMeterData" type="{urn:aseXML:r38}CSVRequestFormat"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r14" default="r14" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterDataMissingNotification", propOrder = {
    "missingMeterData",
    "csvMissingMeterData"
})
public class MeterDataMissingNotification {

    @XmlElement(name = "MissingMeterData")
    protected NMITransactionBase missingMeterData;
    @XmlElement(name = "CSVMissingMeterData")
    protected CSVRequestFormat csvMissingMeterData;
    @XmlAttribute(name = "version")
    protected R14 version;

    /**
     * Gets the value of the missingMeterData property.
     * 
     * @return
     *     possible object is
     *     {@link NMITransactionBase }
     *     
     */
    public NMITransactionBase getMissingMeterData() {
        return missingMeterData;
    }

    /**
     * Sets the value of the missingMeterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMITransactionBase }
     *     
     */
    public void setMissingMeterData(NMITransactionBase value) {
        this.missingMeterData = value;
    }

    /**
     * Gets the value of the csvMissingMeterData property.
     * 
     * @return
     *     possible object is
     *     {@link CSVRequestFormat }
     *     
     */
    public CSVRequestFormat getCSVMissingMeterData() {
        return csvMissingMeterData;
    }

    /**
     * Sets the value of the csvMissingMeterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVRequestFormat }
     *     
     */
    public void setCSVMissingMeterData(CSVRequestFormat value) {
        this.csvMissingMeterData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R14 }
     *     
     */
    public R14 getVersion() {
        if (version == null) {
            return R14 .R_14;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R14 }
     *     
     */
    public void setVersion(R14 value) {
        this.version = value;
    }

}