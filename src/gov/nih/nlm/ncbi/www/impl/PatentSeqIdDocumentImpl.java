/*
 * An XML document type.
 * Localname: Patent-seq-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PatentSeqIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Patent-seq-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PatentSeqIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PatentSeqIdDocument
{
    
    public PatentSeqIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATENTSEQID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Patent-seq-id");
    
    
    /**
     * Gets the "Patent-seq-id" element
     */
    public gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId getPatentSeqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId target = null;
            target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().find_element_user(PATENTSEQID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Patent-seq-id" element
     */
    public void setPatentSeqId(gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId patentSeqId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId target = null;
            target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().find_element_user(PATENTSEQID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().add_element_user(PATENTSEQID$0);
            }
            target.set(patentSeqId);
        }
    }
    
    /**
     * Appends and returns a new empty "Patent-seq-id" element
     */
    public gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId addNewPatentSeqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId target = null;
            target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().add_element_user(PATENTSEQID$0);
            return target;
        }
    }
    /**
     * An XML Patent-seq-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PatentSeqIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId
    {
        
        public PatentSeqIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seqid");
        private static final javax.xml.namespace.QName CIT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        
        
        /**
         * Gets the "seqid" element
         */
        public java.math.BigInteger getSeqid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "seqid" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSeqid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEQID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "seqid" element
         */
        public void setSeqid(java.math.BigInteger seqid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQID$0);
                }
                target.setBigIntegerValue(seqid);
            }
        }
        
        /**
         * Sets (as xml) the "seqid" element
         */
        public void xsetSeqid(org.apache.xmlbeans.XmlInteger seqid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SEQID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SEQID$0);
                }
                target.set(seqid);
            }
        }
        
        /**
         * Gets the "cit" element
         */
        public gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit getCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit)get_store().find_element_user(CIT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cit" element
         */
        public void setCit(gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit)get_store().find_element_user(CIT$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit)get_store().add_element_user(CIT$2);
                }
                target.set(cit);
            }
        }
        
        /**
         * Appends and returns a new empty "cit" element
         */
        public gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit addNewCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit)get_store().add_element_user(CIT$2);
                return target;
            }
        }
        /**
         * An XML cit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId.Cit
        {
            
            public CitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IDPAT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Id-pat");
            
            
            /**
             * Gets the "Id-pat" element
             */
            public gov.nih.nlm.ncbi.www.IdPatDocument.IdPat getIdPat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IdPatDocument.IdPat target = null;
                    target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().find_element_user(IDPAT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Id-pat" element
             */
            public void setIdPat(gov.nih.nlm.ncbi.www.IdPatDocument.IdPat idPat)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IdPatDocument.IdPat target = null;
                    target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().find_element_user(IDPAT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().add_element_user(IDPAT$0);
                    }
                    target.set(idPat);
                }
            }
            
            /**
             * Appends and returns a new empty "Id-pat" element
             */
            public gov.nih.nlm.ncbi.www.IdPatDocument.IdPat addNewIdPat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IdPatDocument.IdPat target = null;
                    target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().add_element_user(IDPAT$0);
                    return target;
                }
            }
        }
    }
}
