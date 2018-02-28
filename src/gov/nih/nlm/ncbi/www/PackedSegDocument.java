/*
 * An XML document type.
 * Localname: Packed-seg
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PackedSegDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Packed-seg(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PackedSegDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackedSegDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedseg9e1edoctype");
    
    /**
     * Gets the "Packed-seg" element
     */
    gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg getPackedSeg();
    
    /**
     * Sets the "Packed-seg" element
     */
    void setPackedSeg(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg packedSeg);
    
    /**
     * Appends and returns a new empty "Packed-seg" element
     */
    gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg addNewPackedSeg();
    
    /**
     * An XML Packed-seg(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PackedSeg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackedSeg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedseg8962elemtype");
        
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
         * Gets the "numseg" element
         */
        java.math.BigInteger getNumseg();
        
        /**
         * Gets (as xml) the "numseg" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumseg();
        
        /**
         * Sets the "numseg" element
         */
        void setNumseg(java.math.BigInteger numseg);
        
        /**
         * Sets (as xml) the "numseg" element
         */
        void xsetNumseg(org.apache.xmlbeans.XmlInteger numseg);
        
        /**
         * Gets the "ids" element
         */
        gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids getIds();
        
        /**
         * Sets the "ids" element
         */
        void setIds(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids ids);
        
        /**
         * Appends and returns a new empty "ids" element
         */
        gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids addNewIds();
        
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
         * Gets the "present" element
         */
        byte[] getPresent();
        
        /**
         * Gets (as xml) the "present" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetPresent();
        
        /**
         * Sets the "present" element
         */
        void setPresent(byte[] present);
        
        /**
         * Sets (as xml) the "present" element
         */
        void xsetPresent(org.apache.xmlbeans.XmlHexBinary present);
        
        /**
         * Gets array of all "lens" elements
         */
        java.math.BigInteger[] getLensArray();
        
        /**
         * Gets ith "lens" element
         */
        java.math.BigInteger getLensArray(int i);
        
        /**
         * Gets (as xml) array of all "lens" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetLensArray();
        
        /**
         * Gets (as xml) ith "lens" element
         */
        org.apache.xmlbeans.XmlInteger xgetLensArray(int i);
        
        /**
         * Returns number of "lens" element
         */
        int sizeOfLensArray();
        
        /**
         * Sets array of all "lens" element
         */
        void setLensArray(java.math.BigInteger[] lensArray);
        
        /**
         * Sets ith "lens" element
         */
        void setLensArray(int i, java.math.BigInteger lens);
        
        /**
         * Sets (as xml) array of all "lens" element
         */
        void xsetLensArray(org.apache.xmlbeans.XmlInteger[] lensArray);
        
        /**
         * Sets (as xml) ith "lens" element
         */
        void xsetLensArray(int i, org.apache.xmlbeans.XmlInteger lens);
        
        /**
         * Inserts the value as the ith "lens" element
         */
        void insertLens(int i, java.math.BigInteger lens);
        
        /**
         * Appends the value as the last "lens" element
         */
        void addLens(java.math.BigInteger lens);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "lens" element
         */
        org.apache.xmlbeans.XmlInteger insertNewLens(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "lens" element
         */
        org.apache.xmlbeans.XmlInteger addNewLens();
        
        /**
         * Removes the ith "lens" element
         */
        void removeLens(int i);
        
        /**
         * Gets the "strands" element
         */
        gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands getStrands();
        
        /**
         * True if has "strands" element
         */
        boolean isSetStrands();
        
        /**
         * Sets the "strands" element
         */
        void setStrands(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands strands);
        
        /**
         * Appends and returns a new empty "strands" element
         */
        gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands addNewStrands();
        
        /**
         * Unsets the "strands" element
         */
        void unsetStrands();
        
        /**
         * Gets the "scores" element
         */
        gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores getScores();
        
        /**
         * True if has "scores" element
         */
        boolean isSetScores();
        
        /**
         * Sets the "scores" element
         */
        void setScores(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores scores);
        
        /**
         * Appends and returns a new empty "scores" element
         */
        gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores addNewScores();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("idsed86elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids newInstance() {
                  return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Strands.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strandsd83belemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands newInstance() {
                  return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Scores.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("scoresc45felemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores newInstance() {
                  return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg newInstance() {
              return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PackedSegDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PackedSegDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PackedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
