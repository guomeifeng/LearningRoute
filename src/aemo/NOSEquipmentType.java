//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for a station resident equipment. NOTE: for all NOSEquipmentType descendants CompanyElementName must be unqiue for the company/station(s)/equipmentType
 * 
 * &lt;p&gt;Java class for NOSEquipmentType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NOSEquipmentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}EquipmentBaseType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="StationFromCompanyElementId" type="{urn:aseXML:r38}CompanyElementIdType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Voltage" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{urn:aseXML:r38}NOSVoltage"&amp;gt;
 *               &amp;lt;minInclusive value="1.0"/&amp;gt;
 *               &amp;lt;maxInclusive value="600.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Designation" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *               &amp;lt;maxLength value="8"/&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOSEquipmentType", propOrder = {
    "stationFromCompanyElementId",
    "voltage",
    "designation"
})
@XmlSeeAlso({
    NOSBrakingResistorType.class,
    NOSBusType.class,
    NOSCapacitorType.class,
    NOSCircuitBreakerType.class,
    NOSIsolatorType.class,
    NOSLoadType.class,
    NOSReactorType.class,
    NOSStaticVarCompensatorType.class,
    NOSSynchronousCondenserType.class,
    NOSUnitType.class,
    NOSLineType.class,
    NOSTwoWindingTransformerType.class
})
public class NOSEquipmentType
    extends EquipmentBaseType
{

    @XmlElement(name = "StationFromCompanyElementId")
    protected String stationFromCompanyElementId;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Designation")
    protected String designation;

    /**
     * Gets the value of the stationFromCompanyElementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationFromCompanyElementId() {
        return stationFromCompanyElementId;
    }

    /**
     * Sets the value of the stationFromCompanyElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationFromCompanyElementId(String value) {
        this.stationFromCompanyElementId = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

}