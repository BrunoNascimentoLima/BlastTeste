/*
 * An XML document type.
 * Localname: Packed-seqpnt
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PackedSeqpntDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Packed-seqpnt(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PackedSeqpntDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackedSeqpntDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedseqpnt70b8doctype");
    
    /**
     * Gets the "Packed-seqpnt" element
     */
    gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt getPackedSeqpnt();
    
    /**
     * Sets the "Packed-seqpnt" element
     */
    void setPackedSeqpnt(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt packedSeqpnt);
    
    /**
     * Appends and returns a new empty "Packed-seqpnt" element
     */
    gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt addNewPackedSeqpnt();
    
    /**
     * An XML Packed-seqpnt(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PackedSeqpnt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackedSeqpnt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedseqpnt6770elemtype");
        
        /**
         * Gets the "strand" element
         */
        gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand getStrand();
        
        /**
         * True if has "strand" element
         */
        boolean isSetStrand();
        
        /**
         * Sets the "strand" element
         */
        void setStrand(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand strand);
        
        /**
         * Appends and returns a new empty "strand" element
         */
        gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand addNewStrand();
        
        /**
         * Unsets the "strand" element
         */
        void unsetStrand();
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id getId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id addNewId();
        
        /**
         * Gets the "fuzz" element
         */
        gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz getFuzz();
        
        /**
         * True if has "fuzz" element
         */
        boolean isSetFuzz();
        
        /**
         * Sets the "fuzz" element
         */
        void setFuzz(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz fuzz);
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz addNewFuzz();
        
        /**
         * Unsets the "fuzz" element
         */
        void unsetFuzz();
        
        /**
         * Gets array of all "points" elements
         */
        java.math.BigInteger[] getPointsArray();
        
        /**
         * Gets ith "points" element
         */
        java.math.BigInteger getPointsArray(int i);
        
        /**
         * Gets (as xml) array of all "points" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetPointsArray();
        
        /**
         * Gets (as xml) ith "points" element
         */
        org.apache.xmlbeans.XmlInteger xgetPointsArray(int i);
        
        /**
         * Returns number of "points" element
         */
        int sizeOfPointsArray();
        
        /**
         * Sets array of all "points" element
         */
        void setPointsArray(java.math.BigInteger[] pointsArray);
        
        /**
         * Sets ith "points" element
         */
        void setPointsArray(int i, java.math.BigInteger points);
        
        /**
         * Sets (as xml) array of all "points" element
         */
        void xsetPointsArray(org.apache.xmlbeans.XmlInteger[] pointsArray);
        
        /**
         * Sets (as xml) ith "points" element
         */
        void xsetPointsArray(int i, org.apache.xmlbeans.XmlInteger points);
        
        /**
         * Inserts the value as the ith "points" element
         */
        void insertPoints(int i, java.math.BigInteger points);
        
        /**
         * Appends the value as the last "points" element
         */
        void addPoints(java.math.BigInteger points);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "points" element
         */
        org.apache.xmlbeans.XmlInteger insertNewPoints(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "points" element
         */
        org.apache.xmlbeans.XmlInteger addNewPoints();
        
        /**
         * Removes the ith "points" element
         */
        void removePoints(int i);
        
        /**
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Strand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Strand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strand7112elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand newInstance() {
                  return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Strand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("idf2a7elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Fuzz extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fuzz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fuzzdddbelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz newInstance() {
                  return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt.Fuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt newInstance() {
              return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PackedSeqpntDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PackedSeqpntDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
