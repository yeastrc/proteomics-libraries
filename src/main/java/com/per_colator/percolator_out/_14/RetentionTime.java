//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.05 at 12:12:28 PM PDT 
//


package com.per_colator.percolator_out._14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="predicted" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="observed" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "retentionTime")
public class RetentionTime implements IRetentionTime {

    @XmlAttribute(name = "predicted")
    protected Double predicted;
    @XmlAttribute(name = "observed")
    protected Double observed;

    /**
     * Gets the value of the predicted property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPredicted() {
        return predicted;
    }

    /**
     * Sets the value of the predicted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPredicted(Double value) {
        this.predicted = value;
    }

    /**
     * Gets the value of the observed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getObserved() {
        return observed;
    }

    /**
     * Sets the value of the observed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setObserved(Double value) {
        this.observed = value;
    }

}
