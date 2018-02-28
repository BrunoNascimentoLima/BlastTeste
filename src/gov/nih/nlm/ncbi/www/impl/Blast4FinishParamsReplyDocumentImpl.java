/*
 * An XML document type.
 * Localname: Blast4-finish-params-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-finish-params-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4FinishParamsReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument
{
    
    public Blast4FinishParamsReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4FINISHPARAMSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-finish-params-reply");
    
    
    /**
     * Gets the "Blast4-finish-params-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply getBlast4FinishParamsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().find_element_user(BLAST4FINISHPARAMSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-finish-params-reply" element
     */
    public void setBlast4FinishParamsReply(gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply blast4FinishParamsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().find_element_user(BLAST4FINISHPARAMSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().add_element_user(BLAST4FINISHPARAMSREPLY$0);
            }
            target.set(blast4FinishParamsReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-finish-params-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply addNewBlast4FinishParamsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().add_element_user(BLAST4FINISHPARAMSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-finish-params-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4FinishParamsReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply
    {
        
        public Blast4FinishParamsReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4PARAMETERS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameters");
        
        
        /**
         * Gets the "Blast4-parameters" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Blast4-parameters" element
         */
        public void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                }
                target.set(blast4Parameters);
            }
        }
        
        /**
         * Appends and returns a new empty "Blast4-parameters" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                return target;
            }
        }
    }
}
