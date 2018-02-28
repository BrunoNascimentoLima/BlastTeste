/*
 * An XML document type.
 * Localname: Blast4-get-databases-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-databases-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetDatabasesReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument
{
    
    public Blast4GetDatabasesReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETDATABASESREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-databases-reply");
    
    
    /**
     * Gets the "Blast4-get-databases-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply getBlast4GetDatabasesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().find_element_user(BLAST4GETDATABASESREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-databases-reply" element
     */
    public void setBlast4GetDatabasesReply(gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply blast4GetDatabasesReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().find_element_user(BLAST4GETDATABASESREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().add_element_user(BLAST4GETDATABASESREPLY$0);
            }
            target.set(blast4GetDatabasesReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-databases-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply addNewBlast4GetDatabasesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().add_element_user(BLAST4GETDATABASESREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-databases-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetDatabasesReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply
    {
        
        public Blast4GetDatabasesReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4DATABASEINFO$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-database-info");
        
        
        /**
         * Gets array of all "Blast4-database-info" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo[] getBlast4DatabaseInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4DATABASEINFO$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo[] result = new gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-database-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo getBlast4DatabaseInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().find_element_user(BLAST4DATABASEINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-database-info" element
         */
        public int sizeOfBlast4DatabaseInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4DATABASEINFO$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-database-info" element
         */
        public void setBlast4DatabaseInfoArray(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo[] blast4DatabaseInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4DatabaseInfoArray, BLAST4DATABASEINFO$0);
            }
        }
        
        /**
         * Sets ith "Blast4-database-info" element
         */
        public void setBlast4DatabaseInfoArray(int i, gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo blast4DatabaseInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().find_element_user(BLAST4DATABASEINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4DatabaseInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-database-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo insertNewBlast4DatabaseInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().insert_element_user(BLAST4DATABASEINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-database-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo addNewBlast4DatabaseInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().add_element_user(BLAST4DATABASEINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-database-info" element
         */
        public void removeBlast4DatabaseInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4DATABASEINFO$0, i);
            }
        }
    }
}
