//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * Purpose - Row of the CATS Data Request table
 * MSATS Data Model Table - CATS_Outbound_Requests
 * Replication Table Name - CATSDataRequests
 * 			
 * 
 * &lt;p&gt;Java class for CATSDataRequestRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSDataRequestRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationBaseRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Participant" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="TransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/&amp;gt;
 *         &amp;lt;element name="DataRequest"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;any processContents='skip'/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
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
@XmlType(name = "CATSDataRequestRow", propOrder = {
    "participant",
    "transactionID",
    "dataRequest"
})
public class CATSDataRequestRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "Participant", required = true)
    protected PartyIdentifier participant;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "DataRequest", required = true)
    protected CATSDataRequestRow.DataRequest dataRequest;

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setParticipant(PartyIdentifier value) {
        this.participant = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the dataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CATSDataRequestRow.DataRequest }
     *     
     */
    public CATSDataRequestRow.DataRequest getDataRequest() {
        return dataRequest;
    }

    /**
     * Sets the value of the dataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSDataRequestRow.DataRequest }
     *     
     */
    public void setDataRequest(CATSDataRequestRow.DataRequest value) {
        this.dataRequest = value;
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
     *         &amp;lt;any processContents='skip'/&amp;gt;
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
        "any"
    })
    public static class DataRequest {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}