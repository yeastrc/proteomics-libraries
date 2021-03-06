//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:16:28 PM PST 
//


package com.per_colator.percolator_out._13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.per_colator.percolator_out._13 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PValue_QNAME = new QName("http://per-colator.com/percolator_out/13", "p_value");
    private final static QName _ProteinId_QNAME = new QName("http://per-colator.com/percolator_out/13", "protein_id");
    private final static QName _QValue_QNAME = new QName("http://per-colator.com/percolator_out/13", "q_value");
    private final static QName _CalcMass_QNAME = new QName("http://per-colator.com/percolator_out/13", "calc_mass");
    private final static QName _SvmScore_QNAME = new QName("http://per-colator.com/percolator_out/13", "svm_score");
    private final static QName _ExpMass_QNAME = new QName("http://per-colator.com/percolator_out/13", "exp_mass");
    private final static QName _Pep_QNAME = new QName("http://per-colator.com/percolator_out/13", "pep");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.per_colator.percolator_out._13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessInfo }
     * 
     */
    public ProcessInfo createProcessInfo() {
        return new ProcessInfo();
    }

    /**
     * Create an instance of {@link Peptide }
     * 
     */
    public Peptide createPeptide() {
        return new Peptide();
    }

    /**
     * Create an instance of {@link RetentionTime }
     * 
     */
    public RetentionTime createRetentionTime() {
        return new RetentionTime();
    }

    /**
     * Create an instance of {@link PsmIds }
     * 
     */
    public PsmIds createPsmIds() {
        return new PsmIds();
    }

    /**
     * Create an instance of {@link PercolatorOutput }
     * 
     */
    public PercolatorOutput createPercolatorOutput() {
        return new PercolatorOutput();
    }

    /**
     * Create an instance of {@link ProcessInfo.Comment }
     * 
     */
    public ProcessInfo.Comment createProcessInfoComment() {
        return new ProcessInfo.Comment();
    }

    /**
     * Create an instance of {@link Psms }
     * 
     */
    public Psms createPsms() {
        return new Psms();
    }

    /**
     * Create an instance of {@link Psm }
     * 
     */
    public Psm createPsm() {
        return new Psm();
    }

    /**
     * Create an instance of {@link PeptideSeq }
     * 
     */
    public PeptideSeq createPeptideSeq() {
        return new PeptideSeq();
    }

    /**
     * Create an instance of {@link Peptides }
     * 
     */
    public Peptides createPeptides() {
        return new Peptides();
    }

    /**
     * Create an instance of {@link Proteins }
     * 
     */
    public Proteins createProteins() {
        return new Proteins();
    }

    /**
     * Create an instance of {@link Protein }
     * 
     */
    public Protein createProtein() {
        return new Protein();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "p_value")
    public JAXBElement<String> createPValue(String value) {
        return new JAXBElement<String>(_PValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "protein_id")
    public JAXBElement<String> createProteinId(String value) {
        return new JAXBElement<String>(_ProteinId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "q_value")
    public JAXBElement<String> createQValue(String value) {
        return new JAXBElement<String>(_QValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "calc_mass")
    public JAXBElement<Double> createCalcMass(Double value) {
        return new JAXBElement<Double>(_CalcMass_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "svm_score")
    public JAXBElement<Double> createSvmScore(Double value) {
        return new JAXBElement<Double>(_SvmScore_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "exp_mass")
    public JAXBElement<Double> createExpMass(Double value) {
        return new JAXBElement<Double>(_ExpMass_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://per-colator.com/percolator_out/13", name = "pep")
    public JAXBElement<String> createPep(String value) {
        return new JAXBElement<String>(_Pep_QNAME, String.class, null, value);
    }

}
