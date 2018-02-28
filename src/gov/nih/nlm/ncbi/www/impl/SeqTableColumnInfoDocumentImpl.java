/*
 * An XML document type.
 * Localname: SeqTable-column-info
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqTable-column-info(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqTableColumnInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument
{
    
    public SeqTableColumnInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQTABLECOLUMNINFO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-column-info");
    
    
    /**
     * Gets the "SeqTable-column-info" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo getSeqTableColumnInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().find_element_user(SEQTABLECOLUMNINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqTable-column-info" element
     */
    public void setSeqTableColumnInfo(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo seqTableColumnInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().find_element_user(SEQTABLECOLUMNINFO$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().add_element_user(SEQTABLECOLUMNINFO$0);
            }
            target.set(seqTableColumnInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqTable-column-info" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo addNewSeqTableColumnInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().add_element_user(SEQTABLECOLUMNINFO$0);
            return target;
        }
    }
    /**
     * An XML SeqTable-column-info(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqTableColumnInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo
    {
        
        public SeqTableColumnInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName FIELDID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "field-id");
        private static final javax.xml.namespace.QName FIELDNAME$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "field-name");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$0) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$0, 0);
            }
        }
        
        /**
         * Gets the "field-id" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId getFieldId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId)get_store().find_element_user(FIELDID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "field-id" element
         */
        public boolean isSetFieldId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDID$2) != 0;
            }
        }
        
        /**
         * Sets the "field-id" element
         */
        public void setFieldId(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId fieldId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId)get_store().find_element_user(FIELDID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId)get_store().add_element_user(FIELDID$2);
                }
                target.set(fieldId);
            }
        }
        
        /**
         * Appends and returns a new empty "field-id" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId addNewFieldId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId)get_store().add_element_user(FIELDID$2);
                return target;
            }
        }
        
        /**
         * Unsets the "field-id" element
         */
        public void unsetFieldId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDID$2, 0);
            }
        }
        
        /**
         * Gets the "field-name" element
         */
        public java.lang.String getFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-name" element
         */
        public org.apache.xmlbeans.XmlString xgetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "field-name" element
         */
        public boolean isSetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDNAME$4) != 0;
            }
        }
        
        /**
         * Sets the "field-name" element
         */
        public void setFieldName(java.lang.String fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDNAME$4);
                }
                target.setStringValue(fieldName);
            }
        }
        
        /**
         * Sets (as xml) the "field-name" element
         */
        public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDNAME$4);
                }
                target.set(fieldName);
            }
        }
        
        /**
         * Unsets the "field-name" element
         */
        public void unsetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDNAME$4, 0);
            }
        }
        /**
         * An XML field-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument$SeqTableColumnInfo$FieldId.
         */
        public static class FieldIdImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId
        {
            
            public FieldIdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected FieldIdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument$SeqTableColumnInfo$FieldId$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value
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
