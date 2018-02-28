/*
 * An XML document type.
 * Localname: ArticleId
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ArticleIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one ArticleId(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface ArticleIdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArticleIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("articleid06fddoctype");
    
    /**
     * Gets the "ArticleId" element
     */
    gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId getArticleId();
    
    /**
     * Sets the "ArticleId" element
     */
    void setArticleId(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId articleId);
    
    /**
     * Appends and returns a new empty "ArticleId" element
     */
    gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId addNewArticleId();
    
    /**
     * An XML ArticleId(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface ArticleId extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArticleId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("articleid38faelemtype");
        
        /**
         * Gets the "pubmed" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed getPubmed();
        
        /**
         * True if has "pubmed" element
         */
        boolean isSetPubmed();
        
        /**
         * Sets the "pubmed" element
         */
        void setPubmed(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed pubmed);
        
        /**
         * Appends and returns a new empty "pubmed" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed addNewPubmed();
        
        /**
         * Unsets the "pubmed" element
         */
        void unsetPubmed();
        
        /**
         * Gets the "medline" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline getMedline();
        
        /**
         * True if has "medline" element
         */
        boolean isSetMedline();
        
        /**
         * Sets the "medline" element
         */
        void setMedline(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline medline);
        
        /**
         * Appends and returns a new empty "medline" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline addNewMedline();
        
        /**
         * Unsets the "medline" element
         */
        void unsetMedline();
        
        /**
         * Gets the "doi" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi getDoi();
        
        /**
         * True if has "doi" element
         */
        boolean isSetDoi();
        
        /**
         * Sets the "doi" element
         */
        void setDoi(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi doi);
        
        /**
         * Appends and returns a new empty "doi" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi addNewDoi();
        
        /**
         * Unsets the "doi" element
         */
        void unsetDoi();
        
        /**
         * Gets the "pii" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii getPii();
        
        /**
         * True if has "pii" element
         */
        boolean isSetPii();
        
        /**
         * Sets the "pii" element
         */
        void setPii(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii pii);
        
        /**
         * Appends and returns a new empty "pii" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii addNewPii();
        
        /**
         * Unsets the "pii" element
         */
        void unsetPii();
        
        /**
         * Gets the "pmcid" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid getPmcid();
        
        /**
         * True if has "pmcid" element
         */
        boolean isSetPmcid();
        
        /**
         * Sets the "pmcid" element
         */
        void setPmcid(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid pmcid);
        
        /**
         * Appends and returns a new empty "pmcid" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid addNewPmcid();
        
        /**
         * Unsets the "pmcid" element
         */
        void unsetPmcid();
        
        /**
         * Gets the "pmcpid" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid getPmcpid();
        
        /**
         * True if has "pmcpid" element
         */
        boolean isSetPmcpid();
        
        /**
         * Sets the "pmcpid" element
         */
        void setPmcpid(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid pmcpid);
        
        /**
         * Appends and returns a new empty "pmcpid" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid addNewPmcpid();
        
        /**
         * Unsets the "pmcpid" element
         */
        void unsetPmcpid();
        
        /**
         * Gets the "pmpid" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid getPmpid();
        
        /**
         * True if has "pmpid" element
         */
        boolean isSetPmpid();
        
        /**
         * Sets the "pmpid" element
         */
        void setPmpid(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid pmpid);
        
        /**
         * Appends and returns a new empty "pmpid" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid addNewPmpid();
        
        /**
         * Unsets the "pmpid" element
         */
        void unsetPmpid();
        
        /**
         * Gets the "other" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other getOther();
        
        /**
         * True if has "other" element
         */
        boolean isSetOther();
        
        /**
         * Sets the "other" element
         */
        void setOther(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other other);
        
        /**
         * Appends and returns a new empty "other" element
         */
        gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other addNewOther();
        
        /**
         * Unsets the "other" element
         */
        void unsetOther();
        
        /**
         * An XML pubmed(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pubmed extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pubmed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubmed25c5elemtype");
            
            /**
             * Gets the "PubMedId" element
             */
            java.math.BigInteger getPubMedId();
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger xgetPubMedId();
            
            /**
             * Sets the "PubMedId" element
             */
            void setPubMedId(java.math.BigInteger pubMedId);
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML medline(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Medline extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Medline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medlinee726elemtype");
            
            /**
             * Gets the "MedlineUID" element
             */
            java.math.BigInteger getMedlineUID();
            
            /**
             * Gets (as xml) the "MedlineUID" element
             */
            org.apache.xmlbeans.XmlInteger xgetMedlineUID();
            
            /**
             * Sets the "MedlineUID" element
             */
            void setMedlineUID(java.math.BigInteger medlineUID);
            
            /**
             * Sets (as xml) the "MedlineUID" element
             */
            void xsetMedlineUID(org.apache.xmlbeans.XmlInteger medlineUID);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML doi(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Doi extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Doi.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("doi2da4elemtype");
            
            /**
             * Gets the "DOI" element
             */
            java.lang.String getDOI();
            
            /**
             * Gets (as xml) the "DOI" element
             */
            org.apache.xmlbeans.XmlString xgetDOI();
            
            /**
             * Sets the "DOI" element
             */
            void setDOI(java.lang.String doi);
            
            /**
             * Sets (as xml) the "DOI" element
             */
            void xsetDOI(org.apache.xmlbeans.XmlString doi);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pii(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pii extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pii.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pii34f6elemtype");
            
            /**
             * Gets the "PII" element
             */
            java.lang.String getPII();
            
            /**
             * Gets (as xml) the "PII" element
             */
            org.apache.xmlbeans.XmlString xgetPII();
            
            /**
             * Sets the "PII" element
             */
            void setPII(java.lang.String pii);
            
            /**
             * Sets (as xml) the "PII" element
             */
            void xsetPII(org.apache.xmlbeans.XmlString pii);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmcid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmcid extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmcid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmcid2887elemtype");
            
            /**
             * Gets the "PmcID" element
             */
            java.math.BigInteger getPmcID();
            
            /**
             * Gets (as xml) the "PmcID" element
             */
            org.apache.xmlbeans.XmlInteger xgetPmcID();
            
            /**
             * Sets the "PmcID" element
             */
            void setPmcID(java.math.BigInteger pmcID);
            
            /**
             * Sets (as xml) the "PmcID" element
             */
            void xsetPmcID(org.apache.xmlbeans.XmlInteger pmcID);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmcpid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmcpid extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmcpid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmcpid2adbelemtype");
            
            /**
             * Gets the "PmcPid" element
             */
            java.lang.String getPmcPid();
            
            /**
             * Gets (as xml) the "PmcPid" element
             */
            org.apache.xmlbeans.XmlString xgetPmcPid();
            
            /**
             * Sets the "PmcPid" element
             */
            void setPmcPid(java.lang.String pmcPid);
            
            /**
             * Sets (as xml) the "PmcPid" element
             */
            void xsetPmcPid(org.apache.xmlbeans.XmlString pmcPid);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmpid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmpid extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmpid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmpid7cd4elemtype");
            
            /**
             * Gets the "PmPid" element
             */
            java.lang.String getPmPid();
            
            /**
             * Gets (as xml) the "PmPid" element
             */
            org.apache.xmlbeans.XmlString xgetPmPid();
            
            /**
             * Sets the "PmPid" element
             */
            void setPmPid(java.lang.String pmPid);
            
            /**
             * Sets (as xml) the "PmPid" element
             */
            void xsetPmPid(org.apache.xmlbeans.XmlString pmPid);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Other extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Other.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("otherc876elemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other newInstance() {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId newInstance() {
              return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ArticleIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ArticleIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
