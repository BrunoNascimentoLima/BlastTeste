/*
 * An XML document type.
 * Localname: Seq-descr
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqDescrDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-descr(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqDescrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDescrDocument
{
    
    public SeqDescrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQDESCR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-descr");
    
    
    /**
     * Gets the "Seq-descr" element
     */
    public gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr getSeqDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
            target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().find_element_user(SEQDESCR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-descr" element
     */
    public void setSeqDescr(gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr seqDescr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
            target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().find_element_user(SEQDESCR$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().add_element_user(SEQDESCR$0);
            }
            target.set(seqDescr);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-descr" element
     */
    public gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr addNewSeqDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
            target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().add_element_user(SEQDESCR$0);
            return target;
        }
    }
    /**
     * An XML Seq-descr(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqDescrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr
    {
        
        public SeqDescrImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQDESC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seqdesc");
        
        
        /**
         * Gets array of all "Seqdesc" elements
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc[] getSeqdescArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEQDESC$0, targetList);
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc[] result = new gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Seqdesc" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc getSeqdescArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().find_element_user(SEQDESC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Seqdesc" element
         */
        public int sizeOfSeqdescArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQDESC$0);
            }
        }
        
        /**
         * Sets array of all "Seqdesc" element
         */
        public void setSeqdescArray(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc[] seqdescArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seqdescArray, SEQDESC$0);
            }
        }
        
        /**
         * Sets ith "Seqdesc" element
         */
        public void setSeqdescArray(int i, gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc seqdesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().find_element_user(SEQDESC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(seqdesc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Seqdesc" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc insertNewSeqdesc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().insert_element_user(SEQDESC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Seqdesc" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc addNewSeqdesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().add_element_user(SEQDESC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Seqdesc" element
         */
        public void removeSeqdesc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQDESC$0, i);
            }
        }
    }
}
