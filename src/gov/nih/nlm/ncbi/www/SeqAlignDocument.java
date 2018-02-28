/*
 * An XML document type.
 * Localname: Seq-align
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqAlignDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-align(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqAlignDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAlignDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqalign8563doctype");
    
    /**
     * Gets the "Seq-align" element
     */
    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlign();
    
    /**
     * Sets the "Seq-align" element
     */
    void setSeqAlign(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign);
    
    /**
     * Appends and returns a new empty "Seq-align" element
     */
    gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign();
    
    /**
     * An XML Seq-align(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqAlign extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqalignccc6elemtype");
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type getType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type addNewType();
        
        /**
         * Gets the "dim" element
         */
        java.math.BigInteger getDim();
        
        /**
         * Gets (as xml) the "dim" element
         */
        org.apache.xmlbeans.XmlInteger xgetDim();
        
        /**
         * True if has "dim" element
         */
        boolean isSetDim();
        
        /**
         * Sets the "dim" element
         */
        void setDim(java.math.BigInteger dim);
        
        /**
         * Sets (as xml) the "dim" element
         */
        void xsetDim(org.apache.xmlbeans.XmlInteger dim);
        
        /**
         * Unsets the "dim" element
         */
        void unsetDim();
        
        /**
         * Gets the "score" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score getScore();
        
        /**
         * True if has "score" element
         */
        boolean isSetScore();
        
        /**
         * Sets the "score" element
         */
        void setScore(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score score);
        
        /**
         * Appends and returns a new empty "score" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score addNewScore();
        
        /**
         * Unsets the "score" element
         */
        void unsetScore();
        
        /**
         * Gets the "segs" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs getSegs();
        
        /**
         * Sets the "segs" element
         */
        void setSegs(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs segs);
        
        /**
         * Appends and returns a new empty "segs" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs addNewSegs();
        
        /**
         * Gets the "bounds" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds getBounds();
        
        /**
         * True if has "bounds" element
         */
        boolean isSetBounds();
        
        /**
         * Sets the "bounds" element
         */
        void setBounds(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds bounds);
        
        /**
         * Appends and returns a new empty "bounds" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds addNewBounds();
        
        /**
         * Unsets the "bounds" element
         */
        void unsetBounds();
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Type extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("type399celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqAlignDocument$SeqAlign$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value2323attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum GLOBAL = Enum.forString("global");
                static final Enum DIAGS = Enum.forString("diags");
                static final Enum PARTIAL = Enum.forString("partial");
                static final Enum DISC = Enum.forString("disc");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_GLOBAL = Enum.INT_GLOBAL;
                static final int INT_DIAGS = Enum.INT_DIAGS;
                static final int INT_PARTIAL = Enum.INT_PARTIAL;
                static final int INT_DISC = Enum.INT_DISC;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqAlignDocument$SeqAlign$Type$Value.
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
                    static final int INT_GLOBAL = 2;
                    static final int INT_DIAGS = 3;
                    static final int INT_PARTIAL = 4;
                    static final int INT_DISC = 5;
                    static final int INT_OTHER = 6;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("global", INT_GLOBAL),
                        new Enum("diags", INT_DIAGS),
                        new Enum("partial", INT_PARTIAL),
                        new Enum("disc", INT_DISC),
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
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML score(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Score extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Score.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("scorebec4elemtype");
            
            /**
             * Gets array of all "Score" elements
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score[] getScoreArray();
            
            /**
             * Gets ith "Score" element
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score getScoreArray(int i);
            
            /**
             * Returns number of "Score" element
             */
            int sizeOfScoreArray();
            
            /**
             * Sets array of all "Score" element
             */
            void setScoreArray(gov.nih.nlm.ncbi.www.ScoreDocument.Score[] scoreArray);
            
            /**
             * Sets ith "Score" element
             */
            void setScoreArray(int i, gov.nih.nlm.ncbi.www.ScoreDocument.Score score);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Score" element
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score insertNewScore(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Score" element
             */
            gov.nih.nlm.ncbi.www.ScoreDocument.Score addNewScore();
            
            /**
             * Removes the ith "Score" element
             */
            void removeScore(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Score) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML segs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Segs extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Segs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("segs7f20elemtype");
            
            /**
             * Gets the "dendiag" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag getDendiag();
            
            /**
             * True if has "dendiag" element
             */
            boolean isSetDendiag();
            
            /**
             * Sets the "dendiag" element
             */
            void setDendiag(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag dendiag);
            
            /**
             * Appends and returns a new empty "dendiag" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag addNewDendiag();
            
            /**
             * Unsets the "dendiag" element
             */
            void unsetDendiag();
            
            /**
             * Gets the "denseg" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg getDenseg();
            
            /**
             * True if has "denseg" element
             */
            boolean isSetDenseg();
            
            /**
             * Sets the "denseg" element
             */
            void setDenseg(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg denseg);
            
            /**
             * Appends and returns a new empty "denseg" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg addNewDenseg();
            
            /**
             * Unsets the "denseg" element
             */
            void unsetDenseg();
            
            /**
             * Gets the "std" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std getStd();
            
            /**
             * True if has "std" element
             */
            boolean isSetStd();
            
            /**
             * Sets the "std" element
             */
            void setStd(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std std);
            
            /**
             * Appends and returns a new empty "std" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std addNewStd();
            
            /**
             * Unsets the "std" element
             */
            void unsetStd();
            
            /**
             * Gets the "packed" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed getPacked();
            
            /**
             * True if has "packed" element
             */
            boolean isSetPacked();
            
            /**
             * Sets the "packed" element
             */
            void setPacked(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed packed);
            
            /**
             * Appends and returns a new empty "packed" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed addNewPacked();
            
            /**
             * Unsets the "packed" element
             */
            void unsetPacked();
            
            /**
             * Gets the "disc" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc getDisc();
            
            /**
             * True if has "disc" element
             */
            boolean isSetDisc();
            
            /**
             * Sets the "disc" element
             */
            void setDisc(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc disc);
            
            /**
             * Appends and returns a new empty "disc" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc addNewDisc();
            
            /**
             * Unsets the "disc" element
             */
            void unsetDisc();
            
            /**
             * Gets the "spliced" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced getSpliced();
            
            /**
             * True if has "spliced" element
             */
            boolean isSetSpliced();
            
            /**
             * Sets the "spliced" element
             */
            void setSpliced(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced spliced);
            
            /**
             * Appends and returns a new empty "spliced" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced addNewSpliced();
            
            /**
             * Unsets the "spliced" element
             */
            void unsetSpliced();
            
            /**
             * Gets the "sparse" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse getSparse();
            
            /**
             * True if has "sparse" element
             */
            boolean isSetSparse();
            
            /**
             * Sets the "sparse" element
             */
            void setSparse(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse sparse);
            
            /**
             * Appends and returns a new empty "sparse" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse addNewSparse();
            
            /**
             * Unsets the "sparse" element
             */
            void unsetSparse();
            
            /**
             * An XML dendiag(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Dendiag extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dendiag.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dendiag733celemtype");
                
                /**
                 * Gets array of all "Dense-diag" elements
                 */
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag[] getDenseDiagArray();
                
                /**
                 * Gets ith "Dense-diag" element
                 */
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag getDenseDiagArray(int i);
                
                /**
                 * Returns number of "Dense-diag" element
                 */
                int sizeOfDenseDiagArray();
                
                /**
                 * Sets array of all "Dense-diag" element
                 */
                void setDenseDiagArray(gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag[] denseDiagArray);
                
                /**
                 * Sets ith "Dense-diag" element
                 */
                void setDenseDiagArray(int i, gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag denseDiag);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Dense-diag" element
                 */
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag insertNewDenseDiag(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Dense-diag" element
                 */
                gov.nih.nlm.ncbi.www.DenseDiagDocument.DenseDiag addNewDenseDiag();
                
                /**
                 * Removes the ith "Dense-diag" element
                 */
                void removeDenseDiag(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Dendiag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML denseg(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Denseg extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Denseg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("densegfcdcelemtype");
                
                /**
                 * Gets the "Dense-seg" element
                 */
                gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg getDenseSeg();
                
                /**
                 * Sets the "Dense-seg" element
                 */
                void setDenseSeg(gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg denseSeg);
                
                /**
                 * Appends and returns a new empty "Dense-seg" element
                 */
                gov.nih.nlm.ncbi.www.DenseSegDocument.DenseSeg addNewDenseSeg();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Denseg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML std(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Std extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Std.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("std8b31elemtype");
                
                /**
                 * Gets array of all "Std-seg" elements
                 */
                gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg[] getStdSegArray();
                
                /**
                 * Gets ith "Std-seg" element
                 */
                gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg getStdSegArray(int i);
                
                /**
                 * Returns number of "Std-seg" element
                 */
                int sizeOfStdSegArray();
                
                /**
                 * Sets array of all "Std-seg" element
                 */
                void setStdSegArray(gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg[] stdSegArray);
                
                /**
                 * Sets ith "Std-seg" element
                 */
                void setStdSegArray(int i, gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg stdSeg);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Std-seg" element
                 */
                gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg insertNewStdSeg(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Std-seg" element
                 */
                gov.nih.nlm.ncbi.www.StdSegDocument.StdSeg addNewStdSeg();
                
                /**
                 * Removes the ith "Std-seg" element
                 */
                void removeStdSeg(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Std) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML packed(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Packed extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Packed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedff8celemtype");
                
                /**
                 * Gets the "Packed-seg" element
                 */
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg getPackedSeg();
                
                /**
                 * Sets the "Packed-seg" element
                 */
                void setPackedSeg(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg packedSeg);
                
                /**
                 * Appends and returns a new empty "Packed-seg" element
                 */
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg addNewPackedSeg();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Packed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML disc(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Disc extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Disc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("disc224felemtype");
                
                /**
                 * Gets the "Seq-align-set" element
                 */
                gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet getSeqAlignSet();
                
                /**
                 * Sets the "Seq-align-set" element
                 */
                void setSeqAlignSet(gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet seqAlignSet);
                
                /**
                 * Appends and returns a new empty "Seq-align-set" element
                 */
                gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet addNewSeqAlignSet();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Disc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML spliced(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Spliced extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Spliced.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("spliceda4ccelemtype");
                
                /**
                 * Gets the "Spliced-seg" element
                 */
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg getSplicedSeg();
                
                /**
                 * Sets the "Spliced-seg" element
                 */
                void setSplicedSeg(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg splicedSeg);
                
                /**
                 * Appends and returns a new empty "Spliced-seg" element
                 */
                gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg addNewSplicedSeg();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Spliced) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML sparse(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Sparse extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sparse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sparse38e4elemtype");
                
                /**
                 * Gets the "Sparse-seg" element
                 */
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg getSparseSeg();
                
                /**
                 * Sets the "Sparse-seg" element
                 */
                void setSparseSeg(gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg sparseSeg);
                
                /**
                 * Appends and returns a new empty "Sparse-seg" element
                 */
                gov.nih.nlm.ncbi.www.SparseSegDocument.SparseSeg addNewSparseSeg();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs.Sparse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Segs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bounds(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Bounds extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bounds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("boundsa397elemtype");
            
            /**
             * Gets array of all "Seq-loc" elements
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray();
            
            /**
             * Gets ith "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i);
            
            /**
             * Returns number of "Seq-loc" element
             */
            int sizeOfSeqLocArray();
            
            /**
             * Sets array of all "Seq-loc" element
             */
            void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray);
            
            /**
             * Sets ith "Seq-loc" element
             */
            void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * Removes the ith "Seq-loc" element
             */
            void removeSeqLoc(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Bounds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id7efdelemtype");
            
            /**
             * Gets array of all "Object-id" elements
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] getObjectIdArray();
            
            /**
             * Gets ith "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectIdArray(int i);
            
            /**
             * Returns number of "Object-id" element
             */
            int sizeOfObjectIdArray();
            
            /**
             * Sets array of all "Object-id" element
             */
            void setObjectIdArray(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] objectIdArray);
            
            /**
             * Sets ith "Object-id" element
             */
            void setObjectIdArray(int i, gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId insertNewObjectId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId();
            
            /**
             * Removes the ith "Object-id" element
             */
            void removeObjectId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ext extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ext2ad3elemtype");
            
            /**
             * Gets array of all "User-object" elements
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] getUserObjectArray();
            
            /**
             * Gets ith "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObjectArray(int i);
            
            /**
             * Returns number of "User-object" element
             */
            int sizeOfUserObjectArray();
            
            /**
             * Sets array of all "User-object" element
             */
            void setUserObjectArray(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] userObjectArray);
            
            /**
             * Sets ith "User-object" element
             */
            void setUserObjectArray(int i, gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject insertNewUserObject(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
            
            /**
             * Removes the ith "User-object" element
             */
            void removeUserObject(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqAlignDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqAlignDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
