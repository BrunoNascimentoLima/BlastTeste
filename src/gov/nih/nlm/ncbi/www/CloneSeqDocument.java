/*
 * An XML document type.
 * Localname: Clone-seq
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CloneSeqDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Clone-seq(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CloneSeqDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CloneSeqDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cloneseq853bdoctype");
    
    /**
     * Gets the "Clone-seq" element
     */
    gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq getCloneSeq();
    
    /**
     * Sets the "Clone-seq" element
     */
    void setCloneSeq(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq cloneSeq);
    
    /**
     * Appends and returns a new empty "Clone-seq" element
     */
    gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq addNewCloneSeq();
    
    /**
     * An XML Clone-seq(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CloneSeq extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CloneSeq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cloneseqc876elemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type addNewType();
        
        /**
         * Gets the "confidence" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence getConfidence();
        
        /**
         * True if has "confidence" element
         */
        boolean isSetConfidence();
        
        /**
         * Sets the "confidence" element
         */
        void setConfidence(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence confidence);
        
        /**
         * Appends and returns a new empty "confidence" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence addNewConfidence();
        
        /**
         * Unsets the "confidence" element
         */
        void unsetConfidence();
        
        /**
         * Gets the "location" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location getLocation();
        
        /**
         * Sets the "location" element
         */
        void setLocation(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location location);
        
        /**
         * Appends and returns a new empty "location" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location addNewLocation();
        
        /**
         * Gets the "seq" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq getSeq();
        
        /**
         * True if has "seq" element
         */
        boolean isSetSeq();
        
        /**
         * Sets the "seq" element
         */
        void setSeq(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq seq);
        
        /**
         * Appends and returns a new empty "seq" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq addNewSeq();
        
        /**
         * Unsets the "seq" element
         */
        void unsetSeq();
        
        /**
         * Gets the "align-id" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId getAlignId();
        
        /**
         * True if has "align-id" element
         */
        boolean isSetAlignId();
        
        /**
         * Sets the "align-id" element
         */
        void setAlignId(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId alignId);
        
        /**
         * Appends and returns a new empty "align-id" element
         */
        gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId addNewAlignId();
        
        /**
         * Unsets the "align-id" element
         */
        void unsetAlignId();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("type354celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value1ed3attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum INSERT = Enum.forString("insert");
                static final Enum END = Enum.forString("end");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_INSERT = Enum.INT_INSERT;
                static final int INT_END = Enum.INT_END;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Type$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_INSERT
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
                    
                    static final int INT_INSERT = 1;
                    static final int INT_END = 2;
                    static final int INT_OTHER = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("insert", INT_INSERT),
                        new Enum("end", INT_END),
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
                    public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML confidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Confidence.
         */
        public interface Confidence extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Confidence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("confidence2a9celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Confidence$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value92e3attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum MULTIPLE = Enum.forString("multiple");
                static final Enum NA = Enum.forString("na");
                static final Enum NOHIT_REP = Enum.forString("nohit-rep");
                static final Enum NOHITNOREP = Enum.forString("nohitnorep");
                static final Enum OTHER_CHRM = Enum.forString("other-chrm");
                static final Enum UNIQUE = Enum.forString("unique");
                static final Enum VIRTUAL = Enum.forString("virtual");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_MULTIPLE = Enum.INT_MULTIPLE;
                static final int INT_NA = Enum.INT_NA;
                static final int INT_NOHIT_REP = Enum.INT_NOHIT_REP;
                static final int INT_NOHITNOREP = Enum.INT_NOHITNOREP;
                static final int INT_OTHER_CHRM = Enum.INT_OTHER_CHRM;
                static final int INT_UNIQUE = Enum.INT_UNIQUE;
                static final int INT_VIRTUAL = Enum.INT_VIRTUAL;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.CloneSeqDocument$CloneSeq$Confidence$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_MULTIPLE
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
                    
                    static final int INT_MULTIPLE = 1;
                    static final int INT_NA = 2;
                    static final int INT_NOHIT_REP = 3;
                    static final int INT_NOHITNOREP = 4;
                    static final int INT_OTHER_CHRM = 5;
                    static final int INT_UNIQUE = 6;
                    static final int INT_VIRTUAL = 7;
                    static final int INT_OTHER = 8;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("multiple", INT_MULTIPLE),
                        new Enum("na", INT_NA),
                        new Enum("nohit-rep", INT_NOHIT_REP),
                        new Enum("nohitnorep", INT_NOHITNOREP),
                        new Enum("other-chrm", INT_OTHER_CHRM),
                        new Enum("unique", INT_UNIQUE),
                        new Enum("virtual", INT_VIRTUAL),
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
                    public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence newInstance() {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Confidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Location extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Location.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("location8247elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location newInstance() {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seq extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seq55c1elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq newInstance() {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML align-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface AlignId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlignId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("alignid4c75elemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId newInstance() {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq.AlignId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq newInstance() {
              return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CloneSeqDocument.CloneSeq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CloneSeqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CloneSeqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
