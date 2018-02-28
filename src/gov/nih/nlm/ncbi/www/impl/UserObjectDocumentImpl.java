/*
 * An XML document type.
 * Localname: User-object
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.UserObjectDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one User-object(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class UserObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserObjectDocument
{
    
    public UserObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEROBJECT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
    
    
    /**
     * Gets the "User-object" element
     */
    public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
            target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "User-object" element
     */
    public void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
            target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
            }
            target.set(userObject);
        }
    }
    
    /**
     * Appends and returns a new empty "User-object" element
     */
    public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
            target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
            return target;
        }
    }
    /**
     * An XML User-object(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class UserObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject
    {
        
        public UserObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASS1$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName DATA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        
        
        /**
         * Gets the "class" element
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" element
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "class" element
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASS1$0) != 0;
            }
        }
        
        /**
         * Sets the "class" element
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASS1$0);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" element
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASS1$0);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" element
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASS1$0, 0);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type target = null;
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type target = null;
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type target = null;
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type)get_store().add_element_user(TYPE$2);
                return target;
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data target = null;
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data)get_store().find_element_user(DATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data target = null;
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data)get_store().find_element_user(DATA$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data)get_store().add_element_user(DATA$4);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data target = null;
                target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data)get_store().add_element_user(DATA$4);
                return target;
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets the "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Object-id" element
             */
            public void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Appends and returns a new empty "Object-id" element
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
        }
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USERFIELD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-field");
            
            
            /**
             * Gets array of all "User-field" elements
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] getUserFieldArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(USERFIELD$0, targetList);
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] result = new gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "User-field" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField getUserFieldArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().find_element_user(USERFIELD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "User-field" element
             */
            public int sizeOfUserFieldArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(USERFIELD$0);
                }
            }
            
            /**
             * Sets array of all "User-field" element
             */
            public void setUserFieldArray(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] userFieldArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(userFieldArray, USERFIELD$0);
                }
            }
            
            /**
             * Sets ith "User-field" element
             */
            public void setUserFieldArray(int i, gov.nih.nlm.ncbi.www.UserFieldDocument.UserField userField)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().find_element_user(USERFIELD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(userField);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "User-field" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField insertNewUserField(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().insert_element_user(USERFIELD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "User-field" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField addNewUserField()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().add_element_user(USERFIELD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "User-field" element
             */
            public void removeUserField(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(USERFIELD$0, i);
                }
            }
        }
    }
}
