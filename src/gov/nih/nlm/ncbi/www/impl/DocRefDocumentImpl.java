/*
 * An XML document type.
 * Localname: DocRef
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DocRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one DocRef(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DocRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DocRefDocument
{
    
    public DocRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "DocRef");
    
    
    /**
     * Gets the "DocRef" element
     */
    public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef getDocRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DocRefDocument.DocRef target = null;
            target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().find_element_user(DOCREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DocRef" element
     */
    public void setDocRef(gov.nih.nlm.ncbi.www.DocRefDocument.DocRef docRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DocRefDocument.DocRef target = null;
            target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().find_element_user(DOCREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef)get_store().add_element_user(DOCREF$0);
            }
            target.set(docRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DocRef" element
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
     * An XML DocRef(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DocRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DocRefDocument.DocRef
    {
        
        public DocRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName UID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "uid");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "uid" element
         */
        public java.math.BigInteger getUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "uid" element
         */
        public org.apache.xmlbeans.XmlInteger xgetUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(UID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "uid" element
         */
        public void setUid(java.math.BigInteger uid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UID$2);
                }
                target.setBigIntegerValue(uid);
            }
        }
        
        /**
         * Sets (as xml) the "uid" element
         */
        public void xsetUid(org.apache.xmlbeans.XmlInteger uid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(UID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(UID$2);
                }
                target.set(uid);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.DocRefDocument$DocRef$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type
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
            public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.DocRefDocument$DocRef$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.DocRefDocument.DocRef.Type.Value
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
