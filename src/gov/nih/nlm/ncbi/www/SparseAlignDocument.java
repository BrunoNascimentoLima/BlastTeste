/*
 * An XML document type.
 * Localname: Sparse-align
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SparseAlignDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Sparse-align(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SparseAlignDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SparseAlignDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparsealign3376doctype");
    
    /**
     * Gets the "Sparse-align" element
     */
    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign getSparseAlign();
    
    /**
     * Sets the "Sparse-align" element
     */
    void setSparseAlign(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign sparseAlign);
    
    /**
     * Appends and returns a new empty "Sparse-align" element
     */
    gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign addNewSparseAlign();
    
    /**
     * An XML Sparse-align(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SparseAlign extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SparseAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparsealign2122elemtype");
        
        /**
         * Gets the "first-id" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId getFirstId();
        
        /**
         * Sets the "first-id" element
         */
        void setFirstId(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId firstId);
        
        /**
         * Appends and returns a new empty "first-id" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId addNewFirstId();
        
        /**
         * Gets the "second-id" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId getSecondId();
        
        /**
         * Sets the "second-id" element
         */
        void setSecondId(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId secondId);
        
        /**
         * Appends and returns a new empty "second-id" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId addNewSecondId();
        
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
         * Gets array of all "first-starts" elements
         */
        java.math.BigInteger[] getFirstStartsArray();
        
        /**
         * Gets ith "first-starts" element
         */
        java.math.BigInteger getFirstStartsArray(int i);
        
        /**
         * Gets (as xml) array of all "first-starts" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetFirstStartsArray();
        
        /**
         * Gets (as xml) ith "first-starts" element
         */
        org.apache.xmlbeans.XmlInteger xgetFirstStartsArray(int i);
        
        /**
         * Returns number of "first-starts" element
         */
        int sizeOfFirstStartsArray();
        
        /**
         * Sets array of all "first-starts" element
         */
        void setFirstStartsArray(java.math.BigInteger[] firstStartsArray);
        
        /**
         * Sets ith "first-starts" element
         */
        void setFirstStartsArray(int i, java.math.BigInteger firstStarts);
        
        /**
         * Sets (as xml) array of all "first-starts" element
         */
        void xsetFirstStartsArray(org.apache.xmlbeans.XmlInteger[] firstStartsArray);
        
        /**
         * Sets (as xml) ith "first-starts" element
         */
        void xsetFirstStartsArray(int i, org.apache.xmlbeans.XmlInteger firstStarts);
        
        /**
         * Inserts the value as the ith "first-starts" element
         */
        void insertFirstStarts(int i, java.math.BigInteger firstStarts);
        
        /**
         * Appends the value as the last "first-starts" element
         */
        void addFirstStarts(java.math.BigInteger firstStarts);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "first-starts" element
         */
        org.apache.xmlbeans.XmlInteger insertNewFirstStarts(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "first-starts" element
         */
        org.apache.xmlbeans.XmlInteger addNewFirstStarts();
        
        /**
         * Removes the ith "first-starts" element
         */
        void removeFirstStarts(int i);
        
        /**
         * Gets array of all "second-starts" elements
         */
        java.math.BigInteger[] getSecondStartsArray();
        
        /**
         * Gets ith "second-starts" element
         */
        java.math.BigInteger getSecondStartsArray(int i);
        
        /**
         * Gets (as xml) array of all "second-starts" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetSecondStartsArray();
        
        /**
         * Gets (as xml) ith "second-starts" element
         */
        org.apache.xmlbeans.XmlInteger xgetSecondStartsArray(int i);
        
        /**
         * Returns number of "second-starts" element
         */
        int sizeOfSecondStartsArray();
        
        /**
         * Sets array of all "second-starts" element
         */
        void setSecondStartsArray(java.math.BigInteger[] secondStartsArray);
        
        /**
         * Sets ith "second-starts" element
         */
        void setSecondStartsArray(int i, java.math.BigInteger secondStarts);
        
        /**
         * Sets (as xml) array of all "second-starts" element
         */
        void xsetSecondStartsArray(org.apache.xmlbeans.XmlInteger[] secondStartsArray);
        
        /**
         * Sets (as xml) ith "second-starts" element
         */
        void xsetSecondStartsArray(int i, org.apache.xmlbeans.XmlInteger secondStarts);
        
        /**
         * Inserts the value as the ith "second-starts" element
         */
        void insertSecondStarts(int i, java.math.BigInteger secondStarts);
        
        /**
         * Appends the value as the last "second-starts" element
         */
        void addSecondStarts(java.math.BigInteger secondStarts);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "second-starts" element
         */
        org.apache.xmlbeans.XmlInteger insertNewSecondStarts(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "second-starts" element
         */
        org.apache.xmlbeans.XmlInteger addNewSecondStarts();
        
        /**
         * Removes the ith "second-starts" element
         */
        void removeSecondStarts(int i);
        
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
         * Gets the "second-strands" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands getSecondStrands();
        
        /**
         * True if has "second-strands" element
         */
        boolean isSetSecondStrands();
        
        /**
         * Sets the "second-strands" element
         */
        void setSecondStrands(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands secondStrands);
        
        /**
         * Appends and returns a new empty "second-strands" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands addNewSecondStrands();
        
        /**
         * Unsets the "second-strands" element
         */
        void unsetSecondStrands();
        
        /**
         * Gets the "seg-scores" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores getSegScores();
        
        /**
         * True if has "seg-scores" element
         */
        boolean isSetSegScores();
        
        /**
         * Sets the "seg-scores" element
         */
        void setSegScores(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores segScores);
        
        /**
         * Appends and returns a new empty "seg-scores" element
         */
        gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores addNewSegScores();
        
        /**
         * Unsets the "seg-scores" element
         */
        void unsetSegScores();
        
        /**
         * An XML first-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FirstId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FirstId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("firstid9e16elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML second-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SecondId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("secondid90a2elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML second-strands(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SecondStrands extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondStrands.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("secondstrands0692elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seg-scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SegScores extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SegScores.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("segscores9817elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores newInstance() {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign newInstance() {
              return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SparseAlignDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SparseAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
