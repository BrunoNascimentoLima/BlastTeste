/*
 * An XML document type.
 * Localname: Score-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ScoreSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Score-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ScoreSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ScoreSetDocument
{
    
    public ScoreSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCORESET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Score-set");
    
    
    /**
     * Gets the "Score-set" element
     */
    public gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet getScoreSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet target = null;
            target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().find_element_user(SCORESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Score-set" element
     */
    public void setScoreSet(gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet scoreSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet target = null;
            target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().find_element_user(SCORESET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().add_element_user(SCORESET$0);
            }
            target.set(scoreSet);
        }
    }
    
    /**
     * Appends and returns a new empty "Score-set" element
     */
    public gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet addNewScoreSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet target = null;
            target = (gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet)get_store().add_element_user(SCORESET$0);
            return target;
        }
    }
    /**
     * An XML Score-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ScoreSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet
    {
        
        public ScoreSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCORE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Score");
        
        
        /**
         * Gets array of all "Score" elements
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score[] getScoreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCORE$0, targetList);
                gov.nih.nlm.ncbi.www.ScoreDocument.Score[] result = new gov.nih.nlm.ncbi.www.ScoreDocument.Score[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Score" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score getScoreArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Score" element
         */
        public int sizeOfScoreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORE$0);
            }
        }
        
        /**
         * Sets array of all "Score" element
         */
        public void setScoreArray(gov.nih.nlm.ncbi.www.ScoreDocument.Score[] scoreArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(scoreArray, SCORE$0);
            }
        }
        
        /**
         * Sets ith "Score" element
         */
        public void setScoreArray(int i, gov.nih.nlm.ncbi.www.ScoreDocument.Score score)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(score);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Score" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score insertNewScore(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().insert_element_user(SCORE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Score" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score addNewScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().add_element_user(SCORE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Score" element
         */
        public void removeScore(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORE$0, i);
            }
        }
    }
}
