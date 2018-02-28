/*
 * An XML document type.
 * Localname: Genetic-code
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GeneticCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Genetic-code(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface GeneticCodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneticCodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("geneticcode4cbfdoctype");
    
    /**
     * Gets the "Genetic-code" element
     */
    gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode getGeneticCode();
    
    /**
     * Sets the "Genetic-code" element
     */
    void setGeneticCode(gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode geneticCode);
    
    /**
     * Appends and returns a new empty "Genetic-code" element
     */
    gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode addNewGeneticCode();
    
    /**
     * An XML Genetic-code(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface GeneticCode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneticCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("geneticcode4602elemtype");
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * Gets array of all "id" elements
         */
        java.math.BigInteger[] getIdArray();
        
        /**
         * Gets ith "id" element
         */
        java.math.BigInteger getIdArray(int i);
        
        /**
         * Gets (as xml) array of all "id" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetIdArray();
        
        /**
         * Gets (as xml) ith "id" element
         */
        org.apache.xmlbeans.XmlInteger xgetIdArray(int i);
        
        /**
         * Returns number of "id" element
         */
        int sizeOfIdArray();
        
        /**
         * Sets array of all "id" element
         */
        void setIdArray(java.math.BigInteger[] idArray);
        
        /**
         * Sets ith "id" element
         */
        void setIdArray(int i, java.math.BigInteger id);
        
        /**
         * Sets (as xml) array of all "id" element
         */
        void xsetIdArray(org.apache.xmlbeans.XmlInteger[] idArray);
        
        /**
         * Sets (as xml) ith "id" element
         */
        void xsetIdArray(int i, org.apache.xmlbeans.XmlInteger id);
        
        /**
         * Inserts the value as the ith "id" element
         */
        void insertId(int i, java.math.BigInteger id);
        
        /**
         * Appends the value as the last "id" element
         */
        void addId(java.math.BigInteger id);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "id" element
         */
        org.apache.xmlbeans.XmlInteger insertNewId(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "id" element
         */
        org.apache.xmlbeans.XmlInteger addNewId();
        
        /**
         * Removes the ith "id" element
         */
        void removeId(int i);
        
        /**
         * Gets array of all "ncbieaa" elements
         */
        java.lang.String[] getNcbieaaArray();
        
        /**
         * Gets ith "ncbieaa" element
         */
        java.lang.String getNcbieaaArray(int i);
        
        /**
         * Gets (as xml) array of all "ncbieaa" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNcbieaaArray();
        
        /**
         * Gets (as xml) ith "ncbieaa" element
         */
        org.apache.xmlbeans.XmlString xgetNcbieaaArray(int i);
        
        /**
         * Returns number of "ncbieaa" element
         */
        int sizeOfNcbieaaArray();
        
        /**
         * Sets array of all "ncbieaa" element
         */
        void setNcbieaaArray(java.lang.String[] ncbieaaArray);
        
        /**
         * Sets ith "ncbieaa" element
         */
        void setNcbieaaArray(int i, java.lang.String ncbieaa);
        
        /**
         * Sets (as xml) array of all "ncbieaa" element
         */
        void xsetNcbieaaArray(org.apache.xmlbeans.XmlString[] ncbieaaArray);
        
        /**
         * Sets (as xml) ith "ncbieaa" element
         */
        void xsetNcbieaaArray(int i, org.apache.xmlbeans.XmlString ncbieaa);
        
        /**
         * Inserts the value as the ith "ncbieaa" element
         */
        void insertNcbieaa(int i, java.lang.String ncbieaa);
        
        /**
         * Appends the value as the last "ncbieaa" element
         */
        void addNcbieaa(java.lang.String ncbieaa);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ncbieaa" element
         */
        org.apache.xmlbeans.XmlString insertNewNcbieaa(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ncbieaa" element
         */
        org.apache.xmlbeans.XmlString addNewNcbieaa();
        
        /**
         * Removes the ith "ncbieaa" element
         */
        void removeNcbieaa(int i);
        
        /**
         * Gets array of all "ncbi8aa" elements
         */
        byte[][] getNcbi8AaArray();
        
        /**
         * Gets ith "ncbi8aa" element
         */
        byte[] getNcbi8AaArray(int i);
        
        /**
         * Gets (as xml) array of all "ncbi8aa" elements
         */
        org.apache.xmlbeans.XmlHexBinary[] xgetNcbi8AaArray();
        
        /**
         * Gets (as xml) ith "ncbi8aa" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetNcbi8AaArray(int i);
        
        /**
         * Returns number of "ncbi8aa" element
         */
        int sizeOfNcbi8AaArray();
        
        /**
         * Sets array of all "ncbi8aa" element
         */
        void setNcbi8AaArray(byte[][] ncbi8AaArray);
        
        /**
         * Sets ith "ncbi8aa" element
         */
        void setNcbi8AaArray(int i, byte[] ncbi8Aa);
        
        /**
         * Sets (as xml) array of all "ncbi8aa" element
         */
        void xsetNcbi8AaArray(org.apache.xmlbeans.XmlHexBinary[] ncbi8AaArray);
        
        /**
         * Sets (as xml) ith "ncbi8aa" element
         */
        void xsetNcbi8AaArray(int i, org.apache.xmlbeans.XmlHexBinary ncbi8Aa);
        
        /**
         * Inserts the value as the ith "ncbi8aa" element
         */
        void insertNcbi8Aa(int i, byte[] ncbi8Aa);
        
        /**
         * Appends the value as the last "ncbi8aa" element
         */
        void addNcbi8Aa(byte[] ncbi8Aa);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ncbi8aa" element
         */
        org.apache.xmlbeans.XmlHexBinary insertNewNcbi8Aa(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ncbi8aa" element
         */
        org.apache.xmlbeans.XmlHexBinary addNewNcbi8Aa();
        
        /**
         * Removes the ith "ncbi8aa" element
         */
        void removeNcbi8Aa(int i);
        
        /**
         * Gets array of all "ncbistdaa" elements
         */
        byte[][] getNcbistdaaArray();
        
        /**
         * Gets ith "ncbistdaa" element
         */
        byte[] getNcbistdaaArray(int i);
        
        /**
         * Gets (as xml) array of all "ncbistdaa" elements
         */
        org.apache.xmlbeans.XmlHexBinary[] xgetNcbistdaaArray();
        
        /**
         * Gets (as xml) ith "ncbistdaa" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetNcbistdaaArray(int i);
        
        /**
         * Returns number of "ncbistdaa" element
         */
        int sizeOfNcbistdaaArray();
        
        /**
         * Sets array of all "ncbistdaa" element
         */
        void setNcbistdaaArray(byte[][] ncbistdaaArray);
        
        /**
         * Sets ith "ncbistdaa" element
         */
        void setNcbistdaaArray(int i, byte[] ncbistdaa);
        
        /**
         * Sets (as xml) array of all "ncbistdaa" element
         */
        void xsetNcbistdaaArray(org.apache.xmlbeans.XmlHexBinary[] ncbistdaaArray);
        
        /**
         * Sets (as xml) ith "ncbistdaa" element
         */
        void xsetNcbistdaaArray(int i, org.apache.xmlbeans.XmlHexBinary ncbistdaa);
        
        /**
         * Inserts the value as the ith "ncbistdaa" element
         */
        void insertNcbistdaa(int i, byte[] ncbistdaa);
        
        /**
         * Appends the value as the last "ncbistdaa" element
         */
        void addNcbistdaa(byte[] ncbistdaa);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ncbistdaa" element
         */
        org.apache.xmlbeans.XmlHexBinary insertNewNcbistdaa(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ncbistdaa" element
         */
        org.apache.xmlbeans.XmlHexBinary addNewNcbistdaa();
        
        /**
         * Removes the ith "ncbistdaa" element
         */
        void removeNcbistdaa(int i);
        
        /**
         * Gets array of all "sncbieaa" elements
         */
        java.lang.String[] getSncbieaaArray();
        
        /**
         * Gets ith "sncbieaa" element
         */
        java.lang.String getSncbieaaArray(int i);
        
        /**
         * Gets (as xml) array of all "sncbieaa" elements
         */
        org.apache.xmlbeans.XmlString[] xgetSncbieaaArray();
        
        /**
         * Gets (as xml) ith "sncbieaa" element
         */
        org.apache.xmlbeans.XmlString xgetSncbieaaArray(int i);
        
        /**
         * Returns number of "sncbieaa" element
         */
        int sizeOfSncbieaaArray();
        
        /**
         * Sets array of all "sncbieaa" element
         */
        void setSncbieaaArray(java.lang.String[] sncbieaaArray);
        
        /**
         * Sets ith "sncbieaa" element
         */
        void setSncbieaaArray(int i, java.lang.String sncbieaa);
        
        /**
         * Sets (as xml) array of all "sncbieaa" element
         */
        void xsetSncbieaaArray(org.apache.xmlbeans.XmlString[] sncbieaaArray);
        
        /**
         * Sets (as xml) ith "sncbieaa" element
         */
        void xsetSncbieaaArray(int i, org.apache.xmlbeans.XmlString sncbieaa);
        
        /**
         * Inserts the value as the ith "sncbieaa" element
         */
        void insertSncbieaa(int i, java.lang.String sncbieaa);
        
        /**
         * Appends the value as the last "sncbieaa" element
         */
        void addSncbieaa(java.lang.String sncbieaa);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sncbieaa" element
         */
        org.apache.xmlbeans.XmlString insertNewSncbieaa(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sncbieaa" element
         */
        org.apache.xmlbeans.XmlString addNewSncbieaa();
        
        /**
         * Removes the ith "sncbieaa" element
         */
        void removeSncbieaa(int i);
        
        /**
         * Gets array of all "sncbi8aa" elements
         */
        byte[][] getSncbi8AaArray();
        
        /**
         * Gets ith "sncbi8aa" element
         */
        byte[] getSncbi8AaArray(int i);
        
        /**
         * Gets (as xml) array of all "sncbi8aa" elements
         */
        org.apache.xmlbeans.XmlHexBinary[] xgetSncbi8AaArray();
        
        /**
         * Gets (as xml) ith "sncbi8aa" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetSncbi8AaArray(int i);
        
        /**
         * Returns number of "sncbi8aa" element
         */
        int sizeOfSncbi8AaArray();
        
        /**
         * Sets array of all "sncbi8aa" element
         */
        void setSncbi8AaArray(byte[][] sncbi8AaArray);
        
        /**
         * Sets ith "sncbi8aa" element
         */
        void setSncbi8AaArray(int i, byte[] sncbi8Aa);
        
        /**
         * Sets (as xml) array of all "sncbi8aa" element
         */
        void xsetSncbi8AaArray(org.apache.xmlbeans.XmlHexBinary[] sncbi8AaArray);
        
        /**
         * Sets (as xml) ith "sncbi8aa" element
         */
        void xsetSncbi8AaArray(int i, org.apache.xmlbeans.XmlHexBinary sncbi8Aa);
        
        /**
         * Inserts the value as the ith "sncbi8aa" element
         */
        void insertSncbi8Aa(int i, byte[] sncbi8Aa);
        
        /**
         * Appends the value as the last "sncbi8aa" element
         */
        void addSncbi8Aa(byte[] sncbi8Aa);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sncbi8aa" element
         */
        org.apache.xmlbeans.XmlHexBinary insertNewSncbi8Aa(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sncbi8aa" element
         */
        org.apache.xmlbeans.XmlHexBinary addNewSncbi8Aa();
        
        /**
         * Removes the ith "sncbi8aa" element
         */
        void removeSncbi8Aa(int i);
        
        /**
         * Gets array of all "sncbistdaa" elements
         */
        byte[][] getSncbistdaaArray();
        
        /**
         * Gets ith "sncbistdaa" element
         */
        byte[] getSncbistdaaArray(int i);
        
        /**
         * Gets (as xml) array of all "sncbistdaa" elements
         */
        org.apache.xmlbeans.XmlHexBinary[] xgetSncbistdaaArray();
        
        /**
         * Gets (as xml) ith "sncbistdaa" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetSncbistdaaArray(int i);
        
        /**
         * Returns number of "sncbistdaa" element
         */
        int sizeOfSncbistdaaArray();
        
        /**
         * Sets array of all "sncbistdaa" element
         */
        void setSncbistdaaArray(byte[][] sncbistdaaArray);
        
        /**
         * Sets ith "sncbistdaa" element
         */
        void setSncbistdaaArray(int i, byte[] sncbistdaa);
        
        /**
         * Sets (as xml) array of all "sncbistdaa" element
         */
        void xsetSncbistdaaArray(org.apache.xmlbeans.XmlHexBinary[] sncbistdaaArray);
        
        /**
         * Sets (as xml) ith "sncbistdaa" element
         */
        void xsetSncbistdaaArray(int i, org.apache.xmlbeans.XmlHexBinary sncbistdaa);
        
        /**
         * Inserts the value as the ith "sncbistdaa" element
         */
        void insertSncbistdaa(int i, byte[] sncbistdaa);
        
        /**
         * Appends the value as the last "sncbistdaa" element
         */
        void addSncbistdaa(byte[] sncbistdaa);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sncbistdaa" element
         */
        org.apache.xmlbeans.XmlHexBinary insertNewSncbistdaa(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sncbistdaa" element
         */
        org.apache.xmlbeans.XmlHexBinary addNewSncbistdaa();
        
        /**
         * Removes the ith "sncbistdaa" element
         */
        void removeSncbistdaa(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode newInstance() {
              return (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GeneticCodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GeneticCodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
