/*
 * An XML document type.
 * Localname: Code-break
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CodeBreakDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Code-break(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CodeBreakDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeBreakDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("codebreakbd3ddoctype");
    
    /**
     * Gets the "Code-break" element
     */
    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak getCodeBreak();
    
    /**
     * Sets the "Code-break" element
     */
    void setCodeBreak(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak codeBreak);
    
    /**
     * Appends and returns a new empty "Code-break" element
     */
    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak addNewCodeBreak();
    
    /**
     * An XML Code-break(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CodeBreak extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeBreak.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("codebreak53c2elemtype");
        
        /**
         * Gets the "loc" element
         */
        gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc getLoc();
        
        /**
         * Sets the "loc" element
         */
        void setLoc(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc loc);
        
        /**
         * Appends and returns a new empty "loc" element
         */
        gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc addNewLoc();
        
        /**
         * Gets the "aa" element
         */
        gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa getAa();
        
        /**
         * Sets the "aa" element
         */
        void setAa(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa aa);
        
        /**
         * Appends and returns a new empty "aa" element
         */
        gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa addNewAa();
        
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Loc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("loc0e6eelemtype");
            
            /**
             * Gets the "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
            
            /**
             * Sets the "Seq-loc" element
             */
            void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc newInstance() {
                  return (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML aa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Aa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("aabd7eelemtype");
            
            /**
             * Gets the "ncbieaa" element
             */
            java.math.BigInteger getNcbieaa();
            
            /**
             * Gets (as xml) the "ncbieaa" element
             */
            org.apache.xmlbeans.XmlInteger xgetNcbieaa();
            
            /**
             * True if has "ncbieaa" element
             */
            boolean isSetNcbieaa();
            
            /**
             * Sets the "ncbieaa" element
             */
            void setNcbieaa(java.math.BigInteger ncbieaa);
            
            /**
             * Sets (as xml) the "ncbieaa" element
             */
            void xsetNcbieaa(org.apache.xmlbeans.XmlInteger ncbieaa);
            
            /**
             * Unsets the "ncbieaa" element
             */
            void unsetNcbieaa();
            
            /**
             * Gets the "ncbi8aa" element
             */
            java.math.BigInteger getNcbi8Aa();
            
            /**
             * Gets (as xml) the "ncbi8aa" element
             */
            org.apache.xmlbeans.XmlInteger xgetNcbi8Aa();
            
            /**
             * True if has "ncbi8aa" element
             */
            boolean isSetNcbi8Aa();
            
            /**
             * Sets the "ncbi8aa" element
             */
            void setNcbi8Aa(java.math.BigInteger ncbi8Aa);
            
            /**
             * Sets (as xml) the "ncbi8aa" element
             */
            void xsetNcbi8Aa(org.apache.xmlbeans.XmlInteger ncbi8Aa);
            
            /**
             * Unsets the "ncbi8aa" element
             */
            void unsetNcbi8Aa();
            
            /**
             * Gets the "ncbistdaa" element
             */
            java.math.BigInteger getNcbistdaa();
            
            /**
             * Gets (as xml) the "ncbistdaa" element
             */
            org.apache.xmlbeans.XmlInteger xgetNcbistdaa();
            
            /**
             * True if has "ncbistdaa" element
             */
            boolean isSetNcbistdaa();
            
            /**
             * Sets the "ncbistdaa" element
             */
            void setNcbistdaa(java.math.BigInteger ncbistdaa);
            
            /**
             * Sets (as xml) the "ncbistdaa" element
             */
            void xsetNcbistdaa(org.apache.xmlbeans.XmlInteger ncbistdaa);
            
            /**
             * Unsets the "ncbistdaa" element
             */
            void unsetNcbistdaa();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa newInstance() {
                  return (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak newInstance() {
              return (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CodeBreakDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CodeBreakDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
