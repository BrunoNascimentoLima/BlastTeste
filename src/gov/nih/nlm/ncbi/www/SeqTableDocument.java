/*
 * An XML document type.
 * Localname: Seq-table
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-table(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqTableDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtable92acdoctype");
    
    /**
     * Gets the "Seq-table" element
     */
    gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable getSeqTable();
    
    /**
     * Sets the "Seq-table" element
     */
    void setSeqTable(gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable seqTable);
    
    /**
     * Appends and returns a new empty "Seq-table" element
     */
    gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable addNewSeqTable();
    
    /**
     * An XML Seq-table(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqTable extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtable41d8elemtype");
        
        /**
         * Gets the "feat-type" element
         */
        java.math.BigInteger getFeatType();
        
        /**
         * Gets (as xml) the "feat-type" element
         */
        org.apache.xmlbeans.XmlInteger xgetFeatType();
        
        /**
         * Sets the "feat-type" element
         */
        void setFeatType(java.math.BigInteger featType);
        
        /**
         * Sets (as xml) the "feat-type" element
         */
        void xsetFeatType(org.apache.xmlbeans.XmlInteger featType);
        
        /**
         * Gets the "feat-subtype" element
         */
        java.math.BigInteger getFeatSubtype();
        
        /**
         * Gets (as xml) the "feat-subtype" element
         */
        org.apache.xmlbeans.XmlInteger xgetFeatSubtype();
        
        /**
         * True if has "feat-subtype" element
         */
        boolean isSetFeatSubtype();
        
        /**
         * Sets the "feat-subtype" element
         */
        void setFeatSubtype(java.math.BigInteger featSubtype);
        
        /**
         * Sets (as xml) the "feat-subtype" element
         */
        void xsetFeatSubtype(org.apache.xmlbeans.XmlInteger featSubtype);
        
        /**
         * Unsets the "feat-subtype" element
         */
        void unsetFeatSubtype();
        
        /**
         * Gets the "num-rows" element
         */
        java.math.BigInteger getNumRows();
        
        /**
         * Gets (as xml) the "num-rows" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumRows();
        
        /**
         * Sets the "num-rows" element
         */
        void setNumRows(java.math.BigInteger numRows);
        
        /**
         * Sets (as xml) the "num-rows" element
         */
        void xsetNumRows(org.apache.xmlbeans.XmlInteger numRows);
        
        /**
         * Gets the "columns" element
         */
        gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns getColumns();
        
        /**
         * Sets the "columns" element
         */
        void setColumns(gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns columns);
        
        /**
         * Appends and returns a new empty "columns" element
         */
        gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns addNewColumns();
        
        /**
         * An XML columns(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Columns extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Columns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("columns13a1elemtype");
            
            /**
             * Gets array of all "SeqTable-column" elements
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn[] getSeqTableColumnArray();
            
            /**
             * Gets ith "SeqTable-column" element
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn getSeqTableColumnArray(int i);
            
            /**
             * Returns number of "SeqTable-column" element
             */
            int sizeOfSeqTableColumnArray();
            
            /**
             * Sets array of all "SeqTable-column" element
             */
            void setSeqTableColumnArray(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn[] seqTableColumnArray);
            
            /**
             * Sets ith "SeqTable-column" element
             */
            void setSeqTableColumnArray(int i, gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn seqTableColumn);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SeqTable-column" element
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn insertNewSeqTableColumn(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SeqTable-column" element
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn addNewSeqTableColumn();
            
            /**
             * Removes the ith "SeqTable-column" element
             */
            void removeSeqTableColumn(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqTableDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
