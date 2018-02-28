/*
 * An XML document type.
 * Localname: Blast4-simple-results
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-simple-results(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4SimpleResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument
{
    
    public Blast4SimpleResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4SIMPLERESULTS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-simple-results");
    
    
    /**
     * Gets the "Blast4-simple-results" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults getBlast4SimpleResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults)get_store().find_element_user(BLAST4SIMPLERESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-simple-results" element
     */
    public void setBlast4SimpleResults(gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults blast4SimpleResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults)get_store().find_element_user(BLAST4SIMPLERESULTS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults)get_store().add_element_user(BLAST4SIMPLERESULTS$0);
            }
            target.set(blast4SimpleResults);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-simple-results" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults addNewBlast4SimpleResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults)get_store().add_element_user(BLAST4SIMPLERESULTS$0);
            return target;
        }
    }
    /**
     * An XML Blast4-simple-results(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4SimpleResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults
    {
        
        public Blast4SimpleResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALLALIGNMENTS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "all-alignments");
        
        
        /**
         * Gets the "all-alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments getAllAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments)get_store().find_element_user(ALLALIGNMENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "all-alignments" element
         */
        public void setAllAlignments(gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments allAlignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments)get_store().find_element_user(ALLALIGNMENTS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments)get_store().add_element_user(ALLALIGNMENTS$0);
                }
                target.set(allAlignments);
            }
        }
        
        /**
         * Appends and returns a new empty "all-alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments addNewAllAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments)get_store().add_element_user(ALLALIGNMENTS$0);
                return target;
            }
        }
        /**
         * An XML all-alignments(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AllAlignmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults.AllAlignments
        {
            
            public AllAlignmentsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4ALIGNMENTSFORQUERY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-alignments-for-query");
            
            
            /**
             * Gets array of all "Blast4-alignments-for-query" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery[] getBlast4AlignmentsForQueryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4ALIGNMENTSFORQUERY$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery[] result = new gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-alignments-for-query" element
             */
            public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery getBlast4AlignmentsForQueryArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().find_element_user(BLAST4ALIGNMENTSFORQUERY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-alignments-for-query" element
             */
            public int sizeOfBlast4AlignmentsForQueryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4ALIGNMENTSFORQUERY$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-alignments-for-query" element
             */
            public void setBlast4AlignmentsForQueryArray(gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery[] blast4AlignmentsForQueryArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4AlignmentsForQueryArray, BLAST4ALIGNMENTSFORQUERY$0);
                }
            }
            
            /**
             * Sets ith "Blast4-alignments-for-query" element
             */
            public void setBlast4AlignmentsForQueryArray(int i, gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery blast4AlignmentsForQuery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().find_element_user(BLAST4ALIGNMENTSFORQUERY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4AlignmentsForQuery);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-alignments-for-query" element
             */
            public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery insertNewBlast4AlignmentsForQuery(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().insert_element_user(BLAST4ALIGNMENTSFORQUERY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-alignments-for-query" element
             */
            public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery addNewBlast4AlignmentsForQuery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().add_element_user(BLAST4ALIGNMENTSFORQUERY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-alignments-for-query" element
             */
            public void removeBlast4AlignmentsForQuery(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4ALIGNMENTSFORQUERY$0, i);
                }
            }
        }
    }
}
