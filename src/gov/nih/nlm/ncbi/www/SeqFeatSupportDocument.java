/*
 * An XML document type.
 * Localname: SeqFeatSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SeqFeatSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqFeatSupportDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqFeatSupportDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqfeatsupportcf7cdoctype");
    
    /**
     * Gets the "SeqFeatSupport" element
     */
    gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport getSeqFeatSupport();
    
    /**
     * Sets the "SeqFeatSupport" element
     */
    void setSeqFeatSupport(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport seqFeatSupport);
    
    /**
     * Appends and returns a new empty "SeqFeatSupport" element
     */
    gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport addNewSeqFeatSupport();
    
    /**
     * An XML SeqFeatSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqFeatSupport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqFeatSupport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqfeatsupport06a2elemtype");
        
        /**
         * Gets the "experiment" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment getExperiment();
        
        /**
         * True if has "experiment" element
         */
        boolean isSetExperiment();
        
        /**
         * Sets the "experiment" element
         */
        void setExperiment(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment experiment);
        
        /**
         * Appends and returns a new empty "experiment" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment addNewExperiment();
        
        /**
         * Unsets the "experiment" element
         */
        void unsetExperiment();
        
        /**
         * Gets the "inference" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference getInference();
        
        /**
         * True if has "inference" element
         */
        boolean isSetInference();
        
        /**
         * Sets the "inference" element
         */
        void setInference(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference inference);
        
        /**
         * Appends and returns a new empty "inference" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference addNewInference();
        
        /**
         * Unsets the "inference" element
         */
        void unsetInference();
        
        /**
         * Gets the "model-evidence" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence getModelEvidence();
        
        /**
         * True if has "model-evidence" element
         */
        boolean isSetModelEvidence();
        
        /**
         * Sets the "model-evidence" element
         */
        void setModelEvidence(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence modelEvidence);
        
        /**
         * Appends and returns a new empty "model-evidence" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence addNewModelEvidence();
        
        /**
         * Unsets the "model-evidence" element
         */
        void unsetModelEvidence();
        
        /**
         * An XML experiment(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Experiment extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Experiment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("experiment977belemtype");
            
            /**
             * Gets array of all "ExperimentSupport" elements
             */
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport[] getExperimentSupportArray();
            
            /**
             * Gets ith "ExperimentSupport" element
             */
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport getExperimentSupportArray(int i);
            
            /**
             * Returns number of "ExperimentSupport" element
             */
            int sizeOfExperimentSupportArray();
            
            /**
             * Sets array of all "ExperimentSupport" element
             */
            void setExperimentSupportArray(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport[] experimentSupportArray);
            
            /**
             * Sets ith "ExperimentSupport" element
             */
            void setExperimentSupportArray(int i, gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport experimentSupport);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ExperimentSupport" element
             */
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport insertNewExperimentSupport(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ExperimentSupport" element
             */
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport addNewExperimentSupport();
            
            /**
             * Removes the ith "ExperimentSupport" element
             */
            void removeExperimentSupport(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML inference(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Inference extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("inference4a67elemtype");
            
            /**
             * Gets array of all "InferenceSupport" elements
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport[] getInferenceSupportArray();
            
            /**
             * Gets ith "InferenceSupport" element
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport getInferenceSupportArray(int i);
            
            /**
             * Returns number of "InferenceSupport" element
             */
            int sizeOfInferenceSupportArray();
            
            /**
             * Sets array of all "InferenceSupport" element
             */
            void setInferenceSupportArray(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport[] inferenceSupportArray);
            
            /**
             * Sets ith "InferenceSupport" element
             */
            void setInferenceSupportArray(int i, gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport inferenceSupport);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InferenceSupport" element
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport insertNewInferenceSupport(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InferenceSupport" element
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport addNewInferenceSupport();
            
            /**
             * Removes the ith "InferenceSupport" element
             */
            void removeInferenceSupport(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML model-evidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ModelEvidence extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelEvidence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modelevidence6b79elemtype");
            
            /**
             * Gets array of all "ModelEvidenceSupport" elements
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport[] getModelEvidenceSupportArray();
            
            /**
             * Gets ith "ModelEvidenceSupport" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport getModelEvidenceSupportArray(int i);
            
            /**
             * Returns number of "ModelEvidenceSupport" element
             */
            int sizeOfModelEvidenceSupportArray();
            
            /**
             * Sets array of all "ModelEvidenceSupport" element
             */
            void setModelEvidenceSupportArray(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport[] modelEvidenceSupportArray);
            
            /**
             * Sets ith "ModelEvidenceSupport" element
             */
            void setModelEvidenceSupportArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport modelEvidenceSupport);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceSupport" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport insertNewModelEvidenceSupport(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceSupport" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport addNewModelEvidenceSupport();
            
            /**
             * Removes the ith "ModelEvidenceSupport" element
             */
            void removeModelEvidenceSupport(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqFeatSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
