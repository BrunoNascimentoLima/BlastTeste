/*
 * An XML document type.
 * Localname: Sparse-seg-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SparseSegExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Sparse-seg-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SparseSegExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegExtDocument
{
    
    public SparseSegExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPARSESEGEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Sparse-seg-ext");
    
    
    /**
     * Gets the "Sparse-seg-ext" element
     */
    public gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt getSparseSegExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
            target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().find_element_user(SPARSESEGEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sparse-seg-ext" element
     */
    public void setSparseSegExt(gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt sparseSegExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
            target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().find_element_user(SPARSESEGEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().add_element_user(SPARSESEGEXT$0);
            }
            target.set(sparseSegExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Sparse-seg-ext" element
     */
    public gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt addNewSparseSegExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
            target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().add_element_user(SPARSESEGEXT$0);
            return target;
        }
    }
    /**
     * An XML Sparse-seg-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SparseSegExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt
    {
        
        public SparseSegExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEX$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "index");
        
        
        /**
         * Gets the "index" element
         */
        public java.math.BigInteger getIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEX$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "index" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDEX$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "index" element
         */
        public void setIndex(java.math.BigInteger index)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDEX$0);
                }
                target.setBigIntegerValue(index);
            }
        }
        
        /**
         * Sets (as xml) the "index" element
         */
        public void xsetIndex(org.apache.xmlbeans.XmlInteger index)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDEX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INDEX$0);
                }
                target.set(index);
            }
        }
    }
}
