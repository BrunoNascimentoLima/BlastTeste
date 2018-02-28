/*
 * An XML document type.
 * Localname: Packed-seqpnt
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PackedSeqpntDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Packed-seqpnt(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PackedSeqpntDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqpntDocument
{
    
    public PackedSeqpntDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKEDSEQPNT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Packed-seqpnt");
    
    
    /**
     * Gets the "Packed-seqpnt" element
     */
    public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt getPackedSeqpnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().find_element_user(PACKEDSEQPNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Packed-seqpnt" element
     */
    public void setPackedSeqpnt(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt packedSeqpnt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().find_element_user(PACKEDSEQPNT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().add_element_user(PACKEDSEQPNT$0);
            }
            target.set(packedSeqpnt);
        }
    }
    
    /**
     * Appends and returns a new empty "Packed-seqpnt" element
     */
    public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt addNewPackedSeqpnt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().add_element_user(PACKEDSEQPNT$0);
            return target;
        }
    }
    /**
     * An XML Packed-seqpnt(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PackedSeqpntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt
    {
        
        public PackedSeqpntImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRAND$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName FUZZ$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fuzz");
        private static final javax.xml.namespace.QName POINTS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "points");
        
        
        /**
         * Gets the "strand" element
         */
        public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand getStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand)get_store().find_element_user(STRAND$0, 0);
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
                return get_store().count_elements(STRAND$0) != 0;
            }
        }
        
        /**
         * Sets the "strand" element
         */
        public void setStrand(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand strand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand)get_store().find_element_user(STRAND$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand)get_store().add_element_user(STRAND$0);
                }
                target.set(strand);
            }
        }
        
        /**
         * Appends and returns a new empty "strand" element
         */
        public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand addNewStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand)get_store().add_element_user(STRAND$0);
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
                get_store().remove_element(STRAND$0, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id)get_store().find_element_user(ID$2, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id)get_store().add_element_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id)get_store().add_element_user(ID$2);
                return target;
            }
        }
        
        /**
         * Gets the "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz getFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz)get_store().find_element_user(FUZZ$4, 0);
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
                return get_store().count_elements(FUZZ$4) != 0;
            }
        }
        
        /**
         * Sets the "fuzz" element
         */
        public void setFuzz(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz fuzz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz)get_store().find_element_user(FUZZ$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz)get_store().add_element_user(FUZZ$4);
                }
                target.set(fuzz);
            }
        }
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz addNewFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz)get_store().add_element_user(FUZZ$4);
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
                get_store().remove_element(FUZZ$4, 0);
            }
        }
        
        /**
         * Gets array of all "points" elements
         */
        public java.math.BigInteger[] getPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(POINTS$6, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "points" element
         */
        public java.math.BigInteger getPointsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POINTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "points" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(POINTS$6, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "points" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPointsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POINTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "points" element
         */
        public int sizeOfPointsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POINTS$6);
            }
        }
        
        /**
         * Sets array of all "points" element
         */
        public void setPointsArray(java.math.BigInteger[] pointsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pointsArray, POINTS$6);
            }
        }
        
        /**
         * Sets ith "points" element
         */
        public void setPointsArray(int i, java.math.BigInteger points)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POINTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(points);
            }
        }
        
        /**
         * Sets (as xml) array of all "points" element
         */
        public void xsetPointsArray(org.apache.xmlbeans.XmlInteger[]pointsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pointsArray, POINTS$6);
            }
        }
        
        /**
         * Sets (as xml) ith "points" element
         */
        public void xsetPointsArray(int i, org.apache.xmlbeans.XmlInteger points)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POINTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(points);
            }
        }
        
        /**
         * Inserts the value as the ith "points" element
         */
        public void insertPoints(int i, java.math.BigInteger points)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(POINTS$6, i);
                target.setBigIntegerValue(points);
            }
        }
        
        /**
         * Appends the value as the last "points" element
         */
        public void addPoints(java.math.BigInteger points)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POINTS$6);
                target.setBigIntegerValue(points);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "points" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewPoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(POINTS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "points" element
         */
        public org.apache.xmlbeans.XmlInteger addNewPoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(POINTS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "points" element
         */
        public void removePoints(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POINTS$6, i);
            }
        }
        /**
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand
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
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id
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
        public static class FuzzImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz
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
