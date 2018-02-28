/*
 * An XML document type.
 * Localname: FormatRpsDbParameters
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one FormatRpsDbParameters(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface FormatRpsDbParametersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatRpsDbParametersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("formatrpsdbparametersd0f2doctype");
    
    /**
     * Gets the "FormatRpsDbParameters" element
     */
    gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters getFormatRpsDbParameters();
    
    /**
     * Sets the "FormatRpsDbParameters" element
     */
    void setFormatRpsDbParameters(gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters formatRpsDbParameters);
    
    /**
     * Appends and returns a new empty "FormatRpsDbParameters" element
     */
    gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters addNewFormatRpsDbParameters();
    
    /**
     * An XML FormatRpsDbParameters(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface FormatRpsDbParameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatRpsDbParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("formatrpsdbparameters10e4elemtype");
        
        /**
         * Gets the "matrixName" element
         */
        java.lang.String getMatrixName();
        
        /**
         * Gets (as xml) the "matrixName" element
         */
        org.apache.xmlbeans.XmlString xgetMatrixName();
        
        /**
         * Sets the "matrixName" element
         */
        void setMatrixName(java.lang.String matrixName);
        
        /**
         * Sets (as xml) the "matrixName" element
         */
        void xsetMatrixName(org.apache.xmlbeans.XmlString matrixName);
        
        /**
         * Gets the "gapOpen" element
         */
        java.math.BigInteger getGapOpen();
        
        /**
         * Gets (as xml) the "gapOpen" element
         */
        org.apache.xmlbeans.XmlInteger xgetGapOpen();
        
        /**
         * True if has "gapOpen" element
         */
        boolean isSetGapOpen();
        
        /**
         * Sets the "gapOpen" element
         */
        void setGapOpen(java.math.BigInteger gapOpen);
        
        /**
         * Sets (as xml) the "gapOpen" element
         */
        void xsetGapOpen(org.apache.xmlbeans.XmlInteger gapOpen);
        
        /**
         * Unsets the "gapOpen" element
         */
        void unsetGapOpen();
        
        /**
         * Gets the "gapExtend" element
         */
        java.math.BigInteger getGapExtend();
        
        /**
         * Gets (as xml) the "gapExtend" element
         */
        org.apache.xmlbeans.XmlInteger xgetGapExtend();
        
        /**
         * True if has "gapExtend" element
         */
        boolean isSetGapExtend();
        
        /**
         * Sets the "gapExtend" element
         */
        void setGapExtend(java.math.BigInteger gapExtend);
        
        /**
         * Sets (as xml) the "gapExtend" element
         */
        void xsetGapExtend(org.apache.xmlbeans.XmlInteger gapExtend);
        
        /**
         * Unsets the "gapExtend" element
         */
        void unsetGapExtend();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters newInstance() {
              return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
