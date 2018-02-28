/*
 * An XML document type.
 * Localname: Int-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IntGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Int-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface IntGraphDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntGraphDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("intgraphcfbcdoctype");
    
    /**
     * Gets the "Int-graph" element
     */
    gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph getIntGraph();
    
    /**
     * Sets the "Int-graph" element
     */
    void setIntGraph(gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph intGraph);
    
    /**
     * Appends and returns a new empty "Int-graph" element
     */
    gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph addNewIntGraph();
    
    /**
     * An XML Int-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface IntGraph extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntGraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("intgrapha3f8elemtype");
        
        /**
         * Gets the "max" element
         */
        java.math.BigInteger getMax();
        
        /**
         * Gets (as xml) the "max" element
         */
        org.apache.xmlbeans.XmlInteger xgetMax();
        
        /**
         * Sets the "max" element
         */
        void setMax(java.math.BigInteger max);
        
        /**
         * Sets (as xml) the "max" element
         */
        void xsetMax(org.apache.xmlbeans.XmlInteger max);
        
        /**
         * Gets the "min" element
         */
        java.math.BigInteger getMin();
        
        /**
         * Gets (as xml) the "min" element
         */
        org.apache.xmlbeans.XmlInteger xgetMin();
        
        /**
         * Sets the "min" element
         */
        void setMin(java.math.BigInteger min);
        
        /**
         * Sets (as xml) the "min" element
         */
        void xsetMin(org.apache.xmlbeans.XmlInteger min);
        
        /**
         * Gets the "axis" element
         */
        java.math.BigInteger getAxis();
        
        /**
         * Gets (as xml) the "axis" element
         */
        org.apache.xmlbeans.XmlInteger xgetAxis();
        
        /**
         * Sets the "axis" element
         */
        void setAxis(java.math.BigInteger axis);
        
        /**
         * Sets (as xml) the "axis" element
         */
        void xsetAxis(org.apache.xmlbeans.XmlInteger axis);
        
        /**
         * Gets array of all "values" elements
         */
        java.math.BigInteger[] getValuesArray();
        
        /**
         * Gets ith "values" element
         */
        java.math.BigInteger getValuesArray(int i);
        
        /**
         * Gets (as xml) array of all "values" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetValuesArray();
        
        /**
         * Gets (as xml) ith "values" element
         */
        org.apache.xmlbeans.XmlInteger xgetValuesArray(int i);
        
        /**
         * Returns number of "values" element
         */
        int sizeOfValuesArray();
        
        /**
         * Sets array of all "values" element
         */
        void setValuesArray(java.math.BigInteger[] valuesArray);
        
        /**
         * Sets ith "values" element
         */
        void setValuesArray(int i, java.math.BigInteger values);
        
        /**
         * Sets (as xml) array of all "values" element
         */
        void xsetValuesArray(org.apache.xmlbeans.XmlInteger[] valuesArray);
        
        /**
         * Sets (as xml) ith "values" element
         */
        void xsetValuesArray(int i, org.apache.xmlbeans.XmlInteger values);
        
        /**
         * Inserts the value as the ith "values" element
         */
        void insertValues(int i, java.math.BigInteger values);
        
        /**
         * Appends the value as the last "values" element
         */
        void addValues(java.math.BigInteger values);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "values" element
         */
        org.apache.xmlbeans.XmlInteger insertNewValues(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "values" element
         */
        org.apache.xmlbeans.XmlInteger addNewValues();
        
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
            public static gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph newInstance() {
              return (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.IntGraphDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.IntGraphDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.IntGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
