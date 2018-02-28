/*
 * An XML document type.
 * Localname: Blast4-request-body
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-request-body(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4RequestBodyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4RequestBodyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4requestbodyec9ddoctype");
    
    /**
     * Gets the "Blast4-request-body" element
     */
    gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody getBlast4RequestBody();
    
    /**
     * Sets the "Blast4-request-body" element
     */
    void setBlast4RequestBody(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody blast4RequestBody);
    
    /**
     * Appends and returns a new empty "Blast4-request-body" element
     */
    gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody addNewBlast4RequestBody();
    
    /**
     * An XML Blast4-request-body(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4RequestBody extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4RequestBody.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4requestbody86baelemtype");
        
        /**
         * Gets the "finish-params" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams getFinishParams();
        
        /**
         * True if has "finish-params" element
         */
        boolean isSetFinishParams();
        
        /**
         * Sets the "finish-params" element
         */
        void setFinishParams(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams finishParams);
        
        /**
         * Appends and returns a new empty "finish-params" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams addNewFinishParams();
        
        /**
         * Unsets the "finish-params" element
         */
        void unsetFinishParams();
        
        /**
         * Gets the "get-databases" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases getGetDatabases();
        
        /**
         * True if has "get-databases" element
         */
        boolean isSetGetDatabases();
        
        /**
         * Sets the "get-databases" element
         */
        void setGetDatabases(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases getDatabases);
        
        /**
         * Appends and returns a new empty "get-databases" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases addNewGetDatabases();
        
        /**
         * Unsets the "get-databases" element
         */
        void unsetGetDatabases();
        
        /**
         * Gets the "get-matrices" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices getGetMatrices();
        
        /**
         * True if has "get-matrices" element
         */
        boolean isSetGetMatrices();
        
        /**
         * Sets the "get-matrices" element
         */
        void setGetMatrices(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices getMatrices);
        
        /**
         * Appends and returns a new empty "get-matrices" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices addNewGetMatrices();
        
        /**
         * Unsets the "get-matrices" element
         */
        void unsetGetMatrices();
        
        /**
         * Gets the "get-parameters" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters getGetParameters();
        
        /**
         * True if has "get-parameters" element
         */
        boolean isSetGetParameters();
        
        /**
         * Sets the "get-parameters" element
         */
        void setGetParameters(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters getParameters);
        
        /**
         * Appends and returns a new empty "get-parameters" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters addNewGetParameters();
        
        /**
         * Unsets the "get-parameters" element
         */
        void unsetGetParameters();
        
        /**
         * Gets the "get-paramsets" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets getGetParamsets();
        
        /**
         * True if has "get-paramsets" element
         */
        boolean isSetGetParamsets();
        
        /**
         * Sets the "get-paramsets" element
         */
        void setGetParamsets(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets getParamsets);
        
        /**
         * Appends and returns a new empty "get-paramsets" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets addNewGetParamsets();
        
        /**
         * Unsets the "get-paramsets" element
         */
        void unsetGetParamsets();
        
        /**
         * Gets the "get-programs" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms getGetPrograms();
        
        /**
         * True if has "get-programs" element
         */
        boolean isSetGetPrograms();
        
        /**
         * Sets the "get-programs" element
         */
        void setGetPrograms(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms getPrograms);
        
        /**
         * Appends and returns a new empty "get-programs" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms addNewGetPrograms();
        
        /**
         * Unsets the "get-programs" element
         */
        void unsetGetPrograms();
        
        /**
         * Gets the "get-search-results" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults getGetSearchResults();
        
        /**
         * True if has "get-search-results" element
         */
        boolean isSetGetSearchResults();
        
        /**
         * Sets the "get-search-results" element
         */
        void setGetSearchResults(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults getSearchResults);
        
        /**
         * Appends and returns a new empty "get-search-results" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults addNewGetSearchResults();
        
        /**
         * Unsets the "get-search-results" element
         */
        void unsetGetSearchResults();
        
        /**
         * Gets the "get-sequences" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences getGetSequences();
        
        /**
         * True if has "get-sequences" element
         */
        boolean isSetGetSequences();
        
        /**
         * Sets the "get-sequences" element
         */
        void setGetSequences(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences getSequences);
        
        /**
         * Appends and returns a new empty "get-sequences" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences addNewGetSequences();
        
        /**
         * Unsets the "get-sequences" element
         */
        void unsetGetSequences();
        
        /**
         * Gets the "queue-search" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch getQueueSearch();
        
        /**
         * True if has "queue-search" element
         */
        boolean isSetQueueSearch();
        
        /**
         * Sets the "queue-search" element
         */
        void setQueueSearch(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch queueSearch);
        
        /**
         * Appends and returns a new empty "queue-search" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch addNewQueueSearch();
        
        /**
         * Unsets the "queue-search" element
         */
        void unsetQueueSearch();
        
        /**
         * Gets the "get-request-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo getGetRequestInfo();
        
        /**
         * True if has "get-request-info" element
         */
        boolean isSetGetRequestInfo();
        
        /**
         * Sets the "get-request-info" element
         */
        void setGetRequestInfo(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo getRequestInfo);
        
        /**
         * Appends and returns a new empty "get-request-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo addNewGetRequestInfo();
        
        /**
         * Unsets the "get-request-info" element
         */
        void unsetGetRequestInfo();
        
        /**
         * Gets the "get-sequence-parts" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts getGetSequenceParts();
        
        /**
         * True if has "get-sequence-parts" element
         */
        boolean isSetGetSequenceParts();
        
        /**
         * Sets the "get-sequence-parts" element
         */
        void setGetSequenceParts(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts getSequenceParts);
        
        /**
         * Appends and returns a new empty "get-sequence-parts" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts addNewGetSequenceParts();
        
        /**
         * Unsets the "get-sequence-parts" element
         */
        void unsetGetSequenceParts();
        
        /**
         * Gets the "get-windowmasked-taxids" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids getGetWindowmaskedTaxids();
        
        /**
         * True if has "get-windowmasked-taxids" element
         */
        boolean isSetGetWindowmaskedTaxids();
        
        /**
         * Sets the "get-windowmasked-taxids" element
         */
        void setGetWindowmaskedTaxids(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids getWindowmaskedTaxids);
        
        /**
         * Appends and returns a new empty "get-windowmasked-taxids" element
         */
        gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids addNewGetWindowmaskedTaxids();
        
        /**
         * Unsets the "get-windowmasked-taxids" element
         */
        void unsetGetWindowmaskedTaxids();
        
        /**
         * An XML finish-params(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FinishParams extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinishParams.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("finishparamsc526elemtype");
            
            /**
             * Gets the "Blast4-finish-params-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest getBlast4FinishParamsRequest();
            
            /**
             * Sets the "Blast4-finish-params-request" element
             */
            void setBlast4FinishParamsRequest(gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest blast4FinishParamsRequest);
            
            /**
             * Appends and returns a new empty "Blast4-finish-params-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest addNewBlast4FinishParamsRequest();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-databases(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetDatabases extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDatabases.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getdatabasesccc7elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-matrices(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetMatrices extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMatrices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getmatricese447elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-parameters(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetParameters extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getparameters5d17elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-paramsets(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetParamsets extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetParamsets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getparamsetsf2cdelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-programs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetPrograms extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPrograms.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getprograms205celemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-search-results(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetSearchResults extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSearchResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getsearchresults997eelemtype");
            
            /**
             * Gets the "Blast4-get-search-results-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest getBlast4GetSearchResultsRequest();
            
            /**
             * Sets the "Blast4-get-search-results-request" element
             */
            void setBlast4GetSearchResultsRequest(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest blast4GetSearchResultsRequest);
            
            /**
             * Appends and returns a new empty "Blast4-get-search-results-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest addNewBlast4GetSearchResultsRequest();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-sequences(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetSequences extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSequences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getsequences4541elemtype");
            
            /**
             * Gets the "Blast4-get-sequences-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest getBlast4GetSequencesRequest();
            
            /**
             * Sets the "Blast4-get-sequences-request" element
             */
            void setBlast4GetSequencesRequest(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest blast4GetSequencesRequest);
            
            /**
             * Appends and returns a new empty "Blast4-get-sequences-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest addNewBlast4GetSequencesRequest();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML queue-search(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface QueueSearch extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueueSearch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("queuesearch7d3aelemtype");
            
            /**
             * Gets the "Blast4-queue-search-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest getBlast4QueueSearchRequest();
            
            /**
             * Sets the "Blast4-queue-search-request" element
             */
            void setBlast4QueueSearchRequest(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest blast4QueueSearchRequest);
            
            /**
             * Appends and returns a new empty "Blast4-queue-search-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest addNewBlast4QueueSearchRequest();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-request-info(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetRequestInfo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRequestInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getrequestinfo1e99elemtype");
            
            /**
             * Gets the "Blast4-get-request-info-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest getBlast4GetRequestInfoRequest();
            
            /**
             * Sets the "Blast4-get-request-info-request" element
             */
            void setBlast4GetRequestInfoRequest(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest blast4GetRequestInfoRequest);
            
            /**
             * Appends and returns a new empty "Blast4-get-request-info-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest addNewBlast4GetRequestInfoRequest();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-sequence-parts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetSequenceParts extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSequenceParts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getsequenceparts0381elemtype");
            
            /**
             * Gets the "Blast4-get-seq-parts-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest getBlast4GetSeqPartsRequest();
            
            /**
             * Sets the "Blast4-get-seq-parts-request" element
             */
            void setBlast4GetSeqPartsRequest(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest blast4GetSeqPartsRequest);
            
            /**
             * Appends and returns a new empty "Blast4-get-seq-parts-request" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest addNewBlast4GetSeqPartsRequest();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-windowmasked-taxids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetWindowmaskedTaxids extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWindowmaskedTaxids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getwindowmaskedtaxids72eeelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
