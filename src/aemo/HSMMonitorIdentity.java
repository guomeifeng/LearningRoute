//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HSMMonitorIdentity complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HSMMonitorIdentity"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="StationEID" type="{urn:aseXML:r38}HSMEID"/&amp;gt;
 *         &amp;lt;element name="MonitorID" type="{urn:aseXML:r38}HSMID"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMMonitorIdentity", propOrder = {
    "stationEID",
    "monitorID"
})
@XmlSeeAlso({
    HSMMonitorCapability.class,
    HSMMonitorRollCall.class,
    HSMMonitorData.class,
    HSMTriggeredEvent.class,
    HSMTrigger.class
})
public class HSMMonitorIdentity {

    @XmlElement(name = "StationEID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stationEID;
    @XmlElement(name = "MonitorID", required = true)
    protected String monitorID;

    /**
     * Gets the value of the stationEID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStationEID() {
        return stationEID;
    }

    /**
     * Sets the value of the stationEID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStationEID(BigInteger value) {
        this.stationEID = value;
    }

    /**
     * Gets the value of the monitorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorID() {
        return monitorID;
    }

    /**
     * Sets the value of the monitorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorID(String value) {
        this.monitorID = value;
    }

}