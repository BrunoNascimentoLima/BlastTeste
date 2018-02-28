/*
 * An XML document type.
 * Localname: CoreBlock
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CoreBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one CoreBlock(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CoreBlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoreBlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("coreblockb8fadoctype");
    
    /**
     * Gets the "CoreBlock" element
     */
    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock getCoreBlock();
    
    /**
     * Sets the "CoreBlock" element
     */
    void setCoreBlock(gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock coreBlock);
    
    /**
     * Appends and returns a new empty "CoreBlock" element
     */
    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock addNewCoreBlock();
    
    /**
     * An XML CoreBlock(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CoreBlock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoreBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("coreblock8974elemtype");
        
        /**
         * Gets the "start" element
         */
        java.math.BigInteger getStart();
        
        /**
         * Gets (as xml) the "start" element
         */
        org.apache.xmlbeans.XmlInteger xgetStart();
        
        /**
         * Sets the "start" element
         */
        void setStart(java.math.BigInteger start);
        
        /**
         * Sets (as xml) the "start" element
         */
        void xsetStart(org.apache.xmlbeans.XmlInteger start);
        
        /**
         * Gets the "stop" element
         */
        java.math.BigInteger getStop();
        
        /**
         * Gets (as xml) the "stop" element
         */
        org.apache.xmlbeans.XmlInteger xgetStop();
        
        /**
         * Sets the "stop" element
         */
        void setStop(java.math.BigInteger stop);
        
        /**
         * Sets (as xml) the "stop" element
         */
        void xsetStop(org.apache.xmlbeans.XmlInteger stop);
        
        /**
         * Gets the "minstart" element
         */
        java.math.BigInteger getMinstart();
        
        /**
         * Gets (as xml) the "minstart" element
         */
        org.apache.xmlbeans.XmlInteger xgetMinstart();
        
        /**
         * True if has "minstart" element
         */
        boolean isSetMinstart();
        
        /**
         * Sets the "minstart" element
         */
        void setMinstart(java.math.BigInteger minstart);
        
        /**
         * Sets (as xml) the "minstart" element
         */
        void xsetMinstart(org.apache.xmlbeans.XmlInteger minstart);
        
        /**
         * Unsets the "minstart" element
         */
        void unsetMinstart();
        
        /**
         * Gets the "maxstop" element
         */
        java.math.BigInteger getMaxstop();
        
        /**
         * Gets (as xml) the "maxstop" element
         */
        org.apache.xmlbeans.XmlInteger xgetMaxstop();
        
        /**
         * True if has "maxstop" element
         */
        boolean isSetMaxstop();
        
        /**
         * Sets the "maxstop" element
         */
        void setMaxstop(java.math.BigInteger maxstop);
        
        /**
         * Sets (as xml) the "maxstop" element
         */
        void xsetMaxstop(org.apache.xmlbeans.XmlInteger maxstop);
        
        /**
         * Unsets the "maxstop" element
         */
        void unsetMaxstop();
        
        /**
         * Gets the "property" element
         */
        gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property getProperty();
        
        /**
         * True if has "property" element
         */
        boolean isSetProperty();
        
        /**
         * Sets the "property" element
         */
        void setProperty(gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property property);
        
        /**
         * Appends and returns a new empty "property" element
         */
        gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property addNewProperty();
        
        /**
         * Unsets the "property" element
         */
        void unsetProperty();
        
        /**
         * An XML property(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Property extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("propertyb165elemtype");
            
            /**
             * Gets array of all "BlockProperty" elements
             */
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty[] getBlockPropertyArray();
            
            /**
             * Gets ith "BlockProperty" element
             */
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty getBlockPropertyArray(int i);
            
            /**
             * Returns number of "BlockProperty" element
             */
            int sizeOfBlockPropertyArray();
            
            /**
             * Sets array of all "BlockProperty" element
             */
            void setBlockPropertyArray(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty[] blockPropertyArray);
            
            /**
             * Sets ith "BlockProperty" element
             */
            void setBlockPropertyArray(int i, gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty blockProperty);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "BlockProperty" element
             */
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty insertNewBlockProperty(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "BlockProperty" element
             */
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty addNewBlockProperty();
            
            /**
             * Removes the ith "BlockProperty" element
             */
            void removeBlockProperty(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property newInstance() {
                  return (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock newInstance() {
              return (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CoreBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CoreBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
