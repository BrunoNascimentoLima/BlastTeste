/*
 * An XML document type.
 * Localname: Variation-inst
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.VariationInstDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Variation-inst(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class VariationInstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationInstDocument
{
    
    public VariationInstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIATIONINST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Variation-inst");
    
    
    /**
     * Gets the "Variation-inst" element
     */
    public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst getVariationInst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst target = null;
            target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().find_element_user(VARIATIONINST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Variation-inst" element
     */
    public void setVariationInst(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst variationInst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst target = null;
            target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().find_element_user(VARIATIONINST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().add_element_user(VARIATIONINST$0);
            }
            target.set(variationInst);
        }
    }
    
    /**
     * Appends and returns a new empty "Variation-inst" element
     */
    public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst addNewVariationInst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst target = null;
            target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().add_element_user(VARIATIONINST$0);
            return target;
        }
    }
    /**
     * An XML Variation-inst(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class VariationInstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst
    {
        
        public VariationInstImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName DELTA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "delta");
        private static final javax.xml.namespace.QName OBSERVATION$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "observation");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "delta" element
         */
        public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta getDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta)get_store().find_element_user(DELTA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "delta" element
         */
        public void setDelta(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta delta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta)get_store().find_element_user(DELTA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta)get_store().add_element_user(DELTA$2);
                }
                target.set(delta);
            }
        }
        
        /**
         * Appends and returns a new empty "delta" element
         */
        public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta addNewDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta)get_store().add_element_user(DELTA$2);
                return target;
            }
        }
        
        /**
         * Gets the "observation" element
         */
        public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation getObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation)get_store().find_element_user(OBSERVATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "observation" element
         */
        public boolean isSetObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBSERVATION$4) != 0;
            }
        }
        
        /**
         * Sets the "observation" element
         */
        public void setObservation(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation observation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation)get_store().find_element_user(OBSERVATION$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation)get_store().add_element_user(OBSERVATION$4);
                }
                target.set(observation);
            }
        }
        
        /**
         * Appends and returns a new empty "observation" element
         */
        public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation addNewObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation target = null;
                target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation)get_store().add_element_user(OBSERVATION$4);
                return target;
            }
        }
        
        /**
         * Unsets the "observation" element
         */
        public void unsetObservation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBSERVATION$4, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type
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
            public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value
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
         * An XML delta(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DeltaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta
        {
            
            public DeltaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DELTAITEM$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Delta-item");
            
            
            /**
             * Gets array of all "Delta-item" elements
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem[] getDeltaItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DELTAITEM$0, targetList);
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem[] result = new gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Delta-item" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem getDeltaItemArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().find_element_user(DELTAITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Delta-item" element
             */
            public int sizeOfDeltaItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DELTAITEM$0);
                }
            }
            
            /**
             * Sets array of all "Delta-item" element
             */
            public void setDeltaItemArray(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem[] deltaItemArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(deltaItemArray, DELTAITEM$0);
                }
            }
            
            /**
             * Sets ith "Delta-item" element
             */
            public void setDeltaItemArray(int i, gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem deltaItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().find_element_user(DELTAITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(deltaItem);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Delta-item" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem insertNewDeltaItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().insert_element_user(DELTAITEM$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Delta-item" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem addNewDeltaItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().add_element_user(DELTAITEM$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Delta-item" element
             */
            public void removeDeltaItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DELTAITEM$0, i);
                }
            }
        }
        /**
         * An XML observation(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Observation.
         */
        public static class ObservationImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation
        {
            
            public ObservationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ObservationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Observation$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value
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
