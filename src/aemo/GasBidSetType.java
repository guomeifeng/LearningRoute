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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for GasBidSetType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasBidSetType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="BidType" type="{urn:aseXML:r38}GasInjectWithdrawType"/&amp;gt;
 *         &amp;lt;element name="Period" type="{urn:aseXML:r38}Period"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *         &amp;lt;element name="Bids" type="{urn:aseXML:r38}GasBidsType"/&amp;gt;
 *         &amp;lt;element name="BidSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastModifiedBy" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;minLength value="1"/&amp;gt;
 *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasBidSetType", propOrder = {
    "bidType",
    "period",
    "nmi",
    "bids",
    "bidSetId",
    "companyId",
    "lastModifiedBy",
    "lastModifiedDate"
})
public class GasBidSetType {

    @XmlElement(name = "BidType", required = true)
    @XmlSchemaType(name = "string")
    protected GasInjectWithdrawType bidType;
    @XmlElement(name = "Period", required = true)
    protected Period period;
    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;
    @XmlElement(name = "Bids", required = true)
    protected GasBidsType bids;
    @XmlElement(name = "BidSetId")
    protected Long bidSetId;
    @XmlElement(name = "CompanyId")
    protected Integer companyId;
    @XmlElement(name = "LastModifiedBy")
    protected String lastModifiedBy;
    @XmlElement(name = "LastModifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;

    /**
     * Gets the value of the bidType property.
     * 
     * @return
     *     possible object is
     *     {@link GasInjectWithdrawType }
     *     
     */
    public GasInjectWithdrawType getBidType() {
        return bidType;
    }

    /**
     * Sets the value of the bidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasInjectWithdrawType }
     *     
     */
    public void setBidType(GasInjectWithdrawType value) {
        this.bidType = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

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
     * Gets the value of the bids property.
     * 
     * @return
     *     possible object is
     *     {@link GasBidsType }
     *     
     */
    public GasBidsType getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasBidsType }
     *     
     */
    public void setBids(GasBidsType value) {
        this.bids = value;
    }

    /**
     * Gets the value of the bidSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBidSetId() {
        return bidSetId;
    }

    /**
     * Sets the value of the bidSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBidSetId(Long value) {
        this.bidSetId = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

}