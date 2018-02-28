/*
 * An XML document type.
 * Localname: Blast4-get-request-info-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-request-info-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetRequestInfoReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument
{
    
    public Blast4GetRequestInfoReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETREQUESTINFOREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-request-info-reply");
    
    
    /**
     * Gets the "Blast4-get-request-info-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply getBlast4GetRequestInfoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().find_element_user(BLAST4GETREQUESTINFOREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-request-info-reply" element
     */
    public void setBlast4GetRequestInfoReply(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply blast4GetRequestInfoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().find_element_user(BLAST4GETREQUESTINFOREPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().add_element_user(BLAST4GETREQUESTINFOREPLY$0);
            }
            target.set(blast4GetRequestInfoReply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-request-info-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply addNewBlast4GetRequestInfoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().add_element_user(BLAST4GETREQUESTINFOREPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-request-info-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetRequestInfoReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply
    {
        
        public Blast4GetRequestInfoReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATABASE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "database");
        private static final javax.xml.namespace.QName PROGRAM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "program");
        private static final javax.xml.namespace.QName SERVICE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "service");
        private static final javax.xml.namespace.QName CREATEDBY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "created-by");
        private static final javax.xml.namespace.QName QUERIES$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "queries");
        private static final javax.xml.namespace.QName ALGORITHMOPTIONS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "algorithm-options");
        private static final javax.xml.namespace.QName PROGRAMOPTIONS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "program-options");
        private static final javax.xml.namespace.QName FORMATOPTIONS$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "format-options");
        
        
        /**
         * Gets the "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "database" element
         */
        public void setDatabase(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database)get_store().add_element_user(DATABASE$0);
                }
                target.set(database);
            }
        }
        
        /**
         * Appends and returns a new empty "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database addNewDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database)get_store().add_element_user(DATABASE$0);
                return target;
            }
        }
        
        /**
         * Gets the "program" element
         */
        public java.lang.String getProgram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "program" element
         */
        public org.apache.xmlbeans.XmlString xgetProgram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRAM$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "program" element
         */
        public void setProgram(java.lang.String program)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRAM$2);
                }
                target.setStringValue(program);
            }
        }
        
        /**
         * Sets (as xml) the "program" element
         */
        public void xsetProgram(org.apache.xmlbeans.XmlString program)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRAM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROGRAM$2);
                }
                target.set(program);
            }
        }
        
        /**
         * Gets the "service" element
         */
        public java.lang.String getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" element
         */
        public org.apache.xmlbeans.XmlString xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(java.lang.String service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$4);
                }
                target.setStringValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" element
         */
        public void xsetService(org.apache.xmlbeans.XmlString service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICE$4);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "created-by" element
         */
        public java.lang.String getCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "created-by" element
         */
        public org.apache.xmlbeans.XmlString xgetCreatedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDBY$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "created-by" element
         */
        public void setCreatedBy(java.lang.String createdBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDBY$6);
                }
                target.setStringValue(createdBy);
            }
        }
        
        /**
         * Sets (as xml) the "created-by" element
         */
        public void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDBY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATEDBY$6);
                }
                target.set(createdBy);
            }
        }
        
        /**
         * Gets the "queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries getQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries)get_store().find_element_user(QUERIES$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "queries" element
         */
        public void setQueries(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries queries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries)get_store().find_element_user(QUERIES$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries)get_store().add_element_user(QUERIES$8);
                }
                target.set(queries);
            }
        }
        
        /**
         * Appends and returns a new empty "queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries addNewQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries)get_store().add_element_user(QUERIES$8);
                return target;
            }
        }
        
        /**
         * Gets the "algorithm-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions getAlgorithmOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions)get_store().find_element_user(ALGORITHMOPTIONS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "algorithm-options" element
         */
        public void setAlgorithmOptions(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions algorithmOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions)get_store().find_element_user(ALGORITHMOPTIONS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions)get_store().add_element_user(ALGORITHMOPTIONS$10);
                }
                target.set(algorithmOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "algorithm-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions addNewAlgorithmOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions)get_store().add_element_user(ALGORITHMOPTIONS$10);
                return target;
            }
        }
        
        /**
         * Gets the "program-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions getProgramOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions)get_store().find_element_user(PROGRAMOPTIONS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "program-options" element
         */
        public void setProgramOptions(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions programOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions)get_store().find_element_user(PROGRAMOPTIONS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions)get_store().add_element_user(PROGRAMOPTIONS$12);
                }
                target.set(programOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "program-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions addNewProgramOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions)get_store().add_element_user(PROGRAMOPTIONS$12);
                return target;
            }
        }
        
        /**
         * Gets the "format-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions getFormatOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions)get_store().find_element_user(FORMATOPTIONS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "format-options" element
         */
        public boolean isSetFormatOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMATOPTIONS$14) != 0;
            }
        }
        
        /**
         * Sets the "format-options" element
         */
        public void setFormatOptions(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions formatOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions)get_store().find_element_user(FORMATOPTIONS$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions)get_store().add_element_user(FORMATOPTIONS$14);
                }
                target.set(formatOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "format-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions addNewFormatOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions)get_store().add_element_user(FORMATOPTIONS$14);
                return target;
            }
        }
        
        /**
         * Unsets the "format-options" element
         */
        public void unsetFormatOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMATOPTIONS$14, 0);
            }
        }
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DatabaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database
        {
            
            public DatabaseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4DATABASE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-database");
            
            
            /**
             * Gets the "Blast4-database" element
             */
            public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database getBlast4Database()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().find_element_user(BLAST4DATABASE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-database" element
             */
            public void setBlast4Database(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database blast4Database)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().find_element_user(BLAST4DATABASE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().add_element_user(BLAST4DATABASE$0);
                    }
                    target.set(blast4Database);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-database" element
             */
            public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database addNewBlast4Database()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().add_element_user(BLAST4DATABASE$0);
                    return target;
                }
            }
        }
        /**
         * An XML queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries
        {
            
            public QueriesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4QUERIES$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queries");
            
            
            /**
             * Gets the "Blast4-queries" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries getBlast4Queries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().find_element_user(BLAST4QUERIES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-queries" element
             */
            public void setBlast4Queries(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries blast4Queries)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().find_element_user(BLAST4QUERIES$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().add_element_user(BLAST4QUERIES$0);
                    }
                    target.set(blast4Queries);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-queries" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries addNewBlast4Queries()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries)get_store().add_element_user(BLAST4QUERIES$0);
                    return target;
                }
            }
        }
        /**
         * An XML algorithm-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlgorithmOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions
        {
            
            public AlgorithmOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4PARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameters");
            
            
            /**
             * Gets the "Blast4-parameters" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-parameters" element
             */
            public void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                    }
                    target.set(blast4Parameters);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-parameters" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                    return target;
                }
            }
        }
        /**
         * An XML program-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProgramOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions
        {
            
            public ProgramOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4PARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameters");
            
            
            /**
             * Gets the "Blast4-parameters" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-parameters" element
             */
            public void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                    }
                    target.set(blast4Parameters);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-parameters" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                    return target;
                }
            }
        }
        /**
         * An XML format-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FormatOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions
        {
            
            public FormatOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4PARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameters");
            
            
            /**
             * Gets the "Blast4-parameters" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-parameters" element
             */
            public void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                    }
                    target.set(blast4Parameters);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-parameters" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
                    return target;
                }
            }
        }
    }
}
