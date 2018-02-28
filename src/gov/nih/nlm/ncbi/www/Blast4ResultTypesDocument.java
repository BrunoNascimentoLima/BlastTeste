/*
 * An XML document type.
 * Localname: Blast4-result-types
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-result-types(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4ResultTypesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4ResultTypesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4resulttypes05c6doctype");
    
    /**
     * Gets the "Blast4-result-types" element
     */
    gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes getBlast4ResultTypes();
    
    /**
     * Sets the "Blast4-result-types" element
     */
    void setBlast4ResultTypes(gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes blast4ResultTypes);
    
    /**
     * Appends and returns a new empty "Blast4-result-types" element
     */
    gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes addNewBlast4ResultTypes();
    
    /**
     * An XML Blast4-result-types(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4ResultTypes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4ResultTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4resulttypes844celemtype");
        
        /**
         * Gets the "value" attribute
         */
        gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value.Enum getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value.Enum value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value value);
        
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument$Blast4ResultTypes$Value.
         */
        public interface Value extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value8e25attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum DEFAULT = Enum.forString("default");
            static final Enum ALIGNMENTS = Enum.forString("alignments");
            static final Enum PHI_ALIGNMENTS = Enum.forString("phi-alignments");
            static final Enum MASKS = Enum.forString("masks");
            static final Enum KA_BLOCKS = Enum.forString("ka-blocks");
            static final Enum SEARCH_STATS = Enum.forString("search-stats");
            static final Enum PSSM = Enum.forString("pssm");
            static final Enum SIMPLE_RESULTS = Enum.forString("simple-results");
            
            static final int INT_DEFAULT = Enum.INT_DEFAULT;
            static final int INT_ALIGNMENTS = Enum.INT_ALIGNMENTS;
            static final int INT_PHI_ALIGNMENTS = Enum.INT_PHI_ALIGNMENTS;
            static final int INT_MASKS = Enum.INT_MASKS;
            static final int INT_KA_BLOCKS = Enum.INT_KA_BLOCKS;
            static final int INT_SEARCH_STATS = Enum.INT_SEARCH_STATS;
            static final int INT_PSSM = Enum.INT_PSSM;
            static final int INT_SIMPLE_RESULTS = Enum.INT_SIMPLE_RESULTS;
            
            /**
             * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument$Blast4ResultTypes$Value.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DEFAULT
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_DEFAULT = 1;
                static final int INT_ALIGNMENTS = 2;
                static final int INT_PHI_ALIGNMENTS = 3;
                static final int INT_MASKS = 4;
                static final int INT_KA_BLOCKS = 5;
                static final int INT_SEARCH_STATS = 6;
                static final int INT_PSSM = 7;
                static final int INT_SIMPLE_RESULTS = 8;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("default", INT_DEFAULT),
                      new Enum("alignments", INT_ALIGNMENTS),
                      new Enum("phi-alignments", INT_PHI_ALIGNMENTS),
                      new Enum("masks", INT_MASKS),
                      new Enum("ka-blocks", INT_KA_BLOCKS),
                      new Enum("search-stats", INT_SEARCH_STATS),
                      new Enum("pssm", INT_PSSM),
                      new Enum("simple-results", INT_SIMPLE_RESULTS),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value newValue(java.lang.Object obj) {
                  return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value) type.newValue( obj ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
