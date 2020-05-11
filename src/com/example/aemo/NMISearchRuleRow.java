//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the NMISearchRules table
 * MSATS Data Model Table - CATS_Discovery_Search_Rules
 * Replication Table Name - NMISearchRules
 * 			
 * 
 * &lt;p&gt;Java class for NMISearchRuleRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NMISearchRuleRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="JurisdictionCode" type="{urn:aseXML:r38}JurisdictionCode"/&amp;gt;
 *         &amp;lt;element name="Role" type="{urn:aseXML:r38}RoleIdentifier"/&amp;gt;
 *         &amp;lt;element name="SearchOnDPID" type="{urn:aseXML:r38}YesNo"/&amp;gt;
 *         &amp;lt;element name="SearchOnAddress" type="{urn:aseXML:r38}YesNo"/&amp;gt;
 *         &amp;lt;element name="SearchOnMeterIdentifier" type="{urn:aseXML:r38}YesNo"/&amp;gt;
 *         &amp;lt;element name="NMIReturnCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMISearchRuleRow", propOrder = {
    "jurisdictionCode",
    "role",
    "searchOnDPID",
    "searchOnAddress",
    "searchOnMeterIdentifier",
    "nmiReturnCount"
})
public class NMISearchRuleRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "JurisdictionCode", required = true)
    protected String jurisdictionCode;
    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "SearchOnDPID", required = true)
    @XmlSchemaType(name = "string")
    protected YesNo searchOnDPID;
    @XmlElement(name = "SearchOnAddress", required = true)
    @XmlSchemaType(name = "string")
    protected YesNo searchOnAddress;
    @XmlElement(name = "SearchOnMeterIdentifier", required = true)
    @XmlSchemaType(name = "string")
    protected YesNo searchOnMeterIdentifier;
    @XmlElement(name = "NMIReturnCount", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nmiReturnCount;

    /**
     * Gets the value of the jurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionCode() {
        return jurisdictionCode;
    }

    /**
     * Sets the value of the jurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionCode(String value) {
        this.jurisdictionCode = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the searchOnDPID property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSearchOnDPID() {
        return searchOnDPID;
    }

    /**
     * Sets the value of the searchOnDPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSearchOnDPID(YesNo value) {
        this.searchOnDPID = value;
    }

    /**
     * Gets the value of the searchOnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSearchOnAddress() {
        return searchOnAddress;
    }

    /**
     * Sets the value of the searchOnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSearchOnAddress(YesNo value) {
        this.searchOnAddress = value;
    }

    /**
     * Gets the value of the searchOnMeterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSearchOnMeterIdentifier() {
        return searchOnMeterIdentifier;
    }

    /**
     * Sets the value of the searchOnMeterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSearchOnMeterIdentifier(YesNo value) {
        this.searchOnMeterIdentifier = value;
    }

    /**
     * Gets the value of the nmiReturnCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNMIReturnCount() {
        return nmiReturnCount;
    }

    /**
     * Sets the value of the nmiReturnCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNMIReturnCount(BigInteger value) {
        this.nmiReturnCount = value;
    }

}
