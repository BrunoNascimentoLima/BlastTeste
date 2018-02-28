/*
 * An XML document type.
 * Localname: CommonBytes-table
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CommonBytesTableDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one CommonBytes-table(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CommonBytesTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CommonBytesTableDocument
{
    
    public CommonBytesTableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMONBYTESTABLE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CommonBytes-table");
    
    
    /**
     * Gets the "CommonBytes-table" element
     */
    public gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable getCommonBytesTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable target = null;
            target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().find_element_user(COMMONBYTESTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CommonBytes-table" element
     */
    public void setCommonBytesTable(gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable commonBytesTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable target = null;
            target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().find_element_user(COMMONBYTESTABLE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().add_element_user(COMMONBYTESTABLE$0);
            }
            target.set(commonBytesTable);
        }
    }
    
    /**
     * Appends and returns a new empty "CommonBytes-table" element
     */
    public gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable addNewCommonBytesTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable target = null;
            target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().add_element_user(COMMONBYTESTABLE$0);
            return target;
        }
    }
    /**
     * An XML CommonBytes-table(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CommonBytesTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable
    {
        
        public CommonBytesTableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BYTES$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bytes");
        private static final javax.xml.namespace.QName INDEXES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "indexes");
        
        
        /**
         * Gets array of all "bytes" elements
         */
        public byte[][] getBytesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BYTES$0, targetList);
                byte[][] result = new byte[targetList.size()][];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                return result;
            }
        }
        
        /**
         * Gets ith "bytes" element
         */
        public byte[] getBytesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "bytes" elements
         */
        public org.apache.xmlbeans.XmlHexBinary[] xgetBytesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BYTES$0, targetList);
                org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetBytesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BYTES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlHexBinary)target;
            }
        }
        
        /**
         * Returns number of "bytes" element
         */
        public int sizeOfBytesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BYTES$0);
            }
        }
        
        /**
         * Sets array of all "bytes" element
         */
        public void setBytesArray(byte[][] bytesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bytesArray, BYTES$0);
            }
        }
        
        /**
         * Sets ith "bytes" element
         */
        public void setBytesArray(int i, byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Sets (as xml) array of all "bytes" element
         */
        public void xsetBytesArray(org.apache.xmlbeans.XmlHexBinary[]bytesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bytesArray, BYTES$0);
            }
        }
        
        /**
         * Sets (as xml) ith "bytes" element
         */
        public void xsetBytesArray(int i, org.apache.xmlbeans.XmlHexBinary bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BYTES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bytes);
            }
        }
        
        /**
         * Inserts the value as the ith "bytes" element
         */
        public void insertBytes(int i, byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BYTES$0, i);
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Appends the value as the last "bytes" element
         */
        public void addBytes(byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYTES$0);
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary insertNewBytes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(BYTES$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary addNewBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(BYTES$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "bytes" element
         */
        public void removeBytes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BYTES$0, i);
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
