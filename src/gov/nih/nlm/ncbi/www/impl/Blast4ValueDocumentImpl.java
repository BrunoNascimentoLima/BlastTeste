/*
 * An XML document type.
 * Localname: Blast4-value
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-value(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument
{
    
    public Blast4ValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4VALUE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-value");
    
    
    /**
     * Gets the "Blast4-value" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value getBlast4Value()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().find_element_user(BLAST4VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-value" element
     */
    public void setBlast4Value(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value blast4Value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().find_element_user(BLAST4VALUE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().add_element_user(BLAST4VALUE$0);
            }
            target.set(blast4Value);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-value" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value addNewBlast4Value()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().add_element_user(BLAST4VALUE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-value(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value
    {
        
        public Blast4ValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BIGINTEGER$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "big-integer");
        private static final javax.xml.namespace.QName BIOSEQ$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bioseq");
        private static final javax.xml.namespace.QName BOOLEAN$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "boolean");
        private static final javax.xml.namespace.QName CUTOFF$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cutoff");
        private static final javax.xml.namespace.QName INTEGER$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "integer");
        private static final javax.xml.namespace.QName MATRIX$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "matrix");
        private static final javax.xml.namespace.QName REAL$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real");
        private static final javax.xml.namespace.QName SEQALIGN$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-align");
        private static final javax.xml.namespace.QName SEQID$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-id");
        private static final javax.xml.namespace.QName SEQLOC$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-loc");
        private static final javax.xml.namespace.QName STRANDTYPE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand-type");
        private static final javax.xml.namespace.QName STRING$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "string");
        private static final javax.xml.namespace.QName BIGINTEGERLIST$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "big-integer-list");
        private static final javax.xml.namespace.QName BIOSEQLIST$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bioseq-list");
        private static final javax.xml.namespace.QName BOOLEANLIST$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "boolean-list");
        private static final javax.xml.namespace.QName CUTOFFLIST$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cutoff-list");
        private static final javax.xml.namespace.QName INTEGERLIST$32 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "integer-list");
        private static final javax.xml.namespace.QName MATRIXLIST$34 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "matrix-list");
        private static final javax.xml.namespace.QName REALLIST$36 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real-list");
        private static final javax.xml.namespace.QName SEQALIGNLIST$38 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-align-list");
        private static final javax.xml.namespace.QName SEQIDLIST$40 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-id-list");
        private static final javax.xml.namespace.QName SEQLOCLIST$42 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-loc-list");
        private static final javax.xml.namespace.QName STRANDTYPELIST$44 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand-type-list");
        private static final javax.xml.namespace.QName STRINGLIST$46 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "string-list");
        private static final javax.xml.namespace.QName BIOSEQSET$48 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bioseq-set");
        private static final javax.xml.namespace.QName SEQALIGNSET$50 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-align-set");
        private static final javax.xml.namespace.QName QUERYMASK$52 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "query-mask");
        
        
        /**
         * Gets the "big-integer" element
         */
        public long getBigInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIGINTEGER$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "big-integer" element
         */
        public org.apache.xmlbeans.XmlLong xgetBigInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BIGINTEGER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "big-integer" element
         */
        public boolean isSetBigInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIGINTEGER$0) != 0;
            }
        }
        
        /**
         * Sets the "big-integer" element
         */
        public void setBigInteger(long bigInteger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIGINTEGER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIGINTEGER$0);
                }
                target.setLongValue(bigInteger);
            }
        }
        
        /**
         * Sets (as xml) the "big-integer" element
         */
        public void xsetBigInteger(org.apache.xmlbeans.XmlLong bigInteger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BIGINTEGER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BIGINTEGER$0);
                }
                target.set(bigInteger);
            }
        }
        
        /**
         * Unsets the "big-integer" element
         */
        public void unsetBigInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIGINTEGER$0, 0);
            }
        }
        
        /**
         * Gets the "bioseq" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq getBioseq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq)get_store().find_element_user(BIOSEQ$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bioseq" element
         */
        public boolean isSetBioseq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOSEQ$2) != 0;
            }
        }
        
        /**
         * Sets the "bioseq" element
         */
        public void setBioseq(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq bioseq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq)get_store().find_element_user(BIOSEQ$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq)get_store().add_element_user(BIOSEQ$2);
                }
                target.set(bioseq);
            }
        }
        
        /**
         * Appends and returns a new empty "bioseq" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq addNewBioseq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq)get_store().add_element_user(BIOSEQ$2);
                return target;
            }
        }
        
        /**
         * Unsets the "bioseq" element
         */
        public void unsetBioseq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOSEQ$2, 0);
            }
        }
        
        /**
         * Gets the "boolean" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean getBoolean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean)get_store().find_element_user(BOOLEAN$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "boolean" element
         */
        public boolean isSetBoolean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOLEAN$4) != 0;
            }
        }
        
        /**
         * Sets the "boolean" element
         */
        public void setBoolean(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean xboolean)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean)get_store().find_element_user(BOOLEAN$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean)get_store().add_element_user(BOOLEAN$4);
                }
                target.set(xboolean);
            }
        }
        
        /**
         * Appends and returns a new empty "boolean" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean addNewBoolean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean)get_store().add_element_user(BOOLEAN$4);
                return target;
            }
        }
        
        /**
         * Unsets the "boolean" element
         */
        public void unsetBoolean()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOLEAN$4, 0);
            }
        }
        
        /**
         * Gets the "cutoff" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff getCutoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff)get_store().find_element_user(CUTOFF$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cutoff" element
         */
        public boolean isSetCutoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUTOFF$6) != 0;
            }
        }
        
        /**
         * Sets the "cutoff" element
         */
        public void setCutoff(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff cutoff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff)get_store().find_element_user(CUTOFF$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff)get_store().add_element_user(CUTOFF$6);
                }
                target.set(cutoff);
            }
        }
        
        /**
         * Appends and returns a new empty "cutoff" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff addNewCutoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff)get_store().add_element_user(CUTOFF$6);
                return target;
            }
        }
        
        /**
         * Unsets the "cutoff" element
         */
        public void unsetCutoff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUTOFF$6, 0);
            }
        }
        
        /**
         * Gets the "integer" element
         */
        public java.math.BigInteger getInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "integer" element
         */
        public org.apache.xmlbeans.XmlInteger xgetInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTEGER$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "integer" element
         */
        public boolean isSetInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTEGER$8) != 0;
            }
        }
        
        /**
         * Sets the "integer" element
         */
        public void setInteger(java.math.BigInteger integer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGER$8);
                }
                target.setBigIntegerValue(integer);
            }
        }
        
        /**
         * Sets (as xml) the "integer" element
         */
        public void xsetInteger(org.apache.xmlbeans.XmlInteger integer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTEGER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INTEGER$8);
                }
                target.set(integer);
            }
        }
        
        /**
         * Unsets the "integer" element
         */
        public void unsetInteger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTEGER$8, 0);
            }
        }
        
        /**
         * Gets the "matrix" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix getMatrix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix)get_store().find_element_user(MATRIX$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "matrix" element
         */
        public boolean isSetMatrix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATRIX$10) != 0;
            }
        }
        
        /**
         * Sets the "matrix" element
         */
        public void setMatrix(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix matrix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix)get_store().find_element_user(MATRIX$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix)get_store().add_element_user(MATRIX$10);
                }
                target.set(matrix);
            }
        }
        
        /**
         * Appends and returns a new empty "matrix" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix addNewMatrix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix)get_store().add_element_user(MATRIX$10);
                return target;
            }
        }
        
        /**
         * Unsets the "matrix" element
         */
        public void unsetMatrix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATRIX$10, 0);
            }
        }
        
        /**
         * Gets the "real" element
         */
        public double getReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$12, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "real" element
         */
        public org.apache.xmlbeans.XmlDouble xgetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "real" element
         */
        public boolean isSetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REAL$12) != 0;
            }
        }
        
        /**
         * Sets the "real" element
         */
        public void setReal(double real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$12);
                }
                target.setDoubleValue(real);
            }
        }
        
        /**
         * Sets (as xml) the "real" element
         */
        public void xsetReal(org.apache.xmlbeans.XmlDouble real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$12);
                }
                target.set(real);
            }
        }
        
        /**
         * Unsets the "real" element
         */
        public void unsetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REAL$12, 0);
            }
        }
        
        /**
         * Gets the "seq-align" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign getSeqAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign)get_store().find_element_user(SEQALIGN$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-align" element
         */
        public boolean isSetSeqAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQALIGN$14) != 0;
            }
        }
        
        /**
         * Sets the "seq-align" element
         */
        public void setSeqAlign(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign seqAlign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign)get_store().find_element_user(SEQALIGN$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign)get_store().add_element_user(SEQALIGN$14);
                }
                target.set(seqAlign);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-align" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign addNewSeqAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign)get_store().add_element_user(SEQALIGN$14);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-align" element
         */
        public void unsetSeqAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQALIGN$14, 0);
            }
        }
        
        /**
         * Gets the "seq-id" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId getSeqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId)get_store().find_element_user(SEQID$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-id" element
         */
        public boolean isSetSeqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQID$16) != 0;
            }
        }
        
        /**
         * Sets the "seq-id" element
         */
        public void setSeqId(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId seqId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId)get_store().find_element_user(SEQID$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId)get_store().add_element_user(SEQID$16);
                }
                target.set(seqId);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-id" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId addNewSeqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId)get_store().add_element_user(SEQID$16);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-id" element
         */
        public void unsetSeqId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQID$16, 0);
            }
        }
        
        /**
         * Gets the "seq-loc" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc getSeqLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc)get_store().find_element_user(SEQLOC$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-loc" element
         */
        public boolean isSetSeqLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQLOC$18) != 0;
            }
        }
        
        /**
         * Sets the "seq-loc" element
         */
        public void setSeqLoc(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc seqLoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc)get_store().find_element_user(SEQLOC$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc)get_store().add_element_user(SEQLOC$18);
                }
                target.set(seqLoc);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-loc" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc addNewSeqLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc)get_store().add_element_user(SEQLOC$18);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-loc" element
         */
        public void unsetSeqLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQLOC$18, 0);
            }
        }
        
        /**
         * Gets the "strand-type" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType getStrandType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType)get_store().find_element_user(STRANDTYPE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strand-type" element
         */
        public boolean isSetStrandType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRANDTYPE$20) != 0;
            }
        }
        
        /**
         * Sets the "strand-type" element
         */
        public void setStrandType(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType strandType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType)get_store().find_element_user(STRANDTYPE$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType)get_store().add_element_user(STRANDTYPE$20);
                }
                target.set(strandType);
            }
        }
        
        /**
         * Appends and returns a new empty "strand-type" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType addNewStrandType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType)get_store().add_element_user(STRANDTYPE$20);
                return target;
            }
        }
        
        /**
         * Unsets the "strand-type" element
         */
        public void unsetStrandType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRANDTYPE$20, 0);
            }
        }
        
        /**
         * Gets the "string" element
         */
        public java.lang.String getString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "string" element
         */
        public org.apache.xmlbeans.XmlString xgetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "string" element
         */
        public boolean isSetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRING$22) != 0;
            }
        }
        
        /**
         * Sets the "string" element
         */
        public void setString(java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRING$22);
                }
                target.setStringValue(string);
            }
        }
        
        /**
         * Sets (as xml) the "string" element
         */
        public void xsetString(org.apache.xmlbeans.XmlString string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$22);
                }
                target.set(string);
            }
        }
        
        /**
         * Unsets the "string" element
         */
        public void unsetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRING$22, 0);
            }
        }
        
        /**
         * Gets array of all "big-integer-list" elements
         */
        public long[] getBigIntegerListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIGINTEGERLIST$24, targetList);
                long[] result = new long[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
                return result;
            }
        }
        
        /**
         * Gets ith "big-integer-list" element
         */
        public long getBigIntegerListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIGINTEGERLIST$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "big-integer-list" elements
         */
        public org.apache.xmlbeans.XmlLong[] xgetBigIntegerListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIGINTEGERLIST$24, targetList);
                org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "big-integer-list" element
         */
        public org.apache.xmlbeans.XmlLong xgetBigIntegerListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BIGINTEGERLIST$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlLong)target;
            }
        }
        
        /**
         * Returns number of "big-integer-list" element
         */
        public int sizeOfBigIntegerListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIGINTEGERLIST$24);
            }
        }
        
        /**
         * Sets array of all "big-integer-list" element
         */
        public void setBigIntegerListArray(long[] bigIntegerListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bigIntegerListArray, BIGINTEGERLIST$24);
            }
        }
        
        /**
         * Sets ith "big-integer-list" element
         */
        public void setBigIntegerListArray(int i, long bigIntegerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIGINTEGERLIST$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setLongValue(bigIntegerList);
            }
        }
        
        /**
         * Sets (as xml) array of all "big-integer-list" element
         */
        public void xsetBigIntegerListArray(org.apache.xmlbeans.XmlLong[]bigIntegerListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bigIntegerListArray, BIGINTEGERLIST$24);
            }
        }
        
        /**
         * Sets (as xml) ith "big-integer-list" element
         */
        public void xsetBigIntegerListArray(int i, org.apache.xmlbeans.XmlLong bigIntegerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(BIGINTEGERLIST$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bigIntegerList);
            }
        }
        
        /**
         * Inserts the value as the ith "big-integer-list" element
         */
        public void insertBigIntegerList(int i, long bigIntegerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BIGINTEGERLIST$24, i);
                target.setLongValue(bigIntegerList);
            }
        }
        
        /**
         * Appends the value as the last "big-integer-list" element
         */
        public void addBigIntegerList(long bigIntegerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIGINTEGERLIST$24);
                target.setLongValue(bigIntegerList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "big-integer-list" element
         */
        public org.apache.xmlbeans.XmlLong insertNewBigIntegerList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(BIGINTEGERLIST$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "big-integer-list" element
         */
        public org.apache.xmlbeans.XmlLong addNewBigIntegerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(BIGINTEGERLIST$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "big-integer-list" element
         */
        public void removeBigIntegerList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIGINTEGERLIST$24, i);
            }
        }
        
        /**
         * Gets the "bioseq-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList getBioseqList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList)get_store().find_element_user(BIOSEQLIST$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bioseq-list" element
         */
        public boolean isSetBioseqList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOSEQLIST$26) != 0;
            }
        }
        
        /**
         * Sets the "bioseq-list" element
         */
        public void setBioseqList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList bioseqList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList)get_store().find_element_user(BIOSEQLIST$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList)get_store().add_element_user(BIOSEQLIST$26);
                }
                target.set(bioseqList);
            }
        }
        
        /**
         * Appends and returns a new empty "bioseq-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList addNewBioseqList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList)get_store().add_element_user(BIOSEQLIST$26);
                return target;
            }
        }
        
        /**
         * Unsets the "bioseq-list" element
         */
        public void unsetBioseqList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOSEQLIST$26, 0);
            }
        }
        
        /**
         * Gets array of all "boolean-list" elements
         */
        public org.apache.xmlbeans.XmlObject[] getBooleanListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOOLEANLIST$28, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "boolean-list" element
         */
        public org.apache.xmlbeans.XmlObject getBooleanListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(BOOLEANLIST$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "boolean-list" element
         */
        public int sizeOfBooleanListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOLEANLIST$28);
            }
        }
        
        /**
         * Sets array of all "boolean-list" element
         */
        public void setBooleanListArray(org.apache.xmlbeans.XmlObject[] booleanListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(booleanListArray, BOOLEANLIST$28);
            }
        }
        
        /**
         * Sets ith "boolean-list" element
         */
        public void setBooleanListArray(int i, org.apache.xmlbeans.XmlObject booleanList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(BOOLEANLIST$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(booleanList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "boolean-list" element
         */
        public org.apache.xmlbeans.XmlObject insertNewBooleanList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(BOOLEANLIST$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "boolean-list" element
         */
        public org.apache.xmlbeans.XmlObject addNewBooleanList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(BOOLEANLIST$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "boolean-list" element
         */
        public void removeBooleanList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOLEANLIST$28, i);
            }
        }
        
        /**
         * Gets the "cutoff-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList getCutoffList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList)get_store().find_element_user(CUTOFFLIST$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cutoff-list" element
         */
        public boolean isSetCutoffList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUTOFFLIST$30) != 0;
            }
        }
        
        /**
         * Sets the "cutoff-list" element
         */
        public void setCutoffList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList cutoffList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList)get_store().find_element_user(CUTOFFLIST$30, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList)get_store().add_element_user(CUTOFFLIST$30);
                }
                target.set(cutoffList);
            }
        }
        
        /**
         * Appends and returns a new empty "cutoff-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList addNewCutoffList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList)get_store().add_element_user(CUTOFFLIST$30);
                return target;
            }
        }
        
        /**
         * Unsets the "cutoff-list" element
         */
        public void unsetCutoffList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUTOFFLIST$30, 0);
            }
        }
        
        /**
         * Gets array of all "integer-list" elements
         */
        public java.math.BigInteger[] getIntegerListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTEGERLIST$32, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "integer-list" element
         */
        public java.math.BigInteger getIntegerListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERLIST$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "integer-list" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetIntegerListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTEGERLIST$32, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "integer-list" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIntegerListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTEGERLIST$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "integer-list" element
         */
        public int sizeOfIntegerListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTEGERLIST$32);
            }
        }
        
        /**
         * Sets array of all "integer-list" element
         */
        public void setIntegerListArray(java.math.BigInteger[] integerListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(integerListArray, INTEGERLIST$32);
            }
        }
        
        /**
         * Sets ith "integer-list" element
         */
        public void setIntegerListArray(int i, java.math.BigInteger integerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERLIST$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(integerList);
            }
        }
        
        /**
         * Sets (as xml) array of all "integer-list" element
         */
        public void xsetIntegerListArray(org.apache.xmlbeans.XmlInteger[]integerListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(integerListArray, INTEGERLIST$32);
            }
        }
        
        /**
         * Sets (as xml) ith "integer-list" element
         */
        public void xsetIntegerListArray(int i, org.apache.xmlbeans.XmlInteger integerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTEGERLIST$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(integerList);
            }
        }
        
        /**
         * Inserts the value as the ith "integer-list" element
         */
        public void insertIntegerList(int i, java.math.BigInteger integerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTEGERLIST$32, i);
                target.setBigIntegerValue(integerList);
            }
        }
        
        /**
         * Appends the value as the last "integer-list" element
         */
        public void addIntegerList(java.math.BigInteger integerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERLIST$32);
                target.setBigIntegerValue(integerList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "integer-list" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewIntegerList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(INTEGERLIST$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "integer-list" element
         */
        public org.apache.xmlbeans.XmlInteger addNewIntegerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INTEGERLIST$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "integer-list" element
         */
        public void removeIntegerList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTEGERLIST$32, i);
            }
        }
        
        /**
         * Gets the "matrix-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList getMatrixList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList)get_store().find_element_user(MATRIXLIST$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "matrix-list" element
         */
        public boolean isSetMatrixList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATRIXLIST$34) != 0;
            }
        }
        
        /**
         * Sets the "matrix-list" element
         */
        public void setMatrixList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList matrixList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList)get_store().find_element_user(MATRIXLIST$34, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList)get_store().add_element_user(MATRIXLIST$34);
                }
                target.set(matrixList);
            }
        }
        
        /**
         * Appends and returns a new empty "matrix-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList addNewMatrixList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList)get_store().add_element_user(MATRIXLIST$34);
                return target;
            }
        }
        
        /**
         * Unsets the "matrix-list" element
         */
        public void unsetMatrixList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATRIXLIST$34, 0);
            }
        }
        
        /**
         * Gets array of all "real-list" elements
         */
        public double[] getRealListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REALLIST$36, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "real-list" element
         */
        public double getRealListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALLIST$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "real-list" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetRealListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REALLIST$36, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "real-list" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRealListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REALLIST$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "real-list" element
         */
        public int sizeOfRealListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REALLIST$36);
            }
        }
        
        /**
         * Sets array of all "real-list" element
         */
        public void setRealListArray(double[] realListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(realListArray, REALLIST$36);
            }
        }
        
        /**
         * Sets ith "real-list" element
         */
        public void setRealListArray(int i, double realList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALLIST$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(realList);
            }
        }
        
        /**
         * Sets (as xml) array of all "real-list" element
         */
        public void xsetRealListArray(org.apache.xmlbeans.XmlDouble[]realListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(realListArray, REALLIST$36);
            }
        }
        
        /**
         * Sets (as xml) ith "real-list" element
         */
        public void xsetRealListArray(int i, org.apache.xmlbeans.XmlDouble realList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REALLIST$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(realList);
            }
        }
        
        /**
         * Inserts the value as the ith "real-list" element
         */
        public void insertRealList(int i, double realList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REALLIST$36, i);
                target.setDoubleValue(realList);
            }
        }
        
        /**
         * Appends the value as the last "real-list" element
         */
        public void addRealList(double realList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALLIST$36);
                target.setDoubleValue(realList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "real-list" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewRealList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(REALLIST$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "real-list" element
         */
        public org.apache.xmlbeans.XmlDouble addNewRealList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REALLIST$36);
                return target;
            }
        }
        
        /**
         * Removes the ith "real-list" element
         */
        public void removeRealList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REALLIST$36, i);
            }
        }
        
        /**
         * Gets the "seq-align-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList getSeqAlignList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList)get_store().find_element_user(SEQALIGNLIST$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-align-list" element
         */
        public boolean isSetSeqAlignList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQALIGNLIST$38) != 0;
            }
        }
        
        /**
         * Sets the "seq-align-list" element
         */
        public void setSeqAlignList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList seqAlignList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList)get_store().find_element_user(SEQALIGNLIST$38, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList)get_store().add_element_user(SEQALIGNLIST$38);
                }
                target.set(seqAlignList);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-align-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList addNewSeqAlignList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList)get_store().add_element_user(SEQALIGNLIST$38);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-align-list" element
         */
        public void unsetSeqAlignList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQALIGNLIST$38, 0);
            }
        }
        
        /**
         * Gets the "seq-id-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList getSeqIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList)get_store().find_element_user(SEQIDLIST$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-id-list" element
         */
        public boolean isSetSeqIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQIDLIST$40) != 0;
            }
        }
        
        /**
         * Sets the "seq-id-list" element
         */
        public void setSeqIdList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList seqIdList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList)get_store().find_element_user(SEQIDLIST$40, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList)get_store().add_element_user(SEQIDLIST$40);
                }
                target.set(seqIdList);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-id-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList addNewSeqIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList)get_store().add_element_user(SEQIDLIST$40);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-id-list" element
         */
        public void unsetSeqIdList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQIDLIST$40, 0);
            }
        }
        
        /**
         * Gets the "seq-loc-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList getSeqLocList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList)get_store().find_element_user(SEQLOCLIST$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-loc-list" element
         */
        public boolean isSetSeqLocList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQLOCLIST$42) != 0;
            }
        }
        
        /**
         * Sets the "seq-loc-list" element
         */
        public void setSeqLocList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList seqLocList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList)get_store().find_element_user(SEQLOCLIST$42, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList)get_store().add_element_user(SEQLOCLIST$42);
                }
                target.set(seqLocList);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-loc-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList addNewSeqLocList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList)get_store().add_element_user(SEQLOCLIST$42);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-loc-list" element
         */
        public void unsetSeqLocList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQLOCLIST$42, 0);
            }
        }
        
        /**
         * Gets the "strand-type-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList getStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList)get_store().find_element_user(STRANDTYPELIST$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strand-type-list" element
         */
        public boolean isSetStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRANDTYPELIST$44) != 0;
            }
        }
        
        /**
         * Sets the "strand-type-list" element
         */
        public void setStrandTypeList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList strandTypeList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList)get_store().find_element_user(STRANDTYPELIST$44, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList)get_store().add_element_user(STRANDTYPELIST$44);
                }
                target.set(strandTypeList);
            }
        }
        
        /**
         * Appends and returns a new empty "strand-type-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList addNewStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList)get_store().add_element_user(STRANDTYPELIST$44);
                return target;
            }
        }
        
        /**
         * Unsets the "strand-type-list" element
         */
        public void unsetStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRANDTYPELIST$44, 0);
            }
        }
        
        /**
         * Gets array of all "string-list" elements
         */
        public java.lang.String[] getStringListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRINGLIST$46, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "string-list" element
         */
        public java.lang.String getStringListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGLIST$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "string-list" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetStringListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRINGLIST$46, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "string-list" element
         */
        public org.apache.xmlbeans.XmlString xgetStringListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGLIST$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "string-list" element
         */
        public int sizeOfStringListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRINGLIST$46);
            }
        }
        
        /**
         * Sets array of all "string-list" element
         */
        public void setStringListArray(java.lang.String[] stringListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stringListArray, STRINGLIST$46);
            }
        }
        
        /**
         * Sets ith "string-list" element
         */
        public void setStringListArray(int i, java.lang.String stringList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGLIST$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(stringList);
            }
        }
        
        /**
         * Sets (as xml) array of all "string-list" element
         */
        public void xsetStringListArray(org.apache.xmlbeans.XmlString[]stringListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stringListArray, STRINGLIST$46);
            }
        }
        
        /**
         * Sets (as xml) ith "string-list" element
         */
        public void xsetStringListArray(int i, org.apache.xmlbeans.XmlString stringList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGLIST$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(stringList);
            }
        }
        
        /**
         * Inserts the value as the ith "string-list" element
         */
        public void insertStringList(int i, java.lang.String stringList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRINGLIST$46, i);
                target.setStringValue(stringList);
            }
        }
        
        /**
         * Appends the value as the last "string-list" element
         */
        public void addStringList(java.lang.String stringList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGLIST$46);
                target.setStringValue(stringList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string-list" element
         */
        public org.apache.xmlbeans.XmlString insertNewStringList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRINGLIST$46, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string-list" element
         */
        public org.apache.xmlbeans.XmlString addNewStringList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGLIST$46);
                return target;
            }
        }
        
        /**
         * Removes the ith "string-list" element
         */
        public void removeStringList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRINGLIST$46, i);
            }
        }
        
        /**
         * Gets the "bioseq-set" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet getBioseqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet)get_store().find_element_user(BIOSEQSET$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bioseq-set" element
         */
        public boolean isSetBioseqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOSEQSET$48) != 0;
            }
        }
        
        /**
         * Sets the "bioseq-set" element
         */
        public void setBioseqSet(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet bioseqSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet)get_store().find_element_user(BIOSEQSET$48, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet)get_store().add_element_user(BIOSEQSET$48);
                }
                target.set(bioseqSet);
            }
        }
        
        /**
         * Appends and returns a new empty "bioseq-set" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet addNewBioseqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet)get_store().add_element_user(BIOSEQSET$48);
                return target;
            }
        }
        
        /**
         * Unsets the "bioseq-set" element
         */
        public void unsetBioseqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOSEQSET$48, 0);
            }
        }
        
        /**
         * Gets the "seq-align-set" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet getSeqAlignSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-align-set" element
         */
        public boolean isSetSeqAlignSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQALIGNSET$50) != 0;
            }
        }
        
        /**
         * Sets the "seq-align-set" element
         */
        public void setSeqAlignSet(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet seqAlignSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$50, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$50);
                }
                target.set(seqAlignSet);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-align-set" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet addNewSeqAlignSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$50);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-align-set" element
         */
        public void unsetSeqAlignSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQALIGNSET$50, 0);
            }
        }
        
        /**
         * Gets the "query-mask" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask getQueryMask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask)get_store().find_element_user(QUERYMASK$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "query-mask" element
         */
        public boolean isSetQueryMask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYMASK$52) != 0;
            }
        }
        
        /**
         * Sets the "query-mask" element
         */
        public void setQueryMask(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask queryMask)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask)get_store().find_element_user(QUERYMASK$52, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask)get_store().add_element_user(QUERYMASK$52);
                }
                target.set(queryMask);
            }
        }
        
        /**
         * Appends and returns a new empty "query-mask" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask addNewQueryMask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask)get_store().add_element_user(QUERYMASK$52);
                return target;
            }
        }
        
        /**
         * Unsets the "query-mask" element
         */
        public void unsetQueryMask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYMASK$52, 0);
            }
        }
        /**
         * An XML bioseq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BioseqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq
        {
            
            public BioseqImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BIOSEQ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Bioseq");
            
            
            /**
             * Gets the "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseq()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Bioseq" element
             */
            public void setBioseq(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().add_element_user(BIOSEQ$0);
                    }
                    target.set(bioseq);
                }
            }
            
            /**
             * Appends and returns a new empty "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq addNewBioseq()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().add_element_user(BIOSEQ$0);
                    return target;
                }
            }
        }
        /**
         * An XML boolean(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BooleanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean
        {
            
            public BooleanImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ValueDocument$Blast4Value$Boolean$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value
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
         * An XML cutoff(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CutoffImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff
        {
            
            public CutoffImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4CUTOFF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-cutoff");
            
            
            /**
             * Gets the "Blast4-cutoff" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff getBlast4Cutoff()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().find_element_user(BLAST4CUTOFF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-cutoff" element
             */
            public void setBlast4Cutoff(gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff blast4Cutoff)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().find_element_user(BLAST4CUTOFF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().add_element_user(BLAST4CUTOFF$0);
                    }
                    target.set(blast4Cutoff);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-cutoff" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff addNewBlast4Cutoff()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().add_element_user(BLAST4CUTOFF$0);
                    return target;
                }
            }
        }
        /**
         * An XML matrix(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MatrixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix
        {
            
            public MatrixImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSSMWITHPARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmWithParameters");
            
            
            /**
             * Gets the "PssmWithParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters getPssmWithParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().find_element_user(PSSMWITHPARAMETERS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PssmWithParameters" element
             */
            public void setPssmWithParameters(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters pssmWithParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().find_element_user(PSSMWITHPARAMETERS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().add_element_user(PSSMWITHPARAMETERS$0);
                    }
                    target.set(pssmWithParameters);
                }
            }
            
            /**
             * Appends and returns a new empty "PssmWithParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters addNewPssmWithParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().add_element_user(PSSMWITHPARAMETERS$0);
                    return target;
                }
            }
        }
        /**
         * An XML seq-align(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqAlignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign
        {
            
            public SeqAlignImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML seq-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId
        {
            
            public SeqIdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML seq-loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqLocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc
        {
            
            public SeqLocImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML strand-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType
        {
            
            public StrandTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4STRANDTYPE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-strand-type");
            
            
            /**
             * Gets the "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-strand-type" element
             */
            public void setBlast4StrandType(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().add_element_user(BLAST4STRANDTYPE$0);
                    }
                    target.set(blast4StrandType);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().add_element_user(BLAST4STRANDTYPE$0);
                    return target;
                }
            }
        }
        /**
         * An XML bioseq-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BioseqListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList
        {
            
            public BioseqListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BIOSEQ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Bioseq");
            
            
            /**
             * Gets array of all "Bioseq" elements
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] getBioseqArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BIOSEQ$0, targetList);
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] result = new gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseqArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Bioseq" element
             */
            public int sizeOfBioseqArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BIOSEQ$0);
                }
            }
            
            /**
             * Sets array of all "Bioseq" element
             */
            public void setBioseqArray(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] bioseqArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(bioseqArray, BIOSEQ$0);
                }
            }
            
            /**
             * Sets ith "Bioseq" element
             */
            public void setBioseqArray(int i, gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(bioseq);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq insertNewBioseq(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().insert_element_user(BIOSEQ$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq addNewBioseq()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().add_element_user(BIOSEQ$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Bioseq" element
             */
            public void removeBioseq(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BIOSEQ$0, i);
                }
            }
        }
        /**
         * An XML cutoff-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CutoffListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList
        {
            
            public CutoffListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4CUTOFF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-cutoff");
            
            
            /**
             * Gets array of all "Blast4-cutoff" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff[] getBlast4CutoffArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4CUTOFF$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff[] result = new gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-cutoff" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff getBlast4CutoffArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().find_element_user(BLAST4CUTOFF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-cutoff" element
             */
            public int sizeOfBlast4CutoffArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4CUTOFF$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-cutoff" element
             */
            public void setBlast4CutoffArray(gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff[] blast4CutoffArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4CutoffArray, BLAST4CUTOFF$0);
                }
            }
            
            /**
             * Sets ith "Blast4-cutoff" element
             */
            public void setBlast4CutoffArray(int i, gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff blast4Cutoff)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().find_element_user(BLAST4CUTOFF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4Cutoff);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-cutoff" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff insertNewBlast4Cutoff(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().insert_element_user(BLAST4CUTOFF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-cutoff" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff addNewBlast4Cutoff()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().add_element_user(BLAST4CUTOFF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-cutoff" element
             */
            public void removeBlast4Cutoff(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4CUTOFF$0, i);
                }
            }
        }
        /**
         * An XML matrix-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MatrixListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList
        {
            
            public MatrixListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSSMWITHPARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmWithParameters");
            
            
            /**
             * Gets array of all "PssmWithParameters" elements
             */
            public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters[] getPssmWithParametersArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PSSMWITHPARAMETERS$0, targetList);
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters[] result = new gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "PssmWithParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters getPssmWithParametersArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().find_element_user(PSSMWITHPARAMETERS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "PssmWithParameters" element
             */
            public int sizeOfPssmWithParametersArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PSSMWITHPARAMETERS$0);
                }
            }
            
            /**
             * Sets array of all "PssmWithParameters" element
             */
            public void setPssmWithParametersArray(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters[] pssmWithParametersArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pssmWithParametersArray, PSSMWITHPARAMETERS$0);
                }
            }
            
            /**
             * Sets ith "PssmWithParameters" element
             */
            public void setPssmWithParametersArray(int i, gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters pssmWithParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().find_element_user(PSSMWITHPARAMETERS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pssmWithParameters);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PssmWithParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters insertNewPssmWithParameters(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().insert_element_user(PSSMWITHPARAMETERS$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PssmWithParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters addNewPssmWithParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().add_element_user(PSSMWITHPARAMETERS$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "PssmWithParameters" element
             */
            public void removePssmWithParameters(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PSSMWITHPARAMETERS$0, i);
                }
            }
        }
        /**
         * An XML seq-align-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqAlignListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList
        {
            
            public SeqAlignListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQALIGN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align");
            
            
            /**
             * Gets array of all "Seq-align" elements
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] getSeqAlignArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQALIGN$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] result = new gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-align" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlignArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-align" element
             */
            public int sizeOfSeqAlignArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQALIGN$0);
                }
            }
            
            /**
             * Sets array of all "Seq-align" element
             */
            public void setSeqAlignArray(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] seqAlignArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqAlignArray, SEQALIGN$0);
                }
            }
            
            /**
             * Sets ith "Seq-align" element
             */
            public void setSeqAlignArray(int i, gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqAlign);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-align" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign insertNewSeqAlign(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().insert_element_user(SEQALIGN$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-align" element
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
             * Removes the ith "Seq-align" element
             */
            public void removeSeqAlign(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQALIGN$0, i);
                }
            }
        }
        /**
         * An XML seq-id-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqIdListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList
        {
            
            public SeqIdListImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML seq-loc-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqLocListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList
        {
            
            public SeqLocListImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML strand-type-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList
        {
            
            public StrandTypeListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4STRANDTYPE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-strand-type");
            
            
            /**
             * Gets array of all "Blast4-strand-type" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] getBlast4StrandTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4STRANDTYPE$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] result = new gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandTypeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-strand-type" element
             */
            public int sizeOfBlast4StrandTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4STRANDTYPE$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-strand-type" element
             */
            public void setBlast4StrandTypeArray(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] blast4StrandTypeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4StrandTypeArray, BLAST4STRANDTYPE$0);
                }
            }
            
            /**
             * Sets ith "Blast4-strand-type" element
             */
            public void setBlast4StrandTypeArray(int i, gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4StrandType);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType insertNewBlast4StrandType(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().insert_element_user(BLAST4STRANDTYPE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().add_element_user(BLAST4STRANDTYPE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-strand-type" element
             */
            public void removeBlast4StrandType(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4STRANDTYPE$0, i);
                }
            }
        }
        /**
         * An XML bioseq-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BioseqSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet
        {
            
            public BioseqSetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BIOSEQSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Bioseq-set");
            
            
            /**
             * Gets the "Bioseq-set" element
             */
            public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet getBioseqSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().find_element_user(BIOSEQSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Bioseq-set" element
             */
            public void setBioseqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet bioseqSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().find_element_user(BIOSEQSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().add_element_user(BIOSEQSET$0);
                    }
                    target.set(bioseqSet);
                }
            }
            
            /**
             * Appends and returns a new empty "Bioseq-set" element
             */
            public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet addNewBioseqSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().add_element_user(BIOSEQSET$0);
                    return target;
                }
            }
        }
        /**
         * An XML seq-align-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqAlignSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet
        {
            
            public SeqAlignSetImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML query-mask(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueryMaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask
        {
            
            public QueryMaskImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4MASK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-mask");
            
            
            /**
             * Gets the "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4Mask()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-mask" element
             */
            public void setBlast4Mask(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().add_element_user(BLAST4MASK$0);
                    }
                    target.set(blast4Mask);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().add_element_user(BLAST4MASK$0);
                    return target;
                }
            }
        }
    }
}
