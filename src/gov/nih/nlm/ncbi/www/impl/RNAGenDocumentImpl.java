/*
 * An XML document type.
 * Localname: RNA-gen
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RNAGenDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one RNA-gen(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class RNAGenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNAGenDocument
{
    
    public RNAGenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RNAGEN$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-gen");
    
    
    /**
     * Gets the "RNA-gen" element
     */
    public gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen getRNAGen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen target = null;
            target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().find_element_user(RNAGEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RNA-gen" element
     */
    public void setRNAGen(gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen rnaGen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen target = null;
            target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().find_element_user(RNAGEN$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().add_element_user(RNAGEN$0);
            }
            target.set(rnaGen);
        }
    }
    
    /**
     * Appends and returns a new empty "RNA-gen" element
     */
    public gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen addNewRNAGen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen target = null;
            target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().add_element_user(RNAGEN$0);
            return target;
        }
    }
    /**
     * An XML RNA-gen(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class RNAGenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen
    {
        
        public RNAGenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASS1$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName PRODUCT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "product");
        private static final javax.xml.namespace.QName QUALS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "quals");
        
        
        /**
         * Gets the "class" element
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" element
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "class" element
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASS1$0) != 0;
            }
        }
        
        /**
         * Sets the "class" element
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASS1$0);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" element
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASS1$0);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" element
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASS1$0, 0);
            }
        }
        
        /**
         * Gets the "product" element
         */
        public java.lang.String getProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "product" element
         */
        public org.apache.xmlbeans.XmlString xgetProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$2, 0);
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
                return get_store().count_elements(PRODUCT$2) != 0;
            }
        }
        
        /**
         * Sets the "product" element
         */
        public void setProduct(java.lang.String product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCT$2);
                }
                target.setStringValue(product);
            }
        }
        
        /**
         * Sets (as xml) the "product" element
         */
        public void xsetProduct(org.apache.xmlbeans.XmlString product)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCT$2);
                }
                target.set(product);
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
                get_store().remove_element(PRODUCT$2, 0);
            }
        }
        
        /**
         * Gets the "quals" element
         */
        public gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals getQuals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals target = null;
                target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals)get_store().find_element_user(QUALS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "quals" element
         */
        public boolean isSetQuals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALS$4) != 0;
            }
        }
        
        /**
         * Sets the "quals" element
         */
        public void setQuals(gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals quals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals target = null;
                target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals)get_store().find_element_user(QUALS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals)get_store().add_element_user(QUALS$4);
                }
                target.set(quals);
            }
        }
        
        /**
         * Appends and returns a new empty "quals" element
         */
        public gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals addNewQuals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals target = null;
                target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals)get_store().add_element_user(QUALS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "quals" element
         */
        public void unsetQuals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALS$4, 0);
            }
        }
        /**
         * An XML quals(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QualsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen.Quals
        {
            
            public QualsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RNAQUALSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-qual-set");
            
            
            /**
             * Gets the "RNA-qual-set" element
             */
            public gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet getRNAQualSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet target = null;
                    target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().find_element_user(RNAQUALSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "RNA-qual-set" element
             */
            public void setRNAQualSet(gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet rnaQualSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet target = null;
                    target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().find_element_user(RNAQUALSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().add_element_user(RNAQUALSET$0);
                    }
                    target.set(rnaQualSet);
                }
            }
            
            /**
             * Appends and returns a new empty "RNA-qual-set" element
             */
            public gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet addNewRNAQualSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet target = null;
                    target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().add_element_user(RNAQUALSET$0);
                    return target;
                }
            }
        }
    }
}
