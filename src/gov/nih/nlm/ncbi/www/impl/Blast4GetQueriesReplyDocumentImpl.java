/*
 * An XML document type.
 * Localname: Blast4-get-queries-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-queries-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetQueriesReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument
{
    
    public Blast4GetQueriesReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETQUERIESREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-queries-reply");
    
    
    /**
     * Gets the "Blast4-get-queries-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply getBlast4GetQueriesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().find_element_user(BLAST4GETQUERIESREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-queries-reply" element
     */
    public void setBlast4GetQueriesReply(gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply blast4GetQueriesReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().find_element_user(BLAST4GETQUERIESREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().add_element_user(BLAST4GETQUERIESREPLY$0);
            }
            target.set(blast4GetQueriesReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-queries-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply addNewBlast4GetQueriesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().add_element_user(BLAST4GETQUERIESREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-queries-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetQueriesReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply
    {
        
        public Blast4GetQueriesReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERIES$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "queries");
        
        
        /**
         * Gets the "queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries getQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries)get_store().find_element_user(QUERIES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "queries" element
         */
        public void setQueries(gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries queries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries)get_store().find_element_user(QUERIES$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries)get_store().add_element_user(QUERIES$0);
                }
                target.set(queries);
            }
        }
        
        /**
         * Appends and returns a new empty "queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries addNewQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries)get_store().add_element_user(QUERIES$0);
                return target;
            }
        }
        /**
         * An XML queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply.Queries
        {
            
            public QueriesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4QUERIES$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queries");
            
            
            /**
             * Gets the "Blast4-queries" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries getBlast4Queries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().find_element_user(BLAST4QUERIES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-queries" element
             */
            public void setBlast4Queries(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries blast4Queries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().find_element_user(BLAST4QUERIES$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().add_element_user(BLAST4QUERIES$0);
                    }
                    target.set(blast4Queries);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-queries" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries addNewBlast4Queries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().add_element_user(BLAST4QUERIES$0);
                    return target;
                }
            }
        }
    }
}
