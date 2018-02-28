/*
 * An XML document type.
 * Localname: GIBB-mol
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GIBBMolDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one GIBB-mol(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface GIBBMolDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GIBBMolDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gibbmolb19ddoctype");
    
    /**
     * Gets the "GIBB-mol" element
     */
    gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol getGIBBMol();
    
    /**
     * Sets the "GIBB-mol" element
     */
    void setGIBBMol(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol gibbMol);
    
    /**
     * Appends and returns a new empty "GIBB-mol" element
     */
    gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol addNewGIBBMol();
    
    /**
     * An XML GIBB-mol(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface GIBBMol extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GIBBMol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gibbmol3142elemtype");
        
        /**
         * Gets the "value" attribute
         */
        gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value.Enum getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value.Enum value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value value);
        
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GIBBMolDocument$GIBBMol$Value.
         */
        public interface Value extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value23dbattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum UNKNOWN = Enum.forString("unknown");
            static final Enum GENOMIC = Enum.forString("genomic");
            static final Enum PRE_M_RNA = Enum.forString("pre-mRNA");
            static final Enum M_RNA = Enum.forString("mRNA");
            static final Enum R_RNA = Enum.forString("rRNA");
            static final Enum T_RNA = Enum.forString("tRNA");
            static final Enum SN_RNA = Enum.forString("snRNA");
            static final Enum SC_RNA = Enum.forString("scRNA");
            static final Enum PEPTIDE = Enum.forString("peptide");
            static final Enum OTHER_GENETIC = Enum.forString("other-genetic");
            static final Enum GENOMIC_M_RNA = Enum.forString("genomic-mRNA");
            static final Enum OTHER = Enum.forString("other");
            
            static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
            static final int INT_GENOMIC = Enum.INT_GENOMIC;
            static final int INT_PRE_M_RNA = Enum.INT_PRE_M_RNA;
            static final int INT_M_RNA = Enum.INT_M_RNA;
            static final int INT_R_RNA = Enum.INT_R_RNA;
            static final int INT_T_RNA = Enum.INT_T_RNA;
            static final int INT_SN_RNA = Enum.INT_SN_RNA;
            static final int INT_SC_RNA = Enum.INT_SC_RNA;
            static final int INT_PEPTIDE = Enum.INT_PEPTIDE;
            static final int INT_OTHER_GENETIC = Enum.INT_OTHER_GENETIC;
            static final int INT_GENOMIC_M_RNA = Enum.INT_GENOMIC_M_RNA;
            static final int INT_OTHER = Enum.INT_OTHER;
            
            /**
             * Enumeration value class for gov.nih.nlm.ncbi.www.GIBBMolDocument$GIBBMol$Value.
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
                static final int INT_GENOMIC = 2;
                static final int INT_PRE_M_RNA = 3;
                static final int INT_M_RNA = 4;
                static final int INT_R_RNA = 5;
                static final int INT_T_RNA = 6;
                static final int INT_SN_RNA = 7;
                static final int INT_SC_RNA = 8;
                static final int INT_PEPTIDE = 9;
                static final int INT_OTHER_GENETIC = 10;
                static final int INT_GENOMIC_M_RNA = 11;
                static final int INT_OTHER = 12;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("unknown", INT_UNKNOWN),
                      new Enum("genomic", INT_GENOMIC),
                      new Enum("pre-mRNA", INT_PRE_M_RNA),
                      new Enum("mRNA", INT_M_RNA),
                      new Enum("rRNA", INT_R_RNA),
                      new Enum("tRNA", INT_T_RNA),
                      new Enum("snRNA", INT_SN_RNA),
                      new Enum("scRNA", INT_SC_RNA),
                      new Enum("peptide", INT_PEPTIDE),
                      new Enum("other-genetic", INT_OTHER_GENETIC),
                      new Enum("genomic-mRNA", INT_GENOMIC_M_RNA),
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
                public static gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value newValue(java.lang.Object obj) {
                  return (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value) type.newValue( obj ); }
                
                public static gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value newInstance() {
                  return (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol newInstance() {
              return (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GIBBMolDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GIBBMolDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
