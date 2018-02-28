/*
 * An XML document type.
 * Localname: Spliced-seg
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedSegDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Spliced-seg(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SplicedSegDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SplicedSegDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicedsegb27cdoctype");
    
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
     * An XML Spliced-seg(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SplicedSeg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SplicedSeg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicedseg1e38elemtype");
        
        /**
         * Gets the "product-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId getProductId();
        
        /**
         * True if has "product-id" element
         */
        boolean isSetProductId();
        
        /**
         * Sets the "product-id" element
         */
        void setProductId(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId productId);
        
        /**
         * Appends and returns a new empty "product-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId addNewProductId();
        
        /**
         * Unsets the "product-id" element
         */
        void unsetProductId();
        
        /**
         * Gets the "genomic-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId getGenomicId();
        
        /**
         * True if has "genomic-id" element
         */
        boolean isSetGenomicId();
        
        /**
         * Sets the "genomic-id" element
         */
        void setGenomicId(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId genomicId);
        
        /**
         * Appends and returns a new empty "genomic-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId addNewGenomicId();
        
        /**
         * Unsets the "genomic-id" element
         */
        void unsetGenomicId();
        
        /**
         * Gets the "product-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand getProductStrand();
        
        /**
         * True if has "product-strand" element
         */
        boolean isSetProductStrand();
        
        /**
         * Sets the "product-strand" element
         */
        void setProductStrand(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand productStrand);
        
        /**
         * Appends and returns a new empty "product-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand addNewProductStrand();
        
        /**
         * Unsets the "product-strand" element
         */
        void unsetProductStrand();
        
        /**
         * Gets the "genomic-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand getGenomicStrand();
        
        /**
         * True if has "genomic-strand" element
         */
        boolean isSetGenomicStrand();
        
        /**
         * Sets the "genomic-strand" element
         */
        void setGenomicStrand(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand genomicStrand);
        
        /**
         * Appends and returns a new empty "genomic-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand addNewGenomicStrand();
        
        /**
         * Unsets the "genomic-strand" element
         */
        void unsetGenomicStrand();
        
        /**
         * Gets the "product-type" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType getProductType();
        
        /**
         * Sets the "product-type" element
         */
        void setProductType(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType productType);
        
        /**
         * Appends and returns a new empty "product-type" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType addNewProductType();
        
        /**
         * Gets the "exons" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons getExons();
        
        /**
         * Sets the "exons" element
         */
        void setExons(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons exons);
        
        /**
         * Appends and returns a new empty "exons" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons addNewExons();
        
        /**
         * Gets the "poly-a" element
         */
        java.math.BigInteger getPolyA();
        
        /**
         * Gets (as xml) the "poly-a" element
         */
        org.apache.xmlbeans.XmlInteger xgetPolyA();
        
        /**
         * True if has "poly-a" element
         */
        boolean isSetPolyA();
        
        /**
         * Sets the "poly-a" element
         */
        void setPolyA(java.math.BigInteger polyA);
        
        /**
         * Sets (as xml) the "poly-a" element
         */
        void xsetPolyA(org.apache.xmlbeans.XmlInteger polyA);
        
        /**
         * Unsets the "poly-a" element
         */
        void unsetPolyA();
        
        /**
         * Gets the "product-length" element
         */
        java.math.BigInteger getProductLength();
        
        /**
         * Gets (as xml) the "product-length" element
         */
        org.apache.xmlbeans.XmlInteger xgetProductLength();
        
        /**
         * True if has "product-length" element
         */
        boolean isSetProductLength();
        
        /**
         * Sets the "product-length" element
         */
        void setProductLength(java.math.BigInteger productLength);
        
        /**
         * Sets (as xml) the "product-length" element
         */
        void xsetProductLength(org.apache.xmlbeans.XmlInteger productLength);
        
        /**
         * Unsets the "product-length" element
         */
        void unsetProductLength();
        
        /**
         * Gets the "modifiers" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers getModifiers();
        
        /**
         * True if has "modifiers" element
         */
        boolean isSetModifiers();
        
        /**
         * Sets the "modifiers" element
         */
        void setModifiers(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers modifiers);
        
        /**
         * Appends and returns a new empty "modifiers" element
         */
        gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers addNewModifiers();
        
        /**
         * Unsets the "modifiers" element
         */
        void unsetModifiers();
        
        /**
         * An XML product-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("productid548delemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genomic-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GenomicId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenomicId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genomicide314elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML product-strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductStrand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductStrand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("productstrandc178elemtype");
            
            /**
             * Gets the "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand();
            
            /**
             * Sets the "Na-strand" element
             */
            void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand);
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genomic-strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GenomicStrand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenomicStrand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genomicstrandb47felemtype");
            
            /**
             * Gets the "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand();
            
            /**
             * Sets the "Na-strand" element
             */
            void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand);
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.GenomicStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML product-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductType extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("producttype382celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SplicedSegDocument$SplicedSeg$ProductType$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value0f33attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRANSCRIPT = Enum.forString("transcript");
                static final Enum PROTEIN = Enum.forString("protein");
                
                static final int INT_TRANSCRIPT = Enum.INT_TRANSCRIPT;
                static final int INT_PROTEIN = Enum.INT_PROTEIN;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SplicedSegDocument$SplicedSeg$ProductType$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRANSCRIPT
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
                    
                    static final int INT_TRANSCRIPT = 1;
                    static final int INT_PROTEIN = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("transcript", INT_TRANSCRIPT),
                        new Enum("protein", INT_PROTEIN),
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
                    public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.ProductType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML exons(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Exons extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Exons.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("exonsea85elemtype");
            
            /**
             * Gets array of all "Spliced-exon" elements
             */
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon[] getSplicedExonArray();
            
            /**
             * Gets ith "Spliced-exon" element
             */
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon getSplicedExonArray(int i);
            
            /**
             * Returns number of "Spliced-exon" element
             */
            int sizeOfSplicedExonArray();
            
            /**
             * Sets array of all "Spliced-exon" element
             */
            void setSplicedExonArray(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon[] splicedExonArray);
            
            /**
             * Sets ith "Spliced-exon" element
             */
            void setSplicedExonArray(int i, gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon splicedExon);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Spliced-exon" element
             */
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon insertNewSplicedExon(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Spliced-exon" element
             */
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon addNewSplicedExon();
            
            /**
             * Removes the ith "Spliced-exon" element
             */
            void removeSplicedExon(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Exons) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML modifiers(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Modifiers extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modifiers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modifiersc120elemtype");
            
            /**
             * Gets array of all "Spliced-seg-modifier" elements
             */
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier[] getSplicedSegModifierArray();
            
            /**
             * Gets ith "Spliced-seg-modifier" element
             */
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier getSplicedSegModifierArray(int i);
            
            /**
             * Returns number of "Spliced-seg-modifier" element
             */
            int sizeOfSplicedSegModifierArray();
            
            /**
             * Sets array of all "Spliced-seg-modifier" element
             */
            void setSplicedSegModifierArray(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier[] splicedSegModifierArray);
            
            /**
             * Sets ith "Spliced-seg-modifier" element
             */
            void setSplicedSegModifierArray(int i, gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier splicedSegModifier);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Spliced-seg-modifier" element
             */
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier insertNewSplicedSegModifier(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Spliced-seg-modifier" element
             */
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier addNewSplicedSegModifier();
            
            /**
             * Removes the ith "Spliced-seg-modifier" element
             */
            void removeSplicedSegModifier(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg.Modifiers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg newInstance() {
              return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SplicedSegDocument.SplicedSeg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SplicedSegDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SplicedSegDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
