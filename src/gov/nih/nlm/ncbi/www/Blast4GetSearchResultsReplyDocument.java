/*
 * An XML document type.
 * Localname: Blast4-get-search-results-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-get-search-results-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4GetSearchResultsReplyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetSearchResultsReplyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getsearchresultsreply6202doctype");
    
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
     * An XML Blast4-get-search-results-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4GetSearchResultsReply extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetSearchResultsReply.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getsearchresultsreplyfb44elemtype");
        
        /**
         * Gets the "alignments" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments getAlignments();
        
        /**
         * True if has "alignments" element
         */
        boolean isSetAlignments();
        
        /**
         * Sets the "alignments" element
         */
        void setAlignments(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments alignments);
        
        /**
         * Appends and returns a new empty "alignments" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments addNewAlignments();
        
        /**
         * Unsets the "alignments" element
         */
        void unsetAlignments();
        
        /**
         * Gets the "phi-alignments" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments getPhiAlignments();
        
        /**
         * True if has "phi-alignments" element
         */
        boolean isSetPhiAlignments();
        
        /**
         * Sets the "phi-alignments" element
         */
        void setPhiAlignments(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments phiAlignments);
        
        /**
         * Appends and returns a new empty "phi-alignments" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments addNewPhiAlignments();
        
        /**
         * Unsets the "phi-alignments" element
         */
        void unsetPhiAlignments();
        
        /**
         * Gets the "masks" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks getMasks();
        
        /**
         * True if has "masks" element
         */
        boolean isSetMasks();
        
        /**
         * Sets the "masks" element
         */
        void setMasks(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks masks);
        
        /**
         * Appends and returns a new empty "masks" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks addNewMasks();
        
        /**
         * Unsets the "masks" element
         */
        void unsetMasks();
        
        /**
         * Gets the "ka-blocks" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks getKaBlocks();
        
        /**
         * True if has "ka-blocks" element
         */
        boolean isSetKaBlocks();
        
        /**
         * Sets the "ka-blocks" element
         */
        void setKaBlocks(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks kaBlocks);
        
        /**
         * Appends and returns a new empty "ka-blocks" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks addNewKaBlocks();
        
        /**
         * Unsets the "ka-blocks" element
         */
        void unsetKaBlocks();
        
        /**
         * Gets array of all "search-stats" elements
         */
        java.lang.String[] getSearchStatsArray();
        
        /**
         * Gets ith "search-stats" element
         */
        java.lang.String getSearchStatsArray(int i);
        
        /**
         * Gets (as xml) array of all "search-stats" elements
         */
        org.apache.xmlbeans.XmlString[] xgetSearchStatsArray();
        
        /**
         * Gets (as xml) ith "search-stats" element
         */
        org.apache.xmlbeans.XmlString xgetSearchStatsArray(int i);
        
        /**
         * Returns number of "search-stats" element
         */
        int sizeOfSearchStatsArray();
        
        /**
         * Sets array of all "search-stats" element
         */
        void setSearchStatsArray(java.lang.String[] searchStatsArray);
        
        /**
         * Sets ith "search-stats" element
         */
        void setSearchStatsArray(int i, java.lang.String searchStats);
        
        /**
         * Sets (as xml) array of all "search-stats" element
         */
        void xsetSearchStatsArray(org.apache.xmlbeans.XmlString[] searchStatsArray);
        
        /**
         * Sets (as xml) ith "search-stats" element
         */
        void xsetSearchStatsArray(int i, org.apache.xmlbeans.XmlString searchStats);
        
        /**
         * Inserts the value as the ith "search-stats" element
         */
        void insertSearchStats(int i, java.lang.String searchStats);
        
        /**
         * Appends the value as the last "search-stats" element
         */
        void addSearchStats(java.lang.String searchStats);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "search-stats" element
         */
        org.apache.xmlbeans.XmlString insertNewSearchStats(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "search-stats" element
         */
        org.apache.xmlbeans.XmlString addNewSearchStats();
        
        /**
         * Removes the ith "search-stats" element
         */
        void removeSearchStats(int i);
        
        /**
         * Gets the "pssm" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm getPssm();
        
        /**
         * True if has "pssm" element
         */
        boolean isSetPssm();
        
        /**
         * Sets the "pssm" element
         */
        void setPssm(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm pssm);
        
        /**
         * Appends and returns a new empty "pssm" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm addNewPssm();
        
        /**
         * Unsets the "pssm" element
         */
        void unsetPssm();
        
        /**
         * Gets the "simple-results" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults getSimpleResults();
        
        /**
         * True if has "simple-results" element
         */
        boolean isSetSimpleResults();
        
        /**
         * Sets the "simple-results" element
         */
        void setSimpleResults(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults simpleResults);
        
        /**
         * Appends and returns a new empty "simple-results" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults addNewSimpleResults();
        
        /**
         * Unsets the "simple-results" element
         */
        void unsetSimpleResults();
        
        /**
         * An XML alignments(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Alignments extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Alignments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("alignments30d0elemtype");
            
            /**
             * Gets the "Seq-align-set" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet getSeqAlignSet();
            
            /**
             * Sets the "Seq-align-set" element
             */
            void setSeqAlignSet(gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet seqAlignSet);
            
            /**
             * Appends and returns a new empty "Seq-align-set" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet addNewSeqAlignSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Alignments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML phi-alignments(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PhiAlignments extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhiAlignments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("phialignmentseeacelemtype");
            
            /**
             * Gets the "Blast4-phi-alignments" element
             */
            gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments getBlast4PhiAlignments();
            
            /**
             * Sets the "Blast4-phi-alignments" element
             */
            void setBlast4PhiAlignments(gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments blast4PhiAlignments);
            
            /**
             * Appends and returns a new empty "Blast4-phi-alignments" element
             */
            gov.nih.nlm.ncbi.www.Blast4PhiAlignmentsDocument.Blast4PhiAlignments addNewBlast4PhiAlignments();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.PhiAlignments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML masks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Masks extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Masks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("masksc4b7elemtype");
            
            /**
             * Gets array of all "Blast4-mask" elements
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] getBlast4MaskArray();
            
            /**
             * Gets ith "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4MaskArray(int i);
            
            /**
             * Returns number of "Blast4-mask" element
             */
            int sizeOfBlast4MaskArray();
            
            /**
             * Sets array of all "Blast4-mask" element
             */
            void setBlast4MaskArray(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] blast4MaskArray);
            
            /**
             * Sets ith "Blast4-mask" element
             */
            void setBlast4MaskArray(int i, gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask insertNewBlast4Mask(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask();
            
            /**
             * Removes the ith "Blast4-mask" element
             */
            void removeBlast4Mask(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Masks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ka-blocks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface KaBlocks extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KaBlocks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("kablocks8f8delemtype");
            
            /**
             * Gets array of all "Blast4-ka-block" elements
             */
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock[] getBlast4KaBlockArray();
            
            /**
             * Gets ith "Blast4-ka-block" element
             */
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock getBlast4KaBlockArray(int i);
            
            /**
             * Returns number of "Blast4-ka-block" element
             */
            int sizeOfBlast4KaBlockArray();
            
            /**
             * Sets array of all "Blast4-ka-block" element
             */
            void setBlast4KaBlockArray(gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock[] blast4KaBlockArray);
            
            /**
             * Sets ith "Blast4-ka-block" element
             */
            void setBlast4KaBlockArray(int i, gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock blast4KaBlock);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-ka-block" element
             */
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock insertNewBlast4KaBlock(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-ka-block" element
             */
            gov.nih.nlm.ncbi.www.Blast4KaBlockDocument.Blast4KaBlock addNewBlast4KaBlock();
            
            /**
             * Removes the ith "Blast4-ka-block" element
             */
            void removeBlast4KaBlock(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.KaBlocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pssm(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pssm extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pssm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssm337delemtype");
            
            /**
             * Gets the "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters getPssmWithParameters();
            
            /**
             * Sets the "PssmWithParameters" element
             */
            void setPssmWithParameters(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters pssmWithParameters);
            
            /**
             * Appends and returns a new empty "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters addNewPssmWithParameters();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.Pssm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML simple-results(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SimpleResults extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("simpleresultsc4bbelemtype");
            
            /**
             * Gets the "Blast4-simple-results" element
             */
            gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults getBlast4SimpleResults();
            
            /**
             * Sets the "Blast4-simple-results" element
             */
            void setBlast4SimpleResults(gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults blast4SimpleResults);
            
            /**
             * Appends and returns a new empty "Blast4-simple-results" element
             */
            gov.nih.nlm.ncbi.www.Blast4SimpleResultsDocument.Blast4SimpleResults addNewBlast4SimpleResults();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply.SimpleResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
