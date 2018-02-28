/*
 * An XML document type.
 * Localname: Cit-art
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitArtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Cit-art(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CitArtDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitArtDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citart8a70doctype");
    
    /**
     * Gets the "Cit-art" element
     */
    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArt();
    
    /**
     * Sets the "Cit-art" element
     */
    void setCitArt(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt);
    
    /**
     * Appends and returns a new empty "Cit-art" element
     */
    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt addNewCitArt();
    
    /**
     * An XML Cit-art(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CitArt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitArt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citartb3a0elemtype");
        
        /**
         * Gets the "title" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title getTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title title);
        
        /**
         * Appends and returns a new empty "title" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title addNewTitle();
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "authors" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors getAuthors();
        
        /**
         * True if has "authors" element
         */
        boolean isSetAuthors();
        
        /**
         * Sets the "authors" element
         */
        void setAuthors(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors authors);
        
        /**
         * Appends and returns a new empty "authors" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors addNewAuthors();
        
        /**
         * Unsets the "authors" element
         */
        void unsetAuthors();
        
        /**
         * Gets the "from" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From getFrom();
        
        /**
         * Sets the "from" element
         */
        void setFrom(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From from);
        
        /**
         * Appends and returns a new empty "from" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From addNewFrom();
        
        /**
         * Gets the "ids" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids getIds();
        
        /**
         * True if has "ids" element
         */
        boolean isSetIds();
        
        /**
         * Sets the "ids" element
         */
        void setIds(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids ids);
        
        /**
         * Appends and returns a new empty "ids" element
         */
        gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids addNewIds();
        
        /**
         * Unsets the "ids" element
         */
        void unsetIds();
        
        /**
         * An XML title(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Title extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Title.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("title5464elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authorsa854elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML from(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface From extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(From.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("frome3e6elemtype");
            
            /**
             * Gets the "journal" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal getJournal();
            
            /**
             * True if has "journal" element
             */
            boolean isSetJournal();
            
            /**
             * Sets the "journal" element
             */
            void setJournal(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal journal);
            
            /**
             * Appends and returns a new empty "journal" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal addNewJournal();
            
            /**
             * Unsets the "journal" element
             */
            void unsetJournal();
            
            /**
             * Gets the "book" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book getBook();
            
            /**
             * True if has "book" element
             */
            boolean isSetBook();
            
            /**
             * Sets the "book" element
             */
            void setBook(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book book);
            
            /**
             * Appends and returns a new empty "book" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book addNewBook();
            
            /**
             * Unsets the "book" element
             */
            void unsetBook();
            
            /**
             * Gets the "proc" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc getProc();
            
            /**
             * True if has "proc" element
             */
            boolean isSetProc();
            
            /**
             * Sets the "proc" element
             */
            void setProc(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc proc);
            
            /**
             * Appends and returns a new empty "proc" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc addNewProc();
            
            /**
             * Unsets the "proc" element
             */
            void unsetProc();
            
            /**
             * An XML journal(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Journal extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Journal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("journalfce3elemtype");
                
                /**
                 * Gets the "Cit-jour" element
                 */
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour getCitJour();
                
                /**
                 * Sets the "Cit-jour" element
                 */
                void setCitJour(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour citJour);
                
                /**
                 * Appends and returns a new empty "Cit-jour" element
                 */
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour addNewCitJour();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal newInstance() {
                      return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML book(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Book extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Book.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bookdac1elemtype");
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book newInstance() {
                      return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML proc(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Proc extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Proc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("procbbb4elemtype");
                
                /**
                 * Gets the "Cit-proc" element
                 */
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc getCitProc();
                
                /**
                 * Sets the "Cit-proc" element
                 */
                void setCitProc(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc citProc);
                
                /**
                 * Appends and returns a new empty "Cit-proc" element
                 */
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc addNewCitProc();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc newInstance() {
                      return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ids extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ids02c4elemtype");
            
            /**
             * Gets the "ArticleIdSet" element
             */
            gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet getArticleIdSet();
            
            /**
             * Sets the "ArticleIdSet" element
             */
            void setArticleIdSet(gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet articleIdSet);
            
            /**
             * Appends and returns a new empty "ArticleIdSet" element
             */
            gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet addNewArticleIdSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt newInstance() {
              return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CitArtDocument.CitArt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CitArtDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitArtDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitArtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
