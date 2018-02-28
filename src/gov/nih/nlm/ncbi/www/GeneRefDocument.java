/*
 * An XML document type.
 * Localname: Gene-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GeneRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Gene-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface GeneRefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneRefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("generefee39doctype");
    
    /**
     * Gets the "Gene-ref" element
     */
    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef getGeneRef();
    
    /**
     * Sets the "Gene-ref" element
     */
    void setGeneRef(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef geneRef);
    
    /**
     * Appends and returns a new empty "Gene-ref" element
     */
    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef addNewGeneRef();
    
    /**
     * An XML Gene-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface GeneRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("generef77c2elemtype");
        
        /**
         * Gets the "locus" element
         */
        java.lang.String getLocus();
        
        /**
         * Gets (as xml) the "locus" element
         */
        org.apache.xmlbeans.XmlString xgetLocus();
        
        /**
         * True if has "locus" element
         */
        boolean isSetLocus();
        
        /**
         * Sets the "locus" element
         */
        void setLocus(java.lang.String locus);
        
        /**
         * Sets (as xml) the "locus" element
         */
        void xsetLocus(org.apache.xmlbeans.XmlString locus);
        
        /**
         * Unsets the "locus" element
         */
        void unsetLocus();
        
        /**
         * Gets the "allele" element
         */
        java.lang.String getAllele();
        
        /**
         * Gets (as xml) the "allele" element
         */
        org.apache.xmlbeans.XmlString xgetAllele();
        
        /**
         * True if has "allele" element
         */
        boolean isSetAllele();
        
        /**
         * Sets the "allele" element
         */
        void setAllele(java.lang.String allele);
        
        /**
         * Sets (as xml) the "allele" element
         */
        void xsetAllele(org.apache.xmlbeans.XmlString allele);
        
        /**
         * Unsets the "allele" element
         */
        void unsetAllele();
        
        /**
         * Gets the "desc" element
         */
        java.lang.String getDesc();
        
        /**
         * Gets (as xml) the "desc" element
         */
        org.apache.xmlbeans.XmlString xgetDesc();
        
        /**
         * True if has "desc" element
         */
        boolean isSetDesc();
        
        /**
         * Sets the "desc" element
         */
        void setDesc(java.lang.String desc);
        
        /**
         * Sets (as xml) the "desc" element
         */
        void xsetDesc(org.apache.xmlbeans.XmlString desc);
        
        /**
         * Unsets the "desc" element
         */
        void unsetDesc();
        
        /**
         * Gets the "maploc" element
         */
        java.lang.String getMaploc();
        
        /**
         * Gets (as xml) the "maploc" element
         */
        org.apache.xmlbeans.XmlString xgetMaploc();
        
        /**
         * True if has "maploc" element
         */
        boolean isSetMaploc();
        
        /**
         * Sets the "maploc" element
         */
        void setMaploc(java.lang.String maploc);
        
        /**
         * Sets (as xml) the "maploc" element
         */
        void xsetMaploc(org.apache.xmlbeans.XmlString maploc);
        
        /**
         * Unsets the "maploc" element
         */
        void unsetMaploc();
        
        /**
         * Gets the "pseudo" element
         */
        gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo getPseudo();
        
        /**
         * True if has "pseudo" element
         */
        boolean isSetPseudo();
        
        /**
         * Sets the "pseudo" element
         */
        void setPseudo(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo pseudo);
        
        /**
         * Appends and returns a new empty "pseudo" element
         */
        gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo addNewPseudo();
        
        /**
         * Unsets the "pseudo" element
         */
        void unsetPseudo();
        
        /**
         * Gets the "db" element
         */
        gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db getDb();
        
        /**
         * True if has "db" element
         */
        boolean isSetDb();
        
        /**
         * Sets the "db" element
         */
        void setDb(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db db);
        
        /**
         * Appends and returns a new empty "db" element
         */
        gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db addNewDb();
        
        /**
         * Unsets the "db" element
         */
        void unsetDb();
        
        /**
         * Gets array of all "syn" elements
         */
        java.lang.String[] getSynArray();
        
        /**
         * Gets ith "syn" element
         */
        java.lang.String getSynArray(int i);
        
        /**
         * Gets (as xml) array of all "syn" elements
         */
        org.apache.xmlbeans.XmlString[] xgetSynArray();
        
        /**
         * Gets (as xml) ith "syn" element
         */
        org.apache.xmlbeans.XmlString xgetSynArray(int i);
        
        /**
         * Returns number of "syn" element
         */
        int sizeOfSynArray();
        
        /**
         * Sets array of all "syn" element
         */
        void setSynArray(java.lang.String[] synArray);
        
        /**
         * Sets ith "syn" element
         */
        void setSynArray(int i, java.lang.String syn);
        
        /**
         * Sets (as xml) array of all "syn" element
         */
        void xsetSynArray(org.apache.xmlbeans.XmlString[] synArray);
        
        /**
         * Sets (as xml) ith "syn" element
         */
        void xsetSynArray(int i, org.apache.xmlbeans.XmlString syn);
        
        /**
         * Inserts the value as the ith "syn" element
         */
        void insertSyn(int i, java.lang.String syn);
        
        /**
         * Appends the value as the last "syn" element
         */
        void addSyn(java.lang.String syn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "syn" element
         */
        org.apache.xmlbeans.XmlString insertNewSyn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "syn" element
         */
        org.apache.xmlbeans.XmlString addNewSyn();
        
        /**
         * Removes the ith "syn" element
         */
        void removeSyn(int i);
        
        /**
         * Gets the "locus-tag" element
         */
        java.lang.String getLocusTag();
        
        /**
         * Gets (as xml) the "locus-tag" element
         */
        org.apache.xmlbeans.XmlString xgetLocusTag();
        
        /**
         * True if has "locus-tag" element
         */
        boolean isSetLocusTag();
        
        /**
         * Sets the "locus-tag" element
         */
        void setLocusTag(java.lang.String locusTag);
        
        /**
         * Sets (as xml) the "locus-tag" element
         */
        void xsetLocusTag(org.apache.xmlbeans.XmlString locusTag);
        
        /**
         * Unsets the "locus-tag" element
         */
        void unsetLocusTag();
        
        /**
         * Gets the "formal-name" element
         */
        gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName getFormalName();
        
        /**
         * True if has "formal-name" element
         */
        boolean isSetFormalName();
        
        /**
         * Sets the "formal-name" element
         */
        void setFormalName(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName formalName);
        
        /**
         * Appends and returns a new empty "formal-name" element
         */
        gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName addNewFormalName();
        
        /**
         * Unsets the "formal-name" element
         */
        void unsetFormalName();
        
        /**
         * An XML pseudo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pseudo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pseudo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pseudo259celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GeneRefDocument$GeneRef$Pseudo$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value0f23attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.GeneRefDocument$GeneRef$Pseudo$Value.
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
                    public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo newInstance() {
                  return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Db extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Db.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("db0c5celemtype");
            
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
                public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db newInstance() {
                  return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML formal-name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FormalName extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormalName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("formalnamed297elemtype");
            
            /**
             * Gets the "Gene-nomenclature" element
             */
            gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature getGeneNomenclature();
            
            /**
             * Sets the "Gene-nomenclature" element
             */
            void setGeneNomenclature(gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature geneNomenclature);
            
            /**
             * Appends and returns a new empty "Gene-nomenclature" element
             */
            gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature addNewGeneNomenclature();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName newInstance() {
                  return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef newInstance() {
              return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.GeneRefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.GeneRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.GeneRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
