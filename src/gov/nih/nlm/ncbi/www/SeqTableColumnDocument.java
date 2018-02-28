/*
 * An XML document type.
 * Localname: SeqTable-column
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableColumnDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SeqTable-column(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqTableColumnDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableColumnDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablecolumn9ac0doctype");
    
    /**
     * Gets the "SeqTable-column" element
     */
    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn getSeqTableColumn();
    
    /**
     * Sets the "SeqTable-column" element
     */
    void setSeqTableColumn(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn seqTableColumn);
    
    /**
     * Appends and returns a new empty "SeqTable-column" element
     */
    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn addNewSeqTableColumn();
    
    /**
     * An XML SeqTable-column(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqTableColumn extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableColumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablecolumn5f40elemtype");
        
        /**
         * Gets the "header" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header getHeader();
        
        /**
         * Sets the "header" element
         */
        void setHeader(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header header);
        
        /**
         * Appends and returns a new empty "header" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header addNewHeader();
        
        /**
         * Gets the "data" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data getData();
        
        /**
         * True if has "data" element
         */
        boolean isSetData();
        
        /**
         * Sets the "data" element
         */
        void setData(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data addNewData();
        
        /**
         * Unsets the "data" element
         */
        void unsetData();
        
        /**
         * Gets the "sparse" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse getSparse();
        
        /**
         * True if has "sparse" element
         */
        boolean isSetSparse();
        
        /**
         * Sets the "sparse" element
         */
        void setSparse(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse sparse);
        
        /**
         * Appends and returns a new empty "sparse" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse addNewSparse();
        
        /**
         * Unsets the "sparse" element
         */
        void unsetSparse();
        
        /**
         * Gets the "default" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default getDefault();
        
        /**
         * True if has "default" element
         */
        boolean isSetDefault();
        
        /**
         * Sets the "default" element
         */
        void setDefault(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default xdefault);
        
        /**
         * Appends and returns a new empty "default" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default addNewDefault();
        
        /**
         * Unsets the "default" element
         */
        void unsetDefault();
        
        /**
         * Gets the "sparse-other" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther getSparseOther();
        
        /**
         * True if has "sparse-other" element
         */
        boolean isSetSparseOther();
        
        /**
         * Sets the "sparse-other" element
         */
        void setSparseOther(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther sparseOther);
        
        /**
         * Appends and returns a new empty "sparse-other" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther addNewSparseOther();
        
        /**
         * Unsets the "sparse-other" element
         */
        void unsetSparseOther();
        
        /**
         * An XML header(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Header extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("headerb069elemtype");
            
            /**
             * Gets the "SeqTable-column-info" element
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo getSeqTableColumnInfo();
            
            /**
             * Sets the "SeqTable-column-info" element
             */
            void setSeqTableColumnInfo(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo seqTableColumnInfo);
            
            /**
             * Appends and returns a new empty "SeqTable-column-info" element
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo addNewSeqTableColumnInfo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Data extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("data1b86elemtype");
            
            /**
             * Gets the "SeqTable-multi-data" element
             */
            gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData getSeqTableMultiData();
            
            /**
             * Sets the "SeqTable-multi-data" element
             */
            void setSeqTableMultiData(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData seqTableMultiData);
            
            /**
             * Appends and returns a new empty "SeqTable-multi-data" element
             */
            gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData addNewSeqTableMultiData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sparse(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Sparse extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sparse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparse1ffcelemtype");
            
            /**
             * Gets the "SeqTable-sparse-index" element
             */
            gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex getSeqTableSparseIndex();
            
            /**
             * Sets the "SeqTable-sparse-index" element
             */
            void setSeqTableSparseIndex(gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex seqTableSparseIndex);
            
            /**
             * Appends and returns a new empty "SeqTable-sparse-index" element
             */
            gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex addNewSeqTableSparseIndex();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Default extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Default.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("defaulte9edelemtype");
            
            /**
             * Gets the "SeqTable-single-data" element
             */
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData getSeqTableSingleData();
            
            /**
             * Sets the "SeqTable-single-data" element
             */
            void setSeqTableSingleData(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData seqTableSingleData);
            
            /**
             * Appends and returns a new empty "SeqTable-single-data" element
             */
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData addNewSeqTableSingleData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sparse-other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SparseOther extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SparseOther.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparseotherb0ffelemtype");
            
            /**
             * Gets the "SeqTable-single-data" element
             */
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData getSeqTableSingleData();
            
            /**
             * Sets the "SeqTable-single-data" element
             */
            void setSeqTableSingleData(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData seqTableSingleData);
            
            /**
             * Appends and returns a new empty "SeqTable-single-data" element
             */
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData addNewSeqTableSingleData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
