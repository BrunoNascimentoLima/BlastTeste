/*
 * An XML document type.
 * Localname: Seg-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SegExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seg-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SegExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SegExtDocument
{
    
    public SegExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEGEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seg-ext");
    
    
    /**
     * Gets the "Seg-ext" element
     */
    public gov.nih.nlm.ncbi.www.SegExtDocument.SegExt getSegExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SegExtDocument.SegExt target = null;
            target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().find_element_user(SEGEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seg-ext" element
     */
    public void setSegExt(gov.nih.nlm.ncbi.www.SegExtDocument.SegExt segExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SegExtDocument.SegExt target = null;
            target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().find_element_user(SEGEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().add_element_user(SEGEXT$0);
            }
            target.set(segExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Seg-ext" element
     */
    public gov.nih.nlm.ncbi.www.SegExtDocument.SegExt addNewSegExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SegExtDocument.SegExt target = null;
            target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().add_element_user(SEGEXT$0);
            return target;
        }
    }
    /**
     * An XML Seg-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SegExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SegExtDocument.SegExt
    {
        
        public SegExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQLOC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
        
        
        /**
         * Gets array of all "Seq-loc" elements
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEQLOC$0, targetList);
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] result = new gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Seq-loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Seq-loc" element
         */
        public int sizeOfSeqLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQLOC$0);
            }
        }
        
        /**
         * Sets array of all "Seq-loc" element
         */
        public void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seqLocArray, SEQLOC$0);
            }
        }
        
        /**
         * Sets ith "Seq-loc" element
         */
        public void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(seqLoc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().insert_element_user(SEQLOC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Seq-loc" element
         */
        public void removeSeqLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQLOC$0, i);
            }
        }
    }
}
