/*
 * An XML document type.
 * Localname: Rsite-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RsiteRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Rsite-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class RsiteRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RsiteRefDocument
{
    
    public RsiteRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RSITEREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Rsite-ref");
    
    
    /**
     * Gets the "Rsite-ref" element
     */
    public gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef getRsiteRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef target = null;
            target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().find_element_user(RSITEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Rsite-ref" element
     */
    public void setRsiteRef(gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef rsiteRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef target = null;
            target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().find_element_user(RSITEREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().add_element_user(RSITEREF$0);
            }
            target.set(rsiteRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Rsite-ref" element
     */
    public gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef addNewRsiteRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef target = null;
            target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().add_element_user(RSITEREF$0);
            return target;
        }
    }
    /**
     * An XML Rsite-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class RsiteRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef
    {
        
        public RsiteRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "str");
        private static final javax.xml.namespace.QName DB$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        
        
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
         * Gets the "db" element
         */
        public gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db)get_store().find_element_user(DB$2, 0);
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
                return get_store().count_elements(DB$2) != 0;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db)get_store().find_element_user(DB$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db)get_store().add_element_user(DB$2);
                }
                target.set(db);
            }
        }
        
        /**
         * Appends and returns a new empty "db" element
         */
        public gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db addNewDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db)get_store().add_element_user(DB$2);
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
                get_store().remove_element(DB$2, 0);
            }
        }
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef.Db
        {
            
            public DbImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
