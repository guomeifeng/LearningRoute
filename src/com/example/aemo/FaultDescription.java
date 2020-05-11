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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the fault and associated information
 * 
 * &lt;p&gt;Java class for FaultDescription complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FaultDescription"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FaultLocation" type="{urn:aseXML:r38}FaultLocation"/&amp;gt;
 *         &amp;lt;element name="Symptoms" type="{urn:aseXML:r38}FaultSymptoms"/&amp;gt;
 *         &amp;lt;element name="SensitiveLoad" type="{urn:aseXML:r38}SensitiveLoad"/&amp;gt;
 *         &amp;lt;element name="LifeSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="PublicLightingGSL" type="{urn:aseXML:r38}PublicLightingGSL" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FaultDescriptionComments" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Line" type="{urn:aseXML:r38}CommentLine" maxOccurs="10"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultDescription", propOrder = {
    "faultLocation",
    "symptoms",
    "sensitiveLoad",
    "lifeSupport",
    "publicLightingGSL",
    "faultDescriptionComments"
})
public class FaultDescription {

    @XmlElement(name = "FaultLocation", required = true)
    protected FaultLocation faultLocation;
    @XmlElement(name = "Symptoms", required = true)
    protected FaultSymptoms symptoms;
    @XmlElement(name = "SensitiveLoad", required = true)
    protected SensitiveLoad sensitiveLoad;
    @XmlElement(name = "LifeSupport")
    protected boolean lifeSupport;
    @XmlElement(name = "PublicLightingGSL")
    protected PublicLightingGSL publicLightingGSL;
    @XmlElement(name = "FaultDescriptionComments")
    protected FaultDescription.FaultDescriptionComments faultDescriptionComments;

    /**
     * Gets the value of the faultLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FaultLocation }
     *     
     */
    public FaultLocation getFaultLocation() {
        return faultLocation;
    }

    /**
     * Sets the value of the faultLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultLocation }
     *     
     */
    public void setFaultLocation(FaultLocation value) {
        this.faultLocation = value;
    }

    /**
     * Gets the value of the symptoms property.
     * 
     * @return
     *     possible object is
     *     {@link FaultSymptoms }
     *     
     */
    public FaultSymptoms getSymptoms() {
        return symptoms;
    }

    /**
     * Sets the value of the symptoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultSymptoms }
     *     
     */
    public void setSymptoms(FaultSymptoms value) {
        this.symptoms = value;
    }

    /**
     * Gets the value of the sensitiveLoad property.
     * 
     * @return
     *     possible object is
     *     {@link SensitiveLoad }
     *     
     */
    public SensitiveLoad getSensitiveLoad() {
        return sensitiveLoad;
    }

    /**
     * Sets the value of the sensitiveLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitiveLoad }
     *     
     */
    public void setSensitiveLoad(SensitiveLoad value) {
        this.sensitiveLoad = value;
    }

    /**
     * Gets the value of the lifeSupport property.
     * 
     */
    public boolean isLifeSupport() {
        return lifeSupport;
    }

    /**
     * Sets the value of the lifeSupport property.
     * 
     */
    public void setLifeSupport(boolean value) {
        this.lifeSupport = value;
    }

    /**
     * Gets the value of the publicLightingGSL property.
     * 
     * @return
     *     possible object is
     *     {@link PublicLightingGSL }
     *     
     */
    public PublicLightingGSL getPublicLightingGSL() {
        return publicLightingGSL;
    }

    /**
     * Sets the value of the publicLightingGSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicLightingGSL }
     *     
     */
    public void setPublicLightingGSL(PublicLightingGSL value) {
        this.publicLightingGSL = value;
    }

    /**
     * Gets the value of the faultDescriptionComments property.
     * 
     * @return
     *     possible object is
     *     {@link FaultDescription.FaultDescriptionComments }
     *     
     */
    public FaultDescription.FaultDescriptionComments getFaultDescriptionComments() {
        return faultDescriptionComments;
    }

    /**
     * Sets the value of the faultDescriptionComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultDescription.FaultDescriptionComments }
     *     
     */
    public void setFaultDescriptionComments(FaultDescription.FaultDescriptionComments value) {
        this.faultDescriptionComments = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Line" type="{urn:aseXML:r38}CommentLine" maxOccurs="10"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "line"
    })
    public static class FaultDescriptionComments {

        @XmlElement(name = "Line", required = true)
        protected List<String> line;

        /**
         * Gets the value of the line property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the line property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLine().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLine() {
            if (line == null) {
                line = new ArrayList<String>();
            }
            return this.line;
        }

    }

}
