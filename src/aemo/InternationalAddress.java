//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Define an International address
 * Detail - AS4590 provides differing definitions of some address components depending on whether they are for addresses internal or external to Australia. In order to provide maximum validation of Australian addresses, whilst supporting International formats, aseXML provides different formats for the two. 
 * 
 * Because of the wide variety of International formats, aseXML currently only defines an unstructured format for Internaitonal addresses. It does, however, follow the same structure as that used for Australian addresses, allowing the definition of structured International addresses in the future.
 * 
 * Country and postcode are provided as structured fields , as per AS4590.
 * 	
 * 
 * &lt;p&gt;Java class for InternationalAddress complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InternationalAddress"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="UnstructuredAddress"&amp;gt;
 *             &amp;lt;complexType&amp;gt;
 *               &amp;lt;complexContent&amp;gt;
 *                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                   &amp;lt;sequence&amp;gt;
 *                     &amp;lt;element name="AddressLine" type="{urn:aseXML:r38}InternationalAddressLine" maxOccurs="6"/&amp;gt;
 *                   &amp;lt;/sequence&amp;gt;
 *                 &amp;lt;/restriction&amp;gt;
 *               &amp;lt;/complexContent&amp;gt;
 *             &amp;lt;/complexType&amp;gt;
 *           &amp;lt;/element&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="CountryCode" type="{urn:aseXML:r38}InternationalCountryCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostCode" type="{urn:aseXML:r38}InternationalPostCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalAddress", propOrder = {
    "unstructuredAddress",
    "countryCode",
    "postCode"
})
public class InternationalAddress {

    @XmlElement(name = "UnstructuredAddress")
    protected InternationalAddress.UnstructuredAddress unstructuredAddress;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "PostCode")
    protected String postCode;

    /**
     * Gets the value of the unstructuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAddress.UnstructuredAddress }
     *     
     */
    public InternationalAddress.UnstructuredAddress getUnstructuredAddress() {
        return unstructuredAddress;
    }

    /**
     * Sets the value of the unstructuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAddress.UnstructuredAddress }
     *     
     */
    public void setUnstructuredAddress(InternationalAddress.UnstructuredAddress value) {
        this.unstructuredAddress = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
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
     *         &amp;lt;element name="AddressLine" type="{urn:aseXML:r38}InternationalAddressLine" maxOccurs="6"/&amp;gt;
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

        @XmlElement(name = "AddressLine", required = true)
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