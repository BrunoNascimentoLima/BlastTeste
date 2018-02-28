/*
 * An XML document type.
 * Localname: Seq-feat
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-feat(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqFeatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument
{
    
    public SeqFeatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQFEAT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-feat");
    
    
    /**
     * Gets the "Seq-feat" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat getSeqFeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().find_element_user(SEQFEAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-feat" element
     */
    public void setSeqFeat(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat seqFeat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().find_element_user(SEQFEAT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().add_element_user(SEQFEAT$0);
            }
            target.set(seqFeat);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-feat" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat addNewSeqFeat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().add_element_user(SEQFEAT$0);
            return target;
        }
    }
    /**
     * An XML Seq-feat(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqFeatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat
    {
        
        public SeqFeatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName DATA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        private static final javax.xml.namespace.QName PARTIAL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "partial");
        private static final javax.xml.namespace.QName EXCEPT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "except");
        private static final javax.xml.namespace.QName COMMENT$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comment");
        private static final javax.xml.namespace.QName PRODUCT$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product");
        private static final javax.xml.namespace.QName LOCATION$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "location");
        private static final javax.xml.namespace.QName QUAL$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "qual");
        private static final javax.xml.namespace.QName TITLE$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName EXT$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        private static final javax.xml.namespace.QName CIT$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        private static final javax.xml.namespace.QName EXPEV$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exp-ev");
        private static final javax.xml.namespace.QName XREF$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "xref");
        private static final javax.xml.namespace.QName DBXREF$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dbxref");
        private static final javax.xml.namespace.QName PSEUDO$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pseudo");
        private static final javax.xml.namespace.QName EXCEPTTEXT$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "except-text");
        private static final javax.xml.namespace.QName IDS$32 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        private static final javax.xml.namespace.QName EXTS$34 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exts");
        private static final javax.xml.namespace.QName SUPPORT$36 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "support");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$0) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$0, 0);
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data)get_store().add_element_user(DATA$2);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data)get_store().add_element_user(DATA$2);
                return target;
            }
        }
        
        /**
         * Gets the "partial" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial getPartial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial)get_store().find_element_user(PARTIAL$4, 0);
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
                return get_store().count_elements(PARTIAL$4) != 0;
            }
        }
        
        /**
         * Sets the "partial" element
         */
        public void setPartial(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial partial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial)get_store().find_element_user(PARTIAL$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial)get_store().add_element_user(PARTIAL$4);
                }
                target.set(partial);
            }
        }
        
        /**
         * Appends and returns a new empty "partial" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial addNewPartial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial)get_store().add_element_user(PARTIAL$4);
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
                get_store().remove_element(PARTIAL$4, 0);
            }
        }
        
        /**
         * Gets the "except" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except getExcept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except)get_store().find_element_user(EXCEPT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "except" element
         */
        public boolean isSetExcept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCEPT$6) != 0;
            }
        }
        
        /**
         * Sets the "except" element
         */
        public void setExcept(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except except)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except)get_store().find_element_user(EXCEPT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except)get_store().add_element_user(EXCEPT$6);
                }
                target.set(except);
            }
        }
        
        /**
         * Appends and returns a new empty "except" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except addNewExcept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except)get_store().add_element_user(EXCEPT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "except" element
         */
        public void unsetExcept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCEPT$6, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public java.lang.String getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comment" element
         */
        public org.apache.xmlbeans.XmlString xgetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "comment" element
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$8) != 0;
            }
        }
        
        /**
         * Sets the "comment" element
         */
        public void setComment(java.lang.String comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$8);
                }
                target.setStringValue(comment);
            }
        }
        
        /**
         * Sets (as xml) the "comment" element
         */
        public void xsetComment(org.apache.xmlbeans.XmlString comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$8);
                }
                target.set(comment);
            }
        }
        
        /**
         * Unsets the "comment" element
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$8, 0);
            }
        }
        
        /**
         * Gets the "product" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product getProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product)get_store().find_element_user(PRODUCT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "product" element
         */
        public boolean isSetProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCT$10) != 0;
            }
        }
        
        /**
         * Sets the "product" element
         */
        public void setProduct(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product)get_store().find_element_user(PRODUCT$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product)get_store().add_element_user(PRODUCT$10);
                }
                target.set(product);
            }
        }
        
        /**
         * Appends and returns a new empty "product" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product addNewProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product)get_store().add_element_user(PRODUCT$10);
                return target;
            }
        }
        
        /**
         * Unsets the "product" element
         */
        public void unsetProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCT$10, 0);
            }
        }
        
        /**
         * Gets the "location" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location)get_store().find_element_user(LOCATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "location" element
         */
        public void setLocation(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location)get_store().find_element_user(LOCATION$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location)get_store().add_element_user(LOCATION$12);
                }
                target.set(location);
            }
        }
        
        /**
         * Appends and returns a new empty "location" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location addNewLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location)get_store().add_element_user(LOCATION$12);
                return target;
            }
        }
        
        /**
         * Gets the "qual" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual getQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual)get_store().find_element_user(QUAL$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "qual" element
         */
        public boolean isSetQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUAL$14) != 0;
            }
        }
        
        /**
         * Sets the "qual" element
         */
        public void setQual(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual qual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual)get_store().find_element_user(QUAL$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual)get_store().add_element_user(QUAL$14);
                }
                target.set(qual);
            }
        }
        
        /**
         * Appends and returns a new empty "qual" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual addNewQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual)get_store().add_element_user(QUAL$14);
                return target;
            }
        }
        
        /**
         * Unsets the "qual" element
         */
        public void unsetQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUAL$14, 0);
            }
        }
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$16) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$16);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$16);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$16, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext)get_store().find_element_user(EXT$18, 0);
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
                return get_store().count_elements(EXT$18) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext)get_store().find_element_user(EXT$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext)get_store().add_element_user(EXT$18);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext)get_store().add_element_user(EXT$18);
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
                get_store().remove_element(EXT$18, 0);
            }
        }
        
        /**
         * Gets the "cit" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit getCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit)get_store().find_element_user(CIT$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cit" element
         */
        public boolean isSetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CIT$20) != 0;
            }
        }
        
        /**
         * Sets the "cit" element
         */
        public void setCit(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit)get_store().find_element_user(CIT$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit)get_store().add_element_user(CIT$20);
                }
                target.set(cit);
            }
        }
        
        /**
         * Appends and returns a new empty "cit" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit addNewCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit)get_store().add_element_user(CIT$20);
                return target;
            }
        }
        
        /**
         * Unsets the "cit" element
         */
        public void unsetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CIT$20, 0);
            }
        }
        
        /**
         * Gets the "exp-ev" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv getExpEv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv)get_store().find_element_user(EXPEV$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "exp-ev" element
         */
        public boolean isSetExpEv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPEV$22) != 0;
            }
        }
        
        /**
         * Sets the "exp-ev" element
         */
        public void setExpEv(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv expEv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv)get_store().find_element_user(EXPEV$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv)get_store().add_element_user(EXPEV$22);
                }
                target.set(expEv);
            }
        }
        
        /**
         * Appends and returns a new empty "exp-ev" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv addNewExpEv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv)get_store().add_element_user(EXPEV$22);
                return target;
            }
        }
        
        /**
         * Unsets the "exp-ev" element
         */
        public void unsetExpEv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPEV$22, 0);
            }
        }
        
        /**
         * Gets the "xref" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref getXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref)get_store().find_element_user(XREF$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "xref" element
         */
        public boolean isSetXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(XREF$24) != 0;
            }
        }
        
        /**
         * Sets the "xref" element
         */
        public void setXref(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref xref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref)get_store().find_element_user(XREF$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref)get_store().add_element_user(XREF$24);
                }
                target.set(xref);
            }
        }
        
        /**
         * Appends and returns a new empty "xref" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref addNewXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref)get_store().add_element_user(XREF$24);
                return target;
            }
        }
        
        /**
         * Unsets the "xref" element
         */
        public void unsetXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(XREF$24, 0);
            }
        }
        
        /**
         * Gets the "dbxref" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref getDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref)get_store().find_element_user(DBXREF$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dbxref" element
         */
        public boolean isSetDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBXREF$26) != 0;
            }
        }
        
        /**
         * Sets the "dbxref" element
         */
        public void setDbxref(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref dbxref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref)get_store().find_element_user(DBXREF$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref)get_store().add_element_user(DBXREF$26);
                }
                target.set(dbxref);
            }
        }
        
        /**
         * Appends and returns a new empty "dbxref" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref addNewDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref)get_store().add_element_user(DBXREF$26);
                return target;
            }
        }
        
        /**
         * Unsets the "dbxref" element
         */
        public void unsetDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBXREF$26, 0);
            }
        }
        
        /**
         * Gets the "pseudo" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo getPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo)get_store().find_element_user(PSEUDO$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pseudo" element
         */
        public boolean isSetPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSEUDO$28) != 0;
            }
        }
        
        /**
         * Sets the "pseudo" element
         */
        public void setPseudo(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo pseudo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo)get_store().find_element_user(PSEUDO$28, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo)get_store().add_element_user(PSEUDO$28);
                }
                target.set(pseudo);
            }
        }
        
        /**
         * Appends and returns a new empty "pseudo" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo addNewPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo)get_store().add_element_user(PSEUDO$28);
                return target;
            }
        }
        
        /**
         * Unsets the "pseudo" element
         */
        public void unsetPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSEUDO$28, 0);
            }
        }
        
        /**
         * Gets the "except-text" element
         */
        public java.lang.String getExceptText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPTTEXT$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "except-text" element
         */
        public org.apache.xmlbeans.XmlString xgetExceptText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPTTEXT$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "except-text" element
         */
        public boolean isSetExceptText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCEPTTEXT$30) != 0;
            }
        }
        
        /**
         * Sets the "except-text" element
         */
        public void setExceptText(java.lang.String exceptText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCEPTTEXT$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCEPTTEXT$30);
                }
                target.setStringValue(exceptText);
            }
        }
        
        /**
         * Sets (as xml) the "except-text" element
         */
        public void xsetExceptText(org.apache.xmlbeans.XmlString exceptText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCEPTTEXT$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCEPTTEXT$30);
                }
                target.set(exceptText);
            }
        }
        
        /**
         * Unsets the "except-text" element
         */
        public void unsetExceptText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCEPTTEXT$30, 0);
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids)get_store().find_element_user(IDS$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ids" element
         */
        public boolean isSetIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDS$32) != 0;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids)get_store().find_element_user(IDS$32, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids)get_store().add_element_user(IDS$32);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids)get_store().add_element_user(IDS$32);
                return target;
            }
        }
        
        /**
         * Unsets the "ids" element
         */
        public void unsetIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDS$32, 0);
            }
        }
        
        /**
         * Gets the "exts" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts getExts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts)get_store().find_element_user(EXTS$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "exts" element
         */
        public boolean isSetExts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTS$34) != 0;
            }
        }
        
        /**
         * Sets the "exts" element
         */
        public void setExts(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts exts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts)get_store().find_element_user(EXTS$34, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts)get_store().add_element_user(EXTS$34);
                }
                target.set(exts);
            }
        }
        
        /**
         * Appends and returns a new empty "exts" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts addNewExts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts)get_store().add_element_user(EXTS$34);
                return target;
            }
        }
        
        /**
         * Unsets the "exts" element
         */
        public void unsetExts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTS$34, 0);
            }
        }
        
        /**
         * Gets the "support" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support getSupport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support)get_store().find_element_user(SUPPORT$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "support" element
         */
        public boolean isSetSupport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUPPORT$36) != 0;
            }
        }
        
        /**
         * Sets the "support" element
         */
        public void setSupport(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support support)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support)get_store().find_element_user(SUPPORT$36, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support)get_store().add_element_user(SUPPORT$36);
                }
                target.set(support);
            }
        }
        
        /**
         * Appends and returns a new empty "support" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support addNewSupport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support)get_store().add_element_user(SUPPORT$36);
                return target;
            }
        }
        
        /**
         * Unsets the "support" element
         */
        public void unsetSupport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUPPORT$36, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FEATID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Feat-id");
            
            
            /**
             * Gets the "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Feat-id" element
             */
            public void setFeatId(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
                    }
                    target.set(featId);
                }
            }
            
            /**
             * Appends and returns a new empty "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
                    return target;
                }
            }
        }
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQFEATDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatData");
            
            
            /**
             * Gets the "SeqFeatData" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData getSeqFeatData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().find_element_user(SEQFEATDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqFeatData" element
             */
            public void setSeqFeatData(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData seqFeatData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().find_element_user(SEQFEATDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().add_element_user(SEQFEATDATA$0);
                    }
                    target.set(seqFeatData);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqFeatData" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData addNewSeqFeatData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().add_element_user(SEQFEATDATA$0);
                    return target;
                }
            }
        }
        /**
         * An XML partial(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PartialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial
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
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Partial$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value
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
         * An XML except(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExceptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except
        {
            
            public ExceptImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Except$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value
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
         * An XML product(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product
        {
            
            public ProductImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location
        {
            
            public LocationImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML qual(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual
        {
            
            public QualImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GBQUAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Gb-qual");
            
            
            /**
             * Gets array of all "Gb-qual" elements
             */
            public gov.nih.nlm.ncbi.www.GbQualDocument.GbQual[] getGbQualArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(GBQUAL$0, targetList);
                    gov.nih.nlm.ncbi.www.GbQualDocument.GbQual[] result = new gov.nih.nlm.ncbi.www.GbQualDocument.GbQual[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Gb-qual" element
             */
            public gov.nih.nlm.ncbi.www.GbQualDocument.GbQual getGbQualArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
                    target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().find_element_user(GBQUAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Gb-qual" element
             */
            public int sizeOfGbQualArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GBQUAL$0);
                }
            }
            
            /**
             * Sets array of all "Gb-qual" element
             */
            public void setGbQualArray(gov.nih.nlm.ncbi.www.GbQualDocument.GbQual[] gbQualArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(gbQualArray, GBQUAL$0);
                }
            }
            
            /**
             * Sets ith "Gb-qual" element
             */
            public void setGbQualArray(int i, gov.nih.nlm.ncbi.www.GbQualDocument.GbQual gbQual)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
                    target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().find_element_user(GBQUAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(gbQual);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Gb-qual" element
             */
            public gov.nih.nlm.ncbi.www.GbQualDocument.GbQual insertNewGbQual(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
                    target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().insert_element_user(GBQUAL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Gb-qual" element
             */
            public gov.nih.nlm.ncbi.www.GbQualDocument.GbQual addNewGbQual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GbQualDocument.GbQual target = null;
                    target = (gov.nih.nlm.ncbi.www.GbQualDocument.GbQual)get_store().add_element_user(GBQUAL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Gb-qual" element
             */
            public void removeGbQual(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GBQUAL$0, i);
                }
            }
        }
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USEROBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
            
            
            /**
             * Gets the "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "User-object" element
             */
            public void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    }
                    target.set(userObject);
                }
            }
            
            /**
             * Appends and returns a new empty "User-object" element
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
        }
        /**
         * An XML cit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit
        {
            
            public CitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub-set");
            
            
            /**
             * Gets the "Pub-set" element
             */
            public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet getPubSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubSetDocument.PubSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().find_element_user(PUBSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pub-set" element
             */
            public void setPubSet(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet pubSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubSetDocument.PubSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().find_element_user(PUBSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().add_element_user(PUBSET$0);
                    }
                    target.set(pubSet);
                }
            }
            
            /**
             * Appends and returns a new empty "Pub-set" element
             */
            public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet addNewPubSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubSetDocument.PubSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().add_element_user(PUBSET$0);
                    return target;
                }
            }
        }
        /**
         * An XML exp-ev(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExpEvImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv
        {
            
            public ExpEvImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$ExpEv$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value
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
         * An XML xref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class XrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref
        {
            
            public XrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQFEATXREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatXref");
            
            
            /**
             * Gets array of all "SeqFeatXref" elements
             */
            public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref[] getSeqFeatXrefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQFEATXREF$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref[] result = new gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "SeqFeatXref" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref getSeqFeatXrefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().find_element_user(SEQFEATXREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "SeqFeatXref" element
             */
            public int sizeOfSeqFeatXrefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQFEATXREF$0);
                }
            }
            
            /**
             * Sets array of all "SeqFeatXref" element
             */
            public void setSeqFeatXrefArray(gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref[] seqFeatXrefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqFeatXrefArray, SEQFEATXREF$0);
                }
            }
            
            /**
             * Sets ith "SeqFeatXref" element
             */
            public void setSeqFeatXrefArray(int i, gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref seqFeatXref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().find_element_user(SEQFEATXREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqFeatXref);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SeqFeatXref" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref insertNewSeqFeatXref(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().insert_element_user(SEQFEATXREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SeqFeatXref" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref addNewSeqFeatXref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().add_element_user(SEQFEATXREF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "SeqFeatXref" element
             */
            public void removeSeqFeatXref(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQFEATXREF$0, i);
                }
            }
        }
        /**
         * An XML dbxref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbxrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref
        {
            
            public DbxrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets array of all "Dbtag" elements
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DBTAG$0, targetList);
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Dbtag" element
             */
            public int sizeOfDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DBTAG$0);
                }
            }
            
            /**
             * Sets array of all "Dbtag" element
             */
            public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dbtagArray, DBTAG$0);
                }
            }
            
            /**
             * Sets ith "Dbtag" element
             */
            public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Dbtag" element
             */
            public void removeDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DBTAG$0, i);
                }
            }
        }
        /**
         * An XML pseudo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PseudoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo
        {
            
            public PseudoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Pseudo$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value
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
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids
        {
            
            public IdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FEATID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Feat-id");
            
            
            /**
             * Gets array of all "Feat-id" elements
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId[] getFeatIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(FEATID$0, targetList);
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId[] result = new gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Feat-id" element
             */
            public int sizeOfFeatIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FEATID$0);
                }
            }
            
            /**
             * Sets array of all "Feat-id" element
             */
            public void setFeatIdArray(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId[] featIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(featIdArray, FEATID$0);
                }
            }
            
            /**
             * Sets ith "Feat-id" element
             */
            public void setFeatIdArray(int i, gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(featId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId insertNewFeatId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().insert_element_user(FEATID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Feat-id" element
             */
            public void removeFeatId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FEATID$0, i);
                }
            }
        }
        /**
         * An XML exts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts
        {
            
            public ExtsImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML support(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SupportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support
        {
            
            public SupportImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQFEATSUPPORT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatSupport");
            
            
            /**
             * Gets the "SeqFeatSupport" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport getSeqFeatSupport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().find_element_user(SEQFEATSUPPORT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqFeatSupport" element
             */
            public void setSeqFeatSupport(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport seqFeatSupport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().find_element_user(SEQFEATSUPPORT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().add_element_user(SEQFEATSUPPORT$0);
                    }
                    target.set(seqFeatSupport);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqFeatSupport" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport addNewSeqFeatSupport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().add_element_user(SEQFEATSUPPORT$0);
                    return target;
                }
            }
        }
    }
}
