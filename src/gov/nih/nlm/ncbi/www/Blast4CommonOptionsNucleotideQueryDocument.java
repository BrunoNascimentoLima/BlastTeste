/*
 * An XML document type.
 * Localname: Blast4-common-options-nucleotide-query
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options-nucleotide-query(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsNucleotideQueryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsNucleotideQueryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsnucleotidequery1d89doctype");
    
    /**
     * Gets the "Blast4-common-options-nucleotide-query" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery getBlast4CommonOptionsNucleotideQuery();
    
    /**
     * Sets the "Blast4-common-options-nucleotide-query" element
     */
    void setBlast4CommonOptionsNucleotideQuery(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery blast4CommonOptionsNucleotideQuery);
    
    /**
     * Appends and returns a new empty "Blast4-common-options-nucleotide-query" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery addNewBlast4CommonOptionsNucleotideQuery();
    
    /**
     * An XML Blast4-common-options-nucleotide-query(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptionsNucleotideQuery extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsNucleotideQuery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsnucleotidequeryb442elemtype");
        
        /**
         * Gets the "strand-type-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList getStrandTypeList();
        
        /**
         * True if has "strand-type-list" element
         */
        boolean isSetStrandTypeList();
        
        /**
         * Sets the "strand-type-list" element
         */
        void setStrandTypeList(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList strandTypeList);
        
        /**
         * Appends and returns a new empty "strand-type-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList addNewStrandTypeList();
        
        /**
         * Unsets the "strand-type-list" element
         */
        void unsetStrandTypeList();
        
        /**
         * Gets the "disco-megablast-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions getDiscoMegablastOptions();
        
        /**
         * True if has "disco-megablast-options" element
         */
        boolean isSetDiscoMegablastOptions();
        
        /**
         * Sets the "disco-megablast-options" element
         */
        void setDiscoMegablastOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions discoMegablastOptions);
        
        /**
         * Appends and returns a new empty "disco-megablast-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions addNewDiscoMegablastOptions();
        
        /**
         * Unsets the "disco-megablast-options" element
         */
        void unsetDiscoMegablastOptions();
        
        /**
         * An XML strand-type-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface StrandTypeList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrandTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strandtypelist46a8elemtype");
            
            /**
             * Gets array of all "Blast4-strand-type" elements
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] getBlast4StrandTypeArray();
            
            /**
             * Gets ith "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandTypeArray(int i);
            
            /**
             * Returns number of "Blast4-strand-type" element
             */
            int sizeOfBlast4StrandTypeArray();
            
            /**
             * Sets array of all "Blast4-strand-type" element
             */
            void setBlast4StrandTypeArray(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] blast4StrandTypeArray);
            
            /**
             * Sets ith "Blast4-strand-type" element
             */
            void setBlast4StrandTypeArray(int i, gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType insertNewBlast4StrandType(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType();
            
            /**
             * Removes the ith "Blast4-strand-type" element
             */
            void removeBlast4StrandType(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML disco-megablast-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface DiscoMegablastOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiscoMegablastOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("discomegablastoptionsefb2elemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
