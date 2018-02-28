/*
 * An XML document type.
 * Localname: Cit-let
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitLetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-let(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitLetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitLetDocument
{
    
    public CitLetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITLET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-let");
    
    
    /**
     * Gets the "Cit-let" element
     */
    public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet getCitLet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitLetDocument.CitLet target = null;
            target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().find_element_user(CITLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cit-let" element
     */
    public void setCitLet(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet citLet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitLetDocument.CitLet target = null;
            target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().find_element_user(CITLET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().add_element_user(CITLET$0);
            }
            target.set(citLet);
        }
    }
    
    /**
     * Appends and returns a new empty "Cit-let" element
     */
    public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet addNewCitLet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitLetDocument.CitLet target = null;
            target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().add_element_user(CITLET$0);
            return target;
        }
    }
    /**
     * An XML Cit-let(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitLetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitLetDocument.CitLet
    {
        
        public CitLetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CIT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        private static final javax.xml.namespace.QName MANID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "man-id");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        
        
        /**
         * Gets the "cit" element
         */
        public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit getCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit)get_store().find_element_user(CIT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cit" element
         */
        public void setCit(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit)get_store().find_element_user(CIT$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit)get_store().add_element_user(CIT$0);
                }
                target.set(cit);
            }
        }
        
        /**
         * Appends and returns a new empty "cit" element
         */
        public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit addNewCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit)get_store().add_element_user(CIT$0);
                return target;
            }
        }
        
        /**
         * Gets the "man-id" element
         */
        public java.lang.String getManId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "man-id" element
         */
        public org.apache.xmlbeans.XmlString xgetManId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "man-id" element
         */
        public boolean isSetManId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MANID$2) != 0;
            }
        }
        
        /**
         * Sets the "man-id" element
         */
        public void setManId(java.lang.String manId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANID$2);
                }
                target.setStringValue(manId);
            }
        }
        
        /**
         * Sets (as xml) the "man-id" element
         */
        public void xsetManId(org.apache.xmlbeans.XmlString manId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANID$2);
                }
                target.set(manId);
            }
        }
        
        /**
         * Unsets the "man-id" element
         */
        public void unsetManId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MANID$2, 0);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type)get_store().find_element_user(TYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "type" element
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type)get_store().find_element_user(TYPE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type)get_store().add_element_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type)get_store().add_element_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "type" element
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$4, 0);
            }
        }
        /**
         * An XML cit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Cit
        {
            
            public CitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITBOOK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-book");
            
            
            /**
             * Gets the "Cit-book" element
             */
            public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook getCitBook()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().find_element_user(CITBOOK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Cit-book" element
             */
            public void setCitBook(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook citBook)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().find_element_user(CITBOOK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().add_element_user(CITBOOK$0);
                    }
                    target.set(citBook);
                }
            }
            
            /**
             * Appends and returns a new empty "Cit-book" element
             */
            public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook addNewCitBook()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().add_element_user(CITBOOK$0);
                    return target;
                }
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type
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
            public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CitLetDocument$CitLet$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CitLetDocument.CitLet.Type.Value
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
