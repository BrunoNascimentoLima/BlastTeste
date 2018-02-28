/*
 * An XML document type.
 * Localname: Seq-hist
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqHistDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-hist(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqHistDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqHistDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqhist4eaedoctype");
    
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
     * An XML Seq-hist(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqHist extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqHist.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqhist0ca2elemtype");
        
        /**
         * Gets the "assembly" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly getAssembly();
        
        /**
         * True if has "assembly" element
         */
        boolean isSetAssembly();
        
        /**
         * Sets the "assembly" element
         */
        void setAssembly(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly assembly);
        
        /**
         * Appends and returns a new empty "assembly" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly addNewAssembly();
        
        /**
         * Unsets the "assembly" element
         */
        void unsetAssembly();
        
        /**
         * Gets the "replaces" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces getReplaces();
        
        /**
         * True if has "replaces" element
         */
        boolean isSetReplaces();
        
        /**
         * Sets the "replaces" element
         */
        void setReplaces(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces replaces);
        
        /**
         * Appends and returns a new empty "replaces" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces addNewReplaces();
        
        /**
         * Unsets the "replaces" element
         */
        void unsetReplaces();
        
        /**
         * Gets the "replaced-by" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy getReplacedBy();
        
        /**
         * True if has "replaced-by" element
         */
        boolean isSetReplacedBy();
        
        /**
         * Sets the "replaced-by" element
         */
        void setReplacedBy(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy replacedBy);
        
        /**
         * Appends and returns a new empty "replaced-by" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy addNewReplacedBy();
        
        /**
         * Unsets the "replaced-by" element
         */
        void unsetReplacedBy();
        
        /**
         * Gets the "deleted" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted getDeleted();
        
        /**
         * True if has "deleted" element
         */
        boolean isSetDeleted();
        
        /**
         * Sets the "deleted" element
         */
        void setDeleted(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted deleted);
        
        /**
         * Appends and returns a new empty "deleted" element
         */
        gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted addNewDeleted();
        
        /**
         * Unsets the "deleted" element
         */
        void unsetDeleted();
        
        /**
         * An XML assembly(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Assembly extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Assembly.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("assemblyd6a4elemtype");
            
            /**
             * Gets array of all "Seq-align" elements
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] getSeqAlignArray();
            
            /**
             * Gets ith "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlignArray(int i);
            
            /**
             * Returns number of "Seq-align" element
             */
            int sizeOfSeqAlignArray();
            
            /**
             * Sets array of all "Seq-align" element
             */
            void setSeqAlignArray(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] seqAlignArray);
            
            /**
             * Sets ith "Seq-align" element
             */
            void setSeqAlignArray(int i, gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign insertNewSeqAlign(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign();
            
            /**
             * Removes the ith "Seq-align" element
             */
            void removeSeqAlign(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Assembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML replaces(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Replaces extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Replaces.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("replaces14bdelemtype");
            
            /**
             * Gets the "Seq-hist-rec" element
             */
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec getSeqHistRec();
            
            /**
             * Sets the "Seq-hist-rec" element
             */
            void setSeqHistRec(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec seqHistRec);
            
            /**
             * Appends and returns a new empty "Seq-hist-rec" element
             */
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec addNewSeqHistRec();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Replaces) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML replaced-by(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ReplacedBy extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReplacedBy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("replacedbyb822elemtype");
            
            /**
             * Gets the "Seq-hist-rec" element
             */
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec getSeqHistRec();
            
            /**
             * Sets the "Seq-hist-rec" element
             */
            void setSeqHistRec(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec seqHistRec);
            
            /**
             * Appends and returns a new empty "Seq-hist-rec" element
             */
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec addNewSeqHistRec();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.ReplacedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML deleted(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Deleted extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Deleted.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("deleted4de7elemtype");
            
            /**
             * Gets the "bool" element
             */
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool getBool();
            
            /**
             * True if has "bool" element
             */
            boolean isSetBool();
            
            /**
             * Sets the "bool" element
             */
            void setBool(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool bool);
            
            /**
             * Appends and returns a new empty "bool" element
             */
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool addNewBool();
            
            /**
             * Unsets the "bool" element
             */
            void unsetBool();
            
            /**
             * Gets the "date" element
             */
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date getDate();
            
            /**
             * True if has "date" element
             */
            boolean isSetDate();
            
            /**
             * Sets the "date" element
             */
            void setDate(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date date);
            
            /**
             * Appends and returns a new empty "date" element
             */
            gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date addNewDate();
            
            /**
             * Unsets the "date" element
             */
            void unsetDate();
            
            /**
             * An XML bool(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Bool extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bool.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bool086delemtype");
                
                /**
                 * Gets the "value" attribute
                 */
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value.Enum getValue();
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value xgetValue();
                
                /**
                 * Sets the "value" attribute
                 */
                void setValue(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value.Enum value);
                
                /**
                 * Sets (as xml) the "value" attribute
                 */
                void xsetValue(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value value);
                
                /**
                 * An XML value(@).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqHistDocument$SeqHist$Deleted$Bool$Value.
                 */
                public interface Value extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value7af4attrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum TRUE = Enum.forString("true");
                    static final Enum FALSE = Enum.forString("false");
                    
                    static final int INT_TRUE = Enum.INT_TRUE;
                    static final int INT_FALSE = Enum.INT_FALSE;
                    
                    /**
                     * Enumeration value class for gov.nih.nlm.ncbi.www.SeqHistDocument$SeqHist$Deleted$Bool$Value.
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
                      public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value newValue(java.lang.Object obj) {
                        return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value) type.newValue( obj ); }
                      
                      public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value newInstance() {
                        return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Bool) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML date(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Date extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("date9f31elemtype");
                
                /**
                 * Gets the "Date" element
                 */
                gov.nih.nlm.ncbi.www.DateDocument.Date getDate();
                
                /**
                 * Sets the "Date" element
                 */
                void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date);
                
                /**
                 * Appends and returns a new empty "Date" element
                 */
                gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist.Deleted) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqHistDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqHistDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqHistDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
