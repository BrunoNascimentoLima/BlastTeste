/*
 * An XML document type.
 * Localname: Population-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PopulationDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Population-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PopulationDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PopulationDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("populationdata9bb6doctype");
    
    /**
     * Gets the "Population-data" element
     */
    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData getPopulationData();
    
    /**
     * Sets the "Population-data" element
     */
    void setPopulationData(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData populationData);
    
    /**
     * Appends and returns a new empty "Population-data" element
     */
    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData addNewPopulationData();
    
    /**
     * An XML Population-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PopulationData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PopulationData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("populationdata4facelemtype");
        
        /**
         * Gets the "population" element
         */
        java.lang.String getPopulation();
        
        /**
         * Gets (as xml) the "population" element
         */
        org.apache.xmlbeans.XmlString xgetPopulation();
        
        /**
         * Sets the "population" element
         */
        void setPopulation(java.lang.String population);
        
        /**
         * Sets (as xml) the "population" element
         */
        void xsetPopulation(org.apache.xmlbeans.XmlString population);
        
        /**
         * Gets the "genotype-frequency" element
         */
        double getGenotypeFrequency();
        
        /**
         * Gets (as xml) the "genotype-frequency" element
         */
        org.apache.xmlbeans.XmlDouble xgetGenotypeFrequency();
        
        /**
         * True if has "genotype-frequency" element
         */
        boolean isSetGenotypeFrequency();
        
        /**
         * Sets the "genotype-frequency" element
         */
        void setGenotypeFrequency(double genotypeFrequency);
        
        /**
         * Sets (as xml) the "genotype-frequency" element
         */
        void xsetGenotypeFrequency(org.apache.xmlbeans.XmlDouble genotypeFrequency);
        
        /**
         * Unsets the "genotype-frequency" element
         */
        void unsetGenotypeFrequency();
        
        /**
         * Gets the "chromosomes-tested" element
         */
        java.math.BigInteger getChromosomesTested();
        
        /**
         * Gets (as xml) the "chromosomes-tested" element
         */
        org.apache.xmlbeans.XmlInteger xgetChromosomesTested();
        
        /**
         * True if has "chromosomes-tested" element
         */
        boolean isSetChromosomesTested();
        
        /**
         * Sets the "chromosomes-tested" element
         */
        void setChromosomesTested(java.math.BigInteger chromosomesTested);
        
        /**
         * Sets (as xml) the "chromosomes-tested" element
         */
        void xsetChromosomesTested(org.apache.xmlbeans.XmlInteger chromosomesTested);
        
        /**
         * Unsets the "chromosomes-tested" element
         */
        void unsetChromosomesTested();
        
        /**
         * Gets the "sample-ids" element
         */
        gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds getSampleIds();
        
        /**
         * True if has "sample-ids" element
         */
        boolean isSetSampleIds();
        
        /**
         * Sets the "sample-ids" element
         */
        void setSampleIds(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds sampleIds);
        
        /**
         * Appends and returns a new empty "sample-ids" element
         */
        gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds addNewSampleIds();
        
        /**
         * Unsets the "sample-ids" element
         */
        void unsetSampleIds();
        
        /**
         * Gets the "allele-frequency" element
         */
        double getAlleleFrequency();
        
        /**
         * Gets (as xml) the "allele-frequency" element
         */
        org.apache.xmlbeans.XmlDouble xgetAlleleFrequency();
        
        /**
         * True if has "allele-frequency" element
         */
        boolean isSetAlleleFrequency();
        
        /**
         * Sets the "allele-frequency" element
         */
        void setAlleleFrequency(double alleleFrequency);
        
        /**
         * Sets (as xml) the "allele-frequency" element
         */
        void xsetAlleleFrequency(org.apache.xmlbeans.XmlDouble alleleFrequency);
        
        /**
         * Unsets the "allele-frequency" element
         */
        void unsetAlleleFrequency();
        
        /**
         * Gets the "flags" element
         */
        gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags getFlags();
        
        /**
         * True if has "flags" element
         */
        boolean isSetFlags();
        
        /**
         * Sets the "flags" element
         */
        void setFlags(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags flags);
        
        /**
         * Appends and returns a new empty "flags" element
         */
        gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags addNewFlags();
        
        /**
         * Unsets the "flags" element
         */
        void unsetFlags();
        
        /**
         * An XML sample-ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SampleIds extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SampleIds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sampleids0e5delemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds newInstance() {
                  return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML flags(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PopulationDataDocument$PopulationData$Flags.
         */
        public interface Flags extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Flags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("flagsbc9felemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PopulationDataDocument$PopulationData$Flags$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuec678attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum IS_DEFAULT_POPULATION = Enum.forString("is-default-population");
                static final Enum IS_MINOR_ALLELE = Enum.forString("is-minor-allele");
                static final Enum IS_RARE_ALLELE = Enum.forString("is-rare-allele");
                
                static final int INT_IS_DEFAULT_POPULATION = Enum.INT_IS_DEFAULT_POPULATION;
                static final int INT_IS_MINOR_ALLELE = Enum.INT_IS_MINOR_ALLELE;
                static final int INT_IS_RARE_ALLELE = Enum.INT_IS_RARE_ALLELE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PopulationDataDocument$PopulationData$Flags$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_IS_DEFAULT_POPULATION
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
                    
                    static final int INT_IS_DEFAULT_POPULATION = 1;
                    static final int INT_IS_MINOR_ALLELE = 2;
                    static final int INT_IS_RARE_ALLELE = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("is-default-population", INT_IS_DEFAULT_POPULATION),
                        new Enum("is-minor-allele", INT_IS_MINOR_ALLELE),
                        new Enum("is-rare-allele", INT_IS_RARE_ALLELE),
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
                    public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags newInstance() {
                  return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData newInstance() {
              return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PopulationDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PopulationDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
