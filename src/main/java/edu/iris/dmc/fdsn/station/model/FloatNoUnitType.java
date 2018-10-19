//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//


package edu.iris.dmc.fdsn.station.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FloatNoUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatNoUnitType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attGroup ref="{http://www.fdsn.org/xml/station/1}uncertaintyDouble"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatNoUnitType", propOrder = {
    "value"
})
@XmlSeeAlso({
    edu.iris.dmc.fdsn.station.model.Coefficient.class
})
public class FloatNoUnitType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "plusError")
    protected double plusError;
    @XmlAttribute(name = "minusError")
    protected double minusError;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the plusError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getPlusError() {
        return plusError;
    }

    /**
     * Sets the value of the plusError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlusError(Double value) {
        this.plusError = value;
    }

    /**
     * Gets the value of the minusError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinusError() {
        return minusError;
    }

    /**
     * Sets the value of the minusError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinusError(Double value) {
        this.minusError = value;
    }

}
