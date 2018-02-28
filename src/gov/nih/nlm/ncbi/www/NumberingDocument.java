/*
 * An XML document type.
 * Localname: Numbering
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumberingDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Numbering(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface NumberingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumberingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("numbering6645doctype");
    
    /**
     * Gets the "Numbering" element
     */
    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering();
    
    /**
     * Sets the "Numbering" element
     */
    void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering);
    
    /**
     * Appends and returns a new empty "Numbering" element
     */
    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering();
    
    /**
     * An XML Numbering(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Numbering extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Numbering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("numbering4b8aelemtype");
        
        /**
         * Gets the "cont" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont getCont();
        
        /**
         * True if has "cont" element
         */
        boolean isSetCont();
        
        /**
         * Sets the "cont" element
         */
        void setCont(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont cont);
        
        /**
         * Appends and returns a new empty "cont" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont addNewCont();
        
        /**
         * Unsets the "cont" element
         */
        void unsetCont();
        
        /**
         * Gets the "enum" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 getEnum();
        
        /**
         * True if has "enum" element
         */
        boolean isSetEnum();
        
        /**
         * Sets the "enum" element
         */
        void setEnum(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 xenum);
        
        /**
         * Appends and returns a new empty "enum" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 addNewEnum();
        
        /**
         * Unsets the "enum" element
         */
        void unsetEnum();
        
        /**
         * Gets the "ref" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref getRef();
        
        /**
         * True if has "ref" element
         */
        boolean isSetRef();
        
        /**
         * Sets the "ref" element
         */
        void setRef(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref ref);
        
        /**
         * Appends and returns a new empty "ref" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref addNewRef();
        
        /**
         * Unsets the "ref" element
         */
        void unsetRef();
        
        /**
         * Gets the "real" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real getReal();
        
        /**
         * True if has "real" element
         */
        boolean isSetReal();
        
        /**
         * Sets the "real" element
         */
        void setReal(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real real);
        
        /**
         * Appends and returns a new empty "real" element
         */
        gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real addNewReal();
        
        /**
         * Unsets the "real" element
         */
        void unsetReal();
        
        /**
         * An XML cont(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Cont extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cont.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cont4c58elemtype");
            
            /**
             * Gets the "Num-cont" element
             */
            gov.nih.nlm.ncbi.www.NumContDocument.NumCont getNumCont();
            
            /**
             * Sets the "Num-cont" element
             */
            void setNumCont(gov.nih.nlm.ncbi.www.NumContDocument.NumCont numCont);
            
            /**
             * Appends and returns a new empty "Num-cont" element
             */
            gov.nih.nlm.ncbi.www.NumContDocument.NumCont addNewNumCont();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont newInstance() {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Cont) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML enum(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Enum1 extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Enum1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("enum38a7elemtype");
            
            /**
             * Gets the "Num-enum" element
             */
            gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum getNumEnum();
            
            /**
             * Sets the "Num-enum" element
             */
            void setNumEnum(gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum numEnum);
            
            /**
             * Appends and returns a new empty "Num-enum" element
             */
            gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum addNewNumEnum();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 newInstance() {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Enum1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("refe309elemtype");
            
            /**
             * Gets the "Num-ref" element
             */
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef getNumRef();
            
            /**
             * Sets the "Num-ref" element
             */
            void setNumRef(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef numRef);
            
            /**
             * Appends and returns a new empty "Num-ref" element
             */
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef addNewNumRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref newInstance() {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML real(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Real extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Real.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("reald8c4elemtype");
            
            /**
             * Gets the "Num-real" element
             */
            gov.nih.nlm.ncbi.www.NumRealDocument.NumReal getNumReal();
            
            /**
             * Sets the "Num-real" element
             */
            void setNumReal(gov.nih.nlm.ncbi.www.NumRealDocument.NumReal numReal);
            
            /**
             * Appends and returns a new empty "Num-real" element
             */
            gov.nih.nlm.ncbi.www.NumRealDocument.NumReal addNewNumReal();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real newInstance() {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering.Real) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering newInstance() {
              return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.NumberingDocument.Numbering newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.NumberingDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.NumberingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.NumberingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
