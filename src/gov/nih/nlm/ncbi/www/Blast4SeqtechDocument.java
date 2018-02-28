/*
 * An XML document type.
 * Localname: Blast4-seqtech
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SeqtechDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-seqtech(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4SeqtechDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4SeqtechDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4seqtech1602doctype");
    
    /**
     * Gets the "Blast4-seqtech" element
     */
    gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech getBlast4Seqtech();
    
    /**
     * Sets the "Blast4-seqtech" element
     */
    void setBlast4Seqtech(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech blast4Seqtech);
    
    /**
     * Appends and returns a new empty "Blast4-seqtech" element
     */
    gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech addNewBlast4Seqtech();
    
    /**
     * An XML Blast4-seqtech(@http://www.ncbi.nlm.nih.gov).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4SeqtechDocument$Blast4Seqtech.
     */
    public interface Blast4Seqtech extends org.apache.xmlbeans.XmlInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4Seqtech.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4seqtech2362elemtype");
        
        /**
         * Gets the "value" attribute
         */
        gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value.Enum getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value.Enum value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4SeqtechDocument$Blast4Seqtech$Value.
         */
        public interface Value extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuef87battrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum UNKNOWN = Enum.forString("unknown");
            static final Enum STANDARD = Enum.forString("standard");
            static final Enum EST = Enum.forString("est");
            static final Enum STS = Enum.forString("sts");
            static final Enum SURVEY = Enum.forString("survey");
            static final Enum GENEMAP = Enum.forString("genemap");
            static final Enum PHYSMAP = Enum.forString("physmap");
            static final Enum DERIVED = Enum.forString("derived");
            static final Enum CONCEPT_TRANS = Enum.forString("concept-trans");
            static final Enum SEQ_PEPT = Enum.forString("seq-pept");
            static final Enum BOTH = Enum.forString("both");
            static final Enum SEQ_PEPT_OVERLAP = Enum.forString("seq-pept-overlap");
            static final Enum SEQ_PEPT_HOMOL = Enum.forString("seq-pept-homol");
            static final Enum CONCEPT_TRANS_A = Enum.forString("concept-trans-a");
            static final Enum HTGS_1 = Enum.forString("htgs-1");
            static final Enum HTGS_2 = Enum.forString("htgs-2");
            static final Enum HTGS_3 = Enum.forString("htgs-3");
            static final Enum FLI_CDNA = Enum.forString("fli-cdna");
            static final Enum HTGS_0 = Enum.forString("htgs-0");
            static final Enum HTC = Enum.forString("htc");
            static final Enum WGS = Enum.forString("wgs");
            static final Enum OTHER = Enum.forString("other");
            
            static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
            static final int INT_STANDARD = Enum.INT_STANDARD;
            static final int INT_EST = Enum.INT_EST;
            static final int INT_STS = Enum.INT_STS;
            static final int INT_SURVEY = Enum.INT_SURVEY;
            static final int INT_GENEMAP = Enum.INT_GENEMAP;
            static final int INT_PHYSMAP = Enum.INT_PHYSMAP;
            static final int INT_DERIVED = Enum.INT_DERIVED;
            static final int INT_CONCEPT_TRANS = Enum.INT_CONCEPT_TRANS;
            static final int INT_SEQ_PEPT = Enum.INT_SEQ_PEPT;
            static final int INT_BOTH = Enum.INT_BOTH;
            static final int INT_SEQ_PEPT_OVERLAP = Enum.INT_SEQ_PEPT_OVERLAP;
            static final int INT_SEQ_PEPT_HOMOL = Enum.INT_SEQ_PEPT_HOMOL;
            static final int INT_CONCEPT_TRANS_A = Enum.INT_CONCEPT_TRANS_A;
            static final int INT_HTGS_1 = Enum.INT_HTGS_1;
            static final int INT_HTGS_2 = Enum.INT_HTGS_2;
            static final int INT_HTGS_3 = Enum.INT_HTGS_3;
            static final int INT_FLI_CDNA = Enum.INT_FLI_CDNA;
            static final int INT_HTGS_0 = Enum.INT_HTGS_0;
            static final int INT_HTC = Enum.INT_HTC;
            static final int INT_WGS = Enum.INT_WGS;
            static final int INT_OTHER = Enum.INT_OTHER;
            
            /**
             * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4SeqtechDocument$Blast4Seqtech$Value.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_UNKNOWN
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
                
                static final int INT_UNKNOWN = 1;
                static final int INT_STANDARD = 2;
                static final int INT_EST = 3;
                static final int INT_STS = 4;
                static final int INT_SURVEY = 5;
                static final int INT_GENEMAP = 6;
                static final int INT_PHYSMAP = 7;
                static final int INT_DERIVED = 8;
                static final int INT_CONCEPT_TRANS = 9;
                static final int INT_SEQ_PEPT = 10;
                static final int INT_BOTH = 11;
                static final int INT_SEQ_PEPT_OVERLAP = 12;
                static final int INT_SEQ_PEPT_HOMOL = 13;
                static final int INT_CONCEPT_TRANS_A = 14;
                static final int INT_HTGS_1 = 15;
                static final int INT_HTGS_2 = 16;
                static final int INT_HTGS_3 = 17;
                static final int INT_FLI_CDNA = 18;
                static final int INT_HTGS_0 = 19;
                static final int INT_HTC = 20;
                static final int INT_WGS = 21;
                static final int INT_OTHER = 22;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("unknown", INT_UNKNOWN),
                      new Enum("standard", INT_STANDARD),
                      new Enum("est", INT_EST),
                      new Enum("sts", INT_STS),
                      new Enum("survey", INT_SURVEY),
                      new Enum("genemap", INT_GENEMAP),
                      new Enum("physmap", INT_PHYSMAP),
                      new Enum("derived", INT_DERIVED),
                      new Enum("concept-trans", INT_CONCEPT_TRANS),
                      new Enum("seq-pept", INT_SEQ_PEPT),
                      new Enum("both", INT_BOTH),
                      new Enum("seq-pept-overlap", INT_SEQ_PEPT_OVERLAP),
                      new Enum("seq-pept-homol", INT_SEQ_PEPT_HOMOL),
                      new Enum("concept-trans-a", INT_CONCEPT_TRANS_A),
                      new Enum("htgs-1", INT_HTGS_1),
                      new Enum("htgs-2", INT_HTGS_2),
                      new Enum("htgs-3", INT_HTGS_3),
                      new Enum("fli-cdna", INT_FLI_CDNA),
                      new Enum("htgs-0", INT_HTGS_0),
                      new Enum("htc", INT_HTC),
                      new Enum("wgs", INT_WGS),
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
                public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value newValue(java.lang.Object obj) {
                  return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value) type.newValue( obj ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4SeqtechDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
