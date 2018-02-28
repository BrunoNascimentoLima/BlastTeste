/*
 * An XML document type.
 * Localname: Blast4-get-seq-parts-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-seq-parts-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSeqPartsReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument
{
    
    public Blast4GetSeqPartsReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEQPARTSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-seq-parts-reply");
    
    
    /**
     * Gets the "Blast4-get-seq-parts-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply getBlast4GetSeqPartsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().find_element_user(BLAST4GETSEQPARTSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-seq-parts-reply" element
     */
    public void setBlast4GetSeqPartsReply(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply blast4GetSeqPartsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().find_element_user(BLAST4GETSEQPARTSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().add_element_user(BLAST4GETSEQPARTSREPLY$0);
            }
            target.set(blast4GetSeqPartsReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-seq-parts-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply addNewBlast4GetSeqPartsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().add_element_user(BLAST4GETSEQPARTSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-seq-parts-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSeqPartsReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply
    {
        
        public Blast4GetSeqPartsReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4SEQPARTDATA$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-seq-part-data");
        
        
        /**
         * Gets array of all "Blast4-seq-part-data" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData[] getBlast4SeqPartDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4SEQPARTDATA$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData[] result = new gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-seq-part-data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData getBlast4SeqPartDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().find_element_user(BLAST4SEQPARTDATA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-seq-part-data" element
         */
        public int sizeOfBlast4SeqPartDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4SEQPARTDATA$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-seq-part-data" element
         */
        public void setBlast4SeqPartDataArray(gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData[] blast4SeqPartDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4SeqPartDataArray, BLAST4SEQPARTDATA$0);
            }
        }
        
        /**
         * Sets ith "Blast4-seq-part-data" element
         */
        public void setBlast4SeqPartDataArray(int i, gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData blast4SeqPartData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().find_element_user(BLAST4SEQPARTDATA$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4SeqPartData);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-seq-part-data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData insertNewBlast4SeqPartData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().insert_element_user(BLAST4SEQPARTDATA$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-seq-part-data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData addNewBlast4SeqPartData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().add_element_user(BLAST4SEQPARTDATA$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-seq-part-data" element
         */
        public void removeBlast4SeqPartData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4SEQPARTDATA$0, i);
            }
        }
    }
}
