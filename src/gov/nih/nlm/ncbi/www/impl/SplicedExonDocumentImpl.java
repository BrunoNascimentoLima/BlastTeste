/*
 * An XML document type.
 * Localname: Spliced-exon
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedExonDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Spliced-exon(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SplicedExonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument
{
    
    public SplicedExonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPLICEDEXON$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-exon");
    
    
    /**
     * Gets the "Spliced-exon" element
     */
    public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon getSplicedExon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().find_element_user(SPLICEDEXON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Spliced-exon" element
     */
    public void setSplicedExon(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon splicedExon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().find_element_user(SPLICEDEXON$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().add_element_user(SPLICEDEXON$0);
            }
            target.set(splicedExon);
        }
    }
    
    /**
     * Appends and returns a new empty "Spliced-exon" element
     */
    public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon addNewSplicedExon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().add_element_user(SPLICEDEXON$0);
            return target;
        }
    }
    /**
     * An XML Spliced-exon(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SplicedExonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon
    {
        
        public SplicedExonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTSTART$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-start");
        private static final javax.xml.namespace.QName PRODUCTEND$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-end");
        private static final javax.xml.namespace.QName GENOMICSTART$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-start");
        private static final javax.xml.namespace.QName GENOMICEND$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-end");
        private static final javax.xml.namespace.QName PRODUCTID$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-id");
        private static final javax.xml.namespace.QName GENOMICID$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-id");
        private static final javax.xml.namespace.QName PRODUCTSTRAND$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-strand");
        private static final javax.xml.namespace.QName GENOMICSTRAND$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-strand");
        private static final javax.xml.namespace.QName PARTS$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "parts");
        private static final javax.xml.namespace.QName SCORES$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "scores");
        private static final javax.xml.namespace.QName ACCEPTORBEFOREEXON$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "acceptor-before-exon");
        private static final javax.xml.namespace.QName DONORAFTEREXON$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "donor-after-exon");
        private static final javax.xml.namespace.QName PARTIAL$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "partial");
        private static final javax.xml.namespace.QName EXT$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        
        
        /**
         * Gets the "product-start" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart getProductStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart)get_store().find_element_user(PRODUCTSTART$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "product-start" element
         */
        public void setProductStart(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart productStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart)get_store().find_element_user(PRODUCTSTART$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart)get_store().add_element_user(PRODUCTSTART$0);
                }
                target.set(productStart);
            }
        }
        
        /**
         * Appends and returns a new empty "product-start" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart addNewProductStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart)get_store().add_element_user(PRODUCTSTART$0);
                return target;
            }
        }
        
        /**
         * Gets the "product-end" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd getProductEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd)get_store().find_element_user(PRODUCTEND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "product-end" element
         */
        public void setProductEnd(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd productEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd)get_store().find_element_user(PRODUCTEND$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd)get_store().add_element_user(PRODUCTEND$2);
                }
                target.set(productEnd);
            }
        }
        
        /**
         * Appends and returns a new empty "product-end" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd addNewProductEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd)get_store().add_element_user(PRODUCTEND$2);
                return target;
            }
        }
        
        /**
         * Gets the "genomic-start" element
         */
        public java.math.BigInteger getGenomicStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOMICSTART$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "genomic-start" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGenomicStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GENOMICSTART$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "genomic-start" element
         */
        public void setGenomicStart(java.math.BigInteger genomicStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOMICSTART$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENOMICSTART$4);
                }
                target.setBigIntegerValue(genomicStart);
            }
        }
        
        /**
         * Sets (as xml) the "genomic-start" element
         */
        public void xsetGenomicStart(org.apache.xmlbeans.XmlInteger genomicStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GENOMICSTART$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GENOMICSTART$4);
                }
                target.set(genomicStart);
            }
        }
        
        /**
         * Gets the "genomic-end" element
         */
        public java.math.BigInteger getGenomicEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOMICEND$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "genomic-end" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGenomicEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GENOMICEND$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "genomic-end" element
         */
        public void setGenomicEnd(java.math.BigInteger genomicEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOMICEND$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENOMICEND$6);
                }
                target.setBigIntegerValue(genomicEnd);
            }
        }
        
        /**
         * Sets (as xml) the "genomic-end" element
         */
        public void xsetGenomicEnd(org.apache.xmlbeans.XmlInteger genomicEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GENOMICEND$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GENOMICEND$6);
                }
                target.set(genomicEnd);
            }
        }
        
        /**
         * Gets the "product-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId getProductId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId)get_store().find_element_user(PRODUCTID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "product-id" element
         */
        public boolean isSetProductId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTID$8) != 0;
            }
        }
        
        /**
         * Sets the "product-id" element
         */
        public void setProductId(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId productId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId)get_store().find_element_user(PRODUCTID$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId)get_store().add_element_user(PRODUCTID$8);
                }
                target.set(productId);
            }
        }
        
        /**
         * Appends and returns a new empty "product-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId addNewProductId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId)get_store().add_element_user(PRODUCTID$8);
                return target;
            }
        }
        
        /**
         * Unsets the "product-id" element
         */
        public void unsetProductId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTID$8, 0);
            }
        }
        
        /**
         * Gets the "genomic-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId getGenomicId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId)get_store().find_element_user(GENOMICID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genomic-id" element
         */
        public boolean isSetGenomicId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENOMICID$10) != 0;
            }
        }
        
        /**
         * Sets the "genomic-id" element
         */
        public void setGenomicId(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId genomicId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId)get_store().find_element_user(GENOMICID$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId)get_store().add_element_user(GENOMICID$10);
                }
                target.set(genomicId);
            }
        }
        
        /**
         * Appends and returns a new empty "genomic-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId addNewGenomicId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId)get_store().add_element_user(GENOMICID$10);
                return target;
            }
        }
        
        /**
         * Unsets the "genomic-id" element
         */
        public void unsetGenomicId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENOMICID$10, 0);
            }
        }
        
        /**
         * Gets the "product-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand getProductStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand)get_store().find_element_user(PRODUCTSTRAND$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "product-strand" element
         */
        public boolean isSetProductStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTSTRAND$12) != 0;
            }
        }
        
        /**
         * Sets the "product-strand" element
         */
        public void setProductStrand(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand productStrand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand)get_store().find_element_user(PRODUCTSTRAND$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand)get_store().add_element_user(PRODUCTSTRAND$12);
                }
                target.set(productStrand);
            }
        }
        
        /**
         * Appends and returns a new empty "product-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand addNewProductStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand)get_store().add_element_user(PRODUCTSTRAND$12);
                return target;
            }
        }
        
        /**
         * Unsets the "product-strand" element
         */
        public void unsetProductStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTSTRAND$12, 0);
            }
        }
        
        /**
         * Gets the "genomic-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand getGenomicStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand)get_store().find_element_user(GENOMICSTRAND$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genomic-strand" element
         */
        public boolean isSetGenomicStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENOMICSTRAND$14) != 0;
            }
        }
        
        /**
         * Sets the "genomic-strand" element
         */
        public void setGenomicStrand(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand genomicStrand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand)get_store().find_element_user(GENOMICSTRAND$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand)get_store().add_element_user(GENOMICSTRAND$14);
                }
                target.set(genomicStrand);
            }
        }
        
        /**
         * Appends and returns a new empty "genomic-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand addNewGenomicStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand)get_store().add_element_user(GENOMICSTRAND$14);
                return target;
            }
        }
        
        /**
         * Unsets the "genomic-strand" element
         */
        public void unsetGenomicStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENOMICSTRAND$14, 0);
            }
        }
        
        /**
         * Gets the "parts" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts getParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts)get_store().find_element_user(PARTS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "parts" element
         */
        public boolean isSetParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTS$16) != 0;
            }
        }
        
        /**
         * Sets the "parts" element
         */
        public void setParts(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts parts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts)get_store().find_element_user(PARTS$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts)get_store().add_element_user(PARTS$16);
                }
                target.set(parts);
            }
        }
        
        /**
         * Appends and returns a new empty "parts" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts addNewParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts)get_store().add_element_user(PARTS$16);
                return target;
            }
        }
        
        /**
         * Unsets the "parts" element
         */
        public void unsetParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTS$16, 0);
            }
        }
        
        /**
         * Gets the "scores" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores getScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores)get_store().find_element_user(SCORES$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "scores" element
         */
        public boolean isSetScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORES$18) != 0;
            }
        }
        
        /**
         * Sets the "scores" element
         */
        public void setScores(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores)get_store().find_element_user(SCORES$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores)get_store().add_element_user(SCORES$18);
                }
                target.set(scores);
            }
        }
        
        /**
         * Appends and returns a new empty "scores" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores addNewScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores)get_store().add_element_user(SCORES$18);
                return target;
            }
        }
        
        /**
         * Unsets the "scores" element
         */
        public void unsetScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORES$18, 0);
            }
        }
        
        /**
         * Gets the "acceptor-before-exon" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon getAcceptorBeforeExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon)get_store().find_element_user(ACCEPTORBEFOREEXON$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "acceptor-before-exon" element
         */
        public boolean isSetAcceptorBeforeExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCEPTORBEFOREEXON$20) != 0;
            }
        }
        
        /**
         * Sets the "acceptor-before-exon" element
         */
        public void setAcceptorBeforeExon(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon acceptorBeforeExon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon)get_store().find_element_user(ACCEPTORBEFOREEXON$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon)get_store().add_element_user(ACCEPTORBEFOREEXON$20);
                }
                target.set(acceptorBeforeExon);
            }
        }
        
        /**
         * Appends and returns a new empty "acceptor-before-exon" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon addNewAcceptorBeforeExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon)get_store().add_element_user(ACCEPTORBEFOREEXON$20);
                return target;
            }
        }
        
        /**
         * Unsets the "acceptor-before-exon" element
         */
        public void unsetAcceptorBeforeExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCEPTORBEFOREEXON$20, 0);
            }
        }
        
        /**
         * Gets the "donor-after-exon" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon getDonorAfterExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon)get_store().find_element_user(DONORAFTEREXON$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "donor-after-exon" element
         */
        public boolean isSetDonorAfterExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DONORAFTEREXON$22) != 0;
            }
        }
        
        /**
         * Sets the "donor-after-exon" element
         */
        public void setDonorAfterExon(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon donorAfterExon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon)get_store().find_element_user(DONORAFTEREXON$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon)get_store().add_element_user(DONORAFTEREXON$22);
                }
                target.set(donorAfterExon);
            }
        }
        
        /**
         * Appends and returns a new empty "donor-after-exon" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon addNewDonorAfterExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon)get_store().add_element_user(DONORAFTEREXON$22);
                return target;
            }
        }
        
        /**
         * Unsets the "donor-after-exon" element
         */
        public void unsetDonorAfterExon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DONORAFTEREXON$22, 0);
            }
        }
        
        /**
         * Gets the "partial" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial getPartial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial)get_store().find_element_user(PARTIAL$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "partial" element
         */
        public boolean isSetPartial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTIAL$24) != 0;
            }
        }
        
        /**
         * Sets the "partial" element
         */
        public void setPartial(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial partial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial)get_store().find_element_user(PARTIAL$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial)get_store().add_element_user(PARTIAL$24);
                }
                target.set(partial);
            }
        }
        
        /**
         * Appends and returns a new empty "partial" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial addNewPartial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial)get_store().add_element_user(PARTIAL$24);
                return target;
            }
        }
        
        /**
         * Unsets the "partial" element
         */
        public void unsetPartial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTIAL$24, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext)get_store().find_element_user(EXT$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ext" element
         */
        public boolean isSetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXT$26) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext)get_store().find_element_user(EXT$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext)get_store().add_element_user(EXT$26);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext)get_store().add_element_user(EXT$26);
                return target;
            }
        }
        
        /**
         * Unsets the "ext" element
         */
        public void unsetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXT$26, 0);
            }
        }
        /**
         * An XML product-start(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductStartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart
        {
            
            public ProductStartImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PRODUCTPOS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Product-pos");
            
            
            /**
             * Gets the "Product-pos" element
             */
            public gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos getProductPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().find_element_user(PRODUCTPOS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Product-pos" element
             */
            public void setProductPos(gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos productPos)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().find_element_user(PRODUCTPOS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().add_element_user(PRODUCTPOS$0);
                    }
                    target.set(productPos);
                }
            }
            
            /**
             * Appends and returns a new empty "Product-pos" element
             */
            public gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos addNewProductPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().add_element_user(PRODUCTPOS$0);
                    return target;
                }
            }
        }
        /**
         * An XML product-end(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductEndImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd
        {
            
            public ProductEndImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PRODUCTPOS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Product-pos");
            
            
            /**
             * Gets the "Product-pos" element
             */
            public gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos getProductPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().find_element_user(PRODUCTPOS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Product-pos" element
             */
            public void setProductPos(gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos productPos)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().find_element_user(PRODUCTPOS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().add_element_user(PRODUCTPOS$0);
                    }
                    target.set(productPos);
                }
            }
            
            /**
             * Appends and returns a new empty "Product-pos" element
             */
            public gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos addNewProductPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos)get_store().add_element_user(PRODUCTPOS$0);
                    return target;
                }
            }
        }
        /**
         * An XML product-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId
        {
            
            public ProductIdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets the "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-id" element
             */
            public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML genomic-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GenomicIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId
        {
            
            public GenomicIdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets the "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-id" element
             */
            public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML product-strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductStrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand
        {
            
            public ProductStrandImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NASTRAND$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Na-strand");
            
            
            /**
             * Gets the "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Na-strand" element
             */
            public void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    }
                    target.set(naStrand);
                }
            }
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    return target;
                }
            }
        }
        /**
         * An XML genomic-strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GenomicStrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand
        {
            
            public GenomicStrandImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NASTRAND$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Na-strand");
            
            
            /**
             * Gets the "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Na-strand" element
             */
            public void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    }
                    target.set(naStrand);
                }
            }
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    return target;
                }
            }
        }
        /**
         * An XML parts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PartsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts
        {
            
            public PartsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPLICEDEXONCHUNK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-exon-chunk");
            
            
            /**
             * Gets array of all "Spliced-exon-chunk" elements
             */
            public gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk[] getSplicedExonChunkArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SPLICEDEXONCHUNK$0, targetList);
                    gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk[] result = new gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Spliced-exon-chunk" element
             */
            public gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk getSplicedExonChunkArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().find_element_user(SPLICEDEXONCHUNK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Spliced-exon-chunk" element
             */
            public int sizeOfSplicedExonChunkArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPLICEDEXONCHUNK$0);
                }
            }
            
            /**
             * Sets array of all "Spliced-exon-chunk" element
             */
            public void setSplicedExonChunkArray(gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk[] splicedExonChunkArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(splicedExonChunkArray, SPLICEDEXONCHUNK$0);
                }
            }
            
            /**
             * Sets ith "Spliced-exon-chunk" element
             */
            public void setSplicedExonChunkArray(int i, gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk splicedExonChunk)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().find_element_user(SPLICEDEXONCHUNK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(splicedExonChunk);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Spliced-exon-chunk" element
             */
            public gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk insertNewSplicedExonChunk(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk)get_store().insert_element_user(SPLICEDEXONCHUNK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Spliced-exon-chunk" element
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
             * Removes the ith "Spliced-exon-chunk" element
             */
            public void removeSplicedExonChunk(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPLICEDEXONCHUNK$0, i);
                }
            }
        }
        /**
         * An XML scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ScoresImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores
        {
            
            public ScoresImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SCORESET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Score-set");
            
            
            /**
             * Gets the "Score-set" element
             */
            public gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet getScoreSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().find_element_user(SCORESET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Score-set" element
             */
            public void setScoreSet(gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet scoreSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().find_element_user(SCORESET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().add_element_user(SCORESET$0);
                    }
                    target.set(scoreSet);
                }
            }
            
            /**
             * Appends and returns a new empty "Score-set" element
             */
            public gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet addNewScoreSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().add_element_user(SCORESET$0);
                    return target;
                }
            }
        }
        /**
         * An XML acceptor-before-exon(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AcceptorBeforeExonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon
        {
            
            public AcceptorBeforeExonImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPLICESITE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Splice-site");
            
            
            /**
             * Gets the "Splice-site" element
             */
            public gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite getSpliceSite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
                    target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().find_element_user(SPLICESITE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Splice-site" element
             */
            public void setSpliceSite(gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite spliceSite)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
                    target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().find_element_user(SPLICESITE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().add_element_user(SPLICESITE$0);
                    }
                    target.set(spliceSite);
                }
            }
            
            /**
             * Appends and returns a new empty "Splice-site" element
             */
            public gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite addNewSpliceSite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
                    target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().add_element_user(SPLICESITE$0);
                    return target;
                }
            }
        }
        /**
         * An XML donor-after-exon(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DonorAfterExonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon
        {
            
            public DonorAfterExonImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPLICESITE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Splice-site");
            
            
            /**
             * Gets the "Splice-site" element
             */
            public gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite getSpliceSite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
                    target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().find_element_user(SPLICESITE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Splice-site" element
             */
            public void setSpliceSite(gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite spliceSite)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
                    target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().find_element_user(SPLICESITE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().add_element_user(SPLICESITE$0);
                    }
                    target.set(spliceSite);
                }
            }
            
            /**
             * Appends and returns a new empty "Splice-site" element
             */
            public gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite addNewSpliceSite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite target = null;
                    target = (gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite)get_store().add_element_user(SPLICESITE$0);
                    return target;
                }
            }
        }
        /**
         * An XML partial(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PartialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial
        {
            
            public PartialImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SplicedExonDocument$SplicedExon$Partial$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USEROBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
            
            
            /**
             * Gets array of all "User-object" elements
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] getUserObjectArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(USEROBJECT$0, targetList);
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] result = new gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObjectArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "User-object" element
             */
            public int sizeOfUserObjectArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(USEROBJECT$0);
                }
            }
            
            /**
             * Sets array of all "User-object" element
             */
            public void setUserObjectArray(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] userObjectArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(userObjectArray, USEROBJECT$0);
                }
            }
            
            /**
             * Sets ith "User-object" element
             */
            public void setUserObjectArray(int i, gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(userObject);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject insertNewUserObject(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().insert_element_user(USEROBJECT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "User-object" element
             */
            public void removeUserObject(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(USEROBJECT$0, i);
                }
            }
        }
    }
}
