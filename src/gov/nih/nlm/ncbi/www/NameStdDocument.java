/*
 * An XML document type.
 * Localname: Name-std
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NameStdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Name-std(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface NameStdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameStdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("namestdc33fdoctype");
    
    /**
     * Gets the "Name-std" element
     */
    gov.nih.nlm.ncbi.www.NameStdDocument.NameStd getNameStd();
    
    /**
     * Sets the "Name-std" element
     */
    void setNameStd(gov.nih.nlm.ncbi.www.NameStdDocument.NameStd nameStd);
    
    /**
     * Appends and returns a new empty "Name-std" element
     */
    gov.nih.nlm.ncbi.www.NameStdDocument.NameStd addNewNameStd();
    
    /**
     * An XML Name-std(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface NameStd extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameStd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("namestd3802elemtype");
        
        /**
         * Gets the "last" element
         */
        java.lang.String getLast();
        
        /**
         * Gets (as xml) the "last" element
         */
        org.apache.xmlbeans.XmlString xgetLast();
        
        /**
         * Sets the "last" element
         */
        void setLast(java.lang.String last);
        
        /**
         * Sets (as xml) the "last" element
         */
        void xsetLast(org.apache.xmlbeans.XmlString last);
        
        /**
         * Gets the "first" element
         */
        java.lang.String getFirst();
        
        /**
         * Gets (as xml) the "first" element
         */
        org.apache.xmlbeans.XmlString xgetFirst();
        
        /**
         * True if has "first" element
         */
        boolean isSetFirst();
        
        /**
         * Sets the "first" element
         */
        void setFirst(java.lang.String first);
        
        /**
         * Sets (as xml) the "first" element
         */
        void xsetFirst(org.apache.xmlbeans.XmlString first);
        
        /**
         * Unsets the "first" element
         */
        void unsetFirst();
        
        /**
         * Gets the "middle" element
         */
        java.lang.String getMiddle();
        
        /**
         * Gets (as xml) the "middle" element
         */
        org.apache.xmlbeans.XmlString xgetMiddle();
        
        /**
         * True if has "middle" element
         */
        boolean isSetMiddle();
        
        /**
         * Sets the "middle" element
         */
        void setMiddle(java.lang.String middle);
        
        /**
         * Sets (as xml) the "middle" element
         */
        void xsetMiddle(org.apache.xmlbeans.XmlString middle);
        
        /**
         * Unsets the "middle" element
         */
        void unsetMiddle();
        
        /**
         * Gets the "full" element
         */
        java.lang.String getFull();
        
        /**
         * Gets (as xml) the "full" element
         */
        org.apache.xmlbeans.XmlString xgetFull();
        
        /**
         * True if has "full" element
         */
        boolean isSetFull();
        
        /**
         * Sets the "full" element
         */
        void setFull(java.lang.String full);
        
        /**
         * Sets (as xml) the "full" element
         */
        void xsetFull(org.apache.xmlbeans.XmlString full);
        
        /**
         * Unsets the "full" element
         */
        void unsetFull();
        
        /**
         * Gets the "initials" element
         */
        java.lang.String getInitials();
        
        /**
         * Gets (as xml) the "initials" element
         */
        org.apache.xmlbeans.XmlString xgetInitials();
        
        /**
         * True if has "initials" element
         */
        boolean isSetInitials();
        
        /**
         * Sets the "initials" element
         */
        void setInitials(java.lang.String initials);
        
        /**
         * Sets (as xml) the "initials" element
         */
        void xsetInitials(org.apache.xmlbeans.XmlString initials);
        
        /**
         * Unsets the "initials" element
         */
        void unsetInitials();
        
        /**
         * Gets the "suffix" element
         */
        java.lang.String getSuffix();
        
        /**
         * Gets (as xml) the "suffix" element
         */
        org.apache.xmlbeans.XmlString xgetSuffix();
        
        /**
         * True if has "suffix" element
         */
        boolean isSetSuffix();
        
        /**
         * Sets the "suffix" element
         */
        void setSuffix(java.lang.String suffix);
        
        /**
         * Sets (as xml) the "suffix" element
         */
        void xsetSuffix(org.apache.xmlbeans.XmlString suffix);
        
        /**
         * Unsets the "suffix" element
         */
        void unsetSuffix();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.NameStdDocument.NameStd newInstance() {
              return (gov.nih.nlm.ncbi.www.NameStdDocument.NameStd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.NameStdDocument.NameStd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.NameStdDocument.NameStd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.NameStdDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.NameStdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.NameStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
