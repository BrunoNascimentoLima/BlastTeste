/*
 * An XML document type.
 * Localname: SeqTable-sparse-index
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqTable-sparse-index(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqTableSparseIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument
{
    
    public SeqTableSparseIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQTABLESPARSEINDEX$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-sparse-index");
    
    
    /**
     * Gets the "SeqTable-sparse-index" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex getSeqTableSparseIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().find_element_user(SEQTABLESPARSEINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqTable-sparse-index" element
     */
    public void setSeqTableSparseIndex(gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex seqTableSparseIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().find_element_user(SEQTABLESPARSEINDEX$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().add_element_user(SEQTABLESPARSEINDEX$0);
            }
            target.set(seqTableSparseIndex);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqTable-sparse-index" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex addNewSeqTableSparseIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().add_element_user(SEQTABLESPARSEINDEX$0);
            return target;
        }
    }
    /**
     * An XML SeqTable-sparse-index(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqTableSparseIndexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex
    {
        
        public SeqTableSparseIndexImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXES$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "indexes");
        private static final javax.xml.namespace.QName BITSET$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bit-set");
        
        
        /**
         * Gets array of all "indexes" elements
         */
        public java.math.BigInteger[] getIndexesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDEXES$0, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXES$0, i);
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
                get_store().find_all_element_users(INDEXES$0, targetList);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDEXES$0, i);
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
                return get_store().count_elements(INDEXES$0);
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
                arraySetterHelper(indexesArray, INDEXES$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEXES$0, i);
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
                arraySetterHelper(indexesArray, INDEXES$0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDEXES$0, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INDEXES$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDEXES$0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(INDEXES$0, i);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INDEXES$0);
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
                get_store().remove_element(INDEXES$0, i);
            }
        }
        
        /**
         * Gets the "bit-set" element
         */
        public byte[] getBitSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BITSET$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "bit-set" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetBitSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BITSET$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "bit-set" element
         */
        public boolean isSetBitSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BITSET$2) != 0;
            }
        }
        
        /**
         * Sets the "bit-set" element
         */
        public void setBitSet(byte[] bitSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BITSET$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BITSET$2);
                }
                target.setByteArrayValue(bitSet);
            }
        }
        
        /**
         * Sets (as xml) the "bit-set" element
         */
        public void xsetBitSet(org.apache.xmlbeans.XmlHexBinary bitSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BITSET$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(BITSET$2);
                }
                target.set(bitSet);
            }
        }
        
        /**
         * Unsets the "bit-set" element
         */
        public void unsetBitSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BITSET$2, 0);
            }
        }
    }
}
