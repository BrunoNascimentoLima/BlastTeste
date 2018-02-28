/*
 * An XML document type.
 * Localname: Blast4-queue-search-request-lite
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-queue-search-request-lite(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4QueueSearchRequestLiteDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4QueueSearchRequestLiteDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4queuesearchrequestlite0302doctype");
    
    /**
     * Gets the "Blast4-queue-search-request-lite" element
     */
    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite getBlast4QueueSearchRequestLite();
    
    /**
     * Sets the "Blast4-queue-search-request-lite" element
     */
    void setBlast4QueueSearchRequestLite(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite blast4QueueSearchRequestLite);
    
    /**
     * Appends and returns a new empty "Blast4-queue-search-request-lite" element
     */
    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite addNewBlast4QueueSearchRequestLite();
    
    /**
     * An XML Blast4-queue-search-request-lite(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4QueueSearchRequestLite extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4QueueSearchRequestLite.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4queuesearchrequestlitebd22elemtype");
        
        /**
         * Gets the "query" element
         */
        java.lang.String getQuery();
        
        /**
         * Gets (as xml) the "query" element
         */
        org.apache.xmlbeans.XmlString xgetQuery();
        
        /**
         * Sets the "query" element
         */
        void setQuery(java.lang.String query);
        
        /**
         * Sets (as xml) the "query" element
         */
        void xsetQuery(org.apache.xmlbeans.XmlString query);
        
        /**
         * Gets the "database-name" element
         */
        java.lang.String getDatabaseName();
        
        /**
         * Gets (as xml) the "database-name" element
         */
        org.apache.xmlbeans.XmlString xgetDatabaseName();
        
        /**
         * Sets the "database-name" element
         */
        void setDatabaseName(java.lang.String databaseName);
        
        /**
         * Sets (as xml) the "database-name" element
         */
        void xsetDatabaseName(org.apache.xmlbeans.XmlString databaseName);
        
        /**
         * Gets the "options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options getOptions();
        
        /**
         * Sets the "options" element
         */
        void setOptions(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options options);
        
        /**
         * Appends and returns a new empty "options" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options addNewOptions();
        
        /**
         * An XML options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Options extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Options.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("options4dacelemtype");
            
            /**
             * Gets the "Blast4-options-lite" element
             */
            gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite getBlast4OptionsLite();
            
            /**
             * Sets the "Blast4-options-lite" element
             */
            void setBlast4OptionsLite(gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite blast4OptionsLite);
            
            /**
             * Appends and returns a new empty "Blast4-options-lite" element
             */
            gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite addNewBlast4OptionsLite();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite.Options) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument.Blast4QueueSearchRequestLite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestLiteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
