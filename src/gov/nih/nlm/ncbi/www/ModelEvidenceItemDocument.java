/*
 * An XML document type.
 * Localname: ModelEvidenceItem
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one ModelEvidenceItem(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface ModelEvidenceItemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelEvidenceItemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modelevidenceitemdc1fdoctype");
    
    /**
     * Gets the "ModelEvidenceItem" element
     */
    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItem();
    
    /**
     * Sets the "ModelEvidenceItem" element
     */
    void setModelEvidenceItem(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem);
    
    /**
     * Appends and returns a new empty "ModelEvidenceItem" element
     */
    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem();
    
    /**
     * An XML ModelEvidenceItem(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface ModelEvidenceItem extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelEvidenceItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modelevidenceitem603eelemtype");
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id getId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id addNewId();
        
        /**
         * Gets the "exon-count" element
         */
        java.math.BigInteger getExonCount();
        
        /**
         * Gets (as xml) the "exon-count" element
         */
        org.apache.xmlbeans.XmlInteger xgetExonCount();
        
        /**
         * True if has "exon-count" element
         */
        boolean isSetExonCount();
        
        /**
         * Sets the "exon-count" element
         */
        void setExonCount(java.math.BigInteger exonCount);
        
        /**
         * Sets (as xml) the "exon-count" element
         */
        void xsetExonCount(org.apache.xmlbeans.XmlInteger exonCount);
        
        /**
         * Unsets the "exon-count" element
         */
        void unsetExonCount();
        
        /**
         * Gets the "exon-length" element
         */
        java.math.BigInteger getExonLength();
        
        /**
         * Gets (as xml) the "exon-length" element
         */
        org.apache.xmlbeans.XmlInteger xgetExonLength();
        
        /**
         * True if has "exon-length" element
         */
        boolean isSetExonLength();
        
        /**
         * Sets the "exon-length" element
         */
        void setExonLength(java.math.BigInteger exonLength);
        
        /**
         * Sets (as xml) the "exon-length" element
         */
        void xsetExonLength(org.apache.xmlbeans.XmlInteger exonLength);
        
        /**
         * Unsets the "exon-length" element
         */
        void unsetExonLength();
        
        /**
         * Gets the "full-length" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength getFullLength();
        
        /**
         * True if has "full-length" element
         */
        boolean isSetFullLength();
        
        /**
         * Sets the "full-length" element
         */
        void setFullLength(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength fullLength);
        
        /**
         * Appends and returns a new empty "full-length" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength addNewFullLength();
        
        /**
         * Unsets the "full-length" element
         */
        void unsetFullLength();
        
        /**
         * Gets the "supports-all-exon-combo" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo getSupportsAllExonCombo();
        
        /**
         * True if has "supports-all-exon-combo" element
         */
        boolean isSetSupportsAllExonCombo();
        
        /**
         * Sets the "supports-all-exon-combo" element
         */
        void setSupportsAllExonCombo(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo supportsAllExonCombo);
        
        /**
         * Appends and returns a new empty "supports-all-exon-combo" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo addNewSupportsAllExonCombo();
        
        /**
         * Unsets the "supports-all-exon-combo" element
         */
        void unsetSupportsAllExonCombo();
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("idc475elemtype");
            
            /**
             * Gets the "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
            
            /**
             * Sets the "Seq-id" element
             */
            void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML full-length(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FullLength extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullLength.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fulllengthb48eelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument$ModelEvidenceItem$FullLength$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value0327attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument$ModelEvidenceItem$FullLength$Value.
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
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.FullLength) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML supports-all-exon-combo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SupportsAllExonCombo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportsAllExonCombo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("supportsallexoncomboca92elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument$ModelEvidenceItem$SupportsAllExonCombo$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuefbabattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument$ModelEvidenceItem$SupportsAllExonCombo$Value.
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
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem.SupportsAllExonCombo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem newInstance() {
              return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
