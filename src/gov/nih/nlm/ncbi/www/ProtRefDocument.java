/*
 * An XML document type.
 * Localname: Prot-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ProtRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Prot-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface ProtRefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProtRefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("protref6e8bdoctype");
    
    /**
     * Gets the "Prot-ref" element
     */
    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef getProtRef();
    
    /**
     * Sets the "Prot-ref" element
     */
    void setProtRef(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef protRef);
    
    /**
     * Appends and returns a new empty "Prot-ref" element
     */
    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef addNewProtRef();
    
    /**
     * An XML Prot-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface ProtRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProtRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("protref7082elemtype");
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
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
         * Gets array of all "ec" elements
         */
        java.lang.String[] getEcArray();
        
        /**
         * Gets ith "ec" element
         */
        java.lang.String getEcArray(int i);
        
        /**
         * Gets (as xml) array of all "ec" elements
         */
        org.apache.xmlbeans.XmlString[] xgetEcArray();
        
        /**
         * Gets (as xml) ith "ec" element
         */
        org.apache.xmlbeans.XmlString xgetEcArray(int i);
        
        /**
         * Returns number of "ec" element
         */
        int sizeOfEcArray();
        
        /**
         * Sets array of all "ec" element
         */
        void setEcArray(java.lang.String[] ecArray);
        
        /**
         * Sets ith "ec" element
         */
        void setEcArray(int i, java.lang.String ec);
        
        /**
         * Sets (as xml) array of all "ec" element
         */
        void xsetEcArray(org.apache.xmlbeans.XmlString[] ecArray);
        
        /**
         * Sets (as xml) ith "ec" element
         */
        void xsetEcArray(int i, org.apache.xmlbeans.XmlString ec);
        
        /**
         * Inserts the value as the ith "ec" element
         */
        void insertEc(int i, java.lang.String ec);
        
        /**
         * Appends the value as the last "ec" element
         */
        void addEc(java.lang.String ec);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ec" element
         */
        org.apache.xmlbeans.XmlString insertNewEc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ec" element
         */
        org.apache.xmlbeans.XmlString addNewEc();
        
        /**
         * Removes the ith "ec" element
         */
        void removeEc(int i);
        
        /**
         * Gets array of all "activity" elements
         */
        java.lang.String[] getActivityArray();
        
        /**
         * Gets ith "activity" element
         */
        java.lang.String getActivityArray(int i);
        
        /**
         * Gets (as xml) array of all "activity" elements
         */
        org.apache.xmlbeans.XmlString[] xgetActivityArray();
        
        /**
         * Gets (as xml) ith "activity" element
         */
        org.apache.xmlbeans.XmlString xgetActivityArray(int i);
        
        /**
         * Returns number of "activity" element
         */
        int sizeOfActivityArray();
        
        /**
         * Sets array of all "activity" element
         */
        void setActivityArray(java.lang.String[] activityArray);
        
        /**
         * Sets ith "activity" element
         */
        void setActivityArray(int i, java.lang.String activity);
        
        /**
         * Sets (as xml) array of all "activity" element
         */
        void xsetActivityArray(org.apache.xmlbeans.XmlString[] activityArray);
        
        /**
         * Sets (as xml) ith "activity" element
         */
        void xsetActivityArray(int i, org.apache.xmlbeans.XmlString activity);
        
        /**
         * Inserts the value as the ith "activity" element
         */
        void insertActivity(int i, java.lang.String activity);
        
        /**
         * Appends the value as the last "activity" element
         */
        void addActivity(java.lang.String activity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "activity" element
         */
        org.apache.xmlbeans.XmlString insertNewActivity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "activity" element
         */
        org.apache.xmlbeans.XmlString addNewActivity();
        
        /**
         * Removes the ith "activity" element
         */
        void removeActivity(int i);
        
        /**
         * Gets the "db" element
         */
        gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db getDb();
        
        /**
         * True if has "db" element
         */
        boolean isSetDb();
        
        /**
         * Sets the "db" element
         */
        void setDb(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db db);
        
        /**
         * Appends and returns a new empty "db" element
         */
        gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db addNewDb();
        
        /**
         * Unsets the "db" element
         */
        void unsetDb();
        
        /**
         * Gets the "processed" element
         */
        gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed getProcessed();
        
        /**
         * True if has "processed" element
         */
        boolean isSetProcessed();
        
        /**
         * Sets the "processed" element
         */
        void setProcessed(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed processed);
        
        /**
         * Appends and returns a new empty "processed" element
         */
        gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed addNewProcessed();
        
        /**
         * Unsets the "processed" element
         */
        void unsetProcessed();
        
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Db extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Db.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("db051celemtype");
            
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
                public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db newInstance() {
                  return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML processed(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Processed extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Processed.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("processed3bbcelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ProtRefDocument$ProtRef$Processed$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value10d5attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum PREPROTEIN = Enum.forString("preprotein");
                static final Enum MATURE = Enum.forString("mature");
                static final Enum SIGNAL_PEPTIDE = Enum.forString("signal-peptide");
                static final Enum TRANSIT_PEPTIDE = Enum.forString("transit-peptide");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_PREPROTEIN = Enum.INT_PREPROTEIN;
                static final int INT_MATURE = Enum.INT_MATURE;
                static final int INT_SIGNAL_PEPTIDE = Enum.INT_SIGNAL_PEPTIDE;
                static final int INT_TRANSIT_PEPTIDE = Enum.INT_TRANSIT_PEPTIDE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.ProtRefDocument$ProtRef$Processed$Value.
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
                    static final int INT_PREPROTEIN = 2;
                    static final int INT_MATURE = 3;
                    static final int INT_SIGNAL_PEPTIDE = 4;
                    static final int INT_TRANSIT_PEPTIDE = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("preprotein", INT_PREPROTEIN),
                        new Enum("mature", INT_MATURE),
                        new Enum("signal-peptide", INT_SIGNAL_PEPTIDE),
                        new Enum("transit-peptide", INT_TRANSIT_PEPTIDE),
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
                    public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed newInstance() {
                  return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef.Processed) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef newInstance() {
              return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.ProtRefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ProtRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ProtRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
