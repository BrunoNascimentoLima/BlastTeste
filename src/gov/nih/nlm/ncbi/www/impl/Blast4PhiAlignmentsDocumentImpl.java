/*
 * An XML document type.
 * Localname: Blast4-phi-alignments
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-phi-alignments(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4PhiAlignmentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument
{
    
    public Blast4PhiAlignmentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4PHIALIGNMENTS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-phi-alignments");
    
    
    /**
     * Gets the "Blast4-phi-alignments" element
     */
    public gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments getBlast4PhiAlignments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments)get_store().find_element_user(BLAST4PHIALIGNMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-phi-alignments" element
     */
    public void setBlast4PhiAlignments(gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments blast4PhiAlignments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments)get_store().find_element_user(BLAST4PHIALIGNMENTS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments)get_store().add_element_user(BLAST4PHIALIGNMENTS$0);
            }
            target.set(blast4PhiAlignments);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-phi-alignments" element
     */
    public gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments addNewBlast4PhiAlignments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments)get_store().add_element_user(BLAST4PHIALIGNMENTS$0);
            return target;
        }
    }
    /**
     * An XML Blast4-phi-alignments(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4PhiAlignmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments
    {
        
        public Blast4PhiAlignmentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMALIGNMENTS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num-alignments");
        private static final javax.xml.namespace.QName SEQLOCS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-locs");
        
        
        /**
         * Gets the "num-alignments" element
         */
        public java.math.BigInteger getNumAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMALIGNMENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "num-alignments" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMALIGNMENTS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "num-alignments" element
         */
        public void setNumAlignments(java.math.BigInteger numAlignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMALIGNMENTS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMALIGNMENTS$0);
                }
                target.setBigIntegerValue(numAlignments);
            }
        }
        
        /**
         * Sets (as xml) the "num-alignments" element
         */
        public void xsetNumAlignments(org.apache.xmlbeans.XmlInteger numAlignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMALIGNMENTS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMALIGNMENTS$0);
                }
                target.set(numAlignments);
            }
        }
        
        /**
         * Gets the "seq-locs" element
         */
        public gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs getSeqLocs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs)get_store().find_element_user(SEQLOCS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "seq-locs" element
         */
        public void setSeqLocs(gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs seqLocs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs)get_store().find_element_user(SEQLOCS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs)get_store().add_element_user(SEQLOCS$2);
                }
                target.set(seqLocs);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-locs" element
         */
        public gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs addNewSeqLocs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs)get_store().add_element_user(SEQLOCS$2);
                return target;
            }
        }
        /**
         * An XML seq-locs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqLocsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments.SeqLocs
        {
            
            public SeqLocsImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
