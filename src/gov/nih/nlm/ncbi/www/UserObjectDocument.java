/*
 * An XML document type.
 * Localname: User-object
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.UserObjectDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one User-object(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface UserObjectDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserObjectDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("userobjectf00ddoctype");
    
    /**
     * Gets the "User-object" element
     */
    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject();
    
    /**
     * Sets the "User-object" element
     */
    void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
    
    /**
     * Appends and returns a new empty "User-object" element
     */
    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
    
    /**
     * An XML User-object(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface UserObject extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("userobject079aelemtype");
        
        /**
         * Gets the "class" element
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" element
         */
        org.apache.xmlbeans.XmlString xgetClass1();
        
        /**
         * True if has "class" element
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" element
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" element
         */
        void xsetClass1(org.apache.xmlbeans.XmlString class1);
        
        /**
         * Unsets the "class" element
         */
        void unsetClass1();
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type addNewType();
        
        /**
         * Gets the "data" element
         */
        gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data getData();
        
        /**
         * Sets the "data" element
         */
        void setData(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data addNewData();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Type extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("type1970elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Data extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("data69e0elemtype");
            
            /**
             * Gets array of all "User-field" elements
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] getUserFieldArray();
            
            /**
             * Gets ith "User-field" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField getUserFieldArray(int i);
            
            /**
             * Returns number of "User-field" element
             */
            int sizeOfUserFieldArray();
            
            /**
             * Sets array of all "User-field" element
             */
            void setUserFieldArray(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] userFieldArray);
            
            /**
             * Sets ith "User-field" element
             */
            void setUserFieldArray(int i, gov.nih.nlm.ncbi.www.UserFieldDocument.UserField userField);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "User-field" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField insertNewUserField(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "User-field" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField addNewUserField();
            
            /**
             * Removes the ith "User-field" element
             */
            void removeUserField(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data newInstance() {
                  return (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject newInstance() {
              return (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.UserObjectDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.UserObjectDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.UserObjectDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
