/*
 * An XML document type.
 * Localname: Delta-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DeltaExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Delta-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DeltaExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaExtDocument
{
    
    public DeltaExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELTAEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Delta-ext");
    
    
    /**
     * Gets the "Delta-ext" element
     */
    public gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt getDeltaExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().find_element_user(DELTAEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Delta-ext" element
     */
    public void setDeltaExt(gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt deltaExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().find_element_user(DELTAEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().add_element_user(DELTAEXT$0);
            }
            target.set(deltaExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Delta-ext" element
     */
    public gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt addNewDeltaExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().add_element_user(DELTAEXT$0);
            return target;
        }
    }
    /**
     * An XML Delta-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DeltaExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt
    {
        
        public DeltaExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELTASEQ$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Delta-seq");
        
        
        /**
         * Gets array of all "Delta-seq" elements
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq[] getDeltaSeqArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DELTASEQ$0, targetList);
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq[] result = new gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Delta-seq" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq getDeltaSeqArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().find_element_user(DELTASEQ$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Delta-seq" element
         */
        public int sizeOfDeltaSeqArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELTASEQ$0);
            }
        }
        
        /**
         * Sets array of all "Delta-seq" element
         */
        public void setDeltaSeqArray(gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq[] deltaSeqArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(deltaSeqArray, DELTASEQ$0);
            }
        }
        
        /**
         * Sets ith "Delta-seq" element
         */
        public void setDeltaSeqArray(int i, gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq deltaSeq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().find_element_user(DELTASEQ$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(deltaSeq);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Delta-seq" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq insertNewDeltaSeq(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().insert_element_user(DELTASEQ$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Delta-seq" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq addNewDeltaSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().add_element_user(DELTASEQ$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Delta-seq" element
         */
        public void removeDeltaSeq(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELTASEQ$0, i);
            }
        }
    }
}
