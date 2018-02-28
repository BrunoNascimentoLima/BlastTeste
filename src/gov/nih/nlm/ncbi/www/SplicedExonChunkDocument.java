/*
 * An XML document type.
 * Localname: Spliced-exon-chunk
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedExonChunkDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Spliced-exon-chunk(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SplicedExonChunkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SplicedExonChunkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicedexonchunkc755doctype");
    
    /**
     * Gets the "Spliced-exon-chunk" element
     */
    gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk getSplicedExonChunk();
    
    /**
     * Sets the "Spliced-exon-chunk" element
     */
    void setSplicedExonChunk(gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk splicedExonChunk);
    
    /**
     * Appends and returns a new empty "Spliced-exon-chunk" element
     */
    gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk addNewSplicedExonChunk();
    
    /**
     * An XML Spliced-exon-chunk(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SplicedExonChunk extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SplicedExonChunk.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicedexonchunkacc2elemtype");
        
        /**
         * Gets the "match" element
         */
        java.math.BigInteger getMatch();
        
        /**
         * Gets (as xml) the "match" element
         */
        org.apache.xmlbeans.XmlInteger xgetMatch();
        
        /**
         * True if has "match" element
         */
        boolean isSetMatch();
        
        /**
         * Sets the "match" element
         */
        void setMatch(java.math.BigInteger match);
        
        /**
         * Sets (as xml) the "match" element
         */
        void xsetMatch(org.apache.xmlbeans.XmlInteger match);
        
        /**
         * Unsets the "match" element
         */
        void unsetMatch();
        
        /**
         * Gets the "mismatch" element
         */
        java.math.BigInteger getMismatch();
        
        /**
         * Gets (as xml) the "mismatch" element
         */
        org.apache.xmlbeans.XmlInteger xgetMismatch();
        
        /**
         * True if has "mismatch" element
         */
        boolean isSetMismatch();
        
        /**
         * Sets the "mismatch" element
         */
        void setMismatch(java.math.BigInteger mismatch);
        
        /**
         * Sets (as xml) the "mismatch" element
         */
        void xsetMismatch(org.apache.xmlbeans.XmlInteger mismatch);
        
        /**
         * Unsets the "mismatch" element
         */
        void unsetMismatch();
        
        /**
         * Gets the "diag" element
         */
        java.math.BigInteger getDiag();
        
        /**
         * Gets (as xml) the "diag" element
         */
        org.apache.xmlbeans.XmlInteger xgetDiag();
        
        /**
         * True if has "diag" element
         */
        boolean isSetDiag();
        
        /**
         * Sets the "diag" element
         */
        void setDiag(java.math.BigInteger diag);
        
        /**
         * Sets (as xml) the "diag" element
         */
        void xsetDiag(org.apache.xmlbeans.XmlInteger diag);
        
        /**
         * Unsets the "diag" element
         */
        void unsetDiag();
        
        /**
         * Gets the "product-ins" element
         */
        java.math.BigInteger getProductIns();
        
        /**
         * Gets (as xml) the "product-ins" element
         */
        org.apache.xmlbeans.XmlInteger xgetProductIns();
        
        /**
         * True if has "product-ins" element
         */
        boolean isSetProductIns();
        
        /**
         * Sets the "product-ins" element
         */
        void setProductIns(java.math.BigInteger productIns);
        
        /**
         * Sets (as xml) the "product-ins" element
         */
        void xsetProductIns(org.apache.xmlbeans.XmlInteger productIns);
        
        /**
         * Unsets the "product-ins" element
         */
        void unsetProductIns();
        
        /**
         * Gets the "genomic-ins" element
         */
        java.math.BigInteger getGenomicIns();
        
        /**
         * Gets (as xml) the "genomic-ins" element
         */
        org.apache.xmlbeans.XmlInteger xgetGenomicIns();
        
        /**
         * True if has "genomic-ins" element
         */
        boolean isSetGenomicIns();
        
        /**
         * Sets the "genomic-ins" element
         */
        void setGenomicIns(java.math.BigInteger genomicIns);
        
        /**
         * Sets (as xml) the "genomic-ins" element
         */
        void xsetGenomicIns(org.apache.xmlbeans.XmlInteger genomicIns);
        
        /**
         * Unsets the "genomic-ins" element
         */
        void unsetGenomicIns();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk newInstance() {
              return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SplicedExonChunkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SplicedExonChunkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
