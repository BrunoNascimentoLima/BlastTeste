/*
 * An XML document type.
 * Localname: Clone-seq-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CloneSeqSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Clone-seq-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CloneSeqSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqSetDocument
{
    
    public CloneSeqSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLONESEQSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Clone-seq-set");
    
    
    /**
     * Gets the "Clone-seq-set" element
     */
    public gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet getCloneSeqSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet target = null;
            target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().find_element_user(CLONESEQSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Clone-seq-set" element
     */
    public void setCloneSeqSet(gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet cloneSeqSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet target = null;
            target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().find_element_user(CLONESEQSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().add_element_user(CLONESEQSET$0);
            }
            target.set(cloneSeqSet);
        }
    }
    
    /**
     * Appends and returns a new empty "Clone-seq-set" element
     */
    public gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet addNewCloneSeqSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet target = null;
            target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().add_element_user(CLONESEQSET$0);
            return target;
        }
    }
    /**
     * An XML Clone-seq-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CloneSeqSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet
    {
        
        public CloneSeqSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLONESEQ$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Clone-seq");
        
        
        /**
         * Gets array of all "Clone-seq" elements
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq[] getCloneSeqArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLONESEQ$0, targetList);
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq[] result = new gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Clone-seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq getCloneSeqArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().find_element_user(CLONESEQ$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Clone-seq" element
         */
        public int sizeOfCloneSeqArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLONESEQ$0);
            }
        }
        
        /**
         * Sets array of all "Clone-seq" element
         */
        public void setCloneSeqArray(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq[] cloneSeqArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cloneSeqArray, CLONESEQ$0);
            }
        }
        
        /**
         * Sets ith "Clone-seq" element
         */
        public void setCloneSeqArray(int i, gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq cloneSeq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().find_element_user(CLONESEQ$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cloneSeq);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Clone-seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq insertNewCloneSeq(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().insert_element_user(CLONESEQ$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Clone-seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq addNewCloneSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().add_element_user(CLONESEQ$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Clone-seq" element
         */
        public void removeCloneSeq(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLONESEQ$0, i);
            }
        }
    }
}
