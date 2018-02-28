/*
 * An XML document type.
 * Localname: Feat-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.FeatIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Feat-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface FeatIdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("featid7e22doctype");
    
    /**
     * Gets the "Feat-id" element
     */
    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatId();
    
    /**
     * Sets the "Feat-id" element
     */
    void setFeatId(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId);
    
    /**
     * Appends and returns a new empty "Feat-id" element
     */
    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId();
    
    /**
     * An XML Feat-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface FeatId extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("featid2484elemtype");
        
        /**
         * Gets the "gibb" element
         */
        java.math.BigInteger getGibb();
        
        /**
         * Gets (as xml) the "gibb" element
         */
        org.apache.xmlbeans.XmlInteger xgetGibb();
        
        /**
         * True if has "gibb" element
         */
        boolean isSetGibb();
        
        /**
         * Sets the "gibb" element
         */
        void setGibb(java.math.BigInteger gibb);
        
        /**
         * Sets (as xml) the "gibb" element
         */
        void xsetGibb(org.apache.xmlbeans.XmlInteger gibb);
        
        /**
         * Unsets the "gibb" element
         */
        void unsetGibb();
        
        /**
         * Gets the "giim" element
         */
        gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim getGiim();
        
        /**
         * True if has "giim" element
         */
        boolean isSetGiim();
        
        /**
         * Sets the "giim" element
         */
        void setGiim(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim giim);
        
        /**
         * Appends and returns a new empty "giim" element
         */
        gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim addNewGiim();
        
        /**
         * Unsets the "giim" element
         */
        void unsetGiim();
        
        /**
         * Gets the "local" element
         */
        gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local getLocal();
        
        /**
         * True if has "local" element
         */
        boolean isSetLocal();
        
        /**
         * Sets the "local" element
         */
        void setLocal(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local local);
        
        /**
         * Appends and returns a new empty "local" element
         */
        gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local addNewLocal();
        
        /**
         * Unsets the "local" element
         */
        void unsetLocal();
        
        /**
         * Gets the "general" element
         */
        gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General getGeneral();
        
        /**
         * True if has "general" element
         */
        boolean isSetGeneral();
        
        /**
         * Sets the "general" element
         */
        void setGeneral(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General general);
        
        /**
         * Appends and returns a new empty "general" element
         */
        gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General addNewGeneral();
        
        /**
         * Unsets the "general" element
         */
        void unsetGeneral();
        
        /**
         * An XML giim(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Giim extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Giim.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("giimfea6elemtype");
            
            /**
             * Gets the "Giimport-id" element
             */
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId getGiimportId();
            
            /**
             * Sets the "Giimport-id" element
             */
            void setGiimportId(gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId giimportId);
            
            /**
             * Appends and returns a new empty "Giimport-id" element
             */
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId addNewGiimportId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim newInstance() {
                  return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML local(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Local extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Local.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("localf05belemtype");
            
            /**
             * Gets the "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId();
            
            /**
             * Sets the "Object-id" element
             */
            void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId);
            
            /**
             * Appends and returns a new empty "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local newInstance() {
                  return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML general(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface General extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(General.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("general51d8elemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General newInstance() {
                  return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId newInstance() {
              return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.FeatIdDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.FeatIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.FeatIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
