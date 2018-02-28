/*
 * An XML document type.
 * Localname: Num-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Num-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumRefDocument
{
    
    public NumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-ref");
    
    
    /**
     * Gets the "Num-ref" element
     */
    public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef getNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef target = null;
            target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().find_element_user(NUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Num-ref" element
     */
    public void setNumRef(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef numRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef target = null;
            target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().find_element_user(NUMREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().add_element_user(NUMREF$0);
            }
            target.set(numRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Num-ref" element
     */
    public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef addNewNumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef target = null;
            target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef)get_store().add_element_user(NUMREF$0);
            return target;
        }
    }
    /**
     * An XML Num-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NumRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumRefDocument.NumRef
    {
        
        public NumRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName ALIGNS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "aligns");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "aligns" element
         */
        public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns getAligns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns target = null;
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns)get_store().find_element_user(ALIGNS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "aligns" element
         */
        public boolean isSetAligns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNS$2) != 0;
            }
        }
        
        /**
         * Sets the "aligns" element
         */
        public void setAligns(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns aligns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns target = null;
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns)get_store().find_element_user(ALIGNS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns)get_store().add_element_user(ALIGNS$2);
                }
                target.set(aligns);
            }
        }
        
        /**
         * Appends and returns a new empty "aligns" element
         */
        public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns addNewAligns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns target = null;
                target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns)get_store().add_element_user(ALIGNS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "aligns" element
         */
        public void unsetAligns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNS$2, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type
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
            public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.NumRefDocument$NumRef$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value
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
         * An XML aligns(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlignsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns
        {
            
            public AlignsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQALIGN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align");
            
            
            /**
             * Gets the "Seq-align" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-align" element
             */
            public void setSeqAlign(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().add_element_user(SEQALIGN$0);
                    }
                    target.set(seqAlign);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-align" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().add_element_user(SEQALIGN$0);
                    return target;
                }
            }
        }
    }
}
