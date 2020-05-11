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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Definition for ERFTRevisedEstimationResultsData
 * Details - Results of Estimation and Reconciliation to User (Sent as a Notification Transaction)
 * 			
 * 
 * &lt;p&gt;Java class for EstimationResultsDataType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EstimationResultsDataType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TotalEstimatedWithdrawal" type="{urn:aseXML:r38}QuantityOfGasMJ"/&amp;gt;
 *         &amp;lt;element name="TotalApportionmentPercentage" type="{urn:aseXML:r38}ApportionmentPercentage" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReconciliationAdjustmentAmount" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReconciliationAccountBalance" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TotalDailyWithdrawal" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AllocationOfNetSectionLoad" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TotalDistributedWithdrawal" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="networkID" use="required" type="{urn:aseXML:r38}NetworkID" /&amp;gt;
 *       &amp;lt;attribute name="participantID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimationResultsDataType", propOrder = {
    "totalEstimatedWithdrawal",
    "totalApportionmentPercentage",
    "reconciliationAdjustmentAmount",
    "reconciliationAccountBalance",
    "totalDailyWithdrawal",
    "allocationOfNetSectionLoad",
    "totalDistributedWithdrawal"
})
public class EstimationResultsDataType {

    @XmlElement(name = "TotalEstimatedWithdrawal")
    @XmlSchemaType(name = "integer")
    protected long totalEstimatedWithdrawal;
    @XmlElement(name = "TotalApportionmentPercentage")
    protected BigDecimal totalApportionmentPercentage;
    @XmlElement(name = "ReconciliationAdjustmentAmount")
    @XmlSchemaType(name = "integer")
    protected Long reconciliationAdjustmentAmount;
    @XmlElement(name = "ReconciliationAccountBalance")
    @XmlSchemaType(name = "integer")
    protected Long reconciliationAccountBalance;
    @XmlElement(name = "TotalDailyWithdrawal")
    @XmlSchemaType(name = "integer")
    protected Long totalDailyWithdrawal;
    @XmlElement(name = "AllocationOfNetSectionLoad")
    @XmlSchemaType(name = "integer")
    protected Long allocationOfNetSectionLoad;
    @XmlElement(name = "TotalDistributedWithdrawal")
    @XmlSchemaType(name = "integer")
    protected Long totalDistributedWithdrawal;
    @XmlAttribute(name = "gasDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gasDate;
    @XmlAttribute(name = "networkID", required = true)
    protected String networkID;
    @XmlAttribute(name = "participantID", required = true)
    protected String participantID;

    /**
     * Gets the value of the totalEstimatedWithdrawal property.
     * 
     */
    public long getTotalEstimatedWithdrawal() {
        return totalEstimatedWithdrawal;
    }

    /**
     * Sets the value of the totalEstimatedWithdrawal property.
     * 
     */
    public void setTotalEstimatedWithdrawal(long value) {
        this.totalEstimatedWithdrawal = value;
    }

    /**
     * Gets the value of the totalApportionmentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalApportionmentPercentage() {
        return totalApportionmentPercentage;
    }

    /**
     * Sets the value of the totalApportionmentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalApportionmentPercentage(BigDecimal value) {
        this.totalApportionmentPercentage = value;
    }

    /**
     * Gets the value of the reconciliationAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciliationAdjustmentAmount() {
        return reconciliationAdjustmentAmount;
    }

    /**
     * Sets the value of the reconciliationAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciliationAdjustmentAmount(Long value) {
        this.reconciliationAdjustmentAmount = value;
    }

    /**
     * Gets the value of the reconciliationAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciliationAccountBalance() {
        return reconciliationAccountBalance;
    }

    /**
     * Sets the value of the reconciliationAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciliationAccountBalance(Long value) {
        this.reconciliationAccountBalance = value;
    }

    /**
     * Gets the value of the totalDailyWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalDailyWithdrawal() {
        return totalDailyWithdrawal;
    }

    /**
     * Sets the value of the totalDailyWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalDailyWithdrawal(Long value) {
        this.totalDailyWithdrawal = value;
    }

    /**
     * Gets the value of the allocationOfNetSectionLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllocationOfNetSectionLoad() {
        return allocationOfNetSectionLoad;
    }

    /**
     * Sets the value of the allocationOfNetSectionLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllocationOfNetSectionLoad(Long value) {
        this.allocationOfNetSectionLoad = value;
    }

    /**
     * Gets the value of the totalDistributedWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalDistributedWithdrawal() {
        return totalDistributedWithdrawal;
    }

    /**
     * Sets the value of the totalDistributedWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalDistributedWithdrawal(Long value) {
        this.totalDistributedWithdrawal = value;
    }

    /**
     * Gets the value of the gasDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGasDate() {
        return gasDate;
    }

    /**
     * Sets the value of the gasDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGasDate(XMLGregorianCalendar value) {
        this.gasDate = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the participantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantID(String value) {
        this.participantID = value;
    }

}
