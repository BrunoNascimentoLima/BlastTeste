/*
 * An XML document type.
 * Localname: Bioseq
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BioseqDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Bioseq(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class BioseqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqDocument
{
    
    public BioseqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Bioseq(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class BioseqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq
    {
        
        public BioseqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName DESCR$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "descr");
        private static final javax.xml.namespace.QName INST$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "inst");
        private static final javax.xml.namespace.QName ANNOT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "annot");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id)get_store().find_element_user(ID$0, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Gets the "descr" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr getDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr)get_store().find_element_user(DESCR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "descr" element
         */
        public boolean isSetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCR$2) != 0;
            }
        }
        
        /**
         * Sets the "descr" element
         */
        public void setDescr(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr descr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr)get_store().find_element_user(DESCR$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr)get_store().add_element_user(DESCR$2);
                }
                target.set(descr);
            }
        }
        
        /**
         * Appends and returns a new empty "descr" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr addNewDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr)get_store().add_element_user(DESCR$2);
                return target;
            }
        }
        
        /**
         * Unsets the "descr" element
         */
        public void unsetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCR$2, 0);
            }
        }
        
        /**
         * Gets the "inst" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst getInst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst)get_store().find_element_user(INST$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "inst" element
         */
        public void setInst(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst inst)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst)get_store().find_element_user(INST$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst)get_store().add_element_user(INST$4);
                }
                target.set(inst);
            }
        }
        
        /**
         * Appends and returns a new empty "inst" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst addNewInst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst)get_store().add_element_user(INST$4);
                return target;
            }
        }
        
        /**
         * Gets the "annot" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot getAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot)get_store().find_element_user(ANNOT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "annot" element
         */
        public boolean isSetAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOT$6) != 0;
            }
        }
        
        /**
         * Sets the "annot" element
         */
        public void setAnnot(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot annot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot)get_store().find_element_user(ANNOT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot)get_store().add_element_user(ANNOT$6);
                }
                target.set(annot);
            }
        }
        
        /**
         * Appends and returns a new empty "annot" element
         */
        public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot addNewAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot)get_store().add_element_user(ANNOT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "annot" element
         */
        public void unsetAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOT$6, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML descr(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DescrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr
        {
            
            public DescrImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQDESCR$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-descr");
            
            
            /**
             * Gets the "Seq-descr" element
             */
            public gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr getSeqDescr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().find_element_user(SEQDESCR$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-descr" element
             */
            public void setSeqDescr(gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr seqDescr)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().find_element_user(SEQDESCR$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().add_element_user(SEQDESCR$0);
                    }
                    target.set(seqDescr);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-descr" element
             */
            public gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr addNewSeqDescr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().add_element_user(SEQDESCR$0);
                    return target;
                }
            }
        }
        /**
         * An XML inst(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class InstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst
        {
            
            public InstImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQINST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-inst");
            
            
            /**
             * Gets the "Seq-inst" element
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst getSeqInst()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().find_element_user(SEQINST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-inst" element
             */
            public void setSeqInst(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst seqInst)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().find_element_user(SEQINST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().add_element_user(SEQINST$0);
                    }
                    target.set(seqInst);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-inst" element
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst addNewSeqInst()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().add_element_user(SEQINST$0);
                    return target;
                }
            }
        }
        /**
         * An XML annot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AnnotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot
        {
            
            public AnnotImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQANNOT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-annot");
            
            
            /**
             * Gets array of all "Seq-annot" elements
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] getSeqAnnotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQANNOT$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] result = new gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-annot" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot getSeqAnnotArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().find_element_user(SEQANNOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-annot" element
             */
            public int sizeOfSeqAnnotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQANNOT$0);
                }
            }
            
            /**
             * Sets array of all "Seq-annot" element
             */
            public void setSeqAnnotArray(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] seqAnnotArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqAnnotArray, SEQANNOT$0);
                }
            }
            
            /**
             * Sets ith "Seq-annot" element
             */
            public void setSeqAnnotArray(int i, gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot seqAnnot)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().find_element_user(SEQANNOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqAnnot);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-annot" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot insertNewSeqAnnot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().insert_element_user(SEQANNOT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-annot" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot addNewSeqAnnot()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().add_element_user(SEQANNOT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-annot" element
             */
            public void removeSeqAnnot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQANNOT$0, i);
                }
            }
        }
    }
}
