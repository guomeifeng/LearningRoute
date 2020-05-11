//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the Electricity CATS Change Request NMI Meter Register Configuration  table
 * MSATS Data Model Table - CATS_Inbound_REGISTER_IDENTIFIER
 * Replication Table Name - ElectricityCATSChangeRequestNMIMeterRegisters
 * 			
 * 
 * &lt;p&gt;Java class for ElectricityCATSChangeRequestNMIMeterRegisterRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityCATSChangeRequestNMIMeterRegisterRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationBaseRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestID" type="{urn:aseXML:r38}CATSRequestIdentifier"/&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}ElectricityNMIMeterRegisterGroup"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityCATSChangeRequestNMIMeterRegisterRow", propOrder = {
    "requestID",
    "serialNumber",
    "registerID",
    "networkTariffCode",
    "networkAdditionalInformation",
    "unitOfMeasure",
    "timeOfDay",
    "multiplier",
    "dialFormat",
    "suffix",
    "controlledLoad",
    "consumptionType",
    "demand1",
    "demand2",
    "status"
})
public class ElectricityCATSChangeRequestNMIMeterRegisterRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected long requestID;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "RegisterID", required = true)
    protected String registerID;
    @XmlElementRef(name = "NetworkTariffCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkTariffCode;
    @XmlElementRef(name = "NetworkAdditionalInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkAdditionalInformation;
    @XmlElementRef(name = "UnitOfMeasure", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasure;
    @XmlElementRef(name = "TimeOfDay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeOfDay;
    @XmlElementRef(name = "Multiplier", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> multiplier;
    @XmlElementRef(name = "DialFormat", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dialFormat;
    @XmlElementRef(name = "Suffix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "ControlledLoad", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlledLoad;
    @XmlElementRef(name = "ConsumptionType", type = JAXBElement.class, required = false)
    protected JAXBElement<MeterConsumptionType> consumptionType;
    @XmlElementRef(name = "Demand1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> demand1;
    @XmlElementRef(name = "Demand2", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> demand2;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<MeterRegisterStatusCode> status;
    @XmlAttribute(name = "version")
    protected R29 version;

    /**
     * Gets the value of the requestID property.
     * 
     */
    public long getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     */
    public void setRequestID(long value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the registerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterID() {
        return registerID;
    }

    /**
     * Sets the value of the registerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterID(String value) {
        this.registerID = value;
    }

    /**
     * Gets the value of the networkTariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkTariffCode() {
        return networkTariffCode;
    }

    /**
     * Sets the value of the networkTariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkTariffCode(JAXBElement<String> value) {
        this.networkTariffCode = value;
    }

    /**
     * Gets the value of the networkAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkAdditionalInformation() {
        return networkAdditionalInformation;
    }

    /**
     * Sets the value of the networkAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkAdditionalInformation(JAXBElement<String> value) {
        this.networkAdditionalInformation = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasure(JAXBElement<String> value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the timeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Sets the value of the timeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeOfDay(JAXBElement<String> value) {
        this.timeOfDay = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMultiplier(JAXBElement<BigDecimal> value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the dialFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDialFormat() {
        return dialFormat;
    }

    /**
     * Sets the value of the dialFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDialFormat(JAXBElement<BigDecimal> value) {
        this.dialFormat = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the controlledLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControlledLoad() {
        return controlledLoad;
    }

    /**
     * Sets the value of the controlledLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControlledLoad(JAXBElement<String> value) {
        this.controlledLoad = value;
    }

    /**
     * Gets the value of the consumptionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeterConsumptionType }{@code >}
     *     
     */
    public JAXBElement<MeterConsumptionType> getConsumptionType() {
        return consumptionType;
    }

    /**
     * Sets the value of the consumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeterConsumptionType }{@code >}
     *     
     */
    public void setConsumptionType(JAXBElement<MeterConsumptionType> value) {
        this.consumptionType = value;
    }

    /**
     * Gets the value of the demand1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDemand1() {
        return demand1;
    }

    /**
     * Sets the value of the demand1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDemand1(JAXBElement<BigInteger> value) {
        this.demand1 = value;
    }

    /**
     * Gets the value of the demand2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDemand2() {
        return demand2;
    }

    /**
     * Sets the value of the demand2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDemand2(JAXBElement<BigInteger> value) {
        this.demand2 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeterRegisterStatusCode }{@code >}
     *     
     */
    public JAXBElement<MeterRegisterStatusCode> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeterRegisterStatusCode }{@code >}
     *     
     */
    public void setStatus(JAXBElement<MeterRegisterStatusCode> value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R29 }
     *     
     */
    public R29 getVersion() {
        if (version == null) {
            return R29 .R_29;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R29 }
     *     
     */
    public void setVersion(R29 value) {
        this.version = value;
    }

}
