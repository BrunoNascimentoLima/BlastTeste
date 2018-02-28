/*
 * An XML document type.
 * Localname: Blast4-common-options-discontiguous-megablast
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options-discontiguous-megablast(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsDiscontiguousMegablastDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDiscontiguousMegablastDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsdiscontiguousmegablasta2bbdoctype");
    
    /**
     * Gets the "Blast4-common-options-discontiguous-megablast" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast getBlast4CommonOptionsDiscontiguousMegablast();
    
    /**
     * Sets the "Blast4-common-options-discontiguous-megablast" element
     */
    void setBlast4CommonOptionsDiscontiguousMegablast(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast blast4CommonOptionsDiscontiguousMegablast);
    
    /**
     * Appends and returns a new empty "Blast4-common-options-discontiguous-megablast" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast addNewBlast4CommonOptionsDiscontiguousMegablast();
    
    /**
     * An XML Blast4-common-options-discontiguous-megablast(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptionsDiscontiguousMegablast extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDiscontiguousMegablast.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsdiscontiguousmegablast7576elemtype");
        
        /**
         * Gets the "template-type" element
         */
        java.math.BigInteger getTemplateType();
        
        /**
         * Gets (as xml) the "template-type" element
         */
        org.apache.xmlbeans.XmlInteger xgetTemplateType();
        
        /**
         * Sets the "template-type" element
         */
        void setTemplateType(java.math.BigInteger templateType);
        
        /**
         * Sets (as xml) the "template-type" element
         */
        void xsetTemplateType(org.apache.xmlbeans.XmlInteger templateType);
        
        /**
         * Gets the "template-length" element
         */
        java.math.BigInteger getTemplateLength();
        
        /**
         * Gets (as xml) the "template-length" element
         */
        org.apache.xmlbeans.XmlInteger xgetTemplateLength();
        
        /**
         * Sets the "template-length" element
         */
        void setTemplateLength(java.math.BigInteger templateLength);
        
        /**
         * Sets (as xml) the "template-length" element
         */
        void xsetTemplateLength(org.apache.xmlbeans.XmlInteger templateLength);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
