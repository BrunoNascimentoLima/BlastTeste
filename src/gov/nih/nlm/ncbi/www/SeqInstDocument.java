/*
 * An XML document type.
 * Localname: Seq-inst
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqInstDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-inst(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqInstDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqInstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqinst77d2doctype");
    
    /**
     * Gets the "Seq-inst" element
     */
    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst getSeqInst();
    
    /**
     * Sets the "Seq-inst" element
     */
    void setSeqInst(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst seqInst);
    
    /**
     * Appends and returns a new empty "Seq-inst" element
     */
    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst addNewSeqInst();
    
    /**
     * An XML Seq-inst(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqInst extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqInst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqinstae22elemtype");
        
        /**
         * Gets the "repr" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr getRepr();
        
        /**
         * Sets the "repr" element
         */
        void setRepr(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr repr);
        
        /**
         * Appends and returns a new empty "repr" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr addNewRepr();
        
        /**
         * Gets the "mol" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol getMol();
        
        /**
         * Sets the "mol" element
         */
        void setMol(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol mol);
        
        /**
         * Appends and returns a new empty "mol" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol addNewMol();
        
        /**
         * Gets the "length" element
         */
        java.math.BigInteger getLength();
        
        /**
         * Gets (as xml) the "length" element
         */
        org.apache.xmlbeans.XmlInteger xgetLength();
        
        /**
         * True if has "length" element
         */
        boolean isSetLength();
        
        /**
         * Sets the "length" element
         */
        void setLength(java.math.BigInteger length);
        
        /**
         * Sets (as xml) the "length" element
         */
        void xsetLength(org.apache.xmlbeans.XmlInteger length);
        
        /**
         * Unsets the "length" element
         */
        void unsetLength();
        
        /**
         * Gets the "fuzz" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz getFuzz();
        
        /**
         * True if has "fuzz" element
         */
        boolean isSetFuzz();
        
        /**
         * Sets the "fuzz" element
         */
        void setFuzz(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz fuzz);
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz addNewFuzz();
        
        /**
         * Unsets the "fuzz" element
         */
        void unsetFuzz();
        
        /**
         * Gets the "topology" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology getTopology();
        
        /**
         * True if has "topology" element
         */
        boolean isSetTopology();
        
        /**
         * Sets the "topology" element
         */
        void setTopology(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology topology);
        
        /**
         * Appends and returns a new empty "topology" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology addNewTopology();
        
        /**
         * Unsets the "topology" element
         */
        void unsetTopology();
        
        /**
         * Gets the "strand" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand getStrand();
        
        /**
         * True if has "strand" element
         */
        boolean isSetStrand();
        
        /**
         * Sets the "strand" element
         */
        void setStrand(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand strand);
        
        /**
         * Appends and returns a new empty "strand" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand addNewStrand();
        
        /**
         * Unsets the "strand" element
         */
        void unsetStrand();
        
        /**
         * Gets the "seq-data" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData getSeqData();
        
        /**
         * True if has "seq-data" element
         */
        boolean isSetSeqData();
        
        /**
         * Sets the "seq-data" element
         */
        void setSeqData(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData seqData);
        
        /**
         * Appends and returns a new empty "seq-data" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData addNewSeqData();
        
        /**
         * Unsets the "seq-data" element
         */
        void unsetSeqData();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * Gets the "hist" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist getHist();
        
        /**
         * True if has "hist" element
         */
        boolean isSetHist();
        
        /**
         * Sets the "hist" element
         */
        void setHist(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist hist);
        
        /**
         * Appends and returns a new empty "hist" element
         */
        gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist addNewHist();
        
        /**
         * Unsets the "hist" element
         */
        void unsetHist();
        
        /**
         * An XML repr(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Repr extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Repr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("reprfff3elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Repr$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value9f3aattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum VIRTUAL = Enum.forString("virtual");
                static final Enum RAW = Enum.forString("raw");
                static final Enum SEG = Enum.forString("seg");
                static final Enum CONST = Enum.forString("const");
                static final Enum REF = Enum.forString("ref");
                static final Enum CONSEN = Enum.forString("consen");
                static final Enum MAP = Enum.forString("map");
                static final Enum DELTA = Enum.forString("delta");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_VIRTUAL = Enum.INT_VIRTUAL;
                static final int INT_RAW = Enum.INT_RAW;
                static final int INT_SEG = Enum.INT_SEG;
                static final int INT_CONST = Enum.INT_CONST;
                static final int INT_REF = Enum.INT_REF;
                static final int INT_CONSEN = Enum.INT_CONSEN;
                static final int INT_MAP = Enum.INT_MAP;
                static final int INT_DELTA = Enum.INT_DELTA;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Repr$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_NOT_SET
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
                    
                    static final int INT_NOT_SET = 1;
                    static final int INT_VIRTUAL = 2;
                    static final int INT_RAW = 3;
                    static final int INT_SEG = 4;
                    static final int INT_CONST = 5;
                    static final int INT_REF = 6;
                    static final int INT_CONSEN = 7;
                    static final int INT_MAP = 8;
                    static final int INT_DELTA = 9;
                    static final int INT_OTHER = 10;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("virtual", INT_VIRTUAL),
                        new Enum("raw", INT_RAW),
                        new Enum("seg", INT_SEG),
                        new Enum("const", INT_CONST),
                        new Enum("ref", INT_REF),
                        new Enum("consen", INT_CONSEN),
                        new Enum("map", INT_MAP),
                        new Enum("delta", INT_DELTA),
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
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mol(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Mol extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mol5c18elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Mol$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value37f1attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum DNA = Enum.forString("dna");
                static final Enum RNA = Enum.forString("rna");
                static final Enum AA = Enum.forString("aa");
                static final Enum NA = Enum.forString("na");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_DNA = Enum.INT_DNA;
                static final int INT_RNA = Enum.INT_RNA;
                static final int INT_AA = Enum.INT_AA;
                static final int INT_NA = Enum.INT_NA;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Mol$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_NOT_SET
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
                    
                    static final int INT_NOT_SET = 1;
                    static final int INT_DNA = 2;
                    static final int INT_RNA = 3;
                    static final int INT_AA = 4;
                    static final int INT_NA = 5;
                    static final int INT_OTHER = 6;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("dna", INT_DNA),
                        new Enum("rna", INT_RNA),
                        new Enum("aa", INT_AA),
                        new Enum("na", INT_NA),
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
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Fuzz extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fuzz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fuzz1e4delemtype");
            
            /**
             * Gets the "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz();
            
            /**
             * Sets the "Int-fuzz" element
             */
            void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz);
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML topology(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Topology extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Topology.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("topologye86delemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Topology$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value8c34attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum LINEAR = Enum.forString("linear");
                static final Enum CIRCULAR = Enum.forString("circular");
                static final Enum TANDEM = Enum.forString("tandem");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_LINEAR = Enum.INT_LINEAR;
                static final int INT_CIRCULAR = Enum.INT_CIRCULAR;
                static final int INT_TANDEM = Enum.INT_TANDEM;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Topology$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_NOT_SET
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
                    
                    static final int INT_NOT_SET = 1;
                    static final int INT_LINEAR = 2;
                    static final int INT_CIRCULAR = 3;
                    static final int INT_TANDEM = 4;
                    static final int INT_OTHER = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("linear", INT_LINEAR),
                        new Enum("circular", INT_CIRCULAR),
                        new Enum("tandem", INT_TANDEM),
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
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Strand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Strand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strandfa44elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Strand$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuee3cbattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum SS = Enum.forString("ss");
                static final Enum DS = Enum.forString("ds");
                static final Enum MIXED = Enum.forString("mixed");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_SS = Enum.INT_SS;
                static final int INT_DS = Enum.INT_DS;
                static final int INT_MIXED = Enum.INT_MIXED;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Strand$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_NOT_SET
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
                    
                    static final int INT_NOT_SET = 1;
                    static final int INT_SS = 2;
                    static final int INT_DS = 3;
                    static final int INT_MIXED = 4;
                    static final int INT_OTHER = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("ss", INT_SS),
                        new Enum("ds", INT_DS),
                        new Enum("mixed", INT_MIXED),
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
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqdata3216elemtype");
            
            /**
             * Gets the "Seq-data" element
             */
            gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData getSeqData();
            
            /**
             * Sets the "Seq-data" element
             */
            void setSeqData(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData seqData);
            
            /**
             * Appends and returns a new empty "Seq-data" element
             */
            gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData addNewSeqData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ext extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ext2b6felemtype");
            
            /**
             * Gets the "Seq-ext" element
             */
            gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt getSeqExt();
            
            /**
             * Sets the "Seq-ext" element
             */
            void setSeqExt(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt seqExt);
            
            /**
             * Appends and returns a new empty "Seq-ext" element
             */
            gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt addNewSeqExt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML hist(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Hist extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hist.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("histde60elemtype");
            
            /**
             * Gets the "Seq-hist" element
             */
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist getSeqHist();
            
            /**
             * Sets the "Seq-hist" element
             */
            void setSeqHist(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist seqHist);
            
            /**
             * Appends and returns a new empty "Seq-hist" element
             */
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist addNewSeqHist();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqInstDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqInstDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
