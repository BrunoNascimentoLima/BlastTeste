/*
 * An XML document type.
 * Localname: Score
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ScoreDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Score(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ScoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ScoreDocument
{
    
    public ScoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCORE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Score");
    
    
    /**
     * Gets the "Score" element
     */
    public gov.nih.nlm.ncbi.www.ScoreDocument.Score getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
            target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Score" element
     */
    public void setScore(gov.nih.nlm.ncbi.www.ScoreDocument.Score score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
            target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().add_element_user(SCORE$0);
            }
            target.set(score);
        }
    }
    
    /**
     * Appends and returns a new empty "Score" element
     */
    public gov.nih.nlm.ncbi.www.ScoreDocument.Score addNewScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
            target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().add_element_user(SCORE$0);
            return target;
        }
    }
    /**
     * An XML Score(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ScoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ScoreDocument.Score
    {
        
        public ScoreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "value");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$0) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$0, 0);
            }
        }
        
        /**
         * Gets the "value" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "value" element
         */
        public void setValue(gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" element
         */
        public gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value target = null;
                target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value)get_store().add_element_user(VALUE$2);
                return target;
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ScoreDocument.Score.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML value(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ScoreDocument.Score.Value
        {
            
            public ValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real");
            private static final javax.xml.namespace.QName INT$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "int");
            
            
            /**
             * Gets the "real" element
             */
            public double getReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$0, 0);
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
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$0, 0);
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
                    return get_store().count_elements(REAL$0) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$0);
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
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$0);
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
                    get_store().remove_element(REAL$0, 0);
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
        }
    }
}
