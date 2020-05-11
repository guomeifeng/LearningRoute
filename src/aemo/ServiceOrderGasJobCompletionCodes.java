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
import javax.xml.bind.annotation.XmlType;


/**
 * Schema - Gas
 * 
 * &lt;p&gt;Java class for ServiceOrderGasJobCompletionCodes complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceOrderGasJobCompletionCodes"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="JobCompletionCode1" type="{urn:aseXML:r38}GasJobCompletionCode1"/&amp;gt;
 *         &amp;lt;element name="JobCompletionCode2" type="{urn:aseXML:r38}GasJobCompletionCode2"/&amp;gt;
 *         &amp;lt;element name="JobCompletionCode3" type="{urn:aseXML:r38}GasJobCompletionCode3" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOrderGasJobCompletionCodes", propOrder = {
    "jobCompletionCode1",
    "jobCompletionCode2",
    "jobCompletionCode3"
})
public class ServiceOrderGasJobCompletionCodes {

    @XmlElement(name = "JobCompletionCode1", required = true)
    protected String jobCompletionCode1;
    @XmlElement(name = "JobCompletionCode2", required = true)
    protected String jobCompletionCode2;
    @XmlElement(name = "JobCompletionCode3")
    protected String jobCompletionCode3;

    /**
     * Gets the value of the jobCompletionCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCompletionCode1() {
        return jobCompletionCode1;
    }

    /**
     * Sets the value of the jobCompletionCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCompletionCode1(String value) {
        this.jobCompletionCode1 = value;
    }

    /**
     * Gets the value of the jobCompletionCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCompletionCode2() {
        return jobCompletionCode2;
    }

    /**
     * Sets the value of the jobCompletionCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCompletionCode2(String value) {
        this.jobCompletionCode2 = value;
    }

    /**
     * Gets the value of the jobCompletionCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCompletionCode3() {
        return jobCompletionCode3;
    }

    /**
     * Sets the value of the jobCompletionCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCompletionCode3(String value) {
        this.jobCompletionCode3 = value;
    }

}