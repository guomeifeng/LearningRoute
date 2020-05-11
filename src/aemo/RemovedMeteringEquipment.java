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
 * Purpose - Define the structure of removed equipment.
 * 
 * &lt;p&gt;Java class for RemovedMeteringEquipment complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RemovedMeteringEquipment"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RemovedEquipmentType" type="{urn:aseXML:r38}MeterEquipmentType"/&amp;gt;
 *         &amp;lt;element name="MeteringEquipment" type="{urn:aseXML:r38}NMIStandingData"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovedMeteringEquipment", propOrder = {
    "removedEquipmentType",
    "meteringEquipment"
})
public class RemovedMeteringEquipment {

    @XmlElement(name = "RemovedEquipmentType", required = true)
    @XmlSchemaType(name = "string")
    protected MeterEquipmentType removedEquipmentType;
    @XmlElement(name = "MeteringEquipment", required = true)
    protected NMIStandingData meteringEquipment;

    /**
     * Gets the value of the removedEquipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link MeterEquipmentType }
     *     
     */
    public MeterEquipmentType getRemovedEquipmentType() {
        return removedEquipmentType;
    }

    /**
     * Sets the value of the removedEquipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterEquipmentType }
     *     
     */
    public void setRemovedEquipmentType(MeterEquipmentType value) {
        this.removedEquipmentType = value;
    }

    /**
     * Gets the value of the meteringEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link NMIStandingData }
     *     
     */
    public NMIStandingData getMeteringEquipment() {
        return meteringEquipment;
    }

    /**
     * Sets the value of the meteringEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIStandingData }
     *     
     */
    public void setMeteringEquipment(NMIStandingData value) {
        this.meteringEquipment = value;
    }

}