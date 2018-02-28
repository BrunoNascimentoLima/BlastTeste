/*
 * An XML document type.
 * Localname: Real-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RealGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Real-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface RealGraphDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RealGraphDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("realgraph287ddoctype");
    
    /**
     * Gets the "Real-graph" element
     */
    gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph getRealGraph();
    
    /**
     * Sets the "Real-graph" element
     */
    void setRealGraph(gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph realGraph);
    
    /**
     * Appends and returns a new empty "Real-graph" element
     */
    gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph addNewRealGraph();
    
    /**
     * An XML Real-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface RealGraph extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RealGraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("realgraph9bc2elemtype");
        
        /**
         * Gets the "max" element
         */
        double getMax();
        
        /**
         * Gets (as xml) the "max" element
         */
        org.apache.xmlbeans.XmlDouble xgetMax();
        
        /**
         * Sets the "max" element
         */
        void setMax(double max);
        
        /**
         * Sets (as xml) the "max" element
         */
        void xsetMax(org.apache.xmlbeans.XmlDouble max);
        
        /**
         * Gets the "min" element
         */
        double getMin();
        
        /**
         * Gets (as xml) the "min" element
         */
        org.apache.xmlbeans.XmlDouble xgetMin();
        
        /**
         * Sets the "min" element
         */
        void setMin(double min);
        
        /**
         * Sets (as xml) the "min" element
         */
        void xsetMin(org.apache.xmlbeans.XmlDouble min);
        
        /**
         * Gets the "axis" element
         */
        double getAxis();
        
        /**
         * Gets (as xml) the "axis" element
         */
        org.apache.xmlbeans.XmlDouble xgetAxis();
        
        /**
         * Sets the "axis" element
         */
        void setAxis(double axis);
        
        /**
         * Sets (as xml) the "axis" element
         */
        void xsetAxis(org.apache.xmlbeans.XmlDouble axis);
        
        /**
         * Gets array of all "values" elements
         */
        double[] getValuesArray();
        
        /**
         * Gets ith "values" element
         */
        double getValuesArray(int i);
        
        /**
         * Gets (as xml) array of all "values" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetValuesArray();
        
        /**
         * Gets (as xml) ith "values" element
         */
        org.apache.xmlbeans.XmlDouble xgetValuesArray(int i);
        
        /**
         * Returns number of "values" element
         */
        int sizeOfValuesArray();
        
        /**
         * Sets array of all "values" element
         */
        void setValuesArray(double[] valuesArray);
        
        /**
         * Sets ith "values" element
         */
        void setValuesArray(int i, double values);
        
        /**
         * Sets (as xml) array of all "values" element
         */
        void xsetValuesArray(org.apache.xmlbeans.XmlDouble[] valuesArray);
        
        /**
         * Sets (as xml) ith "values" element
         */
        void xsetValuesArray(int i, org.apache.xmlbeans.XmlDouble values);
        
        /**
         * Inserts the value as the ith "values" element
         */
        void insertValues(int i, double values);
        
        /**
         * Appends the value as the last "values" element
         */
        void addValues(double values);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "values" element
         */
        org.apache.xmlbeans.XmlDouble insertNewValues(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "values" element
         */
        org.apache.xmlbeans.XmlDouble addNewValues();
        
        /**
         * Removes the ith "values" element
         */
        void removeValues(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph newInstance() {
              return (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.RealGraphDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.RealGraphDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.RealGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
