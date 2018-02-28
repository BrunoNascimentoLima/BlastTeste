/*
 * An XML document type.
 * Localname: Seq-literal
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqLiteralDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-literal(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqLiteralDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLiteralDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqliteral69cddoctype");
    
    /**
     * Gets the "Seq-literal" element
     */
    gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral getSeqLiteral();
    
    /**
     * Sets the "Seq-literal" element
     */
    void setSeqLiteral(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral seqLiteral);
    
    /**
     * Appends and returns a new empty "Seq-literal" element
     */
    gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral addNewSeqLiteral();
    
    /**
     * An XML Seq-literal(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqLiteral extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLiteral.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqliteraleb1aelemtype");
        
        /**
         * Gets the "length" element
         */
        java.math.BigInteger getLength();
        
        /**
         * Gets (as xml) the "length" element
         */
        org.apache.xmlbeans.XmlInteger xgetLength();
        
        /**
         * Sets the "length" element
         */
        void setLength(java.math.BigInteger length);
        
        /**
         * Sets (as xml) the "length" element
         */
        void xsetLength(org.apache.xmlbeans.XmlInteger length);
        
        /**
         * Gets the "fuzz" element
         */
        gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz getFuzz();
        
        /**
         * True if has "fuzz" element
         */
        boolean isSetFuzz();
        
        /**
         * Sets the "fuzz" element
         */
        void setFuzz(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz fuzz);
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz addNewFuzz();
        
        /**
         * Unsets the "fuzz" element
         */
        void unsetFuzz();
        
        /**
         * Gets the "seq-data" element
         */
        gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData getSeqData();
        
        /**
         * True if has "seq-data" element
         */
        boolean isSetSeqData();
        
        /**
         * Sets the "seq-data" element
         */
        void setSeqData(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData seqData);
        
        /**
         * Appends and returns a new empty "seq-data" element
         */
        gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData addNewSeqData();
        
        /**
         * Unsets the "seq-data" element
         */
        void unsetSeqData();
        
        /**
         * An XML fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Fuzz extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fuzz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fuzz4f05elemtype");
            
            /**
             * Gets the "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz();
            
            /**
             * Sets the "Int-fuzz" element
             */
            void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz);
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqdataa80eelemtype");
            
            /**
             * Gets the "Seq-data" element
             */
            gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData getSeqData();
            
            /**
             * Sets the "Seq-data" element
             */
            void setSeqData(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData seqData);
            
            /**
             * Appends and returns a new empty "Seq-data" element
             */
            gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData addNewSeqData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqLiteralDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqLiteralDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
