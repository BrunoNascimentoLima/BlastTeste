/*
 * An XML document type.
 * Localname: CommonString-table
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CommonStringTableDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one CommonString-table(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CommonStringTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CommonStringTableDocument
{
    
    public CommonStringTableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMONSTRINGTABLE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CommonString-table");
    
    
    /**
     * Gets the "CommonString-table" element
     */
    public gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable getCommonStringTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable target = null;
            target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().find_element_user(COMMONSTRINGTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CommonString-table" element
     */
    public void setCommonStringTable(gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable commonStringTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable target = null;
            target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().find_element_user(COMMONSTRINGTABLE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().add_element_user(COMMONSTRINGTABLE$0);
            }
            target.set(commonStringTable);
        }
    }
    
    /**
     * Appends and returns a new empty "CommonString-table" element
     */
    public gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable addNewCommonStringTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable target = null;
            target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().add_element_user(COMMONSTRINGTABLE$0);
            return target;
        }
    }
    /**
     * An XML CommonString-table(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CommonStringTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable
    {
        
        public CommonStringTableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRINGS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strings");
        private static final javax.xml.namespace.QName INDEXES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "indexes");
        
        
        /**
         * Gets array of all "strings" elements
         */
        public java.lang.String[] getStringsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRINGS$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "strings" element
         */
        public java.lang.String getStringsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "strings" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetStringsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRINGS$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "strings" element
         */
        public org.apache.xmlbeans.XmlString xgetStringsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "strings" element
         */
        public int sizeOfStringsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRINGS$0);
            }
        }
        
        /**
         * Sets array of all "strings" element
         */
        public void setStringsArray(java.lang.String[] stringsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stringsArray, STRINGS$0);
            }
        }
        
        /**
         * Sets ith "strings" element
         */
        public void setStringsArray(int i, java.lang.String strings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(strings);
            }
        }
        
        /**
         * Sets (as xml) array of all "strings" element
         */
        public void xsetStringsArray(org.apache.xmlbeans.XmlString[]stringsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stringsArray, STRINGS$0);
            }
        }
        
        /**
         * Sets (as xml) ith "strings" element
         */
        public void xsetStringsArray(int i, org.apache.xmlbeans.XmlString strings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(strings);
            }
        }
        
        /**
         * Inserts the value as the ith "strings" element
         */
        public void insertStrings(int i, java.lang.String strings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRINGS$0, i);
                target.setStringValue(strings);
            }
        }
        
        /**
         * Appends the value as the last "strings" element
         */
        public void addStrings(java.lang.String strings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGS$0);
                target.setStringValue(strings);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "strings" element
         */
        public org.apache.xmlbeans.XmlString insertNewStrings(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRINGS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "strings" element
         */
        public org.apache.xmlbeans.XmlString addNewStrings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "strings" element
         */
        public void removeStrings(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRINGS$0, i);
            }
        }
        
        /**
         * Gets array of all "indexes" elements
         */
        public java.math.BigInteger[] getIndexesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDEXES$2, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "indexes" element
         */
        public java.math.BigInteger getIndexesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "indexes" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetIndexesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDEXES$2, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "indexes" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIndexesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDEXES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "indexes" element
         */
        public int sizeOfIndexesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXES$2);
            }
        }
        
        /**
         * Sets array of all "indexes" element
         */
        public void setIndexesArray(java.math.BigInteger[] indexesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indexesArray, INDEXES$2);
            }
        }
        
        /**
         * Sets ith "indexes" element
         */
        public void setIndexesArray(int i, java.math.BigInteger indexes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(indexes);
            }
        }
        
        /**
         * Sets (as xml) array of all "indexes" element
         */
        public void xsetIndexesArray(org.apache.xmlbeans.XmlInteger[]indexesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indexesArray, INDEXES$2);
            }
        }
        
        /**
         * Sets (as xml) ith "indexes" element
         */
        public void xsetIndexesArray(int i, org.apache.xmlbeans.XmlInteger indexes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDEXES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(indexes);
            }
        }
        
        /**
         * Inserts the value as the ith "indexes" element
         */
        public void insertIndexes(int i, java.math.BigInteger indexes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INDEXES$2, i);
                target.setBigIntegerValue(indexes);
            }
        }
        
        /**
         * Appends the value as the last "indexes" element
         */
        public void addIndexes(java.math.BigInteger indexes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDEXES$2);
                target.setBigIntegerValue(indexes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexes" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewIndexes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(INDEXES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexes" element
         */
        public org.apache.xmlbeans.XmlInteger addNewIndexes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INDEXES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexes" element
         */
        public void removeIndexes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXES$2, i);
            }
        }
    }
}
