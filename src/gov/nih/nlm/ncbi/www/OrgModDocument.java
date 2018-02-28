/*
 * An XML document type.
 * Localname: OrgMod
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.OrgModDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one OrgMod(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface OrgModDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgModDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgmod8d9cdoctype");
    
    /**
     * Gets the "OrgMod" element
     */
    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod getOrgMod();
    
    /**
     * Sets the "OrgMod" element
     */
    void setOrgMod(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod orgMod);
    
    /**
     * Appends and returns a new empty "OrgMod" element
     */
    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod addNewOrgMod();
    
    /**
     * An XML OrgMod(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface OrgMod extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgMod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgmod81a2elemtype");
        
        /**
         * Gets the "subtype" element
         */
        gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype getSubtype();
        
        /**
         * Sets the "subtype" element
         */
        void setSubtype(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype subtype);
        
        /**
         * Appends and returns a new empty "subtype" element
         */
        gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype addNewSubtype();
        
        /**
         * Gets the "subname" element
         */
        java.lang.String getSubname();
        
        /**
         * Gets (as xml) the "subname" element
         */
        org.apache.xmlbeans.XmlString xgetSubname();
        
        /**
         * Sets the "subname" element
         */
        void setSubname(java.lang.String subname);
        
        /**
         * Sets (as xml) the "subname" element
         */
        void xsetSubname(org.apache.xmlbeans.XmlString subname);
        
        /**
         * Gets the "attrib" element
         */
        java.lang.String getAttrib();
        
        /**
         * Gets (as xml) the "attrib" element
         */
        org.apache.xmlbeans.XmlString xgetAttrib();
        
        /**
         * True if has "attrib" element
         */
        boolean isSetAttrib();
        
        /**
         * Sets the "attrib" element
         */
        void setAttrib(java.lang.String attrib);
        
        /**
         * Sets (as xml) the "attrib" element
         */
        void xsetAttrib(org.apache.xmlbeans.XmlString attrib);
        
        /**
         * Unsets the "attrib" element
         */
        void unsetAttrib();
        
        /**
         * An XML subtype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.OrgModDocument$OrgMod$Subtype.
         */
        public interface Subtype extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subtype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("subtypee908elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.OrgModDocument$OrgMod$Subtype$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuec4e1attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum STRAIN = Enum.forString("strain");
                static final Enum SUBSTRAIN = Enum.forString("substrain");
                static final Enum TYPE = Enum.forString("type");
                static final Enum SUBTYPE = Enum.forString("subtype");
                static final Enum VARIETY = Enum.forString("variety");
                static final Enum SEROTYPE = Enum.forString("serotype");
                static final Enum SEROGROUP = Enum.forString("serogroup");
                static final Enum SEROVAR = Enum.forString("serovar");
                static final Enum CULTIVAR = Enum.forString("cultivar");
                static final Enum PATHOVAR = Enum.forString("pathovar");
                static final Enum CHEMOVAR = Enum.forString("chemovar");
                static final Enum BIOVAR = Enum.forString("biovar");
                static final Enum BIOTYPE = Enum.forString("biotype");
                static final Enum GROUP = Enum.forString("group");
                static final Enum SUBGROUP = Enum.forString("subgroup");
                static final Enum ISOLATE = Enum.forString("isolate");
                static final Enum COMMON = Enum.forString("common");
                static final Enum ACRONYM = Enum.forString("acronym");
                static final Enum DOSAGE = Enum.forString("dosage");
                static final Enum NAT_HOST = Enum.forString("nat-host");
                static final Enum SUB_SPECIES = Enum.forString("sub-species");
                static final Enum SPECIMEN_VOUCHER = Enum.forString("specimen-voucher");
                static final Enum AUTHORITY = Enum.forString("authority");
                static final Enum FORMA = Enum.forString("forma");
                static final Enum FORMA_SPECIALIS = Enum.forString("forma-specialis");
                static final Enum ECOTYPE = Enum.forString("ecotype");
                static final Enum SYNONYM = Enum.forString("synonym");
                static final Enum ANAMORPH = Enum.forString("anamorph");
                static final Enum TELEOMORPH = Enum.forString("teleomorph");
                static final Enum BREED = Enum.forString("breed");
                static final Enum GB_ACRONYM = Enum.forString("gb-acronym");
                static final Enum GB_ANAMORPH = Enum.forString("gb-anamorph");
                static final Enum GB_SYNONYM = Enum.forString("gb-synonym");
                static final Enum CULTURE_COLLECTION = Enum.forString("culture-collection");
                static final Enum BIO_MATERIAL = Enum.forString("bio-material");
                static final Enum METAGENOME_SOURCE = Enum.forString("metagenome-source");
                static final Enum OLD_LINEAGE = Enum.forString("old-lineage");
                static final Enum OLD_NAME = Enum.forString("old-name");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_STRAIN = Enum.INT_STRAIN;
                static final int INT_SUBSTRAIN = Enum.INT_SUBSTRAIN;
                static final int INT_TYPE = Enum.INT_TYPE;
                static final int INT_SUBTYPE = Enum.INT_SUBTYPE;
                static final int INT_VARIETY = Enum.INT_VARIETY;
                static final int INT_SEROTYPE = Enum.INT_SEROTYPE;
                static final int INT_SEROGROUP = Enum.INT_SEROGROUP;
                static final int INT_SEROVAR = Enum.INT_SEROVAR;
                static final int INT_CULTIVAR = Enum.INT_CULTIVAR;
                static final int INT_PATHOVAR = Enum.INT_PATHOVAR;
                static final int INT_CHEMOVAR = Enum.INT_CHEMOVAR;
                static final int INT_BIOVAR = Enum.INT_BIOVAR;
                static final int INT_BIOTYPE = Enum.INT_BIOTYPE;
                static final int INT_GROUP = Enum.INT_GROUP;
                static final int INT_SUBGROUP = Enum.INT_SUBGROUP;
                static final int INT_ISOLATE = Enum.INT_ISOLATE;
                static final int INT_COMMON = Enum.INT_COMMON;
                static final int INT_ACRONYM = Enum.INT_ACRONYM;
                static final int INT_DOSAGE = Enum.INT_DOSAGE;
                static final int INT_NAT_HOST = Enum.INT_NAT_HOST;
                static final int INT_SUB_SPECIES = Enum.INT_SUB_SPECIES;
                static final int INT_SPECIMEN_VOUCHER = Enum.INT_SPECIMEN_VOUCHER;
                static final int INT_AUTHORITY = Enum.INT_AUTHORITY;
                static final int INT_FORMA = Enum.INT_FORMA;
                static final int INT_FORMA_SPECIALIS = Enum.INT_FORMA_SPECIALIS;
                static final int INT_ECOTYPE = Enum.INT_ECOTYPE;
                static final int INT_SYNONYM = Enum.INT_SYNONYM;
                static final int INT_ANAMORPH = Enum.INT_ANAMORPH;
                static final int INT_TELEOMORPH = Enum.INT_TELEOMORPH;
                static final int INT_BREED = Enum.INT_BREED;
                static final int INT_GB_ACRONYM = Enum.INT_GB_ACRONYM;
                static final int INT_GB_ANAMORPH = Enum.INT_GB_ANAMORPH;
                static final int INT_GB_SYNONYM = Enum.INT_GB_SYNONYM;
                static final int INT_CULTURE_COLLECTION = Enum.INT_CULTURE_COLLECTION;
                static final int INT_BIO_MATERIAL = Enum.INT_BIO_MATERIAL;
                static final int INT_METAGENOME_SOURCE = Enum.INT_METAGENOME_SOURCE;
                static final int INT_OLD_LINEAGE = Enum.INT_OLD_LINEAGE;
                static final int INT_OLD_NAME = Enum.INT_OLD_NAME;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.OrgModDocument$OrgMod$Subtype$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_STRAIN
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
                    
                    static final int INT_STRAIN = 1;
                    static final int INT_SUBSTRAIN = 2;
                    static final int INT_TYPE = 3;
                    static final int INT_SUBTYPE = 4;
                    static final int INT_VARIETY = 5;
                    static final int INT_SEROTYPE = 6;
                    static final int INT_SEROGROUP = 7;
                    static final int INT_SEROVAR = 8;
                    static final int INT_CULTIVAR = 9;
                    static final int INT_PATHOVAR = 10;
                    static final int INT_CHEMOVAR = 11;
                    static final int INT_BIOVAR = 12;
                    static final int INT_BIOTYPE = 13;
                    static final int INT_GROUP = 14;
                    static final int INT_SUBGROUP = 15;
                    static final int INT_ISOLATE = 16;
                    static final int INT_COMMON = 17;
                    static final int INT_ACRONYM = 18;
                    static final int INT_DOSAGE = 19;
                    static final int INT_NAT_HOST = 20;
                    static final int INT_SUB_SPECIES = 21;
                    static final int INT_SPECIMEN_VOUCHER = 22;
                    static final int INT_AUTHORITY = 23;
                    static final int INT_FORMA = 24;
                    static final int INT_FORMA_SPECIALIS = 25;
                    static final int INT_ECOTYPE = 26;
                    static final int INT_SYNONYM = 27;
                    static final int INT_ANAMORPH = 28;
                    static final int INT_TELEOMORPH = 29;
                    static final int INT_BREED = 30;
                    static final int INT_GB_ACRONYM = 31;
                    static final int INT_GB_ANAMORPH = 32;
                    static final int INT_GB_SYNONYM = 33;
                    static final int INT_CULTURE_COLLECTION = 34;
                    static final int INT_BIO_MATERIAL = 35;
                    static final int INT_METAGENOME_SOURCE = 36;
                    static final int INT_OLD_LINEAGE = 37;
                    static final int INT_OLD_NAME = 38;
                    static final int INT_OTHER = 39;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("strain", INT_STRAIN),
                        new Enum("substrain", INT_SUBSTRAIN),
                        new Enum("type", INT_TYPE),
                        new Enum("subtype", INT_SUBTYPE),
                        new Enum("variety", INT_VARIETY),
                        new Enum("serotype", INT_SEROTYPE),
                        new Enum("serogroup", INT_SEROGROUP),
                        new Enum("serovar", INT_SEROVAR),
                        new Enum("cultivar", INT_CULTIVAR),
                        new Enum("pathovar", INT_PATHOVAR),
                        new Enum("chemovar", INT_CHEMOVAR),
                        new Enum("biovar", INT_BIOVAR),
                        new Enum("biotype", INT_BIOTYPE),
                        new Enum("group", INT_GROUP),
                        new Enum("subgroup", INT_SUBGROUP),
                        new Enum("isolate", INT_ISOLATE),
                        new Enum("common", INT_COMMON),
                        new Enum("acronym", INT_ACRONYM),
                        new Enum("dosage", INT_DOSAGE),
                        new Enum("nat-host", INT_NAT_HOST),
                        new Enum("sub-species", INT_SUB_SPECIES),
                        new Enum("specimen-voucher", INT_SPECIMEN_VOUCHER),
                        new Enum("authority", INT_AUTHORITY),
                        new Enum("forma", INT_FORMA),
                        new Enum("forma-specialis", INT_FORMA_SPECIALIS),
                        new Enum("ecotype", INT_ECOTYPE),
                        new Enum("synonym", INT_SYNONYM),
                        new Enum("anamorph", INT_ANAMORPH),
                        new Enum("teleomorph", INT_TELEOMORPH),
                        new Enum("breed", INT_BREED),
                        new Enum("gb-acronym", INT_GB_ACRONYM),
                        new Enum("gb-anamorph", INT_GB_ANAMORPH),
                        new Enum("gb-synonym", INT_GB_SYNONYM),
                        new Enum("culture-collection", INT_CULTURE_COLLECTION),
                        new Enum("bio-material", INT_BIO_MATERIAL),
                        new Enum("metagenome-source", INT_METAGENOME_SOURCE),
                        new Enum("old-lineage", INT_OLD_LINEAGE),
                        new Enum("old-name", INT_OLD_NAME),
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
                    public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype newInstance() {
                  return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod.Subtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod newInstance() {
              return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.OrgModDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.OrgModDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.OrgModDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
