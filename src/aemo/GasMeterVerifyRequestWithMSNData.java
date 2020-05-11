//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema - MeterDataManagement This type has MeterSerialNumber as a mandatory element
 * 
 * &lt;p&gt;Java class for GasMeterVerifyRequestWithMSNData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasMeterVerifyRequestWithMSNData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}NMITransactionBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InitiatorReferenceNumber" type="{urn:aseXML:r38}UniqueIdentifier"/&amp;gt;
 *         &amp;lt;element name="CurrentRead" type="{urn:aseXML:r38}GasMeterReadData"/&amp;gt;
 *         &amp;lt;element name="ProposedRead" type="{urn:aseXML:r38}GasMeterReadData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvestigationCode" type="{urn:aseXML:r38}IndexInvestigationCode"/&amp;gt;
 *         &amp;lt;element name="InvestigationDescription" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="MeterSerialNumber" type="{urn:aseXML:r38}MeterSerialNumber"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r34" default="r34" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasMeterVerifyRequestWithMSNData", propOrder = {
    "initiatorReferenceNumber",
    "currentRead",
    "proposedRead",
    "investigationCode",
    "investigationDescription",
    "meterSerialNumber"
})
public class GasMeterVerifyRequestWithMSNData
    extends NMITransactionBase
{

    @XmlElement(name = "InitiatorReferenceNumber", required = true)
    protected String initiatorReferenceNumber;
    @XmlElement(name = "CurrentRead", required = true)
    protected GasMeterReadData currentRead;
    @XmlElement(name = "ProposedRead")
    protected GasMeterReadData proposedRead;
    @XmlElement(name = "InvestigationCode", required = true)
    @XmlSchemaType(name = "string")
    protected IndexInvestigationCode investigationCode;
    @XmlElement(name = "InvestigationDescription")
    protected String investigationDescription;
    @XmlElement(name = "MeterSerialNumber", required = true)
    protected String meterSerialNumber;
    @XmlAttribute(name = "version")
    protected R34 version;

    /**
     * Gets the value of the initiatorReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorReferenceNumber() {
        return initiatorReferenceNumber;
    }

    /**
     * Sets the value of the initiatorReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorReferenceNumber(String value) {
        this.initiatorReferenceNumber = value;
    }

    /**
     * Gets the value of the currentRead property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterReadData }
     *     
     */
    public GasMeterReadData getCurrentRead() {
        return currentRead;
    }

    /**
     * Sets the value of the currentRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterReadData }
     *     
     */
    public void setCurrentRead(GasMeterReadData value) {
        this.currentRead = value;
    }

    /**
     * Gets the value of the proposedRead property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterReadData }
     *     
     */
    public GasMeterReadData getProposedRead() {
        return proposedRead;
    }

    /**
     * Sets the value of the proposedRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterReadData }
     *     
     */
    public void setProposedRead(GasMeterReadData value) {
        this.proposedRead = value;
    }

    /**
     * Gets the value of the investigationCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndexInvestigationCode }
     *     
     */
    public IndexInvestigationCode getInvestigationCode() {
        return investigationCode;
    }

    /**
     * Sets the value of the investigationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexInvestigationCode }
     *     
     */
    public void setInvestigationCode(IndexInvestigationCode value) {
        this.investigationCode = value;
    }

    /**
     * Gets the value of the investigationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestigationDescription() {
        return investigationDescription;
    }

    /**
     * Sets the value of the investigationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestigationDescription(String value) {
        this.investigationDescription = value;
    }

    /**
     * Gets the value of the meterSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    /**
     * Sets the value of the meterSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterSerialNumber(String value) {
        this.meterSerialNumber = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R34 }
     *     
     */
    public R34 getVersion() {
        if (version == null) {
            return R34 .R_34;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R34 }
     *     
     */
    public void setVersion(R34 value) {
        this.version = value;
    }

}