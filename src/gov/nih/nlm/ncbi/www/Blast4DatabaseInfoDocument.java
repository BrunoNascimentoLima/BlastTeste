/*
 * An XML document type.
 * Localname: Blast4-database-info
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-database-info(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4DatabaseInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4DatabaseInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4databaseinfo63cddoctype");
    
    /**
     * Gets the "Blast4-database-info" element
     */
    gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo getBlast4DatabaseInfo();
    
    /**
     * Sets the "Blast4-database-info" element
     */
    void setBlast4DatabaseInfo(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo blast4DatabaseInfo);
    
    /**
     * Appends and returns a new empty "Blast4-database-info" element
     */
    gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo addNewBlast4DatabaseInfo();
    
    /**
     * An XML Blast4-database-info(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4DatabaseInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4DatabaseInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4databaseinfob242elemtype");
        
        /**
         * Gets the "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database getDatabase();
        
        /**
         * Sets the "database" element
         */
        void setDatabase(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database database);
        
        /**
         * Appends and returns a new empty "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database addNewDatabase();
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "last-updated" element
         */
        java.lang.String getLastUpdated();
        
        /**
         * Gets (as xml) the "last-updated" element
         */
        org.apache.xmlbeans.XmlString xgetLastUpdated();
        
        /**
         * Sets the "last-updated" element
         */
        void setLastUpdated(java.lang.String lastUpdated);
        
        /**
         * Sets (as xml) the "last-updated" element
         */
        void xsetLastUpdated(org.apache.xmlbeans.XmlString lastUpdated);
        
        /**
         * Gets the "total-length" element
         */
        long getTotalLength();
        
        /**
         * Gets (as xml) the "total-length" element
         */
        org.apache.xmlbeans.XmlLong xgetTotalLength();
        
        /**
         * Sets the "total-length" element
         */
        void setTotalLength(long totalLength);
        
        /**
         * Sets (as xml) the "total-length" element
         */
        void xsetTotalLength(org.apache.xmlbeans.XmlLong totalLength);
        
        /**
         * Gets the "num-sequences" element
         */
        long getNumSequences();
        
        /**
         * Gets (as xml) the "num-sequences" element
         */
        org.apache.xmlbeans.XmlLong xgetNumSequences();
        
        /**
         * Sets the "num-sequences" element
         */
        void setNumSequences(long numSequences);
        
        /**
         * Sets (as xml) the "num-sequences" element
         */
        void xsetNumSequences(org.apache.xmlbeans.XmlLong numSequences);
        
        /**
         * Gets the "seqtech" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech getSeqtech();
        
        /**
         * Sets the "seqtech" element
         */
        void setSeqtech(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech seqtech);
        
        /**
         * Appends and returns a new empty "seqtech" element
         */
        gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech addNewSeqtech();
        
        /**
         * Gets the "taxid" element
         */
        java.math.BigInteger getTaxid();
        
        /**
         * Gets (as xml) the "taxid" element
         */
        org.apache.xmlbeans.XmlInteger xgetTaxid();
        
        /**
         * Sets the "taxid" element
         */
        void setTaxid(java.math.BigInteger taxid);
        
        /**
         * Sets (as xml) the "taxid" element
         */
        void xsetTaxid(org.apache.xmlbeans.XmlInteger taxid);
        
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Database extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Database.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("database0b99elemtype");
            
            /**
             * Gets the "Blast4-database" element
             */
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database getBlast4Database();
            
            /**
             * Sets the "Blast4-database" element
             */
            void setBlast4Database(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database blast4Database);
            
            /**
             * Appends and returns a new empty "Blast4-database" element
             */
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database addNewBlast4Database();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seqtech(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seqtech extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seqtech.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtechd8e3elemtype");
            
            /**
             * Gets the "Blast4-seqtech" element
             */
            gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech getBlast4Seqtech();
            
            /**
             * Sets the "Blast4-seqtech" element
             */
            void setBlast4Seqtech(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech blast4Seqtech);
            
            /**
             * Appends and returns a new empty "Blast4-seqtech" element
             */
            gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech addNewBlast4Seqtech();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
