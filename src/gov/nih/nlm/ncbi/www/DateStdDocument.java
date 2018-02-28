/*
 * An XML document type.
 * Localname: Date-std
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DateStdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Date-std(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface DateStdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateStdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datestdec62doctype");
    
    /**
     * Gets the "Date-std" element
     */
    gov.nih.nlm.ncbi.www.DateStdDocument.DateStd getDateStd();
    
    /**
     * Sets the "Date-std" element
     */
    void setDateStd(gov.nih.nlm.ncbi.www.DateStdDocument.DateStd dateStd);
    
    /**
     * Appends and returns a new empty "Date-std" element
     */
    gov.nih.nlm.ncbi.www.DateStdDocument.DateStd addNewDateStd();
    
    /**
     * An XML Date-std(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface DateStd extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateStd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datestd3422elemtype");
        
        /**
         * Gets the "year" element
         */
        java.math.BigInteger getYear();
        
        /**
         * Gets (as xml) the "year" element
         */
        org.apache.xmlbeans.XmlInteger xgetYear();
        
        /**
         * Sets the "year" element
         */
        void setYear(java.math.BigInteger year);
        
        /**
         * Sets (as xml) the "year" element
         */
        void xsetYear(org.apache.xmlbeans.XmlInteger year);
        
        /**
         * Gets the "month" element
         */
        java.math.BigInteger getMonth();
        
        /**
         * Gets (as xml) the "month" element
         */
        org.apache.xmlbeans.XmlInteger xgetMonth();
        
        /**
         * True if has "month" element
         */
        boolean isSetMonth();
        
        /**
         * Sets the "month" element
         */
        void setMonth(java.math.BigInteger month);
        
        /**
         * Sets (as xml) the "month" element
         */
        void xsetMonth(org.apache.xmlbeans.XmlInteger month);
        
        /**
         * Unsets the "month" element
         */
        void unsetMonth();
        
        /**
         * Gets the "day" element
         */
        java.math.BigInteger getDay();
        
        /**
         * Gets (as xml) the "day" element
         */
        org.apache.xmlbeans.XmlInteger xgetDay();
        
        /**
         * True if has "day" element
         */
        boolean isSetDay();
        
        /**
         * Sets the "day" element
         */
        void setDay(java.math.BigInteger day);
        
        /**
         * Sets (as xml) the "day" element
         */
        void xsetDay(org.apache.xmlbeans.XmlInteger day);
        
        /**
         * Unsets the "day" element
         */
        void unsetDay();
        
        /**
         * Gets the "season" element
         */
        java.lang.String getSeason();
        
        /**
         * Gets (as xml) the "season" element
         */
        org.apache.xmlbeans.XmlString xgetSeason();
        
        /**
         * True if has "season" element
         */
        boolean isSetSeason();
        
        /**
         * Sets the "season" element
         */
        void setSeason(java.lang.String season);
        
        /**
         * Sets (as xml) the "season" element
         */
        void xsetSeason(org.apache.xmlbeans.XmlString season);
        
        /**
         * Unsets the "season" element
         */
        void unsetSeason();
        
        /**
         * Gets the "hour" element
         */
        java.math.BigInteger getHour();
        
        /**
         * Gets (as xml) the "hour" element
         */
        org.apache.xmlbeans.XmlInteger xgetHour();
        
        /**
         * True if has "hour" element
         */
        boolean isSetHour();
        
        /**
         * Sets the "hour" element
         */
        void setHour(java.math.BigInteger hour);
        
        /**
         * Sets (as xml) the "hour" element
         */
        void xsetHour(org.apache.xmlbeans.XmlInteger hour);
        
        /**
         * Unsets the "hour" element
         */
        void unsetHour();
        
        /**
         * Gets the "minute" element
         */
        java.math.BigInteger getMinute();
        
        /**
         * Gets (as xml) the "minute" element
         */
        org.apache.xmlbeans.XmlInteger xgetMinute();
        
        /**
         * True if has "minute" element
         */
        boolean isSetMinute();
        
        /**
         * Sets the "minute" element
         */
        void setMinute(java.math.BigInteger minute);
        
        /**
         * Sets (as xml) the "minute" element
         */
        void xsetMinute(org.apache.xmlbeans.XmlInteger minute);
        
        /**
         * Unsets the "minute" element
         */
        void unsetMinute();
        
        /**
         * Gets the "second" element
         */
        java.math.BigInteger getSecond();
        
        /**
         * Gets (as xml) the "second" element
         */
        org.apache.xmlbeans.XmlInteger xgetSecond();
        
        /**
         * True if has "second" element
         */
        boolean isSetSecond();
        
        /**
         * Sets the "second" element
         */
        void setSecond(java.math.BigInteger second);
        
        /**
         * Sets (as xml) the "second" element
         */
        void xsetSecond(org.apache.xmlbeans.XmlInteger second);
        
        /**
         * Unsets the "second" element
         */
        void unsetSecond();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.DateStdDocument.DateStd newInstance() {
              return (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.DateStdDocument.DateStd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.DateStdDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.DateStdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.DateStdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
