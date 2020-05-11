//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This transaction contains NOS information that may be a response to an information request transaction or generated by NEMMCO on the change of an assessment.
 * 
 * &lt;p&gt;Java class for NOSInfoResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NOSInfoResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Booking" type="{urn:aseXML:r38}BookingType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OutageStatus" type="{urn:aseXML:r38}OutageStatusType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OutageConstraint" type="{urn:aseXML:r38}OutageConstraintType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Assessment" type="{urn:aseXML:r38}NOSAssessmentType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NOSEquipment" type="{urn:aseXML:r38}EquipmentBaseType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r38" default="r38" /&amp;gt;
 *       &amp;lt;attribute name="InfoType" use="required" type="{urn:aseXML:r38}NOSInfoType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOSInfoResponse", propOrder = {
    "booking",
    "outageStatus",
    "outageConstraint",
    "assessment",
    "nosEquipment"
})
public class NOSInfoResponse {

    @XmlElement(name = "Booking")
    protected List<BookingType> booking;
    @XmlElement(name = "OutageStatus")
    protected List<OutageStatusType> outageStatus;
    @XmlElement(name = "OutageConstraint")
    protected List<OutageConstraintType> outageConstraint;
    @XmlElement(name = "Assessment")
    protected List<NOSAssessmentType> assessment;
    @XmlElement(name = "NOSEquipment")
    protected List<EquipmentBaseType> nosEquipment;
    @XmlAttribute(name = "version")
    protected R38 version;
    @XmlAttribute(name = "InfoType", required = true)
    protected NOSInfoType infoType;

    /**
     * Gets the value of the booking property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the booking property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBooking().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link BookingType }
     * 
     * 
     */
    public List<BookingType> getBooking() {
        if (booking == null) {
            booking = new ArrayList<BookingType>();
        }
        return this.booking;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the outageStatus property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOutageStatus().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OutageStatusType }
     * 
     * 
     */
    public List<OutageStatusType> getOutageStatus() {
        if (outageStatus == null) {
            outageStatus = new ArrayList<OutageStatusType>();
        }
        return this.outageStatus;
    }

    /**
     * Gets the value of the outageConstraint property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the outageConstraint property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOutageConstraint().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OutageConstraintType }
     * 
     * 
     */
    public List<OutageConstraintType> getOutageConstraint() {
        if (outageConstraint == null) {
            outageConstraint = new ArrayList<OutageConstraintType>();
        }
        return this.outageConstraint;
    }

    /**
     * Gets the value of the assessment property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assessment property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAssessment().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NOSAssessmentType }
     * 
     * 
     */
    public List<NOSAssessmentType> getAssessment() {
        if (assessment == null) {
            assessment = new ArrayList<NOSAssessmentType>();
        }
        return this.assessment;
    }

    /**
     * Gets the value of the nosEquipment property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the nosEquipment property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNOSEquipment().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentBaseType }
     * 
     * 
     */
    public List<EquipmentBaseType> getNOSEquipment() {
        if (nosEquipment == null) {
            nosEquipment = new ArrayList<EquipmentBaseType>();
        }
        return this.nosEquipment;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R38 }
     *     
     */
    public R38 getVersion() {
        if (version == null) {
            return R38 .R_38;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R38 }
     *     
     */
    public void setVersion(R38 value) {
        this.version = value;
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link NOSInfoType }
     *     
     */
    public NOSInfoType getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOSInfoType }
     *     
     */
    public void setInfoType(NOSInfoType value) {
        this.infoType = value;
    }

}
