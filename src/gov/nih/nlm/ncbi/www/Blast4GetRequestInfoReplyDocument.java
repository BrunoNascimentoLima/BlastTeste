/*
 * An XML document type.
 * Localname: Blast4-get-request-info-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-get-request-info-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4GetRequestInfoReplyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetRequestInfoReplyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getrequestinforeply0b5ddoctype");
    
    /**
     * Gets the "Blast4-get-request-info-reply" element
     */
    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply getBlast4GetRequestInfoReply();
    
    /**
     * Sets the "Blast4-get-request-info-reply" element
     */
    void setBlast4GetRequestInfoReply(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply blast4GetRequestInfoReply);
    
    /**
     * Appends and returns a new empty "Blast4-get-request-info-reply" element
     */
    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply addNewBlast4GetRequestInfoReply();
    
    /**
     * An XML Blast4-get-request-info-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4GetRequestInfoReply extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetRequestInfoReply.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getrequestinforeplyb6baelemtype");
        
        /**
         * Gets the "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database getDatabase();
        
        /**
         * Sets the "database" element
         */
        void setDatabase(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database database);
        
        /**
         * Appends and returns a new empty "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database addNewDatabase();
        
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
         * Gets the "created-by" element
         */
        java.lang.String getCreatedBy();
        
        /**
         * Gets (as xml) the "created-by" element
         */
        org.apache.xmlbeans.XmlString xgetCreatedBy();
        
        /**
         * Sets the "created-by" element
         */
        void setCreatedBy(java.lang.String createdBy);
        
        /**
         * Sets (as xml) the "created-by" element
         */
        void xsetCreatedBy(org.apache.xmlbeans.XmlString createdBy);
        
        /**
         * Gets the "queries" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries getQueries();
        
        /**
         * Sets the "queries" element
         */
        void setQueries(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries queries);
        
        /**
         * Appends and returns a new empty "queries" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries addNewQueries();
        
        /**
         * Gets the "algorithm-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions getAlgorithmOptions();
        
        /**
         * Sets the "algorithm-options" element
         */
        void setAlgorithmOptions(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions algorithmOptions);
        
        /**
         * Appends and returns a new empty "algorithm-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions addNewAlgorithmOptions();
        
        /**
         * Gets the "program-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions getProgramOptions();
        
        /**
         * Sets the "program-options" element
         */
        void setProgramOptions(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions programOptions);
        
        /**
         * Appends and returns a new empty "program-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions addNewProgramOptions();
        
        /**
         * Gets the "format-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions getFormatOptions();
        
        /**
         * True if has "format-options" element
         */
        boolean isSetFormatOptions();
        
        /**
         * Sets the "format-options" element
         */
        void setFormatOptions(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions formatOptions);
        
        /**
         * Appends and returns a new empty "format-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions addNewFormatOptions();
        
        /**
         * Unsets the "format-options" element
         */
        void unsetFormatOptions();
        
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Database extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Database.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("database0851elemtype");
            
            /**
             * Gets the "Blast4-database" element
             */
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database getBlast4Database();
            
            /**
             * Sets the "Blast4-database" element
             */
            void setBlast4Database(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database blast4Database);
            
            /**
             * Appends and returns a new empty "Blast4-database" element
             */
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database addNewBlast4Database();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Queries extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Queries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("queries8b8celemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.Queries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlgorithmOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("algorithmoptionsd666elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.AlgorithmOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProgramOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("programoptionsebfbelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.ProgramOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("formatoptionsf21eelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
