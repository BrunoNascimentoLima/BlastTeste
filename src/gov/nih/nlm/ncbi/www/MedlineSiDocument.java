/*
 * An XML document type.
 * Localname: Medline-si
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineSiDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Medline-si(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface MedlineSiDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedlineSiDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medlinesid9a1doctype");
    
    /**
     * Gets the "Medline-si" element
     */
    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi getMedlineSi();
    
    /**
     * Sets the "Medline-si" element
     */
    void setMedlineSi(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi medlineSi);
    
    /**
     * Appends and returns a new empty "Medline-si" element
     */
    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi addNewMedlineSi();
    
    /**
     * An XML Medline-si(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface MedlineSi extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedlineSi.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medlinesi9642elemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type addNewType();
        
        /**
         * Gets the "cit" element
         */
        java.lang.String getCit();
        
        /**
         * Gets (as xml) the "cit" element
         */
        org.apache.xmlbeans.XmlString xgetCit();
        
        /**
         * True if has "cit" element
         */
        boolean isSetCit();
        
        /**
         * Sets the "cit" element
         */
        void setCit(java.lang.String cit);
        
        /**
         * Sets (as xml) the "cit" element
         */
        void xsetCit(org.apache.xmlbeans.XmlString cit);
        
        /**
         * Unsets the "cit" element
         */
        void unsetCit();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Type extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("type2598elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineSiDocument$MedlineSi$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuec95fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum DDBJ = Enum.forString("ddbj");
                static final Enum CARBBANK = Enum.forString("carbbank");
                static final Enum EMBL = Enum.forString("embl");
                static final Enum HDB = Enum.forString("hdb");
                static final Enum GENBANK = Enum.forString("genbank");
                static final Enum HGML = Enum.forString("hgml");
                static final Enum MIM = Enum.forString("mim");
                static final Enum MSD = Enum.forString("msd");
                static final Enum PDB = Enum.forString("pdb");
                static final Enum PIR = Enum.forString("pir");
                static final Enum PRFSEQDB = Enum.forString("prfseqdb");
                static final Enum PSD = Enum.forString("psd");
                static final Enum SWISSPROT = Enum.forString("swissprot");
                static final Enum GDB = Enum.forString("gdb");
                
                static final int INT_DDBJ = Enum.INT_DDBJ;
                static final int INT_CARBBANK = Enum.INT_CARBBANK;
                static final int INT_EMBL = Enum.INT_EMBL;
                static final int INT_HDB = Enum.INT_HDB;
                static final int INT_GENBANK = Enum.INT_GENBANK;
                static final int INT_HGML = Enum.INT_HGML;
                static final int INT_MIM = Enum.INT_MIM;
                static final int INT_MSD = Enum.INT_MSD;
                static final int INT_PDB = Enum.INT_PDB;
                static final int INT_PIR = Enum.INT_PIR;
                static final int INT_PRFSEQDB = Enum.INT_PRFSEQDB;
                static final int INT_PSD = Enum.INT_PSD;
                static final int INT_SWISSPROT = Enum.INT_SWISSPROT;
                static final int INT_GDB = Enum.INT_GDB;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.MedlineSiDocument$MedlineSi$Type$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_DDBJ
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
                    
                    static final int INT_DDBJ = 1;
                    static final int INT_CARBBANK = 2;
                    static final int INT_EMBL = 3;
                    static final int INT_HDB = 4;
                    static final int INT_GENBANK = 5;
                    static final int INT_HGML = 6;
                    static final int INT_MIM = 7;
                    static final int INT_MSD = 8;
                    static final int INT_PDB = 9;
                    static final int INT_PIR = 10;
                    static final int INT_PRFSEQDB = 11;
                    static final int INT_PSD = 12;
                    static final int INT_SWISSPROT = 13;
                    static final int INT_GDB = 14;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("ddbj", INT_DDBJ),
                        new Enum("carbbank", INT_CARBBANK),
                        new Enum("embl", INT_EMBL),
                        new Enum("hdb", INT_HDB),
                        new Enum("genbank", INT_GENBANK),
                        new Enum("hgml", INT_HGML),
                        new Enum("mim", INT_MIM),
                        new Enum("msd", INT_MSD),
                        new Enum("pdb", INT_PDB),
                        new Enum("pir", INT_PIR),
                        new Enum("prfseqdb", INT_PRFSEQDB),
                        new Enum("psd", INT_PSD),
                        new Enum("swissprot", INT_SWISSPROT),
                        new Enum("gdb", INT_GDB),
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
                    public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi newInstance() {
              return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.MedlineSiDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.MedlineSiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
