/*
 * An XML document type.
 * Localname: BinomialOrgName
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BinomialOrgNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one BinomialOrgName(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class BinomialOrgNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BinomialOrgNameDocument
{
    
    public BinomialOrgNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINOMIALORGNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BinomialOrgName");
    
    
    /**
     * Gets the "BinomialOrgName" element
     */
    public gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName getBinomialOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().find_element_user(BINOMIALORGNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BinomialOrgName" element
     */
    public void setBinomialOrgName(gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName binomialOrgName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().find_element_user(BINOMIALORGNAME$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().add_element_user(BINOMIALORGNAME$0);
            }
            target.set(binomialOrgName);
        }
    }
    
    /**
     * Appends and returns a new empty "BinomialOrgName" element
     */
    public gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName addNewBinomialOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().add_element_user(BINOMIALORGNAME$0);
            return target;
        }
    }
    /**
     * An XML BinomialOrgName(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class BinomialOrgNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName
    {
        
        public BinomialOrgNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENUS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genus");
        private static final javax.xml.namespace.QName SPECIES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "species");
        private static final javax.xml.namespace.QName SUBSPECIES$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subspecies");
        
        
        /**
         * Gets the "genus" element
         */
        public java.lang.String getGenus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "genus" element
         */
        public org.apache.xmlbeans.XmlString xgetGenus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "genus" element
         */
        public void setGenus(java.lang.String genus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENUS$0);
                }
                target.setStringValue(genus);
            }
        }
        
        /**
         * Sets (as xml) the "genus" element
         */
        public void xsetGenus(org.apache.xmlbeans.XmlString genus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENUS$0);
                }
                target.set(genus);
            }
        }
        
        /**
         * Gets the "species" element
         */
        public java.lang.String getSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "species" element
         */
        public org.apache.xmlbeans.XmlString xgetSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIES$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "species" element
         */
        public boolean isSetSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPECIES$2) != 0;
            }
        }
        
        /**
         * Sets the "species" element
         */
        public void setSpecies(java.lang.String species)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIES$2);
                }
                target.setStringValue(species);
            }
        }
        
        /**
         * Sets (as xml) the "species" element
         */
        public void xsetSpecies(org.apache.xmlbeans.XmlString species)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPECIES$2);
                }
                target.set(species);
            }
        }
        
        /**
         * Unsets the "species" element
         */
        public void unsetSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPECIES$2, 0);
            }
        }
        
        /**
         * Gets the "subspecies" element
         */
        public java.lang.String getSubspecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSPECIES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subspecies" element
         */
        public org.apache.xmlbeans.XmlString xgetSubspecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSPECIES$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "subspecies" element
         */
        public boolean isSetSubspecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSPECIES$4) != 0;
            }
        }
        
        /**
         * Sets the "subspecies" element
         */
        public void setSubspecies(java.lang.String subspecies)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSPECIES$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSPECIES$4);
                }
                target.setStringValue(subspecies);
            }
        }
        
        /**
         * Sets (as xml) the "subspecies" element
         */
        public void xsetSubspecies(org.apache.xmlbeans.XmlString subspecies)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSPECIES$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSPECIES$4);
                }
                target.set(subspecies);
            }
        }
        
        /**
         * Unsets the "subspecies" element
         */
        public void unsetSubspecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSPECIES$4, 0);
            }
        }
    }
}
