/*
 * An XML document type.
 * Localname: BioSource
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BioSourceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one BioSource(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface BioSourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioSourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("biosourced28fdoctype");
    
    /**
     * Gets the "BioSource" element
     */
    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource getBioSource();
    
    /**
     * Sets the "BioSource" element
     */
    void setBioSource(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource bioSource);
    
    /**
     * Appends and returns a new empty "BioSource" element
     */
    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource addNewBioSource();
    
    /**
     * An XML BioSource(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface BioSource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("biosource051eelemtype");
        
        /**
         * Gets the "genome" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome getGenome();
        
        /**
         * True if has "genome" element
         */
        boolean isSetGenome();
        
        /**
         * Sets the "genome" element
         */
        void setGenome(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome genome);
        
        /**
         * Appends and returns a new empty "genome" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome addNewGenome();
        
        /**
         * Unsets the "genome" element
         */
        void unsetGenome();
        
        /**
         * Gets the "origin" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin getOrigin();
        
        /**
         * True if has "origin" element
         */
        boolean isSetOrigin();
        
        /**
         * Sets the "origin" element
         */
        void setOrigin(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin origin);
        
        /**
         * Appends and returns a new empty "origin" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin addNewOrigin();
        
        /**
         * Unsets the "origin" element
         */
        void unsetOrigin();
        
        /**
         * Gets the "org" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org getOrg();
        
        /**
         * Sets the "org" element
         */
        void setOrg(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org org);
        
        /**
         * Appends and returns a new empty "org" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org addNewOrg();
        
        /**
         * Gets the "subtype" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype getSubtype();
        
        /**
         * True if has "subtype" element
         */
        boolean isSetSubtype();
        
        /**
         * Sets the "subtype" element
         */
        void setSubtype(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype subtype);
        
        /**
         * Appends and returns a new empty "subtype" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype addNewSubtype();
        
        /**
         * Unsets the "subtype" element
         */
        void unsetSubtype();
        
        /**
         * Gets the "is-focus" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus getIsFocus();
        
        /**
         * True if has "is-focus" element
         */
        boolean isSetIsFocus();
        
        /**
         * Sets the "is-focus" element
         */
        void setIsFocus(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus isFocus);
        
        /**
         * Appends and returns a new empty "is-focus" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus addNewIsFocus();
        
        /**
         * Unsets the "is-focus" element
         */
        void unsetIsFocus();
        
        /**
         * Gets the "pcr-primers" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers getPcrPrimers();
        
        /**
         * True if has "pcr-primers" element
         */
        boolean isSetPcrPrimers();
        
        /**
         * Sets the "pcr-primers" element
         */
        void setPcrPrimers(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers pcrPrimers);
        
        /**
         * Appends and returns a new empty "pcr-primers" element
         */
        gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers addNewPcrPrimers();
        
        /**
         * Unsets the "pcr-primers" element
         */
        void unsetPcrPrimers();
        
        /**
         * An XML genome(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Genome.
         */
        public interface Genome extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Genome.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genomec531elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Genome$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value68f8attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum GENOMIC = Enum.forString("genomic");
                static final Enum CHLOROPLAST = Enum.forString("chloroplast");
                static final Enum CHROMOPLAST = Enum.forString("chromoplast");
                static final Enum KINETOPLAST = Enum.forString("kinetoplast");
                static final Enum MITOCHONDRION = Enum.forString("mitochondrion");
                static final Enum PLASTID = Enum.forString("plastid");
                static final Enum MACRONUCLEAR = Enum.forString("macronuclear");
                static final Enum EXTRACHROM = Enum.forString("extrachrom");
                static final Enum PLASMID = Enum.forString("plasmid");
                static final Enum TRANSPOSON = Enum.forString("transposon");
                static final Enum INSERTION_SEQ = Enum.forString("insertion-seq");
                static final Enum CYANELLE = Enum.forString("cyanelle");
                static final Enum PROVIRAL = Enum.forString("proviral");
                static final Enum VIRION = Enum.forString("virion");
                static final Enum NUCLEOMORPH = Enum.forString("nucleomorph");
                static final Enum APICOPLAST = Enum.forString("apicoplast");
                static final Enum LEUCOPLAST = Enum.forString("leucoplast");
                static final Enum PROPLASTID = Enum.forString("proplastid");
                static final Enum ENDOGENOUS_VIRUS = Enum.forString("endogenous-virus");
                static final Enum HYDROGENOSOME = Enum.forString("hydrogenosome");
                static final Enum CHROMOSOME = Enum.forString("chromosome");
                static final Enum CHROMATOPHORE = Enum.forString("chromatophore");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_GENOMIC = Enum.INT_GENOMIC;
                static final int INT_CHLOROPLAST = Enum.INT_CHLOROPLAST;
                static final int INT_CHROMOPLAST = Enum.INT_CHROMOPLAST;
                static final int INT_KINETOPLAST = Enum.INT_KINETOPLAST;
                static final int INT_MITOCHONDRION = Enum.INT_MITOCHONDRION;
                static final int INT_PLASTID = Enum.INT_PLASTID;
                static final int INT_MACRONUCLEAR = Enum.INT_MACRONUCLEAR;
                static final int INT_EXTRACHROM = Enum.INT_EXTRACHROM;
                static final int INT_PLASMID = Enum.INT_PLASMID;
                static final int INT_TRANSPOSON = Enum.INT_TRANSPOSON;
                static final int INT_INSERTION_SEQ = Enum.INT_INSERTION_SEQ;
                static final int INT_CYANELLE = Enum.INT_CYANELLE;
                static final int INT_PROVIRAL = Enum.INT_PROVIRAL;
                static final int INT_VIRION = Enum.INT_VIRION;
                static final int INT_NUCLEOMORPH = Enum.INT_NUCLEOMORPH;
                static final int INT_APICOPLAST = Enum.INT_APICOPLAST;
                static final int INT_LEUCOPLAST = Enum.INT_LEUCOPLAST;
                static final int INT_PROPLASTID = Enum.INT_PROPLASTID;
                static final int INT_ENDOGENOUS_VIRUS = Enum.INT_ENDOGENOUS_VIRUS;
                static final int INT_HYDROGENOSOME = Enum.INT_HYDROGENOSOME;
                static final int INT_CHROMOSOME = Enum.INT_CHROMOSOME;
                static final int INT_CHROMATOPHORE = Enum.INT_CHROMATOPHORE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Genome$Value.
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
                    static final int INT_CHLOROPLAST = 3;
                    static final int INT_CHROMOPLAST = 4;
                    static final int INT_KINETOPLAST = 5;
                    static final int INT_MITOCHONDRION = 6;
                    static final int INT_PLASTID = 7;
                    static final int INT_MACRONUCLEAR = 8;
                    static final int INT_EXTRACHROM = 9;
                    static final int INT_PLASMID = 10;
                    static final int INT_TRANSPOSON = 11;
                    static final int INT_INSERTION_SEQ = 12;
                    static final int INT_CYANELLE = 13;
                    static final int INT_PROVIRAL = 14;
                    static final int INT_VIRION = 15;
                    static final int INT_NUCLEOMORPH = 16;
                    static final int INT_APICOPLAST = 17;
                    static final int INT_LEUCOPLAST = 18;
                    static final int INT_PROPLASTID = 19;
                    static final int INT_ENDOGENOUS_VIRUS = 20;
                    static final int INT_HYDROGENOSOME = 21;
                    static final int INT_CHROMOSOME = 22;
                    static final int INT_CHROMATOPHORE = 23;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("genomic", INT_GENOMIC),
                        new Enum("chloroplast", INT_CHLOROPLAST),
                        new Enum("chromoplast", INT_CHROMOPLAST),
                        new Enum("kinetoplast", INT_KINETOPLAST),
                        new Enum("mitochondrion", INT_MITOCHONDRION),
                        new Enum("plastid", INT_PLASTID),
                        new Enum("macronuclear", INT_MACRONUCLEAR),
                        new Enum("extrachrom", INT_EXTRACHROM),
                        new Enum("plasmid", INT_PLASMID),
                        new Enum("transposon", INT_TRANSPOSON),
                        new Enum("insertion-seq", INT_INSERTION_SEQ),
                        new Enum("cyanelle", INT_CYANELLE),
                        new Enum("proviral", INT_PROVIRAL),
                        new Enum("virion", INT_VIRION),
                        new Enum("nucleomorph", INT_NUCLEOMORPH),
                        new Enum("apicoplast", INT_APICOPLAST),
                        new Enum("leucoplast", INT_LEUCOPLAST),
                        new Enum("proplastid", INT_PROPLASTID),
                        new Enum("endogenous-virus", INT_ENDOGENOUS_VIRUS),
                        new Enum("hydrogenosome", INT_HYDROGENOSOME),
                        new Enum("chromosome", INT_CHROMOSOME),
                        new Enum("chromatophore", INT_CHROMATOPHORE),
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
                    public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML origin(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Origin.
         */
        public interface Origin extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Origin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("originede0elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Origin$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value91a7attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum NATURAL = Enum.forString("natural");
                static final Enum NATMUT = Enum.forString("natmut");
                static final Enum MUT = Enum.forString("mut");
                static final Enum ARTIFICIAL = Enum.forString("artificial");
                static final Enum SYNTHETIC = Enum.forString("synthetic");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_NATURAL = Enum.INT_NATURAL;
                static final int INT_NATMUT = Enum.INT_NATMUT;
                static final int INT_MUT = Enum.INT_MUT;
                static final int INT_ARTIFICIAL = Enum.INT_ARTIFICIAL;
                static final int INT_SYNTHETIC = Enum.INT_SYNTHETIC;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Origin$Value.
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
                    static final int INT_NATURAL = 2;
                    static final int INT_NATMUT = 3;
                    static final int INT_MUT = 4;
                    static final int INT_ARTIFICIAL = 5;
                    static final int INT_SYNTHETIC = 6;
                    static final int INT_OTHER = 7;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("natural", INT_NATURAL),
                        new Enum("natmut", INT_NATMUT),
                        new Enum("mut", INT_MUT),
                        new Enum("artificial", INT_ARTIFICIAL),
                        new Enum("synthetic", INT_SYNTHETIC),
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
                    public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML org(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Org extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Org.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgbc6eelemtype");
            
            /**
             * Gets the "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef();
            
            /**
             * Sets the "Org-ref" element
             */
            void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef);
            
            /**
             * Appends and returns a new empty "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML subtype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Subtype extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subtype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("subtypec804elemtype");
            
            /**
             * Gets array of all "SubSource" elements
             */
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource[] getSubSourceArray();
            
            /**
             * Gets ith "SubSource" element
             */
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource getSubSourceArray(int i);
            
            /**
             * Returns number of "SubSource" element
             */
            int sizeOfSubSourceArray();
            
            /**
             * Sets array of all "SubSource" element
             */
            void setSubSourceArray(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource[] subSourceArray);
            
            /**
             * Sets ith "SubSource" element
             */
            void setSubSourceArray(int i, gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource subSource);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SubSource" element
             */
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource insertNewSubSource(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SubSource" element
             */
            gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource addNewSubSource();
            
            /**
             * Removes the ith "SubSource" element
             */
            void removeSubSource(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML is-focus(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface IsFocus extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsFocus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("isfocusadafelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pcr-primers(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PcrPrimers extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PcrPrimers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pcrprimersec9celemtype");
            
            /**
             * Gets the "PCRReactionSet" element
             */
            gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet getPCRReactionSet();
            
            /**
             * Sets the "PCRReactionSet" element
             */
            void setPCRReactionSet(gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet pcrReactionSet);
            
            /**
             * Appends and returns a new empty "PCRReactionSet" element
             */
            gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet addNewPCRReactionSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource newInstance() {
              return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.BioSourceDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BioSourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BioSourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
