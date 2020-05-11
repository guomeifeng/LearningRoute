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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema - ServiceOrder
 * 
 * &lt;p&gt;Java class for ServiceOrderRequestData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceOrderRequestData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SpecialInstructions" type="{urn:aseXML:r38}SpecialComments" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMIStandingData" type="{urn:aseXML:r38}NMIStandingData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOrderRequestData", propOrder = {
    "specialInstructions",
    "nmiStandingData"
})
@XmlSeeAlso({
    ElectricityServiceOrderDetails.class,
    GasServiceOrderDetails.class
})
public abstract class ServiceOrderRequestData {

    @XmlElement(name = "SpecialInstructions")
    protected SpecialComments specialInstructions;
    @XmlElement(name = "NMIStandingData")
    protected NMIStandingData nmiStandingData;

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialComments }
     *     
     */
    public SpecialComments getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialComments }
     *     
     */
    public void setSpecialInstructions(SpecialComments value) {
        this.specialInstructions = value;
    }

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

}