/*
 * An XML document type.
 * Localname: Seq-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqExtDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqExtDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqext68bfdoctype");
    
    /**
     * Gets the "Seq-ext" element
     */
    gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt getSeqExt();
    
    /**
     * Sets the "Seq-ext" element
     */
    void setSeqExt(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt seqExt);
    
    /**
     * Appends and returns a new empty "Seq-ext" element
     */
    gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt addNewSeqExt();
    
    /**
     * An XML Seq-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqExt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqExt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqext197eelemtype");
        
        /**
         * Gets the "seg" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg getSeg();
        
        /**
         * True if has "seg" element
         */
        boolean isSetSeg();
        
        /**
         * Sets the "seg" element
         */
        void setSeg(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg seg);
        
        /**
         * Appends and returns a new empty "seg" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg addNewSeg();
        
        /**
         * Unsets the "seg" element
         */
        void unsetSeg();
        
        /**
         * Gets the "ref" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref getRef();
        
        /**
         * True if has "ref" element
         */
        boolean isSetRef();
        
        /**
         * Sets the "ref" element
         */
        void setRef(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref ref);
        
        /**
         * Appends and returns a new empty "ref" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref addNewRef();
        
        /**
         * Unsets the "ref" element
         */
        void unsetRef();
        
        /**
         * Gets the "map" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map getMap();
        
        /**
         * True if has "map" element
         */
        boolean isSetMap();
        
        /**
         * Sets the "map" element
         */
        void setMap(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map map);
        
        /**
         * Appends and returns a new empty "map" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map addNewMap();
        
        /**
         * Unsets the "map" element
         */
        void unsetMap();
        
        /**
         * Gets the "delta" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta getDelta();
        
        /**
         * True if has "delta" element
         */
        boolean isSetDelta();
        
        /**
         * Sets the "delta" element
         */
        void setDelta(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta delta);
        
        /**
         * Appends and returns a new empty "delta" element
         */
        gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta addNewDelta();
        
        /**
         * Unsets the "delta" element
         */
        void unsetDelta();
        
        /**
         * An XML seg(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seg extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seg003felemtype");
            
            /**
             * Gets the "Seg-ext" element
             */
            gov.nih.nlm.ncbi.www.SegExtDocument.SegExt getSegExt();
            
            /**
             * Sets the "Seg-ext" element
             */
            void setSegExt(gov.nih.nlm.ncbi.www.SegExtDocument.SegExt segExt);
            
            /**
             * Appends and returns a new empty "Seg-ext" element
             */
            gov.nih.nlm.ncbi.www.SegExtDocument.SegExt addNewSegExt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ref487delemtype");
            
            /**
             * Gets the "Ref-ext" element
             */
            gov.nih.nlm.ncbi.www.RefExtDocument.RefExt getRefExt();
            
            /**
             * Sets the "Ref-ext" element
             */
            void setRefExt(gov.nih.nlm.ncbi.www.RefExtDocument.RefExt refExt);
            
            /**
             * Appends and returns a new empty "Ref-ext" element
             */
            gov.nih.nlm.ncbi.www.RefExtDocument.RefExt addNewRefExt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML map(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Map extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Map.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("map1f46elemtype");
            
            /**
             * Gets the "Map-ext" element
             */
            gov.nih.nlm.ncbi.www.MapExtDocument.MapExt getMapExt();
            
            /**
             * Sets the "Map-ext" element
             */
            void setMapExt(gov.nih.nlm.ncbi.www.MapExtDocument.MapExt mapExt);
            
            /**
             * Appends and returns a new empty "Map-ext" element
             */
            gov.nih.nlm.ncbi.www.MapExtDocument.MapExt addNewMapExt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML delta(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Delta extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Delta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("delta13a2elemtype");
            
            /**
             * Gets the "Delta-ext" element
             */
            gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt getDeltaExt();
            
            /**
             * Sets the "Delta-ext" element
             */
            void setDeltaExt(gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt deltaExt);
            
            /**
             * Appends and returns a new empty "Delta-ext" element
             */
            gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt addNewDeltaExt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqExtDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqExtDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqExtDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
