/*
 * An XML document type.
 * Localname: Blast4-common-options-db-restriction
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options-db-restriction(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsDbRestrictionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDbRestrictionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsdbrestriction633bdoctype");
    
    /**
     * Gets the "Blast4-common-options-db-restriction" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction getBlast4CommonOptionsDbRestriction();
    
    /**
     * Sets the "Blast4-common-options-db-restriction" element
     */
    void setBlast4CommonOptionsDbRestriction(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction blast4CommonOptionsDbRestriction);
    
    /**
     * Appends and returns a new empty "Blast4-common-options-db-restriction" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction addNewBlast4CommonOptionsDbRestriction();
    
    /**
     * An XML Blast4-common-options-db-restriction(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptionsDbRestriction extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDbRestriction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsdbrestrictiona682elemtype");
        
        /**
         * Gets the "entrez-query" element
         */
        java.lang.String getEntrezQuery();
        
        /**
         * Gets (as xml) the "entrez-query" element
         */
        org.apache.xmlbeans.XmlString xgetEntrezQuery();
        
        /**
         * True if has "entrez-query" element
         */
        boolean isSetEntrezQuery();
        
        /**
         * Sets the "entrez-query" element
         */
        void setEntrezQuery(java.lang.String entrezQuery);
        
        /**
         * Sets (as xml) the "entrez-query" element
         */
        void xsetEntrezQuery(org.apache.xmlbeans.XmlString entrezQuery);
        
        /**
         * Unsets the "entrez-query" element
         */
        void unsetEntrezQuery();
        
        /**
         * Gets the "organism" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism getOrganism();
        
        /**
         * True if has "organism" element
         */
        boolean isSetOrganism();
        
        /**
         * Sets the "organism" element
         */
        void setOrganism(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism organism);
        
        /**
         * Appends and returns a new empty "organism" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism addNewOrganism();
        
        /**
         * Unsets the "organism" element
         */
        void unsetOrganism();
        
        /**
         * An XML organism(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Organism extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organism.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("organismfe70elemtype");
            
            /**
             * Gets the "Blast4-common-options-db-restriction-by-organism" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism getBlast4CommonOptionsDbRestrictionByOrganism();
            
            /**
             * Sets the "Blast4-common-options-db-restriction-by-organism" element
             */
            void setBlast4CommonOptionsDbRestrictionByOrganism(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism blast4CommonOptionsDbRestrictionByOrganism);
            
            /**
             * Appends and returns a new empty "Blast4-common-options-db-restriction-by-organism" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism addNewBlast4CommonOptionsDbRestrictionByOrganism();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
