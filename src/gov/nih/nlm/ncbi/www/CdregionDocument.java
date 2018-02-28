/*
 * An XML document type.
 * Localname: Cdregion
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CdregionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Cdregion(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CdregionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CdregionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cdregiona3f3doctype");
    
    /**
     * Gets the "Cdregion" element
     */
    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion getCdregion();
    
    /**
     * Sets the "Cdregion" element
     */
    void setCdregion(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion cdregion);
    
    /**
     * Appends and returns a new empty "Cdregion" element
     */
    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion addNewCdregion();
    
    /**
     * An XML Cdregion(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Cdregion extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cdregion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cdregion7f82elemtype");
        
        /**
         * Gets the "orf" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf getOrf();
        
        /**
         * True if has "orf" element
         */
        boolean isSetOrf();
        
        /**
         * Sets the "orf" element
         */
        void setOrf(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf orf);
        
        /**
         * Appends and returns a new empty "orf" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf addNewOrf();
        
        /**
         * Unsets the "orf" element
         */
        void unsetOrf();
        
        /**
         * Gets the "frame" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame getFrame();
        
        /**
         * True if has "frame" element
         */
        boolean isSetFrame();
        
        /**
         * Sets the "frame" element
         */
        void setFrame(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame frame);
        
        /**
         * Appends and returns a new empty "frame" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame addNewFrame();
        
        /**
         * Unsets the "frame" element
         */
        void unsetFrame();
        
        /**
         * Gets the "conflict" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict getConflict();
        
        /**
         * True if has "conflict" element
         */
        boolean isSetConflict();
        
        /**
         * Sets the "conflict" element
         */
        void setConflict(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict conflict);
        
        /**
         * Appends and returns a new empty "conflict" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict addNewConflict();
        
        /**
         * Unsets the "conflict" element
         */
        void unsetConflict();
        
        /**
         * Gets the "gaps" element
         */
        java.math.BigInteger getGaps();
        
        /**
         * Gets (as xml) the "gaps" element
         */
        org.apache.xmlbeans.XmlInteger xgetGaps();
        
        /**
         * True if has "gaps" element
         */
        boolean isSetGaps();
        
        /**
         * Sets the "gaps" element
         */
        void setGaps(java.math.BigInteger gaps);
        
        /**
         * Sets (as xml) the "gaps" element
         */
        void xsetGaps(org.apache.xmlbeans.XmlInteger gaps);
        
        /**
         * Unsets the "gaps" element
         */
        void unsetGaps();
        
        /**
         * Gets the "mismatch" element
         */
        java.math.BigInteger getMismatch();
        
        /**
         * Gets (as xml) the "mismatch" element
         */
        org.apache.xmlbeans.XmlInteger xgetMismatch();
        
        /**
         * True if has "mismatch" element
         */
        boolean isSetMismatch();
        
        /**
         * Sets the "mismatch" element
         */
        void setMismatch(java.math.BigInteger mismatch);
        
        /**
         * Sets (as xml) the "mismatch" element
         */
        void xsetMismatch(org.apache.xmlbeans.XmlInteger mismatch);
        
        /**
         * Unsets the "mismatch" element
         */
        void unsetMismatch();
        
        /**
         * Gets the "code" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code getCode();
        
        /**
         * True if has "code" element
         */
        boolean isSetCode();
        
        /**
         * Sets the "code" element
         */
        void setCode(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code code);
        
        /**
         * Appends and returns a new empty "code" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code addNewCode();
        
        /**
         * Unsets the "code" element
         */
        void unsetCode();
        
        /**
         * Gets the "code-break" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak getCodeBreak();
        
        /**
         * True if has "code-break" element
         */
        boolean isSetCodeBreak();
        
        /**
         * Sets the "code-break" element
         */
        void setCodeBreak(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak codeBreak);
        
        /**
         * Appends and returns a new empty "code-break" element
         */
        gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak addNewCodeBreak();
        
        /**
         * Unsets the "code-break" element
         */
        void unsetCodeBreak();
        
        /**
         * Gets the "stops" element
         */
        java.math.BigInteger getStops();
        
        /**
         * Gets (as xml) the "stops" element
         */
        org.apache.xmlbeans.XmlInteger xgetStops();
        
        /**
         * True if has "stops" element
         */
        boolean isSetStops();
        
        /**
         * Sets the "stops" element
         */
        void setStops(java.math.BigInteger stops);
        
        /**
         * Sets (as xml) the "stops" element
         */
        void xsetStops(org.apache.xmlbeans.XmlInteger stops);
        
        /**
         * Unsets the "stops" element
         */
        void unsetStops();
        
        /**
         * An XML orf(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Orf extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Orf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orfad11elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Orf$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value88eaattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Orf$Value.
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
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf newInstance() {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML frame(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Frame extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Frame.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("frame371belemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Frame$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value80b4attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum ONE = Enum.forString("one");
                static final Enum TWO = Enum.forString("two");
                static final Enum THREE = Enum.forString("three");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_ONE = Enum.INT_ONE;
                static final int INT_TWO = Enum.INT_TWO;
                static final int INT_THREE = Enum.INT_THREE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Frame$Value.
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
                    static final int INT_ONE = 2;
                    static final int INT_TWO = 3;
                    static final int INT_THREE = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("one", INT_ONE),
                        new Enum("two", INT_TWO),
                        new Enum("three", INT_THREE),
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
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame newInstance() {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML conflict(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Conflict extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Conflict.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("conflict6470elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Conflict$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value0837attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Conflict$Value.
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
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict newInstance() {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML code(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Code extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("code95cbelemtype");
            
            /**
             * Gets the "Genetic-code" element
             */
            gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode getGeneticCode();
            
            /**
             * Sets the "Genetic-code" element
             */
            void setGeneticCode(gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode geneticCode);
            
            /**
             * Appends and returns a new empty "Genetic-code" element
             */
            gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode addNewGeneticCode();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code newInstance() {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML code-break(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface CodeBreak extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeBreak.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("codebreakda7delemtype");
            
            /**
             * Gets array of all "Code-break" elements
             */
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak[] getCodeBreakArray();
            
            /**
             * Gets ith "Code-break" element
             */
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak getCodeBreakArray(int i);
            
            /**
             * Returns number of "Code-break" element
             */
            int sizeOfCodeBreakArray();
            
            /**
             * Sets array of all "Code-break" element
             */
            void setCodeBreakArray(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak[] codeBreakArray);
            
            /**
             * Sets ith "Code-break" element
             */
            void setCodeBreakArray(int i, gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak codeBreak);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Code-break" element
             */
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak insertNewCodeBreak(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Code-break" element
             */
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak addNewCodeBreak();
            
            /**
             * Removes the ith "Code-break" element
             */
            void removeCodeBreak(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak newInstance() {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion newInstance() {
              return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CdregionDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CdregionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CdregionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
