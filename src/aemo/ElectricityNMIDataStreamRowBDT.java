//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 * Purpose - Row of the Electricity NMI DataStream Standing Data table extended by BDTStatus and Event for Bulk Data Tool
 * 			
 * 
 * &lt;p&gt;Java class for ElectricityNMIDataStreamRowBDT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityNMIDataStreamRowBDT"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}ElectricityNMIDataStreamGroup"/&amp;gt;
 *         &amp;lt;element name="BDTStatus" type="{urn:aseXML:r38}BDTStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r31" default="r31" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityNMIDataStreamRowBDT", propOrder = {
    "suffix",
    "profileName",
    "averagedDailyLoad",
    "dataStreamType",
    "status",
    "bdtStatus",
    "event"
})
public class ElectricityNMIDataStreamRowBDT
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "Suffix", required = true)
    protected String suffix;
    @XmlElementRef(name = "ProfileName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileName;
    @XmlElementRef(name = "AveragedDailyLoad", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> averagedDailyLoad;
    @XmlElementRef(name = "DataStreamType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataStreamType;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "BDTStatus")
    @XmlSchemaType(name = "string")
    protected BDTStatus bdtStatus;
    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlAttribute(name = "version")
    protected R31 version;

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileName(JAXBElement<String> value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the averagedDailyLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getAveragedDailyLoad() {
        return averagedDailyLoad;
    }

    /**
     * Sets the value of the averagedDailyLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setAveragedDailyLoad(JAXBElement<BigInteger> value) {
        this.averagedDailyLoad = value;
    }

    /**
     * Gets the value of the dataStreamType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataStreamType() {
        return dataStreamType;
    }

    /**
     * Sets the value of the dataStreamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataStreamType(JAXBElement<String> value) {
        this.dataStreamType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the bdtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BDTStatus }
     *     
     */
    public BDTStatus getBDTStatus() {
        return bdtStatus;
    }

    /**
     * Sets the value of the bdtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDTStatus }
     *     
     */
    public void setBDTStatus(BDTStatus value) {
        this.bdtStatus = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R31 }
     *     
     */
    public R31 getVersion() {
        if (version == null) {
            return R31 .R_31;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R31 }
     *     
     */
    public void setVersion(R31 value) {
        this.version = value;
    }

}