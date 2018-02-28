/*
 * An XML document type.
 * Localname: Blast4-reply-body
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-reply-body(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4ReplyBodyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4ReplyBodyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4replybody11a2doctype");
    
    /**
     * Gets the "Blast4-reply-body" element
     */
    gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody getBlast4ReplyBody();
    
    /**
     * Sets the "Blast4-reply-body" element
     */
    void setBlast4ReplyBody(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody blast4ReplyBody);
    
    /**
     * Appends and returns a new empty "Blast4-reply-body" element
     */
    gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody addNewBlast4ReplyBody();
    
    /**
     * An XML Blast4-reply-body(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4ReplyBody extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4ReplyBody.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4replybodyebc4elemtype");
        
        /**
         * Gets the "finish-params" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams getFinishParams();
        
        /**
         * True if has "finish-params" element
         */
        boolean isSetFinishParams();
        
        /**
         * Sets the "finish-params" element
         */
        void setFinishParams(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams finishParams);
        
        /**
         * Appends and returns a new empty "finish-params" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams addNewFinishParams();
        
        /**
         * Unsets the "finish-params" element
         */
        void unsetFinishParams();
        
        /**
         * Gets the "get-databases" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases getGetDatabases();
        
        /**
         * True if has "get-databases" element
         */
        boolean isSetGetDatabases();
        
        /**
         * Sets the "get-databases" element
         */
        void setGetDatabases(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases getDatabases);
        
        /**
         * Appends and returns a new empty "get-databases" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases addNewGetDatabases();
        
        /**
         * Unsets the "get-databases" element
         */
        void unsetGetDatabases();
        
        /**
         * Gets the "get-matrices" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices getGetMatrices();
        
        /**
         * True if has "get-matrices" element
         */
        boolean isSetGetMatrices();
        
        /**
         * Sets the "get-matrices" element
         */
        void setGetMatrices(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices getMatrices);
        
        /**
         * Appends and returns a new empty "get-matrices" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices addNewGetMatrices();
        
        /**
         * Unsets the "get-matrices" element
         */
        void unsetGetMatrices();
        
        /**
         * Gets the "get-parameters" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters getGetParameters();
        
        /**
         * True if has "get-parameters" element
         */
        boolean isSetGetParameters();
        
        /**
         * Sets the "get-parameters" element
         */
        void setGetParameters(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters getParameters);
        
        /**
         * Appends and returns a new empty "get-parameters" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters addNewGetParameters();
        
        /**
         * Unsets the "get-parameters" element
         */
        void unsetGetParameters();
        
        /**
         * Gets the "get-paramsets" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets getGetParamsets();
        
        /**
         * True if has "get-paramsets" element
         */
        boolean isSetGetParamsets();
        
        /**
         * Sets the "get-paramsets" element
         */
        void setGetParamsets(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets getParamsets);
        
        /**
         * Appends and returns a new empty "get-paramsets" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets addNewGetParamsets();
        
        /**
         * Unsets the "get-paramsets" element
         */
        void unsetGetParamsets();
        
        /**
         * Gets the "get-programs" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms getGetPrograms();
        
        /**
         * True if has "get-programs" element
         */
        boolean isSetGetPrograms();
        
        /**
         * Sets the "get-programs" element
         */
        void setGetPrograms(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms getPrograms);
        
        /**
         * Appends and returns a new empty "get-programs" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms addNewGetPrograms();
        
        /**
         * Unsets the "get-programs" element
         */
        void unsetGetPrograms();
        
        /**
         * Gets the "get-search-results" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults getGetSearchResults();
        
        /**
         * True if has "get-search-results" element
         */
        boolean isSetGetSearchResults();
        
        /**
         * Sets the "get-search-results" element
         */
        void setGetSearchResults(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults getSearchResults);
        
        /**
         * Appends and returns a new empty "get-search-results" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults addNewGetSearchResults();
        
        /**
         * Unsets the "get-search-results" element
         */
        void unsetGetSearchResults();
        
        /**
         * Gets the "get-sequences" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences getGetSequences();
        
        /**
         * True if has "get-sequences" element
         */
        boolean isSetGetSequences();
        
        /**
         * Sets the "get-sequences" element
         */
        void setGetSequences(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences getSequences);
        
        /**
         * Appends and returns a new empty "get-sequences" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences addNewGetSequences();
        
        /**
         * Unsets the "get-sequences" element
         */
        void unsetGetSequences();
        
        /**
         * Gets the "queue-search" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch getQueueSearch();
        
        /**
         * True if has "queue-search" element
         */
        boolean isSetQueueSearch();
        
        /**
         * Sets the "queue-search" element
         */
        void setQueueSearch(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch queueSearch);
        
        /**
         * Appends and returns a new empty "queue-search" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch addNewQueueSearch();
        
        /**
         * Unsets the "queue-search" element
         */
        void unsetQueueSearch();
        
        /**
         * Gets the "get-queries" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries getGetQueries();
        
        /**
         * True if has "get-queries" element
         */
        boolean isSetGetQueries();
        
        /**
         * Sets the "get-queries" element
         */
        void setGetQueries(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries getQueries);
        
        /**
         * Appends and returns a new empty "get-queries" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries addNewGetQueries();
        
        /**
         * Unsets the "get-queries" element
         */
        void unsetGetQueries();
        
        /**
         * Gets the "get-request-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo getGetRequestInfo();
        
        /**
         * True if has "get-request-info" element
         */
        boolean isSetGetRequestInfo();
        
        /**
         * Sets the "get-request-info" element
         */
        void setGetRequestInfo(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo getRequestInfo);
        
        /**
         * Appends and returns a new empty "get-request-info" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo addNewGetRequestInfo();
        
        /**
         * Unsets the "get-request-info" element
         */
        void unsetGetRequestInfo();
        
        /**
         * Gets the "get-sequence-parts" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts getGetSequenceParts();
        
        /**
         * True if has "get-sequence-parts" element
         */
        boolean isSetGetSequenceParts();
        
        /**
         * Sets the "get-sequence-parts" element
         */
        void setGetSequenceParts(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts getSequenceParts);
        
        /**
         * Appends and returns a new empty "get-sequence-parts" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts addNewGetSequenceParts();
        
        /**
         * Unsets the "get-sequence-parts" element
         */
        void unsetGetSequenceParts();
        
        /**
         * Gets the "get-windowmasked-taxids" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids getGetWindowmaskedTaxids();
        
        /**
         * True if has "get-windowmasked-taxids" element
         */
        boolean isSetGetWindowmaskedTaxids();
        
        /**
         * Sets the "get-windowmasked-taxids" element
         */
        void setGetWindowmaskedTaxids(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids getWindowmaskedTaxids);
        
        /**
         * Appends and returns a new empty "get-windowmasked-taxids" element
         */
        gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids addNewGetWindowmaskedTaxids();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinishParams.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("finishparams4030elemtype");
            
            /**
             * Gets the "Blast4-finish-params-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply getBlast4FinishParamsReply();
            
            /**
             * Sets the "Blast4-finish-params-reply" element
             */
            void setBlast4FinishParamsReply(gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply blast4FinishParamsReply);
            
            /**
             * Appends and returns a new empty "Blast4-finish-params-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply addNewBlast4FinishParamsReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDatabases.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getdatabases4051elemtype");
            
            /**
             * Gets the "Blast4-get-databases-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply getBlast4GetDatabasesReply();
            
            /**
             * Sets the "Blast4-get-databases-reply" element
             */
            void setBlast4GetDatabasesReply(gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply blast4GetDatabasesReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-databases-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply addNewBlast4GetDatabasesReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMatrices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getmatrices17d1elemtype");
            
            /**
             * Gets the "Blast4-get-matrices-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply getBlast4GetMatricesReply();
            
            /**
             * Sets the "Blast4-get-matrices-reply" element
             */
            void setBlast4GetMatricesReply(gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply blast4GetMatricesReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-matrices-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply addNewBlast4GetMatricesReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getparameters78a1elemtype");
            
            /**
             * Gets the "Blast4-get-parameters-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply getBlast4GetParametersReply();
            
            /**
             * Sets the "Blast4-get-parameters-reply" element
             */
            void setBlast4GetParametersReply(gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply blast4GetParametersReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-parameters-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply addNewBlast4GetParametersReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetParamsets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getparamsets5957elemtype");
            
            /**
             * Gets the "Blast4-get-paramsets-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply getBlast4GetParamsetsReply();
            
            /**
             * Sets the "Blast4-get-paramsets-reply" element
             */
            void setBlast4GetParamsetsReply(gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply blast4GetParamsetsReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-paramsets-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply addNewBlast4GetParamsetsReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPrograms.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getprogramsa666elemtype");
            
            /**
             * Gets the "Blast4-get-programs-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply getBlast4GetProgramsReply();
            
            /**
             * Sets the "Blast4-get-programs-reply" element
             */
            void setBlast4GetProgramsReply(gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply blast4GetProgramsReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-programs-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply addNewBlast4GetProgramsReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSearchResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getsearchresults0088elemtype");
            
            /**
             * Gets the "Blast4-get-search-results-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply getBlast4GetSearchResultsReply();
            
            /**
             * Sets the "Blast4-get-search-results-reply" element
             */
            void setBlast4GetSearchResultsReply(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply blast4GetSearchResultsReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-search-results-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply addNewBlast4GetSearchResultsReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSequences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getsequences05cbelemtype");
            
            /**
             * Gets the "Blast4-get-sequences-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply getBlast4GetSequencesReply();
            
            /**
             * Sets the "Blast4-get-sequences-reply" element
             */
            void setBlast4GetSequencesReply(gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply blast4GetSequencesReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-sequences-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply addNewBlast4GetSequencesReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueueSearch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("queuesearch2244elemtype");
            
            /**
             * Gets the "Blast4-queue-search-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply getBlast4QueueSearchReply();
            
            /**
             * Sets the "Blast4-queue-search-reply" element
             */
            void setBlast4QueueSearchReply(gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply blast4QueueSearchReply);
            
            /**
             * Appends and returns a new empty "Blast4-queue-search-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply addNewBlast4QueueSearchReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML get-queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GetQueries extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetQueries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getqueriesaa9felemtype");
            
            /**
             * Gets the "Blast4-get-queries-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply getBlast4GetQueriesReply();
            
            /**
             * Sets the "Blast4-get-queries-reply" element
             */
            void setBlast4GetQueriesReply(gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply blast4GetQueriesReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-queries-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply addNewBlast4GetQueriesReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRequestInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getrequestinfo4b23elemtype");
            
            /**
             * Gets the "Blast4-get-request-info-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply getBlast4GetRequestInfoReply();
            
            /**
             * Sets the "Blast4-get-request-info-reply" element
             */
            void setBlast4GetRequestInfoReply(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply blast4GetRequestInfoReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-request-info-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply addNewBlast4GetRequestInfoReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetSequenceParts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getsequencepartse40belemtype");
            
            /**
             * Gets the "Blast4-get-seq-parts-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply getBlast4GetSeqPartsReply();
            
            /**
             * Sets the "Blast4-get-seq-parts-reply" element
             */
            void setBlast4GetSeqPartsReply(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply blast4GetSeqPartsReply);
            
            /**
             * Appends and returns a new empty "Blast4-get-seq-parts-reply" element
             */
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply addNewBlast4GetSeqPartsReply();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWindowmaskedTaxids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("getwindowmaskedtaxids11f8elemtype");
            
            /**
             * Gets the "Blast4-get-windowmasked-taxids-reply" element
             */
            java.math.BigInteger getBlast4GetWindowmaskedTaxidsReply();
            
            /**
             * Gets (as xml) the "Blast4-get-windowmasked-taxids-reply" element
             */
            org.apache.xmlbeans.XmlInteger xgetBlast4GetWindowmaskedTaxidsReply();
            
            /**
             * Sets the "Blast4-get-windowmasked-taxids-reply" element
             */
            void setBlast4GetWindowmaskedTaxidsReply(java.math.BigInteger blast4GetWindowmaskedTaxidsReply);
            
            /**
             * Sets (as xml) the "Blast4-get-windowmasked-taxids-reply" element
             */
            void xsetBlast4GetWindowmaskedTaxidsReply(org.apache.xmlbeans.XmlInteger blast4GetWindowmaskedTaxidsReply);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
