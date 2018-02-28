/*
 * An XML document type.
 * Localname: GB-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GBBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one GB-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface GBBlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GBBlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gbblock3559doctype");
    
    /**
     * Gets the "GB-block" element
     */
    gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock getGBBlock();
    
    /**
     * Sets the "GB-block" element
     */
    void setGBBlock(gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock gbBlock);
    
    /**
     * Appends and returns a new empty "GB-block" element
     */
    gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock addNewGBBlock();
    
    /**
     * An XML GB-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface GBBlock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GBBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gbblockc3c2elemtype");
        
        /**
         * Gets array of all "extra-accessions" elements
         */
        java.lang.String[] getExtraAccessionsArray();
        
        /**
         * Gets ith "extra-accessions" element
         */
        java.lang.String getExtraAccessionsArray(int i);
        
        /**
         * Gets (as xml) array of all "extra-accessions" elements
         */
        org.apache.xmlbeans.XmlString[] xgetExtraAccessionsArray();
        
        /**
         * Gets (as xml) ith "extra-accessions" element
         */
        org.apache.xmlbeans.XmlString xgetExtraAccessionsArray(int i);
        
        /**
         * Returns number of "extra-accessions" element
         */
        int sizeOfExtraAccessionsArray();
        
        /**
         * Sets array of all "extra-accessions" element
         */
        void setExtraAccessionsArray(java.lang.String[] extraAccessionsArray);
        
        /**
         * Sets ith "extra-accessions" element
         */
        void setExtraAccessionsArray(int i, java.lang.String extraAccessions);
        
        /**
         * Sets (as xml) array of all "extra-accessions" element
         */
        void xsetExtraAccessionsArray(org.apache.xmlbeans.XmlString[] extraAccessionsArray);
        
        /**
         * Sets (as xml) ith "extra-accessions" element
         */
        void xsetExtraAccessionsArray(int i, org.apache.xmlbeans.XmlString extraAccessions);
        
        /**
         * Inserts the value as the ith "extra-accessions" element
         */
        void insertExtraAccessions(int i, java.lang.String extraAccessions);
        
        /**
         * Appends the value as the last "extra-accessions" element
         */
        void addExtraAccessions(java.lang.String extraAccessions);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extra-accessions" element
         */
        org.apache.xmlbeans.XmlString insertNewExtraAccessions(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extra-accessions" element
         */
        org.apache.xmlbeans.XmlString addNewExtraAccessions();
        
        /**
         * Removes the ith "extra-accessions" element
         */
        void removeExtraAccessions(int i);
        
        /**
         * Gets the "source" element
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" element
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" element
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets array of all "keywords" elements
         */
        java.lang.String[] getKeywordsArray();
        
        /**
         * Gets ith "keywords" element
         */
        java.lang.String getKeywordsArray(int i);
        
        /**
         * Gets (as xml) array of all "keywords" elements
         */
        org.apache.xmlbeans.XmlString[] xgetKeywordsArray();
        
        /**
         * Gets (as xml) ith "keywords" element
         */
        org.apache.xmlbeans.XmlString xgetKeywordsArray(int i);
        
        /**
         * Returns number of "keywords" element
         */
        int sizeOfKeywordsArray();
        
        /**
         * Sets array of all "keywords" element
         */
        void setKeywordsArray(java.lang.String[] keywordsArray);
        
        /**
         * Sets ith "keywords" element
         */
        void setKeywordsArray(int i, java.lang.String keywords);
        
        /**
         * Sets (as xml) array of all "keywords" element
         */
        void xsetKeywordsArray(org.apache.xmlbeans.XmlString[] keywordsArray);
        
        /**
         * Sets (as xml) ith "keywords" element
         */
        void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords);
        
        /**
         * Inserts the value as the ith "keywords" element
         */
        void insertKeywords(int i, java.lang.String keywords);
        
        /**
         * Appends the value as the last "keywords" element
         */
        void addKeywords(java.lang.String keywords);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keywords" element
         */
        org.apache.xmlbeans.XmlString insertNewKeywords(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keywords" element
         */
        org.apache.xmlbeans.XmlString addNewKeywords();
        
        /**
         * Removes the ith "keywords" element
         */
        void removeKeywords(int i);
        
        /**
         * Gets the "origin" element
         */
        java.lang.String getOrigin();
        
        /**
         * Gets (as xml) the "origin" element
         */
        org.apache.xmlbeans.XmlString xgetOrigin();
        
        /**
         * True if has "origin" element
         */
        boolean isSetOrigin();
        
        /**
         * Sets the "origin" element
         */
        void setOrigin(java.lang.String origin);
        
        /**
         * Sets (as xml) the "origin" element
         */
        void xsetOrigin(org.apache.xmlbeans.XmlString origin);
        
        /**
         * Unsets the "origin" element
         */
        void unsetOrigin();
        
        /**
         * Gets the "date" element
         */
        java.lang.String getDate();
        
        /**
         * Gets (as xml) the "date" element
         */
        org.apache.xmlbeans.XmlString xgetDate();
        
        /**
         * True if has "date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(java.lang.String date);
        
        /**
         * Sets (as xml) the "date" element
         */
        void xsetDate(org.apache.xmlbeans.XmlString date);
        
        /**
         * Unsets the "date" element
         */
        void unsetDate();
        
        /**
         * Gets the "entry-date" element
         */
        gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate getEntryDate();
        
        /**
         * True if has "entry-date" element
         */
        boolean isSetEntryDate();
        
        /**
         * Sets the "entry-date" element
         */
        void setEntryDate(gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate entryDate);
        
        /**
         * Appends and returns a new empty "entry-date" element
         */
        gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate addNewEntryDate();
        
        /**
         * Unsets the "entry-date" element
         */
        void unsetEntryDate();
        
        /**
         * Gets the "div" element
         */
        java.lang.String getDiv();
        
        /**
         * Gets (as xml) the "div" element
         */
        org.apache.xmlbeans.XmlString xgetDiv();
        
        /**
         * True if has "div" element
         */
        boolean isSetDiv();
        
        /**
         * Sets the "div" element
         */
        void setDiv(java.lang.String div);
        
        /**
         * Sets (as xml) the "div" element
         */
        void xsetDiv(org.apache.xmlbeans.XmlString div);
        
        /**
         * Unsets the "div" element
         */
        void unsetDiv();
        
        /**
         * Gets the "taxonomy" element
         */
        java.lang.String getTaxonomy();
        
        /**
         * Gets (as xml) the "taxonomy" element
         */
        org.apache.xmlbeans.XmlString xgetTaxonomy();
        
        /**
         * True if has "taxonomy" element
         */
        boolean isSetTaxonomy();
        
        /**
         * Sets the "taxonomy" element
         */
        void setTaxonomy(java.lang.String taxonomy);
        
        /**
         * Sets (as xml) the "taxonomy" element
         */
        void xsetTaxonomy(org.apache.xmlbeans.XmlString taxonomy);
        
        /**
         * Unsets the "taxonomy" element
         */
        void unsetTaxonomy();
        
        /**
         * An XML entry-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface EntryDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntryDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("entrydated347elemtype");
            
            /**
             * Gets the "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date getDate();
            
            /**
             * Sets the "Date" element
             */
            void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date);
            
            /**
             * Appends and returns a new empty "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock.EntryDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock newInstance() {
              return (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.GBBlockDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GBBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
