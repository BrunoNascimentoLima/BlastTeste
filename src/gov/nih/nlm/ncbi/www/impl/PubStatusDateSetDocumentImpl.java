/*
 * An XML document type.
 * Localname: PubStatusDateSet
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubStatusDateSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PubStatusDateSet(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubStatusDateSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDateSetDocument
{
    
    public PubStatusDateSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBSTATUSDATESET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatusDateSet");
    
    
    /**
     * Gets the "PubStatusDateSet" element
     */
    public gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet getPubStatusDateSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().find_element_user(PUBSTATUSDATESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PubStatusDateSet" element
     */
    public void setPubStatusDateSet(gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet pubStatusDateSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().find_element_user(PUBSTATUSDATESET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().add_element_user(PUBSTATUSDATESET$0);
            }
            target.set(pubStatusDateSet);
        }
    }
    
    /**
     * Appends and returns a new empty "PubStatusDateSet" element
     */
    public gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet addNewPubStatusDateSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().add_element_user(PUBSTATUSDATESET$0);
            return target;
        }
    }
    /**
     * An XML PubStatusDateSet(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PubStatusDateSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet
    {
        
        public PubStatusDateSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUBSTATUSDATE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatusDate");
        
        
        /**
         * Gets array of all "PubStatusDate" elements
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate[] getPubStatusDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PUBSTATUSDATE$0, targetList);
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate[] result = new gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PubStatusDate" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate getPubStatusDateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().find_element_user(PUBSTATUSDATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PubStatusDate" element
         */
        public int sizeOfPubStatusDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBSTATUSDATE$0);
            }
        }
        
        /**
         * Sets array of all "PubStatusDate" element
         */
        public void setPubStatusDateArray(gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate[] pubStatusDateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pubStatusDateArray, PUBSTATUSDATE$0);
            }
        }
        
        /**
         * Sets ith "PubStatusDate" element
         */
        public void setPubStatusDateArray(int i, gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate pubStatusDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().find_element_user(PUBSTATUSDATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pubStatusDate);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PubStatusDate" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate insertNewPubStatusDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().insert_element_user(PUBSTATUSDATE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PubStatusDate" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate addNewPubStatusDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().add_element_user(PUBSTATUSDATE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PubStatusDate" element
         */
        public void removePubStatusDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBSTATUSDATE$0, i);
            }
        }
    }
}
