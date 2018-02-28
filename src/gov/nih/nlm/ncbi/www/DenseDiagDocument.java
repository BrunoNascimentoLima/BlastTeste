/*
 * An XML document type.
 * Localname: Dense-diag
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DenseDiagDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Dense-diag(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface DenseDiagDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DenseDiagDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("densediagd277doctype");
    
    /**
     * Gets the "Dense-diag" element
     */
    gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag getDenseDiag();
    
    /**
     * Sets the "Dense-diag" element
     */
    void setDenseDiag(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag denseDiag);
    
    /**
     * Appends and returns a new empty "Dense-diag" element
     */
    gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag addNewDenseDiag();
    
    /**
     * An XML Dense-diag(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface DenseDiag extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DenseDiag.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("densediag2202elemtype");
        
        /**
         * Gets the "dim" element
         */
        java.math.BigInteger getDim();
        
        /**
         * Gets (as xml) the "dim" element
         */
        org.apache.xmlbeans.XmlInteger xgetDim();
        
        /**
         * Sets the "dim" element
         */
        void setDim(java.math.BigInteger dim);
        
        /**
         * Sets (as xml) the "dim" element
         */
        void xsetDim(org.apache.xmlbeans.XmlInteger dim);
        
        /**
         * Gets the "ids" element
         */
        gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids getIds();
        
        /**
         * Sets the "ids" element
         */
        void setIds(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids ids);
        
        /**
         * Appends and returns a new empty "ids" element
         */
        gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids addNewIds();
        
        /**
         * Gets array of all "starts" elements
         */
        java.math.BigInteger[] getStartsArray();
        
        /**
         * Gets ith "starts" element
         */
        java.math.BigInteger getStartsArray(int i);
        
        /**
         * Gets (as xml) array of all "starts" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetStartsArray();
        
        /**
         * Gets (as xml) ith "starts" element
         */
        org.apache.xmlbeans.XmlInteger xgetStartsArray(int i);
        
        /**
         * Returns number of "starts" element
         */
        int sizeOfStartsArray();
        
        /**
         * Sets array of all "starts" element
         */
        void setStartsArray(java.math.BigInteger[] startsArray);
        
        /**
         * Sets ith "starts" element
         */
        void setStartsArray(int i, java.math.BigInteger starts);
        
        /**
         * Sets (as xml) array of all "starts" element
         */
        void xsetStartsArray(org.apache.xmlbeans.XmlInteger[] startsArray);
        
        /**
         * Sets (as xml) ith "starts" element
         */
        void xsetStartsArray(int i, org.apache.xmlbeans.XmlInteger starts);
        
        /**
         * Inserts the value as the ith "starts" element
         */
        void insertStarts(int i, java.math.BigInteger starts);
        
        /**
         * Appends the value as the last "starts" element
         */
        void addStarts(java.math.BigInteger starts);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "starts" element
         */
        org.apache.xmlbeans.XmlInteger insertNewStarts(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "starts" element
         */
        org.apache.xmlbeans.XmlInteger addNewStarts();
        
        /**
         * Removes the ith "starts" element
         */
        void removeStarts(int i);
        
        /**
         * Gets the "len" element
         */
        java.math.BigInteger getLen();
        
        /**
         * Gets (as xml) the "len" element
         */
        org.apache.xmlbeans.XmlInteger xgetLen();
        
        /**
         * Sets the "len" element
         */
        void setLen(java.math.BigInteger len);
        
        /**
         * Sets (as xml) the "len" element
         */
        void xsetLen(org.apache.xmlbeans.XmlInteger len);
        
        /**
         * Gets the "strands" element
         */
        gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands getStrands();
        
        /**
         * True if has "strands" element
         */
        boolean isSetStrands();
        
        /**
         * Sets the "strands" element
         */
        void setStrands(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands strands);
        
        /**
         * Appends and returns a new empty "strands" element
         */
        gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands addNewStrands();
        
        /**
         * Unsets the "strands" element
         */
        void unsetStrands();
        
        /**
         * Gets the "scores" element
         */
        gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores getScores();
        
        /**
         * True if has "scores" element
         */
        boolean isSetScores();
        
        /**
         * Sets the "scores" element
         */
        void setScores(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores scores);
        
        /**
         * Appends and returns a new empty "scores" element
         */
        gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores addNewScores();
        
        /**
         * Unsets the "scores" element
         */
        void unsetScores();
        
        /**
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ids extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ids8626elemtype");
            
            /**
             * Gets array of all "Seq-id" elements
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray();
            
            /**
             * Gets ith "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i);
            
            /**
             * Returns number of "Seq-id" element
             */
            int sizeOfSeqIdArray();
            
            /**
             * Sets array of all "Seq-id" element
             */
            void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray);
            
            /**
             * Sets ith "Seq-id" element
             */
            void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * Removes the ith "Seq-id" element
             */
            void removeSeqId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids newInstance() {
                  return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML strands(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Strands extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Strands.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strands70dbelemtype");
            
            /**
             * Gets array of all "Na-strand" elements
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] getNaStrandArray();
            
            /**
             * Gets ith "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrandArray(int i);
            
            /**
             * Returns number of "Na-strand" element
             */
            int sizeOfNaStrandArray();
            
            /**
             * Sets array of all "Na-strand" element
             */
            void setNaStrandArray(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] naStrandArray);
            
            /**
             * Sets ith "Na-strand" element
             */
            void setNaStrandArray(int i, gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand insertNewNaStrand(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand();
            
            /**
             * Removes the ith "Na-strand" element
             */
            void removeNaStrand(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands newInstance() {
                  return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Strands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Scores extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Scores.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("scores5cffelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores newInstance() {
                  return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag.Scores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag newInstance() {
              return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.DenseDiagDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.DenseDiagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
