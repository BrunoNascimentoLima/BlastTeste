/*
 * An XML document type.
 * Localname: PRF-ExtraSrc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PRFExtraSrcDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PRF-ExtraSrc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PRFExtraSrcDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PRFExtraSrcDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("prfextrasrc75bbdoctype");
    
    /**
     * Gets the "PRF-ExtraSrc" element
     */
    gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc getPRFExtraSrc();
    
    /**
     * Sets the "PRF-ExtraSrc" element
     */
    void setPRFExtraSrc(gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc prfExtraSrc);
    
    /**
     * Appends and returns a new empty "PRF-ExtraSrc" element
     */
    gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc addNewPRFExtraSrc();
    
    /**
     * An XML PRF-ExtraSrc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PRFExtraSrc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PRFExtraSrc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("prfextrasrcae82elemtype");
        
        /**
         * Gets the "host" element
         */
        java.lang.String getHost();
        
        /**
         * Gets (as xml) the "host" element
         */
        org.apache.xmlbeans.XmlString xgetHost();
        
        /**
         * True if has "host" element
         */
        boolean isSetHost();
        
        /**
         * Sets the "host" element
         */
        void setHost(java.lang.String host);
        
        /**
         * Sets (as xml) the "host" element
         */
        void xsetHost(org.apache.xmlbeans.XmlString host);
        
        /**
         * Unsets the "host" element
         */
        void unsetHost();
        
        /**
         * Gets the "part" element
         */
        java.lang.String getPart();
        
        /**
         * Gets (as xml) the "part" element
         */
        org.apache.xmlbeans.XmlString xgetPart();
        
        /**
         * True if has "part" element
         */
        boolean isSetPart();
        
        /**
         * Sets the "part" element
         */
        void setPart(java.lang.String part);
        
        /**
         * Sets (as xml) the "part" element
         */
        void xsetPart(org.apache.xmlbeans.XmlString part);
        
        /**
         * Unsets the "part" element
         */
        void unsetPart();
        
        /**
         * Gets the "state" element
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" element
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * True if has "state" element
         */
        boolean isSetState();
        
        /**
         * Sets the "state" element
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" element
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Unsets the "state" element
         */
        void unsetState();
        
        /**
         * Gets the "strain" element
         */
        java.lang.String getStrain();
        
        /**
         * Gets (as xml) the "strain" element
         */
        org.apache.xmlbeans.XmlString xgetStrain();
        
        /**
         * True if has "strain" element
         */
        boolean isSetStrain();
        
        /**
         * Sets the "strain" element
         */
        void setStrain(java.lang.String strain);
        
        /**
         * Sets (as xml) the "strain" element
         */
        void xsetStrain(org.apache.xmlbeans.XmlString strain);
        
        /**
         * Unsets the "strain" element
         */
        void unsetStrain();
        
        /**
         * Gets the "taxon" element
         */
        java.lang.String getTaxon();
        
        /**
         * Gets (as xml) the "taxon" element
         */
        org.apache.xmlbeans.XmlString xgetTaxon();
        
        /**
         * True if has "taxon" element
         */
        boolean isSetTaxon();
        
        /**
         * Sets the "taxon" element
         */
        void setTaxon(java.lang.String taxon);
        
        /**
         * Sets (as xml) the "taxon" element
         */
        void xsetTaxon(org.apache.xmlbeans.XmlString taxon);
        
        /**
         * Unsets the "taxon" element
         */
        void unsetTaxon();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc newInstance() {
              return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument.PRFExtraSrc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PRFExtraSrcDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PRFExtraSrcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
