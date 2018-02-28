/*
 * An XML document type.
 * Localname: Blast4-get-matrices-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-matrices-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetMatricesReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument
{
    
    public Blast4GetMatricesReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETMATRICESREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-matrices-reply");
    
    
    /**
     * Gets the "Blast4-get-matrices-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply getBlast4GetMatricesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().find_element_user(BLAST4GETMATRICESREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-matrices-reply" element
     */
    public void setBlast4GetMatricesReply(gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply blast4GetMatricesReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().find_element_user(BLAST4GETMATRICESREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().add_element_user(BLAST4GETMATRICESREPLY$0);
            }
            target.set(blast4GetMatricesReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-matrices-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply addNewBlast4GetMatricesReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().add_element_user(BLAST4GETMATRICESREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-matrices-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetMatricesReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply
    {
        
        public Blast4GetMatricesReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4MATRIXID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-matrix-id");
        
        
        /**
         * Gets array of all "Blast4-matrix-id" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId[] getBlast4MatrixIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4MATRIXID$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId[] result = new gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-matrix-id" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId getBlast4MatrixIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().find_element_user(BLAST4MATRIXID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-matrix-id" element
         */
        public int sizeOfBlast4MatrixIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4MATRIXID$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-matrix-id" element
         */
        public void setBlast4MatrixIdArray(gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId[] blast4MatrixIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4MatrixIdArray, BLAST4MATRIXID$0);
            }
        }
        
        /**
         * Sets ith "Blast4-matrix-id" element
         */
        public void setBlast4MatrixIdArray(int i, gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId blast4MatrixId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().find_element_user(BLAST4MATRIXID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4MatrixId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-matrix-id" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId insertNewBlast4MatrixId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().insert_element_user(BLAST4MATRIXID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-matrix-id" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId addNewBlast4MatrixId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().add_element_user(BLAST4MATRIXID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-matrix-id" element
         */
        public void removeBlast4MatrixId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4MATRIXID$0, i);
            }
        }
    }
}
