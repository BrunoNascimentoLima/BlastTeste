/*
 * An XML document type.
 * Localname: Tx-evidence
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TxEvidenceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Tx-evidence(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface TxEvidenceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TxEvidenceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txevidencedb8cdoctype");
    
    /**
     * Gets the "Tx-evidence" element
     */
    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence getTxEvidence();
    
    /**
     * Sets the "Tx-evidence" element
     */
    void setTxEvidence(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence txEvidence);
    
    /**
     * Appends and returns a new empty "Tx-evidence" element
     */
    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence addNewTxEvidence();
    
    /**
     * An XML Tx-evidence(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface TxEvidence extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TxEvidence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txevidence5458elemtype");
        
        /**
         * Gets the "exp-code" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode getExpCode();
        
        /**
         * Sets the "exp-code" element
         */
        void setExpCode(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode expCode);
        
        /**
         * Appends and returns a new empty "exp-code" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode addNewExpCode();
        
        /**
         * Gets the "expression-system" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem getExpressionSystem();
        
        /**
         * True if has "expression-system" element
         */
        boolean isSetExpressionSystem();
        
        /**
         * Sets the "expression-system" element
         */
        void setExpressionSystem(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem expressionSystem);
        
        /**
         * Appends and returns a new empty "expression-system" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem addNewExpressionSystem();
        
        /**
         * Unsets the "expression-system" element
         */
        void unsetExpressionSystem();
        
        /**
         * Gets the "low-prec-data" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData getLowPrecData();
        
        /**
         * True if has "low-prec-data" element
         */
        boolean isSetLowPrecData();
        
        /**
         * Sets the "low-prec-data" element
         */
        void setLowPrecData(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData lowPrecData);
        
        /**
         * Appends and returns a new empty "low-prec-data" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData addNewLowPrecData();
        
        /**
         * Unsets the "low-prec-data" element
         */
        void unsetLowPrecData();
        
        /**
         * Gets the "from-homolog" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog getFromHomolog();
        
        /**
         * True if has "from-homolog" element
         */
        boolean isSetFromHomolog();
        
        /**
         * Sets the "from-homolog" element
         */
        void setFromHomolog(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog fromHomolog);
        
        /**
         * Appends and returns a new empty "from-homolog" element
         */
        gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog addNewFromHomolog();
        
        /**
         * Unsets the "from-homolog" element
         */
        void unsetFromHomolog();
        
        /**
         * An XML exp-code(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ExpCode extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExpCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("expcode5591elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$ExpCode$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuec818attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum RNA_SEQ = Enum.forString("rna-seq");
                static final Enum RNA_SIZE = Enum.forString("rna-size");
                static final Enum NP_MAP = Enum.forString("np-map");
                static final Enum NP_SIZE = Enum.forString("np-size");
                static final Enum PE_SEQ = Enum.forString("pe-seq");
                static final Enum C_DNA_SEQ = Enum.forString("cDNA-seq");
                static final Enum PE_MAP = Enum.forString("pe-map");
                static final Enum PE_SIZE = Enum.forString("pe-size");
                static final Enum PSEUDO_SEQ = Enum.forString("pseudo-seq");
                static final Enum REV_PE_MAP = Enum.forString("rev-pe-map");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_RNA_SEQ = Enum.INT_RNA_SEQ;
                static final int INT_RNA_SIZE = Enum.INT_RNA_SIZE;
                static final int INT_NP_MAP = Enum.INT_NP_MAP;
                static final int INT_NP_SIZE = Enum.INT_NP_SIZE;
                static final int INT_PE_SEQ = Enum.INT_PE_SEQ;
                static final int INT_C_DNA_SEQ = Enum.INT_C_DNA_SEQ;
                static final int INT_PE_MAP = Enum.INT_PE_MAP;
                static final int INT_PE_SIZE = Enum.INT_PE_SIZE;
                static final int INT_PSEUDO_SEQ = Enum.INT_PSEUDO_SEQ;
                static final int INT_REV_PE_MAP = Enum.INT_REV_PE_MAP;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$ExpCode$Value.
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
                    static final int INT_RNA_SEQ = 2;
                    static final int INT_RNA_SIZE = 3;
                    static final int INT_NP_MAP = 4;
                    static final int INT_NP_SIZE = 5;
                    static final int INT_PE_SEQ = 6;
                    static final int INT_C_DNA_SEQ = 7;
                    static final int INT_PE_MAP = 8;
                    static final int INT_PE_SIZE = 9;
                    static final int INT_PSEUDO_SEQ = 10;
                    static final int INT_REV_PE_MAP = 11;
                    static final int INT_OTHER = 12;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("rna-seq", INT_RNA_SEQ),
                        new Enum("rna-size", INT_RNA_SIZE),
                        new Enum("np-map", INT_NP_MAP),
                        new Enum("np-size", INT_NP_SIZE),
                        new Enum("pe-seq", INT_PE_SEQ),
                        new Enum("cDNA-seq", INT_C_DNA_SEQ),
                        new Enum("pe-map", INT_PE_MAP),
                        new Enum("pe-size", INT_PE_SIZE),
                        new Enum("pseudo-seq", INT_PSEUDO_SEQ),
                        new Enum("rev-pe-map", INT_REV_PE_MAP),
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
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML expression-system(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ExpressionSystem extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExpressionSystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("expressionsystem2dc8elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$ExpressionSystem$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuea321attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum PHYSIOLOGICAL = Enum.forString("physiological");
                static final Enum IN_VITRO = Enum.forString("in-vitro");
                static final Enum OOCYTE = Enum.forString("oocyte");
                static final Enum TRANSFECTION = Enum.forString("transfection");
                static final Enum TRANSGENIC = Enum.forString("transgenic");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_PHYSIOLOGICAL = Enum.INT_PHYSIOLOGICAL;
                static final int INT_IN_VITRO = Enum.INT_IN_VITRO;
                static final int INT_OOCYTE = Enum.INT_OOCYTE;
                static final int INT_TRANSFECTION = Enum.INT_TRANSFECTION;
                static final int INT_TRANSGENIC = Enum.INT_TRANSGENIC;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$ExpressionSystem$Value.
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
                    static final int INT_PHYSIOLOGICAL = 2;
                    static final int INT_IN_VITRO = 3;
                    static final int INT_OOCYTE = 4;
                    static final int INT_TRANSFECTION = 5;
                    static final int INT_TRANSGENIC = 6;
                    static final int INT_OTHER = 7;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("physiological", INT_PHYSIOLOGICAL),
                        new Enum("in-vitro", INT_IN_VITRO),
                        new Enum("oocyte", INT_OOCYTE),
                        new Enum("transfection", INT_TRANSFECTION),
                        new Enum("transgenic", INT_TRANSGENIC),
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
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.ExpressionSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML low-prec-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface LowPrecData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LowPrecData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("lowprecdataecc2elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$LowPrecData$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuef69battrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$LowPrecData$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRUE
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
                    
                    static final int INT_TRUE = 1;
                    static final int INT_FALSE = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("true", INT_TRUE),
                        new Enum("false", INT_FALSE),
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
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.LowPrecData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML from-homolog(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FromHomolog extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FromHomolog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fromhomologd78celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$FromHomolog$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valueae93attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxEvidenceDocument$TxEvidence$FromHomolog$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRUE
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
                    
                    static final int INT_TRUE = 1;
                    static final int INT_FALSE = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("true", INT_TRUE),
                        new Enum("false", INT_FALSE),
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
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence.FromHomolog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence newInstance() {
              return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TxEvidenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TxEvidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
