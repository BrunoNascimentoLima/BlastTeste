/*
 * An XML document type.
 * Localname: Clone-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CloneRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Clone-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CloneRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneRefDocument
{
    
    public CloneRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLONEREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Clone-ref");
    
    
    /**
     * Gets the "Clone-ref" element
     */
    public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef getCloneRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef target = null;
            target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().find_element_user(CLONEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Clone-ref" element
     */
    public void setCloneRef(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef cloneRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef target = null;
            target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().find_element_user(CLONEREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().add_element_user(CLONEREF$0);
            }
            target.set(cloneRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Clone-ref" element
     */
    public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef addNewCloneRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef target = null;
            target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().add_element_user(CLONEREF$0);
            return target;
        }
    }
    /**
     * An XML Clone-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CloneRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef
    {
        
        public CloneRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName LIBRARY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "library");
        private static final javax.xml.namespace.QName CONCORDANT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "concordant");
        private static final javax.xml.namespace.QName UNIQUE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "unique");
        private static final javax.xml.namespace.QName PLACEMENTMETHOD$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "placement-method");
        private static final javax.xml.namespace.QName CLONESEQ$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "clone-seq");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "library" element
         */
        public java.lang.String getLibrary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIBRARY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "library" element
         */
        public org.apache.xmlbeans.XmlString xgetLibrary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIBRARY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "library" element
         */
        public boolean isSetLibrary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIBRARY$2) != 0;
            }
        }
        
        /**
         * Sets the "library" element
         */
        public void setLibrary(java.lang.String library)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIBRARY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIBRARY$2);
                }
                target.setStringValue(library);
            }
        }
        
        /**
         * Sets (as xml) the "library" element
         */
        public void xsetLibrary(org.apache.xmlbeans.XmlString library)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIBRARY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIBRARY$2);
                }
                target.set(library);
            }
        }
        
        /**
         * Unsets the "library" element
         */
        public void unsetLibrary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIBRARY$2, 0);
            }
        }
        
        /**
         * Gets the "concordant" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant getConcordant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant)get_store().find_element_user(CONCORDANT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "concordant" element
         */
        public boolean isSetConcordant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONCORDANT$4) != 0;
            }
        }
        
        /**
         * Sets the "concordant" element
         */
        public void setConcordant(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant concordant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant)get_store().find_element_user(CONCORDANT$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant)get_store().add_element_user(CONCORDANT$4);
                }
                target.set(concordant);
            }
        }
        
        /**
         * Appends and returns a new empty "concordant" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant addNewConcordant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant)get_store().add_element_user(CONCORDANT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "concordant" element
         */
        public void unsetConcordant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONCORDANT$4, 0);
            }
        }
        
        /**
         * Gets the "unique" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique getUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique)get_store().find_element_user(UNIQUE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "unique" element
         */
        public boolean isSetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNIQUE$6) != 0;
            }
        }
        
        /**
         * Sets the "unique" element
         */
        public void setUnique(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique unique)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique)get_store().find_element_user(UNIQUE$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique)get_store().add_element_user(UNIQUE$6);
                }
                target.set(unique);
            }
        }
        
        /**
         * Appends and returns a new empty "unique" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique addNewUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique)get_store().add_element_user(UNIQUE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "unique" element
         */
        public void unsetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNIQUE$6, 0);
            }
        }
        
        /**
         * Gets the "placement-method" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod getPlacementMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod)get_store().find_element_user(PLACEMENTMETHOD$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "placement-method" element
         */
        public boolean isSetPlacementMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLACEMENTMETHOD$8) != 0;
            }
        }
        
        /**
         * Sets the "placement-method" element
         */
        public void setPlacementMethod(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod placementMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod)get_store().find_element_user(PLACEMENTMETHOD$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod)get_store().add_element_user(PLACEMENTMETHOD$8);
                }
                target.set(placementMethod);
            }
        }
        
        /**
         * Appends and returns a new empty "placement-method" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod addNewPlacementMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod)get_store().add_element_user(PLACEMENTMETHOD$8);
                return target;
            }
        }
        
        /**
         * Unsets the "placement-method" element
         */
        public void unsetPlacementMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLACEMENTMETHOD$8, 0);
            }
        }
        
        /**
         * Gets the "clone-seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq getCloneSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq)get_store().find_element_user(CLONESEQ$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "clone-seq" element
         */
        public boolean isSetCloneSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLONESEQ$10) != 0;
            }
        }
        
        /**
         * Sets the "clone-seq" element
         */
        public void setCloneSeq(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq cloneSeq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq)get_store().find_element_user(CLONESEQ$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq)get_store().add_element_user(CLONESEQ$10);
                }
                target.set(cloneSeq);
            }
        }
        
        /**
         * Appends and returns a new empty "clone-seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq addNewCloneSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq)get_store().add_element_user(CLONESEQ$10);
                return target;
            }
        }
        
        /**
         * Unsets the "clone-seq" element
         */
        public void unsetCloneSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLONESEQ$10, 0);
            }
        }
        /**
         * An XML concordant(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ConcordantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant
        {
            
            public ConcordantImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneRefDocument$CloneRef$Concordant$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Concordant.Value
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
         * An XML unique(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UniqueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique
        {
            
            public UniqueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneRefDocument$CloneRef$Unique$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.Unique.Value
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
         * An XML placement-method(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneRefDocument$CloneRef$PlacementMethod.
         */
        public static class PlacementMethodImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod
        {
            
            public PlacementMethodImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected PlacementMethodImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneRefDocument$CloneRef$PlacementMethod$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.PlacementMethod.Value
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
         * An XML clone-seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CloneSeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef.CloneSeq
        {
            
            public CloneSeqImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CLONESEQSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Clone-seq-set");
            
            
            /**
             * Gets the "Clone-seq-set" element
             */
            public gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet getCloneSeqSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().find_element_user(CLONESEQSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Clone-seq-set" element
             */
            public void setCloneSeqSet(gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet cloneSeqSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().find_element_user(CLONESEQSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().add_element_user(CLONESEQSET$0);
                    }
                    target.set(cloneSeqSet);
                }
            }
            
            /**
             * Appends and returns a new empty "Clone-seq-set" element
             */
            public gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet addNewCloneSeqSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqSetDocument.CloneSeqSet)get_store().add_element_user(CLONESEQSET$0);
                    return target;
                }
            }
        }
    }
}
