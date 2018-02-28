/*
 * An XML document type.
 * Localname: Blast4-get-sequences-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-get-sequences-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4GetSequencesRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetSequencesRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getsequencesrequest1e6adoctype");
    
    /**
     * Gets the "Blast4-get-sequences-request" element
     */
    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest getBlast4GetSequencesRequest();
    
    /**
     * Sets the "Blast4-get-sequences-request" element
     */
    void setBlast4GetSequencesRequest(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest blast4GetSequencesRequest);
    
    /**
     * Appends and returns a new empty "Blast4-get-sequences-request" element
     */
    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest addNewBlast4GetSequencesRequest();
    
    /**
     * An XML Blast4-get-sequences-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4GetSequencesRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4GetSequencesRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4getsequencesrequestc8a2elemtype");
        
        /**
         * Gets the "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database getDatabase();
        
        /**
         * Sets the "database" element
         */
        void setDatabase(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database database);
        
        /**
         * Appends and returns a new empty "database" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database addNewDatabase();
        
        /**
         * Gets the "seq-ids" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds getSeqIds();
        
        /**
         * Sets the "seq-ids" element
         */
        void setSeqIds(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds seqIds);
        
        /**
         * Appends and returns a new empty "seq-ids" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds addNewSeqIds();
        
        /**
         * Gets the "skip-seq-data" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData getSkipSeqData();
        
        /**
         * True if has "skip-seq-data" element
         */
        boolean isSetSkipSeqData();
        
        /**
         * Sets the "skip-seq-data" element
         */
        void setSkipSeqData(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData skipSeqData);
        
        /**
         * Appends and returns a new empty "skip-seq-data" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData addNewSkipSeqData();
        
        /**
         * Unsets the "skip-seq-data" element
         */
        void unsetSkipSeqData();
        
        /**
         * Gets the "target-only" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly getTargetOnly();
        
        /**
         * True if has "target-only" element
         */
        boolean isSetTargetOnly();
        
        /**
         * Sets the "target-only" element
         */
        void setTargetOnly(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly targetOnly);
        
        /**
         * Appends and returns a new empty "target-only" element
         */
        gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly addNewTargetOnly();
        
        /**
         * Unsets the "target-only" element
         */
        void unsetTargetOnly();
        
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Database extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Database.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("database93f9elemtype");
            
            /**
             * Gets the "Blast4-database" element
             */
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database getBlast4Database();
            
            /**
             * Sets the "Blast4-database" element
             */
            void setBlast4Database(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database blast4Database);
            
            /**
             * Appends and returns a new empty "Blast4-database" element
             */
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database addNewBlast4Database();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqIds extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqIds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqids1dd8elemtype");
            
            /**
             * Gets array of all "Seq-id" elements
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray();
            
            /**
             * Gets ith "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i);
            
            /**
             * Returns number of "Seq-id" element
             */
            int sizeOfSeqIdArray();
            
            /**
             * Sets array of all "Seq-id" element
             */
            void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray);
            
            /**
             * Sets ith "Seq-id" element
             */
            void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * Removes the ith "Seq-id" element
             */
            void removeSeqId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML skip-seq-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SkipSeqData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SkipSeqData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("skipseqdata1974elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument$Blast4GetSequencesRequest$SkipSeqData$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value6d0dattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument$Blast4GetSequencesRequest$SkipSeqData$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML target-only(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface TargetOnly extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TargetOnly.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("targetonlyd276elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument$Blast4GetSequencesRequest$TargetOnly$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value384fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument$Blast4GetSequencesRequest$TargetOnly$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
