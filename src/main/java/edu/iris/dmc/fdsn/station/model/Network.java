//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//

package edu.iris.dmc.fdsn.station.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This type represents the Network layer, all station metadata is contained
 * within this element. The official name of the network or other descriptive
 * information can be included in the Description element. The Network can
 * contain 0 or more Stations.
 * 
 * <p>
 * Java class for NetworkType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fdsn.org/xml/station/1}BaseNodeType">
 *       &lt;sequence>
 *         &lt;element name="TotalNumberStations" type="{http://www.fdsn.org/xml/station/1}CounterType" minOccurs="0"/>
 *         &lt;element name="SelectedNumberStations" type="{http://www.fdsn.org/xml/station/1}CounterType" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://www.fdsn.org/xml/station/1}StationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkType", propOrder = { "code", "description", "comment", "totalNumberStations",
		"selectedNumberStations", "stations" })
public class Network extends BaseNodeType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5226236597603445089L;

	@XmlAttribute(name = "code", required = true)
	// @XmlJavaTypeAdapter(value = StringAdapter.class)
	protected String code;

	@XmlAttribute(name = "alternateCode")
	protected String alternateCode;
	@XmlAttribute(name = "historicalCode")
	protected String historicalCode;

	@XmlElement(name = "Description")
	protected String description;
	@XmlElement(name = "Comment")
	protected List<Comment> comment;

	@XmlElement(name = "TotalNumberStations")
	protected BigInteger totalNumberStations;
	@XmlElement(name = "SelectedNumberStations")
	protected BigInteger selectedNumberStations;

	@XmlElement(name = "Station")
	protected List<Station> stations = new ArrayList<Station>();;
	@XmlTransient
	private FDSNStationXML rootDocument;

	@XmlTransient
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	public String getAlternateCode() {
		return alternateCode;
	}

	/**
	 * Sets the value of the alternateCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlternateCode(String value) {
		this.alternateCode = value;
	}

	/**
	 * Gets the value of the historicalCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHistoricalCode() {
		return historicalCode;
	}

	/**
	 * Sets the value of the historicalCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHistoricalCode(String value) {
		this.historicalCode = value;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the comment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the comment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Comment }
	 * 
	 * 
	 */
	public List<Comment> getComment() {
		if (comment == null) {
			comment = new ArrayList<Comment>();
		}
		return this.comment;
	}

	/**
	 * Gets the value of the totalNumberStations property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getTotalNumberStations() {
		return totalNumberStations;
	}

	/**
	 * Sets the value of the totalNumberStations property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setTotalNumberStations(BigInteger value) {
		this.totalNumberStations = value;
	}

	/**
	 * Gets the value of the selectedNumberStations property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSelectedNumberStations() {
		return selectedNumberStations;
	}

	/**
	 * Sets the value of the selectedNumberStations property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSelectedNumberStations(BigInteger value) {
		this.selectedNumberStations = value;
	}

	/**
	 * Gets the value of the station property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the station property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getStation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Station }
	 * 
	 * 
	 */
	public List<Station> getStations() {
		if (this.stations == null) {
			return Collections.emptyList();
		}
		return this.stations;
	}

	public void addStation(Station station) {
		if (station == null) {
			return;
		}
		station.setNetwork(this);
		this.stations.add(station);
	}

	public void addStations(List<Station> stations) {
		if (stations == null) {
			return;
		}
		if (this.stations == null) {
			this.stations = new ArrayList<Station>();
		}
		for (Station s : stations) {
			s.setNetwork(this);
			this.stations.add(s);
		}
	}

	public void merge(Station station) {
		if (station == null) {
			return;
		}

		if (this.stations == null) {
			this.stations = new ArrayList<Station>();
			this.addStation(station);
			return;
		}
		station.setNetwork(this);

		int index = this.stations.indexOf(station);

		if (index < 0) {
			this.addStation(station);
		} else {
			Station s = this.stations.get(index);
			for (Channel c : station.getChannels()) {
				s.merge(c);
			}
		}
	}

	public FDSNStationXML getRootDocument() {
		return rootDocument;
	}

	public void setParent() {
	}

	public void setRootDocument(FDSNStationXML rootDocument) {
		this.rootDocument = rootDocument;
	}

	public void afterUnmarshal(Unmarshaller u, Object parent) {
		this.rootDocument = (FDSNStationXML) parent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Network other = (Network) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;

		if (this.getStartDate() == null) {
			if (other.getStartDate() != null)
				return false;
		} else if (!getStartDate().equals(other.getStartDate()))
			return false;

		if (this.getEndDate() == null) {
			if (other.getEndDate() != null)
				return false;
		} else if (!getEndDate().equals(other.getEndDate()))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Network [startdate=" + startDate + ", enddate=" + endDate + ", code=" + code + "]";
	}

}
