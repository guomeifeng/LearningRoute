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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Base type for tables employing an effective date range
 * 			
 * 
 * &lt;p&gt;Java class for ReplicationDateRangeRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ReplicationDateRangeRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationBaseRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationDateRangeRow", propOrder = {
    "fromDate",
    "toDate"
})
@XmlSeeAlso({
    CATSChangeReasonCodeRow.class,
    CATSChangeStatusCodeRow.class,
    CATSDataSourceCodeRow.class,
    CATSDeregistrationCodeRow.class,
    DistributionLossFactorCodeRow.class,
    EmbeddedNetworkIdentifierRow.class,
    ErrorCodeRow.class,
    JurisdictionCodeRow.class,
    MeterInstallationTypeCodeRow.class,
    NMIClassificationCodeRow.class,
    NMIStatusCodeRow.class,
    CATSObjectionCodeRow.class,
    ProfileRow.class,
    CATSReadTypeCodeRow.class,
    CATSRetrospectivityCodeRow.class,
    RoleIdentifierRow.class,
    TransmissionNodeIdentifierRow.class,
    CATSTransactionTypeCodeRow.class,
    CATSNetworkTariffCodeRow.class,
    CATSStreamlinedCRCodeRow.class,
    CATSChangeInitiationRuleRow.class,
    NMIAccessRuleRow.class,
    NMISearchRuleRow.class,
    CATSJurisdictionalRuleRow.class,
    CATSNotificationRuleRow.class,
    CATSObjectionRuleRow.class,
    CATSStandingDataAccessRuleRow.class,
    ParticipantRow.class,
    ParticipantRolesRow.class,
    CATSTransactionFieldValidationRow.class,
    ElectricityNMIMasterRow.class,
    ElectricityNMIDataStreamRow.class,
    ElectricityNMIMeterRow.class,
    ElectricityNMIRoleRow.class,
    ElectricityNMIMeterRegisterRow.class,
    ElectricityNMIMasterRowBDT.class,
    ElectricityNMIDataStreamRowBDT.class,
    ElectricityNMIMeterRowBDT.class,
    ElectricityNMIRoleRowBDT.class,
    ElectricityNMIMeterRegisterRowBDT.class
})
public abstract class ReplicationDateRangeRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}