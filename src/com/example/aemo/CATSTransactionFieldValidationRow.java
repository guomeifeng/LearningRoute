//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the CATSTransactionFieldValidations table
 * MSATS Data Model Table - CATS_Trans_Field_Validation
 * Replication Table Name - CATSTransactionFieldValidations
 * 			
 * 
 * &lt;p&gt;Java class for CATSTransactionFieldValidationRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSTransactionFieldValidationRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TransactionTypeCode" type="{urn:aseXML:r38}CATSTransactionTypeCode"/&amp;gt;
 *         &amp;lt;element name="ChangeReasonCode" type="{urn:aseXML:r38}CATSChangeReasonCode"/&amp;gt;
 *         &amp;lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Table" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="DataSourceCode" type="{urn:aseXML:r38}CATSDataSourceCode"/&amp;gt;
 *         &amp;lt;element name="ProvideRole" type="{urn:aseXML:r38}RoleIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MustComplete" type="{urn:aseXML:r38}YesNo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RoleStatusNeeded" type="{urn:aseXML:r38}YesNo" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r19" default="r19" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSTransactionFieldValidationRow", propOrder = {
    "transactionTypeCode",
    "changeReasonCode",
    "field",
    "table",
    "dataSourceCode",
    "provideRole",
    "mustComplete",
    "roleStatusNeeded"
})
public class CATSTransactionFieldValidationRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "TransactionTypeCode", required = true)
    protected String transactionTypeCode;
    @XmlElement(name = "ChangeReasonCode", required = true)
    protected String changeReasonCode;
    @XmlElement(name = "Field", required = true)
    protected String field;
    @XmlElement(name = "Table", required = true)
    protected String table;
    @XmlElement(name = "DataSourceCode", required = true)
    protected String dataSourceCode;
    @XmlElementRef(name = "ProvideRole", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provideRole;
    @XmlElementRef(name = "MustComplete", type = JAXBElement.class, required = false)
    protected JAXBElement<YesNo> mustComplete;
    @XmlElementRef(name = "RoleStatusNeeded", type = JAXBElement.class, required = false)
    protected JAXBElement<YesNo> roleStatusNeeded;
    @XmlAttribute(name = "version")
    protected R19 version;

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeCode(String value) {
        this.transactionTypeCode = value;
    }

    /**
     * Gets the value of the changeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReasonCode() {
        return changeReasonCode;
    }

    /**
     * Sets the value of the changeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReasonCode(String value) {
        this.changeReasonCode = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the dataSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * Sets the value of the dataSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceCode(String value) {
        this.dataSourceCode = value;
    }

    /**
     * Gets the value of the provideRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvideRole() {
        return provideRole;
    }

    /**
     * Sets the value of the provideRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvideRole(JAXBElement<String> value) {
        this.provideRole = value;
    }

    /**
     * Gets the value of the mustComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YesNo }{@code >}
     *     
     */
    public JAXBElement<YesNo> getMustComplete() {
        return mustComplete;
    }

    /**
     * Sets the value of the mustComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YesNo }{@code >}
     *     
     */
    public void setMustComplete(JAXBElement<YesNo> value) {
        this.mustComplete = value;
    }

    /**
     * Gets the value of the roleStatusNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YesNo }{@code >}
     *     
     */
    public JAXBElement<YesNo> getRoleStatusNeeded() {
        return roleStatusNeeded;
    }

    /**
     * Sets the value of the roleStatusNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YesNo }{@code >}
     *     
     */
    public void setRoleStatusNeeded(JAXBElement<YesNo> value) {
        this.roleStatusNeeded = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R19 }
     *     
     */
    public R19 getVersion() {
        if (version == null) {
            return R19 .R_19;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R19 }
     *     
     */
    public void setVersion(R19 value) {
        this.version = value;
    }

}
