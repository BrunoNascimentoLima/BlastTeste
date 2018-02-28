/*
 * An XML document type.
 * Localname: SubSource
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SubSourceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SubSource(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SubSourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubSourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("subsourcec5c7doctype");
    
    /**
     * Gets the "SubSource" element
     */
    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource getSubSource();
    
    /**
     * Sets the "SubSource" element
     */
    void setSubSource(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource subSource);
    
    /**
     * Appends and returns a new empty "SubSource" element
     */
    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource addNewSubSource();
    
    /**
     * An XML SubSource(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SubSource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("subsourced78eelemtype");
        
        /**
         * Gets the "subtype" element
         */
        gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype getSubtype();
        
        /**
         * Sets the "subtype" element
         */
        void setSubtype(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype subtype);
        
        /**
         * Appends and returns a new empty "subtype" element
         */
        gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype addNewSubtype();
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "attrib" element
         */
        java.lang.String getAttrib();
        
        /**
         * Gets (as xml) the "attrib" element
         */
        org.apache.xmlbeans.XmlString xgetAttrib();
        
        /**
         * True if has "attrib" element
         */
        boolean isSetAttrib();
        
        /**
         * Sets the "attrib" element
         */
        void setAttrib(java.lang.String attrib);
        
        /**
         * Sets (as xml) the "attrib" element
         */
        void xsetAttrib(org.apache.xmlbeans.XmlString attrib);
        
        /**
         * Unsets the "attrib" element
         */
        void unsetAttrib();
        
        /**
         * An XML subtype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SubSourceDocument$SubSource$Subtype.
         */
        public interface Subtype extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subtype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("subtype9a74elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SubSourceDocument$SubSource$Subtype$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value6f8dattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum CHROMOSOME = Enum.forString("chromosome");
                static final Enum MAP = Enum.forString("map");
                static final Enum CLONE = Enum.forString("clone");
                static final Enum SUBCLONE = Enum.forString("subclone");
                static final Enum HAPLOTYPE = Enum.forString("haplotype");
                static final Enum GENOTYPE = Enum.forString("genotype");
                static final Enum SEX = Enum.forString("sex");
                static final Enum CELL_LINE = Enum.forString("cell-line");
                static final Enum CELL_TYPE = Enum.forString("cell-type");
                static final Enum TISSUE_TYPE = Enum.forString("tissue-type");
                static final Enum CLONE_LIB = Enum.forString("clone-lib");
                static final Enum DEV_STAGE = Enum.forString("dev-stage");
                static final Enum FREQUENCY = Enum.forString("frequency");
                static final Enum GERMLINE = Enum.forString("germline");
                static final Enum REARRANGED = Enum.forString("rearranged");
                static final Enum LAB_HOST = Enum.forString("lab-host");
                static final Enum POP_VARIANT = Enum.forString("pop-variant");
                static final Enum TISSUE_LIB = Enum.forString("tissue-lib");
                static final Enum PLASMID_NAME = Enum.forString("plasmid-name");
                static final Enum TRANSPOSON_NAME = Enum.forString("transposon-name");
                static final Enum INSERTION_SEQ_NAME = Enum.forString("insertion-seq-name");
                static final Enum PLASTID_NAME = Enum.forString("plastid-name");
                static final Enum COUNTRY = Enum.forString("country");
                static final Enum SEGMENT = Enum.forString("segment");
                static final Enum ENDOGENOUS_VIRUS_NAME = Enum.forString("endogenous-virus-name");
                static final Enum TRANSGENIC = Enum.forString("transgenic");
                static final Enum ENVIRONMENTAL_SAMPLE = Enum.forString("environmental-sample");
                static final Enum ISOLATION_SOURCE = Enum.forString("isolation-source");
                static final Enum LAT_LON = Enum.forString("lat-lon");
                static final Enum COLLECTION_DATE = Enum.forString("collection-date");
                static final Enum COLLECTED_BY = Enum.forString("collected-by");
                static final Enum IDENTIFIED_BY = Enum.forString("identified-by");
                static final Enum FWD_PRIMER_SEQ = Enum.forString("fwd-primer-seq");
                static final Enum REV_PRIMER_SEQ = Enum.forString("rev-primer-seq");
                static final Enum FWD_PRIMER_NAME = Enum.forString("fwd-primer-name");
                static final Enum REV_PRIMER_NAME = Enum.forString("rev-primer-name");
                static final Enum METAGENOMIC = Enum.forString("metagenomic");
                static final Enum MATING_TYPE = Enum.forString("mating-type");
                static final Enum LINKAGE_GROUP = Enum.forString("linkage-group");
                static final Enum HAPLOGROUP = Enum.forString("haplogroup");
                static final Enum WHOLE_REPLICON = Enum.forString("whole-replicon");
                static final Enum PHENOTYPE = Enum.forString("phenotype");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_CHROMOSOME = Enum.INT_CHROMOSOME;
                static final int INT_MAP = Enum.INT_MAP;
                static final int INT_CLONE = Enum.INT_CLONE;
                static final int INT_SUBCLONE = Enum.INT_SUBCLONE;
                static final int INT_HAPLOTYPE = Enum.INT_HAPLOTYPE;
                static final int INT_GENOTYPE = Enum.INT_GENOTYPE;
                static final int INT_SEX = Enum.INT_SEX;
                static final int INT_CELL_LINE = Enum.INT_CELL_LINE;
                static final int INT_CELL_TYPE = Enum.INT_CELL_TYPE;
                static final int INT_TISSUE_TYPE = Enum.INT_TISSUE_TYPE;
                static final int INT_CLONE_LIB = Enum.INT_CLONE_LIB;
                static final int INT_DEV_STAGE = Enum.INT_DEV_STAGE;
                static final int INT_FREQUENCY = Enum.INT_FREQUENCY;
                static final int INT_GERMLINE = Enum.INT_GERMLINE;
                static final int INT_REARRANGED = Enum.INT_REARRANGED;
                static final int INT_LAB_HOST = Enum.INT_LAB_HOST;
                static final int INT_POP_VARIANT = Enum.INT_POP_VARIANT;
                static final int INT_TISSUE_LIB = Enum.INT_TISSUE_LIB;
                static final int INT_PLASMID_NAME = Enum.INT_PLASMID_NAME;
                static final int INT_TRANSPOSON_NAME = Enum.INT_TRANSPOSON_NAME;
                static final int INT_INSERTION_SEQ_NAME = Enum.INT_INSERTION_SEQ_NAME;
                static final int INT_PLASTID_NAME = Enum.INT_PLASTID_NAME;
                static final int INT_COUNTRY = Enum.INT_COUNTRY;
                static final int INT_SEGMENT = Enum.INT_SEGMENT;
                static final int INT_ENDOGENOUS_VIRUS_NAME = Enum.INT_ENDOGENOUS_VIRUS_NAME;
                static final int INT_TRANSGENIC = Enum.INT_TRANSGENIC;
                static final int INT_ENVIRONMENTAL_SAMPLE = Enum.INT_ENVIRONMENTAL_SAMPLE;
                static final int INT_ISOLATION_SOURCE = Enum.INT_ISOLATION_SOURCE;
                static final int INT_LAT_LON = Enum.INT_LAT_LON;
                static final int INT_COLLECTION_DATE = Enum.INT_COLLECTION_DATE;
                static final int INT_COLLECTED_BY = Enum.INT_COLLECTED_BY;
                static final int INT_IDENTIFIED_BY = Enum.INT_IDENTIFIED_BY;
                static final int INT_FWD_PRIMER_SEQ = Enum.INT_FWD_PRIMER_SEQ;
                static final int INT_REV_PRIMER_SEQ = Enum.INT_REV_PRIMER_SEQ;
                static final int INT_FWD_PRIMER_NAME = Enum.INT_FWD_PRIMER_NAME;
                static final int INT_REV_PRIMER_NAME = Enum.INT_REV_PRIMER_NAME;
                static final int INT_METAGENOMIC = Enum.INT_METAGENOMIC;
                static final int INT_MATING_TYPE = Enum.INT_MATING_TYPE;
                static final int INT_LINKAGE_GROUP = Enum.INT_LINKAGE_GROUP;
                static final int INT_HAPLOGROUP = Enum.INT_HAPLOGROUP;
                static final int INT_WHOLE_REPLICON = Enum.INT_WHOLE_REPLICON;
                static final int INT_PHENOTYPE = Enum.INT_PHENOTYPE;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SubSourceDocument$SubSource$Subtype$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_CHROMOSOME
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
                    
                    static final int INT_CHROMOSOME = 1;
                    static final int INT_MAP = 2;
                    static final int INT_CLONE = 3;
                    static final int INT_SUBCLONE = 4;
                    static final int INT_HAPLOTYPE = 5;
                    static final int INT_GENOTYPE = 6;
                    static final int INT_SEX = 7;
                    static final int INT_CELL_LINE = 8;
                    static final int INT_CELL_TYPE = 9;
                    static final int INT_TISSUE_TYPE = 10;
                    static final int INT_CLONE_LIB = 11;
                    static final int INT_DEV_STAGE = 12;
                    static final int INT_FREQUENCY = 13;
                    static final int INT_GERMLINE = 14;
                    static final int INT_REARRANGED = 15;
                    static final int INT_LAB_HOST = 16;
                    static final int INT_POP_VARIANT = 17;
                    static final int INT_TISSUE_LIB = 18;
                    static final int INT_PLASMID_NAME = 19;
                    static final int INT_TRANSPOSON_NAME = 20;
                    static final int INT_INSERTION_SEQ_NAME = 21;
                    static final int INT_PLASTID_NAME = 22;
                    static final int INT_COUNTRY = 23;
                    static final int INT_SEGMENT = 24;
                    static final int INT_ENDOGENOUS_VIRUS_NAME = 25;
                    static final int INT_TRANSGENIC = 26;
                    static final int INT_ENVIRONMENTAL_SAMPLE = 27;
                    static final int INT_ISOLATION_SOURCE = 28;
                    static final int INT_LAT_LON = 29;
                    static final int INT_COLLECTION_DATE = 30;
                    static final int INT_COLLECTED_BY = 31;
                    static final int INT_IDENTIFIED_BY = 32;
                    static final int INT_FWD_PRIMER_SEQ = 33;
                    static final int INT_REV_PRIMER_SEQ = 34;
                    static final int INT_FWD_PRIMER_NAME = 35;
                    static final int INT_REV_PRIMER_NAME = 36;
                    static final int INT_METAGENOMIC = 37;
                    static final int INT_MATING_TYPE = 38;
                    static final int INT_LINKAGE_GROUP = 39;
                    static final int INT_HAPLOGROUP = 40;
                    static final int INT_WHOLE_REPLICON = 41;
                    static final int INT_PHENOTYPE = 42;
                    static final int INT_OTHER = 43;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("chromosome", INT_CHROMOSOME),
                        new Enum("map", INT_MAP),
                        new Enum("clone", INT_CLONE),
                        new Enum("subclone", INT_SUBCLONE),
                        new Enum("haplotype", INT_HAPLOTYPE),
                        new Enum("genotype", INT_GENOTYPE),
                        new Enum("sex", INT_SEX),
                        new Enum("cell-line", INT_CELL_LINE),
                        new Enum("cell-type", INT_CELL_TYPE),
                        new Enum("tissue-type", INT_TISSUE_TYPE),
                        new Enum("clone-lib", INT_CLONE_LIB),
                        new Enum("dev-stage", INT_DEV_STAGE),
                        new Enum("frequency", INT_FREQUENCY),
                        new Enum("germline", INT_GERMLINE),
                        new Enum("rearranged", INT_REARRANGED),
                        new Enum("lab-host", INT_LAB_HOST),
                        new Enum("pop-variant", INT_POP_VARIANT),
                        new Enum("tissue-lib", INT_TISSUE_LIB),
                        new Enum("plasmid-name", INT_PLASMID_NAME),
                        new Enum("transposon-name", INT_TRANSPOSON_NAME),
                        new Enum("insertion-seq-name", INT_INSERTION_SEQ_NAME),
                        new Enum("plastid-name", INT_PLASTID_NAME),
                        new Enum("country", INT_COUNTRY),
                        new Enum("segment", INT_SEGMENT),
                        new Enum("endogenous-virus-name", INT_ENDOGENOUS_VIRUS_NAME),
                        new Enum("transgenic", INT_TRANSGENIC),
                        new Enum("environmental-sample", INT_ENVIRONMENTAL_SAMPLE),
                        new Enum("isolation-source", INT_ISOLATION_SOURCE),
                        new Enum("lat-lon", INT_LAT_LON),
                        new Enum("collection-date", INT_COLLECTION_DATE),
                        new Enum("collected-by", INT_COLLECTED_BY),
                        new Enum("identified-by", INT_IDENTIFIED_BY),
                        new Enum("fwd-primer-seq", INT_FWD_PRIMER_SEQ),
                        new Enum("rev-primer-seq", INT_REV_PRIMER_SEQ),
                        new Enum("fwd-primer-name", INT_FWD_PRIMER_NAME),
                        new Enum("rev-primer-name", INT_REV_PRIMER_NAME),
                        new Enum("metagenomic", INT_METAGENOMIC),
                        new Enum("mating-type", INT_MATING_TYPE),
                        new Enum("linkage-group", INT_LINKAGE_GROUP),
                        new Enum("haplogroup", INT_HAPLOGROUP),
                        new Enum("whole-replicon", INT_WHOLE_REPLICON),
                        new Enum("phenotype", INT_PHENOTYPE),
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
                    public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype newInstance() {
                  return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource newInstance() {
              return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SubSourceDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SubSourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SubSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
