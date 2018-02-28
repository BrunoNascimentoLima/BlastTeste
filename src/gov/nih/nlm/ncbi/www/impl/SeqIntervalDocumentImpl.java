/*
 * An XML document type.
 * Localname: Seq-interval
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-interval(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqIntervalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIntervalDocument
{
    
    public SeqIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQINTERVAL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-interval");
    
    
    /**
     * Gets the "Seq-interval" element
     */
    public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-interval" element
     */
    public void setSeqInterval(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
            }
            target.set(seqInterval);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-interval" element
     */
    public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
            return target;
        }
    }
    /**
     * An XML Seq-interval(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqIntervalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval
    {
        
        public SeqIntervalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FROM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "from");
        private static final javax.xml.namespace.QName TO$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "to");
        private static final javax.xml.namespace.QName STRAND$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName FUZZFROM$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fuzz-from");
        private static final javax.xml.namespace.QName FUZZTO$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fuzz-to");
        
        
        /**
         * Gets the "from" element
         */
        public java.math.BigInteger getFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "from" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FROM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "from" element
         */
        public void setFrom(java.math.BigInteger from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROM$0);
                }
                target.setBigIntegerValue(from);
            }
        }
        
        /**
         * Sets (as xml) the "from" element
         */
        public void xsetFrom(org.apache.xmlbeans.XmlInteger from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FROM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FROM$0);
                }
                target.set(from);
            }
        }
        
        /**
         * Gets the "to" element
         */
        public java.math.BigInteger getTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "to" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "to" element
         */
        public void setTo(java.math.BigInteger to)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TO$2);
                }
                target.setBigIntegerValue(to);
            }
        }
        
        /**
         * Sets (as xml) the "to" element
         */
        public void xsetTo(org.apache.xmlbeans.XmlInteger to)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TO$2);
                }
                target.set(to);
            }
        }
        
        /**
         * Gets the "strand" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand getStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand)get_store().find_element_user(STRAND$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strand" element
         */
        public boolean isSetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRAND$4) != 0;
            }
        }
        
        /**
         * Sets the "strand" element
         */
        public void setStrand(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand strand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand)get_store().find_element_user(STRAND$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand)get_store().add_element_user(STRAND$4);
                }
                target.set(strand);
            }
        }
        
        /**
         * Appends and returns a new empty "strand" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand addNewStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand)get_store().add_element_user(STRAND$4);
                return target;
            }
        }
        
        /**
         * Unsets the "strand" element
         */
        public void unsetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRAND$4, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id)get_store().find_element_user(ID$6, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id)get_store().find_element_user(ID$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id)get_store().add_element_user(ID$6);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id)get_store().add_element_user(ID$6);
                return target;
            }
        }
        
        /**
         * Gets the "fuzz-from" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom getFuzzFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom)get_store().find_element_user(FUZZFROM$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fuzz-from" element
         */
        public boolean isSetFuzzFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUZZFROM$8) != 0;
            }
        }
        
        /**
         * Sets the "fuzz-from" element
         */
        public void setFuzzFrom(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom fuzzFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom)get_store().find_element_user(FUZZFROM$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom)get_store().add_element_user(FUZZFROM$8);
                }
                target.set(fuzzFrom);
            }
        }
        
        /**
         * Appends and returns a new empty "fuzz-from" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom addNewFuzzFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom)get_store().add_element_user(FUZZFROM$8);
                return target;
            }
        }
        
        /**
         * Unsets the "fuzz-from" element
         */
        public void unsetFuzzFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUZZFROM$8, 0);
            }
        }
        
        /**
         * Gets the "fuzz-to" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo getFuzzTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo)get_store().find_element_user(FUZZTO$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fuzz-to" element
         */
        public boolean isSetFuzzTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUZZTO$10) != 0;
            }
        }
        
        /**
         * Sets the "fuzz-to" element
         */
        public void setFuzzTo(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo fuzzTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo)get_store().find_element_user(FUZZTO$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo)get_store().add_element_user(FUZZTO$10);
                }
                target.set(fuzzTo);
            }
        }
        
        /**
         * Appends and returns a new empty "fuzz-to" element
         */
        public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo addNewFuzzTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo)get_store().add_element_user(FUZZTO$10);
                return target;
            }
        }
        
        /**
         * Unsets the "fuzz-to" element
         */
        public void unsetFuzzTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUZZTO$10, 0);
            }
        }
        /**
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand
        {
            
            public StrandImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NASTRAND$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Na-strand");
            
            
            /**
             * Gets the "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Na-strand" element
             */
            public void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    }
                    target.set(naStrand);
                }
            }
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    return target;
                }
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id
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
         * An XML fuzz-from(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FuzzFromImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom
        {
            
            public FuzzFromImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTFUZZ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Int-fuzz");
            
            
            /**
             * Gets the "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Int-fuzz" element
             */
            public void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    }
                    target.set(intFuzz);
                }
            }
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    return target;
                }
            }
        }
        /**
         * An XML fuzz-to(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FuzzToImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo
        {
            
            public FuzzToImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTFUZZ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Int-fuzz");
            
            
            /**
             * Gets the "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Int-fuzz" element
             */
            public void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    }
                    target.set(intFuzz);
                }
            }
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    return target;
                }
            }
        }
    }
}
