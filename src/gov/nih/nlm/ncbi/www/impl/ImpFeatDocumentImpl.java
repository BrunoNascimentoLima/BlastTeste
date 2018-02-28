/*
 * An XML document type.
 * Localname: Imp-feat
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ImpFeatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Imp-feat(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ImpFeatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImpFeatDocument
{
    
    public ImpFeatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPFEAT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Imp-feat");
    
    
    /**
     * Gets the "Imp-feat" element
     */
    public gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat getImpFeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat target = null;
            target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().find_element_user(IMPFEAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Imp-feat" element
     */
    public void setImpFeat(gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat impFeat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat target = null;
            target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().find_element_user(IMPFEAT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().add_element_user(IMPFEAT$0);
            }
            target.set(impFeat);
        }
    }
    
    /**
     * Appends and returns a new empty "Imp-feat" element
     */
    public gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat addNewImpFeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat target = null;
            target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().add_element_user(IMPFEAT$0);
            return target;
        }
    }
    /**
     * An XML Imp-feat(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ImpFeatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat
    {
        
        public ImpFeatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "key");
        private static final javax.xml.namespace.QName LOC$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
        private static final javax.xml.namespace.QName DESCR$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "descr");
        
        
        /**
         * Gets the "key" element
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key" element
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "key" element
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" element
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Gets the "loc" element
         */
        public java.lang.String getLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOC$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "loc" element
         */
        public org.apache.xmlbeans.XmlString xgetLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOC$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "loc" element
         */
        public boolean isSetLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOC$2) != 0;
            }
        }
        
        /**
         * Sets the "loc" element
         */
        public void setLoc(java.lang.String loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOC$2);
                }
                target.setStringValue(loc);
            }
        }
        
        /**
         * Sets (as xml) the "loc" element
         */
        public void xsetLoc(org.apache.xmlbeans.XmlString loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOC$2);
                }
                target.set(loc);
            }
        }
        
        /**
         * Unsets the "loc" element
         */
        public void unsetLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOC$2, 0);
            }
        }
        
        /**
         * Gets the "descr" element
         */
        public java.lang.String getDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "descr" element
         */
        public org.apache.xmlbeans.XmlString xgetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCR$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "descr" element
         */
        public boolean isSetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCR$4) != 0;
            }
        }
        
        /**
         * Sets the "descr" element
         */
        public void setDescr(java.lang.String descr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCR$4);
                }
                target.setStringValue(descr);
            }
        }
        
        /**
         * Sets (as xml) the "descr" element
         */
        public void xsetDescr(org.apache.xmlbeans.XmlString descr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCR$4);
                }
                target.set(descr);
            }
        }
        
        /**
         * Unsets the "descr" element
         */
        public void unsetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCR$4, 0);
            }
        }
    }
}
