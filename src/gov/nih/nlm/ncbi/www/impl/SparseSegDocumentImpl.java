/*
 * An XML document type.
 * Localname: Sparse-seg
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SparseSegDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Sparse-seg(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SparseSegDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegDocument
{
    
    public SparseSegDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Sparse-seg(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SparseSegImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg
    {
        
        public SparseSegImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MASTERID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "master-id");
        private static final javax.xml.namespace.QName ROWS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rows");
        private static final javax.xml.namespace.QName ROWSCORES$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "row-scores");
        private static final javax.xml.namespace.QName EXT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        
        
        /**
         * Gets the "master-id" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId getMasterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId)get_store().find_element_user(MASTERID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "master-id" element
         */
        public boolean isSetMasterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MASTERID$0) != 0;
            }
        }
        
        /**
         * Sets the "master-id" element
         */
        public void setMasterId(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId masterId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId)get_store().find_element_user(MASTERID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId)get_store().add_element_user(MASTERID$0);
                }
                target.set(masterId);
            }
        }
        
        /**
         * Appends and returns a new empty "master-id" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId addNewMasterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId)get_store().add_element_user(MASTERID$0);
                return target;
            }
        }
        
        /**
         * Unsets the "master-id" element
         */
        public void unsetMasterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MASTERID$0, 0);
            }
        }
        
        /**
         * Gets the "rows" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows getRows()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows)get_store().find_element_user(ROWS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "rows" element
         */
        public void setRows(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows rows)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows)get_store().find_element_user(ROWS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows)get_store().add_element_user(ROWS$2);
                }
                target.set(rows);
            }
        }
        
        /**
         * Appends and returns a new empty "rows" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows addNewRows()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows)get_store().add_element_user(ROWS$2);
                return target;
            }
        }
        
        /**
         * Gets the "row-scores" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores getRowScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores)get_store().find_element_user(ROWSCORES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "row-scores" element
         */
        public boolean isSetRowScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROWSCORES$4) != 0;
            }
        }
        
        /**
         * Sets the "row-scores" element
         */
        public void setRowScores(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores rowScores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores)get_store().find_element_user(ROWSCORES$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores)get_store().add_element_user(ROWSCORES$4);
                }
                target.set(rowScores);
            }
        }
        
        /**
         * Appends and returns a new empty "row-scores" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores addNewRowScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores)get_store().add_element_user(ROWSCORES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "row-scores" element
         */
        public void unsetRowScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROWSCORES$4, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext)get_store().find_element_user(EXT$6, 0);
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
                return get_store().count_elements(EXT$6) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext)get_store().find_element_user(EXT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext)get_store().add_element_user(EXT$6);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext)get_store().add_element_user(EXT$6);
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
                get_store().remove_element(EXT$6, 0);
            }
        }
        /**
         * An XML master-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MasterIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId
        {
            
            public MasterIdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML rows(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RowsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows
        {
            
            public RowsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPARSEALIGN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Sparse-align");
            
            
            /**
             * Gets array of all "Sparse-align" elements
             */
            public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign[] getSparseAlignArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SPARSEALIGN$0, targetList);
                    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign[] result = new gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Sparse-align" element
             */
            public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign getSparseAlignArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().find_element_user(SPARSEALIGN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Sparse-align" element
             */
            public int sizeOfSparseAlignArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPARSEALIGN$0);
                }
            }
            
            /**
             * Sets array of all "Sparse-align" element
             */
            public void setSparseAlignArray(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign[] sparseAlignArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(sparseAlignArray, SPARSEALIGN$0);
                }
            }
            
            /**
             * Sets ith "Sparse-align" element
             */
            public void setSparseAlignArray(int i, gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign sparseAlign)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().find_element_user(SPARSEALIGN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(sparseAlign);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Sparse-align" element
             */
            public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign insertNewSparseAlign(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().insert_element_user(SPARSEALIGN$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Sparse-align" element
             */
            public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign addNewSparseAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().add_element_user(SPARSEALIGN$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Sparse-align" element
             */
            public void removeSparseAlign(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPARSEALIGN$0, i);
                }
            }
        }
        /**
         * An XML row-scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RowScoresImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores
        {
            
            public RowScoresImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPARSESEGEXT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Sparse-seg-ext");
            
            
            /**
             * Gets array of all "Sparse-seg-ext" elements
             */
            public gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt[] getSparseSegExtArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SPARSESEGEXT$0, targetList);
                    gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt[] result = new gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Sparse-seg-ext" element
             */
            public gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt getSparseSegExtArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().find_element_user(SPARSESEGEXT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Sparse-seg-ext" element
             */
            public int sizeOfSparseSegExtArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPARSESEGEXT$0);
                }
            }
            
            /**
             * Sets array of all "Sparse-seg-ext" element
             */
            public void setSparseSegExtArray(gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt[] sparseSegExtArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(sparseSegExtArray, SPARSESEGEXT$0);
                }
            }
            
            /**
             * Sets ith "Sparse-seg-ext" element
             */
            public void setSparseSegExtArray(int i, gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt sparseSegExt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().find_element_user(SPARSESEGEXT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(sparseSegExt);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Sparse-seg-ext" element
             */
            public gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt insertNewSparseSegExt(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().insert_element_user(SPARSESEGEXT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Sparse-seg-ext" element
             */
            public gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt addNewSparseSegExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt)get_store().add_element_user(SPARSESEGEXT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Sparse-seg-ext" element
             */
            public void removeSparseSegExt(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPARSESEGEXT$0, i);
                }
            }
        }
    }
}
