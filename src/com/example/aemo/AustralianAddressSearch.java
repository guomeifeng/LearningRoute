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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Define the structure to allow provision of search parameters for an address.
 * Detail - This definition is essentially the same as the structured part of Australian address except that either postcode or locality or both may be provided. This allows some flexibility in searching whilst constraining the subset of records to be considered.
 * 			
 * 
 * &lt;p&gt;Java class for AustralianAddressSearch complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AustralianAddressSearch"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="StructuredAddress" type="{urn:aseXML:r38}AustralianStructuredAddressComponents"/&amp;gt;
 *         &amp;lt;element name="SuburbOrPlaceOrLocality" type="{urn:aseXML:r38}AustralianSuburbOrPlaceOrLocality" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateOrTerritory" type="{urn:aseXML:r38}AustralianStateOrTerritory" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostCode" type="{urn:aseXML:r38}AustralianPostCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AustralianAddressSearch", propOrder = {
    "structuredAddress",
    "suburbOrPlaceOrLocality",
    "stateOrTerritory",
    "postCode"
})
public class AustralianAddressSearch {

    @XmlElement(name = "StructuredAddress", required = true)
    protected AustralianStructuredAddressComponents structuredAddress;
    @XmlElementRef(name = "SuburbOrPlaceOrLocality", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suburbOrPlaceOrLocality;
    @XmlElementRef(name = "StateOrTerritory", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianStateOrTerritory> stateOrTerritory;
    @XmlElementRef(name = "PostCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;

    /**
     * Gets the value of the structuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianStructuredAddressComponents }
     *     
     */
    public AustralianStructuredAddressComponents getStructuredAddress() {
        return structuredAddress;
    }

    /**
     * Sets the value of the structuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianStructuredAddressComponents }
     *     
     */
    public void setStructuredAddress(AustralianStructuredAddressComponents value) {
        this.structuredAddress = value;
    }

    /**
     * Gets the value of the suburbOrPlaceOrLocality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuburbOrPlaceOrLocality() {
        return suburbOrPlaceOrLocality;
    }

    /**
     * Sets the value of the suburbOrPlaceOrLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuburbOrPlaceOrLocality(JAXBElement<String> value) {
        this.suburbOrPlaceOrLocality = value;
    }

    /**
     * Gets the value of the stateOrTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AustralianStateOrTerritory }{@code >}
     *     
     */
    public JAXBElement<AustralianStateOrTerritory> getStateOrTerritory() {
        return stateOrTerritory;
    }

    /**
     * Sets the value of the stateOrTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AustralianStateOrTerritory }{@code >}
     *     
     */
    public void setStateOrTerritory(JAXBElement<AustralianStateOrTerritory> value) {
        this.stateOrTerritory = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

}
