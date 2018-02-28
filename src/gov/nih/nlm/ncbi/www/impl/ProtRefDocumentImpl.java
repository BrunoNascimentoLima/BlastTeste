/*
 * An XML document type.
 * Localname: Prot-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ProtRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Prot-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ProtRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProtRefDocument
{
    
    public ProtRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Prot-ref");
    
    
    /**
     * Gets the "Prot-ref" element
     */
    public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef getProtRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
            target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().find_element_user(PROTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Prot-ref" element
     */
    public void setProtRef(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef protRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
            target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().find_element_user(PROTREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().add_element_user(PROTREF$0);
            }
            target.set(protRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Prot-ref" element
     */
    public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef addNewProtRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
            target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().add_element_user(PROTREF$0);
            return target;
        }
    }
    /**
     * An XML Prot-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ProtRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef
    {
        
        public ProtRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName DESC$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "desc");
        private static final javax.xml.namespace.QName EC$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ec");
        private static final javax.xml.namespace.QName ACTIVITY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "activity");
        private static final javax.xml.namespace.QName DB$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        private static final javax.xml.namespace.QName PROCESSED$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "processed");
        
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$0, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
        
        /**
         * Gets the "desc" element
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" element
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "desc" element
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESC$2) != 0;
            }
        }
        
        /**
         * Sets the "desc" element
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESC$2);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" element
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESC$2);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" element
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESC$2, 0);
            }
        }
        
        /**
         * Gets array of all "ec" elements
         */
        public java.lang.String[] getEcArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EC$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ec" element
         */
        public java.lang.String getEcArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EC$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ec" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetEcArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EC$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ec" element
         */
        public org.apache.xmlbeans.XmlString xgetEcArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EC$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "ec" element
         */
        public int sizeOfEcArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EC$4);
            }
        }
        
        /**
         * Sets array of all "ec" element
         */
        public void setEcArray(java.lang.String[] ecArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ecArray, EC$4);
            }
        }
        
        /**
         * Sets ith "ec" element
         */
        public void setEcArray(int i, java.lang.String ec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EC$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(ec);
            }
        }
        
        /**
         * Sets (as xml) array of all "ec" element
         */
        public void xsetEcArray(org.apache.xmlbeans.XmlString[]ecArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ecArray, EC$4);
            }
        }
        
        /**
         * Sets (as xml) ith "ec" element
         */
        public void xsetEcArray(int i, org.apache.xmlbeans.XmlString ec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EC$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ec);
            }
        }
        
        /**
         * Inserts the value as the ith "ec" element
         */
        public void insertEc(int i, java.lang.String ec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EC$4, i);
                target.setStringValue(ec);
            }
        }
        
        /**
         * Appends the value as the last "ec" element
         */
        public void addEc(java.lang.String ec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EC$4);
                target.setStringValue(ec);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ec" element
         */
        public org.apache.xmlbeans.XmlString insertNewEc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EC$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ec" element
         */
        public org.apache.xmlbeans.XmlString addNewEc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EC$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "ec" element
         */
        public void removeEc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EC$4, i);
            }
        }
        
        /**
         * Gets array of all "activity" elements
         */
        public java.lang.String[] getActivityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACTIVITY$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "activity" element
         */
        public java.lang.String getActivityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "activity" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetActivityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACTIVITY$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "activity" element
         */
        public org.apache.xmlbeans.XmlString xgetActivityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "activity" element
         */
        public int sizeOfActivityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIVITY$6);
            }
        }
        
        /**
         * Sets array of all "activity" element
         */
        public void setActivityArray(java.lang.String[] activityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(activityArray, ACTIVITY$6);
            }
        }
        
        /**
         * Sets ith "activity" element
         */
        public void setActivityArray(int i, java.lang.String activity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(activity);
            }
        }
        
        /**
         * Sets (as xml) array of all "activity" element
         */
        public void xsetActivityArray(org.apache.xmlbeans.XmlString[]activityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(activityArray, ACTIVITY$6);
            }
        }
        
        /**
         * Sets (as xml) ith "activity" element
         */
        public void xsetActivityArray(int i, org.apache.xmlbeans.XmlString activity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(activity);
            }
        }
        
        /**
         * Inserts the value as the ith "activity" element
         */
        public void insertActivity(int i, java.lang.String activity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ACTIVITY$6, i);
                target.setStringValue(activity);
            }
        }
        
        /**
         * Appends the value as the last "activity" element
         */
        public void addActivity(java.lang.String activity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITY$6);
                target.setStringValue(activity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "activity" element
         */
        public org.apache.xmlbeans.XmlString insertNewActivity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ACTIVITY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "activity" element
         */
        public org.apache.xmlbeans.XmlString addNewActivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "activity" element
         */
        public void removeActivity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIVITY$6, i);
            }
        }
        
        /**
         * Gets the "db" element
         */
        public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db)get_store().find_element_user(DB$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "db" element
         */
        public boolean isSetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DB$8) != 0;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db)get_store().find_element_user(DB$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db)get_store().add_element_user(DB$8);
                }
                target.set(db);
            }
        }
        
        /**
         * Appends and returns a new empty "db" element
         */
        public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db addNewDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db)get_store().add_element_user(DB$8);
                return target;
            }
        }
        
        /**
         * Unsets the "db" element
         */
        public void unsetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DB$8, 0);
            }
        }
        
        /**
         * Gets the "processed" element
         */
        public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed getProcessed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed target = null;
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed)get_store().find_element_user(PROCESSED$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "processed" element
         */
        public boolean isSetProcessed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCESSED$10) != 0;
            }
        }
        
        /**
         * Sets the "processed" element
         */
        public void setProcessed(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed processed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed target = null;
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed)get_store().find_element_user(PROCESSED$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed)get_store().add_element_user(PROCESSED$10);
                }
                target.set(processed);
            }
        }
        
        /**
         * Appends and returns a new empty "processed" element
         */
        public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed addNewProcessed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed target = null;
                target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed)get_store().add_element_user(PROCESSED$10);
                return target;
            }
        }
        
        /**
         * Unsets the "processed" element
         */
        public void unsetProcessed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCESSED$10, 0);
            }
        }
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db
        {
            
            public DbImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets array of all "Dbtag" elements
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DBTAG$0, targetList);
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Dbtag" element
             */
            public int sizeOfDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DBTAG$0);
                }
            }
            
            /**
             * Sets array of all "Dbtag" element
             */
            public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dbtagArray, DBTAG$0);
                }
            }
            
            /**
             * Sets ith "Dbtag" element
             */
            public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Dbtag" element
             */
            public void removeDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DBTAG$0, i);
                }
            }
        }
        /**
         * An XML processed(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProcessedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed
        {
            
            public ProcessedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ProtRefDocument$ProtRef$Processed$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
