/*
 * An XML document type.
 * Localname: Product-pos
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ProductPosDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Product-pos(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ProductPosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProductPosDocument
{
    
    public ProductPosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Product-pos(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ProductPosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos
    {
        
        public ProductPosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUCPOS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "nucpos");
        private static final javax.xml.namespace.QName PROTPOS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "protpos");
        
        
        /**
         * Gets the "nucpos" element
         */
        public java.math.BigInteger getNucpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCPOS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nucpos" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNucpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUCPOS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "nucpos" element
         */
        public boolean isSetNucpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUCPOS$0) != 0;
            }
        }
        
        /**
         * Sets the "nucpos" element
         */
        public void setNucpos(java.math.BigInteger nucpos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUCPOS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUCPOS$0);
                }
                target.setBigIntegerValue(nucpos);
            }
        }
        
        /**
         * Sets (as xml) the "nucpos" element
         */
        public void xsetNucpos(org.apache.xmlbeans.XmlInteger nucpos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUCPOS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUCPOS$0);
                }
                target.set(nucpos);
            }
        }
        
        /**
         * Unsets the "nucpos" element
         */
        public void unsetNucpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUCPOS$0, 0);
            }
        }
        
        /**
         * Gets the "protpos" element
         */
        public gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos getProtpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos target = null;
                target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos)get_store().find_element_user(PROTPOS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "protpos" element
         */
        public boolean isSetProtpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROTPOS$2) != 0;
            }
        }
        
        /**
         * Sets the "protpos" element
         */
        public void setProtpos(gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos protpos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos target = null;
                target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos)get_store().find_element_user(PROTPOS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos)get_store().add_element_user(PROTPOS$2);
                }
                target.set(protpos);
            }
        }
        
        /**
         * Appends and returns a new empty "protpos" element
         */
        public gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos addNewProtpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos target = null;
                target = (gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos)get_store().add_element_user(PROTPOS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "protpos" element
         */
        public void unsetProtpos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROTPOS$2, 0);
            }
        }
        /**
         * An XML protpos(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProtposImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos.Protpos
        {
            
            public ProtposImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROTPOS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Prot-pos");
            
            
            /**
             * Gets the "Prot-pos" element
             */
            public gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos getProtPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().find_element_user(PROTPOS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Prot-pos" element
             */
            public void setProtPos(gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos protPos)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().find_element_user(PROTPOS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().add_element_user(PROTPOS$0);
                    }
                    target.set(protPos);
                }
            }
            
            /**
             * Appends and returns a new empty "Prot-pos" element
             */
            public gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos addNewProtPos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().add_element_user(PROTPOS$0);
                    return target;
                }
            }
        }
    }
}
