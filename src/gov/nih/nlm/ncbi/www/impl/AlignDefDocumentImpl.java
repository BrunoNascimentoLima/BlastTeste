/*
 * An XML document type.
 * Localname: Align-def
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AlignDefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Align-def(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AlignDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AlignDefDocument
{
    
    public AlignDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIGNDEF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Align-def");
    
    
    /**
     * Gets the "Align-def" element
     */
    public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef getAlignDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef target = null;
            target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().find_element_user(ALIGNDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Align-def" element
     */
    public void setAlignDef(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef alignDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef target = null;
            target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().find_element_user(ALIGNDEF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().add_element_user(ALIGNDEF$0);
            }
            target.set(alignDef);
        }
    }
    
    /**
     * Appends and returns a new empty "Align-def" element
     */
    public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef addNewAlignDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef target = null;
            target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().add_element_user(ALIGNDEF$0);
            return target;
        }
    }
    /**
     * An XML Align-def(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AlignDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef
    {
        
        public AlignDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALIGNTYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "align-type");
        private static final javax.xml.namespace.QName IDS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        
        
        /**
         * Gets the "align-type" element
         */
        public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType getAlignType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType target = null;
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType)get_store().find_element_user(ALIGNTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "align-type" element
         */
        public void setAlignType(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType alignType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType target = null;
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType)get_store().find_element_user(ALIGNTYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType)get_store().add_element_user(ALIGNTYPE$0);
                }
                target.set(alignType);
            }
        }
        
        /**
         * Appends and returns a new empty "align-type" element
         */
        public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType addNewAlignType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType target = null;
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType)get_store().add_element_user(ALIGNTYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids)get_store().find_element_user(IDS$2, 0);
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
                return get_store().count_elements(IDS$2) != 0;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids)get_store().find_element_user(IDS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids)get_store().add_element_user(IDS$2);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids)get_store().add_element_user(IDS$2);
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
                get_store().remove_element(IDS$2, 0);
            }
        }
        /**
         * An XML align-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.AlignDefDocument$AlignDef$AlignType.
         */
        public static class AlignTypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType
        {
            
            public AlignTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AlignTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.AlignDefDocument$AlignDef$AlignType$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.AlignType.Value
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
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef.Ids
        {
            
            public IdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets array of all "Seq-id" elements
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQID$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] result = new gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-id" element
             */
            public int sizeOfSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQID$0);
                }
            }
            
            /**
             * Sets array of all "Seq-id" element
             */
            public void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqIdArray, SEQID$0);
                }
            }
            
            /**
             * Sets ith "Seq-id" element
             */
            public void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().insert_element_user(SEQID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-id" element
             */
            public void removeSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQID$0, i);
                }
            }
        }
    }
}
