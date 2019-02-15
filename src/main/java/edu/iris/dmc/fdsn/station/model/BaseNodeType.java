//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//

package edu.iris.dmc.fdsn.station.model;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;

/**
 * A base node type for derivation from: Network, Station and Channel types.
 * 
 * <p>
 * Java class for BaseNodeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BaseNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.fdsn.org/xml/station/1}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="restrictedStatus" type="{http://www.fdsn.org/xml/station/1}RestrictedStatusType" />
 *       &lt;attribute name="alternateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="historicalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseNodeType", propOrder = { "dataAvailability", "any" })
@XmlSeeAlso({ Station.class, Network.class, Channel.class })
public abstract class BaseNodeType implements NodeType {

	@XmlAttribute(name = "startDate", required = true)
	@XmlJavaTypeAdapter(ZonedDateTimeXmlAdapter.class)
	protected ZonedDateTime startDate;
	@XmlAttribute(name = "endDate")
	@XmlJavaTypeAdapter(ZonedDateTimeXmlAdapter.class)
	protected ZonedDateTime endDate;

	@XmlAnyElement(lax = true)
	protected List<Object> any;

	@XmlAttribute(name = "restrictedStatus")
	protected RestrictedStatusType restrictedStatus;

	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	@XmlElement(name = "DataAvailability")
	protected DataAvailability dataAvailability;

	public ZonedDateTime getStartDate() {
		return this.startDate;
	}

	public void setStartDate(ZonedDateTime startDate) {
		this.startDate = startDate;
	}

	public ZonedDateTime getEndDate() {
		return this.endDate;
	}

	public void setEndDate(ZonedDateTime endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the value of the dataAvailability property.
	 * 
	 * @return possible object is {@link DataAvailabilityType }
	 * 
	 */
	public DataAvailability getDataAvailability() {
		return dataAvailability;
	}

	/**
	 * Sets the value of the dataAvailability property.
	 * 
	 * @param value
	 *            allowed object is {@link DataAvailabilityType }
	 * 
	 */
	public void setDataAvailability(DataAvailability value) {
		this.dataAvailability = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 * {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Gets the value of the restrictedStatus property.
	 * 
	 * @return possible object is {@link RestrictedStatusType }
	 * 
	 */
	public RestrictedStatusType getRestrictedStatus() {
		return restrictedStatus;
	}

	/**
	 * Sets the value of the restrictedStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link RestrictedStatusType }
	 * 
	 */
	public void setRestrictedStatus(RestrictedStatusType value) {
		this.restrictedStatus = value;
	}

	/**
	 * Gets the value of the alternateCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property
	 * on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}
	
	public void addAttribute(QName qName,String value) {
		this.otherAttributes.put(qName, value);
	}

	public enum LEVEL {

		NETWORK("network", 1), STATION("station", 2), CHANNEL("channel", 3), RESPONSE("response", 4);

		private int value;
		private String name;

		private LEVEL(int value) {
			this(null, value);
		}

		private LEVEL(String name, int value) {
			this.value = value;
			this.name = name;
		}

		public int getValue() {
			return this.value;
		}

		public static LEVEL parse(String value) {
			if (value == null) {
				throw new IllegalArgumentException();
			}
			if ("network".equalsIgnoreCase(value) || "net".equalsIgnoreCase(value)) {
				return NETWORK;
			}
			if ("station".equalsIgnoreCase(value) || "sta".equalsIgnoreCase(value)) {
				return STATION;
			}
			if ("channel".equalsIgnoreCase(value) || "cha".equalsIgnoreCase(value)) {
				return CHANNEL;
			}
			if ("response".equalsIgnoreCase(value) || "resp".equalsIgnoreCase(value)) {
				return RESPONSE;
			}
			throw new IllegalArgumentException();
		}
	}

}
