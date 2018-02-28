/*
 * An XML document type.
 * Localname: OrgMod
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.OrgModDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one OrgMod(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class OrgModDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgModDocument
{
    
    public OrgModDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGMOD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "OrgMod");
    
    
    /**
     * Gets the "OrgMod" element
     */
    public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod getOrgMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
            target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().find_element_user(ORGMOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrgMod" element
     */
    public void setOrgMod(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod orgMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
            target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().find_element_user(ORGMOD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().add_element_user(ORGMOD$0);
            }
            target.set(orgMod);
        }
    }
    
    /**
     * Appends and returns a new empty "OrgMod" element
     */
    public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod addNewOrgMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
            target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().add_element_user(ORGMOD$0);
            return target;
        }
    }
    /**
     * An XML OrgMod(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class OrgModImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod
    {
        
        public OrgModImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBTYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subtype");
        private static final javax.xml.namespace.QName SUBNAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subname");
        private static final javax.xml.namespace.QName ATTRIB$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "attrib");
        
        
        /**
         * Gets the "subtype" element
         */
        public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype getSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype)get_store().find_element_user(SUBTYPE$0, 0);
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
        public void setSubtype(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype subtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype)get_store().find_element_user(SUBTYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype)get_store().add_element_user(SUBTYPE$0);
                }
                target.set(subtype);
            }
        }
        
        /**
         * Appends and returns a new empty "subtype" element
         */
        public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype addNewSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype)get_store().add_element_user(SUBTYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "subname" element
         */
        public java.lang.String getSubname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subname" element
         */
        public org.apache.xmlbeans.XmlString xgetSubname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBNAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subname" element
         */
        public void setSubname(java.lang.String subname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBNAME$2);
                }
                target.setStringValue(subname);
            }
        }
        
        /**
         * Sets (as xml) the "subname" element
         */
        public void xsetSubname(org.apache.xmlbeans.XmlString subname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBNAME$2);
                }
                target.set(subname);
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
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.OrgModDocument$OrgMod$Subtype.
         */
        public static class SubtypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype
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
            public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.OrgModDocument$OrgMod$Subtype$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value
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
