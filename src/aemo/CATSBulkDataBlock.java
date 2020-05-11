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
 * Application - Bulk Data Tool
 * TransactionExchange - CATSBulkDataResponse
 * TransactionGroup - CATS
 * Priority - Low
 * Purpose - Provide Electricity Standing Data Rows extended with BDTStatus and Event
 * Detail - 
 * 			
 * 
 * &lt;p&gt;Java class for CATSBulkDataBlock complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSBulkDataBlock"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *         &amp;lt;element name="BDTGroupings" type="{urn:aseXML:r38}BDTGroupings"/&amp;gt;
 *         &amp;lt;element name="Row" type="{urn:aseXML:r38}ReplicationBaseRow" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSBulkDataBlock", propOrder = {
    "nmi",
    "bdtGroupings",
    "row",
    "event"
})
public class CATSBulkDataBlock {

    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;
    @XmlElement(name = "BDTGroupings", required = true)
    protected BDTGroupings bdtGroupings;
    @XmlElement(name = "Row", required = true)
    protected List<ReplicationBaseRow> row;
    @XmlElement(name = "Event", required = true)
    protected List<Event> event;

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMI }
     *     
     */
    public NMI getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMI }
     *     
     */
    public void setNMI(NMI value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the bdtGroupings property.
     * 
     * @return
     *     possible object is
     *     {@link BDTGroupings }
     *     
     */
    public BDTGroupings getBDTGroupings() {
        return bdtGroupings;
    }

    /**
     * Sets the value of the bdtGroupings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDTGroupings }
     *     
     */
    public void setBDTGroupings(BDTGroupings value) {
        this.bdtGroupings = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the row property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRow().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationBaseRow }
     * 
     * 
     */
    public List<ReplicationBaseRow> getRow() {
        if (row == null) {
            row = new ArrayList<ReplicationBaseRow>();
        }
        return this.row;
    }

    /**
     * Gets the value of the event property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the event property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEvent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

}