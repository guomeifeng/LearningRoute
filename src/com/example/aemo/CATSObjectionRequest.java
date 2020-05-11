//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Application - Customer Transfer
 * TransactionExchange - CATS Objection Request
 * TransactionGroup - CATS
 * Priority - Medium
 * Purpose - Submit a objection request
 * 			
 * 
 * &lt;p&gt;Java class for CATSObjectionRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSObjectionRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}CATSObjectionData"&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSObjectionRequest")
public class CATSObjectionRequest
    extends CATSObjectionData
{

    @XmlAttribute(name = "version")
    protected R29 version;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R29 }
     *     
     */
    public R29 getVersion() {
        if (version == null) {
            return R29 .R_29;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R29 }
     *     
     */
    public void setVersion(R29 value) {
        this.version = value;
    }

}
