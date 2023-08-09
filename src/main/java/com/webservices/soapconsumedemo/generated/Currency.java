//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.09 at 05:41:35 PM EET 
//


package com.webservices.soapconsumedemo.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="currency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="EGY"/&gt;
 *     &lt;enumeration value="RIYAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "currency", namespace = "http://country.soap.soapdemo.webservices.com/")
@XmlEnum
public enum Currency {

    GBP,
    EUR,
    PLN,
    EGY,
    RIYAL;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
