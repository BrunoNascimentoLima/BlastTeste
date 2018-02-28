/*
 * An XML document type.
 * Localname: Ref-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RefExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Ref-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class RefExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RefExtDocument
{
    
    public RefExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Ref-ext");
    
    
    /**
     * Gets the "Ref-ext" element
     */
    public gov.nih.nlm.ncbi.www.RefExtDocument.RefExt getRefExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RefExtDocument.RefExt target = null;
            target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().find_element_user(REFEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref-ext" element
     */
    public void setRefExt(gov.nih.nlm.ncbi.www.RefExtDocument.RefExt refExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RefExtDocument.RefExt target = null;
            target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().find_element_user(REFEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().add_element_user(REFEXT$0);
            }
            target.set(refExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref-ext" element
     */
    public gov.nih.nlm.ncbi.www.RefExtDocument.RefExt addNewRefExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RefExtDocument.RefExt target = null;
            target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().add_element_user(REFEXT$0);
            return target;
        }
    }
    /**
     * An XML Ref-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class RefExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RefExtDocument.RefExt
    {
        
        public RefExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQLOC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
        
        
        /**
         * Gets the "Seq-loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Seq-loc" element
         */
        public void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                }
                target.set(seqLoc);
            }
        }
        
        /**
         * Appends and returns a new empty "Seq-loc" element
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
    }
}
