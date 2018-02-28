/*
 * An XML document type.
 * Localname: SubSource
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SubSourceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SubSource(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SubSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SubSourceDocument
{
    
    public SubSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSOURCE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SubSource");
    
    
    /**
     * Gets the "SubSource" element
     */
    public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource getSubSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
            target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().find_element_user(SUBSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubSource" element
     */
    public void setSubSource(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource subSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
            target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().find_element_user(SUBSOURCE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().add_element_user(SUBSOURCE$0);
            }
            target.set(subSource);
        }
    }
    
    /**
     * Appends and returns a new empty "SubSource" element
     */
    public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource addNewSubSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
            target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().add_element_user(SUBSOURCE$0);
            return target;
        }
    }
    /**
     * An XML SubSource(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SubSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource
    {
        
        public SubSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBTYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subtype");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName ATTRIB$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "attrib");
        
        
        /**
         * Gets the "subtype" element
         */
        public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype getSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype)get_store().find_element_user(SUBTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "subtype" element
         */
        public void setSubtype(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype subtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype)get_store().find_element_user(SUBTYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype)get_store().add_element_user(SUBTYPE$0);
                }
                target.set(subtype);
            }
        }
        
        /**
         * Appends and returns a new empty "subtype" element
         */
        public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype addNewSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype)get_store().add_element_user(SUBTYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "attrib" element
         */
        public java.lang.String getAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIB$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "attrib" element
         */
        public org.apache.xmlbeans.XmlString xgetAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIB$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "attrib" element
         */
        public boolean isSetAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIB$4) != 0;
            }
        }
        
        /**
         * Sets the "attrib" element
         */
        public void setAttrib(java.lang.String attrib)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIB$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIB$4);
                }
                target.setStringValue(attrib);
            }
        }
        
        /**
         * Sets (as xml) the "attrib" element
         */
        public void xsetAttrib(org.apache.xmlbeans.XmlString attrib)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIB$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIB$4);
                }
                target.set(attrib);
            }
        }
        
        /**
         * Unsets the "attrib" element
         */
        public void unsetAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIB$4, 0);
            }
        }
        /**
         * An XML subtype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SubSourceDocument$SubSource$Subtype.
         */
        public static class SubtypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype
        {
            
            public SubtypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected SubtypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SubSourceDocument$SubSource$Subtype$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value
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
