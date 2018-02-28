/*
 * An XML document type.
 * Localname: User-field
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.UserFieldDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one User-field(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface UserFieldDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserFieldDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("userfieldd516doctype");
    
    /**
     * Gets the "User-field" element
     */
    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField getUserField();
    
    /**
     * Sets the "User-field" element
     */
    void setUserField(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField userField);
    
    /**
     * Appends and returns a new empty "User-field" element
     */
    gov.nih.nlm.ncbi.www.UserFieldDocument.UserField addNewUserField();
    
    /**
     * An XML User-field(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface UserField extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("userfield9c62elemtype");
        
        /**
         * Gets the "label" element
         */
        gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label getLabel();
        
        /**
         * Sets the "label" element
         */
        void setLabel(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label label);
        
        /**
         * Appends and returns a new empty "label" element
         */
        gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label addNewLabel();
        
        /**
         * Gets the "num" element
         */
        java.math.BigInteger getNum();
        
        /**
         * Gets (as xml) the "num" element
         */
        org.apache.xmlbeans.XmlInteger xgetNum();
        
        /**
         * True if has "num" element
         */
        boolean isSetNum();
        
        /**
         * Sets the "num" element
         */
        void setNum(java.math.BigInteger num);
        
        /**
         * Sets (as xml) the "num" element
         */
        void xsetNum(org.apache.xmlbeans.XmlInteger num);
        
        /**
         * Unsets the "num" element
         */
        void unsetNum();
        
        /**
         * Gets the "data" element
         */
        gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data getData();
        
        /**
         * Sets the "data" element
         */
        void setData(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data addNewData();
        
        /**
         * An XML label(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Label extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Label.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("labele9c2elemtype");
            
            /**
             * Gets the "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId();
            
            /**
             * Sets the "Object-id" element
             */
            void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId);
            
            /**
             * Appends and returns a new empty "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label newInstance() {
                  return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Label) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Data extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datad828elemtype");
            
            /**
             * Gets the "str" element
             */
            java.lang.String getStr();
            
            /**
             * Gets (as xml) the "str" element
             */
            org.apache.xmlbeans.XmlString xgetStr();
            
            /**
             * True if has "str" element
             */
            boolean isSetStr();
            
            /**
             * Sets the "str" element
             */
            void setStr(java.lang.String str);
            
            /**
             * Sets (as xml) the "str" element
             */
            void xsetStr(org.apache.xmlbeans.XmlString str);
            
            /**
             * Unsets the "str" element
             */
            void unsetStr();
            
            /**
             * Gets the "int" element
             */
            java.math.BigInteger getInt();
            
            /**
             * Gets (as xml) the "int" element
             */
            org.apache.xmlbeans.XmlInteger xgetInt();
            
            /**
             * True if has "int" element
             */
            boolean isSetInt();
            
            /**
             * Sets the "int" element
             */
            void setInt(java.math.BigInteger xint);
            
            /**
             * Sets (as xml) the "int" element
             */
            void xsetInt(org.apache.xmlbeans.XmlInteger xint);
            
            /**
             * Unsets the "int" element
             */
            void unsetInt();
            
            /**
             * Gets the "real" element
             */
            double getReal();
            
            /**
             * Gets (as xml) the "real" element
             */
            org.apache.xmlbeans.XmlDouble xgetReal();
            
            /**
             * True if has "real" element
             */
            boolean isSetReal();
            
            /**
             * Sets the "real" element
             */
            void setReal(double real);
            
            /**
             * Sets (as xml) the "real" element
             */
            void xsetReal(org.apache.xmlbeans.XmlDouble real);
            
            /**
             * Unsets the "real" element
             */
            void unsetReal();
            
            /**
             * Gets the "bool" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool getBool();
            
            /**
             * True if has "bool" element
             */
            boolean isSetBool();
            
            /**
             * Sets the "bool" element
             */
            void setBool(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool bool);
            
            /**
             * Appends and returns a new empty "bool" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool addNewBool();
            
            /**
             * Unsets the "bool" element
             */
            void unsetBool();
            
            /**
             * Gets the "os" element
             */
            byte[] getOs();
            
            /**
             * Gets (as xml) the "os" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetOs();
            
            /**
             * True if has "os" element
             */
            boolean isSetOs();
            
            /**
             * Sets the "os" element
             */
            void setOs(byte[] os);
            
            /**
             * Sets (as xml) the "os" element
             */
            void xsetOs(org.apache.xmlbeans.XmlHexBinary os);
            
            /**
             * Unsets the "os" element
             */
            void unsetOs();
            
            /**
             * Gets the "object" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object getObject();
            
            /**
             * True if has "object" element
             */
            boolean isSetObject();
            
            /**
             * Sets the "object" element
             */
            void setObject(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object object);
            
            /**
             * Appends and returns a new empty "object" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object addNewObject();
            
            /**
             * Unsets the "object" element
             */
            void unsetObject();
            
            /**
             * Gets array of all "strs" elements
             */
            java.lang.String[] getStrsArray();
            
            /**
             * Gets ith "strs" element
             */
            java.lang.String getStrsArray(int i);
            
            /**
             * Gets (as xml) array of all "strs" elements
             */
            org.apache.xmlbeans.XmlString[] xgetStrsArray();
            
            /**
             * Gets (as xml) ith "strs" element
             */
            org.apache.xmlbeans.XmlString xgetStrsArray(int i);
            
            /**
             * Returns number of "strs" element
             */
            int sizeOfStrsArray();
            
            /**
             * Sets array of all "strs" element
             */
            void setStrsArray(java.lang.String[] strsArray);
            
            /**
             * Sets ith "strs" element
             */
            void setStrsArray(int i, java.lang.String strs);
            
            /**
             * Sets (as xml) array of all "strs" element
             */
            void xsetStrsArray(org.apache.xmlbeans.XmlString[] strsArray);
            
            /**
             * Sets (as xml) ith "strs" element
             */
            void xsetStrsArray(int i, org.apache.xmlbeans.XmlString strs);
            
            /**
             * Inserts the value as the ith "strs" element
             */
            void insertStrs(int i, java.lang.String strs);
            
            /**
             * Appends the value as the last "strs" element
             */
            void addStrs(java.lang.String strs);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "strs" element
             */
            org.apache.xmlbeans.XmlString insertNewStrs(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "strs" element
             */
            org.apache.xmlbeans.XmlString addNewStrs();
            
            /**
             * Removes the ith "strs" element
             */
            void removeStrs(int i);
            
            /**
             * Gets array of all "ints" elements
             */
            java.math.BigInteger[] getIntsArray();
            
            /**
             * Gets ith "ints" element
             */
            java.math.BigInteger getIntsArray(int i);
            
            /**
             * Gets (as xml) array of all "ints" elements
             */
            org.apache.xmlbeans.XmlInteger[] xgetIntsArray();
            
            /**
             * Gets (as xml) ith "ints" element
             */
            org.apache.xmlbeans.XmlInteger xgetIntsArray(int i);
            
            /**
             * Returns number of "ints" element
             */
            int sizeOfIntsArray();
            
            /**
             * Sets array of all "ints" element
             */
            void setIntsArray(java.math.BigInteger[] intsArray);
            
            /**
             * Sets ith "ints" element
             */
            void setIntsArray(int i, java.math.BigInteger ints);
            
            /**
             * Sets (as xml) array of all "ints" element
             */
            void xsetIntsArray(org.apache.xmlbeans.XmlInteger[] intsArray);
            
            /**
             * Sets (as xml) ith "ints" element
             */
            void xsetIntsArray(int i, org.apache.xmlbeans.XmlInteger ints);
            
            /**
             * Inserts the value as the ith "ints" element
             */
            void insertInts(int i, java.math.BigInteger ints);
            
            /**
             * Appends the value as the last "ints" element
             */
            void addInts(java.math.BigInteger ints);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ints" element
             */
            org.apache.xmlbeans.XmlInteger insertNewInts(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ints" element
             */
            org.apache.xmlbeans.XmlInteger addNewInts();
            
            /**
             * Removes the ith "ints" element
             */
            void removeInts(int i);
            
            /**
             * Gets array of all "reals" elements
             */
            double[] getRealsArray();
            
            /**
             * Gets ith "reals" element
             */
            double getRealsArray(int i);
            
            /**
             * Gets (as xml) array of all "reals" elements
             */
            org.apache.xmlbeans.XmlDouble[] xgetRealsArray();
            
            /**
             * Gets (as xml) ith "reals" element
             */
            org.apache.xmlbeans.XmlDouble xgetRealsArray(int i);
            
            /**
             * Returns number of "reals" element
             */
            int sizeOfRealsArray();
            
            /**
             * Sets array of all "reals" element
             */
            void setRealsArray(double[] realsArray);
            
            /**
             * Sets ith "reals" element
             */
            void setRealsArray(int i, double reals);
            
            /**
             * Sets (as xml) array of all "reals" element
             */
            void xsetRealsArray(org.apache.xmlbeans.XmlDouble[] realsArray);
            
            /**
             * Sets (as xml) ith "reals" element
             */
            void xsetRealsArray(int i, org.apache.xmlbeans.XmlDouble reals);
            
            /**
             * Inserts the value as the ith "reals" element
             */
            void insertReals(int i, double reals);
            
            /**
             * Appends the value as the last "reals" element
             */
            void addReals(double reals);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "reals" element
             */
            org.apache.xmlbeans.XmlDouble insertNewReals(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "reals" element
             */
            org.apache.xmlbeans.XmlDouble addNewReals();
            
            /**
             * Removes the ith "reals" element
             */
            void removeReals(int i);
            
            /**
             * Gets array of all "oss" elements
             */
            byte[][] getOssArray();
            
            /**
             * Gets ith "oss" element
             */
            byte[] getOssArray(int i);
            
            /**
             * Gets (as xml) array of all "oss" elements
             */
            org.apache.xmlbeans.XmlHexBinary[] xgetOssArray();
            
            /**
             * Gets (as xml) ith "oss" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetOssArray(int i);
            
            /**
             * Returns number of "oss" element
             */
            int sizeOfOssArray();
            
            /**
             * Sets array of all "oss" element
             */
            void setOssArray(byte[][] ossArray);
            
            /**
             * Sets ith "oss" element
             */
            void setOssArray(int i, byte[] oss);
            
            /**
             * Sets (as xml) array of all "oss" element
             */
            void xsetOssArray(org.apache.xmlbeans.XmlHexBinary[] ossArray);
            
            /**
             * Sets (as xml) ith "oss" element
             */
            void xsetOssArray(int i, org.apache.xmlbeans.XmlHexBinary oss);
            
            /**
             * Inserts the value as the ith "oss" element
             */
            void insertOss(int i, byte[] oss);
            
            /**
             * Appends the value as the last "oss" element
             */
            void addOss(byte[] oss);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "oss" element
             */
            org.apache.xmlbeans.XmlHexBinary insertNewOss(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "oss" element
             */
            org.apache.xmlbeans.XmlHexBinary addNewOss();
            
            /**
             * Removes the ith "oss" element
             */
            void removeOss(int i);
            
            /**
             * Gets the "fields" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields getFields();
            
            /**
             * True if has "fields" element
             */
            boolean isSetFields();
            
            /**
             * Sets the "fields" element
             */
            void setFields(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields fields);
            
            /**
             * Appends and returns a new empty "fields" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields addNewFields();
            
            /**
             * Unsets the "fields" element
             */
            void unsetFields();
            
            /**
             * Gets the "objects" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects getObjects();
            
            /**
             * True if has "objects" element
             */
            boolean isSetObjects();
            
            /**
             * Sets the "objects" element
             */
            void setObjects(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects objects);
            
            /**
             * Appends and returns a new empty "objects" element
             */
            gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects addNewObjects();
            
            /**
             * Unsets the "objects" element
             */
            void unsetObjects();
            
            /**
             * An XML bool(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Bool extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bool.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bool6e62elemtype");
                
                /**
                 * Gets the "value" attribute
                 */
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value.Enum getValue();
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value xgetValue();
                
                /**
                 * Sets the "value" attribute
                 */
                void setValue(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value.Enum value);
                
                /**
                 * Sets (as xml) the "value" attribute
                 */
                void xsetValue(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value value);
                
                /**
                 * An XML value(@).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.UserFieldDocument$UserField$Data$Bool$Value.
                 */
                public interface Value extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value4cbbattrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum TRUE = Enum.forString("true");
                    static final Enum FALSE = Enum.forString("false");
                    
                    static final int INT_TRUE = Enum.INT_TRUE;
                    static final int INT_FALSE = Enum.INT_FALSE;
                    
                    /**
                     * Enumeration value class for gov.nih.nlm.ncbi.www.UserFieldDocument$UserField$Data$Bool$Value.
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
                      public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value newValue(java.lang.Object obj) {
                        return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value) type.newValue( obj ); }
                      
                      public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value newInstance() {
                        return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool newInstance() {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Bool) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML object(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Object extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Object.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("object1c2delemtype");
                
                /**
                 * Gets the "User-object" element
                 */
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject();
                
                /**
                 * Sets the "User-object" element
                 */
                void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
                
                /**
                 * Appends and returns a new empty "User-object" element
                 */
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object newInstance() {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Object) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML fields(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Fields extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fields52f3elemtype");
                
                /**
                 * Gets array of all "User-field" elements
                 */
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] getUserFieldArray();
                
                /**
                 * Gets ith "User-field" element
                 */
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField getUserFieldArray(int i);
                
                /**
                 * Returns number of "User-field" element
                 */
                int sizeOfUserFieldArray();
                
                /**
                 * Sets array of all "User-field" element
                 */
                void setUserFieldArray(gov.nih.nlm.ncbi.www.UserFieldDocument.UserField[] userFieldArray);
                
                /**
                 * Sets ith "User-field" element
                 */
                void setUserFieldArray(int i, gov.nih.nlm.ncbi.www.UserFieldDocument.UserField userField);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "User-field" element
                 */
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField insertNewUserField(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "User-field" element
                 */
                gov.nih.nlm.ncbi.www.UserFieldDocument.UserField addNewUserField();
                
                /**
                 * Removes the ith "User-field" element
                 */
                void removeUserField(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields newInstance() {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML objects(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Objects extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Objects.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("objectse6a8elemtype");
                
                /**
                 * Gets array of all "User-object" elements
                 */
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] getUserObjectArray();
                
                /**
                 * Gets ith "User-object" element
                 */
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObjectArray(int i);
                
                /**
                 * Returns number of "User-object" element
                 */
                int sizeOfUserObjectArray();
                
                /**
                 * Sets array of all "User-object" element
                 */
                void setUserObjectArray(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] userObjectArray);
                
                /**
                 * Sets ith "User-object" element
                 */
                void setUserObjectArray(int i, gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "User-object" element
                 */
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject insertNewUserObject(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "User-object" element
                 */
                gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
                
                /**
                 * Removes the ith "User-object" element
                 */
                void removeUserObject(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects newInstance() {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data.Objects) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data newInstance() {
                  return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField newInstance() {
              return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.UserFieldDocument.UserField newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.UserFieldDocument.UserField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.UserFieldDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.UserFieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.UserFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
