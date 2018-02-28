/*
 * An XML document type.
 * Localname: Affil
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AffilDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Affil(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface AffilDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AffilDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("affil7910doctype");
    
    /**
     * Gets the "Affil" element
     */
    gov.nih.nlm.ncbi.www.AffilDocument.Affil getAffil();
    
    /**
     * Sets the "Affil" element
     */
    void setAffil(gov.nih.nlm.ncbi.www.AffilDocument.Affil affil);
    
    /**
     * Appends and returns a new empty "Affil" element
     */
    gov.nih.nlm.ncbi.www.AffilDocument.Affil addNewAffil();
    
    /**
     * An XML Affil(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Affil extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Affil.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("affil2920elemtype");
        
        /**
         * Gets the "str" element
         */
        java.lang.String getStr();
        
        /**
         * Gets (as xml) the "str" element
         */
        org.apache.xmlbeans.XmlString xgetStr();
        
        /**
         * True if has "str" element
         */
        boolean isSetStr();
        
        /**
         * Sets the "str" element
         */
        void setStr(java.lang.String str);
        
        /**
         * Sets (as xml) the "str" element
         */
        void xsetStr(org.apache.xmlbeans.XmlString str);
        
        /**
         * Unsets the "str" element
         */
        void unsetStr();
        
        /**
         * Gets the "std" element
         */
        gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std getStd();
        
        /**
         * True if has "std" element
         */
        boolean isSetStd();
        
        /**
         * Sets the "std" element
         */
        void setStd(gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std std);
        
        /**
         * Appends and returns a new empty "std" element
         */
        gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std addNewStd();
        
        /**
         * Unsets the "std" element
         */
        void unsetStd();
        
        /**
         * An XML std(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Std extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Std.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("std9d2felemtype");
            
            /**
             * Gets the "affil" element
             */
            java.lang.String getAffil();
            
            /**
             * Gets (as xml) the "affil" element
             */
            org.apache.xmlbeans.XmlString xgetAffil();
            
            /**
             * True if has "affil" element
             */
            boolean isSetAffil();
            
            /**
             * Sets the "affil" element
             */
            void setAffil(java.lang.String affil);
            
            /**
             * Sets (as xml) the "affil" element
             */
            void xsetAffil(org.apache.xmlbeans.XmlString affil);
            
            /**
             * Unsets the "affil" element
             */
            void unsetAffil();
            
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
             * Gets the "city" element
             */
            java.lang.String getCity();
            
            /**
             * Gets (as xml) the "city" element
             */
            org.apache.xmlbeans.XmlString xgetCity();
            
            /**
             * True if has "city" element
             */
            boolean isSetCity();
            
            /**
             * Sets the "city" element
             */
            void setCity(java.lang.String city);
            
            /**
             * Sets (as xml) the "city" element
             */
            void xsetCity(org.apache.xmlbeans.XmlString city);
            
            /**
             * Unsets the "city" element
             */
            void unsetCity();
            
            /**
             * Gets the "sub" element
             */
            java.lang.String getSub();
            
            /**
             * Gets (as xml) the "sub" element
             */
            org.apache.xmlbeans.XmlString xgetSub();
            
            /**
             * True if has "sub" element
             */
            boolean isSetSub();
            
            /**
             * Sets the "sub" element
             */
            void setSub(java.lang.String sub);
            
            /**
             * Sets (as xml) the "sub" element
             */
            void xsetSub(org.apache.xmlbeans.XmlString sub);
            
            /**
             * Unsets the "sub" element
             */
            void unsetSub();
            
            /**
             * Gets the "country" element
             */
            java.lang.String getCountry();
            
            /**
             * Gets (as xml) the "country" element
             */
            org.apache.xmlbeans.XmlString xgetCountry();
            
            /**
             * True if has "country" element
             */
            boolean isSetCountry();
            
            /**
             * Sets the "country" element
             */
            void setCountry(java.lang.String country);
            
            /**
             * Sets (as xml) the "country" element
             */
            void xsetCountry(org.apache.xmlbeans.XmlString country);
            
            /**
             * Unsets the "country" element
             */
            void unsetCountry();
            
            /**
             * Gets the "street" element
             */
            java.lang.String getStreet();
            
            /**
             * Gets (as xml) the "street" element
             */
            org.apache.xmlbeans.XmlString xgetStreet();
            
            /**
             * True if has "street" element
             */
            boolean isSetStreet();
            
            /**
             * Sets the "street" element
             */
            void setStreet(java.lang.String street);
            
            /**
             * Sets (as xml) the "street" element
             */
            void xsetStreet(org.apache.xmlbeans.XmlString street);
            
            /**
             * Unsets the "street" element
             */
            void unsetStreet();
            
            /**
             * Gets the "email" element
             */
            java.lang.String getEmail();
            
            /**
             * Gets (as xml) the "email" element
             */
            org.apache.xmlbeans.XmlString xgetEmail();
            
            /**
             * True if has "email" element
             */
            boolean isSetEmail();
            
            /**
             * Sets the "email" element
             */
            void setEmail(java.lang.String email);
            
            /**
             * Sets (as xml) the "email" element
             */
            void xsetEmail(org.apache.xmlbeans.XmlString email);
            
            /**
             * Unsets the "email" element
             */
            void unsetEmail();
            
            /**
             * Gets the "fax" element
             */
            java.lang.String getFax();
            
            /**
             * Gets (as xml) the "fax" element
             */
            org.apache.xmlbeans.XmlString xgetFax();
            
            /**
             * True if has "fax" element
             */
            boolean isSetFax();
            
            /**
             * Sets the "fax" element
             */
            void setFax(java.lang.String fax);
            
            /**
             * Sets (as xml) the "fax" element
             */
            void xsetFax(org.apache.xmlbeans.XmlString fax);
            
            /**
             * Unsets the "fax" element
             */
            void unsetFax();
            
            /**
             * Gets the "phone" element
             */
            java.lang.String getPhone();
            
            /**
             * Gets (as xml) the "phone" element
             */
            org.apache.xmlbeans.XmlString xgetPhone();
            
            /**
             * True if has "phone" element
             */
            boolean isSetPhone();
            
            /**
             * Sets the "phone" element
             */
            void setPhone(java.lang.String phone);
            
            /**
             * Sets (as xml) the "phone" element
             */
            void xsetPhone(org.apache.xmlbeans.XmlString phone);
            
            /**
             * Unsets the "phone" element
             */
            void unsetPhone();
            
            /**
             * Gets the "postal-code" element
             */
            java.lang.String getPostalCode();
            
            /**
             * Gets (as xml) the "postal-code" element
             */
            org.apache.xmlbeans.XmlString xgetPostalCode();
            
            /**
             * True if has "postal-code" element
             */
            boolean isSetPostalCode();
            
            /**
             * Sets the "postal-code" element
             */
            void setPostalCode(java.lang.String postalCode);
            
            /**
             * Sets (as xml) the "postal-code" element
             */
            void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode);
            
            /**
             * Unsets the "postal-code" element
             */
            void unsetPostalCode();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std newInstance() {
                  return (gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.AffilDocument.Affil newInstance() {
              return (gov.nih.nlm.ncbi.www.AffilDocument.Affil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.AffilDocument.Affil newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.AffilDocument.Affil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.AffilDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.AffilDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.AffilDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
