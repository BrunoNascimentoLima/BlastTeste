/*
 * An XML document type.
 * Localname: Blast4-get-paramsets-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-paramsets-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetParamsetsReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument
{
    
    public Blast4GetParamsetsReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETPARAMSETSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-paramsets-reply");
    
    
    /**
     * Gets the "Blast4-get-paramsets-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply getBlast4GetParamsetsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().find_element_user(BLAST4GETPARAMSETSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-paramsets-reply" element
     */
    public void setBlast4GetParamsetsReply(gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply blast4GetParamsetsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().find_element_user(BLAST4GETPARAMSETSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().add_element_user(BLAST4GETPARAMSETSREPLY$0);
            }
            target.set(blast4GetParamsetsReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-paramsets-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply addNewBlast4GetParamsetsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().add_element_user(BLAST4GETPARAMSETSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-paramsets-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetParamsetsReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply
    {
        
        public Blast4GetParamsetsReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4TASKINFO$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-task-info");
        
        
        /**
         * Gets array of all "Blast4-task-info" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo[] getBlast4TaskInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4TASKINFO$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo[] result = new gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-task-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo getBlast4TaskInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().find_element_user(BLAST4TASKINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-task-info" element
         */
        public int sizeOfBlast4TaskInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4TASKINFO$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-task-info" element
         */
        public void setBlast4TaskInfoArray(gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo[] blast4TaskInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4TaskInfoArray, BLAST4TASKINFO$0);
            }
        }
        
        /**
         * Sets ith "Blast4-task-info" element
         */
        public void setBlast4TaskInfoArray(int i, gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo blast4TaskInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().find_element_user(BLAST4TASKINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4TaskInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-task-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo insertNewBlast4TaskInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().insert_element_user(BLAST4TASKINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-task-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo addNewBlast4TaskInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().add_element_user(BLAST4TASKINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-task-info" element
         */
        public void removeBlast4TaskInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4TASKINFO$0, i);
            }
        }
    }
}
