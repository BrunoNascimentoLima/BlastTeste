/*
 * An XML document type.
 * Localname: Cit-book
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitBookDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Cit-book(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CitBookDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitBookDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citbook8f66doctype");
    
    /**
     * Gets the "Cit-book" element
     */
    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook getCitBook();
    
    /**
     * Sets the "Cit-book" element
     */
    void setCitBook(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook citBook);
    
    /**
     * Appends and returns a new empty "Cit-book" element
     */
    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook addNewCitBook();
    
    /**
     * An XML Cit-book(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CitBook extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitBook.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citbooke9a2elemtype");
        
        /**
         * Gets the "title" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title getTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title title);
        
        /**
         * Appends and returns a new empty "title" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title addNewTitle();
        
        /**
         * Gets the "coll" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll getColl();
        
        /**
         * True if has "coll" element
         */
        boolean isSetColl();
        
        /**
         * Sets the "coll" element
         */
        void setColl(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll coll);
        
        /**
         * Appends and returns a new empty "coll" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll addNewColl();
        
        /**
         * Unsets the "coll" element
         */
        void unsetColl();
        
        /**
         * Gets the "authors" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors getAuthors();
        
        /**
         * Sets the "authors" element
         */
        void setAuthors(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors authors);
        
        /**
         * Appends and returns a new empty "authors" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors addNewAuthors();
        
        /**
         * Gets the "imp" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp getImp();
        
        /**
         * Sets the "imp" element
         */
        void setImp(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp imp);
        
        /**
         * Appends and returns a new empty "imp" element
         */
        gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp addNewImp();
        
        /**
         * An XML title(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Title extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Title.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("title6966elemtype");
            
            /**
             * Gets the "Title" element
             */
            gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle();
            
            /**
             * Sets the "Title" element
             */
            void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title);
            
            /**
             * Appends and returns a new empty "Title" element
             */
            gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML coll(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Coll extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Coll.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("colla32aelemtype");
            
            /**
             * Gets the "Title" element
             */
            gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle();
            
            /**
             * Sets the "Title" element
             */
            void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title);
            
            /**
             * Appends and returns a new empty "Title" element
             */
            gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Authors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authors8156elemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML imp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Imp extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("imp13daelemtype");
            
            /**
             * Gets the "Imprint" element
             */
            gov.nih.nlm.ncbi.www.ImprintDocument.Imprint getImprint();
            
            /**
             * Sets the "Imprint" element
             */
            void setImprint(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint imprint);
            
            /**
             * Appends and returns a new empty "Imprint" element
             */
            gov.nih.nlm.ncbi.www.ImprintDocument.Imprint addNewImprint();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook newInstance() {
              return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CitBookDocument.CitBook newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CitBookDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitBookDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
