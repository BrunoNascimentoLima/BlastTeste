/*
 * An XML document type.
 * Localname: Blast4-queue-search-request-lite
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-queue-search-request-lite(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4QueueSearchRequestLiteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument
{
    
    public Blast4QueueSearchRequestLiteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4QUEUESEARCHREQUESTLITE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queue-search-request-lite");
    
    
    /**
     * Gets the "Blast4-queue-search-request-lite" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite getBlast4QueueSearchRequestLite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite)get_store().find_element_user(BLAST4QUEUESEARCHREQUESTLITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-queue-search-request-lite" element
     */
    public void setBlast4QueueSearchRequestLite(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite blast4QueueSearchRequestLite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite)get_store().find_element_user(BLAST4QUEUESEARCHREQUESTLITE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite)get_store().add_element_user(BLAST4QUEUESEARCHREQUESTLITE$0);
            }
            target.set(blast4QueueSearchRequestLite);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-queue-search-request-lite" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite addNewBlast4QueueSearchRequestLite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite)get_store().add_element_user(BLAST4QUEUESEARCHREQUESTLITE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-queue-search-request-lite(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4QueueSearchRequestLiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite
    {
        
        public Blast4QueueSearchRequestLiteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "query");
        private static final javax.xml.namespace.QName DATABASENAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "database-name");
        private static final javax.xml.namespace.QName OPTIONS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "options");
        
        
        /**
         * Gets the "query" element
         */
        public java.lang.String getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "query" element
         */
        public org.apache.xmlbeans.XmlString xgetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "query" element
         */
        public void setQuery(java.lang.String query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$0);
                }
                target.setStringValue(query);
            }
        }
        
        /**
         * Sets (as xml) the "query" element
         */
        public void xsetQuery(org.apache.xmlbeans.XmlString query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$0);
                }
                target.set(query);
            }
        }
        
        /**
         * Gets the "database-name" element
         */
        public java.lang.String getDatabaseName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABASENAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "database-name" element
         */
        public org.apache.xmlbeans.XmlString xgetDatabaseName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATABASENAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "database-name" element
         */
        public void setDatabaseName(java.lang.String databaseName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABASENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATABASENAME$2);
                }
                target.setStringValue(databaseName);
            }
        }
        
        /**
         * Sets (as xml) the "database-name" element
         */
        public void xsetDatabaseName(org.apache.xmlbeans.XmlString databaseName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATABASENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATABASENAME$2);
                }
                target.set(databaseName);
            }
        }
        
        /**
         * Gets the "options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options)get_store().find_element_user(OPTIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "options" element
         */
        public void setOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options)get_store().find_element_user(OPTIONS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options)get_store().add_element_user(OPTIONS$4);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options)get_store().add_element_user(OPTIONS$4);
                return target;
            }
        }
        /**
         * An XML options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options
        {
            
            public OptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4OPTIONSLITE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-options-lite");
            
            
            /**
             * Gets the "Blast4-options-lite" element
             */
            public gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite getBlast4OptionsLite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().find_element_user(BLAST4OPTIONSLITE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-options-lite" element
             */
            public void setBlast4OptionsLite(gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite blast4OptionsLite)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().find_element_user(BLAST4OPTIONSLITE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().add_element_user(BLAST4OPTIONSLITE$0);
                    }
                    target.set(blast4OptionsLite);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-options-lite" element
             */
            public gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite addNewBlast4OptionsLite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().add_element_user(BLAST4OPTIONSLITE$0);
                    return target;
                }
            }
        }
    }
}
