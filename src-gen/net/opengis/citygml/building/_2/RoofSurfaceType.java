//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.citygml.building._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RoofSurfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoofSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/building/2.0}AbstractBoundarySurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/citygml/building/2.0}_GenericApplicationPropertyOfRoofSurface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoofSurfaceType", propOrder = {
    "_GenericApplicationPropertyOfRoofSurface"
})
public class RoofSurfaceType
    extends AbstractBoundarySurfaceType
{

    @XmlElementRef(name = "_GenericApplicationPropertyOfRoofSurface", namespace = "http://www.opengis.net/citygml/building/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfRoofSurface;

    /**
     * Gets the value of the genericApplicationPropertyOfRoofSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRoofSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfRoofSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfRoofSurface() {
        if (_GenericApplicationPropertyOfRoofSurface == null) {
            _GenericApplicationPropertyOfRoofSurface = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfRoofSurface;
    }

    public boolean isSet_GenericApplicationPropertyOfRoofSurface() {
        return ((this._GenericApplicationPropertyOfRoofSurface!= null)&&(!this._GenericApplicationPropertyOfRoofSurface.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfRoofSurface() {
        this._GenericApplicationPropertyOfRoofSurface = null;
    }

    public void set_GenericApplicationPropertyOfRoofSurface(List<JAXBElement<Object>> value) {
        this._GenericApplicationPropertyOfRoofSurface = value;
    }

}
