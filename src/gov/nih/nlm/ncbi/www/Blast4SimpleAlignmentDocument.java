/*
 * An XML document type.
 * Localname: Blast4-simple-alignment
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-simple-alignment(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4SimpleAlignmentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4SimpleAlignmentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4simplealignmentba05doctype");
    
    /**
     * Gets the "Blast4-simple-alignment" element
     */
    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment getBlast4SimpleAlignment();
    
    /**
     * Sets the "Blast4-simple-alignment" element
     */
    void setBlast4SimpleAlignment(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment blast4SimpleAlignment);
    
    /**
     * Appends and returns a new empty "Blast4-simple-alignment" element
     */
    gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment addNewBlast4SimpleAlignment();
    
    /**
     * An XML Blast4-simple-alignment(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4SimpleAlignment extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4SimpleAlignment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4simplealignment108aelemtype");
        
        /**
         * Gets the "subject-id" element
         */
        java.lang.String getSubjectId();
        
        /**
         * Gets (as xml) the "subject-id" element
         */
        org.apache.xmlbeans.XmlString xgetSubjectId();
        
        /**
         * Sets the "subject-id" element
         */
        void setSubjectId(java.lang.String subjectId);
        
        /**
         * Sets (as xml) the "subject-id" element
         */
        void xsetSubjectId(org.apache.xmlbeans.XmlString subjectId);
        
        /**
         * Gets the "e-value" element
         */
        double getEValue();
        
        /**
         * Gets (as xml) the "e-value" element
         */
        org.apache.xmlbeans.XmlDouble xgetEValue();
        
        /**
         * Sets the "e-value" element
         */
        void setEValue(double eValue);
        
        /**
         * Sets (as xml) the "e-value" element
         */
        void xsetEValue(org.apache.xmlbeans.XmlDouble eValue);
        
        /**
         * Gets the "bit-score" element
         */
        double getBitScore();
        
        /**
         * Gets (as xml) the "bit-score" element
         */
        org.apache.xmlbeans.XmlDouble xgetBitScore();
        
        /**
         * Sets the "bit-score" element
         */
        void setBitScore(double bitScore);
        
        /**
         * Sets (as xml) the "bit-score" element
         */
        void xsetBitScore(org.apache.xmlbeans.XmlDouble bitScore);
        
        /**
         * Gets the "num-identities" element
         */
        java.math.BigInteger getNumIdentities();
        
        /**
         * Gets (as xml) the "num-identities" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumIdentities();
        
        /**
         * True if has "num-identities" element
         */
        boolean isSetNumIdentities();
        
        /**
         * Sets the "num-identities" element
         */
        void setNumIdentities(java.math.BigInteger numIdentities);
        
        /**
         * Sets (as xml) the "num-identities" element
         */
        void xsetNumIdentities(org.apache.xmlbeans.XmlInteger numIdentities);
        
        /**
         * Unsets the "num-identities" element
         */
        void unsetNumIdentities();
        
        /**
         * Gets the "num-indels" element
         */
        java.math.BigInteger getNumIndels();
        
        /**
         * Gets (as xml) the "num-indels" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumIndels();
        
        /**
         * True if has "num-indels" element
         */
        boolean isSetNumIndels();
        
        /**
         * Sets the "num-indels" element
         */
        void setNumIndels(java.math.BigInteger numIndels);
        
        /**
         * Sets (as xml) the "num-indels" element
         */
        void xsetNumIndels(org.apache.xmlbeans.XmlInteger numIndels);
        
        /**
         * Unsets the "num-indels" element
         */
        void unsetNumIndels();
        
        /**
         * Gets the "full-query-range" element
         */
        gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange getFullQueryRange();
        
        /**
         * Sets the "full-query-range" element
         */
        void setFullQueryRange(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange fullQueryRange);
        
        /**
         * Appends and returns a new empty "full-query-range" element
         */
        gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange addNewFullQueryRange();
        
        /**
         * Gets the "full-subject-range" element
         */
        gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange getFullSubjectRange();
        
        /**
         * Sets the "full-subject-range" element
         */
        void setFullSubjectRange(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange fullSubjectRange);
        
        /**
         * Appends and returns a new empty "full-subject-range" element
         */
        gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange addNewFullSubjectRange();
        
        /**
         * An XML full-query-range(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FullQueryRange extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullQueryRange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fullqueryrange52e0elemtype");
            
            /**
             * Gets the "Blast4-range" element
             */
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range getBlast4Range();
            
            /**
             * Sets the "Blast4-range" element
             */
            void setBlast4Range(gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range blast4Range);
            
            /**
             * Appends and returns a new empty "Blast4-range" element
             */
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range addNewBlast4Range();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML full-subject-range(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FullSubjectRange extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullSubjectRange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fullsubjectrange1dc4elemtype");
            
            /**
             * Gets the "Blast4-range" element
             */
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range getBlast4Range();
            
            /**
             * Sets the "Blast4-range" element
             */
            void setBlast4Range(gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range blast4Range);
            
            /**
             * Appends and returns a new empty "Blast4-range" element
             */
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range addNewBlast4Range();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
