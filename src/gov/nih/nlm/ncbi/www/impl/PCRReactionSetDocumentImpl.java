/*
 * An XML document type.
 * Localname: PCRReactionSet
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRReactionSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PCRReactionSet(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PCRReactionSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRReactionSetDocument
{
    
    public PCRReactionSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCRREACTIONSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRReactionSet");
    
    
    /**
     * Gets the "PCRReactionSet" element
     */
    public gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet getPCRReactionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet target = null;
            target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().find_element_user(PCRREACTIONSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PCRReactionSet" element
     */
    public void setPCRReactionSet(gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet pcrReactionSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet target = null;
            target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().find_element_user(PCRREACTIONSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().add_element_user(PCRREACTIONSET$0);
            }
            target.set(pcrReactionSet);
        }
    }
    
    /**
     * Appends and returns a new empty "PCRReactionSet" element
     */
    public gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet addNewPCRReactionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet target = null;
            target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().add_element_user(PCRREACTIONSET$0);
            return target;
        }
    }
    /**
     * An XML PCRReactionSet(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PCRReactionSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet
    {
        
        public PCRReactionSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PCRREACTION$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRReaction");
        
        
        /**
         * Gets array of all "PCRReaction" elements
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction[] getPCRReactionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PCRREACTION$0, targetList);
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction[] result = new gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PCRReaction" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction getPCRReactionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().find_element_user(PCRREACTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PCRReaction" element
         */
        public int sizeOfPCRReactionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCRREACTION$0);
            }
        }
        
        /**
         * Sets array of all "PCRReaction" element
         */
        public void setPCRReactionArray(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction[] pcrReactionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pcrReactionArray, PCRREACTION$0);
            }
        }
        
        /**
         * Sets ith "PCRReaction" element
         */
        public void setPCRReactionArray(int i, gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction pcrReaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().find_element_user(PCRREACTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pcrReaction);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PCRReaction" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction insertNewPCRReaction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().insert_element_user(PCRREACTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PCRReaction" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction addNewPCRReaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().add_element_user(PCRREACTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PCRReaction" element
         */
        public void removePCRReaction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCRREACTION$0, i);
            }
        }
    }
}
