/*
 * An XML document type.
 * Localname: Blast4-get-seq-parts-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-get-seq-parts-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4GetSeqPartsRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetSeqPartsRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getseqpartsrequest758adoctype");
    
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
     * An XML Blast4-get-seq-parts-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4GetSeqPartsRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetSeqPartsRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getseqpartsrequeste4a2elemtype");
        
        /**
         * Gets the "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database getDatabase();
        
        /**
         * Sets the "database" element
         */
        void setDatabase(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database database);
        
        /**
         * Appends and returns a new empty "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database addNewDatabase();
        
        /**
         * Gets the "seq-locations" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations getSeqLocations();
        
        /**
         * Sets the "seq-locations" element
         */
        void setSeqLocations(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations seqLocations);
        
        /**
         * Appends and returns a new empty "seq-locations" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations addNewSeqLocations();
        
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Database extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Database.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("databaseaff9elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-locations(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqLocations extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLocations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqlocations237eelemtype");
            
            /**
             * Gets array of all "Seq-interval" elements
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] getSeqIntervalArray();
            
            /**
             * Gets ith "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqIntervalArray(int i);
            
            /**
             * Returns number of "Seq-interval" element
             */
            int sizeOfSeqIntervalArray();
            
            /**
             * Sets array of all "Seq-interval" element
             */
            void setSeqIntervalArray(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] seqIntervalArray);
            
            /**
             * Sets ith "Seq-interval" element
             */
            void setSeqIntervalArray(int i, gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval insertNewSeqInterval(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval();
            
            /**
             * Removes the ith "Seq-interval" element
             */
            void removeSeqInterval(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
