/*
 * An XML document type.
 * Localname: Phenotype
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PhenotypeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Phenotype(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PhenotypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhenotypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("phenotype4df4doctype");
    
    /**
     * Gets the "Phenotype" element
     */
    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype getPhenotype();
    
    /**
     * Sets the "Phenotype" element
     */
    void setPhenotype(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype phenotype);
    
    /**
     * Appends and returns a new empty "Phenotype" element
     */
    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype addNewPhenotype();
    
    /**
     * An XML Phenotype(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Phenotype extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Phenotype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("phenotype0c68elemtype");
        
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
         * Gets the "term" element
         */
        java.lang.String getTerm();
        
        /**
         * Gets (as xml) the "term" element
         */
        org.apache.xmlbeans.XmlString xgetTerm();
        
        /**
         * True if has "term" element
         */
        boolean isSetTerm();
        
        /**
         * Sets the "term" element
         */
        void setTerm(java.lang.String term);
        
        /**
         * Sets (as xml) the "term" element
         */
        void xsetTerm(org.apache.xmlbeans.XmlString term);
        
        /**
         * Unsets the "term" element
         */
        void unsetTerm();
        
        /**
         * Gets the "xref" element
         */
        gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref getXref();
        
        /**
         * True if has "xref" element
         */
        boolean isSetXref();
        
        /**
         * Sets the "xref" element
         */
        void setXref(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref xref);
        
        /**
         * Appends and returns a new empty "xref" element
         */
        gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref addNewXref();
        
        /**
         * Unsets the "xref" element
         */
        void unsetXref();
        
        /**
         * Gets the "clinical-significance" element
         */
        gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance getClinicalSignificance();
        
        /**
         * True if has "clinical-significance" element
         */
        boolean isSetClinicalSignificance();
        
        /**
         * Sets the "clinical-significance" element
         */
        void setClinicalSignificance(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance clinicalSignificance);
        
        /**
         * Appends and returns a new empty "clinical-significance" element
         */
        gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance addNewClinicalSignificance();
        
        /**
         * Unsets the "clinical-significance" element
         */
        void unsetClinicalSignificance();
        
        /**
         * An XML xref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Xref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Xref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("xrefb09felemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref newInstance() {
                  return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML clinical-significance(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PhenotypeDocument$Phenotype$ClinicalSignificance.
         */
        public interface ClinicalSignificance extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalSignificance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("clinicalsignificance1a51elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PhenotypeDocument$Phenotype$ClinicalSignificance$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value8faaattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum UNTESTED = Enum.forString("untested");
                static final Enum NON_PATHOGENIC = Enum.forString("non-pathogenic");
                static final Enum PROBABLE_NON_PATHOGENIC = Enum.forString("probable-non-pathogenic");
                static final Enum PROBABLE_PATHOGENIC = Enum.forString("probable-pathogenic");
                static final Enum PATHOGENIC = Enum.forString("pathogenic");
                static final Enum DRUG_RESPONSE = Enum.forString("drug-response");
                static final Enum HISTOCOMPATIBILITY = Enum.forString("histocompatibility");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_UNTESTED = Enum.INT_UNTESTED;
                static final int INT_NON_PATHOGENIC = Enum.INT_NON_PATHOGENIC;
                static final int INT_PROBABLE_NON_PATHOGENIC = Enum.INT_PROBABLE_NON_PATHOGENIC;
                static final int INT_PROBABLE_PATHOGENIC = Enum.INT_PROBABLE_PATHOGENIC;
                static final int INT_PATHOGENIC = Enum.INT_PATHOGENIC;
                static final int INT_DRUG_RESPONSE = Enum.INT_DRUG_RESPONSE;
                static final int INT_HISTOCOMPATIBILITY = Enum.INT_HISTOCOMPATIBILITY;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PhenotypeDocument$Phenotype$ClinicalSignificance$Value.
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
                    static final int INT_UNTESTED = 2;
                    static final int INT_NON_PATHOGENIC = 3;
                    static final int INT_PROBABLE_NON_PATHOGENIC = 4;
                    static final int INT_PROBABLE_PATHOGENIC = 5;
                    static final int INT_PATHOGENIC = 6;
                    static final int INT_DRUG_RESPONSE = 7;
                    static final int INT_HISTOCOMPATIBILITY = 8;
                    static final int INT_OTHER = 9;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("untested", INT_UNTESTED),
                        new Enum("non-pathogenic", INT_NON_PATHOGENIC),
                        new Enum("probable-non-pathogenic", INT_PROBABLE_NON_PATHOGENIC),
                        new Enum("probable-pathogenic", INT_PROBABLE_PATHOGENIC),
                        new Enum("pathogenic", INT_PATHOGENIC),
                        new Enum("drug-response", INT_DRUG_RESPONSE),
                        new Enum("histocompatibility", INT_HISTOCOMPATIBILITY),
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
                    public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance newInstance() {
                  return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype newInstance() {
              return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PhenotypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PhenotypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
