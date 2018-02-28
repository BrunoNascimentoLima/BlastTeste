/*
 * An XML document type.
 * Localname: Blast4-queries
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueriesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-queries(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4QueriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueriesDocument
{
    
    public Blast4QueriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4QUERIES$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queries");
    
    
    /**
     * Gets the "Blast4-queries" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries getBlast4Queries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().find_element_user(BLAST4QUERIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-queries" element
     */
    public void setBlast4Queries(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries blast4Queries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().find_element_user(BLAST4QUERIES$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().add_element_user(BLAST4QUERIES$0);
            }
            target.set(blast4Queries);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-queries" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries addNewBlast4Queries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().add_element_user(BLAST4QUERIES$0);
            return target;
        }
    }
    /**
     * An XML Blast4-queries(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4QueriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries
    {
        
        public Blast4QueriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PSSM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pssm");
        private static final javax.xml.namespace.QName SEQLOCLIST$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-loc-list");
        private static final javax.xml.namespace.QName BIOSEQSET$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bioseq-set");
        
        
        /**
         * Gets the "pssm" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm getPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm)get_store().find_element_user(PSSM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pssm" element
         */
        public boolean isSetPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSSM$0) != 0;
            }
        }
        
        /**
         * Sets the "pssm" element
         */
        public void setPssm(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm pssm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm)get_store().find_element_user(PSSM$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm)get_store().add_element_user(PSSM$0);
                }
                target.set(pssm);
            }
        }
        
        /**
         * Appends and returns a new empty "pssm" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm addNewPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm)get_store().add_element_user(PSSM$0);
                return target;
            }
        }
        
        /**
         * Unsets the "pssm" element
         */
        public void unsetPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSSM$0, 0);
            }
        }
        
        /**
         * Gets the "seq-loc-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList getSeqLocList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList)get_store().find_element_user(SEQLOCLIST$2, 0);
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
                return get_store().count_elements(SEQLOCLIST$2) != 0;
            }
        }
        
        /**
         * Sets the "seq-loc-list" element
         */
        public void setSeqLocList(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList seqLocList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList)get_store().find_element_user(SEQLOCLIST$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList)get_store().add_element_user(SEQLOCLIST$2);
                }
                target.set(seqLocList);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-loc-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList addNewSeqLocList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList)get_store().add_element_user(SEQLOCLIST$2);
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
                get_store().remove_element(SEQLOCLIST$2, 0);
            }
        }
        
        /**
         * Gets the "bioseq-set" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet getBioseqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet)get_store().find_element_user(BIOSEQSET$4, 0);
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
                return get_store().count_elements(BIOSEQSET$4) != 0;
            }
        }
        
        /**
         * Sets the "bioseq-set" element
         */
        public void setBioseqSet(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet bioseqSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet)get_store().find_element_user(BIOSEQSET$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet)get_store().add_element_user(BIOSEQSET$4);
                }
                target.set(bioseqSet);
            }
        }
        
        /**
         * Appends and returns a new empty "bioseq-set" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet addNewBioseqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet)get_store().add_element_user(BIOSEQSET$4);
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
                get_store().remove_element(BIOSEQSET$4, 0);
            }
        }
        /**
         * An XML pssm(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PssmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm
        {
            
            public PssmImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML seq-loc-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqLocListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList
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
         * An XML bioseq-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BioseqSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet
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
    }
}
