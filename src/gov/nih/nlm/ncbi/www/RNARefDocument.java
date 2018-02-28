/*
 * An XML document type.
 * Localname: RNA-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RNARefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one RNA-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface RNARefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RNARefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rnarefb977doctype");
    
    /**
     * Gets the "RNA-ref" element
     */
    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef getRNARef();
    
    /**
     * Sets the "RNA-ref" element
     */
    void setRNARef(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef rnaRef);
    
    /**
     * Appends and returns a new empty "RNA-ref" element
     */
    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef addNewRNARef();
    
    /**
     * An XML RNA-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface RNARef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RNARef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rnaref34eeelemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type addNewType();
        
        /**
         * Gets the "pseudo" element
         */
        gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo getPseudo();
        
        /**
         * True if has "pseudo" element
         */
        boolean isSetPseudo();
        
        /**
         * Sets the "pseudo" element
         */
        void setPseudo(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo pseudo);
        
        /**
         * Appends and returns a new empty "pseudo" element
         */
        gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo addNewPseudo();
        
        /**
         * Unsets the "pseudo" element
         */
        void unsetPseudo();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Type extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("type7cc4elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.RNARefDocument$RNARef$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value41cbattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum PREMSG = Enum.forString("premsg");
                static final Enum M_RNA = Enum.forString("mRNA");
                static final Enum T_RNA = Enum.forString("tRNA");
                static final Enum R_RNA = Enum.forString("rRNA");
                static final Enum SN_RNA = Enum.forString("snRNA");
                static final Enum SC_RNA = Enum.forString("scRNA");
                static final Enum SNO_RNA = Enum.forString("snoRNA");
                static final Enum NC_RNA = Enum.forString("ncRNA");
                static final Enum TM_RNA = Enum.forString("tmRNA");
                static final Enum MISC_RNA = Enum.forString("miscRNA");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_PREMSG = Enum.INT_PREMSG;
                static final int INT_M_RNA = Enum.INT_M_RNA;
                static final int INT_T_RNA = Enum.INT_T_RNA;
                static final int INT_R_RNA = Enum.INT_R_RNA;
                static final int INT_SN_RNA = Enum.INT_SN_RNA;
                static final int INT_SC_RNA = Enum.INT_SC_RNA;
                static final int INT_SNO_RNA = Enum.INT_SNO_RNA;
                static final int INT_NC_RNA = Enum.INT_NC_RNA;
                static final int INT_TM_RNA = Enum.INT_TM_RNA;
                static final int INT_MISC_RNA = Enum.INT_MISC_RNA;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.RNARefDocument$RNARef$Type$Value.
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
                    static final int INT_PREMSG = 2;
                    static final int INT_M_RNA = 3;
                    static final int INT_T_RNA = 4;
                    static final int INT_R_RNA = 5;
                    static final int INT_SN_RNA = 6;
                    static final int INT_SC_RNA = 7;
                    static final int INT_SNO_RNA = 8;
                    static final int INT_NC_RNA = 9;
                    static final int INT_TM_RNA = 10;
                    static final int INT_MISC_RNA = 11;
                    static final int INT_OTHER = 12;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("premsg", INT_PREMSG),
                        new Enum("mRNA", INT_M_RNA),
                        new Enum("tRNA", INT_T_RNA),
                        new Enum("rRNA", INT_R_RNA),
                        new Enum("snRNA", INT_SN_RNA),
                        new Enum("scRNA", INT_SC_RNA),
                        new Enum("snoRNA", INT_SNO_RNA),
                        new Enum("ncRNA", INT_NC_RNA),
                        new Enum("tmRNA", INT_TM_RNA),
                        new Enum("miscRNA", INT_MISC_RNA),
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
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pseudo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pseudo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pseudo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pseudo9148elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.RNARefDocument$RNARef$Pseudo$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value308fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.RNARefDocument$RNARef$Pseudo$Value.
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
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo newInstance() {
                  return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("exta17belemtype");
            
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
             * Gets the "tRNA" element
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA getTRNA();
            
            /**
             * True if has "tRNA" element
             */
            boolean isSetTRNA();
            
            /**
             * Sets the "tRNA" element
             */
            void setTRNA(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA trna);
            
            /**
             * Appends and returns a new empty "tRNA" element
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA addNewTRNA();
            
            /**
             * Unsets the "tRNA" element
             */
            void unsetTRNA();
            
            /**
             * Gets the "gen" element
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen getGen();
            
            /**
             * True if has "gen" element
             */
            boolean isSetGen();
            
            /**
             * Sets the "gen" element
             */
            void setGen(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen gen);
            
            /**
             * Appends and returns a new empty "gen" element
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen addNewGen();
            
            /**
             * Unsets the "gen" element
             */
            void unsetGen();
            
            /**
             * An XML tRNA(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface TRNA extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TRNA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("trnad2e8elemtype");
                
                /**
                 * Gets the "Trna-ext" element
                 */
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt getTrnaExt();
                
                /**
                 * Sets the "Trna-ext" element
                 */
                void setTrnaExt(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt trnaExt);
                
                /**
                 * Appends and returns a new empty "Trna-ext" element
                 */
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt addNewTrnaExt();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA newInstance() {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML gen(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Gen extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gen9c37elemtype");
                
                /**
                 * Gets the "RNA-gen" element
                 */
                gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen getRNAGen();
                
                /**
                 * Sets the "RNA-gen" element
                 */
                void setRNAGen(gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen rnaGen);
                
                /**
                 * Appends and returns a new empty "RNA-gen" element
                 */
                gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen addNewRNAGen();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen newInstance() {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef newInstance() {
              return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.RNARefDocument.RNARef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.RNARefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.RNARefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.RNARefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
