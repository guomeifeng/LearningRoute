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


/**
 * &lt;p&gt;Java class for ReconciliationNotification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ReconciliationNotification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="ReconciliationAmount" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="EstimatedTotalWithdrawal" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="HeatingDegreeDay" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="TotalAmount" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="HistoricalAmount" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="NetSystemLoad" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="DeemedWithdrawal" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="DeemedInjection" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *         &amp;lt;element name="GatePointApportionment" type="{urn:aseXML:r38}QuantityNotification"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r31" default="r31" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationNotification", propOrder = {
    "reconciliationAmount",
    "estimatedTotalWithdrawal",
    "heatingDegreeDay",
    "totalAmount",
    "historicalAmount",
    "netSystemLoad",
    "deemedWithdrawal",
    "deemedInjection",
    "gatePointApportionment"
})
public class ReconciliationNotification {

    @XmlElement(name = "ReconciliationAmount")
    protected QuantityNotification reconciliationAmount;
    @XmlElement(name = "EstimatedTotalWithdrawal")
    protected QuantityNotification estimatedTotalWithdrawal;
    @XmlElement(name = "HeatingDegreeDay")
    protected QuantityNotification heatingDegreeDay;
    @XmlElement(name = "TotalAmount")
    protected QuantityNotification totalAmount;
    @XmlElement(name = "HistoricalAmount")
    protected QuantityNotification historicalAmount;
    @XmlElement(name = "NetSystemLoad")
    protected QuantityNotification netSystemLoad;
    @XmlElement(name = "DeemedWithdrawal")
    protected QuantityNotification deemedWithdrawal;
    @XmlElement(name = "DeemedInjection")
    protected QuantityNotification deemedInjection;
    @XmlElement(name = "GatePointApportionment")
    protected QuantityNotification gatePointApportionment;
    @XmlAttribute(name = "version")
    protected R31 version;

    /**
     * Gets the value of the reconciliationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getReconciliationAmount() {
        return reconciliationAmount;
    }

    /**
     * Sets the value of the reconciliationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setReconciliationAmount(QuantityNotification value) {
        this.reconciliationAmount = value;
    }

    /**
     * Gets the value of the estimatedTotalWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getEstimatedTotalWithdrawal() {
        return estimatedTotalWithdrawal;
    }

    /**
     * Sets the value of the estimatedTotalWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setEstimatedTotalWithdrawal(QuantityNotification value) {
        this.estimatedTotalWithdrawal = value;
    }

    /**
     * Gets the value of the heatingDegreeDay property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getHeatingDegreeDay() {
        return heatingDegreeDay;
    }

    /**
     * Sets the value of the heatingDegreeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setHeatingDegreeDay(QuantityNotification value) {
        this.heatingDegreeDay = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setTotalAmount(QuantityNotification value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the historicalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getHistoricalAmount() {
        return historicalAmount;
    }

    /**
     * Sets the value of the historicalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setHistoricalAmount(QuantityNotification value) {
        this.historicalAmount = value;
    }

    /**
     * Gets the value of the netSystemLoad property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getNetSystemLoad() {
        return netSystemLoad;
    }

    /**
     * Sets the value of the netSystemLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setNetSystemLoad(QuantityNotification value) {
        this.netSystemLoad = value;
    }

    /**
     * Gets the value of the deemedWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getDeemedWithdrawal() {
        return deemedWithdrawal;
    }

    /**
     * Sets the value of the deemedWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setDeemedWithdrawal(QuantityNotification value) {
        this.deemedWithdrawal = value;
    }

    /**
     * Gets the value of the deemedInjection property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getDeemedInjection() {
        return deemedInjection;
    }

    /**
     * Sets the value of the deemedInjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setDeemedInjection(QuantityNotification value) {
        this.deemedInjection = value;
    }

    /**
     * Gets the value of the gatePointApportionment property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNotification }
     *     
     */
    public QuantityNotification getGatePointApportionment() {
        return gatePointApportionment;
    }

    /**
     * Sets the value of the gatePointApportionment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNotification }
     *     
     */
    public void setGatePointApportionment(QuantityNotification value) {
        this.gatePointApportionment = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R31 }
     *     
     */
    public R31 getVersion() {
        if (version == null) {
            return R31 .R_31;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R31 }
     *     
     */
    public void setVersion(R31 value) {
        this.version = value;
    }

}
