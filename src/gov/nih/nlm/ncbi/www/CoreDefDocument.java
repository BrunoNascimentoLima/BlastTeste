/*
 * An XML document type.
 * Localname: CoreDef
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CoreDefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one CoreDef(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CoreDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoreDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("coredefbe72doctype");
    
    /**
     * Gets the "CoreDef" element
     */
    gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef getCoreDef();
    
    /**
     * Sets the "CoreDef" element
     */
    void setCoreDef(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef coreDef);
    
    /**
     * Appends and returns a new empty "CoreDef" element
     */
    gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef addNewCoreDef();
    
    /**
     * An XML CoreDef(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CoreDef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoreDef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("coredef8124elemtype");
        
        /**
         * Gets the "nblocks" element
         */
        java.math.BigInteger getNblocks();
        
        /**
         * Gets (as xml) the "nblocks" element
         */
        org.apache.xmlbeans.XmlInteger xgetNblocks();
        
        /**
         * Sets the "nblocks" element
         */
        void setNblocks(java.math.BigInteger nblocks);
        
        /**
         * Sets (as xml) the "nblocks" element
         */
        void xsetNblocks(org.apache.xmlbeans.XmlInteger nblocks);
        
        /**
         * Gets the "blocks" element
         */
        gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks getBlocks();
        
        /**
         * Sets the "blocks" element
         */
        void setBlocks(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks blocks);
        
        /**
         * Appends and returns a new empty "blocks" element
         */
        gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks addNewBlocks();
        
        /**
         * Gets the "loops" element
         */
        gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops getLoops();
        
        /**
         * Sets the "loops" element
         */
        void setLoops(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops loops);
        
        /**
         * Appends and returns a new empty "loops" element
         */
        gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops addNewLoops();
        
        /**
         * An XML blocks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Blocks extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blocks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blocksf946elemtype");
            
            /**
             * Gets array of all "CoreBlock" elements
             */
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock[] getCoreBlockArray();
            
            /**
             * Gets ith "CoreBlock" element
             */
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock getCoreBlockArray(int i);
            
            /**
             * Returns number of "CoreBlock" element
             */
            int sizeOfCoreBlockArray();
            
            /**
             * Sets array of all "CoreBlock" element
             */
            void setCoreBlockArray(gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock[] coreBlockArray);
            
            /**
             * Sets ith "CoreBlock" element
             */
            void setCoreBlockArray(int i, gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock coreBlock);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "CoreBlock" element
             */
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock insertNewCoreBlock(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "CoreBlock" element
             */
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock addNewCoreBlock();
            
            /**
             * Removes the ith "CoreBlock" element
             */
            void removeCoreBlock(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks newInstance() {
                  return (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML loops(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Loops extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loops.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("loopsa3dfelemtype");
            
            /**
             * Gets array of all "LoopConstraint" elements
             */
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint[] getLoopConstraintArray();
            
            /**
             * Gets ith "LoopConstraint" element
             */
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint getLoopConstraintArray(int i);
            
            /**
             * Returns number of "LoopConstraint" element
             */
            int sizeOfLoopConstraintArray();
            
            /**
             * Sets array of all "LoopConstraint" element
             */
            void setLoopConstraintArray(gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint[] loopConstraintArray);
            
            /**
             * Sets ith "LoopConstraint" element
             */
            void setLoopConstraintArray(int i, gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint loopConstraint);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "LoopConstraint" element
             */
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint insertNewLoopConstraint(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "LoopConstraint" element
             */
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint addNewLoopConstraint();
            
            /**
             * Removes the ith "LoopConstraint" element
             */
            void removeLoopConstraint(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops newInstance() {
                  return (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef newInstance() {
              return (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CoreDefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CoreDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CoreDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
