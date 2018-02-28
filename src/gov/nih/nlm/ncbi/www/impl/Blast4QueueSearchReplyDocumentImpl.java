/*
 * An XML document type.
 * Localname: Blast4-queue-search-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-queue-search-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4QueueSearchReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument
{
    
    public Blast4QueueSearchReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4QUEUESEARCHREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queue-search-reply");
    
    
    /**
     * Gets the "Blast4-queue-search-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply getBlast4QueueSearchReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().find_element_user(BLAST4QUEUESEARCHREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-queue-search-reply" element
     */
    public void setBlast4QueueSearchReply(gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply blast4QueueSearchReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().find_element_user(BLAST4QUEUESEARCHREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().add_element_user(BLAST4QUEUESEARCHREPLY$0);
            }
            target.set(blast4QueueSearchReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-queue-search-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply addNewBlast4QueueSearchReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().add_element_user(BLAST4QUEUESEARCHREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-queue-search-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4QueueSearchReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply
    {
        
        public Blast4QueueSearchReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "request-id");
        
        
        /**
         * Gets the "request-id" element
         */
        public java.lang.String getRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "request-id" element
         */
        public org.apache.xmlbeans.XmlString xgetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "request-id" element
         */
        public boolean isSetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$0) != 0;
            }
        }
        
        /**
         * Sets the "request-id" element
         */
        public void setRequestId(java.lang.String requestId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$0);
                }
                target.setStringValue(requestId);
            }
        }
        
        /**
         * Sets (as xml) the "request-id" element
         */
        public void xsetRequestId(org.apache.xmlbeans.XmlString requestId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$0);
                }
                target.set(requestId);
            }
        }
        
        /**
         * Unsets the "request-id" element
         */
        public void unsetRequestId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$0, 0);
            }
        }
    }
}
