/*
 * An XML document type.
 * Localname: EvidenceCategory
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EvidenceCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one EvidenceCategory(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class EvidenceCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EvidenceCategoryDocument
{
    
    public EvidenceCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML EvidenceCategory(@http://www.ncbi.nlm.nih.gov).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EvidenceCategoryDocument$EvidenceCategory.
     */
    public static class EvidenceCategoryImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory
    {
        
        public EvidenceCategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected EvidenceCategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value)get_store().find_attribute_user(VALUE$0);
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
        public void setValue(gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value)get_store().add_attribute_user(VALUE$0);
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
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EvidenceCategoryDocument$EvidenceCategory$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory.Value
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
