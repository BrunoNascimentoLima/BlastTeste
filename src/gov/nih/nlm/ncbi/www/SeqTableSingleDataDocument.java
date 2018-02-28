/*
 * An XML document type.
 * Localname: SeqTable-single-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SeqTable-single-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqTableSingleDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableSingleDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablesingledata2dcfdoctype");
    
    /**
     * Gets the "SeqTable-single-data" element
     */
    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData getSeqTableSingleData();
    
    /**
     * Sets the "SeqTable-single-data" element
     */
    void setSeqTableSingleData(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData seqTableSingleData);
    
    /**
     * Appends and returns a new empty "SeqTable-single-data" element
     */
    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData addNewSeqTableSingleData();
    
    /**
     * An XML SeqTable-single-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqTableSingleData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableSingleData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablesingledata9002elemtype");
        
        /**
         * Gets the "int" element
         */
        java.math.BigInteger getInt();
        
        /**
         * Gets (as xml) the "int" element
         */
        org.apache.xmlbeans.XmlInteger xgetInt();
        
        /**
         * True if has "int" element
         */
        boolean isSetInt();
        
        /**
         * Sets the "int" element
         */
        void setInt(java.math.BigInteger xint);
        
        /**
         * Sets (as xml) the "int" element
         */
        void xsetInt(org.apache.xmlbeans.XmlInteger xint);
        
        /**
         * Unsets the "int" element
         */
        void unsetInt();
        
        /**
         * Gets the "real" element
         */
        double getReal();
        
        /**
         * Gets (as xml) the "real" element
         */
        org.apache.xmlbeans.XmlDouble xgetReal();
        
        /**
         * True if has "real" element
         */
        boolean isSetReal();
        
        /**
         * Sets the "real" element
         */
        void setReal(double real);
        
        /**
         * Sets (as xml) the "real" element
         */
        void xsetReal(org.apache.xmlbeans.XmlDouble real);
        
        /**
         * Unsets the "real" element
         */
        void unsetReal();
        
        /**
         * Gets the "string" element
         */
        java.lang.String getString();
        
        /**
         * Gets (as xml) the "string" element
         */
        org.apache.xmlbeans.XmlString xgetString();
        
        /**
         * True if has "string" element
         */
        boolean isSetString();
        
        /**
         * Sets the "string" element
         */
        void setString(java.lang.String string);
        
        /**
         * Sets (as xml) the "string" element
         */
        void xsetString(org.apache.xmlbeans.XmlString string);
        
        /**
         * Unsets the "string" element
         */
        void unsetString();
        
        /**
         * Gets the "bytes" element
         */
        byte[] getBytes();
        
        /**
         * Gets (as xml) the "bytes" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetBytes();
        
        /**
         * True if has "bytes" element
         */
        boolean isSetBytes();
        
        /**
         * Sets the "bytes" element
         */
        void setBytes(byte[] bytes);
        
        /**
         * Sets (as xml) the "bytes" element
         */
        void xsetBytes(org.apache.xmlbeans.XmlHexBinary bytes);
        
        /**
         * Unsets the "bytes" element
         */
        void unsetBytes();
        
        /**
         * Gets the "bit" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit getBit();
        
        /**
         * True if has "bit" element
         */
        boolean isSetBit();
        
        /**
         * Sets the "bit" element
         */
        void setBit(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit bit);
        
        /**
         * Appends and returns a new empty "bit" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit addNewBit();
        
        /**
         * Unsets the "bit" element
         */
        void unsetBit();
        
        /**
         * Gets the "loc" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc getLoc();
        
        /**
         * True if has "loc" element
         */
        boolean isSetLoc();
        
        /**
         * Sets the "loc" element
         */
        void setLoc(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc loc);
        
        /**
         * Appends and returns a new empty "loc" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc addNewLoc();
        
        /**
         * Unsets the "loc" element
         */
        void unsetLoc();
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "interval" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval getInterval();
        
        /**
         * True if has "interval" element
         */
        boolean isSetInterval();
        
        /**
         * Sets the "interval" element
         */
        void setInterval(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval interval);
        
        /**
         * Appends and returns a new empty "interval" element
         */
        gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval addNewInterval();
        
        /**
         * Unsets the "interval" element
         */
        void unsetInterval();
        
        /**
         * An XML bit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Bit extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bit123belemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument$SeqTableSingleData$Bit$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value3314attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument$SeqTableSingleData$Bit$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRUE
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
                    
                    static final int INT_TRUE = 1;
                    static final int INT_FALSE = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("true", INT_TRUE),
                        new Enum("false", INT_FALSE),
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
                    public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Loc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("loc3caeelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("idaef9elemtype");
            
            /**
             * Gets the "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
            
            /**
             * Sets the "Seq-id" element
             */
            void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML interval(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Interval extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Interval.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("interval5823elemtype");
            
            /**
             * Gets the "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqInterval();
            
            /**
             * Sets the "Seq-interval" element
             */
            void setSeqInterval(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval);
            
            /**
             * Appends and returns a new empty "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
