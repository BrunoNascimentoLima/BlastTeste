/*
 * An XML document type.
 * Localname: Seq-align
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqAlignDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-align(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqAlignDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument
{
    
    public SeqAlignDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Seq-align(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqAlignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign
    {
        
        public SeqAlignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName DIM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dim");
        private static final javax.xml.namespace.QName SCORE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "score");
        private static final javax.xml.namespace.QName SEGS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "segs");
        private static final javax.xml.namespace.QName BOUNDS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bounds");
        private static final javax.xml.namespace.QName ID$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName EXT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type)get_store().find_element_user(TYPE$0, 0);
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
        public void setType(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "dim" element
         */
        public java.math.BigInteger getDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "dim" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIM$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "dim" element
         */
        public boolean isSetDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIM$2) != 0;
            }
        }
        
        /**
         * Sets the "dim" element
         */
        public void setDim(java.math.BigInteger dim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIM$2);
                }
                target.setBigIntegerValue(dim);
            }
        }
        
        /**
         * Sets (as xml) the "dim" element
         */
        public void xsetDim(org.apache.xmlbeans.XmlInteger dim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DIM$2);
                }
                target.set(dim);
            }
        }
        
        /**
         * Unsets the "dim" element
         */
        public void unsetDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIM$2, 0);
            }
        }
        
        /**
         * Gets the "score" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score getScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score)get_store().find_element_user(SCORE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "score" element
         */
        public boolean isSetScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORE$4) != 0;
            }
        }
        
        /**
         * Sets the "score" element
         */
        public void setScore(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score score)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score)get_store().find_element_user(SCORE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score)get_store().add_element_user(SCORE$4);
                }
                target.set(score);
            }
        }
        
        /**
         * Appends and returns a new empty "score" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score addNewScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score)get_store().add_element_user(SCORE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "score" element
         */
        public void unsetScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORE$4, 0);
            }
        }
        
        /**
         * Gets the "segs" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs getSegs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs)get_store().find_element_user(SEGS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "segs" element
         */
        public void setSegs(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs segs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs)get_store().find_element_user(SEGS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs)get_store().add_element_user(SEGS$6);
                }
                target.set(segs);
            }
        }
        
        /**
         * Appends and returns a new empty "segs" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs addNewSegs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs)get_store().add_element_user(SEGS$6);
                return target;
            }
        }
        
        /**
         * Gets the "bounds" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds getBounds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds)get_store().find_element_user(BOUNDS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bounds" element
         */
        public boolean isSetBounds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOUNDS$8) != 0;
            }
        }
        
        /**
         * Sets the "bounds" element
         */
        public void setBounds(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds bounds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds)get_store().find_element_user(BOUNDS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds)get_store().add_element_user(BOUNDS$8);
                }
                target.set(bounds);
            }
        }
        
        /**
         * Appends and returns a new empty "bounds" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds addNewBounds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds)get_store().add_element_user(BOUNDS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "bounds" element
         */
        public void unsetBounds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOUNDS$8, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id)get_store().find_element_user(ID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$10) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id)get_store().find_element_user(ID$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id)get_store().add_element_user(ID$10);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id)get_store().add_element_user(ID$10);
                return target;
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$10, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext)get_store().find_element_user(EXT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ext" element
         */
        public boolean isSetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXT$12) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext)get_store().find_element_user(EXT$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext)get_store().add_element_user(EXT$12);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext)get_store().add_element_user(EXT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "ext" element
         */
        public void unsetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXT$12, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type
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
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqAlignDocument$SeqAlign$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value
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
         * An XML score(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ScoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score
        {
            
            public ScoreImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SCORE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Score");
            
            
            /**
             * Gets array of all "Score" elements
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score[] getScoreArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SCORE$0, targetList);
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score[] result = new gov.nih.nlm.ncbi.www.ScoreDocument.Score[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Score" element
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score getScoreArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Score" element
             */
            public int sizeOfScoreArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SCORE$0);
                }
            }
            
            /**
             * Sets array of all "Score" element
             */
            public void setScoreArray(gov.nih.nlm.ncbi.www.ScoreDocument.Score[] scoreArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(scoreArray, SCORE$0);
                }
            }
            
            /**
             * Sets ith "Score" element
             */
            public void setScoreArray(int i, gov.nih.nlm.ncbi.www.ScoreDocument.Score score)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(score);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Score" element
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score insertNewScore(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().insert_element_user(SCORE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Score" element
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score addNewScore()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().add_element_user(SCORE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Score" element
             */
            public void removeScore(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SCORE$0, i);
                }
            }
        }
        /**
         * An XML segs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SegsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs
        {
            
            public SegsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DENDIAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dendiag");
            private static final javax.xml.namespace.QName DENSEG$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "denseg");
            private static final javax.xml.namespace.QName STD$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "std");
            private static final javax.xml.namespace.QName PACKED$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "packed");
            private static final javax.xml.namespace.QName DISC$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "disc");
            private static final javax.xml.namespace.QName SPLICED$10 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "spliced");
            private static final javax.xml.namespace.QName SPARSE$12 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sparse");
            
            
            /**
             * Gets the "dendiag" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag getDendiag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag)get_store().find_element_user(DENDIAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "dendiag" element
             */
            public boolean isSetDendiag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DENDIAG$0) != 0;
                }
            }
            
            /**
             * Sets the "dendiag" element
             */
            public void setDendiag(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag dendiag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag)get_store().find_element_user(DENDIAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag)get_store().add_element_user(DENDIAG$0);
                    }
                    target.set(dendiag);
                }
            }
            
            /**
             * Appends and returns a new empty "dendiag" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag addNewDendiag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag)get_store().add_element_user(DENDIAG$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "dendiag" element
             */
            public void unsetDendiag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DENDIAG$0, 0);
                }
            }
            
            /**
             * Gets the "denseg" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg getDenseg()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg)get_store().find_element_user(DENSEG$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "denseg" element
             */
            public boolean isSetDenseg()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DENSEG$2) != 0;
                }
            }
            
            /**
             * Sets the "denseg" element
             */
            public void setDenseg(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg denseg)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg)get_store().find_element_user(DENSEG$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg)get_store().add_element_user(DENSEG$2);
                    }
                    target.set(denseg);
                }
            }
            
            /**
             * Appends and returns a new empty "denseg" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg addNewDenseg()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg)get_store().add_element_user(DENSEG$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "denseg" element
             */
            public void unsetDenseg()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DENSEG$2, 0);
                }
            }
            
            /**
             * Gets the "std" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std getStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std)get_store().find_element_user(STD$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "std" element
             */
            public boolean isSetStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STD$4) != 0;
                }
            }
            
            /**
             * Sets the "std" element
             */
            public void setStd(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std std)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std)get_store().find_element_user(STD$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std)get_store().add_element_user(STD$4);
                    }
                    target.set(std);
                }
            }
            
            /**
             * Appends and returns a new empty "std" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std addNewStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std)get_store().add_element_user(STD$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "std" element
             */
            public void unsetStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STD$4, 0);
                }
            }
            
            /**
             * Gets the "packed" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed getPacked()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed)get_store().find_element_user(PACKED$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "packed" element
             */
            public boolean isSetPacked()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PACKED$6) != 0;
                }
            }
            
            /**
             * Sets the "packed" element
             */
            public void setPacked(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed packed)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed)get_store().find_element_user(PACKED$6, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed)get_store().add_element_user(PACKED$6);
                    }
                    target.set(packed);
                }
            }
            
            /**
             * Appends and returns a new empty "packed" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed addNewPacked()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed)get_store().add_element_user(PACKED$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "packed" element
             */
            public void unsetPacked()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PACKED$6, 0);
                }
            }
            
            /**
             * Gets the "disc" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc getDisc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc)get_store().find_element_user(DISC$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "disc" element
             */
            public boolean isSetDisc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DISC$8) != 0;
                }
            }
            
            /**
             * Sets the "disc" element
             */
            public void setDisc(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc disc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc)get_store().find_element_user(DISC$8, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc)get_store().add_element_user(DISC$8);
                    }
                    target.set(disc);
                }
            }
            
            /**
             * Appends and returns a new empty "disc" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc addNewDisc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc)get_store().add_element_user(DISC$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "disc" element
             */
            public void unsetDisc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DISC$8, 0);
                }
            }
            
            /**
             * Gets the "spliced" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced getSpliced()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced)get_store().find_element_user(SPLICED$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "spliced" element
             */
            public boolean isSetSpliced()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPLICED$10) != 0;
                }
            }
            
            /**
             * Sets the "spliced" element
             */
            public void setSpliced(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced spliced)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced)get_store().find_element_user(SPLICED$10, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced)get_store().add_element_user(SPLICED$10);
                    }
                    target.set(spliced);
                }
            }
            
            /**
             * Appends and returns a new empty "spliced" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced addNewSpliced()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced)get_store().add_element_user(SPLICED$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "spliced" element
             */
            public void unsetSpliced()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPLICED$10, 0);
                }
            }
            
            /**
             * Gets the "sparse" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse getSparse()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse)get_store().find_element_user(SPARSE$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "sparse" element
             */
            public boolean isSetSparse()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPARSE$12) != 0;
                }
            }
            
            /**
             * Sets the "sparse" element
             */
            public void setSparse(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse sparse)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse)get_store().find_element_user(SPARSE$12, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse)get_store().add_element_user(SPARSE$12);
                    }
                    target.set(sparse);
                }
            }
            
            /**
             * Appends and returns a new empty "sparse" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse addNewSparse()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse)get_store().add_element_user(SPARSE$12);
                    return target;
                }
            }
            
            /**
             * Unsets the "sparse" element
             */
            public void unsetSparse()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPARSE$12, 0);
                }
            }
            /**
             * An XML dendiag(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class DendiagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag
            {
                
                public DendiagImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DENSEDIAG$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dense-diag");
                
                
                /**
                 * Gets array of all "Dense-diag" elements
                 */
                public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag[] getDenseDiagArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DENSEDIAG$0, targetList);
                      gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag[] result = new gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Dense-diag" element
                 */
                public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag getDenseDiagArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().find_element_user(DENSEDIAG$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Dense-diag" element
                 */
                public int sizeOfDenseDiagArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DENSEDIAG$0);
                    }
                }
                
                /**
                 * Sets array of all "Dense-diag" element
                 */
                public void setDenseDiagArray(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag[] denseDiagArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(denseDiagArray, DENSEDIAG$0);
                    }
                }
                
                /**
                 * Sets ith "Dense-diag" element
                 */
                public void setDenseDiagArray(int i, gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag denseDiag)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().find_element_user(DENSEDIAG$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(denseDiag);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Dense-diag" element
                 */
                public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag insertNewDenseDiag(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().insert_element_user(DENSEDIAG$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Dense-diag" element
                 */
                public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag addNewDenseDiag()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().add_element_user(DENSEDIAG$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Dense-diag" element
                 */
                public void removeDenseDiag(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DENSEDIAG$0, i);
                    }
                }
            }
            /**
             * An XML denseg(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class DensegImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg
            {
                
                public DensegImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DENSESEG$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dense-seg");
                
                
                /**
                 * Gets the "Dense-seg" element
                 */
                public gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg getDenseSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg)get_store().find_element_user(DENSESEG$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Dense-seg" element
                 */
                public void setDenseSeg(gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg denseSeg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg)get_store().find_element_user(DENSESEG$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg)get_store().add_element_user(DENSESEG$0);
                      }
                      target.set(denseSeg);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Dense-seg" element
                 */
                public gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg addNewDenseSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg)get_store().add_element_user(DENSESEG$0);
                      return target;
                    }
                }
            }
            /**
             * An XML std(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class StdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std
            {
                
                public StdImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName STDSEG$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Std-seg");
                
                
                /**
                 * Gets array of all "Std-seg" elements
                 */
                public gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg[] getStdSegArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(STDSEG$0, targetList);
                      gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg[] result = new gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Std-seg" element
                 */
                public gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg getStdSegArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg)get_store().find_element_user(STDSEG$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Std-seg" element
                 */
                public int sizeOfStdSegArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(STDSEG$0);
                    }
                }
                
                /**
                 * Sets array of all "Std-seg" element
                 */
                public void setStdSegArray(gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg[] stdSegArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(stdSegArray, STDSEG$0);
                    }
                }
                
                /**
                 * Sets ith "Std-seg" element
                 */
                public void setStdSegArray(int i, gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg stdSeg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg)get_store().find_element_user(STDSEG$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(stdSeg);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Std-seg" element
                 */
                public gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg insertNewStdSeg(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg)get_store().insert_element_user(STDSEG$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Std-seg" element
                 */
                public gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg addNewStdSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg)get_store().add_element_user(STDSEG$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Std-seg" element
                 */
                public void removeStdSeg(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(STDSEG$0, i);
                    }
                }
            }
            /**
             * An XML packed(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class PackedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed
            {
                
                public PackedImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PACKEDSEG$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Packed-seg");
                
                
                /**
                 * Gets the "Packed-seg" element
                 */
                public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg getPackedSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().find_element_user(PACKEDSEG$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Packed-seg" element
                 */
                public void setPackedSeg(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg packedSeg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().find_element_user(PACKEDSEG$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().add_element_user(PACKEDSEG$0);
                      }
                      target.set(packedSeg);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Packed-seg" element
                 */
                public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg addNewPackedSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().add_element_user(PACKEDSEG$0);
                      return target;
                    }
                }
            }
            /**
             * An XML disc(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class DiscImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc
            {
                
                public DiscImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQALIGNSET$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align-set");
                
                
                /**
                 * Gets the "Seq-align-set" element
                 */
                public gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet getSeqAlignSet()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Seq-align-set" element
                 */
                public void setSeqAlignSet(gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet seqAlignSet)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$0);
                      }
                      target.set(seqAlignSet);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Seq-align-set" element
                 */
                public gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet addNewSeqAlignSet()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$0);
                      return target;
                    }
                }
            }
            /**
             * An XML spliced(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class SplicedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced
            {
                
                public SplicedImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SPLICEDSEG$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-seg");
                
                
                /**
                 * Gets the "Spliced-seg" element
                 */
                public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg getSplicedSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().find_element_user(SPLICEDSEG$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Spliced-seg" element
                 */
                public void setSplicedSeg(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg splicedSeg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().find_element_user(SPLICEDSEG$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().add_element_user(SPLICEDSEG$0);
                      }
                      target.set(splicedSeg);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Spliced-seg" element
                 */
                public gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg addNewSplicedSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg)get_store().add_element_user(SPLICEDSEG$0);
                      return target;
                    }
                }
            }
            /**
             * An XML sparse(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class SparseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse
            {
                
                public SparseImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SPARSESEG$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Sparse-seg");
                
                
                /**
                 * Gets the "Sparse-seg" element
                 */
                public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg getSparseSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg)get_store().find_element_user(SPARSESEG$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Sparse-seg" element
                 */
                public void setSparseSeg(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg sparseSeg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg)get_store().find_element_user(SPARSESEG$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg)get_store().add_element_user(SPARSESEG$0);
                      }
                      target.set(sparseSeg);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Sparse-seg" element
                 */
                public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg addNewSparseSeg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg target = null;
                      target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg)get_store().add_element_user(SPARSESEG$0);
                      return target;
                    }
                }
            }
        }
        /**
         * An XML bounds(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BoundsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds
        {
            
            public BoundsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets array of all "Seq-loc" elements
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQLOC$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] result = new gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-loc" element
             */
            public int sizeOfSeqLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQLOC$0);
                }
            }
            
            /**
             * Sets array of all "Seq-loc" element
             */
            public void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqLocArray, SEQLOC$0);
                }
            }
            
            /**
             * Sets ith "Seq-loc" element
             */
            public void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().insert_element_user(SEQLOC$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
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
            
            /**
             * Removes the ith "Seq-loc" element
             */
            public void removeSeqLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQLOC$0, i);
                }
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets array of all "Object-id" elements
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] getObjectIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OBJECTID$0, targetList);
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] result = new gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Object-id" element
             */
            public int sizeOfObjectIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBJECTID$0);
                }
            }
            
            /**
             * Sets array of all "Object-id" element
             */
            public void setObjectIdArray(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] objectIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(objectIdArray, OBJECTID$0);
                }
            }
            
            /**
             * Sets ith "Object-id" element
             */
            public void setObjectIdArray(int i, gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId insertNewObjectId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().insert_element_user(OBJECTID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Object-id" element
             */
            public void removeObjectId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBJECTID$0, i);
                }
            }
        }
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USEROBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
            
            
            /**
             * Gets array of all "User-object" elements
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] getUserObjectArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(USEROBJECT$0, targetList);
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] result = new gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObjectArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "User-object" element
             */
            public int sizeOfUserObjectArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(USEROBJECT$0);
                }
            }
            
            /**
             * Sets array of all "User-object" element
             */
            public void setUserObjectArray(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] userObjectArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(userObjectArray, USEROBJECT$0);
                }
            }
            
            /**
             * Sets ith "User-object" element
             */
            public void setUserObjectArray(int i, gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(userObject);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject insertNewUserObject(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().insert_element_user(USEROBJECT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "User-object" element
             */
            public void removeUserObject(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(USEROBJECT$0, i);
                }
            }
        }
    }
}
