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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Read data for NSW/ACT Hotwater NMI.
 * 
 * &lt;p&gt;Java class for HWMultiMeterReadDataType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HWMultiMeterReadDataType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseMultiMeterReadDataType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CommonFactor" type="{urn:aseXML:r38}CommonFactorType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConsumptionLitres" type="{urn:aseXML:r38}ConsumptionLitresType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWMultiMeterReadDataType", propOrder = {
    "commonFactor",
    "consumptionLitres"
})
public class HWMultiMeterReadDataType
    extends BaseMultiMeterReadDataType
{

    @XmlElement(name = "CommonFactor")
    protected BigDecimal commonFactor;
    @XmlElement(name = "ConsumptionLitres")
    protected BigDecimal consumptionLitres;

    /**
     * Gets the value of the commonFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommonFactor() {
        return commonFactor;
    }

    /**
     * Sets the value of the commonFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommonFactor(BigDecimal value) {
        this.commonFactor = value;
    }

    /**
     * Gets the value of the consumptionLitres property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionLitres() {
        return consumptionLitres;
    }

    /**
     * Sets the value of the consumptionLitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionLitres(BigDecimal value) {
        this.consumptionLitres = value;
    }

}
