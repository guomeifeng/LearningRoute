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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the CATSNotificationRules table
 * MSATS Data Model Table - CATS_Notification_Rules
 * Replication Table Name - CATSNotificationRules
 * 			
 * 
 * &lt;p&gt;Java class for CATSNotificationRuleRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSNotificationRuleRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ChangeReasonCode" type="{urn:aseXML:r38}CATSChangeReasonCode"/&amp;gt;
 *         &amp;lt;element name="Role" type="{urn:aseXML:r38}RoleIdentifier"/&amp;gt;
 *         &amp;lt;element name="RoleStatus" type="{urn:aseXML:r38}CATSRoleStatus"/&amp;gt;
 *         &amp;lt;element name="ChangeStatusCode" type="{urn:aseXML:r38}CATSChangeStatusCode"/&amp;gt;
 *         &amp;lt;element name="TransactionTypeCode" type="{urn:aseXML:r38}CATSTransactionTypeCode"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSNotificationRuleRow", propOrder = {
    "changeReasonCode",
    "role",
    "roleStatus",
    "changeStatusCode",
    "transactionTypeCode"
})
public class CATSNotificationRuleRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "ChangeReasonCode", required = true)
    protected String changeReasonCode;
    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "RoleStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CATSRoleStatus roleStatus;
    @XmlElement(name = "ChangeStatusCode", required = true)
    protected String changeStatusCode;
    @XmlElement(name = "TransactionTypeCode", required = true)
    protected String transactionTypeCode;

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
     * Gets the value of the roleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CATSRoleStatus }
     *     
     */
    public CATSRoleStatus getRoleStatus() {
        return roleStatus;
    }

    /**
     * Sets the value of the roleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSRoleStatus }
     *     
     */
    public void setRoleStatus(CATSRoleStatus value) {
        this.roleStatus = value;
    }

    /**
     * Gets the value of the changeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStatusCode() {
        return changeStatusCode;
    }

    /**
     * Sets the value of the changeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStatusCode(String value) {
        this.changeStatusCode = value;
    }

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

}