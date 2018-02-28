/*
 * An XML document type.
 * Localname: CommonString-table
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CommonStringTableDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one CommonString-table(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CommonStringTableDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommonStringTableDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("commonstringtable2abbdoctype");
    
    /**
     * Gets the "CommonString-table" element
     */
    gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable getCommonStringTable();
    
    /**
     * Sets the "CommonString-table" element
     */
    void setCommonStringTable(gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable commonStringTable);
    
    /**
     * Appends and returns a new empty "CommonString-table" element
     */
    gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable addNewCommonStringTable();
    
    /**
     * An XML CommonString-table(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CommonStringTable extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommonStringTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("commonstringtablee882elemtype");
        
        /**
         * Gets array of all "strings" elements
         */
        java.lang.String[] getStringsArray();
        
        /**
         * Gets ith "strings" element
         */
        java.lang.String getStringsArray(int i);
        
        /**
         * Gets (as xml) array of all "strings" elements
         */
        org.apache.xmlbeans.XmlString[] xgetStringsArray();
        
        /**
         * Gets (as xml) ith "strings" element
         */
        org.apache.xmlbeans.XmlString xgetStringsArray(int i);
        
        /**
         * Returns number of "strings" element
         */
        int sizeOfStringsArray();
        
        /**
         * Sets array of all "strings" element
         */
        void setStringsArray(java.lang.String[] stringsArray);
        
        /**
         * Sets ith "strings" element
         */
        void setStringsArray(int i, java.lang.String strings);
        
        /**
         * Sets (as xml) array of all "strings" element
         */
        void xsetStringsArray(org.apache.xmlbeans.XmlString[] stringsArray);
        
        /**
         * Sets (as xml) ith "strings" element
         */
        void xsetStringsArray(int i, org.apache.xmlbeans.XmlString strings);
        
        /**
         * Inserts the value as the ith "strings" element
         */
        void insertStrings(int i, java.lang.String strings);
        
        /**
         * Appends the value as the last "strings" element
         */
        void addStrings(java.lang.String strings);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "strings" element
         */
        org.apache.xmlbeans.XmlString insertNewStrings(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "strings" element
         */
        org.apache.xmlbeans.XmlString addNewStrings();
        
        /**
         * Removes the ith "strings" element
         */
        void removeStrings(int i);
        
        /**
         * Gets array of all "indexes" elements
         */
        java.math.BigInteger[] getIndexesArray();
        
        /**
         * Gets ith "indexes" element
         */
        java.math.BigInteger getIndexesArray(int i);
        
        /**
         * Gets (as xml) array of all "indexes" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetIndexesArray();
        
        /**
         * Gets (as xml) ith "indexes" element
         */
        org.apache.xmlbeans.XmlInteger xgetIndexesArray(int i);
        
        /**
         * Returns number of "indexes" element
         */
        int sizeOfIndexesArray();
        
        /**
         * Sets array of all "indexes" element
         */
        void setIndexesArray(java.math.BigInteger[] indexesArray);
        
        /**
         * Sets ith "indexes" element
         */
        void setIndexesArray(int i, java.math.BigInteger indexes);
        
        /**
         * Sets (as xml) array of all "indexes" element
         */
        void xsetIndexesArray(org.apache.xmlbeans.XmlInteger[] indexesArray);
        
        /**
         * Sets (as xml) ith "indexes" element
         */
        void xsetIndexesArray(int i, org.apache.xmlbeans.XmlInteger indexes);
        
        /**
         * Inserts the value as the ith "indexes" element
         */
        void insertIndexes(int i, java.math.BigInteger indexes);
        
        /**
         * Appends the value as the last "indexes" element
         */
        void addIndexes(java.math.BigInteger indexes);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexes" element
         */
        org.apache.xmlbeans.XmlInteger insertNewIndexes(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexes" element
         */
        org.apache.xmlbeans.XmlInteger addNewIndexes();
        
        /**
         * Removes the ith "indexes" element
         */
        void removeIndexes(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable newInstance() {
              return (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CommonStringTableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CommonStringTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
