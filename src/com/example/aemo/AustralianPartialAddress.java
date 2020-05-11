//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Define an Australian address
 * Detail - This type allows the transfer of portions of an Australian address. where a complete address is to be transferred, the AustralianAddress type should be used.
 * 	
 * 
 * &lt;p&gt;Java class for AustralianPartialAddress complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AustralianPartialAddress"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="StructuredAddress" type="{urn:aseXML:r38}AustralianStructuredAddressPartialComponents"/&amp;gt;
 *           &amp;lt;element name="UnstructuredAddress"&amp;gt;
 *             &amp;lt;complexType&amp;gt;
 *               &amp;lt;complexContent&amp;gt;
 *                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                   &amp;lt;sequence&amp;gt;
 *                     &amp;lt;element name="AddressLine" type="{urn:aseXML:r38}AustralianAddressLine" maxOccurs="3"/&amp;gt;
 *                   &amp;lt;/sequence&amp;gt;
 *                 &amp;lt;/restriction&amp;gt;
 *               &amp;lt;/complexContent&amp;gt;
 *             &amp;lt;/complexType&amp;gt;
 *           &amp;lt;/element&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="SuburbOrPlaceOrLocality" type="{urn:aseXML:r38}AustralianSuburbOrPlaceOrLocality" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateOrTerritory" type="{urn:aseXML:r38}AustralianStateOrTerritory" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostCode" type="{urn:aseXML:r38}AustralianPostCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DeliveryPointIdentifier" type="{urn:aseXML:r38}AustralianDeliveryPointIdentifier" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AustralianPartialAddress", propOrder = {
    "structuredAddress",
    "unstructuredAddress",
    "suburbOrPlaceOrLocality",
    "stateOrTerritory",
    "postCode",
    "deliveryPointIdentifier"
})
public class AustralianPartialAddress {

    @XmlElement(name = "StructuredAddress")
    protected AustralianStructuredAddressPartialComponents structuredAddress;
    @XmlElement(name = "UnstructuredAddress")
    protected AustralianPartialAddress.UnstructuredAddress unstructuredAddress;
    @XmlElementRef(name = "SuburbOrPlaceOrLocality", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suburbOrPlaceOrLocality;
    @XmlElementRef(name = "StateOrTerritory", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianStateOrTerritory> stateOrTerritory;
    @XmlElementRef(name = "PostCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "DeliveryPointIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> deliveryPointIdentifier;

    /**
     * Gets the value of the structuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianStructuredAddressPartialComponents }
     *     
     */
    public AustralianStructuredAddressPartialComponents getStructuredAddress() {
        return structuredAddress;
    }

    /**
     * Sets the value of the structuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianStructuredAddressPartialComponents }
     *     
     */
    public void setStructuredAddress(AustralianStructuredAddressPartialComponents value) {
        this.structuredAddress = value;
    }

    /**
     * Gets the value of the unstructuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianPartialAddress.UnstructuredAddress }
     *     
     */
    public AustralianPartialAddress.UnstructuredAddress getUnstructuredAddress() {
        return unstructuredAddress;
    }

    /**
     * Sets the value of the unstructuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianPartialAddress.UnstructuredAddress }
     *     
     */
    public void setUnstructuredAddress(AustralianPartialAddress.UnstructuredAddress value) {
        this.unstructuredAddress = value;
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

    /**
     * Gets the value of the deliveryPointIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeliveryPointIdentifier() {
        return deliveryPointIdentifier;
    }

    /**
     * Sets the value of the deliveryPointIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeliveryPointIdentifier(JAXBElement<Integer> value) {
        this.deliveryPointIdentifier = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="AddressLine" type="{urn:aseXML:r38}AustralianAddressLine" maxOccurs="3"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressLine"
    })
    public static class UnstructuredAddress {

        @XmlElement(name = "AddressLine", required = true, nillable = true)
        protected List<String> addressLine;

        /**
         * Gets the value of the addressLine property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the addressLine property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAddressLine().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAddressLine() {
            if (addressLine == null) {
                addressLine = new ArrayList<String>();
            }
            return this.addressLine;
        }

    }

}
