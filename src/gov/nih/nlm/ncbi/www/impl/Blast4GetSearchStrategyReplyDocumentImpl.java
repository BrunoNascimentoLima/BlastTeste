/*
 * An XML document type.
 * Localname: Blast4-get-search-strategy-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-search-strategy-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSearchStrategyReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument
{
    
    public Blast4GetSearchStrategyReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEARCHSTRATEGYREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-strategy-reply");
    
    
    /**
     * Gets the "Blast4-get-search-strategy-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply getBlast4GetSearchStrategyReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply)get_store().find_element_user(BLAST4GETSEARCHSTRATEGYREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-search-strategy-reply" element
     */
    public void setBlast4GetSearchStrategyReply(gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply blast4GetSearchStrategyReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply)get_store().find_element_user(BLAST4GETSEARCHSTRATEGYREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply)get_store().add_element_user(BLAST4GETSEARCHSTRATEGYREPLY$0);
            }
            target.set(blast4GetSearchStrategyReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-search-strategy-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply addNewBlast4GetSearchStrategyReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply)get_store().add_element_user(BLAST4GETSEARCHSTRATEGYREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-search-strategy-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSearchStrategyReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument.Blast4GetSearchStrategyReply
    {
        
        public Blast4GetSearchStrategyReplyImpl(org.apache.xmlbeans.SchemaType sType)
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
}
