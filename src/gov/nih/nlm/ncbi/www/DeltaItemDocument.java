/*
 * An XML document type.
 * Localname: Delta-item
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DeltaItemDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Delta-item(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface DeltaItemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeltaItemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("deltaitemf4a6doctype");
    
    /**
     * Gets the "Delta-item" element
     */
    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem getDeltaItem();
    
    /**
     * Sets the "Delta-item" element
     */
    void setDeltaItem(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem deltaItem);
    
    /**
     * Appends and returns a new empty "Delta-item" element
     */
    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem addNewDeltaItem();
    
    /**
     * An XML Delta-item(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface DeltaItem extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeltaItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("deltaitem6662elemtype");
        
        /**
         * Gets the "seq" element
         */
        gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq getSeq();
        
        /**
         * True if has "seq" element
         */
        boolean isSetSeq();
        
        /**
         * Sets the "seq" element
         */
        void setSeq(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq seq);
        
        /**
         * Appends and returns a new empty "seq" element
         */
        gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq addNewSeq();
        
        /**
         * Unsets the "seq" element
         */
        void unsetSeq();
        
        /**
         * Gets the "multiplier" element
         */
        java.math.BigInteger getMultiplier();
        
        /**
         * Gets (as xml) the "multiplier" element
         */
        org.apache.xmlbeans.XmlInteger xgetMultiplier();
        
        /**
         * True if has "multiplier" element
         */
        boolean isSetMultiplier();
        
        /**
         * Sets the "multiplier" element
         */
        void setMultiplier(java.math.BigInteger multiplier);
        
        /**
         * Sets (as xml) the "multiplier" element
         */
        void xsetMultiplier(org.apache.xmlbeans.XmlInteger multiplier);
        
        /**
         * Unsets the "multiplier" element
         */
        void unsetMultiplier();
        
        /**
         * Gets the "multiplier-fuzz" element
         */
        gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz getMultiplierFuzz();
        
        /**
         * True if has "multiplier-fuzz" element
         */
        boolean isSetMultiplierFuzz();
        
        /**
         * Sets the "multiplier-fuzz" element
         */
        void setMultiplierFuzz(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz multiplierFuzz);
        
        /**
         * Appends and returns a new empty "multiplier-fuzz" element
         */
        gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz addNewMultiplierFuzz();
        
        /**
         * Unsets the "multiplier-fuzz" element
         */
        void unsetMultiplierFuzz();
        
        /**
         * Gets the "action" element
         */
        gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action getAction();
        
        /**
         * True if has "action" element
         */
        boolean isSetAction();
        
        /**
         * Sets the "action" element
         */
        void setAction(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action action);
        
        /**
         * Appends and returns a new empty "action" element
         */
        gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action addNewAction();
        
        /**
         * Unsets the "action" element
         */
        void unsetAction();
        
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seq extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqccedelemtype");
            
            /**
             * Gets the "literal" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal getLiteral();
            
            /**
             * True if has "literal" element
             */
            boolean isSetLiteral();
            
            /**
             * Sets the "literal" element
             */
            void setLiteral(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal literal);
            
            /**
             * Appends and returns a new empty "literal" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal addNewLiteral();
            
            /**
             * Unsets the "literal" element
             */
            void unsetLiteral();
            
            /**
             * Gets the "loc" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc getLoc();
            
            /**
             * True if has "loc" element
             */
            boolean isSetLoc();
            
            /**
             * Sets the "loc" element
             */
            void setLoc(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc loc);
            
            /**
             * Appends and returns a new empty "loc" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc addNewLoc();
            
            /**
             * Unsets the "loc" element
             */
            void unsetLoc();
            
            /**
             * Gets the "this" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This getThis();
            
            /**
             * True if has "this" element
             */
            boolean isSetThis();
            
            /**
             * Sets the "this" element
             */
            void setThis(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This xthis);
            
            /**
             * Appends and returns a new empty "this" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This addNewThis();
            
            /**
             * Unsets the "this" element
             */
            void unsetThis();
            
            /**
             * An XML literal(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Literal extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Literal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("literalf788elemtype");
                
                /**
                 * Gets the "Seq-literal" element
                 */
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral getSeqLiteral();
                
                /**
                 * Sets the "Seq-literal" element
                 */
                void setSeqLiteral(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral seqLiteral);
                
                /**
                 * Appends and returns a new empty "Seq-literal" element
                 */
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral addNewSeqLiteral();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal newInstance() {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML loc(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Loc extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("locd699elemtype");
                
                /**
                 * Gets the "Seq-loc" element
                 */
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
                
                /**
                 * Sets the "Seq-loc" element
                 */
                void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
                
                /**
                 * Appends and returns a new empty "Seq-loc" element
                 */
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc newInstance() {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML this(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface This extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(This.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("thisf527elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This newInstance() {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq newInstance() {
                  return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML multiplier-fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface MultiplierFuzz extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MultiplierFuzz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("multiplierfuzz3869elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz newInstance() {
                  return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML action(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.DeltaItemDocument$DeltaItem$Action.
         */
        public interface Action extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("action09b4elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.DeltaItemDocument$DeltaItem$Action$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valued7bbattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum MORPH = Enum.forString("morph");
                static final Enum OFFSET = Enum.forString("offset");
                static final Enum DEL_AT = Enum.forString("del-at");
                static final Enum INS_BEFORE = Enum.forString("ins-before");
                
                static final int INT_MORPH = Enum.INT_MORPH;
                static final int INT_OFFSET = Enum.INT_OFFSET;
                static final int INT_DEL_AT = Enum.INT_DEL_AT;
                static final int INT_INS_BEFORE = Enum.INT_INS_BEFORE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.DeltaItemDocument$DeltaItem$Action$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_MORPH
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
                    
                    static final int INT_MORPH = 1;
                    static final int INT_OFFSET = 2;
                    static final int INT_DEL_AT = 3;
                    static final int INT_INS_BEFORE = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("morph", INT_MORPH),
                        new Enum("offset", INT_OFFSET),
                        new Enum("del-at", INT_DEL_AT),
                        new Enum("ins-before", INT_INS_BEFORE),
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
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action newInstance() {
                  return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem newInstance() {
              return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.DeltaItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.DeltaItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
