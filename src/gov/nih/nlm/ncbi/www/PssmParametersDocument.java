/*
 * An XML document type.
 * Localname: PssmParameters
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmParametersDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PssmParameters(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PssmParametersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmParametersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmparameters5d05doctype");
    
    /**
     * Gets the "PssmParameters" element
     */
    gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters getPssmParameters();
    
    /**
     * Sets the "PssmParameters" element
     */
    void setPssmParameters(gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters pssmParameters);
    
    /**
     * Appends and returns a new empty "PssmParameters" element
     */
    gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters addNewPssmParameters();
    
    /**
     * An XML PssmParameters(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PssmParameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmparametersa9c2elemtype");
        
        /**
         * Gets the "pseudocount" element
         */
        java.math.BigInteger getPseudocount();
        
        /**
         * Gets (as xml) the "pseudocount" element
         */
        org.apache.xmlbeans.XmlInteger xgetPseudocount();
        
        /**
         * True if has "pseudocount" element
         */
        boolean isSetPseudocount();
        
        /**
         * Sets the "pseudocount" element
         */
        void setPseudocount(java.math.BigInteger pseudocount);
        
        /**
         * Sets (as xml) the "pseudocount" element
         */
        void xsetPseudocount(org.apache.xmlbeans.XmlInteger pseudocount);
        
        /**
         * Unsets the "pseudocount" element
         */
        void unsetPseudocount();
        
        /**
         * Gets the "rpsdbparams" element
         */
        gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams getRpsdbparams();
        
        /**
         * True if has "rpsdbparams" element
         */
        boolean isSetRpsdbparams();
        
        /**
         * Sets the "rpsdbparams" element
         */
        void setRpsdbparams(gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams rpsdbparams);
        
        /**
         * Appends and returns a new empty "rpsdbparams" element
         */
        gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams addNewRpsdbparams();
        
        /**
         * Unsets the "rpsdbparams" element
         */
        void unsetRpsdbparams();
        
        /**
         * Gets the "constraints" element
         */
        gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints getConstraints();
        
        /**
         * True if has "constraints" element
         */
        boolean isSetConstraints();
        
        /**
         * Sets the "constraints" element
         */
        void setConstraints(gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints constraints);
        
        /**
         * Appends and returns a new empty "constraints" element
         */
        gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints addNewConstraints();
        
        /**
         * Unsets the "constraints" element
         */
        void unsetConstraints();
        
        /**
         * An XML rpsdbparams(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Rpsdbparams extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rpsdbparams.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rpsdbparams43e7elemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML constraints(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Constraints extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Constraints.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("constraintsa8e4elemtype");
            
            /**
             * Gets the "CoreDef" element
             */
            gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef getCoreDef();
            
            /**
             * Sets the "CoreDef" element
             */
            void setCoreDef(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef coreDef);
            
            /**
             * Appends and returns a new empty "CoreDef" element
             */
            gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef addNewCoreDef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters newInstance() {
              return (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmParametersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
