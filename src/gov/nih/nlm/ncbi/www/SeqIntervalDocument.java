/*
 * An XML document type.
 * Localname: Seq-interval
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-interval(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqIntervalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqIntervalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqinterval1651doctype");
    
    /**
     * Gets the "Seq-interval" element
     */
    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqInterval();
    
    /**
     * Sets the "Seq-interval" element
     */
    void setSeqInterval(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval);
    
    /**
     * Appends and returns a new empty "Seq-interval" element
     */
    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval();
    
    /**
     * An XML Seq-interval(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqInterval extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqInterval.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqintervalafc2elemtype");
        
        /**
         * Gets the "from" element
         */
        java.math.BigInteger getFrom();
        
        /**
         * Gets (as xml) the "from" element
         */
        org.apache.xmlbeans.XmlInteger xgetFrom();
        
        /**
         * Sets the "from" element
         */
        void setFrom(java.math.BigInteger from);
        
        /**
         * Sets (as xml) the "from" element
         */
        void xsetFrom(org.apache.xmlbeans.XmlInteger from);
        
        /**
         * Gets the "to" element
         */
        java.math.BigInteger getTo();
        
        /**
         * Gets (as xml) the "to" element
         */
        org.apache.xmlbeans.XmlInteger xgetTo();
        
        /**
         * Sets the "to" element
         */
        void setTo(java.math.BigInteger to);
        
        /**
         * Sets (as xml) the "to" element
         */
        void xsetTo(org.apache.xmlbeans.XmlInteger to);
        
        /**
         * Gets the "strand" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand getStrand();
        
        /**
         * True if has "strand" element
         */
        boolean isSetStrand();
        
        /**
         * Sets the "strand" element
         */
        void setStrand(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand strand);
        
        /**
         * Appends and returns a new empty "strand" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand addNewStrand();
        
        /**
         * Unsets the "strand" element
         */
        void unsetStrand();
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id getId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id addNewId();
        
        /**
         * Gets the "fuzz-from" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom getFuzzFrom();
        
        /**
         * True if has "fuzz-from" element
         */
        boolean isSetFuzzFrom();
        
        /**
         * Sets the "fuzz-from" element
         */
        void setFuzzFrom(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom fuzzFrom);
        
        /**
         * Appends and returns a new empty "fuzz-from" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom addNewFuzzFrom();
        
        /**
         * Unsets the "fuzz-from" element
         */
        void unsetFuzzFrom();
        
        /**
         * Gets the "fuzz-to" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo getFuzzTo();
        
        /**
         * True if has "fuzz-to" element
         */
        boolean isSetFuzzTo();
        
        /**
         * Sets the "fuzz-to" element
         */
        void setFuzzTo(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo fuzzTo);
        
        /**
         * Appends and returns a new empty "fuzz-to" element
         */
        gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo addNewFuzzTo();
        
        /**
         * Unsets the "fuzz-to" element
         */
        void unsetFuzzTo();
        
        /**
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Strand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Strand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strandb9e4elemtype");
            
            /**
             * Gets the "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand();
            
            /**
             * Sets the "Na-strand" element
             */
            void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand);
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Strand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id9cb9elemtype");
            
            /**
             * Gets the "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
            
            /**
             * Sets the "Seq-id" element
             */
            void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML fuzz-from(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FuzzFrom extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FuzzFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fuzzfromcf96elemtype");
            
            /**
             * Gets the "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz();
            
            /**
             * Sets the "Int-fuzz" element
             */
            void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz);
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML fuzz-to(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FuzzTo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FuzzTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fuzztoa0a7elemtype");
            
            /**
             * Gets the "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz();
            
            /**
             * Sets the "Int-fuzz" element
             */
            void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz);
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval.FuzzTo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqIntervalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqIntervalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
