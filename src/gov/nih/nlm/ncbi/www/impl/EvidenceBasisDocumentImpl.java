/*
 * An XML document type.
 * Localname: EvidenceBasis
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EvidenceBasisDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one EvidenceBasis(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class EvidenceBasisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EvidenceBasisDocument
{
    
    public EvidenceBasisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVIDENCEBASIS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EvidenceBasis");
    
    
    /**
     * Gets the "EvidenceBasis" element
     */
    public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis getEvidenceBasis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis target = null;
            target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().find_element_user(EVIDENCEBASIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EvidenceBasis" element
     */
    public void setEvidenceBasis(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis evidenceBasis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis target = null;
            target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().find_element_user(EVIDENCEBASIS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().add_element_user(EVIDENCEBASIS$0);
            }
            target.set(evidenceBasis);
        }
    }
    
    /**
     * Appends and returns a new empty "EvidenceBasis" element
     */
    public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis addNewEvidenceBasis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis target = null;
            target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis)get_store().add_element_user(EVIDENCEBASIS$0);
            return target;
        }
    }
    /**
     * An XML EvidenceBasis(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class EvidenceBasisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis
    {
        
        public EvidenceBasisImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROGRAMS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "programs");
        private static final javax.xml.namespace.QName ACCESSIONS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "accessions");
        
        
        /**
         * Gets the "programs" element
         */
        public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs getPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs)get_store().find_element_user(PROGRAMS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "programs" element
         */
        public boolean isSetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROGRAMS$0) != 0;
            }
        }
        
        /**
         * Sets the "programs" element
         */
        public void setPrograms(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs programs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs)get_store().find_element_user(PROGRAMS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs)get_store().add_element_user(PROGRAMS$0);
                }
                target.set(programs);
            }
        }
        
        /**
         * Appends and returns a new empty "programs" element
         */
        public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs addNewPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs)get_store().add_element_user(PROGRAMS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "programs" element
         */
        public void unsetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROGRAMS$0, 0);
            }
        }
        
        /**
         * Gets the "accessions" element
         */
        public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions getAccessions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions)get_store().find_element_user(ACCESSIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "accessions" element
         */
        public boolean isSetAccessions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCESSIONS$2) != 0;
            }
        }
        
        /**
         * Sets the "accessions" element
         */
        public void setAccessions(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions accessions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions)get_store().find_element_user(ACCESSIONS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions)get_store().add_element_user(ACCESSIONS$2);
                }
                target.set(accessions);
            }
        }
        
        /**
         * Appends and returns a new empty "accessions" element
         */
        public gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions addNewAccessions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions target = null;
                target = (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions)get_store().add_element_user(ACCESSIONS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "accessions" element
         */
        public void unsetAccessions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCESSIONS$2, 0);
            }
        }
        /**
         * An XML programs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProgramsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs
        {
            
            public ProgramsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROGRAMID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Program-id");
            
            
            /**
             * Gets array of all "Program-id" elements
             */
            public gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId[] getProgramIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PROGRAMID$0, targetList);
                    gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId[] result = new gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Program-id" element
             */
            public gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId getProgramIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
                    target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().find_element_user(PROGRAMID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Program-id" element
             */
            public int sizeOfProgramIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROGRAMID$0);
                }
            }
            
            /**
             * Sets array of all "Program-id" element
             */
            public void setProgramIdArray(gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId[] programIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(programIdArray, PROGRAMID$0);
                }
            }
            
            /**
             * Sets ith "Program-id" element
             */
            public void setProgramIdArray(int i, gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId programId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
                    target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().find_element_user(PROGRAMID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(programId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Program-id" element
             */
            public gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId insertNewProgramId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
                    target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().insert_element_user(PROGRAMID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Program-id" element
             */
            public gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId addNewProgramId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
                    target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().add_element_user(PROGRAMID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Program-id" element
             */
            public void removeProgramId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROGRAMID$0, i);
                }
            }
        }
        /**
         * An XML accessions(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AccessionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions
        {
            
            public AccessionsImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
