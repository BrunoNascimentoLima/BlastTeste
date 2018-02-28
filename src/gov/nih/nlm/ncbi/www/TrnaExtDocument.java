/*
 * An XML document type.
 * Localname: Trna-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TrnaExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Trna-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface TrnaExtDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrnaExtDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("trnaexta863doctype");
    
    /**
     * Gets the "Trna-ext" element
     */
    gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt getTrnaExt();
    
    /**
     * Sets the "Trna-ext" element
     */
    void setTrnaExt(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt trnaExt);
    
    /**
     * Appends and returns a new empty "Trna-ext" element
     */
    gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt addNewTrnaExt();
    
    /**
     * An XML Trna-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface TrnaExt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrnaExt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("trnaext5982elemtype");
        
        /**
         * Gets the "aa" element
         */
        gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa getAa();
        
        /**
         * True if has "aa" element
         */
        boolean isSetAa();
        
        /**
         * Sets the "aa" element
         */
        void setAa(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa aa);
        
        /**
         * Appends and returns a new empty "aa" element
         */
        gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa addNewAa();
        
        /**
         * Unsets the "aa" element
         */
        void unsetAa();
        
        /**
         * Gets array of all "codon" elements
         */
        java.math.BigInteger[] getCodonArray();
        
        /**
         * Gets ith "codon" element
         */
        java.math.BigInteger getCodonArray(int i);
        
        /**
         * Gets (as xml) array of all "codon" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetCodonArray();
        
        /**
         * Gets (as xml) ith "codon" element
         */
        org.apache.xmlbeans.XmlInteger xgetCodonArray(int i);
        
        /**
         * Returns number of "codon" element
         */
        int sizeOfCodonArray();
        
        /**
         * Sets array of all "codon" element
         */
        void setCodonArray(java.math.BigInteger[] codonArray);
        
        /**
         * Sets ith "codon" element
         */
        void setCodonArray(int i, java.math.BigInteger codon);
        
        /**
         * Sets (as xml) array of all "codon" element
         */
        void xsetCodonArray(org.apache.xmlbeans.XmlInteger[] codonArray);
        
        /**
         * Sets (as xml) ith "codon" element
         */
        void xsetCodonArray(int i, org.apache.xmlbeans.XmlInteger codon);
        
        /**
         * Inserts the value as the ith "codon" element
         */
        void insertCodon(int i, java.math.BigInteger codon);
        
        /**
         * Appends the value as the last "codon" element
         */
        void addCodon(java.math.BigInteger codon);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "codon" element
         */
        org.apache.xmlbeans.XmlInteger insertNewCodon(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "codon" element
         */
        org.apache.xmlbeans.XmlInteger addNewCodon();
        
        /**
         * Removes the ith "codon" element
         */
        void removeCodon(int i);
        
        /**
         * Gets the "anticodon" element
         */
        gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon getAnticodon();
        
        /**
         * True if has "anticodon" element
         */
        boolean isSetAnticodon();
        
        /**
         * Sets the "anticodon" element
         */
        void setAnticodon(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon anticodon);
        
        /**
         * Appends and returns a new empty "anticodon" element
         */
        gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon addNewAnticodon();
        
        /**
         * Unsets the "anticodon" element
         */
        void unsetAnticodon();
        
        /**
         * An XML aa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Aa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("aa013eelemtype");
            
            /**
             * Gets the "iupacaa" element
             */
            java.math.BigInteger getIupacaa();
            
            /**
             * Gets (as xml) the "iupacaa" element
             */
            org.apache.xmlbeans.XmlInteger xgetIupacaa();
            
            /**
             * True if has "iupacaa" element
             */
            boolean isSetIupacaa();
            
            /**
             * Sets the "iupacaa" element
             */
            void setIupacaa(java.math.BigInteger iupacaa);
            
            /**
             * Sets (as xml) the "iupacaa" element
             */
            void xsetIupacaa(org.apache.xmlbeans.XmlInteger iupacaa);
            
            /**
             * Unsets the "iupacaa" element
             */
            void unsetIupacaa();
            
            /**
             * Gets the "ncbieaa" element
             */
            java.math.BigInteger getNcbieaa();
            
            /**
             * Gets (as xml) the "ncbieaa" element
             */
            org.apache.xmlbeans.XmlInteger xgetNcbieaa();
            
            /**
             * True if has "ncbieaa" element
             */
            boolean isSetNcbieaa();
            
            /**
             * Sets the "ncbieaa" element
             */
            void setNcbieaa(java.math.BigInteger ncbieaa);
            
            /**
             * Sets (as xml) the "ncbieaa" element
             */
            void xsetNcbieaa(org.apache.xmlbeans.XmlInteger ncbieaa);
            
            /**
             * Unsets the "ncbieaa" element
             */
            void unsetNcbieaa();
            
            /**
             * Gets the "ncbi8aa" element
             */
            java.math.BigInteger getNcbi8Aa();
            
            /**
             * Gets (as xml) the "ncbi8aa" element
             */
            org.apache.xmlbeans.XmlInteger xgetNcbi8Aa();
            
            /**
             * True if has "ncbi8aa" element
             */
            boolean isSetNcbi8Aa();
            
            /**
             * Sets the "ncbi8aa" element
             */
            void setNcbi8Aa(java.math.BigInteger ncbi8Aa);
            
            /**
             * Sets (as xml) the "ncbi8aa" element
             */
            void xsetNcbi8Aa(org.apache.xmlbeans.XmlInteger ncbi8Aa);
            
            /**
             * Unsets the "ncbi8aa" element
             */
            void unsetNcbi8Aa();
            
            /**
             * Gets the "ncbistdaa" element
             */
            java.math.BigInteger getNcbistdaa();
            
            /**
             * Gets (as xml) the "ncbistdaa" element
             */
            org.apache.xmlbeans.XmlInteger xgetNcbistdaa();
            
            /**
             * True if has "ncbistdaa" element
             */
            boolean isSetNcbistdaa();
            
            /**
             * Sets the "ncbistdaa" element
             */
            void setNcbistdaa(java.math.BigInteger ncbistdaa);
            
            /**
             * Sets (as xml) the "ncbistdaa" element
             */
            void xsetNcbistdaa(org.apache.xmlbeans.XmlInteger ncbistdaa);
            
            /**
             * Unsets the "ncbistdaa" element
             */
            void unsetNcbistdaa();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa newInstance() {
                  return (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML anticodon(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Anticodon extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Anticodon.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("anticodon0ce3elemtype");
            
            /**
             * Gets the "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
            
            /**
             * Sets the "Seq-loc" element
             */
            void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon newInstance() {
                  return (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt newInstance() {
              return (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TrnaExtDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TrnaExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
