/*
 * An XML document type.
 * Localname: User-field
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.UserFieldDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one User-field(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class UserFieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument
{
    
    public UserFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERFIELD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-field");
    
    
    /**
     * Gets the "User-field" element
     */
    public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField getUserField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField target = null;
            target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().find_element_user(USERFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "User-field" element
     */
    public void setUserField(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField userField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField target = null;
            target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().find_element_user(USERFIELD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField)get_store().add_element_user(USERFIELD$0);
            }
            target.set(userField);
        }
    }
    
    /**
     * Appends and returns a new empty "User-field" element
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
     * An XML User-field(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class UserFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField
    {
        
        public UserFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LABEL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "label");
        private static final javax.xml.namespace.QName NUM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num");
        private static final javax.xml.namespace.QName DATA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        
        
        /**
         * Gets the "label" element
         */
        public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label target = null;
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label)get_store().find_element_user(LABEL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "label" element
         */
        public void setLabel(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label target = null;
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label)get_store().find_element_user(LABEL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label)get_store().add_element_user(LABEL$0);
                }
                target.set(label);
            }
        }
        
        /**
         * Appends and returns a new empty "label" element
         */
        public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label addNewLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label target = null;
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label)get_store().add_element_user(LABEL$0);
                return target;
            }
        }
        
        /**
         * Gets the "num" element
         */
        public java.math.BigInteger getNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "num" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUM$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "num" element
         */
        public boolean isSetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUM$2) != 0;
            }
        }
        
        /**
         * Sets the "num" element
         */
        public void setNum(java.math.BigInteger num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUM$2);
                }
                target.setBigIntegerValue(num);
            }
        }
        
        /**
         * Sets (as xml) the "num" element
         */
        public void xsetNum(org.apache.xmlbeans.XmlInteger num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUM$2);
                }
                target.set(num);
            }
        }
        
        /**
         * Unsets the "num" element
         */
        public void unsetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUM$2, 0);
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data target = null;
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data)get_store().find_element_user(DATA$4, 0);
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
        public void setData(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data target = null;
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data)get_store().find_element_user(DATA$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data)get_store().add_element_user(DATA$4);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data target = null;
                target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data)get_store().add_element_user(DATA$4);
                return target;
            }
        }
        /**
         * An XML label(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label
        {
            
            public LabelImpl(org.apache.xmlbeans.SchemaType sType)
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
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName STR$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "str");
            private static final javax.xml.namespace.QName INT$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "int");
            private static final javax.xml.namespace.QName REAL$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real");
            private static final javax.xml.namespace.QName BOOL$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bool");
            private static final javax.xml.namespace.QName OS$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "os");
            private static final javax.xml.namespace.QName OBJECT$10 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "object");
            private static final javax.xml.namespace.QName STRS$12 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strs");
            private static final javax.xml.namespace.QName INTS$14 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ints");
            private static final javax.xml.namespace.QName REALS$16 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "reals");
            private static final javax.xml.namespace.QName OSS$18 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "oss");
            private static final javax.xml.namespace.QName FIELDS$20 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fields");
            private static final javax.xml.namespace.QName OBJECTS$22 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "objects");
            
            
            /**
             * Gets the "str" element
             */
            public java.lang.String getStr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "str" element
             */
            public org.apache.xmlbeans.XmlString xgetStr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "str" element
             */
            public boolean isSetStr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STR$0) != 0;
                }
            }
            
            /**
             * Sets the "str" element
             */
            public void setStr(java.lang.String str)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STR$0);
                    }
                    target.setStringValue(str);
                }
            }
            
            /**
             * Sets (as xml) the "str" element
             */
            public void xsetStr(org.apache.xmlbeans.XmlString str)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STR$0);
                    }
                    target.set(str);
                }
            }
            
            /**
             * Unsets the "str" element
             */
            public void unsetStr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STR$0, 0);
                }
            }
            
            /**
             * Gets the "int" element
             */
            public java.math.BigInteger getInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "int" element
             */
            public org.apache.xmlbeans.XmlInteger xgetInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INT$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "int" element
             */
            public boolean isSetInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INT$2) != 0;
                }
            }
            
            /**
             * Sets the "int" element
             */
            public void setInt(java.math.BigInteger xint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INT$2);
                    }
                    target.setBigIntegerValue(xint);
                }
            }
            
            /**
             * Sets (as xml) the "int" element
             */
            public void xsetInt(org.apache.xmlbeans.XmlInteger xint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INT$2);
                    }
                    target.set(xint);
                }
            }
            
            /**
             * Unsets the "int" element
             */
            public void unsetInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INT$2, 0);
                }
            }
            
            /**
             * Gets the "real" element
             */
            public double getReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$4, 0);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "real" element
             */
            public org.apache.xmlbeans.XmlDouble xgetReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "real" element
             */
            public boolean isSetReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REAL$4) != 0;
                }
            }
            
            /**
             * Sets the "real" element
             */
            public void setReal(double real)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$4);
                    }
                    target.setDoubleValue(real);
                }
            }
            
            /**
             * Sets (as xml) the "real" element
             */
            public void xsetReal(org.apache.xmlbeans.XmlDouble real)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$4);
                    }
                    target.set(real);
                }
            }
            
            /**
             * Unsets the "real" element
             */
            public void unsetReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REAL$4, 0);
                }
            }
            
            /**
             * Gets the "bool" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool getBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool)get_store().find_element_user(BOOL$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "bool" element
             */
            public boolean isSetBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BOOL$6) != 0;
                }
            }
            
            /**
             * Sets the "bool" element
             */
            public void setBool(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool bool)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool)get_store().find_element_user(BOOL$6, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool)get_store().add_element_user(BOOL$6);
                    }
                    target.set(bool);
                }
            }
            
            /**
             * Appends and returns a new empty "bool" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool addNewBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool)get_store().add_element_user(BOOL$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "bool" element
             */
            public void unsetBool()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BOOL$6, 0);
                }
            }
            
            /**
             * Gets the "os" element
             */
            public byte[] getOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OS$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "os" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(OS$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "os" element
             */
            public boolean isSetOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OS$8) != 0;
                }
            }
            
            /**
             * Sets the "os" element
             */
            public void setOs(byte[] os)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OS$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OS$8);
                    }
                    target.setByteArrayValue(os);
                }
            }
            
            /**
             * Sets (as xml) the "os" element
             */
            public void xsetOs(org.apache.xmlbeans.XmlHexBinary os)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(OS$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(OS$8);
                    }
                    target.set(os);
                }
            }
            
            /**
             * Unsets the "os" element
             */
            public void unsetOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OS$8, 0);
                }
            }
            
            /**
             * Gets the "object" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object getObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object)get_store().find_element_user(OBJECT$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "object" element
             */
            public boolean isSetObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBJECT$10) != 0;
                }
            }
            
            /**
             * Sets the "object" element
             */
            public void setObject(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object object)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object)get_store().find_element_user(OBJECT$10, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object)get_store().add_element_user(OBJECT$10);
                    }
                    target.set(object);
                }
            }
            
            /**
             * Appends and returns a new empty "object" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object addNewObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object)get_store().add_element_user(OBJECT$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "object" element
             */
            public void unsetObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBJECT$10, 0);
                }
            }
            
            /**
             * Gets array of all "strs" elements
             */
            public java.lang.String[] getStrsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(STRS$12, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "strs" element
             */
            public java.lang.String getStrsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRS$12, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "strs" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetStrsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(STRS$12, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "strs" element
             */
            public org.apache.xmlbeans.XmlString xgetStrsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRS$12, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "strs" element
             */
            public int sizeOfStrsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STRS$12);
                }
            }
            
            /**
             * Sets array of all "strs" element
             */
            public void setStrsArray(java.lang.String[] strsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(strsArray, STRS$12);
                }
            }
            
            /**
             * Sets ith "strs" element
             */
            public void setStrsArray(int i, java.lang.String strs)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRS$12, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(strs);
                }
            }
            
            /**
             * Sets (as xml) array of all "strs" element
             */
            public void xsetStrsArray(org.apache.xmlbeans.XmlString[]strsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(strsArray, STRS$12);
                }
            }
            
            /**
             * Sets (as xml) ith "strs" element
             */
            public void xsetStrsArray(int i, org.apache.xmlbeans.XmlString strs)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRS$12, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(strs);
                }
            }
            
            /**
             * Inserts the value as the ith "strs" element
             */
            public void insertStrs(int i, java.lang.String strs)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRS$12, i);
                    target.setStringValue(strs);
                }
            }
            
            /**
             * Appends the value as the last "strs" element
             */
            public void addStrs(java.lang.String strs)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRS$12);
                    target.setStringValue(strs);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "strs" element
             */
            public org.apache.xmlbeans.XmlString insertNewStrs(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRS$12, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "strs" element
             */
            public org.apache.xmlbeans.XmlString addNewStrs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRS$12);
                    return target;
                }
            }
            
            /**
             * Removes the ith "strs" element
             */
            public void removeStrs(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STRS$12, i);
                }
            }
            
            /**
             * Gets array of all "ints" elements
             */
            public java.math.BigInteger[] getIntsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INTS$14, targetList);
                    java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "ints" element
             */
            public java.math.BigInteger getIntsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTS$14, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "ints" elements
             */
            public org.apache.xmlbeans.XmlInteger[] xgetIntsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INTS$14, targetList);
                    org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "ints" element
             */
            public org.apache.xmlbeans.XmlInteger xgetIntsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTS$14, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlInteger)target;
                }
            }
            
            /**
             * Returns number of "ints" element
             */
            public int sizeOfIntsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTS$14);
                }
            }
            
            /**
             * Sets array of all "ints" element
             */
            public void setIntsArray(java.math.BigInteger[] intsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(intsArray, INTS$14);
                }
            }
            
            /**
             * Sets ith "ints" element
             */
            public void setIntsArray(int i, java.math.BigInteger ints)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTS$14, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setBigIntegerValue(ints);
                }
            }
            
            /**
             * Sets (as xml) array of all "ints" element
             */
            public void xsetIntsArray(org.apache.xmlbeans.XmlInteger[]intsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(intsArray, INTS$14);
                }
            }
            
            /**
             * Sets (as xml) ith "ints" element
             */
            public void xsetIntsArray(int i, org.apache.xmlbeans.XmlInteger ints)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTS$14, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(ints);
                }
            }
            
            /**
             * Inserts the value as the ith "ints" element
             */
            public void insertInts(int i, java.math.BigInteger ints)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTS$14, i);
                    target.setBigIntegerValue(ints);
                }
            }
            
            /**
             * Appends the value as the last "ints" element
             */
            public void addInts(java.math.BigInteger ints)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTS$14);
                    target.setBigIntegerValue(ints);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ints" element
             */
            public org.apache.xmlbeans.XmlInteger insertNewInts(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(INTS$14, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ints" element
             */
            public org.apache.xmlbeans.XmlInteger addNewInts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INTS$14);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ints" element
             */
            public void removeInts(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTS$14, i);
                }
            }
            
            /**
             * Gets array of all "reals" elements
             */
            public double[] getRealsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(REALS$16, targetList);
                    double[] result = new double[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "reals" element
             */
            public double getRealsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALS$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "reals" elements
             */
            public org.apache.xmlbeans.XmlDouble[] xgetRealsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(REALS$16, targetList);
                    org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "reals" element
             */
            public org.apache.xmlbeans.XmlDouble xgetRealsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REALS$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlDouble)target;
                }
            }
            
            /**
             * Returns number of "reals" element
             */
            public int sizeOfRealsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REALS$16);
                }
            }
            
            /**
             * Sets array of all "reals" element
             */
            public void setRealsArray(double[] realsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(realsArray, REALS$16);
                }
            }
            
            /**
             * Sets ith "reals" element
             */
            public void setRealsArray(int i, double reals)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALS$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setDoubleValue(reals);
                }
            }
            
            /**
             * Sets (as xml) array of all "reals" element
             */
            public void xsetRealsArray(org.apache.xmlbeans.XmlDouble[]realsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(realsArray, REALS$16);
                }
            }
            
            /**
             * Sets (as xml) ith "reals" element
             */
            public void xsetRealsArray(int i, org.apache.xmlbeans.XmlDouble reals)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REALS$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(reals);
                }
            }
            
            /**
             * Inserts the value as the ith "reals" element
             */
            public void insertReals(int i, double reals)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REALS$16, i);
                    target.setDoubleValue(reals);
                }
            }
            
            /**
             * Appends the value as the last "reals" element
             */
            public void addReals(double reals)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALS$16);
                    target.setDoubleValue(reals);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "reals" element
             */
            public org.apache.xmlbeans.XmlDouble insertNewReals(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(REALS$16, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "reals" element
             */
            public org.apache.xmlbeans.XmlDouble addNewReals()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REALS$16);
                    return target;
                }
            }
            
            /**
             * Removes the ith "reals" element
             */
            public void removeReals(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REALS$16, i);
                }
            }
            
            /**
             * Gets array of all "oss" elements
             */
            public byte[][] getOssArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OSS$18, targetList);
                    byte[][] result = new byte[targetList.size()][];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "oss" element
             */
            public byte[] getOssArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSS$18, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "oss" elements
             */
            public org.apache.xmlbeans.XmlHexBinary[] xgetOssArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OSS$18, targetList);
                    org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "oss" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetOssArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(OSS$18, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlHexBinary)target;
                }
            }
            
            /**
             * Returns number of "oss" element
             */
            public int sizeOfOssArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OSS$18);
                }
            }
            
            /**
             * Sets array of all "oss" element
             */
            public void setOssArray(byte[][] ossArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(ossArray, OSS$18);
                }
            }
            
            /**
             * Sets ith "oss" element
             */
            public void setOssArray(int i, byte[] oss)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSS$18, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setByteArrayValue(oss);
                }
            }
            
            /**
             * Sets (as xml) array of all "oss" element
             */
            public void xsetOssArray(org.apache.xmlbeans.XmlHexBinary[]ossArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(ossArray, OSS$18);
                }
            }
            
            /**
             * Sets (as xml) ith "oss" element
             */
            public void xsetOssArray(int i, org.apache.xmlbeans.XmlHexBinary oss)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(OSS$18, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(oss);
                }
            }
            
            /**
             * Inserts the value as the ith "oss" element
             */
            public void insertOss(int i, byte[] oss)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OSS$18, i);
                    target.setByteArrayValue(oss);
                }
            }
            
            /**
             * Appends the value as the last "oss" element
             */
            public void addOss(byte[] oss)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OSS$18);
                    target.setByteArrayValue(oss);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "oss" element
             */
            public org.apache.xmlbeans.XmlHexBinary insertNewOss(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(OSS$18, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "oss" element
             */
            public org.apache.xmlbeans.XmlHexBinary addNewOss()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(OSS$18);
                    return target;
                }
            }
            
            /**
             * Removes the ith "oss" element
             */
            public void removeOss(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OSS$18, i);
                }
            }
            
            /**
             * Gets the "fields" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields getFields()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields)get_store().find_element_user(FIELDS$20, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "fields" element
             */
            public boolean isSetFields()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FIELDS$20) != 0;
                }
            }
            
            /**
             * Sets the "fields" element
             */
            public void setFields(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields fields)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields)get_store().find_element_user(FIELDS$20, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields)get_store().add_element_user(FIELDS$20);
                    }
                    target.set(fields);
                }
            }
            
            /**
             * Appends and returns a new empty "fields" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields addNewFields()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields)get_store().add_element_user(FIELDS$20);
                    return target;
                }
            }
            
            /**
             * Unsets the "fields" element
             */
            public void unsetFields()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FIELDS$20, 0);
                }
            }
            
            /**
             * Gets the "objects" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects getObjects()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects)get_store().find_element_user(OBJECTS$22, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "objects" element
             */
            public boolean isSetObjects()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBJECTS$22) != 0;
                }
            }
            
            /**
             * Sets the "objects" element
             */
            public void setObjects(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects objects)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects)get_store().find_element_user(OBJECTS$22, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects)get_store().add_element_user(OBJECTS$22);
                    }
                    target.set(objects);
                }
            }
            
            /**
             * Appends and returns a new empty "objects" element
             */
            public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects addNewObjects()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects target = null;
                    target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects)get_store().add_element_user(OBJECTS$22);
                    return target;
                }
            }
            
            /**
             * Unsets the "objects" element
             */
            public void unsetObjects()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBJECTS$22, 0);
                }
            }
            /**
             * An XML bool(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class BoolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool
            {
                
                public BoolImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VALUE$0 = 
                    new javax.xml.namespace.QName("", "value");
                
                
                /**
                 * Gets the "value" attribute
                 */
                public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value.Enum getValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                public gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value xgetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value target = null;
                      target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value)get_store().find_attribute_user(VALUE$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "value" attribute
                 */
                public void setValue(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value.Enum value)
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
                public void xsetValue(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value target = null;
                      target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value)get_store().add_attribute_user(VALUE$0);
                      }
                      target.set(value);
                    }
                }
                /**
                 * An XML value(@).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.UserFieldDocument$UserField$Data$Bool$Value.
                 */
                public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value
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
            /**
             * An XML object(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object
            {
                
                public ObjectImpl(org.apache.xmlbeans.SchemaType sType)
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
            }
            /**
             * An XML fields(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class FieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields
            {
                
                public FieldsImpl(org.apache.xmlbeans.SchemaType sType)
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
            /**
             * An XML objects(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ObjectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects
            {
                
                public ObjectsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName USEROBJECT$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
                
                
                /**
                 * Gets array of all "User-object" elements
                 */
                public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] getUserObjectArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(USEROBJECT$0, targetList);
                      gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] result = new gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "User-object" element
                 */
                public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObjectArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "User-object" element
                 */
                public int sizeOfUserObjectArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(USEROBJECT$0);
                    }
                }
                
                /**
                 * Sets array of all "User-object" element
                 */
                public void setUserObjectArray(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] userObjectArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(userObjectArray, USEROBJECT$0);
                    }
                }
                
                /**
                 * Sets ith "User-object" element
                 */
                public void setUserObjectArray(int i, gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(userObject);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "User-object" element
                 */
                public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject insertNewUserObject(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().insert_element_user(USEROBJECT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "User-object" element
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
                 * Removes the ith "User-object" element
                 */
                public void removeUserObject(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(USEROBJECT$0, i);
                    }
                }
            }
        }
    }
}
