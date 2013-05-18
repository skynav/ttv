//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.17 at 11:30:57 PM MDT 
//


package com.skynav.ttv.model.ttml10.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataAgentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="metadataAgentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="person"/>
 *     &lt;enumeration value="character"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="organization"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "metadataAgentType", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum AgentType {

    @XmlEnumValue("person")
    PERSON("person"),
    @XmlEnumValue("character")
    CHARACTER("character"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("organization")
    ORGANIZATION("organization"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AgentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentType fromValue(String v) {
        for (AgentType c: AgentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
