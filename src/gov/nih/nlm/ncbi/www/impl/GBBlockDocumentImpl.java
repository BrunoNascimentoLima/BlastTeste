/*
 * An XML document type.
 * Localname: GB-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GBBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one GB-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GBBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GBBlockDocument
{
    
    public GBBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GBBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GB-block");
    
    
    /**
     * Gets the "GB-block" element
     */
    public gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock getGBBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock target = null;
            target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().find_element_user(GBBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GB-block" element
     */
    public void setGBBlock(gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock gbBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock target = null;
            target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().find_element_user(GBBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().add_element_user(GBBLOCK$0);
            }
            target.set(gbBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "GB-block" element
     */
    public gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock addNewGBBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock target = null;
            target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().add_element_user(GBBLOCK$0);
            return target;
        }
    }
    /**
     * An XML GB-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GBBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock
    {
        
        public GBBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTRAACCESSIONS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "extra-accessions");
        private static final javax.xml.namespace.QName SOURCE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
        private static final javax.xml.namespace.QName KEYWORDS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "keywords");
        private static final javax.xml.namespace.QName ORIGIN$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "origin");
        private static final javax.xml.namespace.QName DATE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName ENTRYDATE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "entry-date");
        private static final javax.xml.namespace.QName DIV$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "div");
        private static final javax.xml.namespace.QName TAXONOMY$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "taxonomy");
        
        
        /**
         * Gets array of all "extra-accessions" elements
         */
        public java.lang.String[] getExtraAccessionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAACCESSIONS$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "extra-accessions" element
         */
        public java.lang.String getExtraAccessionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAACCESSIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "extra-accessions" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetExtraAccessionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAACCESSIONS$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "extra-accessions" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraAccessionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAACCESSIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "extra-accessions" element
         */
        public int sizeOfExtraAccessionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTRAACCESSIONS$0);
            }
        }
        
        /**
         * Sets array of all "extra-accessions" element
         */
        public void setExtraAccessionsArray(java.lang.String[] extraAccessionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraAccessionsArray, EXTRAACCESSIONS$0);
            }
        }
        
        /**
         * Sets ith "extra-accessions" element
         */
        public void setExtraAccessionsArray(int i, java.lang.String extraAccessions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAACCESSIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(extraAccessions);
            }
        }
        
        /**
         * Sets (as xml) array of all "extra-accessions" element
         */
        public void xsetExtraAccessionsArray(org.apache.xmlbeans.XmlString[]extraAccessionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraAccessionsArray, EXTRAACCESSIONS$0);
            }
        }
        
        /**
         * Sets (as xml) ith "extra-accessions" element
         */
        public void xsetExtraAccessionsArray(int i, org.apache.xmlbeans.XmlString extraAccessions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAACCESSIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extraAccessions);
            }
        }
        
        /**
         * Inserts the value as the ith "extra-accessions" element
         */
        public void insertExtraAccessions(int i, java.lang.String extraAccessions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXTRAACCESSIONS$0, i);
                target.setStringValue(extraAccessions);
            }
        }
        
        /**
         * Appends the value as the last "extra-accessions" element
         */
        public void addExtraAccessions(java.lang.String extraAccessions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAACCESSIONS$0);
                target.setStringValue(extraAccessions);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extra-accessions" element
         */
        public org.apache.xmlbeans.XmlString insertNewExtraAccessions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXTRAACCESSIONS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extra-accessions" element
         */
        public org.apache.xmlbeans.XmlString addNewExtraAccessions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAACCESSIONS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "extra-accessions" element
         */
        public void removeExtraAccessions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTRAACCESSIONS$0, i);
            }
        }
        
        /**
         * Gets the "source" element
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$2) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$2);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" element
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$2);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$2, 0);
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
                get_store().find_all_element_users(KEYWORDS$4, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$4, i);
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
                get_store().find_all_element_users(KEYWORDS$4, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$4, i);
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
                return get_store().count_elements(KEYWORDS$4);
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
                arraySetterHelper(keywordsArray, KEYWORDS$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$4, i);
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
                arraySetterHelper(keywordsArray, KEYWORDS$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$4, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORDS$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORDS$4, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$4);
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
                get_store().remove_element(KEYWORDS$4, i);
            }
        }
        
        /**
         * Gets the "origin" element
         */
        public java.lang.String getOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGIN$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "origin" element
         */
        public org.apache.xmlbeans.XmlString xgetOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGIN$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "origin" element
         */
        public boolean isSetOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORIGIN$6) != 0;
            }
        }
        
        /**
         * Sets the "origin" element
         */
        public void setOrigin(java.lang.String origin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGIN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGIN$6);
                }
                target.setStringValue(origin);
            }
        }
        
        /**
         * Sets (as xml) the "origin" element
         */
        public void xsetOrigin(org.apache.xmlbeans.XmlString origin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGIN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGIN$6);
                }
                target.set(origin);
            }
        }
        
        /**
         * Unsets the "origin" element
         */
        public void unsetOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORIGIN$6, 0);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public java.lang.String getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" element
         */
        public org.apache.xmlbeans.XmlString xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$8) != 0;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$8);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$8);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$8, 0);
            }
        }
        
        /**
         * Gets the "entry-date" element
         */
        public gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate getEntryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate target = null;
                target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate)get_store().find_element_user(ENTRYDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "entry-date" element
         */
        public boolean isSetEntryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTRYDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "entry-date" element
         */
        public void setEntryDate(gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate entryDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate target = null;
                target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate)get_store().find_element_user(ENTRYDATE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate)get_store().add_element_user(ENTRYDATE$10);
                }
                target.set(entryDate);
            }
        }
        
        /**
         * Appends and returns a new empty "entry-date" element
         */
        public gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate addNewEntryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate target = null;
                target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate)get_store().add_element_user(ENTRYDATE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "entry-date" element
         */
        public void unsetEntryDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTRYDATE$10, 0);
            }
        }
        
        /**
         * Gets the "div" element
         */
        public java.lang.String getDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIV$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "div" element
         */
        public org.apache.xmlbeans.XmlString xgetDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIV$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "div" element
         */
        public boolean isSetDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIV$12) != 0;
            }
        }
        
        /**
         * Sets the "div" element
         */
        public void setDiv(java.lang.String div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIV$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIV$12);
                }
                target.setStringValue(div);
            }
        }
        
        /**
         * Sets (as xml) the "div" element
         */
        public void xsetDiv(org.apache.xmlbeans.XmlString div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIV$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIV$12);
                }
                target.set(div);
            }
        }
        
        /**
         * Unsets the "div" element
         */
        public void unsetDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIV$12, 0);
            }
        }
        
        /**
         * Gets the "taxonomy" element
         */
        public java.lang.String getTaxonomy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMY$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taxonomy" element
         */
        public org.apache.xmlbeans.XmlString xgetTaxonomy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXONOMY$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "taxonomy" element
         */
        public boolean isSetTaxonomy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXONOMY$14) != 0;
            }
        }
        
        /**
         * Sets the "taxonomy" element
         */
        public void setTaxonomy(java.lang.String taxonomy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXONOMY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXONOMY$14);
                }
                target.setStringValue(taxonomy);
            }
        }
        
        /**
         * Sets (as xml) the "taxonomy" element
         */
        public void xsetTaxonomy(org.apache.xmlbeans.XmlString taxonomy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXONOMY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAXONOMY$14);
                }
                target.set(taxonomy);
            }
        }
        
        /**
         * Unsets the "taxonomy" element
         */
        public void unsetTaxonomy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXONOMY$14, 0);
            }
        }
        /**
         * An XML entry-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EntryDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate
        {
            
            public EntryDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
    }
}
