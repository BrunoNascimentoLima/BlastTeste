/*
 * An XML document type.
 * Localname: Seq-align-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqAlignSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-align-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqAlignSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignSetDocument
{
    
    public SeqAlignSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQALIGNSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align-set");
    
    
    /**
     * Gets the "Seq-align-set" element
     */
    public gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet getSeqAlignSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
            target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-align-set" element
     */
    public void setSeqAlignSet(gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet seqAlignSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
            target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$0);
            }
            target.set(seqAlignSet);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-align-set" element
     */
    public gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet addNewSeqAlignSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
            target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$0);
            return target;
        }
    }
    /**
     * An XML Seq-align-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqAlignSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet
    {
        
        public SeqAlignSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQALIGN$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align");
        
        
        /**
         * Gets array of all "Seq-align" elements
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] getSeqAlignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEQALIGN$0, targetList);
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] result = new gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Seq-align" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlignArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Seq-align" element
         */
        public int sizeOfSeqAlignArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQALIGN$0);
            }
        }
        
        /**
         * Sets array of all "Seq-align" element
         */
        public void setSeqAlignArray(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] seqAlignArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seqAlignArray, SEQALIGN$0);
            }
        }
        
        /**
         * Sets ith "Seq-align" element
         */
        public void setSeqAlignArray(int i, gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(seqAlign);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Seq-align" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign insertNewSeqAlign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().insert_element_user(SEQALIGN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Seq-align" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().add_element_user(SEQALIGN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Seq-align" element
         */
        public void removeSeqAlign(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQALIGN$0, i);
            }
        }
    }
}
