//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 01:37:05 PM PDT 
//


package edu.iris.dmc.fdsn.station.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension of FloatType for distances, elevations, and
 * 				depths.
 * 
 * <p>Java class for DistanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.fdsn.org/xml/station/1>FloatType">
 *       &lt;attGroup ref="{http://www.fdsn.org/xml/station/1}uncertaintyDouble"/>
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" default="METERS" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceType")
public class Distance
    extends FloatType
{


}
