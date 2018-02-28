/*
 * An XML document type.
 * Localname: Blast4-common-options-db-restriction-by-organism
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options-db-restriction-by-organism(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsDbRestrictionByOrganismDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDbRestrictionByOrganismDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsdbrestrictionbyorganism86f6doctype");
    
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
     * An XML Blast4-common-options-db-restriction-by-organism(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptionsDbRestrictionByOrganism extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDbRestrictionByOrganism.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsdbrestrictionbyorganism9ea2elemtype");
        
        /**
         * Gets the "organism-restriction" element
         */
        java.lang.String getOrganismRestriction();
        
        /**
         * Gets (as xml) the "organism-restriction" element
         */
        org.apache.xmlbeans.XmlString xgetOrganismRestriction();
        
        /**
         * True if has "organism-restriction" element
         */
        boolean isSetOrganismRestriction();
        
        /**
         * Sets the "organism-restriction" element
         */
        void setOrganismRestriction(java.lang.String organismRestriction);
        
        /**
         * Sets (as xml) the "organism-restriction" element
         */
        void xsetOrganismRestriction(org.apache.xmlbeans.XmlString organismRestriction);
        
        /**
         * Unsets the "organism-restriction" element
         */
        void unsetOrganismRestriction();
        
        /**
         * Gets the "taxid-restriction" element
         */
        java.math.BigInteger getTaxidRestriction();
        
        /**
         * Gets (as xml) the "taxid-restriction" element
         */
        org.apache.xmlbeans.XmlInteger xgetTaxidRestriction();
        
        /**
         * True if has "taxid-restriction" element
         */
        boolean isSetTaxidRestriction();
        
        /**
         * Sets the "taxid-restriction" element
         */
        void setTaxidRestriction(java.math.BigInteger taxidRestriction);
        
        /**
         * Sets (as xml) the "taxid-restriction" element
         */
        void xsetTaxidRestriction(org.apache.xmlbeans.XmlInteger taxidRestriction);
        
        /**
         * Unsets the "taxid-restriction" element
         */
        void unsetTaxidRestriction();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
