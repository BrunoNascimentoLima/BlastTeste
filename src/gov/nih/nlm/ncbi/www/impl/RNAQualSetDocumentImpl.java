/*
 * An XML document type.
 * Localname: RNA-qual-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RNAQualSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one RNA-qual-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class RNAQualSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNAQualSetDocument
{
    
    public RNAQualSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RNAQUALSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-qual-set");
    
    
    /**
     * Gets the "RNA-qual-set" element
     */
    public gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet getRNAQualSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet target = null;
            target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().find_element_user(RNAQUALSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RNA-qual-set" element
     */
    public void setRNAQualSet(gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet rnaQualSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet target = null;
            target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().find_element_user(RNAQUALSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().add_element_user(RNAQUALSET$0);
            }
            target.set(rnaQualSet);
        }
    }
    
    /**
     * Appends and returns a new empty "RNA-qual-set" element
     */
    public gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet addNewRNAQualSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet target = null;
            target = (gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet)get_store().add_element_user(RNAQUALSET$0);
            return target;
        }
    }
    /**
     * An XML RNA-qual-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class RNAQualSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNAQualSetDocument.RNAQualSet
    {
        
        public RNAQualSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RNAQUAL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-qual");
        
        
        /**
         * Gets array of all "RNA-qual" elements
         */
        public gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual[] getRNAQualArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RNAQUAL$0, targetList);
                gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual[] result = new gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RNA-qual" element
         */
        public gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual getRNAQualArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual target = null;
                target = (gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual)get_store().find_element_user(RNAQUAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RNA-qual" element
         */
        public int sizeOfRNAQualArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RNAQUAL$0);
            }
        }
        
        /**
         * Sets array of all "RNA-qual" element
         */
        public void setRNAQualArray(gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual[] rnaQualArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rnaQualArray, RNAQUAL$0);
            }
        }
        
        /**
         * Sets ith "RNA-qual" element
         */
        public void setRNAQualArray(int i, gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual rnaQual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual target = null;
                target = (gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual)get_store().find_element_user(RNAQUAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(rnaQual);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RNA-qual" element
         */
        public gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual insertNewRNAQual(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual target = null;
                target = (gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual)get_store().insert_element_user(RNAQUAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RNA-qual" element
         */
        public gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual addNewRNAQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual target = null;
                target = (gov.nih.nlm.ncbi.www.RNAQualDocument.RNAQual)get_store().add_element_user(RNAQUAL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "RNA-qual" element
         */
        public void removeRNAQual(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RNAQUAL$0, i);
            }
        }
    }
}
