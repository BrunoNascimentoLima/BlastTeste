/*
 * An XML document type.
 * Localname: PartialOrgName
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PartialOrgNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PartialOrgName(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PartialOrgNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PartialOrgNameDocument
{
    
    public PartialOrgNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTIALORGNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PartialOrgName");
    
    
    /**
     * Gets the "PartialOrgName" element
     */
    public gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName getPartialOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().find_element_user(PARTIALORGNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PartialOrgName" element
     */
    public void setPartialOrgName(gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName partialOrgName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().find_element_user(PARTIALORGNAME$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().add_element_user(PARTIALORGNAME$0);
            }
            target.set(partialOrgName);
        }
    }
    
    /**
     * Appends and returns a new empty "PartialOrgName" element
     */
    public gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName addNewPartialOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().add_element_user(PARTIALORGNAME$0);
            return target;
        }
    }
    /**
     * An XML PartialOrgName(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PartialOrgNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName
    {
        
        public PartialOrgNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAXELEMENT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "TaxElement");
        
        
        /**
         * Gets array of all "TaxElement" elements
         */
        public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement[] getTaxElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TAXELEMENT$0, targetList);
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement[] result = new gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TaxElement" element
         */
        public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement getTaxElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().find_element_user(TAXELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TaxElement" element
         */
        public int sizeOfTaxElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXELEMENT$0);
            }
        }
        
        /**
         * Sets array of all "TaxElement" element
         */
        public void setTaxElementArray(gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement[] taxElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taxElementArray, TAXELEMENT$0);
            }
        }
        
        /**
         * Sets ith "TaxElement" element
         */
        public void setTaxElementArray(int i, gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement taxElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().find_element_user(TAXELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(taxElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TaxElement" element
         */
        public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement insertNewTaxElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().insert_element_user(TAXELEMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TaxElement" element
         */
        public gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement addNewTaxElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement target = null;
                target = (gov.nih.nlm.ncbi.www.TaxElementDocument.TaxElement)get_store().add_element_user(TAXELEMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TaxElement" element
         */
        public void removeTaxElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXELEMENT$0, i);
            }
        }
    }
}
