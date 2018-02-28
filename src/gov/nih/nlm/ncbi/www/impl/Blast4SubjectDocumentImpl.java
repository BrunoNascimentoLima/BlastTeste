/*
 * An XML document type.
 * Localname: Blast4-subject
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SubjectDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-subject(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4SubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SubjectDocument
{
    
    public Blast4SubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4SUBJECT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-subject");
    
    
    /**
     * Gets the "Blast4-subject" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject getBlast4Subject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().find_element_user(BLAST4SUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-subject" element
     */
    public void setBlast4Subject(gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject blast4Subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().find_element_user(BLAST4SUBJECT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().add_element_user(BLAST4SUBJECT$0);
            }
            target.set(blast4Subject);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-subject" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject addNewBlast4Subject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().add_element_user(BLAST4SUBJECT$0);
            return target;
        }
    }
    /**
     * An XML Blast4-subject(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4SubjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject
    {
        
        public Blast4SubjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATABASE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "database");
        private static final javax.xml.namespace.QName SEQUENCES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sequences");
        
        
        /**
         * Gets the "database" element
         */
        public java.lang.String getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "database" element
         */
        public org.apache.xmlbeans.XmlString xgetDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATABASE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "database" element
         */
        public boolean isSetDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASE$0) != 0;
            }
        }
        
        /**
         * Sets the "database" element
         */
        public void setDatabase(java.lang.String database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATABASE$0);
                }
                target.setStringValue(database);
            }
        }
        
        /**
         * Sets (as xml) the "database" element
         */
        public void xsetDatabase(org.apache.xmlbeans.XmlString database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATABASE$0);
                }
                target.set(database);
            }
        }
        
        /**
         * Unsets the "database" element
         */
        public void unsetDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASE$0, 0);
            }
        }
        
        /**
         * Gets the "sequences" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences getSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences)get_store().find_element_user(SEQUENCES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sequences" element
         */
        public boolean isSetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQUENCES$2) != 0;
            }
        }
        
        /**
         * Sets the "sequences" element
         */
        public void setSequences(gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences sequences)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences)get_store().find_element_user(SEQUENCES$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences)get_store().add_element_user(SEQUENCES$2);
                }
                target.set(sequences);
            }
        }
        
        /**
         * Appends and returns a new empty "sequences" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences addNewSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences)get_store().add_element_user(SEQUENCES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "sequences" element
         */
        public void unsetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQUENCES$2, 0);
            }
        }
        /**
         * An XML sequences(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SequencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject.Sequences
        {
            
            public SequencesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BIOSEQ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Bioseq");
            
            
            /**
             * Gets array of all "Bioseq" elements
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] getBioseqArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BIOSEQ$0, targetList);
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] result = new gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseqArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Bioseq" element
             */
            public int sizeOfBioseqArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BIOSEQ$0);
                }
            }
            
            /**
             * Sets array of all "Bioseq" element
             */
            public void setBioseqArray(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] bioseqArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(bioseqArray, BIOSEQ$0);
                }
            }
            
            /**
             * Sets ith "Bioseq" element
             */
            public void setBioseqArray(int i, gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().find_element_user(BIOSEQ$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(bioseq);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Bioseq" element
             */
            public gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq insertNewBioseq(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq)get_store().insert_element_user(BIOSEQ$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Bioseq" element
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
             * Removes the ith "Bioseq" element
             */
            public void removeBioseq(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BIOSEQ$0, i);
                }
            }
        }
    }
}
