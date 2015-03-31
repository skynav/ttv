//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.30 at 11:26:41 PM MDT 
//


package com.skynav.ttv.model.ttml1.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markerMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="markerMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="continuous"/>
 *     &lt;enumeration value="discontinuous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "markerMode", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum MarkerMode {

    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),
    @XmlEnumValue("discontinuous")
    DISCONTINUOUS("discontinuous");
    private final String value;

    MarkerMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkerMode fromValue(String v) {
        for (MarkerMode c: MarkerMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
