/*
 * An XML document type.
 * Localname: Blast4-get-sequences-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-sequences-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSequencesReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument
{
    
    public Blast4GetSequencesReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEQUENCESREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-sequences-reply");
    
    
    /**
     * Gets the "Blast4-get-sequences-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply getBlast4GetSequencesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().find_element_user(BLAST4GETSEQUENCESREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-sequences-reply" element
     */
    public void setBlast4GetSequencesReply(gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply blast4GetSequencesReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().find_element_user(BLAST4GETSEQUENCESREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().add_element_user(BLAST4GETSEQUENCESREPLY$0);
            }
            target.set(blast4GetSequencesReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-sequences-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply addNewBlast4GetSequencesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().add_element_user(BLAST4GETSEQUENCESREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-sequences-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSequencesReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply
    {
        
        public Blast4GetSequencesReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BIOSEQ$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Bioseq");
        
        
        /**
         * Gets array of all "Bioseq" elements
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] getBioseqArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIOSEQ$0, targetList);
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] result = new gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Bioseq" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseqArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Bioseq" element
         */
        public int sizeOfBioseqArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOSEQ$0);
            }
        }
        
        /**
         * Sets array of all "Bioseq" element
         */
        public void setBioseqArray(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] bioseqArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bioseqArray, BIOSEQ$0);
            }
        }
        
        /**
         * Sets ith "Bioseq" element
         */
        public void setBioseqArray(int i, gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bioseq);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Bioseq" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq insertNewBioseq(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().insert_element_user(BIOSEQ$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Bioseq" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq addNewBioseq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().add_element_user(BIOSEQ$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Bioseq" element
         */
        public void removeBioseq(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOSEQ$0, i);
            }
        }
    }
}
