/*
 * An XML document type.
 * Localname: EMBL-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EMBLBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one EMBL-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface EMBLBlockDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMBLBlockDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("emblblock5370doctype");
    
    /**
     * Gets the "EMBL-block" element
     */
    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock getEMBLBlock();
    
    /**
     * Sets the "EMBL-block" element
     */
    void setEMBLBlock(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock emblBlock);
    
    /**
     * Appends and returns a new empty "EMBL-block" element
     */
    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock addNewEMBLBlock();
    
    /**
     * An XML EMBL-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface EMBLBlock extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMBLBlock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("emblblock3ea2elemtype");
        
        /**
         * Gets the "class" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class getClass1();
        
        /**
         * True if has "class" element
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" element
         */
        void setClass1(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class class1);
        
        /**
         * Appends and returns a new empty "class" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class addNewClass1();
        
        /**
         * Unsets the "class" element
         */
        void unsetClass1();
        
        /**
         * Gets the "div" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div getDiv();
        
        /**
         * True if has "div" element
         */
        boolean isSetDiv();
        
        /**
         * Sets the "div" element
         */
        void setDiv(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div div);
        
        /**
         * Appends and returns a new empty "div" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div addNewDiv();
        
        /**
         * Unsets the "div" element
         */
        void unsetDiv();
        
        /**
         * Gets the "creation-date" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate getCreationDate();
        
        /**
         * Sets the "creation-date" element
         */
        void setCreationDate(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate creationDate);
        
        /**
         * Appends and returns a new empty "creation-date" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate addNewCreationDate();
        
        /**
         * Gets the "update-date" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate getUpdateDate();
        
        /**
         * Sets the "update-date" element
         */
        void setUpdateDate(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate updateDate);
        
        /**
         * Appends and returns a new empty "update-date" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate addNewUpdateDate();
        
        /**
         * Gets array of all "extra-acc" elements
         */
        java.lang.String[] getExtraAccArray();
        
        /**
         * Gets ith "extra-acc" element
         */
        java.lang.String getExtraAccArray(int i);
        
        /**
         * Gets (as xml) array of all "extra-acc" elements
         */
        org.apache.xmlbeans.XmlString[] xgetExtraAccArray();
        
        /**
         * Gets (as xml) ith "extra-acc" element
         */
        org.apache.xmlbeans.XmlString xgetExtraAccArray(int i);
        
        /**
         * Returns number of "extra-acc" element
         */
        int sizeOfExtraAccArray();
        
        /**
         * Sets array of all "extra-acc" element
         */
        void setExtraAccArray(java.lang.String[] extraAccArray);
        
        /**
         * Sets ith "extra-acc" element
         */
        void setExtraAccArray(int i, java.lang.String extraAcc);
        
        /**
         * Sets (as xml) array of all "extra-acc" element
         */
        void xsetExtraAccArray(org.apache.xmlbeans.XmlString[] extraAccArray);
        
        /**
         * Sets (as xml) ith "extra-acc" element
         */
        void xsetExtraAccArray(int i, org.apache.xmlbeans.XmlString extraAcc);
        
        /**
         * Inserts the value as the ith "extra-acc" element
         */
        void insertExtraAcc(int i, java.lang.String extraAcc);
        
        /**
         * Appends the value as the last "extra-acc" element
         */
        void addExtraAcc(java.lang.String extraAcc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extra-acc" element
         */
        org.apache.xmlbeans.XmlString insertNewExtraAcc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extra-acc" element
         */
        org.apache.xmlbeans.XmlString addNewExtraAcc();
        
        /**
         * Removes the ith "extra-acc" element
         */
        void removeExtraAcc(int i);
        
        /**
         * Gets array of all "keywords" elements
         */
        java.lang.String[] getKeywordsArray();
        
        /**
         * Gets ith "keywords" element
         */
        java.lang.String getKeywordsArray(int i);
        
        /**
         * Gets (as xml) array of all "keywords" elements
         */
        org.apache.xmlbeans.XmlString[] xgetKeywordsArray();
        
        /**
         * Gets (as xml) ith "keywords" element
         */
        org.apache.xmlbeans.XmlString xgetKeywordsArray(int i);
        
        /**
         * Returns number of "keywords" element
         */
        int sizeOfKeywordsArray();
        
        /**
         * Sets array of all "keywords" element
         */
        void setKeywordsArray(java.lang.String[] keywordsArray);
        
        /**
         * Sets ith "keywords" element
         */
        void setKeywordsArray(int i, java.lang.String keywords);
        
        /**
         * Sets (as xml) array of all "keywords" element
         */
        void xsetKeywordsArray(org.apache.xmlbeans.XmlString[] keywordsArray);
        
        /**
         * Sets (as xml) ith "keywords" element
         */
        void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords);
        
        /**
         * Inserts the value as the ith "keywords" element
         */
        void insertKeywords(int i, java.lang.String keywords);
        
        /**
         * Appends the value as the last "keywords" element
         */
        void addKeywords(java.lang.String keywords);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keywords" element
         */
        org.apache.xmlbeans.XmlString insertNewKeywords(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keywords" element
         */
        org.apache.xmlbeans.XmlString addNewKeywords();
        
        /**
         * Removes the ith "keywords" element
         */
        void removeKeywords(int i);
        
        /**
         * Gets the "xref" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref getXref();
        
        /**
         * True if has "xref" element
         */
        boolean isSetXref();
        
        /**
         * Sets the "xref" element
         */
        void setXref(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref xref);
        
        /**
         * Appends and returns a new empty "xref" element
         */
        gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref addNewXref();
        
        /**
         * Unsets the "xref" element
         */
        void unsetXref();
        
        /**
         * An XML class(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Class extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Class.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("class2b86elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EMBLBlockDocument$EMBLBlock$Class$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value009fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum STANDARD = Enum.forString("standard");
                static final Enum UNANNOTATED = Enum.forString("unannotated");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_STANDARD = Enum.INT_STANDARD;
                static final int INT_UNANNOTATED = Enum.INT_UNANNOTATED;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.EMBLBlockDocument$EMBLBlock$Class$Value.
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
                    static final int INT_STANDARD = 2;
                    static final int INT_UNANNOTATED = 3;
                    static final int INT_OTHER = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("standard", INT_STANDARD),
                        new Enum("unannotated", INT_UNANNOTATED),
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
                    public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class newInstance() {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Class) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML div(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Div extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Div.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("div13dfelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.EMBLBlockDocument$EMBLBlock$Div$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value5b38attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum FUN = Enum.forString("fun");
                static final Enum INV = Enum.forString("inv");
                static final Enum MAM = Enum.forString("mam");
                static final Enum ORG = Enum.forString("org");
                static final Enum PHG = Enum.forString("phg");
                static final Enum PLN = Enum.forString("pln");
                static final Enum PRI = Enum.forString("pri");
                static final Enum PRO = Enum.forString("pro");
                static final Enum ROD = Enum.forString("rod");
                static final Enum SYN = Enum.forString("syn");
                static final Enum UNA = Enum.forString("una");
                static final Enum VRL = Enum.forString("vrl");
                static final Enum VRT = Enum.forString("vrt");
                static final Enum PAT = Enum.forString("pat");
                static final Enum EST = Enum.forString("est");
                static final Enum STS = Enum.forString("sts");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_FUN = Enum.INT_FUN;
                static final int INT_INV = Enum.INT_INV;
                static final int INT_MAM = Enum.INT_MAM;
                static final int INT_ORG = Enum.INT_ORG;
                static final int INT_PHG = Enum.INT_PHG;
                static final int INT_PLN = Enum.INT_PLN;
                static final int INT_PRI = Enum.INT_PRI;
                static final int INT_PRO = Enum.INT_PRO;
                static final int INT_ROD = Enum.INT_ROD;
                static final int INT_SYN = Enum.INT_SYN;
                static final int INT_UNA = Enum.INT_UNA;
                static final int INT_VRL = Enum.INT_VRL;
                static final int INT_VRT = Enum.INT_VRT;
                static final int INT_PAT = Enum.INT_PAT;
                static final int INT_EST = Enum.INT_EST;
                static final int INT_STS = Enum.INT_STS;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.EMBLBlockDocument$EMBLBlock$Div$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_FUN
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
                    
                    static final int INT_FUN = 1;
                    static final int INT_INV = 2;
                    static final int INT_MAM = 3;
                    static final int INT_ORG = 4;
                    static final int INT_PHG = 5;
                    static final int INT_PLN = 6;
                    static final int INT_PRI = 7;
                    static final int INT_PRO = 8;
                    static final int INT_ROD = 9;
                    static final int INT_SYN = 10;
                    static final int INT_UNA = 11;
                    static final int INT_VRL = 12;
                    static final int INT_VRT = 13;
                    static final int INT_PAT = 14;
                    static final int INT_EST = 15;
                    static final int INT_STS = 16;
                    static final int INT_OTHER = 17;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("fun", INT_FUN),
                        new Enum("inv", INT_INV),
                        new Enum("mam", INT_MAM),
                        new Enum("org", INT_ORG),
                        new Enum("phg", INT_PHG),
                        new Enum("pln", INT_PLN),
                        new Enum("pri", INT_PRI),
                        new Enum("pro", INT_PRO),
                        new Enum("rod", INT_ROD),
                        new Enum("syn", INT_SYN),
                        new Enum("una", INT_UNA),
                        new Enum("vrl", INT_VRL),
                        new Enum("vrt", INT_VRT),
                        new Enum("pat", INT_PAT),
                        new Enum("est", INT_EST),
                        new Enum("sts", INT_STS),
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
                    public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div newInstance() {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Div) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML creation-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface CreationDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreationDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("creationdatefceaelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.CreationDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML update-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface UpdateDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("updatedate72c0elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.UpdateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML xref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Xref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Xref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("xrefb119elemtype");
            
            /**
             * Gets array of all "EMBL-xref" elements
             */
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref[] getEMBLXrefArray();
            
            /**
             * Gets ith "EMBL-xref" element
             */
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref getEMBLXrefArray(int i);
            
            /**
             * Returns number of "EMBL-xref" element
             */
            int sizeOfEMBLXrefArray();
            
            /**
             * Sets array of all "EMBL-xref" element
             */
            void setEMBLXrefArray(gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref[] emblXrefArray);
            
            /**
             * Sets ith "EMBL-xref" element
             */
            void setEMBLXrefArray(int i, gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref emblXref);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "EMBL-xref" element
             */
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref insertNewEMBLXref(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "EMBL-xref" element
             */
            gov.nih.nlm.ncbi.www.EMBLXrefDocument.EMBLXref addNewEMBLXref();
            
            /**
             * Removes the ith "EMBL-xref" element
             */
            void removeEMBLXref(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref newInstance() {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock newInstance() {
              return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.EMBLBlockDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.EMBLBlockDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
