/*
 * An XML document type.
 * Localname: Seq-annot
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqAnnotDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-annot(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqAnnotDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAnnotDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqannota664doctype");
    
    /**
     * Gets the "Seq-annot" element
     */
    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot getSeqAnnot();
    
    /**
     * Sets the "Seq-annot" element
     */
    void setSeqAnnot(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot seqAnnot);
    
    /**
     * Appends and returns a new empty "Seq-annot" element
     */
    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot addNewSeqAnnot();
    
    /**
     * An XML Seq-annot(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqAnnot extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAnnot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqannot9548elemtype");
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "db" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db getDb();
        
        /**
         * True if has "db" element
         */
        boolean isSetDb();
        
        /**
         * Sets the "db" element
         */
        void setDb(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db db);
        
        /**
         * Appends and returns a new empty "db" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db addNewDb();
        
        /**
         * Unsets the "db" element
         */
        void unsetDb();
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * Gets the "desc" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc getDesc();
        
        /**
         * True if has "desc" element
         */
        boolean isSetDesc();
        
        /**
         * Sets the "desc" element
         */
        void setDesc(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc desc);
        
        /**
         * Appends and returns a new empty "desc" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc addNewDesc();
        
        /**
         * Unsets the "desc" element
         */
        void unsetDesc();
        
        /**
         * Gets the "data" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data getData();
        
        /**
         * Sets the "data" element
         */
        void setData(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data addNewData();
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id477felemtype");
            
            /**
             * Gets array of all "Annot-id" elements
             */
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId[] getAnnotIdArray();
            
            /**
             * Gets ith "Annot-id" element
             */
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId getAnnotIdArray(int i);
            
            /**
             * Returns number of "Annot-id" element
             */
            int sizeOfAnnotIdArray();
            
            /**
             * Sets array of all "Annot-id" element
             */
            void setAnnotIdArray(gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId[] annotIdArray);
            
            /**
             * Sets ith "Annot-id" element
             */
            void setAnnotIdArray(int i, gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId annotId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Annot-id" element
             */
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId insertNewAnnotId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Annot-id" element
             */
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId addNewAnnotId();
            
            /**
             * Removes the ith "Annot-id" element
             */
            void removeAnnotId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqAnnotDocument$SeqAnnot$Db.
         */
        public interface Db extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Db.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("db6b62elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqAnnotDocument$SeqAnnot$Db$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value0aa9attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum GENBANK = Enum.forString("genbank");
                static final Enum EMBL = Enum.forString("embl");
                static final Enum DDBJ = Enum.forString("ddbj");
                static final Enum PIR = Enum.forString("pir");
                static final Enum SP = Enum.forString("sp");
                static final Enum BBONE = Enum.forString("bbone");
                static final Enum PDB = Enum.forString("pdb");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_GENBANK = Enum.INT_GENBANK;
                static final int INT_EMBL = Enum.INT_EMBL;
                static final int INT_DDBJ = Enum.INT_DDBJ;
                static final int INT_PIR = Enum.INT_PIR;
                static final int INT_SP = Enum.INT_SP;
                static final int INT_BBONE = Enum.INT_BBONE;
                static final int INT_PDB = Enum.INT_PDB;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqAnnotDocument$SeqAnnot$Db$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_GENBANK
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
                    
                    static final int INT_GENBANK = 1;
                    static final int INT_EMBL = 2;
                    static final int INT_DDBJ = 3;
                    static final int INT_PIR = 4;
                    static final int INT_SP = 5;
                    static final int INT_BBONE = 6;
                    static final int INT_PDB = 7;
                    static final int INT_OTHER = 8;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("genbank", INT_GENBANK),
                        new Enum("embl", INT_EMBL),
                        new Enum("ddbj", INT_DDBJ),
                        new Enum("pir", INT_PIR),
                        new Enum("sp", INT_SP),
                        new Enum("bbone", INT_BBONE),
                        new Enum("pdb", INT_PDB),
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
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML desc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Desc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Desc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("desc43f5elemtype");
            
            /**
             * Gets the "Annot-descr" element
             */
            gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr getAnnotDescr();
            
            /**
             * Sets the "Annot-descr" element
             */
            void setAnnotDescr(gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr annotDescr);
            
            /**
             * Appends and returns a new empty "Annot-descr" element
             */
            gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr addNewAnnotDescr();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("data0a8eelemtype");
            
            /**
             * Gets the "ftable" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable getFtable();
            
            /**
             * True if has "ftable" element
             */
            boolean isSetFtable();
            
            /**
             * Sets the "ftable" element
             */
            void setFtable(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable ftable);
            
            /**
             * Appends and returns a new empty "ftable" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable addNewFtable();
            
            /**
             * Unsets the "ftable" element
             */
            void unsetFtable();
            
            /**
             * Gets the "align" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align getAlign();
            
            /**
             * True if has "align" element
             */
            boolean isSetAlign();
            
            /**
             * Sets the "align" element
             */
            void setAlign(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align align);
            
            /**
             * Appends and returns a new empty "align" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align addNewAlign();
            
            /**
             * Unsets the "align" element
             */
            void unsetAlign();
            
            /**
             * Gets the "graph" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph getGraph();
            
            /**
             * True if has "graph" element
             */
            boolean isSetGraph();
            
            /**
             * Sets the "graph" element
             */
            void setGraph(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph graph);
            
            /**
             * Appends and returns a new empty "graph" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph addNewGraph();
            
            /**
             * Unsets the "graph" element
             */
            void unsetGraph();
            
            /**
             * Gets the "ids" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids getIds();
            
            /**
             * True if has "ids" element
             */
            boolean isSetIds();
            
            /**
             * Sets the "ids" element
             */
            void setIds(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids ids);
            
            /**
             * Appends and returns a new empty "ids" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids addNewIds();
            
            /**
             * Unsets the "ids" element
             */
            void unsetIds();
            
            /**
             * Gets the "locs" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs getLocs();
            
            /**
             * True if has "locs" element
             */
            boolean isSetLocs();
            
            /**
             * Sets the "locs" element
             */
            void setLocs(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs locs);
            
            /**
             * Appends and returns a new empty "locs" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs addNewLocs();
            
            /**
             * Unsets the "locs" element
             */
            void unsetLocs();
            
            /**
             * Gets the "seq-table" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable getSeqTable();
            
            /**
             * True if has "seq-table" element
             */
            boolean isSetSeqTable();
            
            /**
             * Sets the "seq-table" element
             */
            void setSeqTable(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable seqTable);
            
            /**
             * Appends and returns a new empty "seq-table" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable addNewSeqTable();
            
            /**
             * Unsets the "seq-table" element
             */
            void unsetSeqTable();
            
            /**
             * An XML ftable(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Ftable extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ftable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ftable5e4aelemtype");
                
                /**
                 * Gets array of all "Seq-feat" elements
                 */
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] getSeqFeatArray();
                
                /**
                 * Gets ith "Seq-feat" element
                 */
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat getSeqFeatArray(int i);
                
                /**
                 * Returns number of "Seq-feat" element
                 */
                int sizeOfSeqFeatArray();
                
                /**
                 * Sets array of all "Seq-feat" element
                 */
                void setSeqFeatArray(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] seqFeatArray);
                
                /**
                 * Sets ith "Seq-feat" element
                 */
                void setSeqFeatArray(int i, gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat seqFeat);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-feat" element
                 */
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat insertNewSeqFeat(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-feat" element
                 */
                gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat addNewSeqFeat();
                
                /**
                 * Removes the ith "Seq-feat" element
                 */
                void removeSeqFeat(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML align(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Align extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Align.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("align827delemtype");
                
                /**
                 * Gets array of all "Seq-align" elements
                 */
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] getSeqAlignArray();
                
                /**
                 * Gets ith "Seq-align" element
                 */
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlignArray(int i);
                
                /**
                 * Returns number of "Seq-align" element
                 */
                int sizeOfSeqAlignArray();
                
                /**
                 * Sets array of all "Seq-align" element
                 */
                void setSeqAlignArray(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] seqAlignArray);
                
                /**
                 * Sets ith "Seq-align" element
                 */
                void setSeqAlignArray(int i, gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-align" element
                 */
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign insertNewSeqAlign(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-align" element
                 */
                gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign();
                
                /**
                 * Removes the ith "Seq-align" element
                 */
                void removeSeqAlign(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML graph(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Graph extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Graph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("graph1694elemtype");
                
                /**
                 * Gets array of all "Seq-graph" elements
                 */
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph[] getSeqGraphArray();
                
                /**
                 * Gets ith "Seq-graph" element
                 */
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph getSeqGraphArray(int i);
                
                /**
                 * Returns number of "Seq-graph" element
                 */
                int sizeOfSeqGraphArray();
                
                /**
                 * Sets array of all "Seq-graph" element
                 */
                void setSeqGraphArray(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph[] seqGraphArray);
                
                /**
                 * Sets ith "Seq-graph" element
                 */
                void setSeqGraphArray(int i, gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph seqGraph);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-graph" element
                 */
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph insertNewSeqGraph(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-graph" element
                 */
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph addNewSeqGraph();
                
                /**
                 * Removes the ith "Seq-graph" element
                 */
                void removeSeqGraph(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ids(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Ids extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ids9ceaelemtype");
                
                /**
                 * Gets array of all "Seq-id" elements
                 */
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray();
                
                /**
                 * Gets ith "Seq-id" element
                 */
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i);
                
                /**
                 * Returns number of "Seq-id" element
                 */
                int sizeOfSeqIdArray();
                
                /**
                 * Sets array of all "Seq-id" element
                 */
                void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray);
                
                /**
                 * Sets ith "Seq-id" element
                 */
                void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
                 */
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-id" element
                 */
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
                
                /**
                 * Removes the ith "Seq-id" element
                 */
                void removeSeqId(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML locs(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Locs extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Locs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("locs1b5felemtype");
                
                /**
                 * Gets array of all "Seq-loc" elements
                 */
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray();
                
                /**
                 * Gets ith "Seq-loc" element
                 */
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i);
                
                /**
                 * Returns number of "Seq-loc" element
                 */
                int sizeOfSeqLocArray();
                
                /**
                 * Sets array of all "Seq-loc" element
                 */
                void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray);
                
                /**
                 * Sets ith "Seq-loc" element
                 */
                void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
                 */
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
                 */
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
                
                /**
                 * Removes the ith "Seq-loc" element
                 */
                void removeSeqLoc(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML seq-table(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface SeqTable extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtable5fc2elemtype");
                
                /**
                 * Gets the "Seq-table" element
                 */
                gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable getSeqTable();
                
                /**
                 * Sets the "Seq-table" element
                 */
                void setSeqTable(gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable seqTable);
                
                /**
                 * Appends and returns a new empty "Seq-table" element
                 */
                gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable addNewSeqTable();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqAnnotDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqAnnotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
