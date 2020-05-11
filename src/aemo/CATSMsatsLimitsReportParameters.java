//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Parameters for a CATS MSATS Limits Report
 * Report Name - MsatsLimits
 * 			
 * 
 * &lt;p&gt;Java class for CATSMsatsLimitsReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSMsatsLimitsReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r28" default="r28" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSMsatsLimitsReportParameters")
public class CATSMsatsLimitsReportParameters
    extends BaseReportParameters
{

    @XmlAttribute(name = "version")
    protected R28 version;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R28 }
     *     
     */
    public R28 getVersion() {
        if (version == null) {
            return R28 .R_28;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R28 }
     *     
     */
    public void setVersion(R28 value) {
        this.version = value;
    }

}