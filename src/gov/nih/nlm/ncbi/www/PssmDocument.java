/*
 * An XML document type.
 * Localname: Pssm
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Pssm(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PssmDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PssmDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssm3d7bdoctype");
    
    /**
     * Gets the "Pssm" element
     */
    gov.nih.nlm.ncbi.www.PssmDocument.Pssm getPssm();
    
    /**
     * Sets the "Pssm" element
     */
    void setPssm(gov.nih.nlm.ncbi.www.PssmDocument.Pssm pssm);
    
    /**
     * Appends and returns a new empty "Pssm" element
     */
    gov.nih.nlm.ncbi.www.PssmDocument.Pssm addNewPssm();
    
    /**
     * An XML Pssm(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Pssm extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pssm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pssmbe82elemtype");
        
        /**
         * Gets the "isProtein" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein getIsProtein();
        
        /**
         * True if has "isProtein" element
         */
        boolean isSetIsProtein();
        
        /**
         * Sets the "isProtein" element
         */
        void setIsProtein(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein isProtein);
        
        /**
         * Appends and returns a new empty "isProtein" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein addNewIsProtein();
        
        /**
         * Unsets the "isProtein" element
         */
        void unsetIsProtein();
        
        /**
         * Gets the "identifier" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier getIdentifier();
        
        /**
         * True if has "identifier" element
         */
        boolean isSetIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier identifier);
        
        /**
         * Appends and returns a new empty "identifier" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier addNewIdentifier();
        
        /**
         * Unsets the "identifier" element
         */
        void unsetIdentifier();
        
        /**
         * Gets the "numRows" element
         */
        java.math.BigInteger getNumRows();
        
        /**
         * Gets (as xml) the "numRows" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumRows();
        
        /**
         * Sets the "numRows" element
         */
        void setNumRows(java.math.BigInteger numRows);
        
        /**
         * Sets (as xml) the "numRows" element
         */
        void xsetNumRows(org.apache.xmlbeans.XmlInteger numRows);
        
        /**
         * Gets the "numColumns" element
         */
        java.math.BigInteger getNumColumns();
        
        /**
         * Gets (as xml) the "numColumns" element
         */
        org.apache.xmlbeans.XmlInteger xgetNumColumns();
        
        /**
         * Sets the "numColumns" element
         */
        void setNumColumns(java.math.BigInteger numColumns);
        
        /**
         * Sets (as xml) the "numColumns" element
         */
        void xsetNumColumns(org.apache.xmlbeans.XmlInteger numColumns);
        
        /**
         * Gets array of all "rowLabels" elements
         */
        java.lang.String[] getRowLabelsArray();
        
        /**
         * Gets ith "rowLabels" element
         */
        java.lang.String getRowLabelsArray(int i);
        
        /**
         * Gets (as xml) array of all "rowLabels" elements
         */
        org.apache.xmlbeans.XmlString[] xgetRowLabelsArray();
        
        /**
         * Gets (as xml) ith "rowLabels" element
         */
        org.apache.xmlbeans.XmlString xgetRowLabelsArray(int i);
        
        /**
         * Returns number of "rowLabels" element
         */
        int sizeOfRowLabelsArray();
        
        /**
         * Sets array of all "rowLabels" element
         */
        void setRowLabelsArray(java.lang.String[] rowLabelsArray);
        
        /**
         * Sets ith "rowLabels" element
         */
        void setRowLabelsArray(int i, java.lang.String rowLabels);
        
        /**
         * Sets (as xml) array of all "rowLabels" element
         */
        void xsetRowLabelsArray(org.apache.xmlbeans.XmlString[] rowLabelsArray);
        
        /**
         * Sets (as xml) ith "rowLabels" element
         */
        void xsetRowLabelsArray(int i, org.apache.xmlbeans.XmlString rowLabels);
        
        /**
         * Inserts the value as the ith "rowLabels" element
         */
        void insertRowLabels(int i, java.lang.String rowLabels);
        
        /**
         * Appends the value as the last "rowLabels" element
         */
        void addRowLabels(java.lang.String rowLabels);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rowLabels" element
         */
        org.apache.xmlbeans.XmlString insertNewRowLabels(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rowLabels" element
         */
        org.apache.xmlbeans.XmlString addNewRowLabels();
        
        /**
         * Removes the ith "rowLabels" element
         */
        void removeRowLabels(int i);
        
        /**
         * Gets the "byRow" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow getByRow();
        
        /**
         * True if has "byRow" element
         */
        boolean isSetByRow();
        
        /**
         * Sets the "byRow" element
         */
        void setByRow(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow byRow);
        
        /**
         * Appends and returns a new empty "byRow" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow addNewByRow();
        
        /**
         * Unsets the "byRow" element
         */
        void unsetByRow();
        
        /**
         * Gets the "query" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query getQuery();
        
        /**
         * True if has "query" element
         */
        boolean isSetQuery();
        
        /**
         * Sets the "query" element
         */
        void setQuery(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query query);
        
        /**
         * Appends and returns a new empty "query" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query addNewQuery();
        
        /**
         * Unsets the "query" element
         */
        void unsetQuery();
        
        /**
         * Gets the "intermediateData" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData getIntermediateData();
        
        /**
         * True if has "intermediateData" element
         */
        boolean isSetIntermediateData();
        
        /**
         * Sets the "intermediateData" element
         */
        void setIntermediateData(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData intermediateData);
        
        /**
         * Appends and returns a new empty "intermediateData" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData addNewIntermediateData();
        
        /**
         * Unsets the "intermediateData" element
         */
        void unsetIntermediateData();
        
        /**
         * Gets the "finalData" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData getFinalData();
        
        /**
         * True if has "finalData" element
         */
        boolean isSetFinalData();
        
        /**
         * Sets the "finalData" element
         */
        void setFinalData(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData finalData);
        
        /**
         * Appends and returns a new empty "finalData" element
         */
        gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData addNewFinalData();
        
        /**
         * Unsets the "finalData" element
         */
        void unsetFinalData();
        
        /**
         * An XML isProtein(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface IsProtein extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsProtein.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("isprotein71a7elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PssmDocument$Pssm$IsProtein$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value6fc0attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PssmDocument$Pssm$IsProtein$Value.
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
                    public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML identifier(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Identifier extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Identifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("identifieraf87elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML byRow(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ByRow extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ByRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("byrow9c31elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PssmDocument$Pssm$ByRow$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value8ecaattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PssmDocument$Pssm$ByRow$Value.
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
                    public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML query(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Query extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Query.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("query2cb6elemtype");
            
            /**
             * Gets the "Seq-entry" element
             */
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry getSeqEntry();
            
            /**
             * Sets the "Seq-entry" element
             */
            void setSeqEntry(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry seqEntry);
            
            /**
             * Appends and returns a new empty "Seq-entry" element
             */
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry addNewSeqEntry();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML intermediateData(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface IntermediateData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IntermediateData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("intermediatedata10a1elemtype");
            
            /**
             * Gets the "PssmIntermediateData" element
             */
            gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData getPssmIntermediateData();
            
            /**
             * Sets the "PssmIntermediateData" element
             */
            void setPssmIntermediateData(gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData pssmIntermediateData);
            
            /**
             * Appends and returns a new empty "PssmIntermediateData" element
             */
            gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData addNewPssmIntermediateData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML finalData(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FinalData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinalData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("finaldatac42eelemtype");
            
            /**
             * Gets the "PssmFinalData" element
             */
            gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData getPssmFinalData();
            
            /**
             * Sets the "PssmFinalData" element
             */
            void setPssmFinalData(gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData pssmFinalData);
            
            /**
             * Appends and returns a new empty "PssmFinalData" element
             */
            gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData addNewPssmFinalData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData newInstance() {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm newInstance() {
              return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PssmDocument.Pssm newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PssmDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PssmDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PssmDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
