/*
 * An XML document type.
 * Localname: Medline-field
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineFieldDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Medline-field(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineFieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineFieldDocument
{
    
    public MedlineFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINEFIELD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-field");
    
    
    /**
     * Gets the "Medline-field" element
     */
    public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField getMedlineField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().find_element_user(MEDLINEFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medline-field" element
     */
    public void setMedlineField(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField medlineField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().find_element_user(MEDLINEFIELD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().add_element_user(MEDLINEFIELD$0);
            }
            target.set(medlineField);
        }
    }
    
    /**
     * Appends and returns a new empty "Medline-field" element
     */
    public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField addNewMedlineField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().add_element_user(MEDLINEFIELD$0);
            return target;
        }
    }
    /**
     * An XML Medline-field(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MedlineFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField
    {
        
        public MedlineFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName STR$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "str");
        private static final javax.xml.namespace.QName IDS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "str" element
         */
        public java.lang.String getStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "str" element
         */
        public org.apache.xmlbeans.XmlString xgetStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "str" element
         */
        public void setStr(java.lang.String str)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STR$2);
                }
                target.setStringValue(str);
            }
        }
        
        /**
         * Sets (as xml) the "str" element
         */
        public void xsetStr(org.apache.xmlbeans.XmlString str)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STR$2);
                }
                target.set(str);
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids)get_store().find_element_user(IDS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ids" element
         */
        public boolean isSetIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDS$4) != 0;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids)get_store().find_element_user(IDS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids)get_store().add_element_user(IDS$4);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids)get_store().add_element_user(IDS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ids" element
         */
        public void unsetIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDS$4, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineFieldDocument$MedlineField$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type
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
            public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineFieldDocument$MedlineField$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Type.Value
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
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField.Ids
        {
            
            public IdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DOCREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "DocRef");
            
            
            /**
             * Gets array of all "DocRef" elements
             */
            public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef[] getDocRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DOCREF$0, targetList);
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef[] result = new gov.nih.nlm.ncbi.www.DocRefDocument.DocRef[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "DocRef" element
             */
            public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef getDocRefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef target = null;
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().find_element_user(DOCREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "DocRef" element
             */
            public int sizeOfDocRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DOCREF$0);
                }
            }
            
            /**
             * Sets array of all "DocRef" element
             */
            public void setDocRefArray(gov.nih.nlm.ncbi.www.DocRefDocument.DocRef[] docRefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(docRefArray, DOCREF$0);
                }
            }
            
            /**
             * Sets ith "DocRef" element
             */
            public void setDocRefArray(int i, gov.nih.nlm.ncbi.www.DocRefDocument.DocRef docRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef target = null;
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().find_element_user(DOCREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(docRef);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DocRef" element
             */
            public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef insertNewDocRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef target = null;
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().insert_element_user(DOCREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DocRef" element
             */
            public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef addNewDocRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef target = null;
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().add_element_user(DOCREF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DocRef" element
             */
            public void removeDocRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DOCREF$0, i);
                }
            }
        }
    }
}
