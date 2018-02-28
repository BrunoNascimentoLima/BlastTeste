/*
 * An XML document type.
 * Localname: Blast4-ka-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4KaBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-ka-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4KaBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4KaBlockDocument
{
    
    public Blast4KaBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4KABLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-ka-block");
    
    
    /**
     * Gets the "Blast4-ka-block" element
     */
    public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock getBlast4KaBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().find_element_user(BLAST4KABLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-ka-block" element
     */
    public void setBlast4KaBlock(gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock blast4KaBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().find_element_user(BLAST4KABLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().add_element_user(BLAST4KABLOCK$0);
            }
            target.set(blast4KaBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-ka-block" element
     */
    public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock addNewBlast4KaBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().add_element_user(BLAST4KABLOCK$0);
            return target;
        }
    }
    /**
     * An XML Blast4-ka-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4KaBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock
    {
        
        public Blast4KaBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LAMBDA$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lambda");
        private static final javax.xml.namespace.QName K$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "k");
        private static final javax.xml.namespace.QName H$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "h");
        private static final javax.xml.namespace.QName GAPPED$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gapped");
        
        
        /**
         * Gets the "lambda" element
         */
        public double getLambda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAMBDA$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lambda" element
         */
        public org.apache.xmlbeans.XmlDouble xgetLambda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LAMBDA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lambda" element
         */
        public void setLambda(double lambda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAMBDA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAMBDA$0);
                }
                target.setDoubleValue(lambda);
            }
        }
        
        /**
         * Sets (as xml) the "lambda" element
         */
        public void xsetLambda(org.apache.xmlbeans.XmlDouble lambda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LAMBDA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LAMBDA$0);
                }
                target.set(lambda);
            }
        }
        
        /**
         * Gets the "k" element
         */
        public double getK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(K$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "k" element
         */
        public org.apache.xmlbeans.XmlDouble xgetK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(K$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "k" element
         */
        public void setK(double k)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(K$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(K$2);
                }
                target.setDoubleValue(k);
            }
        }
        
        /**
         * Sets (as xml) the "k" element
         */
        public void xsetK(org.apache.xmlbeans.XmlDouble k)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(K$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(K$2);
                }
                target.set(k);
            }
        }
        
        /**
         * Gets the "h" element
         */
        public double getH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(H$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "h" element
         */
        public org.apache.xmlbeans.XmlDouble xgetH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(H$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "h" element
         */
        public void setH(double h)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(H$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(H$4);
                }
                target.setDoubleValue(h);
            }
        }
        
        /**
         * Sets (as xml) the "h" element
         */
        public void xsetH(org.apache.xmlbeans.XmlDouble h)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(H$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(H$4);
                }
                target.set(h);
            }
        }
        
        /**
         * Gets the "gapped" element
         */
        public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped getGapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped)get_store().find_element_user(GAPPED$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "gapped" element
         */
        public void setGapped(gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped gapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped)get_store().find_element_user(GAPPED$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped)get_store().add_element_user(GAPPED$6);
                }
                target.set(gapped);
            }
        }
        
        /**
         * Appends and returns a new empty "gapped" element
         */
        public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped addNewGapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped)get_store().add_element_user(GAPPED$6);
                return target;
            }
        }
        /**
         * An XML gapped(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GappedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped
        {
            
            public GappedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4KaBlockDocument$Blast4KaBlock$Gapped$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock.Gapped.Value
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
    }
}
