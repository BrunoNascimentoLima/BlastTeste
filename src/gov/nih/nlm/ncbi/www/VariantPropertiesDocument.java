/*
 * An XML document type.
 * Localname: VariantProperties
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.VariantPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one VariantProperties(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface VariantPropertiesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariantPropertiesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variantproperties2664doctype");
    
    /**
     * Gets the "VariantProperties" element
     */
    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties getVariantProperties();
    
    /**
     * Sets the "VariantProperties" element
     */
    void setVariantProperties(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties variantProperties);
    
    /**
     * Appends and returns a new empty "VariantProperties" element
     */
    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties addNewVariantProperties();
    
    /**
     * An XML VariantProperties(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface VariantProperties extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariantProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variantproperties2048elemtype");
        
        /**
         * Gets the "version" element
         */
        java.math.BigInteger getVersion();
        
        /**
         * Gets (as xml) the "version" element
         */
        org.apache.xmlbeans.XmlInteger xgetVersion();
        
        /**
         * Sets the "version" element
         */
        void setVersion(java.math.BigInteger version);
        
        /**
         * Sets (as xml) the "version" element
         */
        void xsetVersion(org.apache.xmlbeans.XmlInteger version);
        
        /**
         * Gets the "resource-link" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink getResourceLink();
        
        /**
         * True if has "resource-link" element
         */
        boolean isSetResourceLink();
        
        /**
         * Sets the "resource-link" element
         */
        void setResourceLink(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink resourceLink);
        
        /**
         * Appends and returns a new empty "resource-link" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink addNewResourceLink();
        
        /**
         * Unsets the "resource-link" element
         */
        void unsetResourceLink();
        
        /**
         * Gets the "gene-location" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation getGeneLocation();
        
        /**
         * True if has "gene-location" element
         */
        boolean isSetGeneLocation();
        
        /**
         * Sets the "gene-location" element
         */
        void setGeneLocation(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation geneLocation);
        
        /**
         * Appends and returns a new empty "gene-location" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation addNewGeneLocation();
        
        /**
         * Unsets the "gene-location" element
         */
        void unsetGeneLocation();
        
        /**
         * Gets the "effect" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect getEffect();
        
        /**
         * True if has "effect" element
         */
        boolean isSetEffect();
        
        /**
         * Sets the "effect" element
         */
        void setEffect(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect effect);
        
        /**
         * Appends and returns a new empty "effect" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect addNewEffect();
        
        /**
         * Unsets the "effect" element
         */
        void unsetEffect();
        
        /**
         * Gets the "mapping" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping getMapping();
        
        /**
         * True if has "mapping" element
         */
        boolean isSetMapping();
        
        /**
         * Sets the "mapping" element
         */
        void setMapping(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping mapping);
        
        /**
         * Appends and returns a new empty "mapping" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping addNewMapping();
        
        /**
         * Unsets the "mapping" element
         */
        void unsetMapping();
        
        /**
         * Gets the "map-weight" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight getMapWeight();
        
        /**
         * True if has "map-weight" element
         */
        boolean isSetMapWeight();
        
        /**
         * Sets the "map-weight" element
         */
        void setMapWeight(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight mapWeight);
        
        /**
         * Appends and returns a new empty "map-weight" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight addNewMapWeight();
        
        /**
         * Unsets the "map-weight" element
         */
        void unsetMapWeight();
        
        /**
         * Gets the "frequency-based-validation" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation getFrequencyBasedValidation();
        
        /**
         * True if has "frequency-based-validation" element
         */
        boolean isSetFrequencyBasedValidation();
        
        /**
         * Sets the "frequency-based-validation" element
         */
        void setFrequencyBasedValidation(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation frequencyBasedValidation);
        
        /**
         * Appends and returns a new empty "frequency-based-validation" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation addNewFrequencyBasedValidation();
        
        /**
         * Unsets the "frequency-based-validation" element
         */
        void unsetFrequencyBasedValidation();
        
        /**
         * Gets the "genotype" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype getGenotype();
        
        /**
         * True if has "genotype" element
         */
        boolean isSetGenotype();
        
        /**
         * Sets the "genotype" element
         */
        void setGenotype(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype genotype);
        
        /**
         * Appends and returns a new empty "genotype" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype addNewGenotype();
        
        /**
         * Unsets the "genotype" element
         */
        void unsetGenotype();
        
        /**
         * Gets array of all "project-data" elements
         */
        java.math.BigInteger[] getProjectDataArray();
        
        /**
         * Gets ith "project-data" element
         */
        java.math.BigInteger getProjectDataArray(int i);
        
        /**
         * Gets (as xml) array of all "project-data" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetProjectDataArray();
        
        /**
         * Gets (as xml) ith "project-data" element
         */
        org.apache.xmlbeans.XmlInteger xgetProjectDataArray(int i);
        
        /**
         * Returns number of "project-data" element
         */
        int sizeOfProjectDataArray();
        
        /**
         * Sets array of all "project-data" element
         */
        void setProjectDataArray(java.math.BigInteger[] projectDataArray);
        
        /**
         * Sets ith "project-data" element
         */
        void setProjectDataArray(int i, java.math.BigInteger projectData);
        
        /**
         * Sets (as xml) array of all "project-data" element
         */
        void xsetProjectDataArray(org.apache.xmlbeans.XmlInteger[] projectDataArray);
        
        /**
         * Sets (as xml) ith "project-data" element
         */
        void xsetProjectDataArray(int i, org.apache.xmlbeans.XmlInteger projectData);
        
        /**
         * Inserts the value as the ith "project-data" element
         */
        void insertProjectData(int i, java.math.BigInteger projectData);
        
        /**
         * Appends the value as the last "project-data" element
         */
        void addProjectData(java.math.BigInteger projectData);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "project-data" element
         */
        org.apache.xmlbeans.XmlInteger insertNewProjectData(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "project-data" element
         */
        org.apache.xmlbeans.XmlInteger addNewProjectData();
        
        /**
         * Removes the ith "project-data" element
         */
        void removeProjectData(int i);
        
        /**
         * Gets the "quality-check" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck getQualityCheck();
        
        /**
         * True if has "quality-check" element
         */
        boolean isSetQualityCheck();
        
        /**
         * Sets the "quality-check" element
         */
        void setQualityCheck(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck qualityCheck);
        
        /**
         * Appends and returns a new empty "quality-check" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck addNewQualityCheck();
        
        /**
         * Unsets the "quality-check" element
         */
        void unsetQualityCheck();
        
        /**
         * Gets the "confidence" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence getConfidence();
        
        /**
         * True if has "confidence" element
         */
        boolean isSetConfidence();
        
        /**
         * Sets the "confidence" element
         */
        void setConfidence(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence confidence);
        
        /**
         * Appends and returns a new empty "confidence" element
         */
        gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence addNewConfidence();
        
        /**
         * Unsets the "confidence" element
         */
        void unsetConfidence();
        
        /**
         * An XML resource-link(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$ResourceLink.
         */
        public interface ResourceLink extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceLink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("resourcelinka28delemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$ResourceLink$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valueaee6attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum PRESERVED = Enum.forString("preserved");
                static final Enum PROVISIONAL = Enum.forString("provisional");
                static final Enum HAS_3_D = Enum.forString("has3D");
                static final Enum SUBMITTER_LINKOUT = Enum.forString("submitterLinkout");
                static final Enum CLINICAL = Enum.forString("clinical");
                static final Enum GENOTYPE_KIT = Enum.forString("genotypeKit");
                
                static final int INT_PRESERVED = Enum.INT_PRESERVED;
                static final int INT_PROVISIONAL = Enum.INT_PROVISIONAL;
                static final int INT_HAS_3_D = Enum.INT_HAS_3_D;
                static final int INT_SUBMITTER_LINKOUT = Enum.INT_SUBMITTER_LINKOUT;
                static final int INT_CLINICAL = Enum.INT_CLINICAL;
                static final int INT_GENOTYPE_KIT = Enum.INT_GENOTYPE_KIT;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$ResourceLink$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_PRESERVED
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
                    
                    static final int INT_PRESERVED = 1;
                    static final int INT_PROVISIONAL = 2;
                    static final int INT_HAS_3_D = 3;
                    static final int INT_SUBMITTER_LINKOUT = 4;
                    static final int INT_CLINICAL = 5;
                    static final int INT_GENOTYPE_KIT = 6;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("preserved", INT_PRESERVED),
                        new Enum("provisional", INT_PROVISIONAL),
                        new Enum("has3D", INT_HAS_3_D),
                        new Enum("submitterLinkout", INT_SUBMITTER_LINKOUT),
                        new Enum("clinical", INT_CLINICAL),
                        new Enum("genotypeKit", INT_GENOTYPE_KIT),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML gene-location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$GeneLocation.
         */
        public interface GeneLocation extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genelocation61a1elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$GeneLocation$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value6dfaattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum IN_GENE = Enum.forString("in-gene");
                static final Enum NEAR_GENE_5 = Enum.forString("near-gene-5");
                static final Enum NEAR_GENE_3 = Enum.forString("near-gene-3");
                static final Enum INTRON = Enum.forString("intron");
                static final Enum DONOR = Enum.forString("donor");
                static final Enum ACCEPTOR = Enum.forString("acceptor");
                static final Enum UTR_5 = Enum.forString("utr-5");
                static final Enum UTR_3 = Enum.forString("utr-3");
                static final Enum IN_START_CODON = Enum.forString("in-start-codon");
                static final Enum IN_STOP_CODON = Enum.forString("in-stop-codon");
                static final Enum INTERGENIC = Enum.forString("intergenic");
                static final Enum CONSERVED_NONCODING = Enum.forString("conserved-noncoding");
                
                static final int INT_IN_GENE = Enum.INT_IN_GENE;
                static final int INT_NEAR_GENE_5 = Enum.INT_NEAR_GENE_5;
                static final int INT_NEAR_GENE_3 = Enum.INT_NEAR_GENE_3;
                static final int INT_INTRON = Enum.INT_INTRON;
                static final int INT_DONOR = Enum.INT_DONOR;
                static final int INT_ACCEPTOR = Enum.INT_ACCEPTOR;
                static final int INT_UTR_5 = Enum.INT_UTR_5;
                static final int INT_UTR_3 = Enum.INT_UTR_3;
                static final int INT_IN_START_CODON = Enum.INT_IN_START_CODON;
                static final int INT_IN_STOP_CODON = Enum.INT_IN_STOP_CODON;
                static final int INT_INTERGENIC = Enum.INT_INTERGENIC;
                static final int INT_CONSERVED_NONCODING = Enum.INT_CONSERVED_NONCODING;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$GeneLocation$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_IN_GENE
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
                    
                    static final int INT_IN_GENE = 1;
                    static final int INT_NEAR_GENE_5 = 2;
                    static final int INT_NEAR_GENE_3 = 3;
                    static final int INT_INTRON = 4;
                    static final int INT_DONOR = 5;
                    static final int INT_ACCEPTOR = 6;
                    static final int INT_UTR_5 = 7;
                    static final int INT_UTR_3 = 8;
                    static final int INT_IN_START_CODON = 9;
                    static final int INT_IN_STOP_CODON = 10;
                    static final int INT_INTERGENIC = 11;
                    static final int INT_CONSERVED_NONCODING = 12;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("in-gene", INT_IN_GENE),
                        new Enum("near-gene-5", INT_NEAR_GENE_5),
                        new Enum("near-gene-3", INT_NEAR_GENE_3),
                        new Enum("intron", INT_INTRON),
                        new Enum("donor", INT_DONOR),
                        new Enum("acceptor", INT_ACCEPTOR),
                        new Enum("utr-5", INT_UTR_5),
                        new Enum("utr-3", INT_UTR_3),
                        new Enum("in-start-codon", INT_IN_START_CODON),
                        new Enum("in-stop-codon", INT_IN_STOP_CODON),
                        new Enum("intergenic", INT_INTERGENIC),
                        new Enum("conserved-noncoding", INT_CONSERVED_NONCODING),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML effect(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Effect.
         */
        public interface Effect extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Effect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("effect49f5elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Effect$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value7fbcattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NO_CHANGE = Enum.forString("no-change");
                static final Enum SYNONYMOUS = Enum.forString("synonymous");
                static final Enum NONSENSE = Enum.forString("nonsense");
                static final Enum MISSENSE = Enum.forString("missense");
                static final Enum FRAMESHIFT = Enum.forString("frameshift");
                static final Enum UP_REGULATOR = Enum.forString("up-regulator");
                static final Enum DOWN_REGULATOR = Enum.forString("down-regulator");
                static final Enum METHYLATION = Enum.forString("methylation");
                static final Enum STOP_GAIN = Enum.forString("stop-gain");
                static final Enum STOP_LOSS = Enum.forString("stop-loss");
                
                static final int INT_NO_CHANGE = Enum.INT_NO_CHANGE;
                static final int INT_SYNONYMOUS = Enum.INT_SYNONYMOUS;
                static final int INT_NONSENSE = Enum.INT_NONSENSE;
                static final int INT_MISSENSE = Enum.INT_MISSENSE;
                static final int INT_FRAMESHIFT = Enum.INT_FRAMESHIFT;
                static final int INT_UP_REGULATOR = Enum.INT_UP_REGULATOR;
                static final int INT_DOWN_REGULATOR = Enum.INT_DOWN_REGULATOR;
                static final int INT_METHYLATION = Enum.INT_METHYLATION;
                static final int INT_STOP_GAIN = Enum.INT_STOP_GAIN;
                static final int INT_STOP_LOSS = Enum.INT_STOP_LOSS;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Effect$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_NO_CHANGE
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
                    
                    static final int INT_NO_CHANGE = 1;
                    static final int INT_SYNONYMOUS = 2;
                    static final int INT_NONSENSE = 3;
                    static final int INT_MISSENSE = 4;
                    static final int INT_FRAMESHIFT = 5;
                    static final int INT_UP_REGULATOR = 6;
                    static final int INT_DOWN_REGULATOR = 7;
                    static final int INT_METHYLATION = 8;
                    static final int INT_STOP_GAIN = 9;
                    static final int INT_STOP_LOSS = 10;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("no-change", INT_NO_CHANGE),
                        new Enum("synonymous", INT_SYNONYMOUS),
                        new Enum("nonsense", INT_NONSENSE),
                        new Enum("missense", INT_MISSENSE),
                        new Enum("frameshift", INT_FRAMESHIFT),
                        new Enum("up-regulator", INT_UP_REGULATOR),
                        new Enum("down-regulator", INT_DOWN_REGULATOR),
                        new Enum("methylation", INT_METHYLATION),
                        new Enum("stop-gain", INT_STOP_GAIN),
                        new Enum("stop-loss", INT_STOP_LOSS),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mapping(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Mapping.
         */
        public interface Mapping extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mapping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mappingd882elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Mapping$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value5b9battrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum HAS_OTHER_SNP = Enum.forString("has-other-snp");
                static final Enum HAS_ASSEMBLY_CONFLICT = Enum.forString("has-assembly-conflict");
                static final Enum IS_ASSEMBLY_SPECIFIC = Enum.forString("is-assembly-specific");
                
                static final int INT_HAS_OTHER_SNP = Enum.INT_HAS_OTHER_SNP;
                static final int INT_HAS_ASSEMBLY_CONFLICT = Enum.INT_HAS_ASSEMBLY_CONFLICT;
                static final int INT_IS_ASSEMBLY_SPECIFIC = Enum.INT_IS_ASSEMBLY_SPECIFIC;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Mapping$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_HAS_OTHER_SNP
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
                    
                    static final int INT_HAS_OTHER_SNP = 1;
                    static final int INT_HAS_ASSEMBLY_CONFLICT = 2;
                    static final int INT_IS_ASSEMBLY_SPECIFIC = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("has-other-snp", INT_HAS_OTHER_SNP),
                        new Enum("has-assembly-conflict", INT_HAS_ASSEMBLY_CONFLICT),
                        new Enum("is-assembly-specific", INT_IS_ASSEMBLY_SPECIFIC),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML map-weight(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$MapWeight.
         */
        public interface MapWeight extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MapWeight.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mapweight506delemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$MapWeight$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value4ab4attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum IS_UNIQUELY_PLACED = Enum.forString("is-uniquely-placed");
                static final Enum PLACED_TWICE_ON_SAME_CHROM = Enum.forString("placed-twice-on-same-chrom");
                static final Enum PLACED_TWICE_ON_DIFF_CHROM = Enum.forString("placed-twice-on-diff-chrom");
                static final Enum MANY_PLACEMENTS = Enum.forString("many-placements");
                
                static final int INT_IS_UNIQUELY_PLACED = Enum.INT_IS_UNIQUELY_PLACED;
                static final int INT_PLACED_TWICE_ON_SAME_CHROM = Enum.INT_PLACED_TWICE_ON_SAME_CHROM;
                static final int INT_PLACED_TWICE_ON_DIFF_CHROM = Enum.INT_PLACED_TWICE_ON_DIFF_CHROM;
                static final int INT_MANY_PLACEMENTS = Enum.INT_MANY_PLACEMENTS;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$MapWeight$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_IS_UNIQUELY_PLACED
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
                    
                    static final int INT_IS_UNIQUELY_PLACED = 1;
                    static final int INT_PLACED_TWICE_ON_SAME_CHROM = 2;
                    static final int INT_PLACED_TWICE_ON_DIFF_CHROM = 3;
                    static final int INT_MANY_PLACEMENTS = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("is-uniquely-placed", INT_IS_UNIQUELY_PLACED),
                        new Enum("placed-twice-on-same-chrom", INT_PLACED_TWICE_ON_SAME_CHROM),
                        new Enum("placed-twice-on-diff-chrom", INT_PLACED_TWICE_ON_DIFF_CHROM),
                        new Enum("many-placements", INT_MANY_PLACEMENTS),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML frequency-based-validation(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$FrequencyBasedValidation.
         */
        public interface FrequencyBasedValidation extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FrequencyBasedValidation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("frequencybasedvalidation4208elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$FrequencyBasedValidation$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuece4fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum IS_MUTATION = Enum.forString("is-mutation");
                static final Enum ABOVE_5_PCT_ALL = Enum.forString("above-5pct-all");
                static final Enum ABOVE_5_PCT_1_PLUS = Enum.forString("above-5pct-1plus");
                static final Enum VALIDATED = Enum.forString("validated");
                static final Enum ABOVE_1_PCT_ALL = Enum.forString("above-1pct-all");
                static final Enum ABOVE_1_PCT_1_PLUS = Enum.forString("above-1pct-1plus");
                
                static final int INT_IS_MUTATION = Enum.INT_IS_MUTATION;
                static final int INT_ABOVE_5_PCT_ALL = Enum.INT_ABOVE_5_PCT_ALL;
                static final int INT_ABOVE_5_PCT_1_PLUS = Enum.INT_ABOVE_5_PCT_1_PLUS;
                static final int INT_VALIDATED = Enum.INT_VALIDATED;
                static final int INT_ABOVE_1_PCT_ALL = Enum.INT_ABOVE_1_PCT_ALL;
                static final int INT_ABOVE_1_PCT_1_PLUS = Enum.INT_ABOVE_1_PCT_1_PLUS;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$FrequencyBasedValidation$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_IS_MUTATION
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
                    
                    static final int INT_IS_MUTATION = 1;
                    static final int INT_ABOVE_5_PCT_ALL = 2;
                    static final int INT_ABOVE_5_PCT_1_PLUS = 3;
                    static final int INT_VALIDATED = 4;
                    static final int INT_ABOVE_1_PCT_ALL = 5;
                    static final int INT_ABOVE_1_PCT_1_PLUS = 6;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("is-mutation", INT_IS_MUTATION),
                        new Enum("above-5pct-all", INT_ABOVE_5_PCT_ALL),
                        new Enum("above-5pct-1plus", INT_ABOVE_5_PCT_1_PLUS),
                        new Enum("validated", INT_VALIDATED),
                        new Enum("above-1pct-all", INT_ABOVE_1_PCT_ALL),
                        new Enum("above-1pct-1plus", INT_ABOVE_1_PCT_1_PLUS),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genotype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Genotype.
         */
        public interface Genotype extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Genotype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genotype693delemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Genotype$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value4944attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum IN_HAPLOTYPE_SET = Enum.forString("in-haplotype-set");
                static final Enum HAS_GENOTYPES = Enum.forString("has-genotypes");
                
                static final int INT_IN_HAPLOTYPE_SET = Enum.INT_IN_HAPLOTYPE_SET;
                static final int INT_HAS_GENOTYPES = Enum.INT_HAS_GENOTYPES;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Genotype$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_IN_HAPLOTYPE_SET
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
                    
                    static final int INT_IN_HAPLOTYPE_SET = 1;
                    static final int INT_HAS_GENOTYPES = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("in-haplotype-set", INT_IN_HAPLOTYPE_SET),
                        new Enum("has-genotypes", INT_HAS_GENOTYPES),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML quality-check(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$QualityCheck.
         */
        public interface QualityCheck extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QualityCheck.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("qualitycheck5a6eelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$QualityCheck$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value66c7attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum CONTIG_ALLELE_MISSING = Enum.forString("contig-allele-missing");
                static final Enum WITHDRAWN_BY_SUBMITTER = Enum.forString("withdrawn-by-submitter");
                static final Enum NON_OVERLAPPING_ALLELES = Enum.forString("non-overlapping-alleles");
                static final Enum STRAIN_SPECIFIC = Enum.forString("strain-specific");
                static final Enum GENOTYPE_CONFLICT = Enum.forString("genotype-conflict");
                
                static final int INT_CONTIG_ALLELE_MISSING = Enum.INT_CONTIG_ALLELE_MISSING;
                static final int INT_WITHDRAWN_BY_SUBMITTER = Enum.INT_WITHDRAWN_BY_SUBMITTER;
                static final int INT_NON_OVERLAPPING_ALLELES = Enum.INT_NON_OVERLAPPING_ALLELES;
                static final int INT_STRAIN_SPECIFIC = Enum.INT_STRAIN_SPECIFIC;
                static final int INT_GENOTYPE_CONFLICT = Enum.INT_GENOTYPE_CONFLICT;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$QualityCheck$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_CONTIG_ALLELE_MISSING
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
                    
                    static final int INT_CONTIG_ALLELE_MISSING = 1;
                    static final int INT_WITHDRAWN_BY_SUBMITTER = 2;
                    static final int INT_NON_OVERLAPPING_ALLELES = 3;
                    static final int INT_STRAIN_SPECIFIC = 4;
                    static final int INT_GENOTYPE_CONFLICT = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("contig-allele-missing", INT_CONTIG_ALLELE_MISSING),
                        new Enum("withdrawn-by-submitter", INT_WITHDRAWN_BY_SUBMITTER),
                        new Enum("non-overlapping-alleles", INT_NON_OVERLAPPING_ALLELES),
                        new Enum("strain-specific", INT_STRAIN_SPECIFIC),
                        new Enum("genotype-conflict", INT_GENOTYPE_CONFLICT),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML confidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Confidence.
         */
        public interface Confidence extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Confidence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("confidence766eelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Confidence$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value70b5attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum LIKELY_ARTIFACT = Enum.forString("likely-artifact");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_LIKELY_ARTIFACT = Enum.INT_LIKELY_ARTIFACT;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Confidence$Value.
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
                    static final int INT_LIKELY_ARTIFACT = 2;
                    static final int INT_OTHER = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("likely-artifact", INT_LIKELY_ARTIFACT),
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
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties newInstance() {
              return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.VariantPropertiesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
