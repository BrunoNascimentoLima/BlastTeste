/*
 * An XML document type.
 * Localname: Variation-inst
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.VariationInstDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Variation-inst(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface VariationInstDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariationInstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variationinste1dedoctype");
    
    /**
     * Gets the "Variation-inst" element
     */
    gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst getVariationInst();
    
    /**
     * Sets the "Variation-inst" element
     */
    void setVariationInst(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst variationInst);
    
    /**
     * Appends and returns a new empty "Variation-inst" element
     */
    gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst addNewVariationInst();
    
    /**
     * An XML Variation-inst(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface VariationInst extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariationInst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variationinstd6e2elemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type addNewType();
        
        /**
         * Gets the "delta" element
         */
        gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta getDelta();
        
        /**
         * Sets the "delta" element
         */
        void setDelta(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta delta);
        
        /**
         * Appends and returns a new empty "delta" element
         */
        gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta addNewDelta();
        
        /**
         * Gets the "observation" element
         */
        gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation getObservation();
        
        /**
         * True if has "observation" element
         */
        boolean isSetObservation();
        
        /**
         * Sets the "observation" element
         */
        void setObservation(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation observation);
        
        /**
         * Appends and returns a new empty "observation" element
         */
        gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation addNewObservation();
        
        /**
         * Unsets the "observation" element
         */
        void unsetObservation();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("typeb038elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value9cffattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum IDENTITY = Enum.forString("identity");
                static final Enum INV = Enum.forString("inv");
                static final Enum SNV = Enum.forString("snv");
                static final Enum MNP = Enum.forString("mnp");
                static final Enum DELINS = Enum.forString("delins");
                static final Enum DEL = Enum.forString("del");
                static final Enum INS = Enum.forString("ins");
                static final Enum MICROSATELLITE = Enum.forString("microsatellite");
                static final Enum TRANSPOSON = Enum.forString("transposon");
                static final Enum CNV = Enum.forString("cnv");
                static final Enum DIRECT_COPY = Enum.forString("direct-copy");
                static final Enum REV_DIRECT_COPY = Enum.forString("rev-direct-copy");
                static final Enum INVERTED_COPY = Enum.forString("inverted-copy");
                static final Enum EVERTED_COPY = Enum.forString("everted-copy");
                static final Enum TRANSLOCATION = Enum.forString("translocation");
                static final Enum PROT_MISSENSE = Enum.forString("prot-missense");
                static final Enum PROT_NONSENSE = Enum.forString("prot-nonsense");
                static final Enum PROT_NEUTRAL = Enum.forString("prot-neutral");
                static final Enum PROT_SILENT = Enum.forString("prot-silent");
                static final Enum PROT_OTHER = Enum.forString("prot-other");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_IDENTITY = Enum.INT_IDENTITY;
                static final int INT_INV = Enum.INT_INV;
                static final int INT_SNV = Enum.INT_SNV;
                static final int INT_MNP = Enum.INT_MNP;
                static final int INT_DELINS = Enum.INT_DELINS;
                static final int INT_DEL = Enum.INT_DEL;
                static final int INT_INS = Enum.INT_INS;
                static final int INT_MICROSATELLITE = Enum.INT_MICROSATELLITE;
                static final int INT_TRANSPOSON = Enum.INT_TRANSPOSON;
                static final int INT_CNV = Enum.INT_CNV;
                static final int INT_DIRECT_COPY = Enum.INT_DIRECT_COPY;
                static final int INT_REV_DIRECT_COPY = Enum.INT_REV_DIRECT_COPY;
                static final int INT_INVERTED_COPY = Enum.INT_INVERTED_COPY;
                static final int INT_EVERTED_COPY = Enum.INT_EVERTED_COPY;
                static final int INT_TRANSLOCATION = Enum.INT_TRANSLOCATION;
                static final int INT_PROT_MISSENSE = Enum.INT_PROT_MISSENSE;
                static final int INT_PROT_NONSENSE = Enum.INT_PROT_NONSENSE;
                static final int INT_PROT_NEUTRAL = Enum.INT_PROT_NEUTRAL;
                static final int INT_PROT_SILENT = Enum.INT_PROT_SILENT;
                static final int INT_PROT_OTHER = Enum.INT_PROT_OTHER;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Type$Value.
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
                    static final int INT_IDENTITY = 2;
                    static final int INT_INV = 3;
                    static final int INT_SNV = 4;
                    static final int INT_MNP = 5;
                    static final int INT_DELINS = 6;
                    static final int INT_DEL = 7;
                    static final int INT_INS = 8;
                    static final int INT_MICROSATELLITE = 9;
                    static final int INT_TRANSPOSON = 10;
                    static final int INT_CNV = 11;
                    static final int INT_DIRECT_COPY = 12;
                    static final int INT_REV_DIRECT_COPY = 13;
                    static final int INT_INVERTED_COPY = 14;
                    static final int INT_EVERTED_COPY = 15;
                    static final int INT_TRANSLOCATION = 16;
                    static final int INT_PROT_MISSENSE = 17;
                    static final int INT_PROT_NONSENSE = 18;
                    static final int INT_PROT_NEUTRAL = 19;
                    static final int INT_PROT_SILENT = 20;
                    static final int INT_PROT_OTHER = 21;
                    static final int INT_OTHER = 22;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("identity", INT_IDENTITY),
                        new Enum("inv", INT_INV),
                        new Enum("snv", INT_SNV),
                        new Enum("mnp", INT_MNP),
                        new Enum("delins", INT_DELINS),
                        new Enum("del", INT_DEL),
                        new Enum("ins", INT_INS),
                        new Enum("microsatellite", INT_MICROSATELLITE),
                        new Enum("transposon", INT_TRANSPOSON),
                        new Enum("cnv", INT_CNV),
                        new Enum("direct-copy", INT_DIRECT_COPY),
                        new Enum("rev-direct-copy", INT_REV_DIRECT_COPY),
                        new Enum("inverted-copy", INT_INVERTED_COPY),
                        new Enum("everted-copy", INT_EVERTED_COPY),
                        new Enum("translocation", INT_TRANSLOCATION),
                        new Enum("prot-missense", INT_PROT_MISSENSE),
                        new Enum("prot-nonsense", INT_PROT_NONSENSE),
                        new Enum("prot-neutral", INT_PROT_NEUTRAL),
                        new Enum("prot-silent", INT_PROT_SILENT),
                        new Enum("prot-other", INT_PROT_OTHER),
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
                    public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML delta(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Delta extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Delta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("delta4206elemtype");
            
            /**
             * Gets array of all "Delta-item" elements
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem[] getDeltaItemArray();
            
            /**
             * Gets ith "Delta-item" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem getDeltaItemArray(int i);
            
            /**
             * Returns number of "Delta-item" element
             */
            int sizeOfDeltaItemArray();
            
            /**
             * Sets array of all "Delta-item" element
             */
            void setDeltaItemArray(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem[] deltaItemArray);
            
            /**
             * Sets ith "Delta-item" element
             */
            void setDeltaItemArray(int i, gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem deltaItem);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Delta-item" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem insertNewDeltaItem(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Delta-item" element
             */
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem addNewDeltaItem();
            
            /**
             * Removes the ith "Delta-item" element
             */
            void removeDeltaItem(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Delta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML observation(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Observation.
         */
        public interface Observation extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Observation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("observation5d7aelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Observation$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valued2d3attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum ASSERTED = Enum.forString("asserted");
                static final Enum REFERENCE = Enum.forString("reference");
                static final Enum VARIANT = Enum.forString("variant");
                
                static final int INT_ASSERTED = Enum.INT_ASSERTED;
                static final int INT_REFERENCE = Enum.INT_REFERENCE;
                static final int INT_VARIANT = Enum.INT_VARIANT;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariationInstDocument$VariationInst$Observation$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_ASSERTED
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
                    
                    static final int INT_ASSERTED = 1;
                    static final int INT_REFERENCE = 2;
                    static final int INT_VARIANT = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("asserted", INT_ASSERTED),
                        new Enum("reference", INT_REFERENCE),
                        new Enum("variant", INT_VARIANT),
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
                    public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst newInstance() {
              return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.VariationInstDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.VariationInstDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.VariationInstDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
