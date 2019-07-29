//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 01:37:05 PM PDT 
//


package edu.iris.dmc.fdsn.station.model;

import java.util.Objects;

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
    edu.iris.dmc.fdsn.station.model.Polynomial.Coefficient.class,
    edu.iris.dmc.fdsn.station.model.Coefficients.Numerator.class,
    edu.iris.dmc.fdsn.station.model.Coefficients.Denominator.class
})
public class FloatNoUnitType {

    @XmlValue
    protected Double value;
    @XmlAttribute(name = "plusError")
    protected Double plusError;
    @XmlAttribute(name = "minusError")
    protected Double minusError;
    @XmlAttribute(name = "measurementMethod")
    protected String measurementMethod;

    /**
     * Gets the value of the value property.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(Double value) {
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
    public Double getPlusError() {
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
    public Double getMinusError() {
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

    /**
     * Gets the value of the measurementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementMethod() {
        return measurementMethod;
    }

    /**
     * Sets the value of the measurementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementMethod(String value) {
        this.measurementMethod = value;
    }

	@Override
	public int hashCode() {
		return Objects.hash(measurementMethod, minusError, plusError, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FloatNoUnitType other = (FloatNoUnitType) obj;
		return Objects.equals(measurementMethod, other.measurementMethod)
				&& Objects.equals(minusError, other.minusError) && Objects.equals(plusError, other.plusError)
				&& Objects.equals(value, other.value);
	}

}
