/*
 * An XML document type.
 * Localname: Blast4-get-search-strategy-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-search-strategy-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSearchStrategyRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument
{
    
    public Blast4GetSearchStrategyRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEARCHSTRATEGYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-strategy-request");
    
    
    /**
     * Gets the "Blast4-get-search-strategy-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest getBlast4GetSearchStrategyRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest)get_store().find_element_user(BLAST4GETSEARCHSTRATEGYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-search-strategy-request" element
     */
    public void setBlast4GetSearchStrategyRequest(gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest blast4GetSearchStrategyRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest)get_store().find_element_user(BLAST4GETSEARCHSTRATEGYREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest)get_store().add_element_user(BLAST4GETSEARCHSTRATEGYREQUEST$0);
            }
            target.set(blast4GetSearchStrategyRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-search-strategy-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest addNewBlast4GetSearchStrategyRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest)get_store().add_element_user(BLAST4GETSEARCHSTRATEGYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-search-strategy-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSearchStrategyRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyRequestDocument.Blast4GetSearchStrategyRequest
    {
        
        public Blast4GetSearchStrategyRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
