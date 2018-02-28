/*
 * An XML document type.
 * Localname: Medline-si
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineSiDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Medline-si(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineSiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineSiDocument
{
    
    public MedlineSiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINESI$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-si");
    
    
    /**
     * Gets the "Medline-si" element
     */
    public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi getMedlineSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().find_element_user(MEDLINESI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medline-si" element
     */
    public void setMedlineSi(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi medlineSi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().find_element_user(MEDLINESI$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().add_element_user(MEDLINESI$0);
            }
            target.set(medlineSi);
        }
    }
    
    /**
     * Appends and returns a new empty "Medline-si" element
     */
    public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi addNewMedlineSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().add_element_user(MEDLINESI$0);
            return target;
        }
    }
    /**
     * An XML Medline-si(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MedlineSiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi
    {
        
        public MedlineSiImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName CIT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type)get_store().add_element_user(TYPE$0);
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
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type
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
            public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineSiDocument$MedlineSi$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value
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
