/*
 * An XML document type.
 * Localname: SeqTable-column-info
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SeqTable-column-info(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqTableColumnInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableColumnInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablecolumninfoff85doctype");
    
    /**
     * Gets the "SeqTable-column-info" element
     */
    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo getSeqTableColumnInfo();
    
    /**
     * Sets the "SeqTable-column-info" element
     */
    void setSeqTableColumnInfo(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo seqTableColumnInfo);
    
    /**
     * Appends and returns a new empty "SeqTable-column-info" element
     */
    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo addNewSeqTableColumnInfo();
    
    /**
     * An XML SeqTable-column-info(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqTableColumnInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableColumnInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablecolumninfo0342elemtype");
        
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
         * Gets the "field-id" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId getFieldId();
        
        /**
         * True if has "field-id" element
         */
        boolean isSetFieldId();
        
        /**
         * Sets the "field-id" element
         */
        void setFieldId(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId fieldId);
        
        /**
         * Appends and returns a new empty "field-id" element
         */
        gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId addNewFieldId();
        
        /**
         * Unsets the "field-id" element
         */
        void unsetFieldId();
        
        /**
         * Gets the "field-name" element
         */
        java.lang.String getFieldName();
        
        /**
         * Gets (as xml) the "field-name" element
         */
        org.apache.xmlbeans.XmlString xgetFieldName();
        
        /**
         * True if has "field-name" element
         */
        boolean isSetFieldName();
        
        /**
         * Sets the "field-name" element
         */
        void setFieldName(java.lang.String fieldName);
        
        /**
         * Sets (as xml) the "field-name" element
         */
        void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
        
        /**
         * Unsets the "field-name" element
         */
        void unsetFieldName();
        
        /**
         * An XML field-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument$SeqTableColumnInfo$FieldId.
         */
        public interface FieldId extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FieldId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fieldida22celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument$SeqTableColumnInfo$FieldId$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value20f3attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum LOCATION = Enum.forString("location");
                static final Enum LOCATION_ID = Enum.forString("location-id");
                static final Enum LOCATION_GI = Enum.forString("location-gi");
                static final Enum LOCATION_FROM = Enum.forString("location-from");
                static final Enum LOCATION_TO = Enum.forString("location-to");
                static final Enum LOCATION_STRAND = Enum.forString("location-strand");
                static final Enum LOCATION_FUZZ_FROM_LIM = Enum.forString("location-fuzz-from-lim");
                static final Enum LOCATION_FUZZ_TO_LIM = Enum.forString("location-fuzz-to-lim");
                static final Enum PRODUCT = Enum.forString("product");
                static final Enum PRODUCT_ID = Enum.forString("product-id");
                static final Enum PRODUCT_GI = Enum.forString("product-gi");
                static final Enum PRODUCT_FROM = Enum.forString("product-from");
                static final Enum PRODUCT_TO = Enum.forString("product-to");
                static final Enum PRODUCT_STRAND = Enum.forString("product-strand");
                static final Enum PRODUCT_FUZZ_FROM_LIM = Enum.forString("product-fuzz-from-lim");
                static final Enum PRODUCT_FUZZ_TO_LIM = Enum.forString("product-fuzz-to-lim");
                static final Enum ID_LOCAL = Enum.forString("id-local");
                static final Enum XREF_ID_LOCAL = Enum.forString("xref-id-local");
                static final Enum PARTIAL = Enum.forString("partial");
                static final Enum COMMENT = Enum.forString("comment");
                static final Enum TITLE = Enum.forString("title");
                static final Enum EXT = Enum.forString("ext");
                static final Enum QUAL = Enum.forString("qual");
                static final Enum DBXREF = Enum.forString("dbxref");
                static final Enum DATA_IMP_KEY = Enum.forString("data-imp-key");
                static final Enum DATA_REGION = Enum.forString("data-region");
                static final Enum DATA_CDREGION_FRAME = Enum.forString("data-cdregion-frame");
                static final Enum EXT_TYPE = Enum.forString("ext-type");
                static final Enum QUAL_QUAL = Enum.forString("qual-qual");
                static final Enum QUAL_VAL = Enum.forString("qual-val");
                static final Enum DBXREF_DB = Enum.forString("dbxref-db");
                static final Enum DBXREF_TAG = Enum.forString("dbxref-tag");
                
                static final int INT_LOCATION = Enum.INT_LOCATION;
                static final int INT_LOCATION_ID = Enum.INT_LOCATION_ID;
                static final int INT_LOCATION_GI = Enum.INT_LOCATION_GI;
                static final int INT_LOCATION_FROM = Enum.INT_LOCATION_FROM;
                static final int INT_LOCATION_TO = Enum.INT_LOCATION_TO;
                static final int INT_LOCATION_STRAND = Enum.INT_LOCATION_STRAND;
                static final int INT_LOCATION_FUZZ_FROM_LIM = Enum.INT_LOCATION_FUZZ_FROM_LIM;
                static final int INT_LOCATION_FUZZ_TO_LIM = Enum.INT_LOCATION_FUZZ_TO_LIM;
                static final int INT_PRODUCT = Enum.INT_PRODUCT;
                static final int INT_PRODUCT_ID = Enum.INT_PRODUCT_ID;
                static final int INT_PRODUCT_GI = Enum.INT_PRODUCT_GI;
                static final int INT_PRODUCT_FROM = Enum.INT_PRODUCT_FROM;
                static final int INT_PRODUCT_TO = Enum.INT_PRODUCT_TO;
                static final int INT_PRODUCT_STRAND = Enum.INT_PRODUCT_STRAND;
                static final int INT_PRODUCT_FUZZ_FROM_LIM = Enum.INT_PRODUCT_FUZZ_FROM_LIM;
                static final int INT_PRODUCT_FUZZ_TO_LIM = Enum.INT_PRODUCT_FUZZ_TO_LIM;
                static final int INT_ID_LOCAL = Enum.INT_ID_LOCAL;
                static final int INT_XREF_ID_LOCAL = Enum.INT_XREF_ID_LOCAL;
                static final int INT_PARTIAL = Enum.INT_PARTIAL;
                static final int INT_COMMENT = Enum.INT_COMMENT;
                static final int INT_TITLE = Enum.INT_TITLE;
                static final int INT_EXT = Enum.INT_EXT;
                static final int INT_QUAL = Enum.INT_QUAL;
                static final int INT_DBXREF = Enum.INT_DBXREF;
                static final int INT_DATA_IMP_KEY = Enum.INT_DATA_IMP_KEY;
                static final int INT_DATA_REGION = Enum.INT_DATA_REGION;
                static final int INT_DATA_CDREGION_FRAME = Enum.INT_DATA_CDREGION_FRAME;
                static final int INT_EXT_TYPE = Enum.INT_EXT_TYPE;
                static final int INT_QUAL_QUAL = Enum.INT_QUAL_QUAL;
                static final int INT_QUAL_VAL = Enum.INT_QUAL_VAL;
                static final int INT_DBXREF_DB = Enum.INT_DBXREF_DB;
                static final int INT_DBXREF_TAG = Enum.INT_DBXREF_TAG;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument$SeqTableColumnInfo$FieldId$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_LOCATION
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
                    
                    static final int INT_LOCATION = 1;
                    static final int INT_LOCATION_ID = 2;
                    static final int INT_LOCATION_GI = 3;
                    static final int INT_LOCATION_FROM = 4;
                    static final int INT_LOCATION_TO = 5;
                    static final int INT_LOCATION_STRAND = 6;
                    static final int INT_LOCATION_FUZZ_FROM_LIM = 7;
                    static final int INT_LOCATION_FUZZ_TO_LIM = 8;
                    static final int INT_PRODUCT = 9;
                    static final int INT_PRODUCT_ID = 10;
                    static final int INT_PRODUCT_GI = 11;
                    static final int INT_PRODUCT_FROM = 12;
                    static final int INT_PRODUCT_TO = 13;
                    static final int INT_PRODUCT_STRAND = 14;
                    static final int INT_PRODUCT_FUZZ_FROM_LIM = 15;
                    static final int INT_PRODUCT_FUZZ_TO_LIM = 16;
                    static final int INT_ID_LOCAL = 17;
                    static final int INT_XREF_ID_LOCAL = 18;
                    static final int INT_PARTIAL = 19;
                    static final int INT_COMMENT = 20;
                    static final int INT_TITLE = 21;
                    static final int INT_EXT = 22;
                    static final int INT_QUAL = 23;
                    static final int INT_DBXREF = 24;
                    static final int INT_DATA_IMP_KEY = 25;
                    static final int INT_DATA_REGION = 26;
                    static final int INT_DATA_CDREGION_FRAME = 27;
                    static final int INT_EXT_TYPE = 28;
                    static final int INT_QUAL_QUAL = 29;
                    static final int INT_QUAL_VAL = 30;
                    static final int INT_DBXREF_DB = 31;
                    static final int INT_DBXREF_TAG = 32;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("location", INT_LOCATION),
                        new Enum("location-id", INT_LOCATION_ID),
                        new Enum("location-gi", INT_LOCATION_GI),
                        new Enum("location-from", INT_LOCATION_FROM),
                        new Enum("location-to", INT_LOCATION_TO),
                        new Enum("location-strand", INT_LOCATION_STRAND),
                        new Enum("location-fuzz-from-lim", INT_LOCATION_FUZZ_FROM_LIM),
                        new Enum("location-fuzz-to-lim", INT_LOCATION_FUZZ_TO_LIM),
                        new Enum("product", INT_PRODUCT),
                        new Enum("product-id", INT_PRODUCT_ID),
                        new Enum("product-gi", INT_PRODUCT_GI),
                        new Enum("product-from", INT_PRODUCT_FROM),
                        new Enum("product-to", INT_PRODUCT_TO),
                        new Enum("product-strand", INT_PRODUCT_STRAND),
                        new Enum("product-fuzz-from-lim", INT_PRODUCT_FUZZ_FROM_LIM),
                        new Enum("product-fuzz-to-lim", INT_PRODUCT_FUZZ_TO_LIM),
                        new Enum("id-local", INT_ID_LOCAL),
                        new Enum("xref-id-local", INT_XREF_ID_LOCAL),
                        new Enum("partial", INT_PARTIAL),
                        new Enum("comment", INT_COMMENT),
                        new Enum("title", INT_TITLE),
                        new Enum("ext", INT_EXT),
                        new Enum("qual", INT_QUAL),
                        new Enum("dbxref", INT_DBXREF),
                        new Enum("data-imp-key", INT_DATA_IMP_KEY),
                        new Enum("data-region", INT_DATA_REGION),
                        new Enum("data-cdregion-frame", INT_DATA_CDREGION_FRAME),
                        new Enum("ext-type", INT_EXT_TYPE),
                        new Enum("qual-qual", INT_QUAL_QUAL),
                        new Enum("qual-val", INT_QUAL_VAL),
                        new Enum("dbxref-db", INT_DBXREF_DB),
                        new Enum("dbxref-tag", INT_DBXREF_TAG),
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
                    public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo.FieldId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
