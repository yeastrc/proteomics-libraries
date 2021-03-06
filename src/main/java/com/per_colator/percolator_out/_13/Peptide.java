//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:16:28 PM PST 
//


package com.per_colator.percolator_out._13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}svm_score"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}q_value"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}pep"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}exp_mass" minOccurs="0"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}calc_mass" minOccurs="0"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}retentionTime" minOccurs="0"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}protein_id" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}p_value"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}psm_ids"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/13}peptide_id use="required""/>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/13}decoy"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "svmScore",
    "qValue",
    "pep",
    "expMass",
    "calcMass",
    "retentionTime",
    "proteinId",
    "pValue",
    "psmIds"
})
@XmlRootElement(name = "peptide")
public class Peptide implements IPeptide {

    @XmlElement(name = "svm_score")
    protected double svmScore;
    @XmlElement(name = "q_value", required = true)
    protected String qValue;
    @XmlElement(required = true)
    protected String pep;
    @XmlElement(name = "exp_mass")
    protected Double expMass;
    @XmlElement(name = "calc_mass")
    protected Double calcMass;
    protected RetentionTime retentionTime;
    @XmlElement(name = "protein_id", required = true)
    protected List<String> proteinId;
    @XmlElement(name = "p_value", required = true)
    protected String pValue;
    @XmlElement(name = "psm_ids", required = true)
    protected PsmIds psmIds;
    @XmlAttribute(name = "peptide_id", namespace = "http://per-colator.com/percolator_out/13", required = true)
    protected String peptideId;
    @XmlAttribute(name = "decoy", namespace = "http://per-colator.com/percolator_out/13")
    protected Boolean decoy;

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getSvmScore()
	 */
    @Override
	public double getSvmScore() {
        return svmScore;
    }

    /**
     * Sets the value of the svmScore property.
     * 
     */
    public void setSvmScore(double value) {
        this.svmScore = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getQValue()
	 */
    @Override
	public String getQValue() {
        return qValue;
    }

    /**
     * Sets the value of the qValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQValue(String value) {
        this.qValue = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getPep()
	 */
    @Override
	public String getPep() {
        return pep;
    }

    /**
     * Sets the value of the pep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPep(String value) {
        this.pep = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getExpMass()
	 */
    @Override
	public Double getExpMass() {
        return expMass;
    }

    /**
     * Sets the value of the expMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpMass(Double value) {
        this.expMass = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getCalcMass()
	 */
    @Override
	public Double getCalcMass() {
        return calcMass;
    }

    /**
     * Sets the value of the calcMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalcMass(Double value) {
        this.calcMass = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getRetentionTime()
	 */
    @Override
	public RetentionTime getRetentionTime() {
        return retentionTime;
    }

    /**
     * Sets the value of the retentionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionTime }
     *     
     */
    public void setRetentionTime(RetentionTime value) {
        this.retentionTime = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getProteinId()
	 */
    @Override
	public List<String> getProteinId() {
        if (proteinId == null) {
            proteinId = new ArrayList<String>();
        }
        return this.proteinId;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getPValue()
	 */
    @Override
	public String getPValue() {
        return pValue;
    }

    /**
     * Sets the value of the pValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPValue(String value) {
        this.pValue = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getPsmIds()
	 */
    @Override
	public PsmIds getPsmIds() {
        return psmIds;
    }

    /**
     * Sets the value of the psmIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmIds }
     *     
     */
    public void setPsmIds(PsmIds value) {
        this.psmIds = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#getPeptideId()
	 */
    @Override
	public String getPeptideId() {
        return peptideId;
    }

    /**
     * Sets the value of the peptideId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeptideId(String value) {
        this.peptideId = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPeptide#isDecoy()
	 */
    @Override
	public Boolean isDecoy() {
        return decoy;
    }

    /**
     * Sets the value of the decoy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecoy(Boolean value) {
        this.decoy = value;
    }

}
