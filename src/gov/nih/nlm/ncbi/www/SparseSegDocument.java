/*
 * An XML document type.
 * Localname: Sparse-seg
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SparseSegDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Sparse-seg(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SparseSegDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SparseSegDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparseseg1bc6doctype");
    
    /**
     * Gets the "Sparse-seg" element
     */
    gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg getSparseSeg();
    
    /**
     * Sets the "Sparse-seg" element
     */
    void setSparseSeg(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg sparseSeg);
    
    /**
     * Appends and returns a new empty "Sparse-seg" element
     */
    gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg addNewSparseSeg();
    
    /**
     * An XML Sparse-seg(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SparseSeg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SparseSeg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparsesegfa62elemtype");
        
        /**
         * Gets the "master-id" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId getMasterId();
        
        /**
         * True if has "master-id" element
         */
        boolean isSetMasterId();
        
        /**
         * Sets the "master-id" element
         */
        void setMasterId(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId masterId);
        
        /**
         * Appends and returns a new empty "master-id" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId addNewMasterId();
        
        /**
         * Unsets the "master-id" element
         */
        void unsetMasterId();
        
        /**
         * Gets the "rows" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows getRows();
        
        /**
         * Sets the "rows" element
         */
        void setRows(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows rows);
        
        /**
         * Appends and returns a new empty "rows" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows addNewRows();
        
        /**
         * Gets the "row-scores" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores getRowScores();
        
        /**
         * True if has "row-scores" element
         */
        boolean isSetRowScores();
        
        /**
         * Sets the "row-scores" element
         */
        void setRowScores(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores rowScores);
        
        /**
         * Appends and returns a new empty "row-scores" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores addNewRowScores();
        
        /**
         * Unsets the "row-scores" element
         */
        void unsetRowScores();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * An XML master-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface MasterId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MasterId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("masterid63b4elemtype");
            
            /**
             * Gets the "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
            
            /**
             * Sets the "Seq-id" element
             */
            void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.MasterId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML rows(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Rows extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rows.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rowsef17elemtype");
            
            /**
             * Gets array of all "Sparse-align" elements
             */
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign[] getSparseAlignArray();
            
            /**
             * Gets ith "Sparse-align" element
             */
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign getSparseAlignArray(int i);
            
            /**
             * Returns number of "Sparse-align" element
             */
            int sizeOfSparseAlignArray();
            
            /**
             * Sets array of all "Sparse-align" element
             */
            void setSparseAlignArray(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign[] sparseAlignArray);
            
            /**
             * Sets ith "Sparse-align" element
             */
            void setSparseAlignArray(int i, gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign sparseAlign);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Sparse-align" element
             */
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign insertNewSparseAlign(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Sparse-align" element
             */
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign addNewSparseAlign();
            
            /**
             * Removes the ith "Sparse-align" element
             */
            void removeSparseAlign(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Rows) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML row-scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface RowScores extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RowScores.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rowscores5472elemtype");
            
            /**
             * Gets array of all "Score" elements
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score[] getScoreArray();
            
            /**
             * Gets ith "Score" element
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score getScoreArray(int i);
            
            /**
             * Returns number of "Score" element
             */
            int sizeOfScoreArray();
            
            /**
             * Sets array of all "Score" element
             */
            void setScoreArray(gov.nih.nlm.ncbi.www.ScoreDocument.Score[] scoreArray);
            
            /**
             * Sets ith "Score" element
             */
            void setScoreArray(int i, gov.nih.nlm.ncbi.www.ScoreDocument.Score score);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Score" element
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score insertNewScore(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Score" element
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score addNewScore();
            
            /**
             * Removes the ith "Score" element
             */
            void removeScore(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.RowScores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ext extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ext092felemtype");
            
            /**
             * Gets array of all "Sparse-seg-ext" elements
             */
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt[] getSparseSegExtArray();
            
            /**
             * Gets ith "Sparse-seg-ext" element
             */
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt getSparseSegExtArray(int i);
            
            /**
             * Returns number of "Sparse-seg-ext" element
             */
            int sizeOfSparseSegExtArray();
            
            /**
             * Sets array of all "Sparse-seg-ext" element
             */
            void setSparseSegExtArray(gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt[] sparseSegExtArray);
            
            /**
             * Sets ith "Sparse-seg-ext" element
             */
            void setSparseSegExtArray(int i, gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt sparseSegExt);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Sparse-seg-ext" element
             */
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt insertNewSparseSegExt(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Sparse-seg-ext" element
             */
            gov.nih.nlm.ncbi.www.SparseSegExtDocument.SparseSegExt addNewSparseSegExt();
            
            /**
             * Removes the ith "Sparse-seg-ext" element
             */
            void removeSparseSegExt(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg newInstance() {
              return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SparseSegDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SparseSegDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SparseSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
