/*
 * An XML document type.
 * Localname: PCRPrimerSet
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRPrimerSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PCRPrimerSet(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PCRPrimerSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerSetDocument
{
    
    public PCRPrimerSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCRPRIMERSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerSet");
    
    
    /**
     * Gets the "PCRPrimerSet" element
     */
    public gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet getPCRPrimerSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
            target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().find_element_user(PCRPRIMERSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PCRPrimerSet" element
     */
    public void setPCRPrimerSet(gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet pcrPrimerSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
            target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().find_element_user(PCRPRIMERSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().add_element_user(PCRPRIMERSET$0);
            }
            target.set(pcrPrimerSet);
        }
    }
    
    /**
     * Appends and returns a new empty "PCRPrimerSet" element
     */
    public gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet addNewPCRPrimerSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
            target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().add_element_user(PCRPRIMERSET$0);
            return target;
        }
    }
    /**
     * An XML PCRPrimerSet(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PCRPrimerSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet
    {
        
        public PCRPrimerSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PCRPRIMER$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimer");
        
        
        /**
         * Gets array of all "PCRPrimer" elements
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer[] getPCRPrimerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PCRPRIMER$0, targetList);
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer[] result = new gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PCRPrimer" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer getPCRPrimerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().find_element_user(PCRPRIMER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PCRPrimer" element
         */
        public int sizeOfPCRPrimerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCRPRIMER$0);
            }
        }
        
        /**
         * Sets array of all "PCRPrimer" element
         */
        public void setPCRPrimerArray(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer[] pcrPrimerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pcrPrimerArray, PCRPRIMER$0);
            }
        }
        
        /**
         * Sets ith "PCRPrimer" element
         */
        public void setPCRPrimerArray(int i, gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer pcrPrimer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().find_element_user(PCRPRIMER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pcrPrimer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PCRPrimer" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer insertNewPCRPrimer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().insert_element_user(PCRPRIMER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PCRPrimer" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer addNewPCRPrimer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().add_element_user(PCRPRIMER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PCRPrimer" element
         */
        public void removePCRPrimer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCRPRIMER$0, i);
            }
        }
    }
}
