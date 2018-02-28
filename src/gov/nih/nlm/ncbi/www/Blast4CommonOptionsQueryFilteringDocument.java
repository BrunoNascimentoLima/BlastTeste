/*
 * An XML document type.
 * Localname: Blast4-common-options-query-filtering
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-common-options-query-filtering(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4CommonOptionsQueryFilteringDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsQueryFilteringDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsqueryfiltering6a11doctype");
    
    /**
     * Gets the "Blast4-common-options-query-filtering" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering getBlast4CommonOptionsQueryFiltering();
    
    /**
     * Sets the "Blast4-common-options-query-filtering" element
     */
    void setBlast4CommonOptionsQueryFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering blast4CommonOptionsQueryFiltering);
    
    /**
     * Appends and returns a new empty "Blast4-common-options-query-filtering" element
     */
    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering addNewBlast4CommonOptionsQueryFiltering();
    
    /**
     * An XML Blast4-common-options-query-filtering(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4CommonOptionsQueryFiltering extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4CommonOptionsQueryFiltering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4commonoptionsqueryfilteringb222elemtype");
        
        /**
         * Gets the "use-seg-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering getUseSegFiltering();
        
        /**
         * True if has "use-seg-filtering" element
         */
        boolean isSetUseSegFiltering();
        
        /**
         * Sets the "use-seg-filtering" element
         */
        void setUseSegFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering useSegFiltering);
        
        /**
         * Appends and returns a new empty "use-seg-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering addNewUseSegFiltering();
        
        /**
         * Unsets the "use-seg-filtering" element
         */
        void unsetUseSegFiltering();
        
        /**
         * Gets the "use-dust-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering getUseDustFiltering();
        
        /**
         * True if has "use-dust-filtering" element
         */
        boolean isSetUseDustFiltering();
        
        /**
         * Sets the "use-dust-filtering" element
         */
        void setUseDustFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering useDustFiltering);
        
        /**
         * Appends and returns a new empty "use-dust-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering addNewUseDustFiltering();
        
        /**
         * Unsets the "use-dust-filtering" element
         */
        void unsetUseDustFiltering();
        
        /**
         * Gets the "mask-for-lookup-table-only" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly getMaskForLookupTableOnly();
        
        /**
         * True if has "mask-for-lookup-table-only" element
         */
        boolean isSetMaskForLookupTableOnly();
        
        /**
         * Sets the "mask-for-lookup-table-only" element
         */
        void setMaskForLookupTableOnly(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly maskForLookupTableOnly);
        
        /**
         * Appends and returns a new empty "mask-for-lookup-table-only" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly addNewMaskForLookupTableOnly();
        
        /**
         * Unsets the "mask-for-lookup-table-only" element
         */
        void unsetMaskForLookupTableOnly();
        
        /**
         * Gets the "repeats-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering getRepeatsFiltering();
        
        /**
         * True if has "repeats-filtering" element
         */
        boolean isSetRepeatsFiltering();
        
        /**
         * Sets the "repeats-filtering" element
         */
        void setRepeatsFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering repeatsFiltering);
        
        /**
         * Appends and returns a new empty "repeats-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering addNewRepeatsFiltering();
        
        /**
         * Unsets the "repeats-filtering" element
         */
        void unsetRepeatsFiltering();
        
        /**
         * Gets the "user-specified-masks" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks getUserSpecifiedMasks();
        
        /**
         * True if has "user-specified-masks" element
         */
        boolean isSetUserSpecifiedMasks();
        
        /**
         * Sets the "user-specified-masks" element
         */
        void setUserSpecifiedMasks(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks userSpecifiedMasks);
        
        /**
         * Appends and returns a new empty "user-specified-masks" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks addNewUserSpecifiedMasks();
        
        /**
         * Unsets the "user-specified-masks" element
         */
        void unsetUserSpecifiedMasks();
        
        /**
         * Gets the "no-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering getNoFiltering();
        
        /**
         * True if has "no-filtering" element
         */
        boolean isSetNoFiltering();
        
        /**
         * Sets the "no-filtering" element
         */
        void setNoFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering noFiltering);
        
        /**
         * Appends and returns a new empty "no-filtering" element
         */
        gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering addNewNoFiltering();
        
        /**
         * Unsets the "no-filtering" element
         */
        void unsetNoFiltering();
        
        /**
         * An XML use-seg-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface UseSegFiltering extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseSegFiltering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("usesegfiltering98baelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$UseSegFiltering$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value4393attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$UseSegFiltering$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML use-dust-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface UseDustFiltering extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseDustFiltering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("usedustfiltering6053elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$UseDustFiltering$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value109aattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$UseDustFiltering$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mask-for-lookup-table-only(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface MaskForLookupTableOnly extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaskForLookupTableOnly.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("maskforlookuptableonly7997elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$MaskForLookupTableOnly$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuef2deattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$MaskForLookupTableOnly$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML repeats-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface RepeatsFiltering extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepeatsFiltering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("repeatsfilteringe323elemtype");
            
            /**
             * Gets the "Blast4-common-options-repeats-filtering" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering getBlast4CommonOptionsRepeatsFiltering();
            
            /**
             * Sets the "Blast4-common-options-repeats-filtering" element
             */
            void setBlast4CommonOptionsRepeatsFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering blast4CommonOptionsRepeatsFiltering);
            
            /**
             * Appends and returns a new empty "Blast4-common-options-repeats-filtering" element
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering addNewBlast4CommonOptionsRepeatsFiltering();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML user-specified-masks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface UserSpecifiedMasks extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserSpecifiedMasks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("userspecifiedmasksa366elemtype");
            
            /**
             * Gets array of all "Blast4-mask" elements
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] getBlast4MaskArray();
            
            /**
             * Gets ith "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4MaskArray(int i);
            
            /**
             * Returns number of "Blast4-mask" element
             */
            int sizeOfBlast4MaskArray();
            
            /**
             * Sets array of all "Blast4-mask" element
             */
            void setBlast4MaskArray(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] blast4MaskArray);
            
            /**
             * Sets ith "Blast4-mask" element
             */
            void setBlast4MaskArray(int i, gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask insertNewBlast4Mask(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask();
            
            /**
             * Removes the ith "Blast4-mask" element
             */
            void removeBlast4Mask(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML no-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface NoFiltering extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NoFiltering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("nofilteringa41celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$NoFiltering$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valued5a3attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$NoFiltering$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
