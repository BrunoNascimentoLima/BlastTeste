/*
 * An XML document type.
 * Localname: Num-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Num-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface NumRefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumRefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("numrefeb58doctype");
    
    /**
     * Gets the "Num-ref" element
     */
    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef getNumRef();
    
    /**
     * Sets the "Num-ref" element
     */
    void setNumRef(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef numRef);
    
    /**
     * Appends and returns a new empty "Num-ref" element
     */
    gov.nih.nlm.ncbi.www.NumRefDocument.NumRef addNewNumRef();
    
    /**
     * An XML Num-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface NumRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("numref7370elemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type addNewType();
        
        /**
         * Gets the "aligns" element
         */
        gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns getAligns();
        
        /**
         * True if has "aligns" element
         */
        boolean isSetAligns();
        
        /**
         * Sets the "aligns" element
         */
        void setAligns(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns aligns);
        
        /**
         * Appends and returns a new empty "aligns" element
         */
        gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns addNewAligns();
        
        /**
         * Unsets the "aligns" element
         */
        void unsetAligns();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Type extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("typebb46elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.NumRefDocument$NumRef$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value804dattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum SOURCES = Enum.forString("sources");
                static final Enum ALIGNS = Enum.forString("aligns");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_SOURCES = Enum.INT_SOURCES;
                static final int INT_ALIGNS = Enum.INT_ALIGNS;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.NumRefDocument$NumRef$Type$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_NOT_SET
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
                    
                    static final int INT_NOT_SET = 1;
                    static final int INT_SOURCES = 2;
                    static final int INT_ALIGNS = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("sources", INT_SOURCES),
                        new Enum("aligns", INT_ALIGNS),
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
                    public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML aligns(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Aligns extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aligns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("aligns381aelemtype");
            
            /**
             * Gets the "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlign();
            
            /**
             * Sets the "Seq-align" element
             */
            void setSeqAlign(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign);
            
            /**
             * Appends and returns a new empty "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns newInstance() {
                  return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef.Aligns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef newInstance() {
              return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.NumRefDocument.NumRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.NumRefDocument.NumRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.NumRefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.NumRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.NumRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
