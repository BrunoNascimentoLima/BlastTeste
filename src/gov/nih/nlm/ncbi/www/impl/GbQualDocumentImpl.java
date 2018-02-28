/*
 * An XML document type.
 * Localname: Gb-qual
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GbQualDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Gb-qual(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GbQualDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GbQualDocument
{
    
    public GbQualDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GBQUAL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Gb-qual");
    
    
    /**
     * Gets the "Gb-qual" element
     */
    public gov.nih.nlm.ncbi.www.GbQualDocument.GbQual getGbQual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
            target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().find_element_user(GBQUAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Gb-qual" element
     */
    public void setGbQual(gov.nih.nlm.ncbi.www.GbQualDocument.GbQual gbQual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
            target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().find_element_user(GBQUAL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().add_element_user(GBQUAL$0);
            }
            target.set(gbQual);
        }
    }
    
    /**
     * Appends and returns a new empty "Gb-qual" element
     */
    public gov.nih.nlm.ncbi.www.GbQualDocument.GbQual addNewGbQual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
            target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().add_element_user(GBQUAL$0);
            return target;
        }
    }
    /**
     * An XML Gb-qual(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GbQualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GbQualDocument.GbQual
    {
        
        public GbQualImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUAL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "qual");
        private static final javax.xml.namespace.QName VAL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "val");
        
        
        /**
         * Gets the "qual" element
         */
        public java.lang.String getQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "qual" element
         */
        public org.apache.xmlbeans.XmlString xgetQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUAL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "qual" element
         */
        public void setQual(java.lang.String qual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUAL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUAL$0);
                }
                target.setStringValue(qual);
            }
        }
        
        /**
         * Sets (as xml) the "qual" element
         */
        public void xsetQual(org.apache.xmlbeans.XmlString qual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUAL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUAL$0);
                }
                target.set(qual);
            }
        }
        
        /**
         * Gets the "val" element
         */
        public java.lang.String getVal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "val" element
         */
        public org.apache.xmlbeans.XmlString xgetVal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAL$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "val" element
         */
        public void setVal(java.lang.String val)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAL$2);
                }
                target.setStringValue(val);
            }
        }
        
        /**
         * Sets (as xml) the "val" element
         */
        public void xsetVal(org.apache.xmlbeans.XmlString val)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VAL$2);
                }
                target.set(val);
            }
        }
    }
}
