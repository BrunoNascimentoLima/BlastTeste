/*
 * An XML document type.
 * Localname: PssmFinalData
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmFinalDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PssmFinalData(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PssmFinalDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmFinalDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmfinaldataaeefdoctype");
    
    /**
     * Gets the "PssmFinalData" element
     */
    gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData getPssmFinalData();
    
    /**
     * Sets the "PssmFinalData" element
     */
    void setPssmFinalData(gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData pssmFinalData);
    
    /**
     * Appends and returns a new empty "PssmFinalData" element
     */
    gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData addNewPssmFinalData();
    
    /**
     * An XML PssmFinalData(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PssmFinalData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmFinalData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmfinaldata95deelemtype");
        
        /**
         * Gets array of all "scores" elements
         */
        java.math.BigInteger[] getScoresArray();
        
        /**
         * Gets ith "scores" element
         */
        java.math.BigInteger getScoresArray(int i);
        
        /**
         * Gets (as xml) array of all "scores" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetScoresArray();
        
        /**
         * Gets (as xml) ith "scores" element
         */
        org.apache.xmlbeans.XmlInteger xgetScoresArray(int i);
        
        /**
         * Returns number of "scores" element
         */
        int sizeOfScoresArray();
        
        /**
         * Sets array of all "scores" element
         */
        void setScoresArray(java.math.BigInteger[] scoresArray);
        
        /**
         * Sets ith "scores" element
         */
        void setScoresArray(int i, java.math.BigInteger scores);
        
        /**
         * Sets (as xml) array of all "scores" element
         */
        void xsetScoresArray(org.apache.xmlbeans.XmlInteger[] scoresArray);
        
        /**
         * Sets (as xml) ith "scores" element
         */
        void xsetScoresArray(int i, org.apache.xmlbeans.XmlInteger scores);
        
        /**
         * Inserts the value as the ith "scores" element
         */
        void insertScores(int i, java.math.BigInteger scores);
        
        /**
         * Appends the value as the last "scores" element
         */
        void addScores(java.math.BigInteger scores);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scores" element
         */
        org.apache.xmlbeans.XmlInteger insertNewScores(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scores" element
         */
        org.apache.xmlbeans.XmlInteger addNewScores();
        
        /**
         * Removes the ith "scores" element
         */
        void removeScores(int i);
        
        /**
         * Gets the "lambda" element
         */
        double getLambda();
        
        /**
         * Gets (as xml) the "lambda" element
         */
        org.apache.xmlbeans.XmlDouble xgetLambda();
        
        /**
         * Sets the "lambda" element
         */
        void setLambda(double lambda);
        
        /**
         * Sets (as xml) the "lambda" element
         */
        void xsetLambda(org.apache.xmlbeans.XmlDouble lambda);
        
        /**
         * Gets the "kappa" element
         */
        double getKappa();
        
        /**
         * Gets (as xml) the "kappa" element
         */
        org.apache.xmlbeans.XmlDouble xgetKappa();
        
        /**
         * Sets the "kappa" element
         */
        void setKappa(double kappa);
        
        /**
         * Sets (as xml) the "kappa" element
         */
        void xsetKappa(org.apache.xmlbeans.XmlDouble kappa);
        
        /**
         * Gets the "h" element
         */
        double getH();
        
        /**
         * Gets (as xml) the "h" element
         */
        org.apache.xmlbeans.XmlDouble xgetH();
        
        /**
         * Sets the "h" element
         */
        void setH(double h);
        
        /**
         * Sets (as xml) the "h" element
         */
        void xsetH(org.apache.xmlbeans.XmlDouble h);
        
        /**
         * Gets the "scalingFactor" element
         */
        java.math.BigInteger getScalingFactor();
        
        /**
         * Gets (as xml) the "scalingFactor" element
         */
        org.apache.xmlbeans.XmlInteger xgetScalingFactor();
        
        /**
         * Sets the "scalingFactor" element
         */
        void setScalingFactor(java.math.BigInteger scalingFactor);
        
        /**
         * Sets (as xml) the "scalingFactor" element
         */
        void xsetScalingFactor(org.apache.xmlbeans.XmlInteger scalingFactor);
        
        /**
         * Gets the "lambdaUngapped" element
         */
        double getLambdaUngapped();
        
        /**
         * Gets (as xml) the "lambdaUngapped" element
         */
        org.apache.xmlbeans.XmlDouble xgetLambdaUngapped();
        
        /**
         * True if has "lambdaUngapped" element
         */
        boolean isSetLambdaUngapped();
        
        /**
         * Sets the "lambdaUngapped" element
         */
        void setLambdaUngapped(double lambdaUngapped);
        
        /**
         * Sets (as xml) the "lambdaUngapped" element
         */
        void xsetLambdaUngapped(org.apache.xmlbeans.XmlDouble lambdaUngapped);
        
        /**
         * Unsets the "lambdaUngapped" element
         */
        void unsetLambdaUngapped();
        
        /**
         * Gets the "kappaUngapped" element
         */
        double getKappaUngapped();
        
        /**
         * Gets (as xml) the "kappaUngapped" element
         */
        org.apache.xmlbeans.XmlDouble xgetKappaUngapped();
        
        /**
         * True if has "kappaUngapped" element
         */
        boolean isSetKappaUngapped();
        
        /**
         * Sets the "kappaUngapped" element
         */
        void setKappaUngapped(double kappaUngapped);
        
        /**
         * Sets (as xml) the "kappaUngapped" element
         */
        void xsetKappaUngapped(org.apache.xmlbeans.XmlDouble kappaUngapped);
        
        /**
         * Unsets the "kappaUngapped" element
         */
        void unsetKappaUngapped();
        
        /**
         * Gets the "hUngapped" element
         */
        double getHUngapped();
        
        /**
         * Gets (as xml) the "hUngapped" element
         */
        org.apache.xmlbeans.XmlDouble xgetHUngapped();
        
        /**
         * True if has "hUngapped" element
         */
        boolean isSetHUngapped();
        
        /**
         * Sets the "hUngapped" element
         */
        void setHUngapped(double hUngapped);
        
        /**
         * Sets (as xml) the "hUngapped" element
         */
        void xsetHUngapped(org.apache.xmlbeans.XmlDouble hUngapped);
        
        /**
         * Unsets the "hUngapped" element
         */
        void unsetHUngapped();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData newInstance() {
              return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmFinalDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmFinalDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
