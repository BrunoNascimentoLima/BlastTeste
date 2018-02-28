/*
 * An XML document type.
 * Localname: Seq-point
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqPointDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-point(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqPointDocument
{
    
    public SeqPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQPOINT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-point");
    
    
    /**
     * Gets the "Seq-point" element
     */
    public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint getSeqPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
            target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().find_element_user(SEQPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-point" element
     */
    public void setSeqPoint(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint seqPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
            target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().find_element_user(SEQPOINT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().add_element_user(SEQPOINT$0);
            }
            target.set(seqPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-point" element
     */
    public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint addNewSeqPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
            target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().add_element_user(SEQPOINT$0);
            return target;
        }
    }
    /**
     * An XML Seq-point(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint
    {
        
        public SeqPointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POINT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "point");
        private static final javax.xml.namespace.QName STRAND$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName FUZZ$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fuzz");
        
        
        /**
         * Gets the "point" element
         */
        public java.math.BigInteger getPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POINT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "point" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POINT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "point" element
         */
        public void setPoint(java.math.BigInteger point)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POINT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POINT$0);
                }
                target.setBigIntegerValue(point);
            }
        }
        
        /**
         * Sets (as xml) the "point" element
         */
        public void xsetPoint(org.apache.xmlbeans.XmlInteger point)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POINT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(POINT$0);
                }
                target.set(point);
            }
        }
        
        /**
         * Gets the "strand" element
         */
        public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand getStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand)get_store().find_element_user(STRAND$2, 0);
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
                return get_store().count_elements(STRAND$2) != 0;
            }
        }
        
        /**
         * Sets the "strand" element
         */
        public void setStrand(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand strand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand)get_store().find_element_user(STRAND$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand)get_store().add_element_user(STRAND$2);
                }
                target.set(strand);
            }
        }
        
        /**
         * Appends and returns a new empty "strand" element
         */
        public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand addNewStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand)get_store().add_element_user(STRAND$2);
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
                get_store().remove_element(STRAND$2, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id)get_store().find_element_user(ID$4, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id)get_store().find_element_user(ID$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id)get_store().add_element_user(ID$4);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id)get_store().add_element_user(ID$4);
                return target;
            }
        }
        
        /**
         * Gets the "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz getFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz)get_store().find_element_user(FUZZ$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fuzz" element
         */
        public boolean isSetFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUZZ$6) != 0;
            }
        }
        
        /**
         * Sets the "fuzz" element
         */
        public void setFuzz(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz fuzz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz)get_store().find_element_user(FUZZ$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz)get_store().add_element_user(FUZZ$6);
                }
                target.set(fuzz);
            }
        }
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz addNewFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz)get_store().add_element_user(FUZZ$6);
                return target;
            }
        }
        
        /**
         * Unsets the "fuzz" element
         */
        public void unsetFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUZZ$6, 0);
            }
        }
        /**
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Strand
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
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Id
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
         * An XML fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FuzzImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint.Fuzz
        {
            
            public FuzzImpl(org.apache.xmlbeans.SchemaType sType)
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
