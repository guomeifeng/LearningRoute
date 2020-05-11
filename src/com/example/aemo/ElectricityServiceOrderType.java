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
import javax.xml.bind.annotation.XmlValue;


/**
 * &lt;p&gt;Java class for ElectricityServiceOrderType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityServiceOrderType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ServiceOrderTypeBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="WorkType"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;simpleContent&amp;gt;
 *               &amp;lt;extension base="&amp;lt;urn:aseXML:r38&amp;gt;ServiceOrderType"&amp;gt;
 *                 &amp;lt;attribute name="workSubType" type="{urn:aseXML:r38}ServiceOrderSubType" /&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/simpleContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r36" default="r36" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityServiceOrderType", propOrder = {
    "workType"
})
public class ElectricityServiceOrderType
    extends ServiceOrderTypeBase
{

    @XmlElement(name = "WorkType", required = true)
    protected ElectricityServiceOrderType.WorkType workType;
    @XmlAttribute(name = "version")
    protected R36 version;

    /**
     * Gets the value of the workType property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityServiceOrderType.WorkType }
     *     
     */
    public ElectricityServiceOrderType.WorkType getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityServiceOrderType.WorkType }
     *     
     */
    public void setWorkType(ElectricityServiceOrderType.WorkType value) {
        this.workType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R36 }
     *     
     */
    public R36 getVersion() {
        if (version == null) {
            return R36 .R_36;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R36 }
     *     
     */
    public void setVersion(R36 value) {
        this.version = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;simpleContent&amp;gt;
     *     &amp;lt;extension base="&amp;lt;urn:aseXML:r38&amp;gt;ServiceOrderType"&amp;gt;
     *       &amp;lt;attribute name="workSubType" type="{urn:aseXML:r38}ServiceOrderSubType" /&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/simpleContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class WorkType {

        @XmlValue
        protected ServiceOrderType value;
        @XmlAttribute(name = "workSubType")
        protected ServiceOrderSubType workSubType;

        /**
         * Purpose - Defines a list of valid Service Order types supported by the particpants
         * 
         * @return
         *     possible object is
         *     {@link ServiceOrderType }
         *     
         */
        public ServiceOrderType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceOrderType }
         *     
         */
        public void setValue(ServiceOrderType value) {
            this.value = value;
        }

        /**
         * Gets the value of the workSubType property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceOrderSubType }
         *     
         */
        public ServiceOrderSubType getWorkSubType() {
            return workSubType;
        }

        /**
         * Sets the value of the workSubType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceOrderSubType }
         *     
         */
        public void setWorkSubType(ServiceOrderSubType value) {
            this.workSubType = value;
        }

    }

}
