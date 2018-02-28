/*
 * An XML document type.
 * Localname: Clone-seq
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CloneSeqDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Clone-seq(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CloneSeqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqDocument
{
    
    public CloneSeqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLONESEQ$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Clone-seq");
    
    
    /**
     * Gets the "Clone-seq" element
     */
    public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq getCloneSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
            target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().find_element_user(CLONESEQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Clone-seq" element
     */
    public void setCloneSeq(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq cloneSeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
            target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().find_element_user(CLONESEQ$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().add_element_user(CLONESEQ$0);
            }
            target.set(cloneSeq);
        }
    }
    
    /**
     * Appends and returns a new empty "Clone-seq" element
     */
    public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq addNewCloneSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq target = null;
            target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq)get_store().add_element_user(CLONESEQ$0);
            return target;
        }
    }
    /**
     * An XML Clone-seq(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CloneSeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq
    {
        
        public CloneSeqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName CONFIDENCE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "confidence");
        private static final javax.xml.namespace.QName LOCATION$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "location");
        private static final javax.xml.namespace.QName SEQ$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq");
        private static final javax.xml.namespace.QName ALIGNID$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "align-id");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "confidence" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence getConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence)get_store().find_element_user(CONFIDENCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "confidence" element
         */
        public boolean isSetConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONFIDENCE$2) != 0;
            }
        }
        
        /**
         * Sets the "confidence" element
         */
        public void setConfidence(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence confidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence)get_store().find_element_user(CONFIDENCE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence)get_store().add_element_user(CONFIDENCE$2);
                }
                target.set(confidence);
            }
        }
        
        /**
         * Appends and returns a new empty "confidence" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence addNewConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence)get_store().add_element_user(CONFIDENCE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "confidence" element
         */
        public void unsetConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONFIDENCE$2, 0);
            }
        }
        
        /**
         * Gets the "location" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location)get_store().find_element_user(LOCATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "location" element
         */
        public void setLocation(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location)get_store().find_element_user(LOCATION$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location)get_store().add_element_user(LOCATION$4);
                }
                target.set(location);
            }
        }
        
        /**
         * Appends and returns a new empty "location" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location addNewLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location)get_store().add_element_user(LOCATION$4);
                return target;
            }
        }
        
        /**
         * Gets the "seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq getSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq)get_store().find_element_user(SEQ$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq" element
         */
        public boolean isSetSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQ$6) != 0;
            }
        }
        
        /**
         * Sets the "seq" element
         */
        public void setSeq(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq seq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq)get_store().find_element_user(SEQ$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq)get_store().add_element_user(SEQ$6);
                }
                target.set(seq);
            }
        }
        
        /**
         * Appends and returns a new empty "seq" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq addNewSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq)get_store().add_element_user(SEQ$6);
                return target;
            }
        }
        
        /**
         * Unsets the "seq" element
         */
        public void unsetSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQ$6, 0);
            }
        }
        
        /**
         * Gets the "align-id" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId getAlignId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId)get_store().find_element_user(ALIGNID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "align-id" element
         */
        public boolean isSetAlignId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNID$8) != 0;
            }
        }
        
        /**
         * Sets the "align-id" element
         */
        public void setAlignId(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId alignId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId)get_store().find_element_user(ALIGNID$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId)get_store().add_element_user(ALIGNID$8);
                }
                target.set(alignId);
            }
        }
        
        /**
         * Appends and returns a new empty "align-id" element
         */
        public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId addNewAlignId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId target = null;
                target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId)get_store().add_element_user(ALIGNID$8);
                return target;
            }
        }
        
        /**
         * Unsets the "align-id" element
         */
        public void unsetAlignId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNID$8, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type
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
            public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value
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
         * An XML confidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Confidence.
         */
        public static class ConfidenceImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence
        {
            
            public ConfidenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ConfidenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Confidence$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value
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
         * An XML location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location
        {
            
            public LocationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets the "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-loc" element
             */
            public void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    return target;
                }
            }
        }
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq
        {
            
            public SeqImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets the "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-loc" element
             */
            public void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    return target;
                }
            }
        }
        /**
         * An XML align-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlignIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId
        {
            
            public AlignIdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
        }
    }
}
