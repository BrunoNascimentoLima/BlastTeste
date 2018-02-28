/*
 * An XML document type.
 * Localname: Int-fuzz
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IntFuzzDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Int-fuzz(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface IntFuzzDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntFuzzDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("intfuzz14cbdoctype");
    
    /**
     * Gets the "Int-fuzz" element
     */
    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz();
    
    /**
     * Sets the "Int-fuzz" element
     */
    void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz);
    
    /**
     * Appends and returns a new empty "Int-fuzz" element
     */
    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz();
    
    /**
     * An XML Int-fuzz(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface IntFuzz extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntFuzz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("intfuzz0882elemtype");
        
        /**
         * Gets the "p-m" element
         */
        java.math.BigInteger getPM();
        
        /**
         * Gets (as xml) the "p-m" element
         */
        org.apache.xmlbeans.XmlInteger xgetPM();
        
        /**
         * True if has "p-m" element
         */
        boolean isSetPM();
        
        /**
         * Sets the "p-m" element
         */
        void setPM(java.math.BigInteger pm);
        
        /**
         * Sets (as xml) the "p-m" element
         */
        void xsetPM(org.apache.xmlbeans.XmlInteger pm);
        
        /**
         * Unsets the "p-m" element
         */
        void unsetPM();
        
        /**
         * Gets the "range" element
         */
        gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range getRange();
        
        /**
         * True if has "range" element
         */
        boolean isSetRange();
        
        /**
         * Sets the "range" element
         */
        void setRange(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range range);
        
        /**
         * Appends and returns a new empty "range" element
         */
        gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range addNewRange();
        
        /**
         * Unsets the "range" element
         */
        void unsetRange();
        
        /**
         * Gets the "pct" element
         */
        java.math.BigInteger getPct();
        
        /**
         * Gets (as xml) the "pct" element
         */
        org.apache.xmlbeans.XmlInteger xgetPct();
        
        /**
         * True if has "pct" element
         */
        boolean isSetPct();
        
        /**
         * Sets the "pct" element
         */
        void setPct(java.math.BigInteger pct);
        
        /**
         * Sets (as xml) the "pct" element
         */
        void xsetPct(org.apache.xmlbeans.XmlInteger pct);
        
        /**
         * Unsets the "pct" element
         */
        void unsetPct();
        
        /**
         * Gets the "lim" element
         */
        gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim getLim();
        
        /**
         * True if has "lim" element
         */
        boolean isSetLim();
        
        /**
         * Sets the "lim" element
         */
        void setLim(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim lim);
        
        /**
         * Appends and returns a new empty "lim" element
         */
        gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim addNewLim();
        
        /**
         * Unsets the "lim" element
         */
        void unsetLim();
        
        /**
         * Gets array of all "alt" elements
         */
        java.math.BigInteger[] getAltArray();
        
        /**
         * Gets ith "alt" element
         */
        java.math.BigInteger getAltArray(int i);
        
        /**
         * Gets (as xml) array of all "alt" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetAltArray();
        
        /**
         * Gets (as xml) ith "alt" element
         */
        org.apache.xmlbeans.XmlInteger xgetAltArray(int i);
        
        /**
         * Returns number of "alt" element
         */
        int sizeOfAltArray();
        
        /**
         * Sets array of all "alt" element
         */
        void setAltArray(java.math.BigInteger[] altArray);
        
        /**
         * Sets ith "alt" element
         */
        void setAltArray(int i, java.math.BigInteger alt);
        
        /**
         * Sets (as xml) array of all "alt" element
         */
        void xsetAltArray(org.apache.xmlbeans.XmlInteger[] altArray);
        
        /**
         * Sets (as xml) ith "alt" element
         */
        void xsetAltArray(int i, org.apache.xmlbeans.XmlInteger alt);
        
        /**
         * Inserts the value as the ith "alt" element
         */
        void insertAlt(int i, java.math.BigInteger alt);
        
        /**
         * Appends the value as the last "alt" element
         */
        void addAlt(java.math.BigInteger alt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alt" element
         */
        org.apache.xmlbeans.XmlInteger insertNewAlt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alt" element
         */
        org.apache.xmlbeans.XmlInteger addNewAlt();
        
        /**
         * Removes the ith "alt" element
         */
        void removeAlt(int i);
        
        /**
         * An XML range(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Range extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Range.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rangebbebelemtype");
            
            /**
             * Gets the "max" element
             */
            java.math.BigInteger getMax();
            
            /**
             * Gets (as xml) the "max" element
             */
            org.apache.xmlbeans.XmlInteger xgetMax();
            
            /**
             * Sets the "max" element
             */
            void setMax(java.math.BigInteger max);
            
            /**
             * Sets (as xml) the "max" element
             */
            void xsetMax(org.apache.xmlbeans.XmlInteger max);
            
            /**
             * Gets the "min" element
             */
            java.math.BigInteger getMin();
            
            /**
             * Gets (as xml) the "min" element
             */
            org.apache.xmlbeans.XmlInteger xgetMin();
            
            /**
             * Sets the "min" element
             */
            void setMin(java.math.BigInteger min);
            
            /**
             * Sets (as xml) the "min" element
             */
            void xsetMin(org.apache.xmlbeans.XmlInteger min);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range newInstance() {
                  return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML lim(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Lim extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Lim.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("lim847eelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.IntFuzzDocument$IntFuzz$Lim$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value6057attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNK = Enum.forString("unk");
                static final Enum GT = Enum.forString("gt");
                static final Enum LT = Enum.forString("lt");
                static final Enum TR = Enum.forString("tr");
                static final Enum TL = Enum.forString("tl");
                static final Enum CIRCLE = Enum.forString("circle");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNK = Enum.INT_UNK;
                static final int INT_GT = Enum.INT_GT;
                static final int INT_LT = Enum.INT_LT;
                static final int INT_TR = Enum.INT_TR;
                static final int INT_TL = Enum.INT_TL;
                static final int INT_CIRCLE = Enum.INT_CIRCLE;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.IntFuzzDocument$IntFuzz$Lim$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_UNK
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
                    
                    static final int INT_UNK = 1;
                    static final int INT_GT = 2;
                    static final int INT_LT = 3;
                    static final int INT_TR = 4;
                    static final int INT_TL = 5;
                    static final int INT_CIRCLE = 6;
                    static final int INT_OTHER = 7;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unk", INT_UNK),
                        new Enum("gt", INT_GT),
                        new Enum("lt", INT_LT),
                        new Enum("tr", INT_TR),
                        new Enum("tl", INT_TL),
                        new Enum("circle", INT_CIRCLE),
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
                    public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim newInstance() {
                  return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz newInstance() {
              return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.IntFuzzDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.IntFuzzDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
