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
 * Purpose - used in MeterDataVerifyRequest transaction based on NMITransactionBase 
 * 
 * &lt;p&gt;Java class for ElectricityVerifyMeterRequestData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityVerifyMeterRequestData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}NMITransactionBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NMIStandingData" type="{urn:aseXML:r38}NMIStandingData"/&amp;gt;
 *         &amp;lt;element name="InvestigationCode" type="{urn:aseXML:r38}ElecIndexInvestigationCode"/&amp;gt;
 *         &amp;lt;element name="InvestigationDescription" type="{urn:aseXML:r38}SpecialComments"/&amp;gt;
 *         &amp;lt;element name="RequestPeriod" type="{urn:aseXML:r38}OpenPeriod"/&amp;gt;
 *         &amp;lt;element name="Current" type="{urn:aseXML:r38}ElectricityMeterReadData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMIConfiguration" type="{urn:aseXML:r38}NMIConfigurationType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r36" default="r36" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityVerifyMeterRequestData", propOrder = {
    "nmiStandingData",
    "investigationCode",
    "investigationDescription",
    "requestPeriod",
    "current",
    "nmiConfiguration"
})
public class ElectricityVerifyMeterRequestData
    extends NMITransactionBase
{

    @XmlElement(name = "NMIStandingData", required = true)
    protected NMIStandingData nmiStandingData;
    @XmlElement(name = "InvestigationCode", required = true)
    @XmlSchemaType(name = "string")
    protected ElecIndexInvestigationCode investigationCode;
    @XmlElement(name = "InvestigationDescription", required = true)
    protected SpecialComments investigationDescription;
    @XmlElement(name = "RequestPeriod", required = true)
    protected OpenPeriod requestPeriod;
    @XmlElement(name = "Current")
    protected ElectricityMeterReadData current;
    @XmlElement(name = "NMIConfiguration")
    protected NMIConfigurationType nmiConfiguration;
    @XmlAttribute(name = "version")
    protected R36 version;

    /**
     * Gets the value of the nmiStandingData property.
     * 
     * @return
     *     possible object is
     *     {@link NMIStandingData }
     *     
     */
    public NMIStandingData getNMIStandingData() {
        return nmiStandingData;
    }

    /**
     * Sets the value of the nmiStandingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIStandingData }
     *     
     */
    public void setNMIStandingData(NMIStandingData value) {
        this.nmiStandingData = value;
    }

    /**
     * Gets the value of the investigationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElecIndexInvestigationCode }
     *     
     */
    public ElecIndexInvestigationCode getInvestigationCode() {
        return investigationCode;
    }

    /**
     * Sets the value of the investigationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecIndexInvestigationCode }
     *     
     */
    public void setInvestigationCode(ElecIndexInvestigationCode value) {
        this.investigationCode = value;
    }

    /**
     * Gets the value of the investigationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialComments }
     *     
     */
    public SpecialComments getInvestigationDescription() {
        return investigationDescription;
    }

    /**
     * Sets the value of the investigationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialComments }
     *     
     */
    public void setInvestigationDescription(SpecialComments value) {
        this.investigationDescription = value;
    }

    /**
     * Gets the value of the requestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OpenPeriod }
     *     
     */
    public OpenPeriod getRequestPeriod() {
        return requestPeriod;
    }

    /**
     * Sets the value of the requestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenPeriod }
     *     
     */
    public void setRequestPeriod(OpenPeriod value) {
        this.requestPeriod = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityMeterReadData }
     *     
     */
    public ElectricityMeterReadData getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityMeterReadData }
     *     
     */
    public void setCurrent(ElectricityMeterReadData value) {
        this.current = value;
    }

    /**
     * Gets the value of the nmiConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link NMIConfigurationType }
     *     
     */
    public NMIConfigurationType getNMIConfiguration() {
        return nmiConfiguration;
    }

    /**
     * Sets the value of the nmiConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIConfigurationType }
     *     
     */
    public void setNMIConfiguration(NMIConfigurationType value) {
        this.nmiConfiguration = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R36 }
     *     
     */
    public R36 getVersion() {
        if (version == null) {
            return R36 .R_36;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R36 }
     *     
     */
    public void setVersion(R36 value) {
        this.version = value;
    }

}