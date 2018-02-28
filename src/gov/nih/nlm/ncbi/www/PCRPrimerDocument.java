/*
 * An XML document type.
 * Localname: PCRPrimer
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRPrimerDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PCRPrimer(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PCRPrimerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCRPrimerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pcrprimer3e5edoctype");
    
    /**
     * Gets the "PCRPrimer" element
     */
    gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer getPCRPrimer();
    
    /**
     * Sets the "PCRPrimer" element
     */
    void setPCRPrimer(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer pcrPrimer);
    
    /**
     * Appends and returns a new empty "PCRPrimer" element
     */
    gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer addNewPCRPrimer();
    
    /**
     * An XML PCRPrimer(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PCRPrimer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCRPrimer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pcrprimer9e3celemtype");
        
        /**
         * Gets the "seq" element
         */
        gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq getSeq();
        
        /**
         * True if has "seq" element
         */
        boolean isSetSeq();
        
        /**
         * Sets the "seq" element
         */
        void setSeq(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq seq);
        
        /**
         * Appends and returns a new empty "seq" element
         */
        gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq addNewSeq();
        
        /**
         * Unsets the "seq" element
         */
        void unsetSeq();
        
        /**
         * Gets the "name" element
         */
        gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name getName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name name);
        
        /**
         * Appends and returns a new empty "name" element
         */
        gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name addNewName();
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seq extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seq2b87elemtype");
            
            /**
             * Gets the "PCRPrimerSeq" element
             */
            java.lang.String getPCRPrimerSeq();
            
            /**
             * Gets (as xml) the "PCRPrimerSeq" element
             */
            org.apache.xmlbeans.XmlString xgetPCRPrimerSeq();
            
            /**
             * Sets the "PCRPrimerSeq" element
             */
            void setPCRPrimerSeq(java.lang.String pcrPrimerSeq);
            
            /**
             * Sets (as xml) the "PCRPrimerSeq" element
             */
            void xsetPCRPrimerSeq(org.apache.xmlbeans.XmlString pcrPrimerSeq);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq newInstance() {
                  return (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Name extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("name9fe3elemtype");
            
            /**
             * Gets the "PCRPrimerName" element
             */
            java.lang.String getPCRPrimerName();
            
            /**
             * Gets (as xml) the "PCRPrimerName" element
             */
            org.apache.xmlbeans.XmlString xgetPCRPrimerName();
            
            /**
             * Sets the "PCRPrimerName" element
             */
            void setPCRPrimerName(java.lang.String pcrPrimerName);
            
            /**
             * Sets (as xml) the "PCRPrimerName" element
             */
            void xsetPCRPrimerName(org.apache.xmlbeans.XmlString pcrPrimerName);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name newInstance() {
                  return (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer newInstance() {
              return (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PCRPrimerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PCRPrimerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
