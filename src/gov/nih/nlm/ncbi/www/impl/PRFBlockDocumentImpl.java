/*
 * An XML document type.
 * Localname: PRF-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PRFBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PRF-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PRFBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PRFBlockDocument
{
    
    public PRFBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRFBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PRF-block");
    
    
    /**
     * Gets the "PRF-block" element
     */
    public gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock getPRFBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().find_element_user(PRFBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PRF-block" element
     */
    public void setPRFBlock(gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock prfBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().find_element_user(PRFBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().add_element_user(PRFBLOCK$0);
            }
            target.set(prfBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "PRF-block" element
     */
    public gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock addNewPRFBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().add_element_user(PRFBLOCK$0);
            return target;
        }
    }
    /**
     * An XML PRF-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PRFBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock
    {
        
        public PRFBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTRASRC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "extra-src");
        private static final javax.xml.namespace.QName KEYWORDS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "keywords");
        
        
        /**
         * Gets the "extra-src" element
         */
        public gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc getExtraSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc target = null;
                target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc)get_store().find_element_user(EXTRASRC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "extra-src" element
         */
        public boolean isSetExtraSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTRASRC$0) != 0;
            }
        }
        
        /**
         * Sets the "extra-src" element
         */
        public void setExtraSrc(gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc extraSrc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc target = null;
                target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc)get_store().find_element_user(EXTRASRC$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc)get_store().add_element_user(EXTRASRC$0);
                }
                target.set(extraSrc);
            }
        }
        
        /**
         * Appends and returns a new empty "extra-src" element
         */
        public gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc addNewExtraSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc target = null;
                target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc)get_store().add_element_user(EXTRASRC$0);
                return target;
            }
        }
        
        /**
         * Unsets the "extra-src" element
         */
        public void unsetExtraSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTRASRC$0, 0);
            }
        }
        
        /**
         * Gets array of all "keywords" elements
         */
        public java.lang.String[] getKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORDS$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "keywords" element
         */
        public java.lang.String getKeywordsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "keywords" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORDS$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "keywords" element
         */
        public org.apache.xmlbeans.XmlString xgetKeywordsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "keywords" element
         */
        public int sizeOfKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORDS$2);
            }
        }
        
        /**
         * Sets array of all "keywords" element
         */
        public void setKeywordsArray(java.lang.String[] keywordsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordsArray, KEYWORDS$2);
            }
        }
        
        /**
         * Sets ith "keywords" element
         */
        public void setKeywordsArray(int i, java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Sets (as xml) array of all "keywords" element
         */
        public void xsetKeywordsArray(org.apache.xmlbeans.XmlString[]keywordsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordsArray, KEYWORDS$2);
            }
        }
        
        /**
         * Sets (as xml) ith "keywords" element
         */
        public void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keywords);
            }
        }
        
        /**
         * Inserts the value as the ith "keywords" element
         */
        public void insertKeywords(int i, java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORDS$2, i);
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Appends the value as the last "keywords" element
         */
        public void addKeywords(java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$2);
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keywords" element
         */
        public org.apache.xmlbeans.XmlString insertNewKeywords(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORDS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keywords" element
         */
        public org.apache.xmlbeans.XmlString addNewKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "keywords" element
         */
        public void removeKeywords(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORDS$2, i);
            }
        }
        /**
         * An XML extra-src(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtraSrcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock.ExtraSrc
        {
            
            public ExtraSrcImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
