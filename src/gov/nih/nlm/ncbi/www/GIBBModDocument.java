/*
 * An XML document type.
 * Localname: GIBB-mod
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GIBBModDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one GIBB-mod(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface GIBBModDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GIBBModDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gibbmod8d95doctype");
    
    /**
     * Gets the "GIBB-mod" element
     */
    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod getGIBBMod();
    
    /**
     * Sets the "GIBB-mod" element
     */
    void setGIBBMod(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod gibbMod);
    
    /**
     * Appends and returns a new empty "GIBB-mod" element
     */
    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod addNewGIBBMod();
    
    /**
     * An XML GIBB-mod(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface GIBBMod extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GIBBMod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gibbmod8642elemtype");
        
        /**
         * Gets the "value" attribute
         */
        gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value.Enum getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value.Enum value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value value);
        
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GIBBModDocument$GIBBMod$Value.
         */
        public interface Value extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value78dbattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum DNA = Enum.forString("dna");
            static final Enum RNA = Enum.forString("rna");
            static final Enum EXTRACHROM = Enum.forString("extrachrom");
            static final Enum PLASMID = Enum.forString("plasmid");
            static final Enum MITOCHONDRIAL = Enum.forString("mitochondrial");
            static final Enum CHLOROPLAST = Enum.forString("chloroplast");
            static final Enum KINETOPLAST = Enum.forString("kinetoplast");
            static final Enum CYANELLE = Enum.forString("cyanelle");
            static final Enum SYNTHETIC = Enum.forString("synthetic");
            static final Enum RECOMBINANT = Enum.forString("recombinant");
            static final Enum PARTIAL = Enum.forString("partial");
            static final Enum COMPLETE = Enum.forString("complete");
            static final Enum MUTAGEN = Enum.forString("mutagen");
            static final Enum NATMUT = Enum.forString("natmut");
            static final Enum TRANSPOSON = Enum.forString("transposon");
            static final Enum INSERTION_SEQ = Enum.forString("insertion-seq");
            static final Enum NO_LEFT = Enum.forString("no-left");
            static final Enum NO_RIGHT = Enum.forString("no-right");
            static final Enum MACRONUCLEAR = Enum.forString("macronuclear");
            static final Enum PROVIRAL = Enum.forString("proviral");
            static final Enum EST = Enum.forString("est");
            static final Enum STS = Enum.forString("sts");
            static final Enum SURVEY = Enum.forString("survey");
            static final Enum CHROMOPLAST = Enum.forString("chromoplast");
            static final Enum GENEMAP = Enum.forString("genemap");
            static final Enum RESTMAP = Enum.forString("restmap");
            static final Enum PHYSMAP = Enum.forString("physmap");
            static final Enum OTHER = Enum.forString("other");
            
            static final int INT_DNA = Enum.INT_DNA;
            static final int INT_RNA = Enum.INT_RNA;
            static final int INT_EXTRACHROM = Enum.INT_EXTRACHROM;
            static final int INT_PLASMID = Enum.INT_PLASMID;
            static final int INT_MITOCHONDRIAL = Enum.INT_MITOCHONDRIAL;
            static final int INT_CHLOROPLAST = Enum.INT_CHLOROPLAST;
            static final int INT_KINETOPLAST = Enum.INT_KINETOPLAST;
            static final int INT_CYANELLE = Enum.INT_CYANELLE;
            static final int INT_SYNTHETIC = Enum.INT_SYNTHETIC;
            static final int INT_RECOMBINANT = Enum.INT_RECOMBINANT;
            static final int INT_PARTIAL = Enum.INT_PARTIAL;
            static final int INT_COMPLETE = Enum.INT_COMPLETE;
            static final int INT_MUTAGEN = Enum.INT_MUTAGEN;
            static final int INT_NATMUT = Enum.INT_NATMUT;
            static final int INT_TRANSPOSON = Enum.INT_TRANSPOSON;
            static final int INT_INSERTION_SEQ = Enum.INT_INSERTION_SEQ;
            static final int INT_NO_LEFT = Enum.INT_NO_LEFT;
            static final int INT_NO_RIGHT = Enum.INT_NO_RIGHT;
            static final int INT_MACRONUCLEAR = Enum.INT_MACRONUCLEAR;
            static final int INT_PROVIRAL = Enum.INT_PROVIRAL;
            static final int INT_EST = Enum.INT_EST;
            static final int INT_STS = Enum.INT_STS;
            static final int INT_SURVEY = Enum.INT_SURVEY;
            static final int INT_CHROMOPLAST = Enum.INT_CHROMOPLAST;
            static final int INT_GENEMAP = Enum.INT_GENEMAP;
            static final int INT_RESTMAP = Enum.INT_RESTMAP;
            static final int INT_PHYSMAP = Enum.INT_PHYSMAP;
            static final int INT_OTHER = Enum.INT_OTHER;
            
            /**
             * Enumeration value class for gov.nih.nlm.ncbi.www.GIBBModDocument$GIBBMod$Value.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DNA
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
                
                static final int INT_DNA = 1;
                static final int INT_RNA = 2;
                static final int INT_EXTRACHROM = 3;
                static final int INT_PLASMID = 4;
                static final int INT_MITOCHONDRIAL = 5;
                static final int INT_CHLOROPLAST = 6;
                static final int INT_KINETOPLAST = 7;
                static final int INT_CYANELLE = 8;
                static final int INT_SYNTHETIC = 9;
                static final int INT_RECOMBINANT = 10;
                static final int INT_PARTIAL = 11;
                static final int INT_COMPLETE = 12;
                static final int INT_MUTAGEN = 13;
                static final int INT_NATMUT = 14;
                static final int INT_TRANSPOSON = 15;
                static final int INT_INSERTION_SEQ = 16;
                static final int INT_NO_LEFT = 17;
                static final int INT_NO_RIGHT = 18;
                static final int INT_MACRONUCLEAR = 19;
                static final int INT_PROVIRAL = 20;
                static final int INT_EST = 21;
                static final int INT_STS = 22;
                static final int INT_SURVEY = 23;
                static final int INT_CHROMOPLAST = 24;
                static final int INT_GENEMAP = 25;
                static final int INT_RESTMAP = 26;
                static final int INT_PHYSMAP = 27;
                static final int INT_OTHER = 28;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("dna", INT_DNA),
                      new Enum("rna", INT_RNA),
                      new Enum("extrachrom", INT_EXTRACHROM),
                      new Enum("plasmid", INT_PLASMID),
                      new Enum("mitochondrial", INT_MITOCHONDRIAL),
                      new Enum("chloroplast", INT_CHLOROPLAST),
                      new Enum("kinetoplast", INT_KINETOPLAST),
                      new Enum("cyanelle", INT_CYANELLE),
                      new Enum("synthetic", INT_SYNTHETIC),
                      new Enum("recombinant", INT_RECOMBINANT),
                      new Enum("partial", INT_PARTIAL),
                      new Enum("complete", INT_COMPLETE),
                      new Enum("mutagen", INT_MUTAGEN),
                      new Enum("natmut", INT_NATMUT),
                      new Enum("transposon", INT_TRANSPOSON),
                      new Enum("insertion-seq", INT_INSERTION_SEQ),
                      new Enum("no-left", INT_NO_LEFT),
                      new Enum("no-right", INT_NO_RIGHT),
                      new Enum("macronuclear", INT_MACRONUCLEAR),
                      new Enum("proviral", INT_PROVIRAL),
                      new Enum("est", INT_EST),
                      new Enum("sts", INT_STS),
                      new Enum("survey", INT_SURVEY),
                      new Enum("chromoplast", INT_CHROMOPLAST),
                      new Enum("genemap", INT_GENEMAP),
                      new Enum("restmap", INT_RESTMAP),
                      new Enum("physmap", INT_PHYSMAP),
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
                public static gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value newValue(java.lang.Object obj) {
                  return (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value) type.newValue( obj ); }
                
                public static gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value newInstance() {
                  return (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod newInstance() {
              return (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.GIBBModDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GIBBModDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GIBBModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
