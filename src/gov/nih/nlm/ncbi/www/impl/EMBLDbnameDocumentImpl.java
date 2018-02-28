/*
 * An XML document type.
 * Localname: EMBL-dbname
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EMBLDbnameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one EMBL-dbname(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class EMBLDbnameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLDbnameDocument
{
    
    public EMBLDbnameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBLDBNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EMBL-dbname");
    
    
    /**
     * Gets the "EMBL-dbname" element
     */
    public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname getEMBLDbname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().find_element_user(EMBLDBNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EMBL-dbname" element
     */
    public void setEMBLDbname(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname emblDbname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().find_element_user(EMBLDBNAME$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().add_element_user(EMBLDBNAME$0);
            }
            target.set(emblDbname);
        }
    }
    
    /**
     * Appends and returns a new empty "EMBL-dbname" element
     */
    public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname addNewEMBLDbname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().add_element_user(EMBLDBNAME$0);
            return target;
        }
    }
    /**
     * An XML EMBL-dbname(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class EMBLDbnameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname
    {
        
        public EMBLDbnameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "code");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        
        
        /**
         * Gets the "code" element
         */
        public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "code" element
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODE$0) != 0;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code)get_store().add_element_user(CODE$0);
                }
                target.set(code);
            }
        }
        
        /**
         * Appends and returns a new empty "code" element
         */
        public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code addNewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code)get_store().add_element_user(CODE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "code" element
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODE$0, 0);
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
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$2) != 0;
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
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$2, 0);
            }
        }
        /**
         * An XML code(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code
        {
            
            public CodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EMBLDbnameDocument$EMBLDbname$Code$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value
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
