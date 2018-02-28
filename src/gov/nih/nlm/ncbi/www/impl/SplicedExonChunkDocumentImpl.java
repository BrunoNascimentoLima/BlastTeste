/*
 * An XML document type.
 * Localname: Spliced-exon-chunk
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedExonChunkDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Spliced-exon-chunk(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SplicedExonChunkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonChunkDocument
{
    
    public SplicedExonChunkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPLICEDEXONCHUNK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-exon-chunk");
    
    
    /**
     * Gets the "Spliced-exon-chunk" element
     */
    public gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk getSplicedExonChunk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().find_element_user(SPLICEDEXONCHUNK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Spliced-exon-chunk" element
     */
    public void setSplicedExonChunk(gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk splicedExonChunk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().find_element_user(SPLICEDEXONCHUNK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().add_element_user(SPLICEDEXONCHUNK$0);
            }
            target.set(splicedExonChunk);
        }
    }
    
    /**
     * Appends and returns a new empty "Spliced-exon-chunk" element
     */
    public gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk addNewSplicedExonChunk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().add_element_user(SPLICEDEXONCHUNK$0);
            return target;
        }
    }
    /**
     * An XML Spliced-exon-chunk(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SplicedExonChunkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk
    {
        
        public SplicedExonChunkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATCH$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "match");
        private static final javax.xml.namespace.QName MISMATCH$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mismatch");
        private static final javax.xml.namespace.QName DIAG$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "diag");
        private static final javax.xml.namespace.QName PRODUCTINS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-ins");
        private static final javax.xml.namespace.QName GENOMICINS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-ins");
        
        
        /**
         * Gets the "match" element
         */
        public java.math.BigInteger getMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "match" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATCH$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "match" element
         */
        public boolean isSetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATCH$0) != 0;
            }
        }
        
        /**
         * Sets the "match" element
         */
        public void setMatch(java.math.BigInteger match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCH$0);
                }
                target.setBigIntegerValue(match);
            }
        }
        
        /**
         * Sets (as xml) the "match" element
         */
        public void xsetMatch(org.apache.xmlbeans.XmlInteger match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATCH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MATCH$0);
                }
                target.set(match);
            }
        }
        
        /**
         * Unsets the "match" element
         */
        public void unsetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATCH$0, 0);
            }
        }
        
        /**
         * Gets the "mismatch" element
         */
        public java.math.BigInteger getMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISMATCH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "mismatch" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MISMATCH$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "mismatch" element
         */
        public boolean isSetMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MISMATCH$2) != 0;
            }
        }
        
        /**
         * Sets the "mismatch" element
         */
        public void setMismatch(java.math.BigInteger mismatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISMATCH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISMATCH$2);
                }
                target.setBigIntegerValue(mismatch);
            }
        }
        
        /**
         * Sets (as xml) the "mismatch" element
         */
        public void xsetMismatch(org.apache.xmlbeans.XmlInteger mismatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MISMATCH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MISMATCH$2);
                }
                target.set(mismatch);
            }
        }
        
        /**
         * Unsets the "mismatch" element
         */
        public void unsetMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MISMATCH$2, 0);
            }
        }
        
        /**
         * Gets the "diag" element
         */
        public java.math.BigInteger getDiag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAG$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "diag" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDiag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIAG$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "diag" element
         */
        public boolean isSetDiag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIAG$4) != 0;
            }
        }
        
        /**
         * Sets the "diag" element
         */
        public void setDiag(java.math.BigInteger diag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIAG$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIAG$4);
                }
                target.setBigIntegerValue(diag);
            }
        }
        
        /**
         * Sets (as xml) the "diag" element
         */
        public void xsetDiag(org.apache.xmlbeans.XmlInteger diag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIAG$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DIAG$4);
                }
                target.set(diag);
            }
        }
        
        /**
         * Unsets the "diag" element
         */
        public void unsetDiag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIAG$4, 0);
            }
        }
        
        /**
         * Gets the "product-ins" element
         */
        public java.math.BigInteger getProductIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTINS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "product-ins" element
         */
        public org.apache.xmlbeans.XmlInteger xgetProductIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRODUCTINS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "product-ins" element
         */
        public boolean isSetProductIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTINS$6) != 0;
            }
        }
        
        /**
         * Sets the "product-ins" element
         */
        public void setProductIns(java.math.BigInteger productIns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTINS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTINS$6);
                }
                target.setBigIntegerValue(productIns);
            }
        }
        
        /**
         * Sets (as xml) the "product-ins" element
         */
        public void xsetProductIns(org.apache.xmlbeans.XmlInteger productIns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRODUCTINS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PRODUCTINS$6);
                }
                target.set(productIns);
            }
        }
        
        /**
         * Unsets the "product-ins" element
         */
        public void unsetProductIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTINS$6, 0);
            }
        }
        
        /**
         * Gets the "genomic-ins" element
         */
        public java.math.BigInteger getGenomicIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOMICINS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "genomic-ins" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGenomicIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GENOMICINS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "genomic-ins" element
         */
        public boolean isSetGenomicIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENOMICINS$8) != 0;
            }
        }
        
        /**
         * Sets the "genomic-ins" element
         */
        public void setGenomicIns(java.math.BigInteger genomicIns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOMICINS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENOMICINS$8);
                }
                target.setBigIntegerValue(genomicIns);
            }
        }
        
        /**
         * Sets (as xml) the "genomic-ins" element
         */
        public void xsetGenomicIns(org.apache.xmlbeans.XmlInteger genomicIns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GENOMICINS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GENOMICINS$8);
                }
                target.set(genomicIns);
            }
        }
        
        /**
         * Unsets the "genomic-ins" element
         */
        public void unsetGenomicIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENOMICINS$8, 0);
            }
        }
    }
}
