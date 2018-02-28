/*
 * An XML document type.
 * Localname: ExperimentSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ExperimentSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one ExperimentSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface ExperimentSupportDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExperimentSupportDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("experimentsupport68dedoctype");
    
    /**
     * Gets the "ExperimentSupport" element
     */
    gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport getExperimentSupport();
    
    /**
     * Sets the "ExperimentSupport" element
     */
    void setExperimentSupport(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport experimentSupport);
    
    /**
     * Appends and returns a new empty "ExperimentSupport" element
     */
    gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport addNewExperimentSupport();
    
    /**
     * An XML ExperimentSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface ExperimentSupport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExperimentSupport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("experimentsupporta43celemtype");
        
        /**
         * Gets the "category" element
         */
        gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category getCategory();
        
        /**
         * True if has "category" element
         */
        boolean isSetCategory();
        
        /**
         * Sets the "category" element
         */
        void setCategory(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category category);
        
        /**
         * Appends and returns a new empty "category" element
         */
        gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category addNewCategory();
        
        /**
         * Unsets the "category" element
         */
        void unsetCategory();
        
        /**
         * Gets the "explanation" element
         */
        java.lang.String getExplanation();
        
        /**
         * Gets (as xml) the "explanation" element
         */
        org.apache.xmlbeans.XmlString xgetExplanation();
        
        /**
         * Sets the "explanation" element
         */
        void setExplanation(java.lang.String explanation);
        
        /**
         * Sets (as xml) the "explanation" element
         */
        void xsetExplanation(org.apache.xmlbeans.XmlString explanation);
        
        /**
         * Gets the "pmids" element
         */
        gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids getPmids();
        
        /**
         * True if has "pmids" element
         */
        boolean isSetPmids();
        
        /**
         * Sets the "pmids" element
         */
        void setPmids(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids pmids);
        
        /**
         * Appends and returns a new empty "pmids" element
         */
        gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids addNewPmids();
        
        /**
         * Unsets the "pmids" element
         */
        void unsetPmids();
        
        /**
         * Gets the "dois" element
         */
        gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois getDois();
        
        /**
         * True if has "dois" element
         */
        boolean isSetDois();
        
        /**
         * Sets the "dois" element
         */
        void setDois(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois dois);
        
        /**
         * Appends and returns a new empty "dois" element
         */
        gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois addNewDois();
        
        /**
         * Unsets the "dois" element
         */
        void unsetDois();
        
        /**
         * An XML category(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Category extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Category.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("category24d6elemtype");
            
            /**
             * Gets the "EvidenceCategory" element
             */
            gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory getEvidenceCategory();
            
            /**
             * Sets the "EvidenceCategory" element
             */
            void setEvidenceCategory(gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory evidenceCategory);
            
            /**
             * Appends and returns a new empty "EvidenceCategory" element
             */
            gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory addNewEvidenceCategory();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category newInstance() {
                  return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmids extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmids92c3elemtype");
            
            /**
             * Gets array of all "PubMedId" elements
             */
            java.math.BigInteger[] getPubMedIdArray();
            
            /**
             * Gets ith "PubMedId" element
             */
            java.math.BigInteger getPubMedIdArray(int i);
            
            /**
             * Gets (as xml) array of all "PubMedId" elements
             */
            org.apache.xmlbeans.XmlInteger[] xgetPubMedIdArray();
            
            /**
             * Gets (as xml) ith "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger xgetPubMedIdArray(int i);
            
            /**
             * Returns number of "PubMedId" element
             */
            int sizeOfPubMedIdArray();
            
            /**
             * Sets array of all "PubMedId" element
             */
            void setPubMedIdArray(java.math.BigInteger[] pubMedIdArray);
            
            /**
             * Sets ith "PubMedId" element
             */
            void setPubMedIdArray(int i, java.math.BigInteger pubMedId);
            
            /**
             * Sets (as xml) array of all "PubMedId" element
             */
            void xsetPubMedIdArray(org.apache.xmlbeans.XmlInteger[] pubMedIdArray);
            
            /**
             * Sets (as xml) ith "PubMedId" element
             */
            void xsetPubMedIdArray(int i, org.apache.xmlbeans.XmlInteger pubMedId);
            
            /**
             * Inserts the value as the ith "PubMedId" element
             */
            void insertPubMedId(int i, java.math.BigInteger pubMedId);
            
            /**
             * Appends the value as the last "PubMedId" element
             */
            void addPubMedId(java.math.BigInteger pubMedId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger insertNewPubMedId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger addNewPubMedId();
            
            /**
             * Removes the ith "PubMedId" element
             */
            void removePubMedId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids newInstance() {
                  return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML dois(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Dois extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dois.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dois8b4delemtype");
            
            /**
             * Gets array of all "DOI" elements
             */
            java.lang.String[] getDOIArray();
            
            /**
             * Gets ith "DOI" element
             */
            java.lang.String getDOIArray(int i);
            
            /**
             * Gets (as xml) array of all "DOI" elements
             */
            org.apache.xmlbeans.XmlString[] xgetDOIArray();
            
            /**
             * Gets (as xml) ith "DOI" element
             */
            org.apache.xmlbeans.XmlString xgetDOIArray(int i);
            
            /**
             * Returns number of "DOI" element
             */
            int sizeOfDOIArray();
            
            /**
             * Sets array of all "DOI" element
             */
            void setDOIArray(java.lang.String[] doiArray);
            
            /**
             * Sets ith "DOI" element
             */
            void setDOIArray(int i, java.lang.String doi);
            
            /**
             * Sets (as xml) array of all "DOI" element
             */
            void xsetDOIArray(org.apache.xmlbeans.XmlString[] doiArray);
            
            /**
             * Sets (as xml) ith "DOI" element
             */
            void xsetDOIArray(int i, org.apache.xmlbeans.XmlString doi);
            
            /**
             * Inserts the value as the ith "DOI" element
             */
            void insertDOI(int i, java.lang.String doi);
            
            /**
             * Appends the value as the last "DOI" element
             */
            void addDOI(java.lang.String doi);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DOI" element
             */
            org.apache.xmlbeans.XmlString insertNewDOI(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DOI" element
             */
            org.apache.xmlbeans.XmlString addNewDOI();
            
            /**
             * Removes the ith "DOI" element
             */
            void removeDOI(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois newInstance() {
                  return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport newInstance() {
              return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ExperimentSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ExperimentSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
