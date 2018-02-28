/*
 * An XML document type.
 * Localname: BlockProperty
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BlockPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one BlockProperty(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface BlockPropertyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BlockPropertyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blockproperty70cedoctype");
    
    /**
     * Gets the "BlockProperty" element
     */
    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty getBlockProperty();
    
    /**
     * Sets the "BlockProperty" element
     */
    void setBlockProperty(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty blockProperty);
    
    /**
     * Appends and returns a new empty "BlockProperty" element
     */
    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty addNewBlockProperty();
    
    /**
     * An XML BlockProperty(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface BlockProperty extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BlockProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blockproperty7b9celemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type addNewType();
        
        /**
         * Gets the "intvalue" element
         */
        java.math.BigInteger getIntvalue();
        
        /**
         * Gets (as xml) the "intvalue" element
         */
        org.apache.xmlbeans.XmlInteger xgetIntvalue();
        
        /**
         * True if has "intvalue" element
         */
        boolean isSetIntvalue();
        
        /**
         * Sets the "intvalue" element
         */
        void setIntvalue(java.math.BigInteger intvalue);
        
        /**
         * Sets (as xml) the "intvalue" element
         */
        void xsetIntvalue(org.apache.xmlbeans.XmlInteger intvalue);
        
        /**
         * Unsets the "intvalue" element
         */
        void unsetIntvalue();
        
        /**
         * Gets the "textvalue" element
         */
        java.lang.String getTextvalue();
        
        /**
         * Gets (as xml) the "textvalue" element
         */
        org.apache.xmlbeans.XmlString xgetTextvalue();
        
        /**
         * True if has "textvalue" element
         */
        boolean isSetTextvalue();
        
        /**
         * Sets the "textvalue" element
         */
        void setTextvalue(java.lang.String textvalue);
        
        /**
         * Sets (as xml) the "textvalue" element
         */
        void xsetTextvalue(org.apache.xmlbeans.XmlString textvalue);
        
        /**
         * Unsets the "textvalue" element
         */
        void unsetTextvalue();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BlockPropertyDocument$BlockProperty$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("typeb272elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BlockPropertyDocument$BlockProperty$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value24f9attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNASSIGNED = Enum.forString("unassigned");
                static final Enum THRESHOLD = Enum.forString("threshold");
                static final Enum MINSCORE = Enum.forString("minscore");
                static final Enum MAXSCORE = Enum.forString("maxscore");
                static final Enum MEANSCORE = Enum.forString("meanscore");
                static final Enum VARIANCE = Enum.forString("variance");
                static final Enum NAME = Enum.forString("name");
                static final Enum IS_OPTIONAL = Enum.forString("is-optional");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNASSIGNED = Enum.INT_UNASSIGNED;
                static final int INT_THRESHOLD = Enum.INT_THRESHOLD;
                static final int INT_MINSCORE = Enum.INT_MINSCORE;
                static final int INT_MAXSCORE = Enum.INT_MAXSCORE;
                static final int INT_MEANSCORE = Enum.INT_MEANSCORE;
                static final int INT_VARIANCE = Enum.INT_VARIANCE;
                static final int INT_NAME = Enum.INT_NAME;
                static final int INT_IS_OPTIONAL = Enum.INT_IS_OPTIONAL;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.BlockPropertyDocument$BlockProperty$Type$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_UNASSIGNED
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
                    
                    static final int INT_UNASSIGNED = 1;
                    static final int INT_THRESHOLD = 2;
                    static final int INT_MINSCORE = 3;
                    static final int INT_MAXSCORE = 4;
                    static final int INT_MEANSCORE = 5;
                    static final int INT_VARIANCE = 6;
                    static final int INT_NAME = 7;
                    static final int INT_IS_OPTIONAL = 8;
                    static final int INT_OTHER = 9;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unassigned", INT_UNASSIGNED),
                        new Enum("threshold", INT_THRESHOLD),
                        new Enum("minscore", INT_MINSCORE),
                        new Enum("maxscore", INT_MAXSCORE),
                        new Enum("meanscore", INT_MEANSCORE),
                        new Enum("variance", INT_VARIANCE),
                        new Enum("name", INT_NAME),
                        new Enum("is-optional", INT_IS_OPTIONAL),
                        new Enum("other", INT_OTHER),
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
                    public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty newInstance() {
              return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BlockPropertyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BlockPropertyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
