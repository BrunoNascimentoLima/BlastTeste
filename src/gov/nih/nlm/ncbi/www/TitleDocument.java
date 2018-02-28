/*
 * An XML document type.
 * Localname: Title
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TitleDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Title(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface TitleDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("titlee3a4doctype");
    
    /**
     * Gets the "Title" element
     */
    gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle();
    
    /**
     * Sets the "Title" element
     */
    void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title);
    
    /**
     * Appends and returns a new empty "Title" element
     */
    gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle();
    
    /**
     * An XML Title(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Title extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Title.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("title2a48elemtype");
        
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
         * Gets array of all "tsub" elements
         */
        java.lang.String[] getTsubArray();
        
        /**
         * Gets ith "tsub" element
         */
        java.lang.String getTsubArray(int i);
        
        /**
         * Gets (as xml) array of all "tsub" elements
         */
        org.apache.xmlbeans.XmlString[] xgetTsubArray();
        
        /**
         * Gets (as xml) ith "tsub" element
         */
        org.apache.xmlbeans.XmlString xgetTsubArray(int i);
        
        /**
         * Returns number of "tsub" element
         */
        int sizeOfTsubArray();
        
        /**
         * Sets array of all "tsub" element
         */
        void setTsubArray(java.lang.String[] tsubArray);
        
        /**
         * Sets ith "tsub" element
         */
        void setTsubArray(int i, java.lang.String tsub);
        
        /**
         * Sets (as xml) array of all "tsub" element
         */
        void xsetTsubArray(org.apache.xmlbeans.XmlString[] tsubArray);
        
        /**
         * Sets (as xml) ith "tsub" element
         */
        void xsetTsubArray(int i, org.apache.xmlbeans.XmlString tsub);
        
        /**
         * Inserts the value as the ith "tsub" element
         */
        void insertTsub(int i, java.lang.String tsub);
        
        /**
         * Appends the value as the last "tsub" element
         */
        void addTsub(java.lang.String tsub);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tsub" element
         */
        org.apache.xmlbeans.XmlString insertNewTsub(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tsub" element
         */
        org.apache.xmlbeans.XmlString addNewTsub();
        
        /**
         * Removes the ith "tsub" element
         */
        void removeTsub(int i);
        
        /**
         * Gets array of all "trans" elements
         */
        java.lang.String[] getTransArray();
        
        /**
         * Gets ith "trans" element
         */
        java.lang.String getTransArray(int i);
        
        /**
         * Gets (as xml) array of all "trans" elements
         */
        org.apache.xmlbeans.XmlString[] xgetTransArray();
        
        /**
         * Gets (as xml) ith "trans" element
         */
        org.apache.xmlbeans.XmlString xgetTransArray(int i);
        
        /**
         * Returns number of "trans" element
         */
        int sizeOfTransArray();
        
        /**
         * Sets array of all "trans" element
         */
        void setTransArray(java.lang.String[] transArray);
        
        /**
         * Sets ith "trans" element
         */
        void setTransArray(int i, java.lang.String trans);
        
        /**
         * Sets (as xml) array of all "trans" element
         */
        void xsetTransArray(org.apache.xmlbeans.XmlString[] transArray);
        
        /**
         * Sets (as xml) ith "trans" element
         */
        void xsetTransArray(int i, org.apache.xmlbeans.XmlString trans);
        
        /**
         * Inserts the value as the ith "trans" element
         */
        void insertTrans(int i, java.lang.String trans);
        
        /**
         * Appends the value as the last "trans" element
         */
        void addTrans(java.lang.String trans);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "trans" element
         */
        org.apache.xmlbeans.XmlString insertNewTrans(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "trans" element
         */
        org.apache.xmlbeans.XmlString addNewTrans();
        
        /**
         * Removes the ith "trans" element
         */
        void removeTrans(int i);
        
        /**
         * Gets array of all "jta" elements
         */
        java.lang.String[] getJtaArray();
        
        /**
         * Gets ith "jta" element
         */
        java.lang.String getJtaArray(int i);
        
        /**
         * Gets (as xml) array of all "jta" elements
         */
        org.apache.xmlbeans.XmlString[] xgetJtaArray();
        
        /**
         * Gets (as xml) ith "jta" element
         */
        org.apache.xmlbeans.XmlString xgetJtaArray(int i);
        
        /**
         * Returns number of "jta" element
         */
        int sizeOfJtaArray();
        
        /**
         * Sets array of all "jta" element
         */
        void setJtaArray(java.lang.String[] jtaArray);
        
        /**
         * Sets ith "jta" element
         */
        void setJtaArray(int i, java.lang.String jta);
        
        /**
         * Sets (as xml) array of all "jta" element
         */
        void xsetJtaArray(org.apache.xmlbeans.XmlString[] jtaArray);
        
        /**
         * Sets (as xml) ith "jta" element
         */
        void xsetJtaArray(int i, org.apache.xmlbeans.XmlString jta);
        
        /**
         * Inserts the value as the ith "jta" element
         */
        void insertJta(int i, java.lang.String jta);
        
        /**
         * Appends the value as the last "jta" element
         */
        void addJta(java.lang.String jta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jta" element
         */
        org.apache.xmlbeans.XmlString insertNewJta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jta" element
         */
        org.apache.xmlbeans.XmlString addNewJta();
        
        /**
         * Removes the ith "jta" element
         */
        void removeJta(int i);
        
        /**
         * Gets array of all "iso-jta" elements
         */
        java.lang.String[] getIsoJtaArray();
        
        /**
         * Gets ith "iso-jta" element
         */
        java.lang.String getIsoJtaArray(int i);
        
        /**
         * Gets (as xml) array of all "iso-jta" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIsoJtaArray();
        
        /**
         * Gets (as xml) ith "iso-jta" element
         */
        org.apache.xmlbeans.XmlString xgetIsoJtaArray(int i);
        
        /**
         * Returns number of "iso-jta" element
         */
        int sizeOfIsoJtaArray();
        
        /**
         * Sets array of all "iso-jta" element
         */
        void setIsoJtaArray(java.lang.String[] isoJtaArray);
        
        /**
         * Sets ith "iso-jta" element
         */
        void setIsoJtaArray(int i, java.lang.String isoJta);
        
        /**
         * Sets (as xml) array of all "iso-jta" element
         */
        void xsetIsoJtaArray(org.apache.xmlbeans.XmlString[] isoJtaArray);
        
        /**
         * Sets (as xml) ith "iso-jta" element
         */
        void xsetIsoJtaArray(int i, org.apache.xmlbeans.XmlString isoJta);
        
        /**
         * Inserts the value as the ith "iso-jta" element
         */
        void insertIsoJta(int i, java.lang.String isoJta);
        
        /**
         * Appends the value as the last "iso-jta" element
         */
        void addIsoJta(java.lang.String isoJta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "iso-jta" element
         */
        org.apache.xmlbeans.XmlString insertNewIsoJta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "iso-jta" element
         */
        org.apache.xmlbeans.XmlString addNewIsoJta();
        
        /**
         * Removes the ith "iso-jta" element
         */
        void removeIsoJta(int i);
        
        /**
         * Gets array of all "ml-jta" elements
         */
        java.lang.String[] getMlJtaArray();
        
        /**
         * Gets ith "ml-jta" element
         */
        java.lang.String getMlJtaArray(int i);
        
        /**
         * Gets (as xml) array of all "ml-jta" elements
         */
        org.apache.xmlbeans.XmlString[] xgetMlJtaArray();
        
        /**
         * Gets (as xml) ith "ml-jta" element
         */
        org.apache.xmlbeans.XmlString xgetMlJtaArray(int i);
        
        /**
         * Returns number of "ml-jta" element
         */
        int sizeOfMlJtaArray();
        
        /**
         * Sets array of all "ml-jta" element
         */
        void setMlJtaArray(java.lang.String[] mlJtaArray);
        
        /**
         * Sets ith "ml-jta" element
         */
        void setMlJtaArray(int i, java.lang.String mlJta);
        
        /**
         * Sets (as xml) array of all "ml-jta" element
         */
        void xsetMlJtaArray(org.apache.xmlbeans.XmlString[] mlJtaArray);
        
        /**
         * Sets (as xml) ith "ml-jta" element
         */
        void xsetMlJtaArray(int i, org.apache.xmlbeans.XmlString mlJta);
        
        /**
         * Inserts the value as the ith "ml-jta" element
         */
        void insertMlJta(int i, java.lang.String mlJta);
        
        /**
         * Appends the value as the last "ml-jta" element
         */
        void addMlJta(java.lang.String mlJta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ml-jta" element
         */
        org.apache.xmlbeans.XmlString insertNewMlJta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ml-jta" element
         */
        org.apache.xmlbeans.XmlString addNewMlJta();
        
        /**
         * Removes the ith "ml-jta" element
         */
        void removeMlJta(int i);
        
        /**
         * Gets array of all "coden" elements
         */
        java.lang.String[] getCodenArray();
        
        /**
         * Gets ith "coden" element
         */
        java.lang.String getCodenArray(int i);
        
        /**
         * Gets (as xml) array of all "coden" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCodenArray();
        
        /**
         * Gets (as xml) ith "coden" element
         */
        org.apache.xmlbeans.XmlString xgetCodenArray(int i);
        
        /**
         * Returns number of "coden" element
         */
        int sizeOfCodenArray();
        
        /**
         * Sets array of all "coden" element
         */
        void setCodenArray(java.lang.String[] codenArray);
        
        /**
         * Sets ith "coden" element
         */
        void setCodenArray(int i, java.lang.String coden);
        
        /**
         * Sets (as xml) array of all "coden" element
         */
        void xsetCodenArray(org.apache.xmlbeans.XmlString[] codenArray);
        
        /**
         * Sets (as xml) ith "coden" element
         */
        void xsetCodenArray(int i, org.apache.xmlbeans.XmlString coden);
        
        /**
         * Inserts the value as the ith "coden" element
         */
        void insertCoden(int i, java.lang.String coden);
        
        /**
         * Appends the value as the last "coden" element
         */
        void addCoden(java.lang.String coden);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "coden" element
         */
        org.apache.xmlbeans.XmlString insertNewCoden(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "coden" element
         */
        org.apache.xmlbeans.XmlString addNewCoden();
        
        /**
         * Removes the ith "coden" element
         */
        void removeCoden(int i);
        
        /**
         * Gets array of all "issn" elements
         */
        java.lang.String[] getIssnArray();
        
        /**
         * Gets ith "issn" element
         */
        java.lang.String getIssnArray(int i);
        
        /**
         * Gets (as xml) array of all "issn" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIssnArray();
        
        /**
         * Gets (as xml) ith "issn" element
         */
        org.apache.xmlbeans.XmlString xgetIssnArray(int i);
        
        /**
         * Returns number of "issn" element
         */
        int sizeOfIssnArray();
        
        /**
         * Sets array of all "issn" element
         */
        void setIssnArray(java.lang.String[] issnArray);
        
        /**
         * Sets ith "issn" element
         */
        void setIssnArray(int i, java.lang.String issn);
        
        /**
         * Sets (as xml) array of all "issn" element
         */
        void xsetIssnArray(org.apache.xmlbeans.XmlString[] issnArray);
        
        /**
         * Sets (as xml) ith "issn" element
         */
        void xsetIssnArray(int i, org.apache.xmlbeans.XmlString issn);
        
        /**
         * Inserts the value as the ith "issn" element
         */
        void insertIssn(int i, java.lang.String issn);
        
        /**
         * Appends the value as the last "issn" element
         */
        void addIssn(java.lang.String issn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "issn" element
         */
        org.apache.xmlbeans.XmlString insertNewIssn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "issn" element
         */
        org.apache.xmlbeans.XmlString addNewIssn();
        
        /**
         * Removes the ith "issn" element
         */
        void removeIssn(int i);
        
        /**
         * Gets array of all "abr" elements
         */
        java.lang.String[] getAbrArray();
        
        /**
         * Gets ith "abr" element
         */
        java.lang.String getAbrArray(int i);
        
        /**
         * Gets (as xml) array of all "abr" elements
         */
        org.apache.xmlbeans.XmlString[] xgetAbrArray();
        
        /**
         * Gets (as xml) ith "abr" element
         */
        org.apache.xmlbeans.XmlString xgetAbrArray(int i);
        
        /**
         * Returns number of "abr" element
         */
        int sizeOfAbrArray();
        
        /**
         * Sets array of all "abr" element
         */
        void setAbrArray(java.lang.String[] abrArray);
        
        /**
         * Sets ith "abr" element
         */
        void setAbrArray(int i, java.lang.String abr);
        
        /**
         * Sets (as xml) array of all "abr" element
         */
        void xsetAbrArray(org.apache.xmlbeans.XmlString[] abrArray);
        
        /**
         * Sets (as xml) ith "abr" element
         */
        void xsetAbrArray(int i, org.apache.xmlbeans.XmlString abr);
        
        /**
         * Inserts the value as the ith "abr" element
         */
        void insertAbr(int i, java.lang.String abr);
        
        /**
         * Appends the value as the last "abr" element
         */
        void addAbr(java.lang.String abr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "abr" element
         */
        org.apache.xmlbeans.XmlString insertNewAbr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "abr" element
         */
        org.apache.xmlbeans.XmlString addNewAbr();
        
        /**
         * Removes the ith "abr" element
         */
        void removeAbr(int i);
        
        /**
         * Gets array of all "isbn" elements
         */
        java.lang.String[] getIsbnArray();
        
        /**
         * Gets ith "isbn" element
         */
        java.lang.String getIsbnArray(int i);
        
        /**
         * Gets (as xml) array of all "isbn" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIsbnArray();
        
        /**
         * Gets (as xml) ith "isbn" element
         */
        org.apache.xmlbeans.XmlString xgetIsbnArray(int i);
        
        /**
         * Returns number of "isbn" element
         */
        int sizeOfIsbnArray();
        
        /**
         * Sets array of all "isbn" element
         */
        void setIsbnArray(java.lang.String[] isbnArray);
        
        /**
         * Sets ith "isbn" element
         */
        void setIsbnArray(int i, java.lang.String isbn);
        
        /**
         * Sets (as xml) array of all "isbn" element
         */
        void xsetIsbnArray(org.apache.xmlbeans.XmlString[] isbnArray);
        
        /**
         * Sets (as xml) ith "isbn" element
         */
        void xsetIsbnArray(int i, org.apache.xmlbeans.XmlString isbn);
        
        /**
         * Inserts the value as the ith "isbn" element
         */
        void insertIsbn(int i, java.lang.String isbn);
        
        /**
         * Appends the value as the last "isbn" element
         */
        void addIsbn(java.lang.String isbn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "isbn" element
         */
        org.apache.xmlbeans.XmlString insertNewIsbn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "isbn" element
         */
        org.apache.xmlbeans.XmlString addNewIsbn();
        
        /**
         * Removes the ith "isbn" element
         */
        void removeIsbn(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.TitleDocument.Title newInstance() {
              return (gov.nih.nlm.ncbi.www.TitleDocument.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.TitleDocument.Title newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.TitleDocument.Title) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.TitleDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TitleDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TitleDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
