/*
 * An XML document type.
 * Localname: Medline-qual
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineQualDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Medline-qual(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineQualDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineQualDocument
{
    
    public MedlineQualDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINEQUAL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-qual");
    
    
    /**
     * Gets the "Medline-qual" element
     */
    public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual getMedlineQual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().find_element_user(MEDLINEQUAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medline-qual" element
     */
    public void setMedlineQual(gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual medlineQual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().find_element_user(MEDLINEQUAL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().add_element_user(MEDLINEQUAL$0);
            }
            target.set(medlineQual);
        }
    }
    
    /**
     * Appends and returns a new empty "Medline-qual" element
     */
    public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual addNewMedlineQual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().add_element_user(MEDLINEQUAL$0);
            return target;
        }
    }
    /**
     * An XML Medline-qual(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MedlineQualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual
    {
        
        public MedlineQualImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MP$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mp");
        private static final javax.xml.namespace.QName SUBH$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subh");
        
        
        /**
         * Gets the "mp" element
         */
        public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp getMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp)get_store().find_element_user(MP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mp" element
         */
        public boolean isSetMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MP$0) != 0;
            }
        }
        
        /**
         * Sets the "mp" element
         */
        public void setMp(gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp mp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp)get_store().find_element_user(MP$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp)get_store().add_element_user(MP$0);
                }
                target.set(mp);
            }
        }
        
        /**
         * Appends and returns a new empty "mp" element
         */
        public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp addNewMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp)get_store().add_element_user(MP$0);
                return target;
            }
        }
        
        /**
         * Unsets the "mp" element
         */
        public void unsetMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MP$0, 0);
            }
        }
        
        /**
         * Gets the "subh" element
         */
        public java.lang.String getSubh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subh" element
         */
        public org.apache.xmlbeans.XmlString xgetSubh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBH$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subh" element
         */
        public void setSubh(java.lang.String subh)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBH$2);
                }
                target.setStringValue(subh);
            }
        }
        
        /**
         * Sets (as xml) the "subh" element
         */
        public void xsetSubh(org.apache.xmlbeans.XmlString subh)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBH$2);
                }
                target.set(subh);
            }
        }
        /**
         * An XML mp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp
        {
            
            public MpImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value)get_default_attribute_value(VALUE$0);
                    }
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
            public void setValue(gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineQualDocument$MedlineQual$Mp$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual.Mp.Value
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
