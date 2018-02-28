/*
 * An XML document type.
 * Localname: Blast4-common-options
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionseb39doctype");
    
    /**
     * Gets the "Blast4-common-options" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions getBlast4CommonOptions();
    
    /**
     * Sets the "Blast4-common-options" element
     */
    void setBlast4CommonOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions blast4CommonOptions);
    
    /**
     * Appends and returns a new empty "Blast4-common-options" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions addNewBlast4CommonOptions();
    
    /**
     * An XML Blast4-common-options(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsa072elemtype");
        
        /**
         * Gets the "percent-identity" element
         */
        double getPercentIdentity();
        
        /**
         * Gets (as xml) the "percent-identity" element
         */
        org.apache.xmlbeans.XmlDouble xgetPercentIdentity();
        
        /**
         * True if has "percent-identity" element
         */
        boolean isSetPercentIdentity();
        
        /**
         * Sets the "percent-identity" element
         */
        void setPercentIdentity(double percentIdentity);
        
        /**
         * Sets (as xml) the "percent-identity" element
         */
        void xsetPercentIdentity(org.apache.xmlbeans.XmlDouble percentIdentity);
        
        /**
         * Unsets the "percent-identity" element
         */
        void unsetPercentIdentity();
        
        /**
         * Gets the "evalue" element
         */
        double getEvalue();
        
        /**
         * Gets (as xml) the "evalue" element
         */
        org.apache.xmlbeans.XmlDouble xgetEvalue();
        
        /**
         * True if has "evalue" element
         */
        boolean isSetEvalue();
        
        /**
         * Sets the "evalue" element
         */
        void setEvalue(double evalue);
        
        /**
         * Sets (as xml) the "evalue" element
         */
        void xsetEvalue(org.apache.xmlbeans.XmlDouble evalue);
        
        /**
         * Unsets the "evalue" element
         */
        void unsetEvalue();
        
        /**
         * Gets the "word-size" element
         */
        java.math.BigInteger getWordSize();
        
        /**
         * Gets (as xml) the "word-size" element
         */
        org.apache.xmlbeans.XmlInteger xgetWordSize();
        
        /**
         * True if has "word-size" element
         */
        boolean isSetWordSize();
        
        /**
         * Sets the "word-size" element
         */
        void setWordSize(java.math.BigInteger wordSize);
        
        /**
         * Sets (as xml) the "word-size" element
         */
        void xsetWordSize(org.apache.xmlbeans.XmlInteger wordSize);
        
        /**
         * Unsets the "word-size" element
         */
        void unsetWordSize();
        
        /**
         * Gets the "hitlist-size" element
         */
        java.math.BigInteger getHitlistSize();
        
        /**
         * Gets (as xml) the "hitlist-size" element
         */
        org.apache.xmlbeans.XmlInteger xgetHitlistSize();
        
        /**
         * True if has "hitlist-size" element
         */
        boolean isSetHitlistSize();
        
        /**
         * Sets the "hitlist-size" element
         */
        void setHitlistSize(java.math.BigInteger hitlistSize);
        
        /**
         * Sets (as xml) the "hitlist-size" element
         */
        void xsetHitlistSize(org.apache.xmlbeans.XmlInteger hitlistSize);
        
        /**
         * Unsets the "hitlist-size" element
         */
        void unsetHitlistSize();
        
        /**
         * Gets the "db-restriction" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction getDbRestriction();
        
        /**
         * True if has "db-restriction" element
         */
        boolean isSetDbRestriction();
        
        /**
         * Sets the "db-restriction" element
         */
        void setDbRestriction(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction dbRestriction);
        
        /**
         * Appends and returns a new empty "db-restriction" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction addNewDbRestriction();
        
        /**
         * Unsets the "db-restriction" element
         */
        void unsetDbRestriction();
        
        /**
         * Gets the "query-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering getQueryFiltering();
        
        /**
         * True if has "query-filtering" element
         */
        boolean isSetQueryFiltering();
        
        /**
         * Sets the "query-filtering" element
         */
        void setQueryFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering queryFiltering);
        
        /**
         * Appends and returns a new empty "query-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering addNewQueryFiltering();
        
        /**
         * Unsets the "query-filtering" element
         */
        void unsetQueryFiltering();
        
        /**
         * Gets the "nucl-query-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions getNuclQueryOptions();
        
        /**
         * True if has "nucl-query-options" element
         */
        boolean isSetNuclQueryOptions();
        
        /**
         * Sets the "nucl-query-options" element
         */
        void setNuclQueryOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions nuclQueryOptions);
        
        /**
         * Appends and returns a new empty "nucl-query-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions addNewNuclQueryOptions();
        
        /**
         * Unsets the "nucl-query-options" element
         */
        void unsetNuclQueryOptions();
        
        /**
         * Gets the "scoring-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions getScoringOptions();
        
        /**
         * True if has "scoring-options" element
         */
        boolean isSetScoringOptions();
        
        /**
         * Sets the "scoring-options" element
         */
        void setScoringOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions scoringOptions);
        
        /**
         * Appends and returns a new empty "scoring-options" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions addNewScoringOptions();
        
        /**
         * Unsets the "scoring-options" element
         */
        void unsetScoringOptions();
        
        /**
         * Gets the "phi-pattern" element
         */
        java.lang.String getPhiPattern();
        
        /**
         * Gets (as xml) the "phi-pattern" element
         */
        org.apache.xmlbeans.XmlString xgetPhiPattern();
        
        /**
         * True if has "phi-pattern" element
         */
        boolean isSetPhiPattern();
        
        /**
         * Sets the "phi-pattern" element
         */
        void setPhiPattern(java.lang.String phiPattern);
        
        /**
         * Sets (as xml) the "phi-pattern" element
         */
        void xsetPhiPattern(org.apache.xmlbeans.XmlString phiPattern);
        
        /**
         * Unsets the "phi-pattern" element
         */
        void unsetPhiPattern();
        
        /**
         * Gets the "eff-search-space" element
         */
        double getEffSearchSpace();
        
        /**
         * Gets (as xml) the "eff-search-space" element
         */
        org.apache.xmlbeans.XmlDouble xgetEffSearchSpace();
        
        /**
         * True if has "eff-search-space" element
         */
        boolean isSetEffSearchSpace();
        
        /**
         * Sets the "eff-search-space" element
         */
        void setEffSearchSpace(double effSearchSpace);
        
        /**
         * Sets (as xml) the "eff-search-space" element
         */
        void xsetEffSearchSpace(org.apache.xmlbeans.XmlDouble effSearchSpace);
        
        /**
         * Unsets the "eff-search-space" element
         */
        void unsetEffSearchSpace();
        
        /**
         * Gets the "comp-based-statistics" element
         */
        java.math.BigInteger getCompBasedStatistics();
        
        /**
         * Gets (as xml) the "comp-based-statistics" element
         */
        org.apache.xmlbeans.XmlInteger xgetCompBasedStatistics();
        
        /**
         * True if has "comp-based-statistics" element
         */
        boolean isSetCompBasedStatistics();
        
        /**
         * Sets the "comp-based-statistics" element
         */
        void setCompBasedStatistics(java.math.BigInteger compBasedStatistics);
        
        /**
         * Sets (as xml) the "comp-based-statistics" element
         */
        void xsetCompBasedStatistics(org.apache.xmlbeans.XmlInteger compBasedStatistics);
        
        /**
         * Unsets the "comp-based-statistics" element
         */
        void unsetCompBasedStatistics();
        
        /**
         * An XML db-restriction(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface DbRestriction extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DbRestriction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dbrestriction3e8belemtype");
            
            /**
             * Gets the "Blast4-common-options-db-restriction" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction getBlast4CommonOptionsDbRestriction();
            
            /**
             * Sets the "Blast4-common-options-db-restriction" element
             */
            void setBlast4CommonOptionsDbRestriction(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction blast4CommonOptionsDbRestriction);
            
            /**
             * Appends and returns a new empty "Blast4-common-options-db-restriction" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction addNewBlast4CommonOptionsDbRestriction();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML query-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface QueryFiltering extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryFiltering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("queryfiltering5603elemtype");
            
            /**
             * Gets the "Blast4-common-options-query-filtering" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering getBlast4CommonOptionsQueryFiltering();
            
            /**
             * Sets the "Blast4-common-options-query-filtering" element
             */
            void setBlast4CommonOptionsQueryFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering blast4CommonOptionsQueryFiltering);
            
            /**
             * Appends and returns a new empty "Blast4-common-options-query-filtering" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering addNewBlast4CommonOptionsQueryFiltering();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML nucl-query-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface NuclQueryOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NuclQueryOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("nuclqueryoptionsbb0aelemtype");
            
            /**
             * Gets the "Blast4-common-options-nucleotide-query" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery getBlast4CommonOptionsNucleotideQuery();
            
            /**
             * Sets the "Blast4-common-options-nucleotide-query" element
             */
            void setBlast4CommonOptionsNucleotideQuery(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery blast4CommonOptionsNucleotideQuery);
            
            /**
             * Appends and returns a new empty "Blast4-common-options-nucleotide-query" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery addNewBlast4CommonOptionsNucleotideQuery();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML scoring-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ScoringOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScoringOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("scoringoptions6c7eelemtype");
            
            /**
             * Gets the "Blast4-common-options-scoring" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring getBlast4CommonOptionsScoring();
            
            /**
             * Sets the "Blast4-common-options-scoring" element
             */
            void setBlast4CommonOptionsScoring(gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring blast4CommonOptionsScoring);
            
            /**
             * Appends and returns a new empty "Blast4-common-options-scoring" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring addNewBlast4CommonOptionsScoring();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
