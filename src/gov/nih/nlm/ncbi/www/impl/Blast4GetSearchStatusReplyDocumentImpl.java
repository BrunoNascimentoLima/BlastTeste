/*
 * An XML document type.
 * Localname: Blast4-get-search-status-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-search-status-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSearchStatusReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument
{
    
    public Blast4GetSearchStatusReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEARCHSTATUSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-status-reply");
    
    
    /**
     * Gets the "Blast4-get-search-status-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply getBlast4GetSearchStatusReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply)get_store().find_element_user(BLAST4GETSEARCHSTATUSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-search-status-reply" element
     */
    public void setBlast4GetSearchStatusReply(gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply blast4GetSearchStatusReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply)get_store().find_element_user(BLAST4GETSEARCHSTATUSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply)get_store().add_element_user(BLAST4GETSEARCHSTATUSREPLY$0);
            }
            target.set(blast4GetSearchStatusReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-search-status-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply addNewBlast4GetSearchStatusReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply)get_store().add_element_user(BLAST4GETSEARCHSTATUSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-search-status-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSearchStatusReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument.Blast4GetSearchStatusReply
    {
        
        public Blast4GetSearchStatusReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "status");
        
        
        /**
         * Gets the "status" element
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" element
         */
        public org.apache.xmlbeans.XmlString xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" element
         */
        public void xsetStatus(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
    }
}
