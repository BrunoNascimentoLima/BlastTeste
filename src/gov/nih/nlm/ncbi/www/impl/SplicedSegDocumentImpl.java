/*
 * An XML document type.
 * Localname: Spliced-seg
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedSegDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Spliced-seg(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SplicedSegDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument
{
    
    public SplicedSegDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPLICEDSEG$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-seg");
    
    
    /**
     * Gets the "Spliced-seg" element
     */
    public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg getSplicedSeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().find_element_user(SPLICEDSEG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Spliced-seg" element
     */
    public void setSplicedSeg(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg splicedSeg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().find_element_user(SPLICEDSEG$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().add_element_user(SPLICEDSEG$0);
            }
            target.set(splicedSeg);
        }
    }
    
    /**
     * Appends and returns a new empty "Spliced-seg" element
     */
    public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg addNewSplicedSeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().add_element_user(SPLICEDSEG$0);
            return target;
        }
    }
    /**
     * An XML Spliced-seg(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SplicedSegImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg
    {
        
        public SplicedSegImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-id");
        private static final javax.xml.namespace.QName GENOMICID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-id");
        private static final javax.xml.namespace.QName PRODUCTSTRAND$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-strand");
        private static final javax.xml.namespace.QName GENOMICSTRAND$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genomic-strand");
        private static final javax.xml.namespace.QName PRODUCTTYPE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-type");
        private static final javax.xml.namespace.QName EXONS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exons");
        private static final javax.xml.namespace.QName POLYA$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "poly-a");
        private static final javax.xml.namespace.QName PRODUCTLENGTH$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product-length");
        private static final javax.xml.namespace.QName MODIFIERS$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "modifiers");
        
        
        /**
         * Gets the "product-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId getProductId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId)get_store().find_element_user(PRODUCTID$0, 0);
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
                return get_store().count_elements(PRODUCTID$0) != 0;
            }
        }
        
        /**
         * Sets the "product-id" element
         */
        public void setProductId(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId productId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId)get_store().find_element_user(PRODUCTID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId)get_store().add_element_user(PRODUCTID$0);
                }
                target.set(productId);
            }
        }
        
        /**
         * Appends and returns a new empty "product-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId addNewProductId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId)get_store().add_element_user(PRODUCTID$0);
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
                get_store().remove_element(PRODUCTID$0, 0);
            }
        }
        
        /**
         * Gets the "genomic-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId getGenomicId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId)get_store().find_element_user(GENOMICID$2, 0);
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
                return get_store().count_elements(GENOMICID$2) != 0;
            }
        }
        
        /**
         * Sets the "genomic-id" element
         */
        public void setGenomicId(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId genomicId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId)get_store().find_element_user(GENOMICID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId)get_store().add_element_user(GENOMICID$2);
                }
                target.set(genomicId);
            }
        }
        
        /**
         * Appends and returns a new empty "genomic-id" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId addNewGenomicId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId)get_store().add_element_user(GENOMICID$2);
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
                get_store().remove_element(GENOMICID$2, 0);
            }
        }
        
        /**
         * Gets the "product-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand getProductStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand)get_store().find_element_user(PRODUCTSTRAND$4, 0);
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
                return get_store().count_elements(PRODUCTSTRAND$4) != 0;
            }
        }
        
        /**
         * Sets the "product-strand" element
         */
        public void setProductStrand(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand productStrand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand)get_store().find_element_user(PRODUCTSTRAND$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand)get_store().add_element_user(PRODUCTSTRAND$4);
                }
                target.set(productStrand);
            }
        }
        
        /**
         * Appends and returns a new empty "product-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand addNewProductStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand)get_store().add_element_user(PRODUCTSTRAND$4);
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
                get_store().remove_element(PRODUCTSTRAND$4, 0);
            }
        }
        
        /**
         * Gets the "genomic-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand getGenomicStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand)get_store().find_element_user(GENOMICSTRAND$6, 0);
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
                return get_store().count_elements(GENOMICSTRAND$6) != 0;
            }
        }
        
        /**
         * Sets the "genomic-strand" element
         */
        public void setGenomicStrand(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand genomicStrand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand)get_store().find_element_user(GENOMICSTRAND$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand)get_store().add_element_user(GENOMICSTRAND$6);
                }
                target.set(genomicStrand);
            }
        }
        
        /**
         * Appends and returns a new empty "genomic-strand" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand addNewGenomicStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand)get_store().add_element_user(GENOMICSTRAND$6);
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
                get_store().remove_element(GENOMICSTRAND$6, 0);
            }
        }
        
        /**
         * Gets the "product-type" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType getProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType)get_store().find_element_user(PRODUCTTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "product-type" element
         */
        public void setProductType(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType productType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType)get_store().find_element_user(PRODUCTTYPE$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType)get_store().add_element_user(PRODUCTTYPE$8);
                }
                target.set(productType);
            }
        }
        
        /**
         * Appends and returns a new empty "product-type" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType addNewProductType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType)get_store().add_element_user(PRODUCTTYPE$8);
                return target;
            }
        }
        
        /**
         * Gets the "exons" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons getExons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons)get_store().find_element_user(EXONS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "exons" element
         */
        public void setExons(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons exons)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons)get_store().find_element_user(EXONS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons)get_store().add_element_user(EXONS$10);
                }
                target.set(exons);
            }
        }
        
        /**
         * Appends and returns a new empty "exons" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons addNewExons()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons)get_store().add_element_user(EXONS$10);
                return target;
            }
        }
        
        /**
         * Gets the "poly-a" element
         */
        public java.math.BigInteger getPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYA$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "poly-a" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POLYA$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "poly-a" element
         */
        public boolean isSetPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLYA$12) != 0;
            }
        }
        
        /**
         * Sets the "poly-a" element
         */
        public void setPolyA(java.math.BigInteger polyA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYA$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLYA$12);
                }
                target.setBigIntegerValue(polyA);
            }
        }
        
        /**
         * Sets (as xml) the "poly-a" element
         */
        public void xsetPolyA(org.apache.xmlbeans.XmlInteger polyA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POLYA$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(POLYA$12);
                }
                target.set(polyA);
            }
        }
        
        /**
         * Unsets the "poly-a" element
         */
        public void unsetPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLYA$12, 0);
            }
        }
        
        /**
         * Gets the "product-length" element
         */
        public java.math.BigInteger getProductLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTLENGTH$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "product-length" element
         */
        public org.apache.xmlbeans.XmlInteger xgetProductLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRODUCTLENGTH$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "product-length" element
         */
        public boolean isSetProductLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTLENGTH$14) != 0;
            }
        }
        
        /**
         * Sets the "product-length" element
         */
        public void setProductLength(java.math.BigInteger productLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTLENGTH$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTLENGTH$14);
                }
                target.setBigIntegerValue(productLength);
            }
        }
        
        /**
         * Sets (as xml) the "product-length" element
         */
        public void xsetProductLength(org.apache.xmlbeans.XmlInteger productLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PRODUCTLENGTH$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PRODUCTLENGTH$14);
                }
                target.set(productLength);
            }
        }
        
        /**
         * Unsets the "product-length" element
         */
        public void unsetProductLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTLENGTH$14, 0);
            }
        }
        
        /**
         * Gets the "modifiers" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers getModifiers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers)get_store().find_element_user(MODIFIERS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "modifiers" element
         */
        public boolean isSetModifiers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODIFIERS$16) != 0;
            }
        }
        
        /**
         * Sets the "modifiers" element
         */
        public void setModifiers(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers modifiers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers)get_store().find_element_user(MODIFIERS$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers)get_store().add_element_user(MODIFIERS$16);
                }
                target.set(modifiers);
            }
        }
        
        /**
         * Appends and returns a new empty "modifiers" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers addNewModifiers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers)get_store().add_element_user(MODIFIERS$16);
                return target;
            }
        }
        
        /**
         * Unsets the "modifiers" element
         */
        public void unsetModifiers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODIFIERS$16, 0);
            }
        }
        /**
         * An XML product-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId
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
        public static class GenomicIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId
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
        public static class ProductStrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand
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
        public static class GenomicStrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand
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
         * An XML product-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType
        {
            
            public ProductTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SplicedSegDocument$SplicedSeg$ProductType$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value
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
         * An XML exons(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExonsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons
        {
            
            public ExonsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPLICEDEXON$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-exon");
            
            
            /**
             * Gets array of all "Spliced-exon" elements
             */
            public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon[] getSplicedExonArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SPLICEDEXON$0, targetList);
                    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon[] result = new gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Spliced-exon" element
             */
            public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon getSplicedExonArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().find_element_user(SPLICEDEXON$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Spliced-exon" element
             */
            public int sizeOfSplicedExonArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPLICEDEXON$0);
                }
            }
            
            /**
             * Sets array of all "Spliced-exon" element
             */
            public void setSplicedExonArray(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon[] splicedExonArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(splicedExonArray, SPLICEDEXON$0);
                }
            }
            
            /**
             * Sets ith "Spliced-exon" element
             */
            public void setSplicedExonArray(int i, gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon splicedExon)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().find_element_user(SPLICEDEXON$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(splicedExon);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Spliced-exon" element
             */
            public gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon insertNewSplicedExon(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon)get_store().insert_element_user(SPLICEDEXON$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Spliced-exon" element
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
             * Removes the ith "Spliced-exon" element
             */
            public void removeSplicedExon(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPLICEDEXON$0, i);
                }
            }
        }
        /**
         * An XML modifiers(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ModifiersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers
        {
            
            public ModifiersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPLICEDSEGMODIFIER$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-seg-modifier");
            
            
            /**
             * Gets array of all "Spliced-seg-modifier" elements
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier[] getSplicedSegModifierArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SPLICEDSEGMODIFIER$0, targetList);
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier[] result = new gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Spliced-seg-modifier" element
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier getSplicedSegModifierArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().find_element_user(SPLICEDSEGMODIFIER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Spliced-seg-modifier" element
             */
            public int sizeOfSplicedSegModifierArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPLICEDSEGMODIFIER$0);
                }
            }
            
            /**
             * Sets array of all "Spliced-seg-modifier" element
             */
            public void setSplicedSegModifierArray(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier[] splicedSegModifierArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(splicedSegModifierArray, SPLICEDSEGMODIFIER$0);
                }
            }
            
            /**
             * Sets ith "Spliced-seg-modifier" element
             */
            public void setSplicedSegModifierArray(int i, gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier splicedSegModifier)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().find_element_user(SPLICEDSEGMODIFIER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(splicedSegModifier);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Spliced-seg-modifier" element
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier insertNewSplicedSegModifier(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().insert_element_user(SPLICEDSEGMODIFIER$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Spliced-seg-modifier" element
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier addNewSplicedSegModifier()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().add_element_user(SPLICEDSEGMODIFIER$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Spliced-seg-modifier" element
             */
            public void removeSplicedSegModifier(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPLICEDSEGMODIFIER$0, i);
                }
            }
        }
    }
}
