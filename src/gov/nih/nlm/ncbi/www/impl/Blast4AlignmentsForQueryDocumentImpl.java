/*
 * An XML document type.
 * Localname: Blast4-alignments-for-query
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-alignments-for-query(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4AlignmentsForQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument
{
    
    public Blast4AlignmentsForQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4ALIGNMENTSFORQUERY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-alignments-for-query");
    
    
    /**
     * Gets the "Blast4-alignments-for-query" element
     */
    public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery getBlast4AlignmentsForQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().find_element_user(BLAST4ALIGNMENTSFORQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-alignments-for-query" element
     */
    public void setBlast4AlignmentsForQuery(gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery blast4AlignmentsForQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().find_element_user(BLAST4ALIGNMENTSFORQUERY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery)get_store().add_element_user(BLAST4ALIGNMENTSFORQUERY$0);
            }
            target.set(blast4AlignmentsForQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-alignments-for-query" element
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
     * An XML Blast4-alignments-for-query(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4AlignmentsForQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery
    {
        
        public Blast4AlignmentsForQueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "query-id");
        private static final javax.xml.namespace.QName ALIGNMENTS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "alignments");
        
        
        /**
         * Gets the "query-id" element
         */
        public java.lang.String getQueryId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "query-id" element
         */
        public org.apache.xmlbeans.XmlString xgetQueryId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "query-id" element
         */
        public void setQueryId(java.lang.String queryId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYID$0);
                }
                target.setStringValue(queryId);
            }
        }
        
        /**
         * Sets (as xml) the "query-id" element
         */
        public void xsetQueryId(org.apache.xmlbeans.XmlString queryId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYID$0);
                }
                target.set(queryId);
            }
        }
        
        /**
         * Gets the "alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments getAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments)get_store().find_element_user(ALIGNMENTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "alignments" element
         */
        public void setAlignments(gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments alignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments)get_store().find_element_user(ALIGNMENTS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments)get_store().add_element_user(ALIGNMENTS$2);
                }
                target.set(alignments);
            }
        }
        
        /**
         * Appends and returns a new empty "alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments addNewAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments)get_store().add_element_user(ALIGNMENTS$2);
                return target;
            }
        }
        /**
         * An XML alignments(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlignmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4AlignmentsForQueryDocument.Blast4AlignmentsForQuery.Alignments
        {
            
            public AlignmentsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4SIMPLEALIGNMENT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-simple-alignment");
            
            
            /**
             * Gets array of all "Blast4-simple-alignment" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment[] getBlast4SimpleAlignmentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4SIMPLEALIGNMENT$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment[] result = new gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-simple-alignment" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment getBlast4SimpleAlignmentArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().find_element_user(BLAST4SIMPLEALIGNMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-simple-alignment" element
             */
            public int sizeOfBlast4SimpleAlignmentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4SIMPLEALIGNMENT$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-simple-alignment" element
             */
            public void setBlast4SimpleAlignmentArray(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment[] blast4SimpleAlignmentArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4SimpleAlignmentArray, BLAST4SIMPLEALIGNMENT$0);
                }
            }
            
            /**
             * Sets ith "Blast4-simple-alignment" element
             */
            public void setBlast4SimpleAlignmentArray(int i, gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment blast4SimpleAlignment)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().find_element_user(BLAST4SIMPLEALIGNMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4SimpleAlignment);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-simple-alignment" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment insertNewBlast4SimpleAlignment(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().insert_element_user(BLAST4SIMPLEALIGNMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-simple-alignment" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment addNewBlast4SimpleAlignment()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().add_element_user(BLAST4SIMPLEALIGNMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-simple-alignment" element
             */
            public void removeBlast4SimpleAlignment(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4SIMPLEALIGNMENT$0, i);
                }
            }
        }
    }
}
