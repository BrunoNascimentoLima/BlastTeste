/*
 * An XML document type.
 * Localname: Blast4-get-search-results-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-search-results-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSearchResultsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument
{
    
    public Blast4GetSearchResultsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEARCHRESULTSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-results-request");
    
    
    /**
     * Gets the "Blast4-get-search-results-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest getBlast4GetSearchResultsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().find_element_user(BLAST4GETSEARCHRESULTSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-search-results-request" element
     */
    public void setBlast4GetSearchResultsRequest(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest blast4GetSearchResultsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().find_element_user(BLAST4GETSEARCHRESULTSREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().add_element_user(BLAST4GETSEARCHRESULTSREQUEST$0);
            }
            target.set(blast4GetSearchResultsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-search-results-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest addNewBlast4GetSearchResultsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().add_element_user(BLAST4GETSEARCHRESULTSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-search-results-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSearchResultsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest
    {
        
        public Blast4GetSearchResultsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "request-id");
        private static final javax.xml.namespace.QName RESULTTYPES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "result-types");
        
        
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
        
        /**
         * Gets the "result-types" element
         */
        public java.math.BigInteger getResultTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTTYPES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-types" element
         */
        public org.apache.xmlbeans.XmlInteger xgetResultTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RESULTTYPES$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "result-types" element
         */
        public boolean isSetResultTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTTYPES$2) != 0;
            }
        }
        
        /**
         * Sets the "result-types" element
         */
        public void setResultTypes(java.math.BigInteger resultTypes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTTYPES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTTYPES$2);
                }
                target.setBigIntegerValue(resultTypes);
            }
        }
        
        /**
         * Sets (as xml) the "result-types" element
         */
        public void xsetResultTypes(org.apache.xmlbeans.XmlInteger resultTypes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RESULTTYPES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(RESULTTYPES$2);
                }
                target.set(resultTypes);
            }
        }
        
        /**
         * Unsets the "result-types" element
         */
        public void unsetResultTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTTYPES$2, 0);
            }
        }
    }
}
