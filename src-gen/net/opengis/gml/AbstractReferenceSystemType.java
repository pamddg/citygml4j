//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of a spatial and/or temporal reference system used by a dataset.
 * 
 * <p>Java-Klasse für AbstractReferenceSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractReferenceSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}srsID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}scope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractReferenceSystemType", propOrder = {
    "srsID",
    "remarks",
    "validArea",
    "scope"
})
@XmlSeeAlso({
    EngineeringCRSType.class,
    TemporalCRSType.class,
    GeographicCRSType.class,
    CompoundCRSType.class,
    VerticalCRSType.class,
    ImageCRSType.class,
    GeocentricCRSType.class,
    AbstractGeneralDerivedCRSType.class
})
public abstract class AbstractReferenceSystemType
    extends AbstractReferenceSystemBaseType
{

    protected List<IdentifierType> srsID;
    protected StringOrRefType remarks;
    protected ExtentType validArea;
    protected String scope;

    /**
     * Set of alterative identifications of this reference system. The first srsID, if any, is normally the primary identification code, and any others are aliases.Gets the value of the srsID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srsID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrsID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getSrsID() {
        if (srsID == null) {
            srsID = new ArrayList<IdentifierType>();
        }
        return this.srsID;
    }

    public boolean isSetSrsID() {
        return ((this.srsID!= null)&&(!this.srsID.isEmpty()));
    }

    public void unsetSrsID() {
        this.srsID = null;
    }

    /**
     * Comments on or information about this reference system, including source information.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRemarks() {
        return remarks;
    }

    /**
     * Legt den Wert der remarks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRemarks(StringOrRefType value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
    }

    /**
     * Ruft den Wert der validArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtentType }
     *     
     */
    public ExtentType getValidArea() {
        return validArea;
    }

    /**
     * Legt den Wert der validArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentType }
     *     
     */
    public void setValidArea(ExtentType value) {
        this.validArea = value;
    }

    public boolean isSetValidArea() {
        return (this.validArea!= null);
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    public boolean isSetScope() {
        return (this.scope!= null);
    }

    public void setSrsID(List<IdentifierType> value) {
        this.srsID = value;
    }

}
