/*
 * An XML document type.
 * Localname: Seq-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqGraphDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqGraphDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqgraphd82cdoctype");
    
    /**
     * Gets the "Seq-graph" element
     */
    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph getSeqGraph();
    
    /**
     * Sets the "Seq-graph" element
     */
    void setSeqGraph(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph seqGraph);
    
    /**
     * Appends and returns a new empty "Seq-graph" element
     */
    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph addNewSeqGraph();
    
    /**
     * An XML Seq-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqGraph extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqGraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqgraph8cd8elemtype");
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "comment" element
         */
        java.lang.String getComment();
        
        /**
         * Gets (as xml) the "comment" element
         */
        org.apache.xmlbeans.XmlString xgetComment();
        
        /**
         * True if has "comment" element
         */
        boolean isSetComment();
        
        /**
         * Sets the "comment" element
         */
        void setComment(java.lang.String comment);
        
        /**
         * Sets (as xml) the "comment" element
         */
        void xsetComment(org.apache.xmlbeans.XmlString comment);
        
        /**
         * Unsets the "comment" element
         */
        void unsetComment();
        
        /**
         * Gets the "loc" element
         */
        gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc getLoc();
        
        /**
         * Sets the "loc" element
         */
        void setLoc(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc loc);
        
        /**
         * Appends and returns a new empty "loc" element
         */
        gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc addNewLoc();
        
        /**
         * Gets the "title-x" element
         */
        java.lang.String getTitleX();
        
        /**
         * Gets (as xml) the "title-x" element
         */
        org.apache.xmlbeans.XmlString xgetTitleX();
        
        /**
         * True if has "title-x" element
         */
        boolean isSetTitleX();
        
        /**
         * Sets the "title-x" element
         */
        void setTitleX(java.lang.String titleX);
        
        /**
         * Sets (as xml) the "title-x" element
         */
        void xsetTitleX(org.apache.xmlbeans.XmlString titleX);
        
        /**
         * Unsets the "title-x" element
         */
        void unsetTitleX();
        
        /**
         * Gets the "title-y" element
         */
        java.lang.String getTitleY();
        
        /**
         * Gets (as xml) the "title-y" element
         */
        org.apache.xmlbeans.XmlString xgetTitleY();
        
        /**
         * True if has "title-y" element
         */
        boolean isSetTitleY();
        
        /**
         * Sets the "title-y" element
         */
        void setTitleY(java.lang.String titleY);
        
        /**
         * Sets (as xml) the "title-y" element
         */
        void xsetTitleY(org.apache.xmlbeans.XmlString titleY);
        
        /**
         * Unsets the "title-y" element
         */
        void unsetTitleY();
        
        /**
         * Gets the "comp" element
         */
        java.math.BigInteger getComp();
        
        /**
         * Gets (as xml) the "comp" element
         */
        org.apache.xmlbeans.XmlInteger xgetComp();
        
        /**
         * True if has "comp" element
         */
        boolean isSetComp();
        
        /**
         * Sets the "comp" element
         */
        void setComp(java.math.BigInteger comp);
        
        /**
         * Sets (as xml) the "comp" element
         */
        void xsetComp(org.apache.xmlbeans.XmlInteger comp);
        
        /**
         * Unsets the "comp" element
         */
        void unsetComp();
        
        /**
         * Gets the "a" element
         */
        double getA();
        
        /**
         * Gets (as xml) the "a" element
         */
        org.apache.xmlbeans.XmlDouble xgetA();
        
        /**
         * True if has "a" element
         */
        boolean isSetA();
        
        /**
         * Sets the "a" element
         */
        void setA(double a);
        
        /**
         * Sets (as xml) the "a" element
         */
        void xsetA(org.apache.xmlbeans.XmlDouble a);
        
        /**
         * Unsets the "a" element
         */
        void unsetA();
        
        /**
         * Gets the "b" element
         */
        double getB();
        
        /**
         * Gets (as xml) the "b" element
         */
        org.apache.xmlbeans.XmlDouble xgetB();
        
        /**
         * True if has "b" element
         */
        boolean isSetB();
        
        /**
         * Sets the "b" element
         */
        void setB(double b);
        
        /**
         * Sets (as xml) the "b" element
         */
        void xsetB(org.apache.xmlbeans.XmlDouble b);
        
        /**
         * Unsets the "b" element
         */
        void unsetB();
        
        /**
         * Gets the "numval" element
         */
        java.math.BigInteger getNumval();
        
        /**
         * Gets (as xml) the "numval" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumval();
        
        /**
         * Sets the "numval" element
         */
        void setNumval(java.math.BigInteger numval);
        
        /**
         * Sets (as xml) the "numval" element
         */
        void xsetNumval(org.apache.xmlbeans.XmlInteger numval);
        
        /**
         * Gets the "graph" element
         */
        gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph getGraph();
        
        /**
         * Sets the "graph" element
         */
        void setGraph(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph graph);
        
        /**
         * Appends and returns a new empty "graph" element
         */
        gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph addNewGraph();
        
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Loc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("loc0284elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML graph(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Graph extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Graph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("graph5b92elemtype");
            
            /**
             * Gets the "real" element
             */
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real getReal();
            
            /**
             * True if has "real" element
             */
            boolean isSetReal();
            
            /**
             * Sets the "real" element
             */
            void setReal(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real real);
            
            /**
             * Appends and returns a new empty "real" element
             */
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real addNewReal();
            
            /**
             * Unsets the "real" element
             */
            void unsetReal();
            
            /**
             * Gets the "int" element
             */
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int getInt();
            
            /**
             * True if has "int" element
             */
            boolean isSetInt();
            
            /**
             * Sets the "int" element
             */
            void setInt(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int xint);
            
            /**
             * Appends and returns a new empty "int" element
             */
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int addNewInt();
            
            /**
             * Unsets the "int" element
             */
            void unsetInt();
            
            /**
             * Gets the "byte" element
             */
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte getByte();
            
            /**
             * True if has "byte" element
             */
            boolean isSetByte();
            
            /**
             * Sets the "byte" element
             */
            void setByte(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte xbyte);
            
            /**
             * Appends and returns a new empty "byte" element
             */
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte addNewByte();
            
            /**
             * Unsets the "byte" element
             */
            void unsetByte();
            
            /**
             * An XML real(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Real extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Real.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("real0eccelemtype");
                
                /**
                 * Gets the "Real-graph" element
                 */
                gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph getRealGraph();
                
                /**
                 * Sets the "Real-graph" element
                 */
                void setRealGraph(gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph realGraph);
                
                /**
                 * Appends and returns a new empty "Real-graph" element
                 */
                gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph addNewRealGraph();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML int(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Int extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Int.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("int116delemtype");
                
                /**
                 * Gets the "Int-graph" element
                 */
                gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph getIntGraph();
                
                /**
                 * Sets the "Int-graph" element
                 */
                void setIntGraph(gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph intGraph);
                
                /**
                 * Appends and returns a new empty "Int-graph" element
                 */
                gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph addNewIntGraph();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML byte(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Byte extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Byte.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("byte0b36elemtype");
                
                /**
                 * Gets the "Byte-graph" element
                 */
                gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph getByteGraph();
                
                /**
                 * Sets the "Byte-graph" element
                 */
                void setByteGraph(gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph byteGraph);
                
                /**
                 * Appends and returns a new empty "Byte-graph" element
                 */
                gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph addNewByteGraph();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqGraphDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqGraphDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
