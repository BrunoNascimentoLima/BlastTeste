/*
 * An XML document type.
 * Localname: TaxElement
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TaxElementDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one TaxElement(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class TaxElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TaxElementDocument
{
    
    public TaxElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "TaxElement");
    
    
    /**
     * Gets the "TaxElement" element
     */
    public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement getTaxElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
            target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().find_element_user(TAXELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TaxElement" element
     */
    public void setTaxElement(gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement taxElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
            target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().find_element_user(TAXELEMENT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().add_element_user(TAXELEMENT$0);
            }
            target.set(taxElement);
        }
    }
    
    /**
     * Appends and returns a new empty "TaxElement" element
     */
    public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement addNewTaxElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
            target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().add_element_user(TAXELEMENT$0);
            return target;
        }
    }
    /**
     * An XML TaxElement(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class TaxElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement
    {
        
        public TaxElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIXEDLEVEL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fixed-level");
        private static final javax.xml.namespace.QName LEVEL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "level");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        
        
        /**
         * Gets the "fixed-level" element
         */
        public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel getFixedLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel)get_store().find_element_user(FIXEDLEVEL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "fixed-level" element
         */
        public void setFixedLevel(gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel fixedLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel)get_store().find_element_user(FIXEDLEVEL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel)get_store().add_element_user(FIXEDLEVEL$0);
                }
                target.set(fixedLevel);
            }
        }
        
        /**
         * Appends and returns a new empty "fixed-level" element
         */
        public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel addNewFixedLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel)get_store().add_element_user(FIXEDLEVEL$0);
                return target;
            }
        }
        
        /**
         * Gets the "level" element
         */
        public java.lang.String getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "level" element
         */
        public org.apache.xmlbeans.XmlString xgetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEVEL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "level" element
         */
        public boolean isSetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEVEL$2) != 0;
            }
        }
        
        /**
         * Sets the "level" element
         */
        public void setLevel(java.lang.String level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEVEL$2);
                }
                target.setStringValue(level);
            }
        }
        
        /**
         * Sets (as xml) the "level" element
         */
        public void xsetLevel(org.apache.xmlbeans.XmlString level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEVEL$2);
                }
                target.set(level);
            }
        }
        
        /**
         * Unsets the "level" element
         */
        public void unsetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEVEL$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
                }
                target.set(name);
            }
        }
        /**
         * An XML fixed-level(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TaxElementDocument$TaxElement$FixedLevel.
         */
        public static class FixedLevelImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel
        {
            
            public FixedLevelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected FixedLevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TaxElementDocument$TaxElement$FixedLevel$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement.FixedLevel.Value
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
