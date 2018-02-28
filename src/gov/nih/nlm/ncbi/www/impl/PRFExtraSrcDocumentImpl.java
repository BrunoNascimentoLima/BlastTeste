/*
 * An XML document type.
 * Localname: PRF-ExtraSrc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PRFExtraSrcDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PRF-ExtraSrc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PRFExtraSrcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PRFExtraSrcDocument
{
    
    public PRFExtraSrcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRFEXTRASRC$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PRF-ExtraSrc");
    
    
    /**
     * Gets the "PRF-ExtraSrc" element
     */
    public gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc getPRFExtraSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc target = null;
            target = (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc)get_store().find_element_user(PRFEXTRASRC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PRF-ExtraSrc" element
     */
    public void setPRFExtraSrc(gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc prfExtraSrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc target = null;
            target = (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc)get_store().find_element_user(PRFEXTRASRC$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc)get_store().add_element_user(PRFEXTRASRC$0);
            }
            target.set(prfExtraSrc);
        }
    }
    
    /**
     * Appends and returns a new empty "PRF-ExtraSrc" element
     */
    public gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc addNewPRFExtraSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc target = null;
            target = (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc)get_store().add_element_user(PRFEXTRASRC$0);
            return target;
        }
    }
    /**
     * An XML PRF-ExtraSrc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PRFExtraSrcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc
    {
        
        public PRFExtraSrcImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOST$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "host");
        private static final javax.xml.namespace.QName PART$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "part");
        private static final javax.xml.namespace.QName STATE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "state");
        private static final javax.xml.namespace.QName STRAIN$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strain");
        private static final javax.xml.namespace.QName TAXON$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "taxon");
        
        
        /**
         * Gets the "host" element
         */
        public java.lang.String getHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "host" element
         */
        public org.apache.xmlbeans.XmlString xgetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "host" element
         */
        public boolean isSetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOST$0) != 0;
            }
        }
        
        /**
         * Sets the "host" element
         */
        public void setHost(java.lang.String host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$0);
                }
                target.setStringValue(host);
            }
        }
        
        /**
         * Sets (as xml) the "host" element
         */
        public void xsetHost(org.apache.xmlbeans.XmlString host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$0);
                }
                target.set(host);
            }
        }
        
        /**
         * Unsets the "host" element
         */
        public void unsetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOST$0, 0);
            }
        }
        
        /**
         * Gets the "part" element
         */
        public java.lang.String getPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PART$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "part" element
         */
        public org.apache.xmlbeans.XmlString xgetPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PART$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "part" element
         */
        public boolean isSetPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PART$2) != 0;
            }
        }
        
        /**
         * Sets the "part" element
         */
        public void setPart(java.lang.String part)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PART$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PART$2);
                }
                target.setStringValue(part);
            }
        }
        
        /**
         * Sets (as xml) the "part" element
         */
        public void xsetPart(org.apache.xmlbeans.XmlString part)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PART$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PART$2);
                }
                target.set(part);
            }
        }
        
        /**
         * Unsets the "part" element
         */
        public void unsetPart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PART$2, 0);
            }
        }
        
        /**
         * Gets the "state" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" element
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "state" element
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATE$4) != 0;
            }
        }
        
        /**
         * Sets the "state" element
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" element
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$4);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "state" element
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATE$4, 0);
            }
        }
        
        /**
         * Gets the "strain" element
         */
        public java.lang.String getStrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRAIN$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strain" element
         */
        public org.apache.xmlbeans.XmlString xgetStrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRAIN$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "strain" element
         */
        public boolean isSetStrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRAIN$6) != 0;
            }
        }
        
        /**
         * Sets the "strain" element
         */
        public void setStrain(java.lang.String strain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRAIN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRAIN$6);
                }
                target.setStringValue(strain);
            }
        }
        
        /**
         * Sets (as xml) the "strain" element
         */
        public void xsetStrain(org.apache.xmlbeans.XmlString strain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRAIN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRAIN$6);
                }
                target.set(strain);
            }
        }
        
        /**
         * Unsets the "strain" element
         */
        public void unsetStrain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRAIN$6, 0);
            }
        }
        
        /**
         * Gets the "taxon" element
         */
        public java.lang.String getTaxon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXON$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taxon" element
         */
        public org.apache.xmlbeans.XmlString xgetTaxon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXON$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "taxon" element
         */
        public boolean isSetTaxon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXON$8) != 0;
            }
        }
        
        /**
         * Sets the "taxon" element
         */
        public void setTaxon(java.lang.String taxon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXON$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXON$8);
                }
                target.setStringValue(taxon);
            }
        }
        
        /**
         * Sets (as xml) the "taxon" element
         */
        public void xsetTaxon(org.apache.xmlbeans.XmlString taxon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXON$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAXON$8);
                }
                target.set(taxon);
            }
        }
        
        /**
         * Unsets the "taxon" element
         */
        public void unsetTaxon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXON$8, 0);
            }
        }
    }
}
