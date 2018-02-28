/*
 * An XML document type.
 * Localname: InferenceSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.InferenceSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one InferenceSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class InferenceSupportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument
{
    
    public InferenceSupportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFERENCESUPPORT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "InferenceSupport");
    
    
    /**
     * Gets the "InferenceSupport" element
     */
    public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport getInferenceSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
            target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().find_element_user(INFERENCESUPPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InferenceSupport" element
     */
    public void setInferenceSupport(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport inferenceSupport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
            target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().find_element_user(INFERENCESUPPORT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().add_element_user(INFERENCESUPPORT$0);
            }
            target.set(inferenceSupport);
        }
    }
    
    /**
     * Appends and returns a new empty "InferenceSupport" element
     */
    public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport addNewInferenceSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
            target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().add_element_user(INFERENCESUPPORT$0);
            return target;
        }
    }
    /**
     * An XML InferenceSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class InferenceSupportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport
    {
        
        public InferenceSupportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "category");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName OTHERTYPE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "other-type");
        private static final javax.xml.namespace.QName SAMESPECIES$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "same-species");
        private static final javax.xml.namespace.QName BASIS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "basis");
        private static final javax.xml.namespace.QName PMIDS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmids");
        private static final javax.xml.namespace.QName DOIS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dois");
        
        
        /**
         * Gets the "category" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "category" element
         */
        public boolean isSetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORY$0) != 0;
            }
        }
        
        /**
         * Sets the "category" element
         */
        public void setCategory(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category)get_store().add_element_user(CATEGORY$0);
                }
                target.set(category);
            }
        }
        
        /**
         * Appends and returns a new empty "category" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category addNewCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category)get_store().add_element_user(CATEGORY$0);
                return target;
            }
        }
        
        /**
         * Unsets the "category" element
         */
        public void unsetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORY$0, 0);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type)get_store().find_element_user(TYPE$2, 0);
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
                return get_store().count_elements(TYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type)get_store().add_element_user(TYPE$2);
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
                get_store().remove_element(TYPE$2, 0);
            }
        }
        
        /**
         * Gets the "other-type" element
         */
        public java.lang.String getOtherType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "other-type" element
         */
        public org.apache.xmlbeans.XmlString xgetOtherType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "other-type" element
         */
        public boolean isSetOtherType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHERTYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "other-type" element
         */
        public void setOtherType(java.lang.String otherType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERTYPE$4);
                }
                target.setStringValue(otherType);
            }
        }
        
        /**
         * Sets (as xml) the "other-type" element
         */
        public void xsetOtherType(org.apache.xmlbeans.XmlString otherType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTHERTYPE$4);
                }
                target.set(otherType);
            }
        }
        
        /**
         * Unsets the "other-type" element
         */
        public void unsetOtherType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHERTYPE$4, 0);
            }
        }
        
        /**
         * Gets the "same-species" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies getSameSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies)get_store().find_element_user(SAMESPECIES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "same-species" element
         */
        public boolean isSetSameSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SAMESPECIES$6) != 0;
            }
        }
        
        /**
         * Sets the "same-species" element
         */
        public void setSameSpecies(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies sameSpecies)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies)get_store().find_element_user(SAMESPECIES$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies)get_store().add_element_user(SAMESPECIES$6);
                }
                target.set(sameSpecies);
            }
        }
        
        /**
         * Appends and returns a new empty "same-species" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies addNewSameSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies)get_store().add_element_user(SAMESPECIES$6);
                return target;
            }
        }
        
        /**
         * Unsets the "same-species" element
         */
        public void unsetSameSpecies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SAMESPECIES$6, 0);
            }
        }
        
        /**
         * Gets the "basis" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis getBasis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis)get_store().find_element_user(BASIS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "basis" element
         */
        public void setBasis(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis basis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis)get_store().find_element_user(BASIS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis)get_store().add_element_user(BASIS$8);
                }
                target.set(basis);
            }
        }
        
        /**
         * Appends and returns a new empty "basis" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis addNewBasis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis)get_store().add_element_user(BASIS$8);
                return target;
            }
        }
        
        /**
         * Gets the "pmids" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids getPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids)get_store().find_element_user(PMIDS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmids" element
         */
        public boolean isSetPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMIDS$10) != 0;
            }
        }
        
        /**
         * Sets the "pmids" element
         */
        public void setPmids(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids pmids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids)get_store().find_element_user(PMIDS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids)get_store().add_element_user(PMIDS$10);
                }
                target.set(pmids);
            }
        }
        
        /**
         * Appends and returns a new empty "pmids" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids addNewPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids)get_store().add_element_user(PMIDS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "pmids" element
         */
        public void unsetPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMIDS$10, 0);
            }
        }
        
        /**
         * Gets the "dois" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois getDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois)get_store().find_element_user(DOIS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dois" element
         */
        public boolean isSetDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOIS$12) != 0;
            }
        }
        
        /**
         * Sets the "dois" element
         */
        public void setDois(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois dois)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois)get_store().find_element_user(DOIS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois)get_store().add_element_user(DOIS$12);
                }
                target.set(dois);
            }
        }
        
        /**
         * Appends and returns a new empty "dois" element
         */
        public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois addNewDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois target = null;
                target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois)get_store().add_element_user(DOIS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "dois" element
         */
        public void unsetDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOIS$12, 0);
            }
        }
        /**
         * An XML category(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CategoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category
        {
            
            public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EVIDENCECATEGORY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EvidenceCategory");
            
            
            /**
             * Gets the "EvidenceCategory" element
             */
            public gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory getEvidenceCategory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().find_element_user(EVIDENCECATEGORY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EvidenceCategory" element
             */
            public void setEvidenceCategory(gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory evidenceCategory)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().find_element_user(EVIDENCECATEGORY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().add_element_user(EVIDENCECATEGORY$0);
                    }
                    target.set(evidenceCategory);
                }
            }
            
            /**
             * Appends and returns a new empty "EvidenceCategory" element
             */
            public gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory addNewEvidenceCategory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().add_element_user(EVIDENCECATEGORY$0);
                    return target;
                }
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value
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
         * An XML same-species(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SameSpeciesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies
        {
            
            public SameSpeciesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$SameSpecies$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value
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
         * An XML basis(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BasisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis
        {
            
            public BasisImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EVIDENCEBASIS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EvidenceBasis");
            
            
            /**
             * Gets the "EvidenceBasis" element
             */
            public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis getEvidenceBasis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().find_element_user(EVIDENCEBASIS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EvidenceBasis" element
             */
            public void setEvidenceBasis(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis evidenceBasis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().find_element_user(EVIDENCEBASIS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().add_element_user(EVIDENCEBASIS$0);
                    }
                    target.set(evidenceBasis);
                }
            }
            
            /**
             * Appends and returns a new empty "EvidenceBasis" element
             */
            public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis addNewEvidenceBasis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().add_element_user(EVIDENCEBASIS$0);
                    return target;
                }
            }
        }
        /**
         * An XML pmids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmidsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids
        {
            
            public PmidsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBMEDID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
            
            
            /**
             * Gets array of all "PubMedId" elements
             */
            public java.math.BigInteger[] getPubMedIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUBMEDID$0, targetList);
                    java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "PubMedId" element
             */
            public java.math.BigInteger getPubMedIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "PubMedId" elements
             */
            public org.apache.xmlbeans.XmlInteger[] xgetPubMedIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUBMEDID$0, targetList);
                    org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger xgetPubMedIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlInteger)target;
                }
            }
            
            /**
             * Returns number of "PubMedId" element
             */
            public int sizeOfPubMedIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PUBMEDID$0);
                }
            }
            
            /**
             * Sets array of all "PubMedId" element
             */
            public void setPubMedIdArray(java.math.BigInteger[] pubMedIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pubMedIdArray, PUBMEDID$0);
                }
            }
            
            /**
             * Sets ith "PubMedId" element
             */
            public void setPubMedIdArray(int i, java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Sets (as xml) array of all "PubMedId" element
             */
            public void xsetPubMedIdArray(org.apache.xmlbeans.XmlInteger[]pubMedIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pubMedIdArray, PUBMEDID$0);
                }
            }
            
            /**
             * Sets (as xml) ith "PubMedId" element
             */
            public void xsetPubMedIdArray(int i, org.apache.xmlbeans.XmlInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pubMedId);
                }
            }
            
            /**
             * Inserts the value as the ith "PubMedId" element
             */
            public void insertPubMedId(int i, java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PUBMEDID$0, i);
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Appends the value as the last "PubMedId" element
             */
            public void addPubMedId(java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBMEDID$0);
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger insertNewPubMedId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PUBMEDID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger addNewPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PUBMEDID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "PubMedId" element
             */
            public void removePubMedId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PUBMEDID$0, i);
                }
            }
        }
        /**
         * An XML dois(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DoisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois
        {
            
            public DoisImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DOI$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "DOI");
            
            
            /**
             * Gets array of all "DOI" elements
             */
            public java.lang.String[] getDOIArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DOI$0, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "DOI" element
             */
            public java.lang.String getDOIArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "DOI" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetDOIArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DOI$0, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "DOI" element
             */
            public org.apache.xmlbeans.XmlString xgetDOIArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "DOI" element
             */
            public int sizeOfDOIArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DOI$0);
                }
            }
            
            /**
             * Sets array of all "DOI" element
             */
            public void setDOIArray(java.lang.String[] doiArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(doiArray, DOI$0);
                }
            }
            
            /**
             * Sets ith "DOI" element
             */
            public void setDOIArray(int i, java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Sets (as xml) array of all "DOI" element
             */
            public void xsetDOIArray(org.apache.xmlbeans.XmlString[]doiArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(doiArray, DOI$0);
                }
            }
            
            /**
             * Sets (as xml) ith "DOI" element
             */
            public void xsetDOIArray(int i, org.apache.xmlbeans.XmlString doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(doi);
                }
            }
            
            /**
             * Inserts the value as the ith "DOI" element
             */
            public void insertDOI(int i, java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOI$0, i);
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Appends the value as the last "DOI" element
             */
            public void addDOI(java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOI$0);
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DOI" element
             */
            public org.apache.xmlbeans.XmlString insertNewDOI(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DOI$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DOI" element
             */
            public org.apache.xmlbeans.XmlString addNewDOI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOI$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DOI" element
             */
            public void removeDOI(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DOI$0, i);
                }
            }
        }
    }
}
