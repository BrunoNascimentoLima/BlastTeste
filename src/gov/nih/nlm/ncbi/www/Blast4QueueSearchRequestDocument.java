/*
 * An XML document type.
 * Localname: Blast4-queue-search-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-queue-search-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4QueueSearchRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4QueueSearchRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4queuesearchrequest6923doctype");
    
    /**
     * Gets the "Blast4-queue-search-request" element
     */
    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest getBlast4QueueSearchRequest();
    
    /**
     * Sets the "Blast4-queue-search-request" element
     */
    void setBlast4QueueSearchRequest(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest blast4QueueSearchRequest);
    
    /**
     * Appends and returns a new empty "Blast4-queue-search-request" element
     */
    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest addNewBlast4QueueSearchRequest();
    
    /**
     * An XML Blast4-queue-search-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4QueueSearchRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4QueueSearchRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4queuesearchrequest1346elemtype");
        
        /**
         * Gets the "program" element
         */
        java.lang.String getProgram();
        
        /**
         * Gets (as xml) the "program" element
         */
        org.apache.xmlbeans.XmlString xgetProgram();
        
        /**
         * Sets the "program" element
         */
        void setProgram(java.lang.String program);
        
        /**
         * Sets (as xml) the "program" element
         */
        void xsetProgram(org.apache.xmlbeans.XmlString program);
        
        /**
         * Gets the "service" element
         */
        java.lang.String getService();
        
        /**
         * Gets (as xml) the "service" element
         */
        org.apache.xmlbeans.XmlString xgetService();
        
        /**
         * Sets the "service" element
         */
        void setService(java.lang.String service);
        
        /**
         * Sets (as xml) the "service" element
         */
        void xsetService(org.apache.xmlbeans.XmlString service);
        
        /**
         * Gets the "queries" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries getQueries();
        
        /**
         * Sets the "queries" element
         */
        void setQueries(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries queries);
        
        /**
         * Appends and returns a new empty "queries" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries addNewQueries();
        
        /**
         * Gets the "subject" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject getSubject();
        
        /**
         * Sets the "subject" element
         */
        void setSubject(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject subject);
        
        /**
         * Appends and returns a new empty "subject" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject addNewSubject();
        
        /**
         * Gets the "paramset" element
         */
        java.lang.String getParamset();
        
        /**
         * Gets (as xml) the "paramset" element
         */
        org.apache.xmlbeans.XmlString xgetParamset();
        
        /**
         * True if has "paramset" element
         */
        boolean isSetParamset();
        
        /**
         * Sets the "paramset" element
         */
        void setParamset(java.lang.String paramset);
        
        /**
         * Sets (as xml) the "paramset" element
         */
        void xsetParamset(org.apache.xmlbeans.XmlString paramset);
        
        /**
         * Unsets the "paramset" element
         */
        void unsetParamset();
        
        /**
         * Gets the "algorithm-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions getAlgorithmOptions();
        
        /**
         * True if has "algorithm-options" element
         */
        boolean isSetAlgorithmOptions();
        
        /**
         * Sets the "algorithm-options" element
         */
        void setAlgorithmOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions algorithmOptions);
        
        /**
         * Appends and returns a new empty "algorithm-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions addNewAlgorithmOptions();
        
        /**
         * Unsets the "algorithm-options" element
         */
        void unsetAlgorithmOptions();
        
        /**
         * Gets the "program-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions getProgramOptions();
        
        /**
         * True if has "program-options" element
         */
        boolean isSetProgramOptions();
        
        /**
         * Sets the "program-options" element
         */
        void setProgramOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions programOptions);
        
        /**
         * Appends and returns a new empty "program-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions addNewProgramOptions();
        
        /**
         * Unsets the "program-options" element
         */
        void unsetProgramOptions();
        
        /**
         * Gets the "format-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions getFormatOptions();
        
        /**
         * True if has "format-options" element
         */
        boolean isSetFormatOptions();
        
        /**
         * Sets the "format-options" element
         */
        void setFormatOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions formatOptions);
        
        /**
         * Appends and returns a new empty "format-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions addNewFormatOptions();
        
        /**
         * Unsets the "format-options" element
         */
        void unsetFormatOptions();
        
        /**
         * An XML queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Queries extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Queries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("queries2118elemtype");
            
            /**
             * Gets the "Blast4-queries" element
             */
            gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries getBlast4Queries();
            
            /**
             * Sets the "Blast4-queries" element
             */
            void setBlast4Queries(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries blast4Queries);
            
            /**
             * Appends and returns a new empty "Blast4-queries" element
             */
            gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries addNewBlast4Queries();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Queries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML subject(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Subject extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("subjectfcdeelemtype");
            
            /**
             * Gets the "Blast4-subject" element
             */
            gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject getBlast4Subject();
            
            /**
             * Sets the "Blast4-subject" element
             */
            void setBlast4Subject(gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject blast4Subject);
            
            /**
             * Appends and returns a new empty "Blast4-subject" element
             */
            gov.nih.nlm.ncbi.www.Blast4SubjectDocument.Blast4Subject addNewBlast4Subject();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.Subject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML algorithm-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface AlgorithmOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlgorithmOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("algorithmoptionse8f2elemtype");
            
            /**
             * Gets the "Blast4-parameters" element
             */
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters();
            
            /**
             * Sets the "Blast4-parameters" element
             */
            void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters);
            
            /**
             * Appends and returns a new empty "Blast4-parameters" element
             */
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.AlgorithmOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML program-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProgramOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProgramOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("programoptions1107elemtype");
            
            /**
             * Gets the "Blast4-parameters" element
             */
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters();
            
            /**
             * Sets the "Blast4-parameters" element
             */
            void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters);
            
            /**
             * Appends and returns a new empty "Blast4-parameters" element
             */
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.ProgramOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML format-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FormatOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("formatoptionsa0aaelemtype");
            
            /**
             * Gets the "Blast4-parameters" element
             */
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters();
            
            /**
             * Sets the "Blast4-parameters" element
             */
            void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters);
            
            /**
             * Appends and returns a new empty "Blast4-parameters" element
             */
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
