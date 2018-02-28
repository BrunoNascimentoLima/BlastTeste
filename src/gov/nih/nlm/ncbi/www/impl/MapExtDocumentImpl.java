/*
 * An XML document type.
 * Localname: Map-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MapExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Map-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MapExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MapExtDocument
{
    
    public MapExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Map-ext");
    
    
    /**
     * Gets the "Map-ext" element
     */
    public gov.nih.nlm.ncbi.www.MapExtDocument.MapExt getMapExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MapExtDocument.MapExt target = null;
            target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().find_element_user(MAPEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Map-ext" element
     */
    public void setMapExt(gov.nih.nlm.ncbi.www.MapExtDocument.MapExt mapExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MapExtDocument.MapExt target = null;
            target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().find_element_user(MAPEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().add_element_user(MAPEXT$0);
            }
            target.set(mapExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Map-ext" element
     */
    public gov.nih.nlm.ncbi.www.MapExtDocument.MapExt addNewMapExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MapExtDocument.MapExt target = null;
            target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().add_element_user(MAPEXT$0);
            return target;
        }
    }
    /**
     * An XML Map-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MapExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MapExtDocument.MapExt
    {
        
        public MapExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQFEAT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-feat");
        
        
        /**
         * Gets array of all "Seq-feat" elements
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] getSeqFeatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SEQFEAT$0, targetList);
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] result = new gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Seq-feat" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat getSeqFeatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().find_element_user(SEQFEAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Seq-feat" element
         */
        public int sizeOfSeqFeatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQFEAT$0);
            }
        }
        
        /**
         * Sets array of all "Seq-feat" element
         */
        public void setSeqFeatArray(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] seqFeatArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(seqFeatArray, SEQFEAT$0);
            }
        }
        
        /**
         * Sets ith "Seq-feat" element
         */
        public void setSeqFeatArray(int i, gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat seqFeat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().find_element_user(SEQFEAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(seqFeat);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Seq-feat" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat insertNewSeqFeat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().insert_element_user(SEQFEAT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Seq-feat" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat addNewSeqFeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().add_element_user(SEQFEAT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Seq-feat" element
         */
        public void removeSeqFeat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQFEAT$0, i);
            }
        }
    }
}
