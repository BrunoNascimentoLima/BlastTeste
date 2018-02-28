/*
 * An XML document type.
 * Localname: Blast4-get-request-info-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-request-info-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetRequestInfoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument
{
    
    public Blast4GetRequestInfoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETREQUESTINFOREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-request-info-request");
    
    
    /**
     * Gets the "Blast4-get-request-info-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest getBlast4GetRequestInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().find_element_user(BLAST4GETREQUESTINFOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-request-info-request" element
     */
    public void setBlast4GetRequestInfoRequest(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest blast4GetRequestInfoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().find_element_user(BLAST4GETREQUESTINFOREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().add_element_user(BLAST4GETREQUESTINFOREQUEST$0);
            }
            target.set(blast4GetRequestInfoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-request-info-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest addNewBlast4GetRequestInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().add_element_user(BLAST4GETREQUESTINFOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-request-info-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetRequestInfoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest
    {
        
        public Blast4GetRequestInfoRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
