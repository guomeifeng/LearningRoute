//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for JobEnquiryCode.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="JobEnquiryCode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="AML"/&amp;gt;
 *     &amp;lt;enumeration value="CSL"/&amp;gt;
 *     &amp;lt;enumeration value="CLT"/&amp;gt;
 *     &amp;lt;enumeration value="DFC"/&amp;gt;
 *     &amp;lt;enumeration value="DSD"/&amp;gt;
 *     &amp;lt;enumeration value="EBD"/&amp;gt;
 *     &amp;lt;enumeration value="EBS"/&amp;gt;
 *     &amp;lt;enumeration value="ECO"/&amp;gt;
 *     &amp;lt;enumeration value="EFB"/&amp;gt;
 *     &amp;lt;enumeration value="EMG"/&amp;gt;
 *     &amp;lt;enumeration value="EMT"/&amp;gt;
 *     &amp;lt;enumeration value="EOT"/&amp;gt;
 *     &amp;lt;enumeration value="ESE"/&amp;gt;
 *     &amp;lt;enumeration value="EST"/&amp;gt;
 *     &amp;lt;enumeration value="EXP"/&amp;gt;
 *     &amp;lt;enumeration value="FAP"/&amp;gt;
 *     &amp;lt;enumeration value="FAT"/&amp;gt;
 *     &amp;lt;enumeration value="FHS"/&amp;gt;
 *     &amp;lt;enumeration value="FMN"/&amp;gt;
 *     &amp;lt;enumeration value="FMT"/&amp;gt;
 *     &amp;lt;enumeration value="FSV"/&amp;gt;
 *     &amp;lt;enumeration value="MAP"/&amp;gt;
 *     &amp;lt;enumeration value="MBO"/&amp;gt;
 *     &amp;lt;enumeration value="MCH"/&amp;gt;
 *     &amp;lt;enumeration value="MDM"/&amp;gt;
 *     &amp;lt;enumeration value="MDO"/&amp;gt;
 *     &amp;lt;enumeration value="MFX"/&amp;gt;
 *     &amp;lt;enumeration value="MFXA"/&amp;gt;
 *     &amp;lt;enumeration value="MHA"/&amp;gt;
 *     &amp;lt;enumeration value="MRC"/&amp;gt;
 *     &amp;lt;enumeration value="MRF"/&amp;gt;
 *     &amp;lt;enumeration value="MRG"/&amp;gt;
 *     &amp;lt;enumeration value="MRM"/&amp;gt;
 *     &amp;lt;enumeration value="MRR"/&amp;gt;
 *     &amp;lt;enumeration value="MRT"/&amp;gt;
 *     &amp;lt;enumeration value="MST"/&amp;gt;
 *     &amp;lt;enumeration value="MTE"/&amp;gt;
 *     &amp;lt;enumeration value="MTJ"/&amp;gt;
 *     &amp;lt;enumeration value="MTN"/&amp;gt;
 *     &amp;lt;enumeration value="OTH"/&amp;gt;
 *     &amp;lt;enumeration value="RML"/&amp;gt;
 *     &amp;lt;enumeration value="RSD"/&amp;gt;
 *     &amp;lt;enumeration value="RSR"/&amp;gt;
 *     &amp;lt;enumeration value="SBS"/&amp;gt;
 *     &amp;lt;enumeration value="SCR"/&amp;gt;
 *     &amp;lt;enumeration value="SDR"/&amp;gt;
 *     &amp;lt;enumeration value="SNG"/&amp;gt;
 *     &amp;lt;enumeration value="SPN"/&amp;gt;
 *     &amp;lt;enumeration value="UEF"/&amp;gt;
 *     &amp;lt;enumeration value="UMS"/&amp;gt;
 *     &amp;lt;enumeration value="USR"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "JobEnquiryCode")
@XmlEnum
public enum JobEnquiryCode {

    AML,
    CSL,
    CLT,
    DFC,
    DSD,
    EBD,
    EBS,
    ECO,
    EFB,
    EMG,
    EMT,
    EOT,
    ESE,
    EST,
    EXP,
    FAP,
    FAT,
    FHS,
    FMN,
    FMT,
    FSV,
    MAP,
    MBO,
    MCH,
    MDM,
    MDO,
    MFX,
    MFXA,
    MHA,
    MRC,
    MRF,
    MRG,
    MRM,
    MRR,
    MRT,
    MST,
    MTE,
    MTJ,
    MTN,
    OTH,
    RML,
    RSD,
    RSR,
    SBS,
    SCR,
    SDR,
    SNG,
    SPN,
    UEF,
    UMS,
    USR;

    public String value() {
        return name();
    }

    public static JobEnquiryCode fromValue(String v) {
        return valueOf(v);
    }

}