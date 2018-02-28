/*
 * An XML document type.
 * Localname: Blast4-get-programs-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-programs-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetProgramsReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument
{
    
    public Blast4GetProgramsReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETPROGRAMSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-programs-reply");
    
    
    /**
     * Gets the "Blast4-get-programs-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply getBlast4GetProgramsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().find_element_user(BLAST4GETPROGRAMSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-programs-reply" element
     */
    public void setBlast4GetProgramsReply(gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply blast4GetProgramsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().find_element_user(BLAST4GETPROGRAMSREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().add_element_user(BLAST4GETPROGRAMSREPLY$0);
            }
            target.set(blast4GetProgramsReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-programs-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply addNewBlast4GetProgramsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().add_element_user(BLAST4GETPROGRAMSREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-programs-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetProgramsReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply
    {
        
        public Blast4GetProgramsReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4PROGRAMINFO$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-program-info");
        
        
        /**
         * Gets array of all "Blast4-program-info" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo[] getBlast4ProgramInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4PROGRAMINFO$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo[] result = new gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-program-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo getBlast4ProgramInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().find_element_user(BLAST4PROGRAMINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-program-info" element
         */
        public int sizeOfBlast4ProgramInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4PROGRAMINFO$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-program-info" element
         */
        public void setBlast4ProgramInfoArray(gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo[] blast4ProgramInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4ProgramInfoArray, BLAST4PROGRAMINFO$0);
            }
        }
        
        /**
         * Sets ith "Blast4-program-info" element
         */
        public void setBlast4ProgramInfoArray(int i, gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo blast4ProgramInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().find_element_user(BLAST4PROGRAMINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4ProgramInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-program-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo insertNewBlast4ProgramInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().insert_element_user(BLAST4PROGRAMINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-program-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo addNewBlast4ProgramInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().add_element_user(BLAST4PROGRAMINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-program-info" element
         */
        public void removeBlast4ProgramInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4PROGRAMINFO$0, i);
            }
        }
    }
}
