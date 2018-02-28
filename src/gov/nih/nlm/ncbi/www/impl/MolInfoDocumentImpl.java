/*
 * An XML document type.
 * Localname: MolInfo
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MolInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one MolInfo(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MolInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MolInfoDocument
{
    
    public MolInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOLINFO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "MolInfo");
    
    
    /**
     * Gets the "MolInfo" element
     */
    public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo getMolInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo target = null;
            target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().find_element_user(MOLINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MolInfo" element
     */
    public void setMolInfo(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo molInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo target = null;
            target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().find_element_user(MOLINFO$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().add_element_user(MOLINFO$0);
            }
            target.set(molInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "MolInfo" element
     */
    public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo addNewMolInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo target = null;
            target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().add_element_user(MOLINFO$0);
            return target;
        }
    }
    /**
     * An XML MolInfo(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MolInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo
    {
        
        public MolInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BIOMOL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "biomol");
        private static final javax.xml.namespace.QName TECH$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tech");
        private static final javax.xml.namespace.QName TECHEXP$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "techexp");
        private static final javax.xml.namespace.QName COMPLETENESS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "completeness");
        private static final javax.xml.namespace.QName GBMOLTYPE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gbmoltype");
        
        
        /**
         * Gets the "biomol" element
         */
        public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol getBiomol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol)get_store().find_element_user(BIOMOL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "biomol" element
         */
        public boolean isSetBiomol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOMOL$0) != 0;
            }
        }
        
        /**
         * Sets the "biomol" element
         */
        public void setBiomol(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol biomol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol)get_store().find_element_user(BIOMOL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol)get_store().add_element_user(BIOMOL$0);
                }
                target.set(biomol);
            }
        }
        
        /**
         * Appends and returns a new empty "biomol" element
         */
        public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol addNewBiomol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol)get_store().add_element_user(BIOMOL$0);
                return target;
            }
        }
        
        /**
         * Unsets the "biomol" element
         */
        public void unsetBiomol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOMOL$0, 0);
            }
        }
        
        /**
         * Gets the "tech" element
         */
        public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech getTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech)get_store().find_element_user(TECH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "tech" element
         */
        public boolean isSetTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TECH$2) != 0;
            }
        }
        
        /**
         * Sets the "tech" element
         */
        public void setTech(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech tech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech)get_store().find_element_user(TECH$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech)get_store().add_element_user(TECH$2);
                }
                target.set(tech);
            }
        }
        
        /**
         * Appends and returns a new empty "tech" element
         */
        public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech addNewTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech)get_store().add_element_user(TECH$2);
                return target;
            }
        }
        
        /**
         * Unsets the "tech" element
         */
        public void unsetTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TECH$2, 0);
            }
        }
        
        /**
         * Gets the "techexp" element
         */
        public java.lang.String getTechexp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHEXP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "techexp" element
         */
        public org.apache.xmlbeans.XmlString xgetTechexp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TECHEXP$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "techexp" element
         */
        public boolean isSetTechexp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TECHEXP$4) != 0;
            }
        }
        
        /**
         * Sets the "techexp" element
         */
        public void setTechexp(java.lang.String techexp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHEXP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TECHEXP$4);
                }
                target.setStringValue(techexp);
            }
        }
        
        /**
         * Sets (as xml) the "techexp" element
         */
        public void xsetTechexp(org.apache.xmlbeans.XmlString techexp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TECHEXP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TECHEXP$4);
                }
                target.set(techexp);
            }
        }
        
        /**
         * Unsets the "techexp" element
         */
        public void unsetTechexp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TECHEXP$4, 0);
            }
        }
        
        /**
         * Gets the "completeness" element
         */
        public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness getCompleteness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness)get_store().find_element_user(COMPLETENESS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "completeness" element
         */
        public boolean isSetCompleteness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPLETENESS$6) != 0;
            }
        }
        
        /**
         * Sets the "completeness" element
         */
        public void setCompleteness(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness completeness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness)get_store().find_element_user(COMPLETENESS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness)get_store().add_element_user(COMPLETENESS$6);
                }
                target.set(completeness);
            }
        }
        
        /**
         * Appends and returns a new empty "completeness" element
         */
        public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness addNewCompleteness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness target = null;
                target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness)get_store().add_element_user(COMPLETENESS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "completeness" element
         */
        public void unsetCompleteness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPLETENESS$6, 0);
            }
        }
        
        /**
         * Gets the "gbmoltype" element
         */
        public java.lang.String getGbmoltype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GBMOLTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gbmoltype" element
         */
        public org.apache.xmlbeans.XmlString xgetGbmoltype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GBMOLTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "gbmoltype" element
         */
        public boolean isSetGbmoltype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GBMOLTYPE$8) != 0;
            }
        }
        
        /**
         * Sets the "gbmoltype" element
         */
        public void setGbmoltype(java.lang.String gbmoltype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GBMOLTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GBMOLTYPE$8);
                }
                target.setStringValue(gbmoltype);
            }
        }
        
        /**
         * Sets (as xml) the "gbmoltype" element
         */
        public void xsetGbmoltype(org.apache.xmlbeans.XmlString gbmoltype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GBMOLTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GBMOLTYPE$8);
                }
                target.set(gbmoltype);
            }
        }
        
        /**
         * Unsets the "gbmoltype" element
         */
        public void unsetGbmoltype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GBMOLTYPE$8, 0);
            }
        }
        /**
         * An XML biomol(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Biomol.
         */
        public static class BiomolImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol
        {
            
            public BiomolImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected BiomolImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Biomol$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value
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
        /**
         * An XML tech(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Tech.
         */
        public static class TechImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech
        {
            
            public TechImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected TechImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Tech$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value
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
        /**
         * An XML completeness(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Completeness.
         */
        public static class CompletenessImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness
        {
            
            public CompletenessImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected CompletenessImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Completeness$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value
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
