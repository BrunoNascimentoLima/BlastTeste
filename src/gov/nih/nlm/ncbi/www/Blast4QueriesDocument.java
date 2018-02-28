/*
 * An XML document type.
 * Localname: Blast4-queries
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4QueriesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-queries(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4QueriesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4QueriesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4queriesd273doctype");
    
    /**
     * Gets the "Blast4-queries" element
     */
    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries getBlast4Queries();
    
    /**
     * Sets the "Blast4-queries" element
     */
    void setBlast4Queries(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries blast4Queries);
    
    /**
     * Appends and returns a new empty "Blast4-queries" element
     */
    gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries addNewBlast4Queries();
    
    /**
     * An XML Blast4-queries(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4Queries extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4Queries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4queries7382elemtype");
        
        /**
         * Gets the "pssm" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm getPssm();
        
        /**
         * True if has "pssm" element
         */
        boolean isSetPssm();
        
        /**
         * Sets the "pssm" element
         */
        void setPssm(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm pssm);
        
        /**
         * Appends and returns a new empty "pssm" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm addNewPssm();
        
        /**
         * Unsets the "pssm" element
         */
        void unsetPssm();
        
        /**
         * Gets the "seq-loc-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList getSeqLocList();
        
        /**
         * True if has "seq-loc-list" element
         */
        boolean isSetSeqLocList();
        
        /**
         * Sets the "seq-loc-list" element
         */
        void setSeqLocList(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList seqLocList);
        
        /**
         * Appends and returns a new empty "seq-loc-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList addNewSeqLocList();
        
        /**
         * Unsets the "seq-loc-list" element
         */
        void unsetSeqLocList();
        
        /**
         * Gets the "bioseq-set" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet getBioseqSet();
        
        /**
         * True if has "bioseq-set" element
         */
        boolean isSetBioseqSet();
        
        /**
         * Sets the "bioseq-set" element
         */
        void setBioseqSet(gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet bioseqSet);
        
        /**
         * Appends and returns a new empty "bioseq-set" element
         */
        gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet addNewBioseqSet();
        
        /**
         * Unsets the "bioseq-set" element
         */
        void unsetBioseqSet();
        
        /**
         * An XML pssm(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pssm extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pssm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssm89fbelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.Pssm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-loc-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqLocList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLocList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqloclistfa17elemtype");
            
            /**
             * Gets array of all "Seq-loc" elements
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray();
            
            /**
             * Gets ith "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i);
            
            /**
             * Returns number of "Seq-loc" element
             */
            int sizeOfSeqLocArray();
            
            /**
             * Sets array of all "Seq-loc" element
             */
            void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray);
            
            /**
             * Sets ith "Seq-loc" element
             */
            void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * Removes the ith "Seq-loc" element
             */
            void removeSeqLoc(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.SeqLocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bioseq-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface BioseqSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioseqSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseqset500aelemtype");
            
            /**
             * Gets the "Bioseq-set" element
             */
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet getBioseqSet();
            
            /**
             * Sets the "Bioseq-set" element
             */
            void setBioseqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet bioseqSet);
            
            /**
             * Appends and returns a new empty "Bioseq-set" element
             */
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet addNewBioseqSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries.BioseqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument.Blast4Queries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4QueriesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4QueriesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
