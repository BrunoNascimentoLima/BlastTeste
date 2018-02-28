/*
 * An XML document type.
 * Localname: ArticleIdSet
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ArticleIdSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one ArticleIdSet(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ArticleIdSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdSetDocument
{
    
    public ArticleIdSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTICLEIDSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ArticleIdSet");
    
    
    /**
     * Gets the "ArticleIdSet" element
     */
    public gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet getArticleIdSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet target = null;
            target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().find_element_user(ARTICLEIDSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArticleIdSet" element
     */
    public void setArticleIdSet(gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet articleIdSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet target = null;
            target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().find_element_user(ARTICLEIDSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().add_element_user(ARTICLEIDSET$0);
            }
            target.set(articleIdSet);
        }
    }
    
    /**
     * Appends and returns a new empty "ArticleIdSet" element
     */
    public gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet addNewArticleIdSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet target = null;
            target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().add_element_user(ARTICLEIDSET$0);
            return target;
        }
    }
    /**
     * An XML ArticleIdSet(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ArticleIdSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet
    {
        
        public ArticleIdSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARTICLEID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ArticleId");
        
        
        /**
         * Gets array of all "ArticleId" elements
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId[] getArticleIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ARTICLEID$0, targetList);
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId[] result = new gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ArticleId" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId getArticleIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().find_element_user(ARTICLEID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ArticleId" element
         */
        public int sizeOfArticleIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARTICLEID$0);
            }
        }
        
        /**
         * Sets array of all "ArticleId" element
         */
        public void setArticleIdArray(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId[] articleIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(articleIdArray, ARTICLEID$0);
            }
        }
        
        /**
         * Sets ith "ArticleId" element
         */
        public void setArticleIdArray(int i, gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId articleId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().find_element_user(ARTICLEID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(articleId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ArticleId" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId insertNewArticleId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().insert_element_user(ARTICLEID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ArticleId" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId addNewArticleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().add_element_user(ARTICLEID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ArticleId" element
         */
        public void removeArticleId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARTICLEID$0, i);
            }
        }
    }
}
