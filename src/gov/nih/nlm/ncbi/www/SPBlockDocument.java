/*
 * An XML document type.
 * Localname: SP-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SPBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SP-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SPBlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SPBlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("spblock565bdoctype");
    
    /**
     * Gets the "SP-block" element
     */
    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock getSPBlock();
    
    /**
     * Sets the "SP-block" element
     */
    void setSPBlock(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock spBlock);
    
    /**
     * Appends and returns a new empty "SP-block" element
     */
    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock addNewSPBlock();
    
    /**
     * An XML SP-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SPBlock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SPBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("spblock6e82elemtype");
        
        /**
         * Gets the "class" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class getClass1();
        
        /**
         * Sets the "class" element
         */
        void setClass1(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class class1);
        
        /**
         * Appends and returns a new empty "class" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class addNewClass1();
        
        /**
         * Gets array of all "extra-acc" elements
         */
        java.lang.String[] getExtraAccArray();
        
        /**
         * Gets ith "extra-acc" element
         */
        java.lang.String getExtraAccArray(int i);
        
        /**
         * Gets (as xml) array of all "extra-acc" elements
         */
        org.apache.xmlbeans.XmlString[] xgetExtraAccArray();
        
        /**
         * Gets (as xml) ith "extra-acc" element
         */
        org.apache.xmlbeans.XmlString xgetExtraAccArray(int i);
        
        /**
         * Returns number of "extra-acc" element
         */
        int sizeOfExtraAccArray();
        
        /**
         * Sets array of all "extra-acc" element
         */
        void setExtraAccArray(java.lang.String[] extraAccArray);
        
        /**
         * Sets ith "extra-acc" element
         */
        void setExtraAccArray(int i, java.lang.String extraAcc);
        
        /**
         * Sets (as xml) array of all "extra-acc" element
         */
        void xsetExtraAccArray(org.apache.xmlbeans.XmlString[] extraAccArray);
        
        /**
         * Sets (as xml) ith "extra-acc" element
         */
        void xsetExtraAccArray(int i, org.apache.xmlbeans.XmlString extraAcc);
        
        /**
         * Inserts the value as the ith "extra-acc" element
         */
        void insertExtraAcc(int i, java.lang.String extraAcc);
        
        /**
         * Appends the value as the last "extra-acc" element
         */
        void addExtraAcc(java.lang.String extraAcc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extra-acc" element
         */
        org.apache.xmlbeans.XmlString insertNewExtraAcc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extra-acc" element
         */
        org.apache.xmlbeans.XmlString addNewExtraAcc();
        
        /**
         * Removes the ith "extra-acc" element
         */
        void removeExtraAcc(int i);
        
        /**
         * Gets the "imeth" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth getImeth();
        
        /**
         * True if has "imeth" element
         */
        boolean isSetImeth();
        
        /**
         * Sets the "imeth" element
         */
        void setImeth(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth imeth);
        
        /**
         * Appends and returns a new empty "imeth" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth addNewImeth();
        
        /**
         * Unsets the "imeth" element
         */
        void unsetImeth();
        
        /**
         * Gets array of all "plasnm" elements
         */
        java.lang.String[] getPlasnmArray();
        
        /**
         * Gets ith "plasnm" element
         */
        java.lang.String getPlasnmArray(int i);
        
        /**
         * Gets (as xml) array of all "plasnm" elements
         */
        org.apache.xmlbeans.XmlString[] xgetPlasnmArray();
        
        /**
         * Gets (as xml) ith "plasnm" element
         */
        org.apache.xmlbeans.XmlString xgetPlasnmArray(int i);
        
        /**
         * Returns number of "plasnm" element
         */
        int sizeOfPlasnmArray();
        
        /**
         * Sets array of all "plasnm" element
         */
        void setPlasnmArray(java.lang.String[] plasnmArray);
        
        /**
         * Sets ith "plasnm" element
         */
        void setPlasnmArray(int i, java.lang.String plasnm);
        
        /**
         * Sets (as xml) array of all "plasnm" element
         */
        void xsetPlasnmArray(org.apache.xmlbeans.XmlString[] plasnmArray);
        
        /**
         * Sets (as xml) ith "plasnm" element
         */
        void xsetPlasnmArray(int i, org.apache.xmlbeans.XmlString plasnm);
        
        /**
         * Inserts the value as the ith "plasnm" element
         */
        void insertPlasnm(int i, java.lang.String plasnm);
        
        /**
         * Appends the value as the last "plasnm" element
         */
        void addPlasnm(java.lang.String plasnm);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "plasnm" element
         */
        org.apache.xmlbeans.XmlString insertNewPlasnm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plasnm" element
         */
        org.apache.xmlbeans.XmlString addNewPlasnm();
        
        /**
         * Removes the ith "plasnm" element
         */
        void removePlasnm(int i);
        
        /**
         * Gets the "seqref" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref getSeqref();
        
        /**
         * True if has "seqref" element
         */
        boolean isSetSeqref();
        
        /**
         * Sets the "seqref" element
         */
        void setSeqref(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref seqref);
        
        /**
         * Appends and returns a new empty "seqref" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref addNewSeqref();
        
        /**
         * Unsets the "seqref" element
         */
        void unsetSeqref();
        
        /**
         * Gets the "dbref" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref getDbref();
        
        /**
         * True if has "dbref" element
         */
        boolean isSetDbref();
        
        /**
         * Sets the "dbref" element
         */
        void setDbref(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref dbref);
        
        /**
         * Appends and returns a new empty "dbref" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref addNewDbref();
        
        /**
         * Unsets the "dbref" element
         */
        void unsetDbref();
        
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
         * Gets the "created" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created getCreated();
        
        /**
         * True if has "created" element
         */
        boolean isSetCreated();
        
        /**
         * Sets the "created" element
         */
        void setCreated(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created created);
        
        /**
         * Appends and returns a new empty "created" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created addNewCreated();
        
        /**
         * Unsets the "created" element
         */
        void unsetCreated();
        
        /**
         * Gets the "sequpd" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd getSequpd();
        
        /**
         * True if has "sequpd" element
         */
        boolean isSetSequpd();
        
        /**
         * Sets the "sequpd" element
         */
        void setSequpd(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd sequpd);
        
        /**
         * Appends and returns a new empty "sequpd" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd addNewSequpd();
        
        /**
         * Unsets the "sequpd" element
         */
        void unsetSequpd();
        
        /**
         * Gets the "annotupd" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd getAnnotupd();
        
        /**
         * True if has "annotupd" element
         */
        boolean isSetAnnotupd();
        
        /**
         * Sets the "annotupd" element
         */
        void setAnnotupd(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd annotupd);
        
        /**
         * Appends and returns a new empty "annotupd" element
         */
        gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd addNewAnnotupd();
        
        /**
         * Unsets the "annotupd" element
         */
        void unsetAnnotupd();
        
        /**
         * An XML class(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Class extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Class.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("class6d66elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SPBlockDocument$SPBlock$Class$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valueb6ffattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum STANDARD = Enum.forString("standard");
                static final Enum PRELIM = Enum.forString("prelim");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_STANDARD = Enum.INT_STANDARD;
                static final int INT_PRELIM = Enum.INT_PRELIM;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SPBlockDocument$SPBlock$Class$Value.
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
                    static final int INT_STANDARD = 2;
                    static final int INT_PRELIM = 3;
                    static final int INT_OTHER = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("standard", INT_STANDARD),
                        new Enum("prelim", INT_PRELIM),
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
                    public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML imeth(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Imeth extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imeth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("imeth04a3elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SPBlockDocument$SPBlock$Imeth$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value4e3cattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SPBlockDocument$SPBlock$Imeth$Value.
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
                    public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seqref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqrefd4f2elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML dbref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Dbref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dbref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dbrefa603elemtype");
            
            /**
             * Gets array of all "Dbtag" elements
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray();
            
            /**
             * Gets ith "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i);
            
            /**
             * Returns number of "Dbtag" element
             */
            int sizeOfDbtagArray();
            
            /**
             * Sets array of all "Dbtag" element
             */
            void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray);
            
            /**
             * Sets ith "Dbtag" element
             */
            void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * Removes the ith "Dbtag" element
             */
            void removeDbtag(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML created(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Created extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Created.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("created8cd6elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sequpd(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Sequpd extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sequpd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sequpd5008elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML annotupd(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Annotupd extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annotupd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("annotupd5d41elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd newInstance() {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock newInstance() {
              return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SPBlockDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SPBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SPBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
