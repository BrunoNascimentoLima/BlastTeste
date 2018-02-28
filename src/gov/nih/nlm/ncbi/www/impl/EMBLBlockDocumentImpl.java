/*
 * An XML document type.
 * Localname: EMBL-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EMBLBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one EMBL-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class EMBLBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument
{
    
    public EMBLBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBLBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EMBL-block");
    
    
    /**
     * Gets the "EMBL-block" element
     */
    public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock getEMBLBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().find_element_user(EMBLBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EMBL-block" element
     */
    public void setEMBLBlock(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock emblBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().find_element_user(EMBLBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().add_element_user(EMBLBLOCK$0);
            }
            target.set(emblBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "EMBL-block" element
     */
    public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock addNewEMBLBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().add_element_user(EMBLBLOCK$0);
            return target;
        }
    }
    /**
     * An XML EMBL-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class EMBLBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock
    {
        
        public EMBLBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASS1$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName DIV$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "div");
        private static final javax.xml.namespace.QName CREATIONDATE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "creation-date");
        private static final javax.xml.namespace.QName UPDATEDATE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "update-date");
        private static final javax.xml.namespace.QName EXTRAACC$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "extra-acc");
        private static final javax.xml.namespace.QName KEYWORDS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "keywords");
        private static final javax.xml.namespace.QName XREF$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "xref");
        
        
        /**
         * Gets the "class" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "class" element
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASS1$0) != 0;
            }
        }
        
        /**
         * Sets the "class" element
         */
        public void setClass1(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class)get_store().add_element_user(CLASS1$0);
                }
                target.set(class1);
            }
        }
        
        /**
         * Appends and returns a new empty "class" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class)get_store().add_element_user(CLASS1$0);
                return target;
            }
        }
        
        /**
         * Unsets the "class" element
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASS1$0, 0);
            }
        }
        
        /**
         * Gets the "div" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div getDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div)get_store().find_element_user(DIV$2, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(DIV$2) != 0;
            }
        }
        
        /**
         * Sets the "div" element
         */
        public void setDiv(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div)get_store().find_element_user(DIV$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div)get_store().add_element_user(DIV$2);
                }
                target.set(div);
            }
        }
        
        /**
         * Appends and returns a new empty "div" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div addNewDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div)get_store().add_element_user(DIV$2);
                return target;
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
                get_store().remove_element(DIV$2, 0);
            }
        }
        
        /**
         * Gets the "creation-date" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate getCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate)get_store().find_element_user(CREATIONDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "creation-date" element
         */
        public void setCreationDate(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate creationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate)get_store().find_element_user(CREATIONDATE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate)get_store().add_element_user(CREATIONDATE$4);
                }
                target.set(creationDate);
            }
        }
        
        /**
         * Appends and returns a new empty "creation-date" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate addNewCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate)get_store().add_element_user(CREATIONDATE$4);
                return target;
            }
        }
        
        /**
         * Gets the "update-date" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate getUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate)get_store().find_element_user(UPDATEDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "update-date" element
         */
        public void setUpdateDate(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate updateDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate)get_store().find_element_user(UPDATEDATE$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate)get_store().add_element_user(UPDATEDATE$6);
                }
                target.set(updateDate);
            }
        }
        
        /**
         * Appends and returns a new empty "update-date" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate addNewUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate)get_store().add_element_user(UPDATEDATE$6);
                return target;
            }
        }
        
        /**
         * Gets array of all "extra-acc" elements
         */
        public java.lang.String[] getExtraAccArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAACC$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "extra-acc" element
         */
        public java.lang.String getExtraAccArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAACC$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "extra-acc" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetExtraAccArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAACC$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "extra-acc" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraAccArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAACC$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "extra-acc" element
         */
        public int sizeOfExtraAccArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTRAACC$8);
            }
        }
        
        /**
         * Sets array of all "extra-acc" element
         */
        public void setExtraAccArray(java.lang.String[] extraAccArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraAccArray, EXTRAACC$8);
            }
        }
        
        /**
         * Sets ith "extra-acc" element
         */
        public void setExtraAccArray(int i, java.lang.String extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAACC$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(extraAcc);
            }
        }
        
        /**
         * Sets (as xml) array of all "extra-acc" element
         */
        public void xsetExtraAccArray(org.apache.xmlbeans.XmlString[]extraAccArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraAccArray, EXTRAACC$8);
            }
        }
        
        /**
         * Sets (as xml) ith "extra-acc" element
         */
        public void xsetExtraAccArray(int i, org.apache.xmlbeans.XmlString extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAACC$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extraAcc);
            }
        }
        
        /**
         * Inserts the value as the ith "extra-acc" element
         */
        public void insertExtraAcc(int i, java.lang.String extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXTRAACC$8, i);
                target.setStringValue(extraAcc);
            }
        }
        
        /**
         * Appends the value as the last "extra-acc" element
         */
        public void addExtraAcc(java.lang.String extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAACC$8);
                target.setStringValue(extraAcc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extra-acc" element
         */
        public org.apache.xmlbeans.XmlString insertNewExtraAcc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXTRAACC$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extra-acc" element
         */
        public org.apache.xmlbeans.XmlString addNewExtraAcc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAACC$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "extra-acc" element
         */
        public void removeExtraAcc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTRAACC$8, i);
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
                get_store().find_all_element_users(KEYWORDS$10, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$10, i);
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
                get_store().find_all_element_users(KEYWORDS$10, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$10, i);
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
                return get_store().count_elements(KEYWORDS$10);
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
                arraySetterHelper(keywordsArray, KEYWORDS$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$10, i);
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
                arraySetterHelper(keywordsArray, KEYWORDS$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$10, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORDS$10, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORDS$10, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$10);
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
                get_store().remove_element(KEYWORDS$10, i);
            }
        }
        
        /**
         * Gets the "xref" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref getXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref)get_store().find_element_user(XREF$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "xref" element
         */
        public boolean isSetXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(XREF$12) != 0;
            }
        }
        
        /**
         * Sets the "xref" element
         */
        public void setXref(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref xref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref)get_store().find_element_user(XREF$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref)get_store().add_element_user(XREF$12);
                }
                target.set(xref);
            }
        }
        
        /**
         * Appends and returns a new empty "xref" element
         */
        public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref addNewXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref)get_store().add_element_user(XREF$12);
                return target;
            }
        }
        
        /**
         * Unsets the "xref" element
         */
        public void unsetXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(XREF$12, 0);
            }
        }
        /**
         * An XML class(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ClassImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class
        {
            
            public ClassImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EMBLBlockDocument$EMBLBlock$Class$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML div(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DivImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div
        {
            
            public DivImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EMBLBlockDocument$EMBLBlock$Div$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML creation-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CreationDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate
        {
            
            public CreationDateImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML update-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UpdateDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate
        {
            
            public UpdateDateImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML xref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class XrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref
        {
            
            public XrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EMBLXREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EMBL-xref");
            
            
            /**
             * Gets array of all "EMBL-xref" elements
             */
            public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref[] getEMBLXrefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EMBLXREF$0, targetList);
                    gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref[] result = new gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "EMBL-xref" element
             */
            public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref getEMBLXrefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().find_element_user(EMBLXREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "EMBL-xref" element
             */
            public int sizeOfEMBLXrefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMBLXREF$0);
                }
            }
            
            /**
             * Sets array of all "EMBL-xref" element
             */
            public void setEMBLXrefArray(gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref[] emblXrefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(emblXrefArray, EMBLXREF$0);
                }
            }
            
            /**
             * Sets ith "EMBL-xref" element
             */
            public void setEMBLXrefArray(int i, gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref emblXref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().find_element_user(EMBLXREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(emblXref);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "EMBL-xref" element
             */
            public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref insertNewEMBLXref(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().insert_element_user(EMBLXREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "EMBL-xref" element
             */
            public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref addNewEMBLXref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().add_element_user(EMBLXREF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "EMBL-xref" element
             */
            public void removeEMBLXref(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMBLXREF$0, i);
                }
            }
        }
    }
}
