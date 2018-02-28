/*
 * An XML document type.
 * Localname: Blast4-get-parameters-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-parameters-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetParametersReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument
{
    
    public Blast4GetParametersReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETPARAMETERSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-parameters-reply");
    
    
    /**
     * Gets the "Blast4-get-parameters-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply getBlast4GetParametersReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().find_element_user(BLAST4GETPARAMETERSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-parameters-reply" element
     */
    public void setBlast4GetParametersReply(gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply blast4GetParametersReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().find_element_user(BLAST4GETPARAMETERSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().add_element_user(BLAST4GETPARAMETERSREPLY$0);
            }
            target.set(blast4GetParametersReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-parameters-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply addNewBlast4GetParametersReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().add_element_user(BLAST4GETPARAMETERSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-parameters-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetParametersReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply
    {
        
        public Blast4GetParametersReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4PARAMETERINFO$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameter-info");
        
        
        /**
         * Gets array of all "Blast4-parameter-info" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo[] getBlast4ParameterInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4PARAMETERINFO$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo[] result = new gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-parameter-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo getBlast4ParameterInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo)get_store().find_element_user(BLAST4PARAMETERINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-parameter-info" element
         */
        public int sizeOfBlast4ParameterInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4PARAMETERINFO$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-parameter-info" element
         */
        public void setBlast4ParameterInfoArray(gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo[] blast4ParameterInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4ParameterInfoArray, BLAST4PARAMETERINFO$0);
            }
        }
        
        /**
         * Sets ith "Blast4-parameter-info" element
         */
        public void setBlast4ParameterInfoArray(int i, gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo blast4ParameterInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo)get_store().find_element_user(BLAST4PARAMETERINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4ParameterInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-parameter-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo insertNewBlast4ParameterInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo)get_store().insert_element_user(BLAST4PARAMETERINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-parameter-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo addNewBlast4ParameterInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterInfoDocument.Blast4ParameterInfo)get_store().add_element_user(BLAST4PARAMETERINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-parameter-info" element
         */
        public void removeBlast4ParameterInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4PARAMETERINFO$0, i);
            }
        }
    }
}
