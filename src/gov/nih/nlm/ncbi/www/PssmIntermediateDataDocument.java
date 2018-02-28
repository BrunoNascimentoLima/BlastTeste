/*
 * An XML document type.
 * Localname: PssmIntermediateData
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PssmIntermediateData(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PssmIntermediateDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmIntermediateDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmintermediatedatab35edoctype");
    
    /**
     * Gets the "PssmIntermediateData" element
     */
    gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData getPssmIntermediateData();
    
    /**
     * Sets the "PssmIntermediateData" element
     */
    void setPssmIntermediateData(gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData pssmIntermediateData);
    
    /**
     * Appends and returns a new empty "PssmIntermediateData" element
     */
    gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData addNewPssmIntermediateData();
    
    /**
     * An XML PssmIntermediateData(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PssmIntermediateData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmIntermediateData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmintermediatedatabf22elemtype");
        
        /**
         * Gets array of all "resFreqsPerPos" elements
         */
        java.math.BigInteger[] getResFreqsPerPosArray();
        
        /**
         * Gets ith "resFreqsPerPos" element
         */
        java.math.BigInteger getResFreqsPerPosArray(int i);
        
        /**
         * Gets (as xml) array of all "resFreqsPerPos" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetResFreqsPerPosArray();
        
        /**
         * Gets (as xml) ith "resFreqsPerPos" element
         */
        org.apache.xmlbeans.XmlInteger xgetResFreqsPerPosArray(int i);
        
        /**
         * Returns number of "resFreqsPerPos" element
         */
        int sizeOfResFreqsPerPosArray();
        
        /**
         * Sets array of all "resFreqsPerPos" element
         */
        void setResFreqsPerPosArray(java.math.BigInteger[] resFreqsPerPosArray);
        
        /**
         * Sets ith "resFreqsPerPos" element
         */
        void setResFreqsPerPosArray(int i, java.math.BigInteger resFreqsPerPos);
        
        /**
         * Sets (as xml) array of all "resFreqsPerPos" element
         */
        void xsetResFreqsPerPosArray(org.apache.xmlbeans.XmlInteger[] resFreqsPerPosArray);
        
        /**
         * Sets (as xml) ith "resFreqsPerPos" element
         */
        void xsetResFreqsPerPosArray(int i, org.apache.xmlbeans.XmlInteger resFreqsPerPos);
        
        /**
         * Inserts the value as the ith "resFreqsPerPos" element
         */
        void insertResFreqsPerPos(int i, java.math.BigInteger resFreqsPerPos);
        
        /**
         * Appends the value as the last "resFreqsPerPos" element
         */
        void addResFreqsPerPos(java.math.BigInteger resFreqsPerPos);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resFreqsPerPos" element
         */
        org.apache.xmlbeans.XmlInteger insertNewResFreqsPerPos(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resFreqsPerPos" element
         */
        org.apache.xmlbeans.XmlInteger addNewResFreqsPerPos();
        
        /**
         * Removes the ith "resFreqsPerPos" element
         */
        void removeResFreqsPerPos(int i);
        
        /**
         * Gets array of all "weightedResFreqsPerPos" elements
         */
        double[] getWeightedResFreqsPerPosArray();
        
        /**
         * Gets ith "weightedResFreqsPerPos" element
         */
        double getWeightedResFreqsPerPosArray(int i);
        
        /**
         * Gets (as xml) array of all "weightedResFreqsPerPos" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetWeightedResFreqsPerPosArray();
        
        /**
         * Gets (as xml) ith "weightedResFreqsPerPos" element
         */
        org.apache.xmlbeans.XmlDouble xgetWeightedResFreqsPerPosArray(int i);
        
        /**
         * Returns number of "weightedResFreqsPerPos" element
         */
        int sizeOfWeightedResFreqsPerPosArray();
        
        /**
         * Sets array of all "weightedResFreqsPerPos" element
         */
        void setWeightedResFreqsPerPosArray(double[] weightedResFreqsPerPosArray);
        
        /**
         * Sets ith "weightedResFreqsPerPos" element
         */
        void setWeightedResFreqsPerPosArray(int i, double weightedResFreqsPerPos);
        
        /**
         * Sets (as xml) array of all "weightedResFreqsPerPos" element
         */
        void xsetWeightedResFreqsPerPosArray(org.apache.xmlbeans.XmlDouble[] weightedResFreqsPerPosArray);
        
        /**
         * Sets (as xml) ith "weightedResFreqsPerPos" element
         */
        void xsetWeightedResFreqsPerPosArray(int i, org.apache.xmlbeans.XmlDouble weightedResFreqsPerPos);
        
        /**
         * Inserts the value as the ith "weightedResFreqsPerPos" element
         */
        void insertWeightedResFreqsPerPos(int i, double weightedResFreqsPerPos);
        
        /**
         * Appends the value as the last "weightedResFreqsPerPos" element
         */
        void addWeightedResFreqsPerPos(double weightedResFreqsPerPos);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "weightedResFreqsPerPos" element
         */
        org.apache.xmlbeans.XmlDouble insertNewWeightedResFreqsPerPos(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "weightedResFreqsPerPos" element
         */
        org.apache.xmlbeans.XmlDouble addNewWeightedResFreqsPerPos();
        
        /**
         * Removes the ith "weightedResFreqsPerPos" element
         */
        void removeWeightedResFreqsPerPos(int i);
        
        /**
         * Gets array of all "freqRatios" elements
         */
        double[] getFreqRatiosArray();
        
        /**
         * Gets ith "freqRatios" element
         */
        double getFreqRatiosArray(int i);
        
        /**
         * Gets (as xml) array of all "freqRatios" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetFreqRatiosArray();
        
        /**
         * Gets (as xml) ith "freqRatios" element
         */
        org.apache.xmlbeans.XmlDouble xgetFreqRatiosArray(int i);
        
        /**
         * Returns number of "freqRatios" element
         */
        int sizeOfFreqRatiosArray();
        
        /**
         * Sets array of all "freqRatios" element
         */
        void setFreqRatiosArray(double[] freqRatiosArray);
        
        /**
         * Sets ith "freqRatios" element
         */
        void setFreqRatiosArray(int i, double freqRatios);
        
        /**
         * Sets (as xml) array of all "freqRatios" element
         */
        void xsetFreqRatiosArray(org.apache.xmlbeans.XmlDouble[] freqRatiosArray);
        
        /**
         * Sets (as xml) ith "freqRatios" element
         */
        void xsetFreqRatiosArray(int i, org.apache.xmlbeans.XmlDouble freqRatios);
        
        /**
         * Inserts the value as the ith "freqRatios" element
         */
        void insertFreqRatios(int i, double freqRatios);
        
        /**
         * Appends the value as the last "freqRatios" element
         */
        void addFreqRatios(double freqRatios);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "freqRatios" element
         */
        org.apache.xmlbeans.XmlDouble insertNewFreqRatios(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "freqRatios" element
         */
        org.apache.xmlbeans.XmlDouble addNewFreqRatios();
        
        /**
         * Removes the ith "freqRatios" element
         */
        void removeFreqRatios(int i);
        
        /**
         * Gets array of all "informationContent" elements
         */
        double[] getInformationContentArray();
        
        /**
         * Gets ith "informationContent" element
         */
        double getInformationContentArray(int i);
        
        /**
         * Gets (as xml) array of all "informationContent" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetInformationContentArray();
        
        /**
         * Gets (as xml) ith "informationContent" element
         */
        org.apache.xmlbeans.XmlDouble xgetInformationContentArray(int i);
        
        /**
         * Returns number of "informationContent" element
         */
        int sizeOfInformationContentArray();
        
        /**
         * Sets array of all "informationContent" element
         */
        void setInformationContentArray(double[] informationContentArray);
        
        /**
         * Sets ith "informationContent" element
         */
        void setInformationContentArray(int i, double informationContent);
        
        /**
         * Sets (as xml) array of all "informationContent" element
         */
        void xsetInformationContentArray(org.apache.xmlbeans.XmlDouble[] informationContentArray);
        
        /**
         * Sets (as xml) ith "informationContent" element
         */
        void xsetInformationContentArray(int i, org.apache.xmlbeans.XmlDouble informationContent);
        
        /**
         * Inserts the value as the ith "informationContent" element
         */
        void insertInformationContent(int i, double informationContent);
        
        /**
         * Appends the value as the last "informationContent" element
         */
        void addInformationContent(double informationContent);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "informationContent" element
         */
        org.apache.xmlbeans.XmlDouble insertNewInformationContent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "informationContent" element
         */
        org.apache.xmlbeans.XmlDouble addNewInformationContent();
        
        /**
         * Removes the ith "informationContent" element
         */
        void removeInformationContent(int i);
        
        /**
         * Gets array of all "gaplessColumnWeights" elements
         */
        double[] getGaplessColumnWeightsArray();
        
        /**
         * Gets ith "gaplessColumnWeights" element
         */
        double getGaplessColumnWeightsArray(int i);
        
        /**
         * Gets (as xml) array of all "gaplessColumnWeights" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetGaplessColumnWeightsArray();
        
        /**
         * Gets (as xml) ith "gaplessColumnWeights" element
         */
        org.apache.xmlbeans.XmlDouble xgetGaplessColumnWeightsArray(int i);
        
        /**
         * Returns number of "gaplessColumnWeights" element
         */
        int sizeOfGaplessColumnWeightsArray();
        
        /**
         * Sets array of all "gaplessColumnWeights" element
         */
        void setGaplessColumnWeightsArray(double[] gaplessColumnWeightsArray);
        
        /**
         * Sets ith "gaplessColumnWeights" element
         */
        void setGaplessColumnWeightsArray(int i, double gaplessColumnWeights);
        
        /**
         * Sets (as xml) array of all "gaplessColumnWeights" element
         */
        void xsetGaplessColumnWeightsArray(org.apache.xmlbeans.XmlDouble[] gaplessColumnWeightsArray);
        
        /**
         * Sets (as xml) ith "gaplessColumnWeights" element
         */
        void xsetGaplessColumnWeightsArray(int i, org.apache.xmlbeans.XmlDouble gaplessColumnWeights);
        
        /**
         * Inserts the value as the ith "gaplessColumnWeights" element
         */
        void insertGaplessColumnWeights(int i, double gaplessColumnWeights);
        
        /**
         * Appends the value as the last "gaplessColumnWeights" element
         */
        void addGaplessColumnWeights(double gaplessColumnWeights);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gaplessColumnWeights" element
         */
        org.apache.xmlbeans.XmlDouble insertNewGaplessColumnWeights(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gaplessColumnWeights" element
         */
        org.apache.xmlbeans.XmlDouble addNewGaplessColumnWeights();
        
        /**
         * Removes the ith "gaplessColumnWeights" element
         */
        void removeGaplessColumnWeights(int i);
        
        /**
         * Gets array of all "sigma" elements
         */
        double[] getSigmaArray();
        
        /**
         * Gets ith "sigma" element
         */
        double getSigmaArray(int i);
        
        /**
         * Gets (as xml) array of all "sigma" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetSigmaArray();
        
        /**
         * Gets (as xml) ith "sigma" element
         */
        org.apache.xmlbeans.XmlDouble xgetSigmaArray(int i);
        
        /**
         * Returns number of "sigma" element
         */
        int sizeOfSigmaArray();
        
        /**
         * Sets array of all "sigma" element
         */
        void setSigmaArray(double[] sigmaArray);
        
        /**
         * Sets ith "sigma" element
         */
        void setSigmaArray(int i, double sigma);
        
        /**
         * Sets (as xml) array of all "sigma" element
         */
        void xsetSigmaArray(org.apache.xmlbeans.XmlDouble[] sigmaArray);
        
        /**
         * Sets (as xml) ith "sigma" element
         */
        void xsetSigmaArray(int i, org.apache.xmlbeans.XmlDouble sigma);
        
        /**
         * Inserts the value as the ith "sigma" element
         */
        void insertSigma(int i, double sigma);
        
        /**
         * Appends the value as the last "sigma" element
         */
        void addSigma(double sigma);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sigma" element
         */
        org.apache.xmlbeans.XmlDouble insertNewSigma(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sigma" element
         */
        org.apache.xmlbeans.XmlDouble addNewSigma();
        
        /**
         * Removes the ith "sigma" element
         */
        void removeSigma(int i);
        
        /**
         * Gets array of all "intervalSizes" elements
         */
        java.math.BigInteger[] getIntervalSizesArray();
        
        /**
         * Gets ith "intervalSizes" element
         */
        java.math.BigInteger getIntervalSizesArray(int i);
        
        /**
         * Gets (as xml) array of all "intervalSizes" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetIntervalSizesArray();
        
        /**
         * Gets (as xml) ith "intervalSizes" element
         */
        org.apache.xmlbeans.XmlInteger xgetIntervalSizesArray(int i);
        
        /**
         * Returns number of "intervalSizes" element
         */
        int sizeOfIntervalSizesArray();
        
        /**
         * Sets array of all "intervalSizes" element
         */
        void setIntervalSizesArray(java.math.BigInteger[] intervalSizesArray);
        
        /**
         * Sets ith "intervalSizes" element
         */
        void setIntervalSizesArray(int i, java.math.BigInteger intervalSizes);
        
        /**
         * Sets (as xml) array of all "intervalSizes" element
         */
        void xsetIntervalSizesArray(org.apache.xmlbeans.XmlInteger[] intervalSizesArray);
        
        /**
         * Sets (as xml) ith "intervalSizes" element
         */
        void xsetIntervalSizesArray(int i, org.apache.xmlbeans.XmlInteger intervalSizes);
        
        /**
         * Inserts the value as the ith "intervalSizes" element
         */
        void insertIntervalSizes(int i, java.math.BigInteger intervalSizes);
        
        /**
         * Appends the value as the last "intervalSizes" element
         */
        void addIntervalSizes(java.math.BigInteger intervalSizes);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "intervalSizes" element
         */
        org.apache.xmlbeans.XmlInteger insertNewIntervalSizes(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "intervalSizes" element
         */
        org.apache.xmlbeans.XmlInteger addNewIntervalSizes();
        
        /**
         * Removes the ith "intervalSizes" element
         */
        void removeIntervalSizes(int i);
        
        /**
         * Gets array of all "numMatchingSeqs" elements
         */
        java.math.BigInteger[] getNumMatchingSeqsArray();
        
        /**
         * Gets ith "numMatchingSeqs" element
         */
        java.math.BigInteger getNumMatchingSeqsArray(int i);
        
        /**
         * Gets (as xml) array of all "numMatchingSeqs" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetNumMatchingSeqsArray();
        
        /**
         * Gets (as xml) ith "numMatchingSeqs" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumMatchingSeqsArray(int i);
        
        /**
         * Returns number of "numMatchingSeqs" element
         */
        int sizeOfNumMatchingSeqsArray();
        
        /**
         * Sets array of all "numMatchingSeqs" element
         */
        void setNumMatchingSeqsArray(java.math.BigInteger[] numMatchingSeqsArray);
        
        /**
         * Sets ith "numMatchingSeqs" element
         */
        void setNumMatchingSeqsArray(int i, java.math.BigInteger numMatchingSeqs);
        
        /**
         * Sets (as xml) array of all "numMatchingSeqs" element
         */
        void xsetNumMatchingSeqsArray(org.apache.xmlbeans.XmlInteger[] numMatchingSeqsArray);
        
        /**
         * Sets (as xml) ith "numMatchingSeqs" element
         */
        void xsetNumMatchingSeqsArray(int i, org.apache.xmlbeans.XmlInteger numMatchingSeqs);
        
        /**
         * Inserts the value as the ith "numMatchingSeqs" element
         */
        void insertNumMatchingSeqs(int i, java.math.BigInteger numMatchingSeqs);
        
        /**
         * Appends the value as the last "numMatchingSeqs" element
         */
        void addNumMatchingSeqs(java.math.BigInteger numMatchingSeqs);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "numMatchingSeqs" element
         */
        org.apache.xmlbeans.XmlInteger insertNewNumMatchingSeqs(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "numMatchingSeqs" element
         */
        org.apache.xmlbeans.XmlInteger addNewNumMatchingSeqs();
        
        /**
         * Removes the ith "numMatchingSeqs" element
         */
        void removeNumMatchingSeqs(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData newInstance() {
              return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
