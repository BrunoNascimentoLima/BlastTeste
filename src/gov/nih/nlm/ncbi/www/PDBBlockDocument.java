/*
 * An XML document type.
 * Localname: PDB-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PDBBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PDB-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PDBBlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PDBBlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pdbblocka3badoctype");
    
    /**
     * Gets the "PDB-block" element
     */
    gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock getPDBBlock();
    
    /**
     * Sets the "PDB-block" element
     */
    void setPDBBlock(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock pdbBlock);
    
    /**
     * Appends and returns a new empty "PDB-block" element
     */
    gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock addNewPDBBlock();
    
    /**
     * An XML PDB-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PDBBlock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PDBBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pdbblock3ef4elemtype");
        
        /**
         * Gets the "deposition" element
         */
        gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition getDeposition();
        
        /**
         * Sets the "deposition" element
         */
        void setDeposition(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition deposition);
        
        /**
         * Appends and returns a new empty "deposition" element
         */
        gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition addNewDeposition();
        
        /**
         * Gets the "class" element
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" element
         */
        org.apache.xmlbeans.XmlString xgetClass1();
        
        /**
         * Sets the "class" element
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" element
         */
        void xsetClass1(org.apache.xmlbeans.XmlString class1);
        
        /**
         * Gets array of all "compound" elements
         */
        java.lang.String[] getCompoundArray();
        
        /**
         * Gets ith "compound" element
         */
        java.lang.String getCompoundArray(int i);
        
        /**
         * Gets (as xml) array of all "compound" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCompoundArray();
        
        /**
         * Gets (as xml) ith "compound" element
         */
        org.apache.xmlbeans.XmlString xgetCompoundArray(int i);
        
        /**
         * Returns number of "compound" element
         */
        int sizeOfCompoundArray();
        
        /**
         * Sets array of all "compound" element
         */
        void setCompoundArray(java.lang.String[] compoundArray);
        
        /**
         * Sets ith "compound" element
         */
        void setCompoundArray(int i, java.lang.String compound);
        
        /**
         * Sets (as xml) array of all "compound" element
         */
        void xsetCompoundArray(org.apache.xmlbeans.XmlString[] compoundArray);
        
        /**
         * Sets (as xml) ith "compound" element
         */
        void xsetCompoundArray(int i, org.apache.xmlbeans.XmlString compound);
        
        /**
         * Inserts the value as the ith "compound" element
         */
        void insertCompound(int i, java.lang.String compound);
        
        /**
         * Appends the value as the last "compound" element
         */
        void addCompound(java.lang.String compound);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compound" element
         */
        org.apache.xmlbeans.XmlString insertNewCompound(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compound" element
         */
        org.apache.xmlbeans.XmlString addNewCompound();
        
        /**
         * Removes the ith "compound" element
         */
        void removeCompound(int i);
        
        /**
         * Gets array of all "source" elements
         */
        java.lang.String[] getSourceArray();
        
        /**
         * Gets ith "source" element
         */
        java.lang.String getSourceArray(int i);
        
        /**
         * Gets (as xml) array of all "source" elements
         */
        org.apache.xmlbeans.XmlString[] xgetSourceArray();
        
        /**
         * Gets (as xml) ith "source" element
         */
        org.apache.xmlbeans.XmlString xgetSourceArray(int i);
        
        /**
         * Returns number of "source" element
         */
        int sizeOfSourceArray();
        
        /**
         * Sets array of all "source" element
         */
        void setSourceArray(java.lang.String[] sourceArray);
        
        /**
         * Sets ith "source" element
         */
        void setSourceArray(int i, java.lang.String source);
        
        /**
         * Sets (as xml) array of all "source" element
         */
        void xsetSourceArray(org.apache.xmlbeans.XmlString[] sourceArray);
        
        /**
         * Sets (as xml) ith "source" element
         */
        void xsetSourceArray(int i, org.apache.xmlbeans.XmlString source);
        
        /**
         * Inserts the value as the ith "source" element
         */
        void insertSource(int i, java.lang.String source);
        
        /**
         * Appends the value as the last "source" element
         */
        void addSource(java.lang.String source);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "source" element
         */
        org.apache.xmlbeans.XmlString insertNewSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "source" element
         */
        org.apache.xmlbeans.XmlString addNewSource();
        
        /**
         * Removes the ith "source" element
         */
        void removeSource(int i);
        
        /**
         * Gets the "exp-method" element
         */
        java.lang.String getExpMethod();
        
        /**
         * Gets (as xml) the "exp-method" element
         */
        org.apache.xmlbeans.XmlString xgetExpMethod();
        
        /**
         * True if has "exp-method" element
         */
        boolean isSetExpMethod();
        
        /**
         * Sets the "exp-method" element
         */
        void setExpMethod(java.lang.String expMethod);
        
        /**
         * Sets (as xml) the "exp-method" element
         */
        void xsetExpMethod(org.apache.xmlbeans.XmlString expMethod);
        
        /**
         * Unsets the "exp-method" element
         */
        void unsetExpMethod();
        
        /**
         * Gets the "replace" element
         */
        gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace getReplace();
        
        /**
         * True if has "replace" element
         */
        boolean isSetReplace();
        
        /**
         * Sets the "replace" element
         */
        void setReplace(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace replace);
        
        /**
         * Appends and returns a new empty "replace" element
         */
        gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace addNewReplace();
        
        /**
         * Unsets the "replace" element
         */
        void unsetReplace();
        
        /**
         * An XML deposition(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Deposition extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Deposition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("deposition073aelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition newInstance() {
                  return (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML replace(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Replace extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Replace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("replace3e14elemtype");
            
            /**
             * Gets the "PDB-replace" element
             */
            gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace getPDBReplace();
            
            /**
             * Sets the "PDB-replace" element
             */
            void setPDBReplace(gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace pdbReplace);
            
            /**
             * Appends and returns a new empty "PDB-replace" element
             */
            gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace addNewPDBReplace();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace newInstance() {
                  return (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock newInstance() {
              return (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PDBBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PDBBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
