/*
 * An XML document type.
 * Localname: Blast4-common-options-repeats-filtering
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-repeats-filtering(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsRepeatsFilteringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument
{
    
    public Blast4CommonOptionsRepeatsFilteringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSREPEATSFILTERING$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-repeats-filtering");
    
    
    /**
     * Gets the "Blast4-common-options-repeats-filtering" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering getBlast4CommonOptionsRepeatsFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-repeats-filtering" element
     */
    public void setBlast4CommonOptionsRepeatsFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering blast4CommonOptionsRepeatsFiltering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0);
            }
            target.set(blast4CommonOptionsRepeatsFiltering);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-repeats-filtering" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering addNewBlast4CommonOptionsRepeatsFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-repeats-filtering(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsRepeatsFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering
    {
        
        public Blast4CommonOptionsRepeatsFilteringImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISMTAXID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "organism-taxid");
        
        
        /**
         * Gets the "organism-taxid" element
         */
        public java.math.BigInteger getOrganismTaxid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISMTAXID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "organism-taxid" element
         */
        public org.apache.xmlbeans.XmlInteger xgetOrganismTaxid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORGANISMTAXID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "organism-taxid" element
         */
        public void setOrganismTaxid(java.math.BigInteger organismTaxid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISMTAXID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISMTAXID$0);
                }
                target.setBigIntegerValue(organismTaxid);
            }
        }
        
        /**
         * Sets (as xml) the "organism-taxid" element
         */
        public void xsetOrganismTaxid(org.apache.xmlbeans.XmlInteger organismTaxid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORGANISMTAXID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ORGANISMTAXID$0);
                }
                target.set(organismTaxid);
            }
        }
    }
}
