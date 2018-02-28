/*
 * An XML document type.
 * Localname: Cit-gen
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitGenDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Cit-gen(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CitGenDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitGenDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citgen29dddoctype");
    
    /**
     * Gets the "Cit-gen" element
     */
    gov.nih.nlm.ncbi.www.CitGenDocument.CitGen getCitGen();
    
    /**
     * Sets the "Cit-gen" element
     */
    void setCitGen(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen citGen);
    
    /**
     * Appends and returns a new empty "Cit-gen" element
     */
    gov.nih.nlm.ncbi.www.CitGenDocument.CitGen addNewCitGen();
    
    /**
     * An XML Cit-gen(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CitGen extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitGen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citgen4e3aelemtype");
        
        /**
         * Gets the "cit" element
         */
        java.lang.String getCit();
        
        /**
         * Gets (as xml) the "cit" element
         */
        org.apache.xmlbeans.XmlString xgetCit();
        
        /**
         * True if has "cit" element
         */
        boolean isSetCit();
        
        /**
         * Sets the "cit" element
         */
        void setCit(java.lang.String cit);
        
        /**
         * Sets (as xml) the "cit" element
         */
        void xsetCit(org.apache.xmlbeans.XmlString cit);
        
        /**
         * Unsets the "cit" element
         */
        void unsetCit();
        
        /**
         * Gets the "authors" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors getAuthors();
        
        /**
         * True if has "authors" element
         */
        boolean isSetAuthors();
        
        /**
         * Sets the "authors" element
         */
        void setAuthors(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors authors);
        
        /**
         * Appends and returns a new empty "authors" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors addNewAuthors();
        
        /**
         * Unsets the "authors" element
         */
        void unsetAuthors();
        
        /**
         * Gets the "muid" element
         */
        java.math.BigInteger getMuid();
        
        /**
         * Gets (as xml) the "muid" element
         */
        org.apache.xmlbeans.XmlInteger xgetMuid();
        
        /**
         * True if has "muid" element
         */
        boolean isSetMuid();
        
        /**
         * Sets the "muid" element
         */
        void setMuid(java.math.BigInteger muid);
        
        /**
         * Sets (as xml) the "muid" element
         */
        void xsetMuid(org.apache.xmlbeans.XmlInteger muid);
        
        /**
         * Unsets the "muid" element
         */
        void unsetMuid();
        
        /**
         * Gets the "journal" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal getJournal();
        
        /**
         * True if has "journal" element
         */
        boolean isSetJournal();
        
        /**
         * Sets the "journal" element
         */
        void setJournal(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal journal);
        
        /**
         * Appends and returns a new empty "journal" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal addNewJournal();
        
        /**
         * Unsets the "journal" element
         */
        void unsetJournal();
        
        /**
         * Gets the "volume" element
         */
        java.lang.String getVolume();
        
        /**
         * Gets (as xml) the "volume" element
         */
        org.apache.xmlbeans.XmlString xgetVolume();
        
        /**
         * True if has "volume" element
         */
        boolean isSetVolume();
        
        /**
         * Sets the "volume" element
         */
        void setVolume(java.lang.String volume);
        
        /**
         * Sets (as xml) the "volume" element
         */
        void xsetVolume(org.apache.xmlbeans.XmlString volume);
        
        /**
         * Unsets the "volume" element
         */
        void unsetVolume();
        
        /**
         * Gets the "issue" element
         */
        java.lang.String getIssue();
        
        /**
         * Gets (as xml) the "issue" element
         */
        org.apache.xmlbeans.XmlString xgetIssue();
        
        /**
         * True if has "issue" element
         */
        boolean isSetIssue();
        
        /**
         * Sets the "issue" element
         */
        void setIssue(java.lang.String issue);
        
        /**
         * Sets (as xml) the "issue" element
         */
        void xsetIssue(org.apache.xmlbeans.XmlString issue);
        
        /**
         * Unsets the "issue" element
         */
        void unsetIssue();
        
        /**
         * Gets the "pages" element
         */
        java.lang.String getPages();
        
        /**
         * Gets (as xml) the "pages" element
         */
        org.apache.xmlbeans.XmlString xgetPages();
        
        /**
         * True if has "pages" element
         */
        boolean isSetPages();
        
        /**
         * Sets the "pages" element
         */
        void setPages(java.lang.String pages);
        
        /**
         * Sets (as xml) the "pages" element
         */
        void xsetPages(org.apache.xmlbeans.XmlString pages);
        
        /**
         * Unsets the "pages" element
         */
        void unsetPages();
        
        /**
         * Gets the "date" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date getDate();
        
        /**
         * True if has "date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date date);
        
        /**
         * Appends and returns a new empty "date" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date addNewDate();
        
        /**
         * Unsets the "date" element
         */
        void unsetDate();
        
        /**
         * Gets the "serial-number" element
         */
        java.math.BigInteger getSerialNumber();
        
        /**
         * Gets (as xml) the "serial-number" element
         */
        org.apache.xmlbeans.XmlInteger xgetSerialNumber();
        
        /**
         * True if has "serial-number" element
         */
        boolean isSetSerialNumber();
        
        /**
         * Sets the "serial-number" element
         */
        void setSerialNumber(java.math.BigInteger serialNumber);
        
        /**
         * Sets (as xml) the "serial-number" element
         */
        void xsetSerialNumber(org.apache.xmlbeans.XmlInteger serialNumber);
        
        /**
         * Unsets the "serial-number" element
         */
        void unsetSerialNumber();
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "pmid" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid getPmid();
        
        /**
         * True if has "pmid" element
         */
        boolean isSetPmid();
        
        /**
         * Sets the "pmid" element
         */
        void setPmid(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid pmid);
        
        /**
         * Appends and returns a new empty "pmid" element
         */
        gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid addNewPmid();
        
        /**
         * Unsets the "pmid" element
         */
        void unsetPmid();
        
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Authors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authors42eeelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML journal(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Journal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Journal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("journala7ddelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Date extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datebe84elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmid extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmida2aeelemtype");
            
            /**
             * Gets the "PubMedId" element
             */
            java.math.BigInteger getPubMedId();
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger xgetPubMedId();
            
            /**
             * Sets the "PubMedId" element
             */
            void setPubMedId(java.math.BigInteger pubMedId);
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen newInstance() {
              return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CitGenDocument.CitGen newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CitGenDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitGenDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitGenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
