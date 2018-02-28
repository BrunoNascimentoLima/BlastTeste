/*
 * An XML document type.
 * Localname: PCRReaction
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRReactionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PCRReaction(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PCRReactionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCRReactionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pcrreaction4434doctype");
    
    /**
     * Gets the "PCRReaction" element
     */
    gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction getPCRReaction();
    
    /**
     * Sets the "PCRReaction" element
     */
    void setPCRReaction(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction pcrReaction);
    
    /**
     * Appends and returns a new empty "PCRReaction" element
     */
    gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction addNewPCRReaction();
    
    /**
     * An XML PCRReaction(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PCRReaction extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PCRReaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pcrreactiondfa8elemtype");
        
        /**
         * Gets the "forward" element
         */
        gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward getForward();
        
        /**
         * True if has "forward" element
         */
        boolean isSetForward();
        
        /**
         * Sets the "forward" element
         */
        void setForward(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward forward);
        
        /**
         * Appends and returns a new empty "forward" element
         */
        gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward addNewForward();
        
        /**
         * Unsets the "forward" element
         */
        void unsetForward();
        
        /**
         * Gets the "reverse" element
         */
        gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse getReverse();
        
        /**
         * True if has "reverse" element
         */
        boolean isSetReverse();
        
        /**
         * Sets the "reverse" element
         */
        void setReverse(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse reverse);
        
        /**
         * Appends and returns a new empty "reverse" element
         */
        gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse addNewReverse();
        
        /**
         * Unsets the "reverse" element
         */
        void unsetReverse();
        
        /**
         * An XML forward(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Forward extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Forward.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("forwardc7d9elemtype");
            
            /**
             * Gets the "PCRPrimerSet" element
             */
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet getPCRPrimerSet();
            
            /**
             * Sets the "PCRPrimerSet" element
             */
            void setPCRPrimerSet(gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet pcrPrimerSet);
            
            /**
             * Appends and returns a new empty "PCRPrimerSet" element
             */
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet addNewPCRPrimerSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward newInstance() {
                  return (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML reverse(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Reverse extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reverse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("reverse8cf6elemtype");
            
            /**
             * Gets the "PCRPrimerSet" element
             */
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet getPCRPrimerSet();
            
            /**
             * Sets the "PCRPrimerSet" element
             */
            void setPCRPrimerSet(gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet pcrPrimerSet);
            
            /**
             * Appends and returns a new empty "PCRPrimerSet" element
             */
            gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet addNewPCRPrimerSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse newInstance() {
                  return (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction newInstance() {
              return (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PCRReactionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PCRReactionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
