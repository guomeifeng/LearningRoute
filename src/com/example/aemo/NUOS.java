//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Network charge record type - "100" - NUOS
 * 
 * &lt;p&gt;Java class for NUOS complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NUOS"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseChargeItem"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Description" type="{urn:aseXML:r38}LineDescription"/&amp;gt;
 *         &amp;lt;element name="Quantity" type="{urn:aseXML:r38}ConsumptionVolume"/&amp;gt;
 *         &amp;lt;element name="Rate" type="{urn:aseXML:r38}Rate"/&amp;gt;
 *         &amp;lt;element name="TariffCode" type="{urn:aseXML:r38}NetworkTariffCode"/&amp;gt;
 *         &amp;lt;element name="UnitOfMeasure" type="{urn:aseXML:r38}UnitsOfMeasure"/&amp;gt;
 *         &amp;lt;element name="StepNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *               &amp;lt;totalDigits value="3"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="BillingPeriod" type="{urn:aseXML:r38}Period"/&amp;gt;
 *         &amp;lt;element name="TimeSplit" type="{urn:aseXML:r38}TimeSplit"/&amp;gt;
 *         &amp;lt;element name="ReadingType" type="{urn:aseXML:r38}ReadingType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r11" default="r11" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NUOS", propOrder = {
    "description",
    "quantity",
    "rate",
    "tariffCode",
    "unitOfMeasure",
    "stepNumber",
    "billingPeriod",
    "timeSplit",
    "readingType"
})
public class NUOS
    extends BaseChargeItem
{

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "TariffCode", required = true)
    protected String tariffCode;
    @XmlElement(name = "UnitOfMeasure", required = true)
    @XmlSchemaType(name = "string")
    protected UnitsOfMeasure unitOfMeasure;
    @XmlElement(name = "StepNumber", defaultValue = "1")
    protected Integer stepNumber;
    @XmlElement(name = "BillingPeriod", required = true)
    protected Period billingPeriod;
    @XmlElement(name = "TimeSplit", required = true)
    protected String timeSplit;
    @XmlElement(name = "ReadingType")
    @XmlSchemaType(name = "string")
    protected ReadingType readingType;
    @XmlAttribute(name = "version")
    protected R11 version;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOfMeasure }
     *     
     */
    public UnitsOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitsOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the stepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStepNumber(Integer value) {
        this.stepNumber = value;
    }

    /**
     * Gets the value of the billingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * Sets the value of the billingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBillingPeriod(Period value) {
        this.billingPeriod = value;
    }

    /**
     * Gets the value of the timeSplit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSplit() {
        return timeSplit;
    }

    /**
     * Sets the value of the timeSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSplit(String value) {
        this.timeSplit = value;
    }

    /**
     * Gets the value of the readingType property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingType }
     *     
     */
    public ReadingType getReadingType() {
        return readingType;
    }

    /**
     * Sets the value of the readingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingType }
     *     
     */
    public void setReadingType(ReadingType value) {
        this.readingType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R11 }
     *     
     */
    public R11 getVersion() {
        if (version == null) {
            return R11 .R_11;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R11 }
     *     
     */
    public void setVersion(R11 value) {
        this.version = value;
    }

}
