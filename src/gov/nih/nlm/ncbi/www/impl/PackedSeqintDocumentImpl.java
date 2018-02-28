/*
 * An XML document type.
 * Localname: Packed-seqint
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PackedSeqintDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Packed-seqint(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PackedSeqintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqintDocument
{
    
    public PackedSeqintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKEDSEQINT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Packed-seqint");
    
    
    /**
     * Gets the "Packed-seqint" element
     */
    public gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint getPackedSeqint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().find_element_user(PACKEDSEQINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Packed-seqint" element
     */
    public void setPackedSeqint(gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint packedSeqint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().find_element_user(PACKEDSEQINT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().add_element_user(PACKEDSEQINT$0);
            }
            target.set(packedSeqint);
        }
    }
    
    /**
     * Appends and returns a new empty "Packed-seqint" element
     */
    public gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint addNewPackedSeqint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().add_element_user(PACKEDSEQINT$0);
            return target;
        }
    }
    /**
     * An XML Packed-seqint(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PackedSeqintImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint
    {
        
        public PackedSeqintImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQINTERVAL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-interval");
        
        
        /**
         * Gets array of all "Seq-interval" elements
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] getSeqIntervalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEQINTERVAL$0, targetList);
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] result = new gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Seq-interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqIntervalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Seq-interval" element
         */
        public int sizeOfSeqIntervalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQINTERVAL$0);
            }
        }
        
        /**
         * Sets array of all "Seq-interval" element
         */
        public void setSeqIntervalArray(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] seqIntervalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seqIntervalArray, SEQINTERVAL$0);
            }
        }
        
        /**
         * Sets ith "Seq-interval" element
         */
        public void setSeqIntervalArray(int i, gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(seqInterval);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Seq-interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval insertNewSeqInterval(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().insert_element_user(SEQINTERVAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Seq-interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Seq-interval" element
         */
        public void removeSeqInterval(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQINTERVAL$0, i);
            }
        }
    }
}
