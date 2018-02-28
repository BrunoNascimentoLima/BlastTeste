/*
 * An XML document type.
 * Localname: CitRetract
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitRetractDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one CitRetract(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitRetractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitRetractDocument
{
    
    public CitRetractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITRETRACT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CitRetract");
    
    
    /**
     * Gets the "CitRetract" element
     */
    public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract getCitRetract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract target = null;
            target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().find_element_user(CITRETRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CitRetract" element
     */
    public void setCitRetract(gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract citRetract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract target = null;
            target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().find_element_user(CITRETRACT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().add_element_user(CITRETRACT$0);
            }
            target.set(citRetract);
        }
    }
    
    /**
     * Appends and returns a new empty "CitRetract" element
     */
    public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract addNewCitRetract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract target = null;
            target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().add_element_user(CITRETRACT$0);
            return target;
        }
    }
    /**
     * An XML CitRetract(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitRetractImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract
    {
        
        public CitRetractImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName EXP$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exp");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "exp" element
         */
        public java.lang.String getExp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exp" element
         */
        public org.apache.xmlbeans.XmlString xgetExp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXP$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "exp" element
         */
        public boolean isSetExp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXP$2) != 0;
            }
        }
        
        /**
         * Sets the "exp" element
         */
        public void setExp(java.lang.String exp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXP$2);
                }
                target.setStringValue(exp);
            }
        }
        
        /**
         * Sets (as xml) the "exp" element
         */
        public void xsetExp(org.apache.xmlbeans.XmlString exp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXP$2);
                }
                target.set(exp);
            }
        }
        
        /**
         * Unsets the "exp" element
         */
        public void unsetExp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXP$2, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CitRetractDocument$CitRetract$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract.Type.Value
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
