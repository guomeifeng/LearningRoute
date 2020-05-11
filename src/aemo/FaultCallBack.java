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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Call back required to customer/informant
 * 
 * &lt;p&gt;Java class for FaultCallBack complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FaultCallBack"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ContactDetail"&amp;gt;
 *       &amp;lt;attribute name="callBackRequired" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="timeRequired" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultCallBack")
public class FaultCallBack
    extends ContactDetail
{

    @XmlAttribute(name = "callBackRequired", required = true)
    protected boolean callBackRequired;
    @XmlAttribute(name = "timeRequired")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRequired;

    /**
     * Gets the value of the callBackRequired property.
     * 
     */
    public boolean isCallBackRequired() {
        return callBackRequired;
    }

    /**
     * Sets the value of the callBackRequired property.
     * 
     */
    public void setCallBackRequired(boolean value) {
        this.callBackRequired = value;
    }

    /**
     * Gets the value of the timeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRequired() {
        return timeRequired;
    }

    /**
     * Sets the value of the timeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRequired(XMLGregorianCalendar value) {
        this.timeRequired = value;
    }

}