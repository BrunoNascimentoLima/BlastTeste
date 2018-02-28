/*
 * An XML document type.
 * Localname: Blast4-common-options-scoring
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options-scoring(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsScoringDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsScoringDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsscoringe23bdoctype");
    
    /**
     * Gets the "Blast4-common-options-scoring" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring getBlast4CommonOptionsScoring();
    
    /**
     * Sets the "Blast4-common-options-scoring" element
     */
    void setBlast4CommonOptionsScoring(gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring blast4CommonOptionsScoring);
    
    /**
     * Appends and returns a new empty "Blast4-common-options-scoring" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring addNewBlast4CommonOptionsScoring();
    
    /**
     * An XML Blast4-common-options-scoring(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptionsScoring extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsScoring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsscoring6c76elemtype");
        
        /**
         * Gets the "matrix-name" element
         */
        java.lang.String getMatrixName();
        
        /**
         * Gets (as xml) the "matrix-name" element
         */
        org.apache.xmlbeans.XmlString xgetMatrixName();
        
        /**
         * True if has "matrix-name" element
         */
        boolean isSetMatrixName();
        
        /**
         * Sets the "matrix-name" element
         */
        void setMatrixName(java.lang.String matrixName);
        
        /**
         * Sets (as xml) the "matrix-name" element
         */
        void xsetMatrixName(org.apache.xmlbeans.XmlString matrixName);
        
        /**
         * Unsets the "matrix-name" element
         */
        void unsetMatrixName();
        
        /**
         * Gets the "gap-opening-penalty" element
         */
        java.math.BigInteger getGapOpeningPenalty();
        
        /**
         * Gets (as xml) the "gap-opening-penalty" element
         */
        org.apache.xmlbeans.XmlInteger xgetGapOpeningPenalty();
        
        /**
         * True if has "gap-opening-penalty" element
         */
        boolean isSetGapOpeningPenalty();
        
        /**
         * Sets the "gap-opening-penalty" element
         */
        void setGapOpeningPenalty(java.math.BigInteger gapOpeningPenalty);
        
        /**
         * Sets (as xml) the "gap-opening-penalty" element
         */
        void xsetGapOpeningPenalty(org.apache.xmlbeans.XmlInteger gapOpeningPenalty);
        
        /**
         * Unsets the "gap-opening-penalty" element
         */
        void unsetGapOpeningPenalty();
        
        /**
         * Gets the "gap-extension-penalty" element
         */
        java.math.BigInteger getGapExtensionPenalty();
        
        /**
         * Gets (as xml) the "gap-extension-penalty" element
         */
        org.apache.xmlbeans.XmlInteger xgetGapExtensionPenalty();
        
        /**
         * True if has "gap-extension-penalty" element
         */
        boolean isSetGapExtensionPenalty();
        
        /**
         * Sets the "gap-extension-penalty" element
         */
        void setGapExtensionPenalty(java.math.BigInteger gapExtensionPenalty);
        
        /**
         * Sets (as xml) the "gap-extension-penalty" element
         */
        void xsetGapExtensionPenalty(org.apache.xmlbeans.XmlInteger gapExtensionPenalty);
        
        /**
         * Unsets the "gap-extension-penalty" element
         */
        void unsetGapExtensionPenalty();
        
        /**
         * Gets the "match-reward" element
         */
        java.math.BigInteger getMatchReward();
        
        /**
         * Gets (as xml) the "match-reward" element
         */
        org.apache.xmlbeans.XmlInteger xgetMatchReward();
        
        /**
         * True if has "match-reward" element
         */
        boolean isSetMatchReward();
        
        /**
         * Sets the "match-reward" element
         */
        void setMatchReward(java.math.BigInteger matchReward);
        
        /**
         * Sets (as xml) the "match-reward" element
         */
        void xsetMatchReward(org.apache.xmlbeans.XmlInteger matchReward);
        
        /**
         * Unsets the "match-reward" element
         */
        void unsetMatchReward();
        
        /**
         * Gets the "mismatch-penalty" element
         */
        java.math.BigInteger getMismatchPenalty();
        
        /**
         * Gets (as xml) the "mismatch-penalty" element
         */
        org.apache.xmlbeans.XmlInteger xgetMismatchPenalty();
        
        /**
         * True if has "mismatch-penalty" element
         */
        boolean isSetMismatchPenalty();
        
        /**
         * Sets the "mismatch-penalty" element
         */
        void setMismatchPenalty(java.math.BigInteger mismatchPenalty);
        
        /**
         * Sets (as xml) the "mismatch-penalty" element
         */
        void xsetMismatchPenalty(org.apache.xmlbeans.XmlInteger mismatchPenalty);
        
        /**
         * Unsets the "mismatch-penalty" element
         */
        void unsetMismatchPenalty();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
