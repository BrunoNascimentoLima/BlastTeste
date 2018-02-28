/*
 * An XML document type.
 * Localname: EMBL-xref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EMBLXrefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one EMBL-xref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class EMBLXrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLXrefDocument
{
    
    public EMBLXrefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBLXREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EMBL-xref");
    
    
    /**
     * Gets the "EMBL-xref" element
     */
    public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref getEMBLXref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().find_element_user(EMBLXREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EMBL-xref" element
     */
    public void setEMBLXref(gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref emblXref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().find_element_user(EMBLXREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().add_element_user(EMBLXREF$0);
            }
            target.set(emblXref);
        }
    }
    
    /**
     * Appends and returns a new empty "EMBL-xref" element
     */
    public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref addNewEMBLXref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref target = null;
            target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref)get_store().add_element_user(EMBLXREF$0);
            return target;
        }
    }
    /**
     * An XML EMBL-xref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class EMBLXrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref
    {
        
        public EMBLXrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DBNAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dbname");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        
        
        /**
         * Gets the "dbname" element
         */
        public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname getDbname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname)get_store().find_element_user(DBNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "dbname" element
         */
        public void setDbname(gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname dbname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname)get_store().find_element_user(DBNAME$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname)get_store().add_element_user(DBNAME$0);
                }
                target.set(dbname);
            }
        }
        
        /**
         * Appends and returns a new empty "dbname" element
         */
        public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname addNewDbname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname)get_store().add_element_user(DBNAME$0);
                return target;
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id)get_store().add_element_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id target = null;
                target = (gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id)get_store().add_element_user(ID$2);
                return target;
            }
        }
        /**
         * An XML dbname(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbnameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Dbname
        {
            
            public DbnameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EMBLDBNAME$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EMBL-dbname");
            
            
            /**
             * Gets the "EMBL-dbname" element
             */
            public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname getEMBLDbname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().find_element_user(EMBLDBNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EMBL-dbname" element
             */
            public void setEMBLDbname(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname emblDbname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().find_element_user(EMBLDBNAME$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().add_element_user(EMBLDBNAME$0);
                    }
                    target.set(emblDbname);
                }
            }
            
            /**
             * Appends and returns a new empty "EMBL-dbname" element
             */
            public gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname addNewEMBLDbname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname)get_store().add_element_user(EMBLDBNAME$0);
                    return target;
                }
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets array of all "Object-id" elements
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] getObjectIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OBJECTID$0, targetList);
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] result = new gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Object-id" element
             */
            public int sizeOfObjectIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBJECTID$0);
                }
            }
            
            /**
             * Sets array of all "Object-id" element
             */
            public void setObjectIdArray(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] objectIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(objectIdArray, OBJECTID$0);
                }
            }
            
            /**
             * Sets ith "Object-id" element
             */
            public void setObjectIdArray(int i, gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId insertNewObjectId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().insert_element_user(OBJECTID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Object-id" element
             */
            public void removeObjectId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBJECTID$0, i);
                }
            }
        }
    }
}
