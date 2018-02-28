/*
 * An XML document type.
 * Localname: Dbtag
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DbtagDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Dbtag(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DbtagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DbtagDocument
{
    
    public DbtagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DBTAG$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
    
    
    /**
     * Gets the "Dbtag" element
     */
    public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
            target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Dbtag" element
     */
    public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
            target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
            }
            target.set(dbtag);
        }
    }
    
    /**
     * Appends and returns a new empty "Dbtag" element
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
     * An XML Dbtag(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DbtagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag
    {
        
        public DbtagImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        private static final javax.xml.namespace.QName TAG$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tag");
        
        
        /**
         * Gets the "db" element
         */
        public java.lang.String getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "db" element
         */
        public org.apache.xmlbeans.XmlString xgetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(java.lang.String db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DB$0);
                }
                target.setStringValue(db);
            }
        }
        
        /**
         * Sets (as xml) the "db" element
         */
        public void xsetDb(org.apache.xmlbeans.XmlString db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DB$0);
                }
                target.set(db);
            }
        }
        
        /**
         * Gets the "tag" element
         */
        public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag getTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag target = null;
                target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag)get_store().find_element_user(TAG$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "tag" element
         */
        public void setTag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag tag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag target = null;
                target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag)get_store().find_element_user(TAG$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag)get_store().add_element_user(TAG$2);
                }
                target.set(tag);
            }
        }
        
        /**
         * Appends and returns a new empty "tag" element
         */
        public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag addNewTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag target = null;
                target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag)get_store().add_element_user(TAG$2);
                return target;
            }
        }
        /**
         * An XML tag(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag.Tag
        {
            
            public TagImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
