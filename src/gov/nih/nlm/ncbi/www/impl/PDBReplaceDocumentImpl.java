/*
 * An XML document type.
 * Localname: PDB-replace
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PDBReplaceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PDB-replace(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PDBReplaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBReplaceDocument
{
    
    public PDBReplaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDBREPLACE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-replace");
    
    
    /**
     * Gets the "PDB-replace" element
     */
    public gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace getPDBReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace target = null;
            target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().find_element_user(PDBREPLACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDB-replace" element
     */
    public void setPDBReplace(gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace pdbReplace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace target = null;
            target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().find_element_user(PDBREPLACE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().add_element_user(PDBREPLACE$0);
            }
            target.set(pdbReplace);
        }
    }
    
    /**
     * Appends and returns a new empty "PDB-replace" element
     */
    public gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace addNewPDBReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace target = null;
            target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().add_element_user(PDBREPLACE$0);
            return target;
        }
    }
    /**
     * An XML PDB-replace(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PDBReplaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace
    {
        
        public PDBReplaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName IDS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date)get_store().add_element_user(DATE$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "ids" elements
         */
        public java.lang.String[] getIdsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDS$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ids" element
         */
        public java.lang.String getIdsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ids" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIdsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDS$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ids" element
         */
        public org.apache.xmlbeans.XmlString xgetIdsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "ids" element
         */
        public int sizeOfIdsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDS$2);
            }
        }
        
        /**
         * Sets array of all "ids" element
         */
        public void setIdsArray(java.lang.String[] idsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idsArray, IDS$2);
            }
        }
        
        /**
         * Sets ith "ids" element
         */
        public void setIdsArray(int i, java.lang.String ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(ids);
            }
        }
        
        /**
         * Sets (as xml) array of all "ids" element
         */
        public void xsetIdsArray(org.apache.xmlbeans.XmlString[]idsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idsArray, IDS$2);
            }
        }
        
        /**
         * Sets (as xml) ith "ids" element
         */
        public void xsetIdsArray(int i, org.apache.xmlbeans.XmlString ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ids);
            }
        }
        
        /**
         * Inserts the value as the ith "ids" element
         */
        public void insertIds(int i, java.lang.String ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDS$2, i);
                target.setStringValue(ids);
            }
        }
        
        /**
         * Appends the value as the last "ids" element
         */
        public void addIds(java.lang.String ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDS$2);
                target.setStringValue(ids);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ids" element
         */
        public org.apache.xmlbeans.XmlString insertNewIds(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ids" element
         */
        public org.apache.xmlbeans.XmlString addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ids" element
         */
        public void removeIds(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDS$2, i);
            }
        }
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date
        {
            
            public DateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
    }
}
