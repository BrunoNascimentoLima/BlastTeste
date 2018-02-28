/*
 * An XML document type.
 * Localname: Cit-sub
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitSubDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Cit-sub(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CitSubDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitSubDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citsub90cddoctype");
    
    /**
     * Gets the "Cit-sub" element
     */
    gov.nih.nlm.ncbi.www.CitSubDocument.CitSub getCitSub();
    
    /**
     * Sets the "Cit-sub" element
     */
    void setCitSub(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub citSub);
    
    /**
     * Appends and returns a new empty "Cit-sub" element
     */
    gov.nih.nlm.ncbi.www.CitSubDocument.CitSub addNewCitSub();
    
    /**
     * An XML Cit-sub(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CitSub extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitSub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citsub301aelemtype");
        
        /**
         * Gets the "authors" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors getAuthors();
        
        /**
         * Sets the "authors" element
         */
        void setAuthors(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors authors);
        
        /**
         * Appends and returns a new empty "authors" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors addNewAuthors();
        
        /**
         * Gets the "imp" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp getImp();
        
        /**
         * True if has "imp" element
         */
        boolean isSetImp();
        
        /**
         * Sets the "imp" element
         */
        void setImp(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp imp);
        
        /**
         * Appends and returns a new empty "imp" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp addNewImp();
        
        /**
         * Unsets the "imp" element
         */
        void unsetImp();
        
        /**
         * Gets the "medium" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium getMedium();
        
        /**
         * True if has "medium" element
         */
        boolean isSetMedium();
        
        /**
         * Sets the "medium" element
         */
        void setMedium(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium medium);
        
        /**
         * Appends and returns a new empty "medium" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium addNewMedium();
        
        /**
         * Unsets the "medium" element
         */
        void unsetMedium();
        
        /**
         * Gets the "date" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date getDate();
        
        /**
         * True if has "date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date date);
        
        /**
         * Appends and returns a new empty "date" element
         */
        gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date addNewDate();
        
        /**
         * Unsets the "date" element
         */
        void unsetDate();
        
        /**
         * Gets the "descr" element
         */
        java.lang.String getDescr();
        
        /**
         * Gets (as xml) the "descr" element
         */
        org.apache.xmlbeans.XmlString xgetDescr();
        
        /**
         * True if has "descr" element
         */
        boolean isSetDescr();
        
        /**
         * Sets the "descr" element
         */
        void setDescr(java.lang.String descr);
        
        /**
         * Sets (as xml) the "descr" element
         */
        void xsetDescr(org.apache.xmlbeans.XmlString descr);
        
        /**
         * Unsets the "descr" element
         */
        void unsetDescr();
        
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Authors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authors24ceelemtype");
            
            /**
             * Gets the "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList getAuthList();
            
            /**
             * Sets the "Auth-list" element
             */
            void setAuthList(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList authList);
            
            /**
             * Appends and returns a new empty "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList addNewAuthList();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML imp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Imp extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("imp8852elemtype");
            
            /**
             * Gets the "Imprint" element
             */
            gov.nih.nlm.ncbi.www.ImprintDocument.Imprint getImprint();
            
            /**
             * Sets the "Imprint" element
             */
            void setImprint(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint imprint);
            
            /**
             * Appends and returns a new empty "Imprint" element
             */
            gov.nih.nlm.ncbi.www.ImprintDocument.Imprint addNewImprint();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML medium(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Medium extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Medium.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medium302belemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CitSubDocument$CitSub$Medium$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuecf72attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum PAPER = Enum.forString("paper");
                static final Enum TAPE = Enum.forString("tape");
                static final Enum FLOPPY = Enum.forString("floppy");
                static final Enum EMAIL = Enum.forString("email");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_PAPER = Enum.INT_PAPER;
                static final int INT_TAPE = Enum.INT_TAPE;
                static final int INT_FLOPPY = Enum.INT_FLOPPY;
                static final int INT_EMAIL = Enum.INT_EMAIL;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.CitSubDocument$CitSub$Medium$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_PAPER
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
                    
                    static final int INT_PAPER = 1;
                    static final int INT_TAPE = 2;
                    static final int INT_FLOPPY = 3;
                    static final int INT_EMAIL = 4;
                    static final int INT_OTHER = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("paper", INT_PAPER),
                        new Enum("tape", INT_TAPE),
                        new Enum("floppy", INT_FLOPPY),
                        new Enum("email", INT_EMAIL),
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
                    public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Date extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datea064elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub newInstance() {
              return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CitSubDocument.CitSub newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CitSubDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitSubDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitSubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
