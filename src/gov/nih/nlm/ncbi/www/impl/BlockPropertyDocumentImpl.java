/*
 * An XML document type.
 * Localname: BlockProperty
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BlockPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one BlockProperty(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class BlockPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BlockPropertyDocument
{
    
    public BlockPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BlockProperty");
    
    
    /**
     * Gets the "BlockProperty" element
     */
    public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty getBlockProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
            target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().find_element_user(BLOCKPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BlockProperty" element
     */
    public void setBlockProperty(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty blockProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
            target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().find_element_user(BLOCKPROPERTY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().add_element_user(BLOCKPROPERTY$0);
            }
            target.set(blockProperty);
        }
    }
    
    /**
     * Appends and returns a new empty "BlockProperty" element
     */
    public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty addNewBlockProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
            target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().add_element_user(BLOCKPROPERTY$0);
            return target;
        }
    }
    /**
     * An XML BlockProperty(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class BlockPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty
    {
        
        public BlockPropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName INTVALUE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "intvalue");
        private static final javax.xml.namespace.QName TEXTVALUE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "textvalue");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type target = null;
                target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type target = null;
                target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type target = null;
                target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "intvalue" element
         */
        public java.math.BigInteger getIntvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTVALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "intvalue" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIntvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTVALUE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "intvalue" element
         */
        public boolean isSetIntvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTVALUE$2) != 0;
            }
        }
        
        /**
         * Sets the "intvalue" element
         */
        public void setIntvalue(java.math.BigInteger intvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTVALUE$2);
                }
                target.setBigIntegerValue(intvalue);
            }
        }
        
        /**
         * Sets (as xml) the "intvalue" element
         */
        public void xsetIntvalue(org.apache.xmlbeans.XmlInteger intvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INTVALUE$2);
                }
                target.set(intvalue);
            }
        }
        
        /**
         * Unsets the "intvalue" element
         */
        public void unsetIntvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTVALUE$2, 0);
            }
        }
        
        /**
         * Gets the "textvalue" element
         */
        public java.lang.String getTextvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTVALUE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "textvalue" element
         */
        public org.apache.xmlbeans.XmlString xgetTextvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXTVALUE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "textvalue" element
         */
        public boolean isSetTextvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTVALUE$4) != 0;
            }
        }
        
        /**
         * Sets the "textvalue" element
         */
        public void setTextvalue(java.lang.String textvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTVALUE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXTVALUE$4);
                }
                target.setStringValue(textvalue);
            }
        }
        
        /**
         * Sets (as xml) the "textvalue" element
         */
        public void xsetTextvalue(org.apache.xmlbeans.XmlString textvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXTVALUE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXTVALUE$4);
                }
                target.set(textvalue);
            }
        }
        
        /**
         * Unsets the "textvalue" element
         */
        public void unsetTextvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTVALUE$4, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BlockPropertyDocument$BlockProperty$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BlockPropertyDocument$BlockProperty$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value
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
