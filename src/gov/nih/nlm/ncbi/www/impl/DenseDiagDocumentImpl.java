/*
 * An XML document type.
 * Localname: Dense-diag
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DenseDiagDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Dense-diag(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DenseDiagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DenseDiagDocument
{
    
    public DenseDiagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENSEDIAG$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dense-diag");
    
    
    /**
     * Gets the "Dense-diag" element
     */
    public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag getDenseDiag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag target = null;
            target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().find_element_user(DENSEDIAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Dense-diag" element
     */
    public void setDenseDiag(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag denseDiag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag target = null;
            target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().find_element_user(DENSEDIAG$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag)get_store().add_element_user(DENSEDIAG$0);
            }
            target.set(denseDiag);
        }
    }
    
    /**
     * Appends and returns a new empty "Dense-diag" element
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
     * An XML Dense-diag(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DenseDiagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag
    {
        
        public DenseDiagImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dim");
        private static final javax.xml.namespace.QName IDS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        private static final javax.xml.namespace.QName STARTS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "starts");
        private static final javax.xml.namespace.QName LEN$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "len");
        private static final javax.xml.namespace.QName STRANDS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strands");
        private static final javax.xml.namespace.QName SCORES$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "scores");
        
        
        /**
         * Gets the "dim" element
         */
        public java.math.BigInteger getDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIM$0, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIM$0, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIM$0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DIM$0);
                }
                target.set(dim);
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids)get_store().find_element_user(IDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids)get_store().find_element_user(IDS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids)get_store().add_element_user(IDS$2);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids)get_store().add_element_user(IDS$2);
                return target;
            }
        }
        
        /**
         * Gets array of all "starts" elements
         */
        public java.math.BigInteger[] getStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTS$4, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "starts" element
         */
        public java.math.BigInteger getStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "starts" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTS$4, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "starts" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "starts" element
         */
        public int sizeOfStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTS$4);
            }
        }
        
        /**
         * Sets array of all "starts" element
         */
        public void setStartsArray(java.math.BigInteger[] startsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startsArray, STARTS$4);
            }
        }
        
        /**
         * Sets ith "starts" element
         */
        public void setStartsArray(int i, java.math.BigInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(starts);
            }
        }
        
        /**
         * Sets (as xml) array of all "starts" element
         */
        public void xsetStartsArray(org.apache.xmlbeans.XmlInteger[]startsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startsArray, STARTS$4);
            }
        }
        
        /**
         * Sets (as xml) ith "starts" element
         */
        public void xsetStartsArray(int i, org.apache.xmlbeans.XmlInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(starts);
            }
        }
        
        /**
         * Inserts the value as the ith "starts" element
         */
        public void insertStarts(int i, java.math.BigInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STARTS$4, i);
                target.setBigIntegerValue(starts);
            }
        }
        
        /**
         * Appends the value as the last "starts" element
         */
        public void addStarts(java.math.BigInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTS$4);
                target.setBigIntegerValue(starts);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "starts" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(STARTS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "starts" element
         */
        public org.apache.xmlbeans.XmlInteger addNewStarts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STARTS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "starts" element
         */
        public void removeStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTS$4, i);
            }
        }
        
        /**
         * Gets the "len" element
         */
        public java.math.BigInteger getLen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEN$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "len" element
         */
        public org.apache.xmlbeans.XmlInteger xgetLen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEN$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "len" element
         */
        public void setLen(java.math.BigInteger len)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEN$6);
                }
                target.setBigIntegerValue(len);
            }
        }
        
        /**
         * Sets (as xml) the "len" element
         */
        public void xsetLen(org.apache.xmlbeans.XmlInteger len)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LEN$6);
                }
                target.set(len);
            }
        }
        
        /**
         * Gets the "strands" element
         */
        public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands getStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands)get_store().find_element_user(STRANDS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strands" element
         */
        public boolean isSetStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRANDS$8) != 0;
            }
        }
        
        /**
         * Sets the "strands" element
         */
        public void setStrands(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands strands)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands)get_store().find_element_user(STRANDS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands)get_store().add_element_user(STRANDS$8);
                }
                target.set(strands);
            }
        }
        
        /**
         * Appends and returns a new empty "strands" element
         */
        public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands addNewStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands)get_store().add_element_user(STRANDS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "strands" element
         */
        public void unsetStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRANDS$8, 0);
            }
        }
        
        /**
         * Gets the "scores" element
         */
        public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores getScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores)get_store().find_element_user(SCORES$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "scores" element
         */
        public boolean isSetScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORES$10) != 0;
            }
        }
        
        /**
         * Sets the "scores" element
         */
        public void setScores(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores)get_store().find_element_user(SCORES$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores)get_store().add_element_user(SCORES$10);
                }
                target.set(scores);
            }
        }
        
        /**
         * Appends and returns a new empty "scores" element
         */
        public gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores addNewScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores)get_store().add_element_user(SCORES$10);
                return target;
            }
        }
        
        /**
         * Unsets the "scores" element
         */
        public void unsetScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORES$10, 0);
            }
        }
        /**
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids
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
        /**
         * An XML strands(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands
        {
            
            public StrandsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NASTRAND$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Na-strand");
            
            
            /**
             * Gets array of all "Na-strand" elements
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] getNaStrandArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NASTRAND$0, targetList);
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] result = new gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrandArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Na-strand" element
             */
            public int sizeOfNaStrandArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NASTRAND$0);
                }
            }
            
            /**
             * Sets array of all "Na-strand" element
             */
            public void setNaStrandArray(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] naStrandArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(naStrandArray, NASTRAND$0);
                }
            }
            
            /**
             * Sets ith "Na-strand" element
             */
            public void setNaStrandArray(int i, gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(naStrand);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand insertNewNaStrand(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().insert_element_user(NASTRAND$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Na-strand" element
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
            
            /**
             * Removes the ith "Na-strand" element
             */
            public void removeNaStrand(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NASTRAND$0, i);
                }
            }
        }
        /**
         * An XML scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ScoresImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores
        {
            
            public ScoresImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
