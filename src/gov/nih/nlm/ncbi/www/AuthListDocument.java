/*
 * An XML document type.
 * Localname: Auth-list
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AuthListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Auth-list(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface AuthListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authlistd4efdoctype");
    
    /**
     * Gets the "Auth-list" element
     */
    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList getAuthList();
    
    /**
     * Sets the "Auth-list" element
     */
    void setAuthList(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList authList);
    
    /**
     * Appends and returns a new empty "Auth-list" element
     */
    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList addNewAuthList();
    
    /**
     * An XML Auth-list(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface AuthList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authlist79deelemtype");
        
        /**
         * Gets the "names" element
         */
        gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names getNames();
        
        /**
         * Sets the "names" element
         */
        void setNames(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names names);
        
        /**
         * Appends and returns a new empty "names" element
         */
        gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names addNewNames();
        
        /**
         * Gets the "affil" element
         */
        gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil getAffil();
        
        /**
         * True if has "affil" element
         */
        boolean isSetAffil();
        
        /**
         * Sets the "affil" element
         */
        void setAffil(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil affil);
        
        /**
         * Appends and returns a new empty "affil" element
         */
        gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil addNewAffil();
        
        /**
         * Unsets the "affil" element
         */
        void unsetAffil();
        
        /**
         * An XML names(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Names extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Names.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("names3592elemtype");
            
            /**
             * Gets the "std" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std getStd();
            
            /**
             * True if has "std" element
             */
            boolean isSetStd();
            
            /**
             * Sets the "std" element
             */
            void setStd(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std std);
            
            /**
             * Appends and returns a new empty "std" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std addNewStd();
            
            /**
             * Unsets the "std" element
             */
            void unsetStd();
            
            /**
             * Gets array of all "ml" elements
             */
            java.lang.String[] getMlArray();
            
            /**
             * Gets ith "ml" element
             */
            java.lang.String getMlArray(int i);
            
            /**
             * Gets (as xml) array of all "ml" elements
             */
            org.apache.xmlbeans.XmlString[] xgetMlArray();
            
            /**
             * Gets (as xml) ith "ml" element
             */
            org.apache.xmlbeans.XmlString xgetMlArray(int i);
            
            /**
             * Returns number of "ml" element
             */
            int sizeOfMlArray();
            
            /**
             * Sets array of all "ml" element
             */
            void setMlArray(java.lang.String[] mlArray);
            
            /**
             * Sets ith "ml" element
             */
            void setMlArray(int i, java.lang.String ml);
            
            /**
             * Sets (as xml) array of all "ml" element
             */
            void xsetMlArray(org.apache.xmlbeans.XmlString[] mlArray);
            
            /**
             * Sets (as xml) ith "ml" element
             */
            void xsetMlArray(int i, org.apache.xmlbeans.XmlString ml);
            
            /**
             * Inserts the value as the ith "ml" element
             */
            void insertMl(int i, java.lang.String ml);
            
            /**
             * Appends the value as the last "ml" element
             */
            void addMl(java.lang.String ml);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ml" element
             */
            org.apache.xmlbeans.XmlString insertNewMl(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ml" element
             */
            org.apache.xmlbeans.XmlString addNewMl();
            
            /**
             * Removes the ith "ml" element
             */
            void removeMl(int i);
            
            /**
             * Gets array of all "str" elements
             */
            java.lang.String[] getStrArray();
            
            /**
             * Gets ith "str" element
             */
            java.lang.String getStrArray(int i);
            
            /**
             * Gets (as xml) array of all "str" elements
             */
            org.apache.xmlbeans.XmlString[] xgetStrArray();
            
            /**
             * Gets (as xml) ith "str" element
             */
            org.apache.xmlbeans.XmlString xgetStrArray(int i);
            
            /**
             * Returns number of "str" element
             */
            int sizeOfStrArray();
            
            /**
             * Sets array of all "str" element
             */
            void setStrArray(java.lang.String[] strArray);
            
            /**
             * Sets ith "str" element
             */
            void setStrArray(int i, java.lang.String str);
            
            /**
             * Sets (as xml) array of all "str" element
             */
            void xsetStrArray(org.apache.xmlbeans.XmlString[] strArray);
            
            /**
             * Sets (as xml) ith "str" element
             */
            void xsetStrArray(int i, org.apache.xmlbeans.XmlString str);
            
            /**
             * Inserts the value as the ith "str" element
             */
            void insertStr(int i, java.lang.String str);
            
            /**
             * Appends the value as the last "str" element
             */
            void addStr(java.lang.String str);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "str" element
             */
            org.apache.xmlbeans.XmlString insertNewStr(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "str" element
             */
            org.apache.xmlbeans.XmlString addNewStr();
            
            /**
             * Removes the ith "str" element
             */
            void removeStr(int i);
            
            /**
             * An XML std(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Std extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Std.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("stdaba1elemtype");
                
                /**
                 * Gets array of all "Author" elements
                 */
                gov.nih.nlm.ncbi.www.AuthorDocument.Author[] getAuthorArray();
                
                /**
                 * Gets ith "Author" element
                 */
                gov.nih.nlm.ncbi.www.AuthorDocument.Author getAuthorArray(int i);
                
                /**
                 * Returns number of "Author" element
                 */
                int sizeOfAuthorArray();
                
                /**
                 * Sets array of all "Author" element
                 */
                void setAuthorArray(gov.nih.nlm.ncbi.www.AuthorDocument.Author[] authorArray);
                
                /**
                 * Sets ith "Author" element
                 */
                void setAuthorArray(int i, gov.nih.nlm.ncbi.www.AuthorDocument.Author author);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Author" element
                 */
                gov.nih.nlm.ncbi.www.AuthorDocument.Author insertNewAuthor(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Author" element
                 */
                gov.nih.nlm.ncbi.www.AuthorDocument.Author addNewAuthor();
                
                /**
                 * Removes the ith "Author" element
                 */
                void removeAuthor(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std newInstance() {
                      return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names newInstance() {
                  return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML affil(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Affil extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Affil.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("affil2a0eelemtype");
            
            /**
             * Gets the "Affil" element
             */
            gov.nih.nlm.ncbi.www.AffilDocument.Affil getAffil();
            
            /**
             * Sets the "Affil" element
             */
            void setAffil(gov.nih.nlm.ncbi.www.AffilDocument.Affil affil);
            
            /**
             * Appends and returns a new empty "Affil" element
             */
            gov.nih.nlm.ncbi.www.AffilDocument.Affil addNewAffil();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil newInstance() {
                  return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList newInstance() {
              return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.AuthListDocument.AuthList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.AuthListDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.AuthListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.AuthListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
