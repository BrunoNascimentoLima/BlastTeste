/*
 * An XML document type.
 * Localname: Seq-id-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqIdSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-id-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqIdSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdSetDocument
{
    
    public SeqIdSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQIDSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id-set");
    
    
    /**
     * Gets the "Seq-id-set" element
     */
    public gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet getSeqIdSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet)get_store().find_element_user(SEQIDSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-id-set" element
     */
    public void setSeqIdSet(gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet seqIdSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet)get_store().find_element_user(SEQIDSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet)get_store().add_element_user(SEQIDSET$0);
            }
            target.set(seqIdSet);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-id-set" element
     */
    public gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet addNewSeqIdSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet)get_store().add_element_user(SEQIDSET$0);
            return target;
        }
    }
    /**
     * An XML Seq-id-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqIdSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdSetDocument.SeqIdSet
    {
        
        public SeqIdSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
        
        
        /**
         * Gets array of all "Seq-id" elements
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEQID$0, targetList);
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] result = new gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Seq-id" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Seq-id" element
         */
        public int sizeOfSeqIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQID$0);
            }
        }
        
        /**
         * Sets array of all "Seq-id" element
         */
        public void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seqIdArray, SEQID$0);
            }
        }
        
        /**
         * Sets ith "Seq-id" element
         */
        public void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(seqId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().insert_element_user(SEQID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Seq-id" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Seq-id" element
         */
        public void removeSeqId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQID$0, i);
            }
        }
    }
}
