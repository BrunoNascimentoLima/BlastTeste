/*
 * An XML document type.
 * Localname: PDB-replace
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PDBReplaceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PDB-replace(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PDBReplaceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PDBReplaceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pdbreplace8761doctype");
    
    /**
     * Gets the "PDB-replace" element
     */
    gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace getPDBReplace();
    
    /**
     * Sets the "PDB-replace" element
     */
    void setPDBReplace(gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace pdbReplace);
    
    /**
     * Appends and returns a new empty "PDB-replace" element
     */
    gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace addNewPDBReplace();
    
    /**
     * An XML PDB-replace(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PDBReplace extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PDBReplace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pdbreplaced342elemtype");
        
        /**
         * Gets the "date" element
         */
        gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date getDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date date);
        
        /**
         * Appends and returns a new empty "date" element
         */
        gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date addNewDate();
        
        /**
         * Gets array of all "ids" elements
         */
        java.lang.String[] getIdsArray();
        
        /**
         * Gets ith "ids" element
         */
        java.lang.String getIdsArray(int i);
        
        /**
         * Gets (as xml) array of all "ids" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIdsArray();
        
        /**
         * Gets (as xml) ith "ids" element
         */
        org.apache.xmlbeans.XmlString xgetIdsArray(int i);
        
        /**
         * Returns number of "ids" element
         */
        int sizeOfIdsArray();
        
        /**
         * Sets array of all "ids" element
         */
        void setIdsArray(java.lang.String[] idsArray);
        
        /**
         * Sets ith "ids" element
         */
        void setIdsArray(int i, java.lang.String ids);
        
        /**
         * Sets (as xml) array of all "ids" element
         */
        void xsetIdsArray(org.apache.xmlbeans.XmlString[] idsArray);
        
        /**
         * Sets (as xml) ith "ids" element
         */
        void xsetIdsArray(int i, org.apache.xmlbeans.XmlString ids);
        
        /**
         * Inserts the value as the ith "ids" element
         */
        void insertIds(int i, java.lang.String ids);
        
        /**
         * Appends the value as the last "ids" element
         */
        void addIds(java.lang.String ids);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ids" element
         */
        org.apache.xmlbeans.XmlString insertNewIds(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ids" element
         */
        org.apache.xmlbeans.XmlString addNewIds();
        
        /**
         * Removes the ith "ids" element
         */
        void removeIds(int i);
        
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Date extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("date598celemtype");
            
            /**
             * Gets the "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date getDate();
            
            /**
             * Sets the "Date" element
             */
            void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date);
            
            /**
             * Appends and returns a new empty "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date newInstance() {
                  return (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace newInstance() {
              return (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PDBReplaceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PDBReplaceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
