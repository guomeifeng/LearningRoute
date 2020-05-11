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
 * &lt;p&gt;Java class for CreditData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CreditData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Header" type="{urn:aseXML:r38}NETBHeader"/&amp;gt;
 *         &amp;lt;element name="Credits"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;choice&amp;gt;
 *                   &amp;lt;element name="OutstandingInvoice" type="{urn:aseXML:r38}OustandingInvoiceDetail" maxOccurs="unbounded"/&amp;gt;
 *                   &amp;lt;element name="CreditBalance" type="{urn:aseXML:r38}CreditBalanceDetail" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/choice&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Summary" type="{urn:aseXML:r38}ChargeFooter"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditData", propOrder = {
    "header",
    "credits",
    "summary"
})
public class CreditData {

    @XmlElement(name = "Header", required = true)
    protected NETBHeader header;
    @XmlElement(name = "Credits", required = true)
    protected CreditData.Credits credits;
    @XmlElement(name = "Summary", required = true)
    protected ChargeFooter summary;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link NETBHeader }
     *     
     */
    public NETBHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link NETBHeader }
     *     
     */
    public void setHeader(NETBHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * @return
     *     possible object is
     *     {@link CreditData.Credits }
     *     
     */
    public CreditData.Credits getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditData.Credits }
     *     
     */
    public void setCredits(CreditData.Credits value) {
        this.credits = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeFooter }
     *     
     */
    public ChargeFooter getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeFooter }
     *     
     */
    public void setSummary(ChargeFooter value) {
        this.summary = value;
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
     *       &amp;lt;choice&amp;gt;
     *         &amp;lt;element name="OutstandingInvoice" type="{urn:aseXML:r38}OustandingInvoiceDetail" maxOccurs="unbounded"/&amp;gt;
     *         &amp;lt;element name="CreditBalance" type="{urn:aseXML:r38}CreditBalanceDetail" maxOccurs="unbounded"/&amp;gt;
     *       &amp;lt;/choice&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "outstandingInvoice",
        "creditBalance"
    })
    public static class Credits {

        @XmlElement(name = "OutstandingInvoice")
        protected List<OustandingInvoiceDetail> outstandingInvoice;
        @XmlElement(name = "CreditBalance")
        protected List<CreditBalanceDetail> creditBalance;

        /**
         * Gets the value of the outstandingInvoice property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the outstandingInvoice property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOutstandingInvoice().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link OustandingInvoiceDetail }
         * 
         * 
         */
        public List<OustandingInvoiceDetail> getOutstandingInvoice() {
            if (outstandingInvoice == null) {
                outstandingInvoice = new ArrayList<OustandingInvoiceDetail>();
            }
            return this.outstandingInvoice;
        }

        /**
         * Gets the value of the creditBalance property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the creditBalance property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCreditBalance().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link CreditBalanceDetail }
         * 
         * 
         */
        public List<CreditBalanceDetail> getCreditBalance() {
            if (creditBalance == null) {
                creditBalance = new ArrayList<CreditBalanceDetail>();
            }
            return this.creditBalance;
        }

    }

}