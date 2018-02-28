/*
 * An XML document type.
 * Localname: Blast4-get-databases-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-get-databases-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4GetDatabasesReplyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetDatabasesReplyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getdatabasesreplya1cbdoctype");
    
    /**
     * Gets the "Blast4-get-databases-reply" element
     */
    gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply getBlast4GetDatabasesReply();
    
    /**
     * Sets the "Blast4-get-databases-reply" element
     */
    void setBlast4GetDatabasesReply(gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply blast4GetDatabasesReply);
    
    /**
     * Appends and returns a new empty "Blast4-get-databases-reply" element
     */
    gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply addNewBlast4GetDatabasesReply();
    
    /**
     * An XML Blast4-get-databases-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4GetDatabasesReply extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetDatabasesReply.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getdatabasesreply3a82elemtype");
        
        /**
         * Gets array of all "Blast4-database-info" elements
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo[] getBlast4DatabaseInfoArray();
        
        /**
         * Gets ith "Blast4-database-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo getBlast4DatabaseInfoArray(int i);
        
        /**
         * Returns number of "Blast4-database-info" element
         */
        int sizeOfBlast4DatabaseInfoArray();
        
        /**
         * Sets array of all "Blast4-database-info" element
         */
        void setBlast4DatabaseInfoArray(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo[] blast4DatabaseInfoArray);
        
        /**
         * Sets ith "Blast4-database-info" element
         */
        void setBlast4DatabaseInfoArray(int i, gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo blast4DatabaseInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-database-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo insertNewBlast4DatabaseInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-database-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo addNewBlast4DatabaseInfo();
        
        /**
         * Removes the ith "Blast4-database-info" element
         */
        void removeBlast4DatabaseInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
