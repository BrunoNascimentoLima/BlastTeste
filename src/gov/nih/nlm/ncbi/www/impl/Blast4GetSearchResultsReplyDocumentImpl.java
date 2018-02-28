/*
 * An XML document type.
 * Localname: Blast4-get-search-results-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-search-results-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSearchResultsReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument
{
    
    public Blast4GetSearchResultsReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEARCHRESULTSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-results-reply");
    
    
    /**
     * Gets the "Blast4-get-search-results-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply getBlast4GetSearchResultsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().find_element_user(BLAST4GETSEARCHRESULTSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-search-results-reply" element
     */
    public void setBlast4GetSearchResultsReply(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply blast4GetSearchResultsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().find_element_user(BLAST4GETSEARCHRESULTSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().add_element_user(BLAST4GETSEARCHRESULTSREPLY$0);
            }
            target.set(blast4GetSearchResultsReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-search-results-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply addNewBlast4GetSearchResultsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().add_element_user(BLAST4GETSEARCHRESULTSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-search-results-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSearchResultsReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply
    {
        
        public Blast4GetSearchResultsReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALIGNMENTS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "alignments");
        private static final javax.xml.namespace.QName PHIALIGNMENTS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "phi-alignments");
        private static final javax.xml.namespace.QName MASKS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "masks");
        private static final javax.xml.namespace.QName KABLOCKS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ka-blocks");
        private static final javax.xml.namespace.QName SEARCHSTATS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "search-stats");
        private static final javax.xml.namespace.QName PSSM$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pssm");
        private static final javax.xml.namespace.QName SIMPLERESULTS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "simple-results");
        
        
        /**
         * Gets the "alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments getAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments)get_store().find_element_user(ALIGNMENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "alignments" element
         */
        public boolean isSetAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNMENTS$0) != 0;
            }
        }
        
        /**
         * Sets the "alignments" element
         */
        public void setAlignments(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments alignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments)get_store().find_element_user(ALIGNMENTS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments)get_store().add_element_user(ALIGNMENTS$0);
                }
                target.set(alignments);
            }
        }
        
        /**
         * Appends and returns a new empty "alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments addNewAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments)get_store().add_element_user(ALIGNMENTS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "alignments" element
         */
        public void unsetAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNMENTS$0, 0);
            }
        }
        
        /**
         * Gets the "phi-alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments getPhiAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments)get_store().find_element_user(PHIALIGNMENTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "phi-alignments" element
         */
        public boolean isSetPhiAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHIALIGNMENTS$2) != 0;
            }
        }
        
        /**
         * Sets the "phi-alignments" element
         */
        public void setPhiAlignments(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments phiAlignments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments)get_store().find_element_user(PHIALIGNMENTS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments)get_store().add_element_user(PHIALIGNMENTS$2);
                }
                target.set(phiAlignments);
            }
        }
        
        /**
         * Appends and returns a new empty "phi-alignments" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments addNewPhiAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments)get_store().add_element_user(PHIALIGNMENTS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "phi-alignments" element
         */
        public void unsetPhiAlignments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHIALIGNMENTS$2, 0);
            }
        }
        
        /**
         * Gets the "masks" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks getMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks)get_store().find_element_user(MASKS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "masks" element
         */
        public boolean isSetMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MASKS$4) != 0;
            }
        }
        
        /**
         * Sets the "masks" element
         */
        public void setMasks(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks masks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks)get_store().find_element_user(MASKS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks)get_store().add_element_user(MASKS$4);
                }
                target.set(masks);
            }
        }
        
        /**
         * Appends and returns a new empty "masks" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks addNewMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks)get_store().add_element_user(MASKS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "masks" element
         */
        public void unsetMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MASKS$4, 0);
            }
        }
        
        /**
         * Gets the "ka-blocks" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks getKaBlocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks)get_store().find_element_user(KABLOCKS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ka-blocks" element
         */
        public boolean isSetKaBlocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KABLOCKS$6) != 0;
            }
        }
        
        /**
         * Sets the "ka-blocks" element
         */
        public void setKaBlocks(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks kaBlocks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks)get_store().find_element_user(KABLOCKS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks)get_store().add_element_user(KABLOCKS$6);
                }
                target.set(kaBlocks);
            }
        }
        
        /**
         * Appends and returns a new empty "ka-blocks" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks addNewKaBlocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks)get_store().add_element_user(KABLOCKS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "ka-blocks" element
         */
        public void unsetKaBlocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KABLOCKS$6, 0);
            }
        }
        
        /**
         * Gets array of all "search-stats" elements
         */
        public java.lang.String[] getSearchStatsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEARCHSTATS$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "search-stats" element
         */
        public java.lang.String getSearchStatsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHSTATS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "search-stats" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetSearchStatsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEARCHSTATS$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "search-stats" element
         */
        public org.apache.xmlbeans.XmlString xgetSearchStatsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHSTATS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "search-stats" element
         */
        public int sizeOfSearchStatsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEARCHSTATS$8);
            }
        }
        
        /**
         * Sets array of all "search-stats" element
         */
        public void setSearchStatsArray(java.lang.String[] searchStatsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(searchStatsArray, SEARCHSTATS$8);
            }
        }
        
        /**
         * Sets ith "search-stats" element
         */
        public void setSearchStatsArray(int i, java.lang.String searchStats)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHSTATS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(searchStats);
            }
        }
        
        /**
         * Sets (as xml) array of all "search-stats" element
         */
        public void xsetSearchStatsArray(org.apache.xmlbeans.XmlString[]searchStatsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(searchStatsArray, SEARCHSTATS$8);
            }
        }
        
        /**
         * Sets (as xml) ith "search-stats" element
         */
        public void xsetSearchStatsArray(int i, org.apache.xmlbeans.XmlString searchStats)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHSTATS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(searchStats);
            }
        }
        
        /**
         * Inserts the value as the ith "search-stats" element
         */
        public void insertSearchStats(int i, java.lang.String searchStats)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SEARCHSTATS$8, i);
                target.setStringValue(searchStats);
            }
        }
        
        /**
         * Appends the value as the last "search-stats" element
         */
        public void addSearchStats(java.lang.String searchStats)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHSTATS$8);
                target.setStringValue(searchStats);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "search-stats" element
         */
        public org.apache.xmlbeans.XmlString insertNewSearchStats(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SEARCHSTATS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "search-stats" element
         */
        public org.apache.xmlbeans.XmlString addNewSearchStats()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHSTATS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "search-stats" element
         */
        public void removeSearchStats(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEARCHSTATS$8, i);
            }
        }
        
        /**
         * Gets the "pssm" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm getPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm)get_store().find_element_user(PSSM$10, 0);
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
                return get_store().count_elements(PSSM$10) != 0;
            }
        }
        
        /**
         * Sets the "pssm" element
         */
        public void setPssm(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm pssm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm)get_store().find_element_user(PSSM$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm)get_store().add_element_user(PSSM$10);
                }
                target.set(pssm);
            }
        }
        
        /**
         * Appends and returns a new empty "pssm" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm addNewPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm)get_store().add_element_user(PSSM$10);
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
                get_store().remove_element(PSSM$10, 0);
            }
        }
        
        /**
         * Gets the "simple-results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults getSimpleResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults)get_store().find_element_user(SIMPLERESULTS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "simple-results" element
         */
        public boolean isSetSimpleResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIMPLERESULTS$12) != 0;
            }
        }
        
        /**
         * Sets the "simple-results" element
         */
        public void setSimpleResults(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults simpleResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults)get_store().find_element_user(SIMPLERESULTS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults)get_store().add_element_user(SIMPLERESULTS$12);
                }
                target.set(simpleResults);
            }
        }
        
        /**
         * Appends and returns a new empty "simple-results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults addNewSimpleResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults)get_store().add_element_user(SIMPLERESULTS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "simple-results" element
         */
        public void unsetSimpleResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIMPLERESULTS$12, 0);
            }
        }
        /**
         * An XML alignments(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlignmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments
        {
            
            public AlignmentsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQALIGNSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align-set");
            
            
            /**
             * Gets the "Seq-align-set" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet getSeqAlignSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-align-set" element
             */
            public void setSeqAlignSet(gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet seqAlignSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().find_element_user(SEQALIGNSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$0);
                    }
                    target.set(seqAlignSet);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-align-set" element
             */
            public gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet addNewSeqAlignSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet)get_store().add_element_user(SEQALIGNSET$0);
                    return target;
                }
            }
        }
        /**
         * An XML phi-alignments(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PhiAlignmentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments
        {
            
            public PhiAlignmentsImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML masks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MasksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks
        {
            
            public MasksImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4MASK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-mask");
            
            
            /**
             * Gets array of all "Blast4-mask" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] getBlast4MaskArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4MASK$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] result = new gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4MaskArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-mask" element
             */
            public int sizeOfBlast4MaskArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4MASK$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-mask" element
             */
            public void setBlast4MaskArray(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] blast4MaskArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4MaskArray, BLAST4MASK$0);
                }
            }
            
            /**
             * Sets ith "Blast4-mask" element
             */
            public void setBlast4MaskArray(int i, gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4Mask);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask insertNewBlast4Mask(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().insert_element_user(BLAST4MASK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().add_element_user(BLAST4MASK$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-mask" element
             */
            public void removeBlast4Mask(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4MASK$0, i);
                }
            }
        }
        /**
         * An XML ka-blocks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class KaBlocksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks
        {
            
            public KaBlocksImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4KABLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-ka-block");
            
            
            /**
             * Gets array of all "Blast4-ka-block" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock[] getBlast4KaBlockArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4KABLOCK$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock[] result = new gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-ka-block" element
             */
            public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock getBlast4KaBlockArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().find_element_user(BLAST4KABLOCK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-ka-block" element
             */
            public int sizeOfBlast4KaBlockArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4KABLOCK$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-ka-block" element
             */
            public void setBlast4KaBlockArray(gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock[] blast4KaBlockArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4KaBlockArray, BLAST4KABLOCK$0);
                }
            }
            
            /**
             * Sets ith "Blast4-ka-block" element
             */
            public void setBlast4KaBlockArray(int i, gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock blast4KaBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().find_element_user(BLAST4KABLOCK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4KaBlock);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-ka-block" element
             */
            public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock insertNewBlast4KaBlock(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().insert_element_user(BLAST4KABLOCK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-ka-block" element
             */
            public gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock addNewBlast4KaBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock)get_store().add_element_user(BLAST4KABLOCK$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-ka-block" element
             */
            public void removeBlast4KaBlock(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4KABLOCK$0, i);
                }
            }
        }
        /**
         * An XML pssm(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PssmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm
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
         * An XML simple-results(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SimpleResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults
        {
            
            public SimpleResultsImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
