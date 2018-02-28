/*
 * An XML document type.
 * Localname: Blast4-queue-search-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-queue-search-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4QueueSearchRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument
{
    
    public Blast4QueueSearchRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4QUEUESEARCHREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queue-search-request");
    
    
    /**
     * Gets the "Blast4-queue-search-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest getBlast4QueueSearchRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().find_element_user(BLAST4QUEUESEARCHREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-queue-search-request" element
     */
    public void setBlast4QueueSearchRequest(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest blast4QueueSearchRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().find_element_user(BLAST4QUEUESEARCHREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().add_element_user(BLAST4QUEUESEARCHREQUEST$0);
            }
            target.set(blast4QueueSearchRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-queue-search-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest addNewBlast4QueueSearchRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().add_element_user(BLAST4QUEUESEARCHREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-queue-search-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4QueueSearchRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest
    {
        
        public Blast4QueueSearchRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROGRAM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "program");
        private static final javax.xml.namespace.QName SERVICE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "service");
        private static final javax.xml.namespace.QName QUERIES$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "queries");
        private static final javax.xml.namespace.QName SUBJECT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subject");
        private static final javax.xml.namespace.QName PARAMSET$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "paramset");
        private static final javax.xml.namespace.QName ALGORITHMOPTIONS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "algorithm-options");
        private static final javax.xml.namespace.QName PROGRAMOPTIONS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "program-options");
        private static final javax.xml.namespace.QName FORMATOPTIONS$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "format-options");
        
        
        /**
         * Gets the "program" element
         */
        public java.lang.String getProgram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRAM$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRAM$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRAM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROGRAM$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICE$2);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries getQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries)get_store().find_element_user(QUERIES$4, 0);
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
        public void setQueries(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries queries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries)get_store().find_element_user(QUERIES$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries)get_store().add_element_user(QUERIES$4);
                }
                target.set(queries);
            }
        }
        
        /**
         * Appends and returns a new empty "queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries addNewQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries)get_store().add_element_user(QUERIES$4);
                return target;
            }
        }
        
        /**
         * Gets the "subject" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject getSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject)get_store().find_element_user(SUBJECT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "subject" element
         */
        public void setSubject(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject subject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject)get_store().find_element_user(SUBJECT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject)get_store().add_element_user(SUBJECT$6);
                }
                target.set(subject);
            }
        }
        
        /**
         * Appends and returns a new empty "subject" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject addNewSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject)get_store().add_element_user(SUBJECT$6);
                return target;
            }
        }
        
        /**
         * Gets the "paramset" element
         */
        public java.lang.String getParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMSET$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paramset" element
         */
        public org.apache.xmlbeans.XmlString xgetParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMSET$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "paramset" element
         */
        public boolean isSetParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMSET$8) != 0;
            }
        }
        
        /**
         * Sets the "paramset" element
         */
        public void setParamset(java.lang.String paramset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMSET$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMSET$8);
                }
                target.setStringValue(paramset);
            }
        }
        
        /**
         * Sets (as xml) the "paramset" element
         */
        public void xsetParamset(org.apache.xmlbeans.XmlString paramset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMSET$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMSET$8);
                }
                target.set(paramset);
            }
        }
        
        /**
         * Unsets the "paramset" element
         */
        public void unsetParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMSET$8, 0);
            }
        }
        
        /**
         * Gets the "algorithm-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions getAlgorithmOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions)get_store().find_element_user(ALGORITHMOPTIONS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "algorithm-options" element
         */
        public boolean isSetAlgorithmOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALGORITHMOPTIONS$10) != 0;
            }
        }
        
        /**
         * Sets the "algorithm-options" element
         */
        public void setAlgorithmOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions algorithmOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions)get_store().find_element_user(ALGORITHMOPTIONS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions)get_store().add_element_user(ALGORITHMOPTIONS$10);
                }
                target.set(algorithmOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "algorithm-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions addNewAlgorithmOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions)get_store().add_element_user(ALGORITHMOPTIONS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "algorithm-options" element
         */
        public void unsetAlgorithmOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALGORITHMOPTIONS$10, 0);
            }
        }
        
        /**
         * Gets the "program-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions getProgramOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions)get_store().find_element_user(PROGRAMOPTIONS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "program-options" element
         */
        public boolean isSetProgramOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROGRAMOPTIONS$12) != 0;
            }
        }
        
        /**
         * Sets the "program-options" element
         */
        public void setProgramOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions programOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions)get_store().find_element_user(PROGRAMOPTIONS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions)get_store().add_element_user(PROGRAMOPTIONS$12);
                }
                target.set(programOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "program-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions addNewProgramOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions)get_store().add_element_user(PROGRAMOPTIONS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "program-options" element
         */
        public void unsetProgramOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROGRAMOPTIONS$12, 0);
            }
        }
        
        /**
         * Gets the "format-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions getFormatOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions)get_store().find_element_user(FORMATOPTIONS$14, 0);
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
        public void setFormatOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions formatOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions)get_store().find_element_user(FORMATOPTIONS$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions)get_store().add_element_user(FORMATOPTIONS$14);
                }
                target.set(formatOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "format-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions addNewFormatOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions)get_store().add_element_user(FORMATOPTIONS$14);
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
         * An XML queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries
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
         * An XML subject(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SubjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject
        {
            
            public SubjectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4SUBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-subject");
            
            
            /**
             * Gets the "Blast4-subject" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject getBlast4Subject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().find_element_user(BLAST4SUBJECT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-subject" element
             */
            public void setBlast4Subject(gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject blast4Subject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().find_element_user(BLAST4SUBJECT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().add_element_user(BLAST4SUBJECT$0);
                    }
                    target.set(blast4Subject);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-subject" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject addNewBlast4Subject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject)get_store().add_element_user(BLAST4SUBJECT$0);
                    return target;
                }
            }
        }
        /**
         * An XML algorithm-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlgorithmOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions
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
        public static class ProgramOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions
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
        public static class FormatOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions
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
