/*
 * An XML document type.
 * Localname: Tx-evidence
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TxEvidenceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Tx-evidence(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class TxEvidenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxEvidenceDocument
{
    
    public TxEvidenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TXEVIDENCE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Tx-evidence");
    
    
    /**
     * Gets the "Tx-evidence" element
     */
    public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence getTxEvidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
            target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().find_element_user(TXEVIDENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Tx-evidence" element
     */
    public void setTxEvidence(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence txEvidence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
            target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().find_element_user(TXEVIDENCE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().add_element_user(TXEVIDENCE$0);
            }
            target.set(txEvidence);
        }
    }
    
    /**
     * Appends and returns a new empty "Tx-evidence" element
     */
    public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence addNewTxEvidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
            target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().add_element_user(TXEVIDENCE$0);
            return target;
        }
    }
    /**
     * An XML Tx-evidence(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class TxEvidenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence
    {
        
        public TxEvidenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXPCODE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exp-code");
        private static final javax.xml.namespace.QName EXPRESSIONSYSTEM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "expression-system");
        private static final javax.xml.namespace.QName LOWPRECDATA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "low-prec-data");
        private static final javax.xml.namespace.QName FROMHOMOLOG$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "from-homolog");
        
        
        /**
         * Gets the "exp-code" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode getExpCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode)get_store().find_element_user(EXPCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "exp-code" element
         */
        public void setExpCode(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode expCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode)get_store().find_element_user(EXPCODE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode)get_store().add_element_user(EXPCODE$0);
                }
                target.set(expCode);
            }
        }
        
        /**
         * Appends and returns a new empty "exp-code" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode addNewExpCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode)get_store().add_element_user(EXPCODE$0);
                return target;
            }
        }
        
        /**
         * Gets the "expression-system" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem getExpressionSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem)get_store().find_element_user(EXPRESSIONSYSTEM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "expression-system" element
         */
        public boolean isSetExpressionSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPRESSIONSYSTEM$2) != 0;
            }
        }
        
        /**
         * Sets the "expression-system" element
         */
        public void setExpressionSystem(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem expressionSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem)get_store().find_element_user(EXPRESSIONSYSTEM$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem)get_store().add_element_user(EXPRESSIONSYSTEM$2);
                }
                target.set(expressionSystem);
            }
        }
        
        /**
         * Appends and returns a new empty "expression-system" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem addNewExpressionSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem)get_store().add_element_user(EXPRESSIONSYSTEM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "expression-system" element
         */
        public void unsetExpressionSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPRESSIONSYSTEM$2, 0);
            }
        }
        
        /**
         * Gets the "low-prec-data" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData getLowPrecData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData)get_store().find_element_user(LOWPRECDATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "low-prec-data" element
         */
        public boolean isSetLowPrecData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOWPRECDATA$4) != 0;
            }
        }
        
        /**
         * Sets the "low-prec-data" element
         */
        public void setLowPrecData(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData lowPrecData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData)get_store().find_element_user(LOWPRECDATA$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData)get_store().add_element_user(LOWPRECDATA$4);
                }
                target.set(lowPrecData);
            }
        }
        
        /**
         * Appends and returns a new empty "low-prec-data" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData addNewLowPrecData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData)get_store().add_element_user(LOWPRECDATA$4);
                return target;
            }
        }
        
        /**
         * Unsets the "low-prec-data" element
         */
        public void unsetLowPrecData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOWPRECDATA$4, 0);
            }
        }
        
        /**
         * Gets the "from-homolog" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog getFromHomolog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog)get_store().find_element_user(FROMHOMOLOG$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "from-homolog" element
         */
        public boolean isSetFromHomolog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FROMHOMOLOG$6) != 0;
            }
        }
        
        /**
         * Sets the "from-homolog" element
         */
        public void setFromHomolog(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog fromHomolog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog)get_store().find_element_user(FROMHOMOLOG$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog)get_store().add_element_user(FROMHOMOLOG$6);
                }
                target.set(fromHomolog);
            }
        }
        
        /**
         * Appends and returns a new empty "from-homolog" element
         */
        public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog addNewFromHomolog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog target = null;
                target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog)get_store().add_element_user(FROMHOMOLOG$6);
                return target;
            }
        }
        
        /**
         * Unsets the "from-homolog" element
         */
        public void unsetFromHomolog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FROMHOMOLOG$6, 0);
            }
        }
        /**
         * An XML exp-code(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExpCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode
        {
            
            public ExpCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$ExpCode$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value
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
         * An XML expression-system(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExpressionSystemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem
        {
            
            public ExpressionSystemImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$ExpressionSystem$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value
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
         * An XML low-prec-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LowPrecDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData
        {
            
            public LowPrecDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$LowPrecData$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value
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
         * An XML from-homolog(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FromHomologImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog
        {
            
            public FromHomologImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$FromHomolog$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value
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
