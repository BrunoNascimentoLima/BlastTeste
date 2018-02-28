/*
 * An XML document type.
 * Localname: Medline-rn
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineRnDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Medline-rn(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineRnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineRnDocument
{
    
    public MedlineRnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINERN$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-rn");
    
    
    /**
     * Gets the "Medline-rn" element
     */
    public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn getMedlineRn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().find_element_user(MEDLINERN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medline-rn" element
     */
    public void setMedlineRn(gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn medlineRn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().find_element_user(MEDLINERN$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().add_element_user(MEDLINERN$0);
            }
            target.set(medlineRn);
        }
    }
    
    /**
     * Appends and returns a new empty "Medline-rn" element
     */
    public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn addNewMedlineRn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().add_element_user(MEDLINERN$0);
            return target;
        }
    }
    /**
     * An XML Medline-rn(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MedlineRnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn
    {
        
        public MedlineRnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName CIT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "cit" element
         */
        public java.lang.String getCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cit" element
         */
        public org.apache.xmlbeans.XmlString xgetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "cit" element
         */
        public boolean isSetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CIT$2) != 0;
            }
        }
        
        /**
         * Sets the "cit" element
         */
        public void setCit(java.lang.String cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIT$2);
                }
                target.setStringValue(cit);
            }
        }
        
        /**
         * Sets (as xml) the "cit" element
         */
        public void xsetCit(org.apache.xmlbeans.XmlString cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIT$2);
                }
                target.set(cit);
            }
        }
        
        /**
         * Unsets the "cit" element
         */
        public void unsetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CIT$2, 0);
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
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type
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
            public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineRnDocument$MedlineRn$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn.Type.Value
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
