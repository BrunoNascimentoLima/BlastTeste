/*
 * An XML document type.
 * Localname: Seq-gap
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqGapDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-gap(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqGapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGapDocument
{
    
    public SeqGapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQGAP$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-gap");
    
    
    /**
     * Gets the "Seq-gap" element
     */
    public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap getSeqGap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap target = null;
            target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().find_element_user(SEQGAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-gap" element
     */
    public void setSeqGap(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap seqGap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap target = null;
            target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().find_element_user(SEQGAP$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().add_element_user(SEQGAP$0);
            }
            target.set(seqGap);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-gap" element
     */
    public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap addNewSeqGap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap target = null;
            target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().add_element_user(SEQGAP$0);
            return target;
        }
    }
    /**
     * An XML Seq-gap(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqGapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap
    {
        
        public SeqGapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName LINKAGE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "linkage");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "linkage" element
         */
        public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage getLinkage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage)get_store().find_element_user(LINKAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "linkage" element
         */
        public boolean isSetLinkage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKAGE$2) != 0;
            }
        }
        
        /**
         * Sets the "linkage" element
         */
        public void setLinkage(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage linkage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage)get_store().find_element_user(LINKAGE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage)get_store().add_element_user(LINKAGE$2);
                }
                target.set(linkage);
            }
        }
        
        /**
         * Appends and returns a new empty "linkage" element
         */
        public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage addNewLinkage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage)get_store().add_element_user(LINKAGE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "linkage" element
         */
        public void unsetLinkage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKAGE$2, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqGapDocument$SeqGap$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type
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
            public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqGapDocument$SeqGap$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Type.Value
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
         * An XML linkage(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqGapDocument$SeqGap$Linkage.
         */
        public static class LinkageImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage
        {
            
            public LinkageImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected LinkageImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqGapDocument$SeqGap$Linkage$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap.Linkage.Value
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
