/*
 * An XML document type.
 * Localname: ModelEvidenceItem
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one ModelEvidenceItem(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ModelEvidenceItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument
{
    
    public ModelEvidenceItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODELEVIDENCEITEM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ModelEvidenceItem");
    
    
    /**
     * Gets the "ModelEvidenceItem" element
     */
    public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
            target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ModelEvidenceItem" element
     */
    public void setModelEvidenceItem(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
            target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().add_element_user(MODELEVIDENCEITEM$0);
            }
            target.set(modelEvidenceItem);
        }
    }
    
    /**
     * Appends and returns a new empty "ModelEvidenceItem" element
     */
    public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
            target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().add_element_user(MODELEVIDENCEITEM$0);
            return target;
        }
    }
    /**
     * An XML ModelEvidenceItem(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ModelEvidenceItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem
    {
        
        public ModelEvidenceItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName EXONCOUNT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exon-count");
        private static final javax.xml.namespace.QName EXONLENGTH$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exon-length");
        private static final javax.xml.namespace.QName FULLLENGTH$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "full-length");
        private static final javax.xml.namespace.QName SUPPORTSALLEXONCOMBO$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "supports-all-exon-combo");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Gets the "exon-count" element
         */
        public java.math.BigInteger getExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONCOUNT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "exon-count" element
         */
        public org.apache.xmlbeans.XmlInteger xgetExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONCOUNT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "exon-count" element
         */
        public boolean isSetExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXONCOUNT$2) != 0;
            }
        }
        
        /**
         * Sets the "exon-count" element
         */
        public void setExonCount(java.math.BigInteger exonCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONCOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXONCOUNT$2);
                }
                target.setBigIntegerValue(exonCount);
            }
        }
        
        /**
         * Sets (as xml) the "exon-count" element
         */
        public void xsetExonCount(org.apache.xmlbeans.XmlInteger exonCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONCOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EXONCOUNT$2);
                }
                target.set(exonCount);
            }
        }
        
        /**
         * Unsets the "exon-count" element
         */
        public void unsetExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXONCOUNT$2, 0);
            }
        }
        
        /**
         * Gets the "exon-length" element
         */
        public java.math.BigInteger getExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONLENGTH$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "exon-length" element
         */
        public org.apache.xmlbeans.XmlInteger xgetExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONLENGTH$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "exon-length" element
         */
        public boolean isSetExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXONLENGTH$4) != 0;
            }
        }
        
        /**
         * Sets the "exon-length" element
         */
        public void setExonLength(java.math.BigInteger exonLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONLENGTH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXONLENGTH$4);
                }
                target.setBigIntegerValue(exonLength);
            }
        }
        
        /**
         * Sets (as xml) the "exon-length" element
         */
        public void xsetExonLength(org.apache.xmlbeans.XmlInteger exonLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONLENGTH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EXONLENGTH$4);
                }
                target.set(exonLength);
            }
        }
        
        /**
         * Unsets the "exon-length" element
         */
        public void unsetExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXONLENGTH$4, 0);
            }
        }
        
        /**
         * Gets the "full-length" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength getFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength)get_store().find_element_user(FULLLENGTH$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "full-length" element
         */
        public boolean isSetFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLLENGTH$6) != 0;
            }
        }
        
        /**
         * Sets the "full-length" element
         */
        public void setFullLength(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength fullLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength)get_store().find_element_user(FULLLENGTH$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength)get_store().add_element_user(FULLLENGTH$6);
                }
                target.set(fullLength);
            }
        }
        
        /**
         * Appends and returns a new empty "full-length" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength addNewFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength)get_store().add_element_user(FULLLENGTH$6);
                return target;
            }
        }
        
        /**
         * Unsets the "full-length" element
         */
        public void unsetFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLLENGTH$6, 0);
            }
        }
        
        /**
         * Gets the "supports-all-exon-combo" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo getSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo)get_store().find_element_user(SUPPORTSALLEXONCOMBO$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "supports-all-exon-combo" element
         */
        public boolean isSetSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUPPORTSALLEXONCOMBO$8) != 0;
            }
        }
        
        /**
         * Sets the "supports-all-exon-combo" element
         */
        public void setSupportsAllExonCombo(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo supportsAllExonCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo)get_store().find_element_user(SUPPORTSALLEXONCOMBO$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo)get_store().add_element_user(SUPPORTSALLEXONCOMBO$8);
                }
                target.set(supportsAllExonCombo);
            }
        }
        
        /**
         * Appends and returns a new empty "supports-all-exon-combo" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo addNewSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo)get_store().add_element_user(SUPPORTSALLEXONCOMBO$8);
                return target;
            }
        }
        
        /**
         * Unsets the "supports-all-exon-combo" element
         */
        public void unsetSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUPPORTSALLEXONCOMBO$8, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets the "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-id" element
             */
            public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-id" element
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
        }
        /**
         * An XML full-length(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FullLengthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength
        {
            
            public FullLengthImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument$ModelEvidenceItem$FullLength$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value
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
         * An XML supports-all-exon-combo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SupportsAllExonComboImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo
        {
            
            public SupportsAllExonComboImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument$ModelEvidenceItem$SupportsAllExonCombo$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value
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
