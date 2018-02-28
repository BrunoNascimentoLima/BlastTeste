/*
 * An XML document type.
 * Localname: PIR-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PIRBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one PIR-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PIRBlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PIRBlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pirblockb9a5doctype");
    
    /**
     * Gets the "PIR-block" element
     */
    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock getPIRBlock();
    
    /**
     * Sets the "PIR-block" element
     */
    void setPIRBlock(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock pirBlock);
    
    /**
     * Appends and returns a new empty "PIR-block" element
     */
    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock addNewPIRBlock();
    
    /**
     * An XML PIR-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PIRBlock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PIRBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pirblocke24aelemtype");
        
        /**
         * Gets the "had-punct" element
         */
        gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct getHadPunct();
        
        /**
         * True if has "had-punct" element
         */
        boolean isSetHadPunct();
        
        /**
         * Sets the "had-punct" element
         */
        void setHadPunct(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct hadPunct);
        
        /**
         * Appends and returns a new empty "had-punct" element
         */
        gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct addNewHadPunct();
        
        /**
         * Unsets the "had-punct" element
         */
        void unsetHadPunct();
        
        /**
         * Gets the "host" element
         */
        java.lang.String getHost();
        
        /**
         * Gets (as xml) the "host" element
         */
        org.apache.xmlbeans.XmlString xgetHost();
        
        /**
         * True if has "host" element
         */
        boolean isSetHost();
        
        /**
         * Sets the "host" element
         */
        void setHost(java.lang.String host);
        
        /**
         * Sets (as xml) the "host" element
         */
        void xsetHost(org.apache.xmlbeans.XmlString host);
        
        /**
         * Unsets the "host" element
         */
        void unsetHost();
        
        /**
         * Gets the "source" element
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" element
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" element
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets the "summary" element
         */
        java.lang.String getSummary();
        
        /**
         * Gets (as xml) the "summary" element
         */
        org.apache.xmlbeans.XmlString xgetSummary();
        
        /**
         * True if has "summary" element
         */
        boolean isSetSummary();
        
        /**
         * Sets the "summary" element
         */
        void setSummary(java.lang.String summary);
        
        /**
         * Sets (as xml) the "summary" element
         */
        void xsetSummary(org.apache.xmlbeans.XmlString summary);
        
        /**
         * Unsets the "summary" element
         */
        void unsetSummary();
        
        /**
         * Gets the "genetic" element
         */
        java.lang.String getGenetic();
        
        /**
         * Gets (as xml) the "genetic" element
         */
        org.apache.xmlbeans.XmlString xgetGenetic();
        
        /**
         * True if has "genetic" element
         */
        boolean isSetGenetic();
        
        /**
         * Sets the "genetic" element
         */
        void setGenetic(java.lang.String genetic);
        
        /**
         * Sets (as xml) the "genetic" element
         */
        void xsetGenetic(org.apache.xmlbeans.XmlString genetic);
        
        /**
         * Unsets the "genetic" element
         */
        void unsetGenetic();
        
        /**
         * Gets the "includes" element
         */
        java.lang.String getIncludes();
        
        /**
         * Gets (as xml) the "includes" element
         */
        org.apache.xmlbeans.XmlString xgetIncludes();
        
        /**
         * True if has "includes" element
         */
        boolean isSetIncludes();
        
        /**
         * Sets the "includes" element
         */
        void setIncludes(java.lang.String includes);
        
        /**
         * Sets (as xml) the "includes" element
         */
        void xsetIncludes(org.apache.xmlbeans.XmlString includes);
        
        /**
         * Unsets the "includes" element
         */
        void unsetIncludes();
        
        /**
         * Gets the "placement" element
         */
        java.lang.String getPlacement();
        
        /**
         * Gets (as xml) the "placement" element
         */
        org.apache.xmlbeans.XmlString xgetPlacement();
        
        /**
         * True if has "placement" element
         */
        boolean isSetPlacement();
        
        /**
         * Sets the "placement" element
         */
        void setPlacement(java.lang.String placement);
        
        /**
         * Sets (as xml) the "placement" element
         */
        void xsetPlacement(org.apache.xmlbeans.XmlString placement);
        
        /**
         * Unsets the "placement" element
         */
        void unsetPlacement();
        
        /**
         * Gets the "superfamily" element
         */
        java.lang.String getSuperfamily();
        
        /**
         * Gets (as xml) the "superfamily" element
         */
        org.apache.xmlbeans.XmlString xgetSuperfamily();
        
        /**
         * True if has "superfamily" element
         */
        boolean isSetSuperfamily();
        
        /**
         * Sets the "superfamily" element
         */
        void setSuperfamily(java.lang.String superfamily);
        
        /**
         * Sets (as xml) the "superfamily" element
         */
        void xsetSuperfamily(org.apache.xmlbeans.XmlString superfamily);
        
        /**
         * Unsets the "superfamily" element
         */
        void unsetSuperfamily();
        
        /**
         * Gets array of all "keywords" elements
         */
        java.lang.String[] getKeywordsArray();
        
        /**
         * Gets ith "keywords" element
         */
        java.lang.String getKeywordsArray(int i);
        
        /**
         * Gets (as xml) array of all "keywords" elements
         */
        org.apache.xmlbeans.XmlString[] xgetKeywordsArray();
        
        /**
         * Gets (as xml) ith "keywords" element
         */
        org.apache.xmlbeans.XmlString xgetKeywordsArray(int i);
        
        /**
         * Returns number of "keywords" element
         */
        int sizeOfKeywordsArray();
        
        /**
         * Sets array of all "keywords" element
         */
        void setKeywordsArray(java.lang.String[] keywordsArray);
        
        /**
         * Sets ith "keywords" element
         */
        void setKeywordsArray(int i, java.lang.String keywords);
        
        /**
         * Sets (as xml) array of all "keywords" element
         */
        void xsetKeywordsArray(org.apache.xmlbeans.XmlString[] keywordsArray);
        
        /**
         * Sets (as xml) ith "keywords" element
         */
        void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords);
        
        /**
         * Inserts the value as the ith "keywords" element
         */
        void insertKeywords(int i, java.lang.String keywords);
        
        /**
         * Appends the value as the last "keywords" element
         */
        void addKeywords(java.lang.String keywords);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keywords" element
         */
        org.apache.xmlbeans.XmlString insertNewKeywords(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keywords" element
         */
        org.apache.xmlbeans.XmlString addNewKeywords();
        
        /**
         * Removes the ith "keywords" element
         */
        void removeKeywords(int i);
        
        /**
         * Gets the "cross-reference" element
         */
        java.lang.String getCrossReference();
        
        /**
         * Gets (as xml) the "cross-reference" element
         */
        org.apache.xmlbeans.XmlString xgetCrossReference();
        
        /**
         * True if has "cross-reference" element
         */
        boolean isSetCrossReference();
        
        /**
         * Sets the "cross-reference" element
         */
        void setCrossReference(java.lang.String crossReference);
        
        /**
         * Sets (as xml) the "cross-reference" element
         */
        void xsetCrossReference(org.apache.xmlbeans.XmlString crossReference);
        
        /**
         * Unsets the "cross-reference" element
         */
        void unsetCrossReference();
        
        /**
         * Gets the "date" element
         */
        java.lang.String getDate();
        
        /**
         * Gets (as xml) the "date" element
         */
        org.apache.xmlbeans.XmlString xgetDate();
        
        /**
         * True if has "date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(java.lang.String date);
        
        /**
         * Sets (as xml) the "date" element
         */
        void xsetDate(org.apache.xmlbeans.XmlString date);
        
        /**
         * Unsets the "date" element
         */
        void unsetDate();
        
        /**
         * Gets the "seq-raw" element
         */
        java.lang.String getSeqRaw();
        
        /**
         * Gets (as xml) the "seq-raw" element
         */
        org.apache.xmlbeans.XmlString xgetSeqRaw();
        
        /**
         * True if has "seq-raw" element
         */
        boolean isSetSeqRaw();
        
        /**
         * Sets the "seq-raw" element
         */
        void setSeqRaw(java.lang.String seqRaw);
        
        /**
         * Sets (as xml) the "seq-raw" element
         */
        void xsetSeqRaw(org.apache.xmlbeans.XmlString seqRaw);
        
        /**
         * Unsets the "seq-raw" element
         */
        void unsetSeqRaw();
        
        /**
         * Gets the "seqref" element
         */
        gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref getSeqref();
        
        /**
         * True if has "seqref" element
         */
        boolean isSetSeqref();
        
        /**
         * Sets the "seqref" element
         */
        void setSeqref(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref seqref);
        
        /**
         * Appends and returns a new empty "seqref" element
         */
        gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref addNewSeqref();
        
        /**
         * Unsets the "seqref" element
         */
        void unsetSeqref();
        
        /**
         * An XML had-punct(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface HadPunct extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HadPunct.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("hadpunct0e2eelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PIRBlockDocument$PIRBlock$HadPunct$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value0107attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PIRBlockDocument$PIRBlock$HadPunct$Value.
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
                    public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct newInstance() {
                  return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seqref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seqref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seqref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqref6cbaelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref newInstance() {
                  return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock newInstance() {
              return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PIRBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PIRBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
