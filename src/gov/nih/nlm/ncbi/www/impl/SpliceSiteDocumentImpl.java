/*
 * An XML document type.
 * Localname: Splice-site
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SpliceSiteDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Splice-site(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SpliceSiteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SpliceSiteDocument
{
    
    public SpliceSiteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPLICESITE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Splice-site");
    
    
    /**
     * Gets the "Splice-site" element
     */
    public gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite getSpliceSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
            target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().find_element_user(SPLICESITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Splice-site" element
     */
    public void setSpliceSite(gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite spliceSite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
            target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().find_element_user(SPLICESITE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().add_element_user(SPLICESITE$0);
            }
            target.set(spliceSite);
        }
    }
    
    /**
     * Appends and returns a new empty "Splice-site" element
     */
    public gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite addNewSpliceSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
            target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().add_element_user(SPLICESITE$0);
            return target;
        }
    }
    /**
     * An XML Splice-site(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SpliceSiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite
    {
        
        public SpliceSiteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BASES$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bases");
        
        
        /**
         * Gets the "bases" element
         */
        public java.lang.String getBases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bases" element
         */
        public org.apache.xmlbeans.XmlString xgetBases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASES$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bases" element
         */
        public void setBases(java.lang.String bases)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASES$0);
                }
                target.setStringValue(bases);
            }
        }
        
        /**
         * Sets (as xml) the "bases" element
         */
        public void xsetBases(org.apache.xmlbeans.XmlString bases)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BASES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BASES$0);
                }
                target.set(bases);
            }
        }
    }
}
