/*
 * An XML document type.
 * Localname: Blast4-archive
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ArchiveDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-archive(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ArchiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ArchiveDocument
{
    
    public Blast4ArchiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4ARCHIVE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-archive");
    
    
    /**
     * Gets the "Blast4-archive" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive getBlast4Archive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive)get_store().find_element_user(BLAST4ARCHIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-archive" element
     */
    public void setBlast4Archive(gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive blast4Archive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive)get_store().find_element_user(BLAST4ARCHIVE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive)get_store().add_element_user(BLAST4ARCHIVE$0);
            }
            target.set(blast4Archive);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-archive" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive addNewBlast4Archive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive)get_store().add_element_user(BLAST4ARCHIVE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-archive(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ArchiveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive
    {
        
        public Blast4ArchiveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "request");
        private static final javax.xml.namespace.QName RESULTS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "results");
        
        
        /**
         * Gets the "request" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request)get_store().add_element_user(REQUEST$0);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Gets the "results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results getResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results)get_store().find_element_user(RESULTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "results" element
         */
        public void setResults(gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results results)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results)get_store().find_element_user(RESULTS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results)get_store().add_element_user(RESULTS$2);
                }
                target.set(results);
            }
        }
        
        /**
         * Appends and returns a new empty "results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results)get_store().add_element_user(RESULTS$2);
                return target;
            }
        }
        /**
         * An XML request(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Request
        {
            
            public RequestImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4REQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-request");
            
            
            /**
             * Gets the "Blast4-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request getBlast4Request()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().find_element_user(BLAST4REQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-request" element
             */
            public void setBlast4Request(gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request blast4Request)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().find_element_user(BLAST4REQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().add_element_user(BLAST4REQUEST$0);
                    }
                    target.set(blast4Request);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request addNewBlast4Request()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().add_element_user(BLAST4REQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML results(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ArchiveDocument.Blast4Archive.Results
        {
            
            public ResultsImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
