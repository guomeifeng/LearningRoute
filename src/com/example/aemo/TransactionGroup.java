//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package com.example.aemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TransactionGroup.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TransactionGroup"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CATS"/&amp;gt;
 *     &amp;lt;enumeration value="MDMT"/&amp;gt;
 *     &amp;lt;enumeration value="MSGS"/&amp;gt;
 *     &amp;lt;enumeration value="NMID"/&amp;gt;
 *     &amp;lt;enumeration value="FLTS"/&amp;gt;
 *     &amp;lt;enumeration value="SORD"/&amp;gt;
 *     &amp;lt;enumeration value="NETB"/&amp;gt;
 *     &amp;lt;enumeration value="MTRD"/&amp;gt;
 *     &amp;lt;enumeration value="CUST"/&amp;gt;
 *     &amp;lt;enumeration value="NOTF"/&amp;gt;
 *     &amp;lt;enumeration value="SITE"/&amp;gt;
 *     &amp;lt;enumeration value="FLDW"/&amp;gt;
 *     &amp;lt;enumeration value="OUTG"/&amp;gt;
 *     &amp;lt;enumeration value="BAR"/&amp;gt;
 *     &amp;lt;enumeration value="NMIF"/&amp;gt;
 *     &amp;lt;enumeration value="MKTW"/&amp;gt;
 *     &amp;lt;enumeration value="HSMD"/&amp;gt;
 *     &amp;lt;enumeration value="OWNP"/&amp;gt;
 *     &amp;lt;enumeration value="EMMS"/&amp;gt;
 *     &amp;lt;enumeration value="ERFT"/&amp;gt;
 *     &amp;lt;enumeration value="IAIT"/&amp;gt;
 *     &amp;lt;enumeration value="MRSR"/&amp;gt;
 *     &amp;lt;enumeration value="OWNX"/&amp;gt;
 *     &amp;lt;enumeration value="NPNX"/&amp;gt;
 *     &amp;lt;enumeration value="PTPE"/&amp;gt;
 *     &amp;lt;enumeration value="HMGT"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TransactionGroup")
@XmlEnum
public enum TransactionGroup {

    CATS,
    MDMT,
    MSGS,
    NMID,
    FLTS,
    SORD,
    NETB,
    MTRD,
    CUST,
    NOTF,
    SITE,
    FLDW,
    OUTG,
    BAR,
    NMIF,
    MKTW,
    HSMD,
    OWNP,
    EMMS,
    ERFT,
    IAIT,
    MRSR,
    OWNX,
    NPNX,
    PTPE,
    HMGT;

    public String value() {
        return name();
    }

    public static TransactionGroup fromValue(String v) {
        return valueOf(v);
    }

}
