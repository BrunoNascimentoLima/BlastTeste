/*
 * An XML document type.
 * Localname: EMBL-dbname
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EMBLDbnameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one EMBL-dbname(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface EMBLDbnameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMBLDbnameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("embldbnameb570doctype");
    
    /**
     * Gets the "EMBL-dbname" element
     */
    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname getEMBLDbname();
    
    /**
     * Sets the "EMBL-dbname" element
     */
    void setEMBLDbname(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname emblDbname);
    
    /**
     * Appends and returns a new empty "EMBL-dbname" element
     */
    gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname addNewEMBLDbname();
    
    /**
     * An XML EMBL-dbname(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface EMBLDbname extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMBLDbname.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("embldbnamee920elemtype");
        
        /**
         * Gets the "code" element
         */
        gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code getCode();
        
        /**
         * True if has "code" element
         */
        boolean isSetCode();
        
        /**
         * Sets the "code" element
         */
        void setCode(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code code);
        
        /**
         * Appends and returns a new empty "code" element
         */
        gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code addNewCode();
        
        /**
         * Unsets the "code" element
         */
        void unsetCode();
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * An XML code(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Code extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("code64a9elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EMBLDbnameDocument$EMBLDbname$Code$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value32b0attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum EMBL = Enum.forString("embl");
                static final Enum GENBANK = Enum.forString("genbank");
                static final Enum DDBJ = Enum.forString("ddbj");
                static final Enum GENINFO = Enum.forString("geninfo");
                static final Enum MEDLINE = Enum.forString("medline");
                static final Enum SWISSPROT = Enum.forString("swissprot");
                static final Enum PIR = Enum.forString("pir");
                static final Enum PDB = Enum.forString("pdb");
                static final Enum EPD = Enum.forString("epd");
                static final Enum ECD = Enum.forString("ecd");
                static final Enum TFD = Enum.forString("tfd");
                static final Enum FLYBASE = Enum.forString("flybase");
                static final Enum PROSITE = Enum.forString("prosite");
                static final Enum ENZYME = Enum.forString("enzyme");
                static final Enum MIM = Enum.forString("mim");
                static final Enum ECOSEQ = Enum.forString("ecoseq");
                static final Enum HIV = Enum.forString("hiv");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_EMBL = Enum.INT_EMBL;
                static final int INT_GENBANK = Enum.INT_GENBANK;
                static final int INT_DDBJ = Enum.INT_DDBJ;
                static final int INT_GENINFO = Enum.INT_GENINFO;
                static final int INT_MEDLINE = Enum.INT_MEDLINE;
                static final int INT_SWISSPROT = Enum.INT_SWISSPROT;
                static final int INT_PIR = Enum.INT_PIR;
                static final int INT_PDB = Enum.INT_PDB;
                static final int INT_EPD = Enum.INT_EPD;
                static final int INT_ECD = Enum.INT_ECD;
                static final int INT_TFD = Enum.INT_TFD;
                static final int INT_FLYBASE = Enum.INT_FLYBASE;
                static final int INT_PROSITE = Enum.INT_PROSITE;
                static final int INT_ENZYME = Enum.INT_ENZYME;
                static final int INT_MIM = Enum.INT_MIM;
                static final int INT_ECOSEQ = Enum.INT_ECOSEQ;
                static final int INT_HIV = Enum.INT_HIV;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.EMBLDbnameDocument$EMBLDbname$Code$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_EMBL
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
                    
                    static final int INT_EMBL = 1;
                    static final int INT_GENBANK = 2;
                    static final int INT_DDBJ = 3;
                    static final int INT_GENINFO = 4;
                    static final int INT_MEDLINE = 5;
                    static final int INT_SWISSPROT = 6;
                    static final int INT_PIR = 7;
                    static final int INT_PDB = 8;
                    static final int INT_EPD = 9;
                    static final int INT_ECD = 10;
                    static final int INT_TFD = 11;
                    static final int INT_FLYBASE = 12;
                    static final int INT_PROSITE = 13;
                    static final int INT_ENZYME = 14;
                    static final int INT_MIM = 15;
                    static final int INT_ECOSEQ = 16;
                    static final int INT_HIV = 17;
                    static final int INT_OTHER = 18;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("embl", INT_EMBL),
                        new Enum("genbank", INT_GENBANK),
                        new Enum("ddbj", INT_DDBJ),
                        new Enum("geninfo", INT_GENINFO),
                        new Enum("medline", INT_MEDLINE),
                        new Enum("swissprot", INT_SWISSPROT),
                        new Enum("pir", INT_PIR),
                        new Enum("pdb", INT_PDB),
                        new Enum("epd", INT_EPD),
                        new Enum("ecd", INT_ECD),
                        new Enum("tfd", INT_TFD),
                        new Enum("flybase", INT_FLYBASE),
                        new Enum("prosite", INT_PROSITE),
                        new Enum("enzyme", INT_ENZYME),
                        new Enum("mim", INT_MIM),
                        new Enum("ecoseq", INT_ECOSEQ),
                        new Enum("hiv", INT_HIV),
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
                    public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code newInstance() {
                  return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname newInstance() {
              return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument.EMBLDbname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.EMBLDbnameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.EMBLDbnameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
