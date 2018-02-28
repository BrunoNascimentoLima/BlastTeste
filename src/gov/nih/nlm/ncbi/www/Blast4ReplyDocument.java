/*
 * An XML document type.
 * Localname: Blast4-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4ReplyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4ReplyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4reply11f7doctype");
    
    /**
     * Gets the "Blast4-reply" element
     */
    gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply getBlast4Reply();
    
    /**
     * Sets the "Blast4-reply" element
     */
    void setBlast4Reply(gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply blast4Reply);
    
    /**
     * Appends and returns a new empty "Blast4-reply" element
     */
    gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply addNewBlast4Reply();
    
    /**
     * An XML Blast4-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4Reply extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4Reply.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4reply2f02elemtype");
        
        /**
         * Gets the "errors" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors getErrors();
        
        /**
         * True if has "errors" element
         */
        boolean isSetErrors();
        
        /**
         * Sets the "errors" element
         */
        void setErrors(gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors errors);
        
        /**
         * Appends and returns a new empty "errors" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors addNewErrors();
        
        /**
         * Unsets the "errors" element
         */
        void unsetErrors();
        
        /**
         * Gets the "body" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body getBody();
        
        /**
         * Sets the "body" element
         */
        void setBody(gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body body);
        
        /**
         * Appends and returns a new empty "body" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body addNewBody();
        
        /**
         * An XML errors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Errors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("errorsee49elemtype");
            
            /**
             * Gets array of all "Blast4-error" elements
             */
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error[] getBlast4ErrorArray();
            
            /**
             * Gets ith "Blast4-error" element
             */
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error getBlast4ErrorArray(int i);
            
            /**
             * Returns number of "Blast4-error" element
             */
            int sizeOfBlast4ErrorArray();
            
            /**
             * Sets array of all "Blast4-error" element
             */
            void setBlast4ErrorArray(gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error[] blast4ErrorArray);
            
            /**
             * Sets ith "Blast4-error" element
             */
            void setBlast4ErrorArray(int i, gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error blast4Error);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-error" element
             */
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error insertNewBlast4Error(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-error" element
             */
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error addNewBlast4Error();
            
            /**
             * Removes the ith "Blast4-error" element
             */
            void removeBlast4Error(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML body(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Body extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Body.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("body7bc0elemtype");
            
            /**
             * Gets the "Blast4-reply-body" element
             */
            gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody getBlast4ReplyBody();
            
            /**
             * Sets the "Blast4-reply-body" element
             */
            void setBlast4ReplyBody(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody blast4ReplyBody);
            
            /**
             * Appends and returns a new empty "Blast4-reply-body" element
             */
            gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody addNewBlast4ReplyBody();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
