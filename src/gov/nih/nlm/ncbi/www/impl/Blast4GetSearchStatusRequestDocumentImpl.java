/*
 * An XML document type.
 * Localname: Blast4-get-search-status-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-search-status-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSearchStatusRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument
{
    
    public Blast4GetSearchStatusRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEARCHSTATUSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-status-request");
    
    
    /**
     * Gets the "Blast4-get-search-status-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest getBlast4GetSearchStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest)get_store().find_element_user(BLAST4GETSEARCHSTATUSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-search-status-request" element
     */
    public void setBlast4GetSearchStatusRequest(gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest blast4GetSearchStatusRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest)get_store().find_element_user(BLAST4GETSEARCHSTATUSREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest)get_store().add_element_user(BLAST4GETSEARCHSTATUSREQUEST$0);
            }
            target.set(blast4GetSearchStatusRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-search-status-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest addNewBlast4GetSearchStatusRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest)get_store().add_element_user(BLAST4GETSEARCHSTATUSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-search-status-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSearchStatusRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStatusRequestDocument.Blast4GetSearchStatusRequest
    {
        
        public Blast4GetSearchStatusRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
