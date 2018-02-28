/*
 * An XML document type.
 * Localname: MultiOrgName
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MultiOrgNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one MultiOrgName(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MultiOrgNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MultiOrgNameDocument
{
    
    public MultiOrgNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIORGNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "MultiOrgName");
    
    
    /**
     * Gets the "MultiOrgName" element
     */
    public gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName getMultiOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().find_element_user(MULTIORGNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiOrgName" element
     */
    public void setMultiOrgName(gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName multiOrgName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().find_element_user(MULTIORGNAME$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().add_element_user(MULTIORGNAME$0);
            }
            target.set(multiOrgName);
        }
    }
    
    /**
     * Appends and returns a new empty "MultiOrgName" element
     */
    public gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName addNewMultiOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName target = null;
            target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().add_element_user(MULTIORGNAME$0);
            return target;
        }
    }
    /**
     * An XML MultiOrgName(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MultiOrgNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName
    {
        
        public MultiOrgNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGNAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "OrgName");
        
        
        /**
         * Gets array of all "OrgName" elements
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName[] getOrgNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGNAME$0, targetList);
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName[] result = new gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OrgName" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName getOrgNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().find_element_user(ORGNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OrgName" element
         */
        public int sizeOfOrgNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGNAME$0);
            }
        }
        
        /**
         * Sets array of all "OrgName" element
         */
        public void setOrgNameArray(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName[] orgNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(orgNameArray, ORGNAME$0);
            }
        }
        
        /**
         * Sets ith "OrgName" element
         */
        public void setOrgNameArray(int i, gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName orgName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().find_element_user(ORGNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(orgName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OrgName" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName insertNewOrgName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().insert_element_user(ORGNAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OrgName" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName addNewOrgName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().add_element_user(ORGNAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "OrgName" element
         */
        public void removeOrgName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGNAME$0, i);
            }
        }
    }
}
