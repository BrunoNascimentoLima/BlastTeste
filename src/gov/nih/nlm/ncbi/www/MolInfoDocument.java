/*
 * An XML document type.
 * Localname: MolInfo
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MolInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one MolInfo(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface MolInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MolInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("molinfo6664doctype");
    
    /**
     * Gets the "MolInfo" element
     */
    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo getMolInfo();
    
    /**
     * Sets the "MolInfo" element
     */
    void setMolInfo(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo molInfo);
    
    /**
     * Appends and returns a new empty "MolInfo" element
     */
    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo addNewMolInfo();
    
    /**
     * An XML MolInfo(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface MolInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MolInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("molinfo0a88elemtype");
        
        /**
         * Gets the "biomol" element
         */
        gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol getBiomol();
        
        /**
         * True if has "biomol" element
         */
        boolean isSetBiomol();
        
        /**
         * Sets the "biomol" element
         */
        void setBiomol(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol biomol);
        
        /**
         * Appends and returns a new empty "biomol" element
         */
        gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol addNewBiomol();
        
        /**
         * Unsets the "biomol" element
         */
        void unsetBiomol();
        
        /**
         * Gets the "tech" element
         */
        gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech getTech();
        
        /**
         * True if has "tech" element
         */
        boolean isSetTech();
        
        /**
         * Sets the "tech" element
         */
        void setTech(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech tech);
        
        /**
         * Appends and returns a new empty "tech" element
         */
        gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech addNewTech();
        
        /**
         * Unsets the "tech" element
         */
        void unsetTech();
        
        /**
         * Gets the "techexp" element
         */
        java.lang.String getTechexp();
        
        /**
         * Gets (as xml) the "techexp" element
         */
        org.apache.xmlbeans.XmlString xgetTechexp();
        
        /**
         * True if has "techexp" element
         */
        boolean isSetTechexp();
        
        /**
         * Sets the "techexp" element
         */
        void setTechexp(java.lang.String techexp);
        
        /**
         * Sets (as xml) the "techexp" element
         */
        void xsetTechexp(org.apache.xmlbeans.XmlString techexp);
        
        /**
         * Unsets the "techexp" element
         */
        void unsetTechexp();
        
        /**
         * Gets the "completeness" element
         */
        gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness getCompleteness();
        
        /**
         * True if has "completeness" element
         */
        boolean isSetCompleteness();
        
        /**
         * Sets the "completeness" element
         */
        void setCompleteness(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness completeness);
        
        /**
         * Appends and returns a new empty "completeness" element
         */
        gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness addNewCompleteness();
        
        /**
         * Unsets the "completeness" element
         */
        void unsetCompleteness();
        
        /**
         * Gets the "gbmoltype" element
         */
        java.lang.String getGbmoltype();
        
        /**
         * Gets (as xml) the "gbmoltype" element
         */
        org.apache.xmlbeans.XmlString xgetGbmoltype();
        
        /**
         * True if has "gbmoltype" element
         */
        boolean isSetGbmoltype();
        
        /**
         * Sets the "gbmoltype" element
         */
        void setGbmoltype(java.lang.String gbmoltype);
        
        /**
         * Sets (as xml) the "gbmoltype" element
         */
        void xsetGbmoltype(org.apache.xmlbeans.XmlString gbmoltype);
        
        /**
         * Unsets the "gbmoltype" element
         */
        void unsetGbmoltype();
        
        /**
         * An XML biomol(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Biomol.
         */
        public interface Biomol extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Biomol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("biomolfa26elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Biomol$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value996dattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum GENOMIC = Enum.forString("genomic");
                static final Enum PRE_RNA = Enum.forString("pre-RNA");
                static final Enum M_RNA = Enum.forString("mRNA");
                static final Enum R_RNA = Enum.forString("rRNA");
                static final Enum T_RNA = Enum.forString("tRNA");
                static final Enum SN_RNA = Enum.forString("snRNA");
                static final Enum SC_RNA = Enum.forString("scRNA");
                static final Enum PEPTIDE = Enum.forString("peptide");
                static final Enum OTHER_GENETIC = Enum.forString("other-genetic");
                static final Enum GENOMIC_M_RNA = Enum.forString("genomic-mRNA");
                static final Enum C_RNA = Enum.forString("cRNA");
                static final Enum SNO_RNA = Enum.forString("snoRNA");
                static final Enum TRANSCRIBED_RNA = Enum.forString("transcribed-RNA");
                static final Enum NC_RNA = Enum.forString("ncRNA");
                static final Enum TM_RNA = Enum.forString("tmRNA");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_GENOMIC = Enum.INT_GENOMIC;
                static final int INT_PRE_RNA = Enum.INT_PRE_RNA;
                static final int INT_M_RNA = Enum.INT_M_RNA;
                static final int INT_R_RNA = Enum.INT_R_RNA;
                static final int INT_T_RNA = Enum.INT_T_RNA;
                static final int INT_SN_RNA = Enum.INT_SN_RNA;
                static final int INT_SC_RNA = Enum.INT_SC_RNA;
                static final int INT_PEPTIDE = Enum.INT_PEPTIDE;
                static final int INT_OTHER_GENETIC = Enum.INT_OTHER_GENETIC;
                static final int INT_GENOMIC_M_RNA = Enum.INT_GENOMIC_M_RNA;
                static final int INT_C_RNA = Enum.INT_C_RNA;
                static final int INT_SNO_RNA = Enum.INT_SNO_RNA;
                static final int INT_TRANSCRIBED_RNA = Enum.INT_TRANSCRIBED_RNA;
                static final int INT_NC_RNA = Enum.INT_NC_RNA;
                static final int INT_TM_RNA = Enum.INT_TM_RNA;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Biomol$Value.
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
                    static final int INT_PRE_RNA = 3;
                    static final int INT_M_RNA = 4;
                    static final int INT_R_RNA = 5;
                    static final int INT_T_RNA = 6;
                    static final int INT_SN_RNA = 7;
                    static final int INT_SC_RNA = 8;
                    static final int INT_PEPTIDE = 9;
                    static final int INT_OTHER_GENETIC = 10;
                    static final int INT_GENOMIC_M_RNA = 11;
                    static final int INT_C_RNA = 12;
                    static final int INT_SNO_RNA = 13;
                    static final int INT_TRANSCRIBED_RNA = 14;
                    static final int INT_NC_RNA = 15;
                    static final int INT_TM_RNA = 16;
                    static final int INT_OTHER = 17;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("genomic", INT_GENOMIC),
                        new Enum("pre-RNA", INT_PRE_RNA),
                        new Enum("mRNA", INT_M_RNA),
                        new Enum("rRNA", INT_R_RNA),
                        new Enum("tRNA", INT_T_RNA),
                        new Enum("snRNA", INT_SN_RNA),
                        new Enum("scRNA", INT_SC_RNA),
                        new Enum("peptide", INT_PEPTIDE),
                        new Enum("other-genetic", INT_OTHER_GENETIC),
                        new Enum("genomic-mRNA", INT_GENOMIC_M_RNA),
                        new Enum("cRNA", INT_C_RNA),
                        new Enum("snoRNA", INT_SNO_RNA),
                        new Enum("transcribed-RNA", INT_TRANSCRIBED_RNA),
                        new Enum("ncRNA", INT_NC_RNA),
                        new Enum("tmRNA", INT_TM_RNA),
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
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol newInstance() {
                  return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Biomol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML tech(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Tech.
         */
        public interface Tech extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tech.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("tech5dbaelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Tech$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value22c1attrtype");
                
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
                static final Enum BARCODE = Enum.forString("barcode");
                static final Enum COMPOSITE_WGS_HTGS = Enum.forString("composite-wgs-htgs");
                static final Enum TSA = Enum.forString("tsa");
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
                static final int INT_BARCODE = Enum.INT_BARCODE;
                static final int INT_COMPOSITE_WGS_HTGS = Enum.INT_COMPOSITE_WGS_HTGS;
                static final int INT_TSA = Enum.INT_TSA;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Tech$Value.
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
                    static final int INT_BARCODE = 22;
                    static final int INT_COMPOSITE_WGS_HTGS = 23;
                    static final int INT_TSA = 24;
                    static final int INT_OTHER = 25;
                    
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
                        new Enum("barcode", INT_BARCODE),
                        new Enum("composite-wgs-htgs", INT_COMPOSITE_WGS_HTGS),
                        new Enum("tsa", INT_TSA),
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
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech newInstance() {
                  return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Tech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML completeness(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Completeness.
         */
        public interface Completeness extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Completeness.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("completenessde34elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Completeness$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valueac3battrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum COMPLETE = Enum.forString("complete");
                static final Enum PARTIAL = Enum.forString("partial");
                static final Enum NO_LEFT = Enum.forString("no-left");
                static final Enum NO_RIGHT = Enum.forString("no-right");
                static final Enum NO_ENDS = Enum.forString("no-ends");
                static final Enum HAS_LEFT = Enum.forString("has-left");
                static final Enum HAS_RIGHT = Enum.forString("has-right");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_COMPLETE = Enum.INT_COMPLETE;
                static final int INT_PARTIAL = Enum.INT_PARTIAL;
                static final int INT_NO_LEFT = Enum.INT_NO_LEFT;
                static final int INT_NO_RIGHT = Enum.INT_NO_RIGHT;
                static final int INT_NO_ENDS = Enum.INT_NO_ENDS;
                static final int INT_HAS_LEFT = Enum.INT_HAS_LEFT;
                static final int INT_HAS_RIGHT = Enum.INT_HAS_RIGHT;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.MolInfoDocument$MolInfo$Completeness$Value.
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
                    static final int INT_COMPLETE = 2;
                    static final int INT_PARTIAL = 3;
                    static final int INT_NO_LEFT = 4;
                    static final int INT_NO_RIGHT = 5;
                    static final int INT_NO_ENDS = 6;
                    static final int INT_HAS_LEFT = 7;
                    static final int INT_HAS_RIGHT = 8;
                    static final int INT_OTHER = 9;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("complete", INT_COMPLETE),
                        new Enum("partial", INT_PARTIAL),
                        new Enum("no-left", INT_NO_LEFT),
                        new Enum("no-right", INT_NO_RIGHT),
                        new Enum("no-ends", INT_NO_ENDS),
                        new Enum("has-left", INT_HAS_LEFT),
                        new Enum("has-right", INT_HAS_RIGHT),
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
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness newInstance() {
                  return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo.Completeness) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo newInstance() {
              return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.MolInfoDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.MolInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.MolInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
