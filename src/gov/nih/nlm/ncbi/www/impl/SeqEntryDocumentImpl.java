/*
 * An XML document type.
 * Localname: Seq-entry
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqEntryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-entry(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqEntryDocument
{
    
    public SeqEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQENTRY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-entry");
    
    
    /**
     * Gets the "Seq-entry" element
     */
    public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry getSeqEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
            target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().find_element_user(SEQENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-entry" element
     */
    public void setSeqEntry(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry seqEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
            target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().find_element_user(SEQENTRY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().add_element_user(SEQENTRY$0);
            }
            target.set(seqEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-entry" element
     */
    public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry addNewSeqEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
            target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().add_element_user(SEQENTRY$0);
            return target;
        }
    }
    /**
     * An XML Seq-entry(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry
    {
        
        public SeqEntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQ$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq");
        private static final javax.xml.namespace.QName SET$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "set");
        
        
        /**
         * Gets the "seq" element
         */
        public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq getSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq)get_store().find_element_user(SEQ$0, 0);
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
                return get_store().count_elements(SEQ$0) != 0;
            }
        }
        
        /**
         * Sets the "seq" element
         */
        public void setSeq(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq seq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq)get_store().find_element_user(SEQ$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq)get_store().add_element_user(SEQ$0);
                }
                target.set(seq);
            }
        }
        
        /**
         * Appends and returns a new empty "seq" element
         */
        public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq addNewSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq)get_store().add_element_user(SEQ$0);
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
                get_store().remove_element(SEQ$0, 0);
            }
        }
        
        /**
         * Gets the "set" element
         */
        public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set getSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set target = null;
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set)get_store().find_element_user(SET$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "set" element
         */
        public boolean isSetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SET$2) != 0;
            }
        }
        
        /**
         * Sets the "set" element
         */
        public void setSet(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set set)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set target = null;
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set)get_store().find_element_user(SET$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set)get_store().add_element_user(SET$2);
                }
                target.set(set);
            }
        }
        
        /**
         * Appends and returns a new empty "set" element
         */
        public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set addNewSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set target = null;
                target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set)get_store().add_element_user(SET$2);
                return target;
            }
        }
        
        /**
         * Unsets the "set" element
         */
        public void unsetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SET$2, 0);
            }
        }
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Seq
        {
            
            public SeqImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry.Set
        {
            
            public SetImpl(org.apache.xmlbeans.SchemaType sType)
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
