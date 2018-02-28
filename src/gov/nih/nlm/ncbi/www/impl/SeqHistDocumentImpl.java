/*
 * An XML document type.
 * Localname: Seq-hist
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqHistDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-hist(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqHistDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument
{
    
    public SeqHistDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQHIST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-hist");
    
    
    /**
     * Gets the "Seq-hist" element
     */
    public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist getSeqHist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist target = null;
            target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().find_element_user(SEQHIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-hist" element
     */
    public void setSeqHist(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist seqHist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist target = null;
            target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().find_element_user(SEQHIST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().add_element_user(SEQHIST$0);
            }
            target.set(seqHist);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-hist" element
     */
    public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist addNewSeqHist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist target = null;
            target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().add_element_user(SEQHIST$0);
            return target;
        }
    }
    /**
     * An XML Seq-hist(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqHistImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist
    {
        
        public SeqHistImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ASSEMBLY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "assembly");
        private static final javax.xml.namespace.QName REPLACES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "replaces");
        private static final javax.xml.namespace.QName REPLACEDBY$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "replaced-by");
        private static final javax.xml.namespace.QName DELETED$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "deleted");
        
        
        /**
         * Gets the "assembly" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly getAssembly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly)get_store().find_element_user(ASSEMBLY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "assembly" element
         */
        public boolean isSetAssembly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSEMBLY$0) != 0;
            }
        }
        
        /**
         * Sets the "assembly" element
         */
        public void setAssembly(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly assembly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly)get_store().find_element_user(ASSEMBLY$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly)get_store().add_element_user(ASSEMBLY$0);
                }
                target.set(assembly);
            }
        }
        
        /**
         * Appends and returns a new empty "assembly" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly addNewAssembly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly)get_store().add_element_user(ASSEMBLY$0);
                return target;
            }
        }
        
        /**
         * Unsets the "assembly" element
         */
        public void unsetAssembly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSEMBLY$0, 0);
            }
        }
        
        /**
         * Gets the "replaces" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces getReplaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces)get_store().find_element_user(REPLACES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "replaces" element
         */
        public boolean isSetReplaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACES$2) != 0;
            }
        }
        
        /**
         * Sets the "replaces" element
         */
        public void setReplaces(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces replaces)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces)get_store().find_element_user(REPLACES$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces)get_store().add_element_user(REPLACES$2);
                }
                target.set(replaces);
            }
        }
        
        /**
         * Appends and returns a new empty "replaces" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces addNewReplaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces)get_store().add_element_user(REPLACES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "replaces" element
         */
        public void unsetReplaces()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACES$2, 0);
            }
        }
        
        /**
         * Gets the "replaced-by" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy getReplacedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy)get_store().find_element_user(REPLACEDBY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "replaced-by" element
         */
        public boolean isSetReplacedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACEDBY$4) != 0;
            }
        }
        
        /**
         * Sets the "replaced-by" element
         */
        public void setReplacedBy(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy replacedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy)get_store().find_element_user(REPLACEDBY$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy)get_store().add_element_user(REPLACEDBY$4);
                }
                target.set(replacedBy);
            }
        }
        
        /**
         * Appends and returns a new empty "replaced-by" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy addNewReplacedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy)get_store().add_element_user(REPLACEDBY$4);
                return target;
            }
        }
        
        /**
         * Unsets the "replaced-by" element
         */
        public void unsetReplacedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACEDBY$4, 0);
            }
        }
        
        /**
         * Gets the "deleted" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted getDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted)get_store().find_element_user(DELETED$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "deleted" element
         */
        public boolean isSetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETED$6) != 0;
            }
        }
        
        /**
         * Sets the "deleted" element
         */
        public void setDeleted(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted deleted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted)get_store().find_element_user(DELETED$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted)get_store().add_element_user(DELETED$6);
                }
                target.set(deleted);
            }
        }
        
        /**
         * Appends and returns a new empty "deleted" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted addNewDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted)get_store().add_element_user(DELETED$6);
                return target;
            }
        }
        
        /**
         * Unsets the "deleted" element
         */
        public void unsetDeleted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETED$6, 0);
            }
        }
        /**
         * An XML assembly(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AssemblyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly
        {
            
            public AssemblyImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML replaces(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ReplacesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces
        {
            
            public ReplacesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQHISTREC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-hist-rec");
            
            
            /**
             * Gets the "Seq-hist-rec" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec getSeqHistRec()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().find_element_user(SEQHISTREC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-hist-rec" element
             */
            public void setSeqHistRec(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec seqHistRec)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().find_element_user(SEQHISTREC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().add_element_user(SEQHISTREC$0);
                    }
                    target.set(seqHistRec);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-hist-rec" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec addNewSeqHistRec()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().add_element_user(SEQHISTREC$0);
                    return target;
                }
            }
        }
        /**
         * An XML replaced-by(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ReplacedByImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy
        {
            
            public ReplacedByImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQHISTREC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-hist-rec");
            
            
            /**
             * Gets the "Seq-hist-rec" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec getSeqHistRec()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().find_element_user(SEQHISTREC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-hist-rec" element
             */
            public void setSeqHistRec(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec seqHistRec)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().find_element_user(SEQHISTREC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().add_element_user(SEQHISTREC$0);
                    }
                    target.set(seqHistRec);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-hist-rec" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec addNewSeqHistRec()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().add_element_user(SEQHISTREC$0);
                    return target;
                }
            }
        }
        /**
         * An XML deleted(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DeletedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted
        {
            
            public DeletedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BOOL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bool");
            private static final javax.xml.namespace.QName DATE$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
            
            
            /**
             * Gets the "bool" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool getBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool)get_store().find_element_user(BOOL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "bool" element
             */
            public boolean isSetBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BOOL$0) != 0;
                }
            }
            
            /**
             * Sets the "bool" element
             */
            public void setBool(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool bool)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool)get_store().find_element_user(BOOL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool)get_store().add_element_user(BOOL$0);
                    }
                    target.set(bool);
                }
            }
            
            /**
             * Appends and returns a new empty "bool" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool addNewBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool)get_store().add_element_user(BOOL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "bool" element
             */
            public void unsetBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BOOL$0, 0);
                }
            }
            
            /**
             * Gets the "date" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date)get_store().find_element_user(DATE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "date" element
             */
            public boolean isSetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATE$2) != 0;
                }
            }
            
            /**
             * Sets the "date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date)get_store().find_element_user(DATE$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date)get_store().add_element_user(DATE$2);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "date" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date)get_store().add_element_user(DATE$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "date" element
             */
            public void unsetDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATE$2, 0);
                }
            }
            /**
             * An XML bool(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class BoolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool
            {
                
                public BoolImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VALUE$0 = 
                    new javax.xml.namespace.QName("", "value");
                
                
                /**
                 * Gets the "value" attribute
                 */
                public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value.Enum getValue()
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
                      return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value xgetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value)get_store().find_attribute_user(VALUE$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "value" attribute
                 */
                public void setValue(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value.Enum value)
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
                public void xsetValue(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value)get_store().add_attribute_user(VALUE$0);
                      }
                      target.set(value);
                    }
                }
                /**
                 * An XML value(@).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqHistDocument$SeqHist$Deleted$Bool$Value.
                 */
                public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value
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
             * An XML date(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date
            {
                
                public DateImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATE$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
                
                
                /**
                 * Gets the "Date" element
                 */
                public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Date" element
                 */
                public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                      }
                      target.set(date);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Date" element
                 */
                public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                      return target;
                    }
                }
            }
        }
    }
}
