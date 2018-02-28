/*
 * An XML document type.
 * Localname: InferenceSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.InferenceSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one InferenceSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface InferenceSupportDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InferenceSupportDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("inferencesupportb654doctype");
    
    /**
     * Gets the "InferenceSupport" element
     */
    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport getInferenceSupport();
    
    /**
     * Sets the "InferenceSupport" element
     */
    void setInferenceSupport(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport inferenceSupport);
    
    /**
     * Appends and returns a new empty "InferenceSupport" element
     */
    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport addNewInferenceSupport();
    
    /**
     * An XML InferenceSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface InferenceSupport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InferenceSupport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("inferencesupporte9e2elemtype");
        
        /**
         * Gets the "category" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category getCategory();
        
        /**
         * True if has "category" element
         */
        boolean isSetCategory();
        
        /**
         * Sets the "category" element
         */
        void setCategory(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category category);
        
        /**
         * Appends and returns a new empty "category" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category addNewCategory();
        
        /**
         * Unsets the "category" element
         */
        void unsetCategory();
        
        /**
         * Gets the "type" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type getType();
        
        /**
         * True if has "type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "type" element
         */
        void setType(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type type);
        
        /**
         * Appends and returns a new empty "type" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type addNewType();
        
        /**
         * Unsets the "type" element
         */
        void unsetType();
        
        /**
         * Gets the "other-type" element
         */
        java.lang.String getOtherType();
        
        /**
         * Gets (as xml) the "other-type" element
         */
        org.apache.xmlbeans.XmlString xgetOtherType();
        
        /**
         * True if has "other-type" element
         */
        boolean isSetOtherType();
        
        /**
         * Sets the "other-type" element
         */
        void setOtherType(java.lang.String otherType);
        
        /**
         * Sets (as xml) the "other-type" element
         */
        void xsetOtherType(org.apache.xmlbeans.XmlString otherType);
        
        /**
         * Unsets the "other-type" element
         */
        void unsetOtherType();
        
        /**
         * Gets the "same-species" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies getSameSpecies();
        
        /**
         * True if has "same-species" element
         */
        boolean isSetSameSpecies();
        
        /**
         * Sets the "same-species" element
         */
        void setSameSpecies(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies sameSpecies);
        
        /**
         * Appends and returns a new empty "same-species" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies addNewSameSpecies();
        
        /**
         * Unsets the "same-species" element
         */
        void unsetSameSpecies();
        
        /**
         * Gets the "basis" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis getBasis();
        
        /**
         * Sets the "basis" element
         */
        void setBasis(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis basis);
        
        /**
         * Appends and returns a new empty "basis" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis addNewBasis();
        
        /**
         * Gets the "pmids" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids getPmids();
        
        /**
         * True if has "pmids" element
         */
        boolean isSetPmids();
        
        /**
         * Sets the "pmids" element
         */
        void setPmids(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids pmids);
        
        /**
         * Appends and returns a new empty "pmids" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids addNewPmids();
        
        /**
         * Unsets the "pmids" element
         */
        void unsetPmids();
        
        /**
         * Gets the "dois" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois getDois();
        
        /**
         * True if has "dois" element
         */
        boolean isSetDois();
        
        /**
         * Sets the "dois" element
         */
        void setDois(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois dois);
        
        /**
         * Appends and returns a new empty "dois" element
         */
        gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois addNewDois();
        
        /**
         * Unsets the "dois" element
         */
        void unsetDois();
        
        /**
         * An XML category(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Category extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Category.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("categoryc8fcelemtype");
            
            /**
             * Gets the "EvidenceCategory" element
             */
            gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory getEvidenceCategory();
            
            /**
             * Sets the "EvidenceCategory" element
             */
            void setEvidenceCategory(gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory evidenceCategory);
            
            /**
             * Appends and returns a new empty "EvidenceCategory" element
             */
            gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory addNewEvidenceCategory();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category newInstance() {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("type2838elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$Type$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value597fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum SIMILAR_TO_SEQUENCE = Enum.forString("similar-to-sequence");
                static final Enum SIMILAR_TO_AA = Enum.forString("similar-to-aa");
                static final Enum SIMILAR_TO_DNA = Enum.forString("similar-to-dna");
                static final Enum SIMILAR_TO_RNA = Enum.forString("similar-to-rna");
                static final Enum SIMILAR_TO_MRNA = Enum.forString("similar-to-mrna");
                static final Enum SIMILIAR_TO_EST = Enum.forString("similiar-to-est");
                static final Enum SIMILAR_TO_OTHER_RNA = Enum.forString("similar-to-other-rna");
                static final Enum PROFILE = Enum.forString("profile");
                static final Enum NUCLEOTIDE_MOTIF = Enum.forString("nucleotide-motif");
                static final Enum PROTEIN_MOTIF = Enum.forString("protein-motif");
                static final Enum AB_INITIO_PREDICTION = Enum.forString("ab-initio-prediction");
                static final Enum ALIGNMENT = Enum.forString("alignment");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_SIMILAR_TO_SEQUENCE = Enum.INT_SIMILAR_TO_SEQUENCE;
                static final int INT_SIMILAR_TO_AA = Enum.INT_SIMILAR_TO_AA;
                static final int INT_SIMILAR_TO_DNA = Enum.INT_SIMILAR_TO_DNA;
                static final int INT_SIMILAR_TO_RNA = Enum.INT_SIMILAR_TO_RNA;
                static final int INT_SIMILAR_TO_MRNA = Enum.INT_SIMILAR_TO_MRNA;
                static final int INT_SIMILIAR_TO_EST = Enum.INT_SIMILIAR_TO_EST;
                static final int INT_SIMILAR_TO_OTHER_RNA = Enum.INT_SIMILAR_TO_OTHER_RNA;
                static final int INT_PROFILE = Enum.INT_PROFILE;
                static final int INT_NUCLEOTIDE_MOTIF = Enum.INT_NUCLEOTIDE_MOTIF;
                static final int INT_PROTEIN_MOTIF = Enum.INT_PROTEIN_MOTIF;
                static final int INT_AB_INITIO_PREDICTION = Enum.INT_AB_INITIO_PREDICTION;
                static final int INT_ALIGNMENT = Enum.INT_ALIGNMENT;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$Type$Value.
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
                    static final int INT_SIMILAR_TO_SEQUENCE = 2;
                    static final int INT_SIMILAR_TO_AA = 3;
                    static final int INT_SIMILAR_TO_DNA = 4;
                    static final int INT_SIMILAR_TO_RNA = 5;
                    static final int INT_SIMILAR_TO_MRNA = 6;
                    static final int INT_SIMILIAR_TO_EST = 7;
                    static final int INT_SIMILAR_TO_OTHER_RNA = 8;
                    static final int INT_PROFILE = 9;
                    static final int INT_NUCLEOTIDE_MOTIF = 10;
                    static final int INT_PROTEIN_MOTIF = 11;
                    static final int INT_AB_INITIO_PREDICTION = 12;
                    static final int INT_ALIGNMENT = 13;
                    static final int INT_OTHER = 14;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("similar-to-sequence", INT_SIMILAR_TO_SEQUENCE),
                        new Enum("similar-to-aa", INT_SIMILAR_TO_AA),
                        new Enum("similar-to-dna", INT_SIMILAR_TO_DNA),
                        new Enum("similar-to-rna", INT_SIMILAR_TO_RNA),
                        new Enum("similar-to-mrna", INT_SIMILAR_TO_MRNA),
                        new Enum("similiar-to-est", INT_SIMILIAR_TO_EST),
                        new Enum("similar-to-other-rna", INT_SIMILAR_TO_OTHER_RNA),
                        new Enum("profile", INT_PROFILE),
                        new Enum("nucleotide-motif", INT_NUCLEOTIDE_MOTIF),
                        new Enum("protein-motif", INT_PROTEIN_MOTIF),
                        new Enum("ab-initio-prediction", INT_AB_INITIO_PREDICTION),
                        new Enum("alignment", INT_ALIGNMENT),
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
                    public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type newInstance() {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML same-species(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SameSpecies extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SameSpecies.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("samespeciescd13elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$SameSpecies$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuec75aattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.InferenceSupportDocument$InferenceSupport$SameSpecies$Value.
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
                    public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies newInstance() {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.SameSpecies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML basis(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Basis extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Basis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("basis020celemtype");
            
            /**
             * Gets the "EvidenceBasis" element
             */
            gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis getEvidenceBasis();
            
            /**
             * Sets the "EvidenceBasis" element
             */
            void setEvidenceBasis(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis evidenceBasis);
            
            /**
             * Appends and returns a new empty "EvidenceBasis" element
             */
            gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis addNewEvidenceBasis();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis newInstance() {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Basis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmids extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmidsce29elemtype");
            
            /**
             * Gets array of all "PubMedId" elements
             */
            java.math.BigInteger[] getPubMedIdArray();
            
            /**
             * Gets ith "PubMedId" element
             */
            java.math.BigInteger getPubMedIdArray(int i);
            
            /**
             * Gets (as xml) array of all "PubMedId" elements
             */
            org.apache.xmlbeans.XmlInteger[] xgetPubMedIdArray();
            
            /**
             * Gets (as xml) ith "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger xgetPubMedIdArray(int i);
            
            /**
             * Returns number of "PubMedId" element
             */
            int sizeOfPubMedIdArray();
            
            /**
             * Sets array of all "PubMedId" element
             */
            void setPubMedIdArray(java.math.BigInteger[] pubMedIdArray);
            
            /**
             * Sets ith "PubMedId" element
             */
            void setPubMedIdArray(int i, java.math.BigInteger pubMedId);
            
            /**
             * Sets (as xml) array of all "PubMedId" element
             */
            void xsetPubMedIdArray(org.apache.xmlbeans.XmlInteger[] pubMedIdArray);
            
            /**
             * Sets (as xml) ith "PubMedId" element
             */
            void xsetPubMedIdArray(int i, org.apache.xmlbeans.XmlInteger pubMedId);
            
            /**
             * Inserts the value as the ith "PubMedId" element
             */
            void insertPubMedId(int i, java.math.BigInteger pubMedId);
            
            /**
             * Appends the value as the last "PubMedId" element
             */
            void addPubMedId(java.math.BigInteger pubMedId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger insertNewPubMedId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger addNewPubMedId();
            
            /**
             * Removes the ith "PubMedId" element
             */
            void removePubMedId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids newInstance() {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Pmids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML dois(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Dois extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dois.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dois6133elemtype");
            
            /**
             * Gets array of all "DOI" elements
             */
            java.lang.String[] getDOIArray();
            
            /**
             * Gets ith "DOI" element
             */
            java.lang.String getDOIArray(int i);
            
            /**
             * Gets (as xml) array of all "DOI" elements
             */
            org.apache.xmlbeans.XmlString[] xgetDOIArray();
            
            /**
             * Gets (as xml) ith "DOI" element
             */
            org.apache.xmlbeans.XmlString xgetDOIArray(int i);
            
            /**
             * Returns number of "DOI" element
             */
            int sizeOfDOIArray();
            
            /**
             * Sets array of all "DOI" element
             */
            void setDOIArray(java.lang.String[] doiArray);
            
            /**
             * Sets ith "DOI" element
             */
            void setDOIArray(int i, java.lang.String doi);
            
            /**
             * Sets (as xml) array of all "DOI" element
             */
            void xsetDOIArray(org.apache.xmlbeans.XmlString[] doiArray);
            
            /**
             * Sets (as xml) ith "DOI" element
             */
            void xsetDOIArray(int i, org.apache.xmlbeans.XmlString doi);
            
            /**
             * Inserts the value as the ith "DOI" element
             */
            void insertDOI(int i, java.lang.String doi);
            
            /**
             * Appends the value as the last "DOI" element
             */
            void addDOI(java.lang.String doi);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DOI" element
             */
            org.apache.xmlbeans.XmlString insertNewDOI(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DOI" element
             */
            org.apache.xmlbeans.XmlString addNewDOI();
            
            /**
             * Removes the ith "DOI" element
             */
            void removeDOI(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois newInstance() {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport.Dois) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport newInstance() {
              return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.InferenceSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.InferenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
