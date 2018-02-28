/*
 * An XML document type.
 * Localname: Bioseq-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BioseqSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Bioseq-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface BioseqSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioseqSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseqset728adoctype");
    
    /**
     * Gets the "Bioseq-set" element
     */
    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet getBioseqSet();
    
    /**
     * Sets the "Bioseq-set" element
     */
    void setBioseqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet bioseqSet);
    
    /**
     * Appends and returns a new empty "Bioseq-set" element
     */
    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet addNewBioseqSet();
    
    /**
     * An XML Bioseq-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface BioseqSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioseqSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseqset18e2elemtype");
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "coll" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll getColl();
        
        /**
         * True if has "coll" element
         */
        boolean isSetColl();
        
        /**
         * Sets the "coll" element
         */
        void setColl(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll coll);
        
        /**
         * Appends and returns a new empty "coll" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll addNewColl();
        
        /**
         * Unsets the "coll" element
         */
        void unsetColl();
        
        /**
         * Gets the "level" element
         */
        java.math.BigInteger getLevel();
        
        /**
         * Gets (as xml) the "level" element
         */
        org.apache.xmlbeans.XmlInteger xgetLevel();
        
        /**
         * True if has "level" element
         */
        boolean isSetLevel();
        
        /**
         * Sets the "level" element
         */
        void setLevel(java.math.BigInteger level);
        
        /**
         * Sets (as xml) the "level" element
         */
        void xsetLevel(org.apache.xmlbeans.XmlInteger level);
        
        /**
         * Unsets the "level" element
         */
        void unsetLevel();
        
        /**
         * Gets the "class" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class getClass1();
        
        /**
         * True if has "class" element
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" element
         */
        void setClass1(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class class1);
        
        /**
         * Appends and returns a new empty "class" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class addNewClass1();
        
        /**
         * Unsets the "class" element
         */
        void unsetClass1();
        
        /**
         * Gets the "release" element
         */
        java.lang.String getRelease();
        
        /**
         * Gets (as xml) the "release" element
         */
        org.apache.xmlbeans.XmlString xgetRelease();
        
        /**
         * True if has "release" element
         */
        boolean isSetRelease();
        
        /**
         * Sets the "release" element
         */
        void setRelease(java.lang.String release);
        
        /**
         * Sets (as xml) the "release" element
         */
        void xsetRelease(org.apache.xmlbeans.XmlString release);
        
        /**
         * Unsets the "release" element
         */
        void unsetRelease();
        
        /**
         * Gets the "date" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date getDate();
        
        /**
         * True if has "date" element
         */
        boolean isSetDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date date);
        
        /**
         * Appends and returns a new empty "date" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date addNewDate();
        
        /**
         * Unsets the "date" element
         */
        void unsetDate();
        
        /**
         * Gets the "descr" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr getDescr();
        
        /**
         * True if has "descr" element
         */
        boolean isSetDescr();
        
        /**
         * Sets the "descr" element
         */
        void setDescr(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr descr);
        
        /**
         * Appends and returns a new empty "descr" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr addNewDescr();
        
        /**
         * Unsets the "descr" element
         */
        void unsetDescr();
        
        /**
         * Gets the "seq-set" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet getSeqSet();
        
        /**
         * Sets the "seq-set" element
         */
        void setSeqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet seqSet);
        
        /**
         * Appends and returns a new empty "seq-set" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet addNewSeqSet();
        
        /**
         * Gets the "annot" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot getAnnot();
        
        /**
         * True if has "annot" element
         */
        boolean isSetAnnot();
        
        /**
         * Sets the "annot" element
         */
        void setAnnot(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot annot);
        
        /**
         * Appends and returns a new empty "annot" element
         */
        gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot addNewAnnot();
        
        /**
         * Unsets the "annot" element
         */
        void unsetAnnot();
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id1959elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML coll(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Coll extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Coll.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("collce6aelemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML class(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Class extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Class.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("class05c6elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioseqSetDocument$BioseqSet$Class$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuedadfattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum NOT_SET = Enum.forString("not-set");
                static final Enum NUC_PROT = Enum.forString("nuc-prot");
                static final Enum SEGSET = Enum.forString("segset");
                static final Enum CONSET = Enum.forString("conset");
                static final Enum PARTS = Enum.forString("parts");
                static final Enum GIBB = Enum.forString("gibb");
                static final Enum GI = Enum.forString("gi");
                static final Enum GENBANK = Enum.forString("genbank");
                static final Enum PIR = Enum.forString("pir");
                static final Enum PUB_SET = Enum.forString("pub-set");
                static final Enum EQUIV = Enum.forString("equiv");
                static final Enum SWISSPROT = Enum.forString("swissprot");
                static final Enum PDB_ENTRY = Enum.forString("pdb-entry");
                static final Enum MUT_SET = Enum.forString("mut-set");
                static final Enum POP_SET = Enum.forString("pop-set");
                static final Enum PHY_SET = Enum.forString("phy-set");
                static final Enum ECO_SET = Enum.forString("eco-set");
                static final Enum GEN_PROD_SET = Enum.forString("gen-prod-set");
                static final Enum WGS_SET = Enum.forString("wgs-set");
                static final Enum NAMED_ANNOT = Enum.forString("named-annot");
                static final Enum NAMED_ANNOT_PROD = Enum.forString("named-annot-prod");
                static final Enum READ_SET = Enum.forString("read-set");
                static final Enum PAIRED_END_READS = Enum.forString("paired-end-reads");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_NOT_SET = Enum.INT_NOT_SET;
                static final int INT_NUC_PROT = Enum.INT_NUC_PROT;
                static final int INT_SEGSET = Enum.INT_SEGSET;
                static final int INT_CONSET = Enum.INT_CONSET;
                static final int INT_PARTS = Enum.INT_PARTS;
                static final int INT_GIBB = Enum.INT_GIBB;
                static final int INT_GI = Enum.INT_GI;
                static final int INT_GENBANK = Enum.INT_GENBANK;
                static final int INT_PIR = Enum.INT_PIR;
                static final int INT_PUB_SET = Enum.INT_PUB_SET;
                static final int INT_EQUIV = Enum.INT_EQUIV;
                static final int INT_SWISSPROT = Enum.INT_SWISSPROT;
                static final int INT_PDB_ENTRY = Enum.INT_PDB_ENTRY;
                static final int INT_MUT_SET = Enum.INT_MUT_SET;
                static final int INT_POP_SET = Enum.INT_POP_SET;
                static final int INT_PHY_SET = Enum.INT_PHY_SET;
                static final int INT_ECO_SET = Enum.INT_ECO_SET;
                static final int INT_GEN_PROD_SET = Enum.INT_GEN_PROD_SET;
                static final int INT_WGS_SET = Enum.INT_WGS_SET;
                static final int INT_NAMED_ANNOT = Enum.INT_NAMED_ANNOT;
                static final int INT_NAMED_ANNOT_PROD = Enum.INT_NAMED_ANNOT_PROD;
                static final int INT_READ_SET = Enum.INT_READ_SET;
                static final int INT_PAIRED_END_READS = Enum.INT_PAIRED_END_READS;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.BioseqSetDocument$BioseqSet$Class$Value.
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
                    static final int INT_NUC_PROT = 2;
                    static final int INT_SEGSET = 3;
                    static final int INT_CONSET = 4;
                    static final int INT_PARTS = 5;
                    static final int INT_GIBB = 6;
                    static final int INT_GI = 7;
                    static final int INT_GENBANK = 8;
                    static final int INT_PIR = 9;
                    static final int INT_PUB_SET = 10;
                    static final int INT_EQUIV = 11;
                    static final int INT_SWISSPROT = 12;
                    static final int INT_PDB_ENTRY = 13;
                    static final int INT_MUT_SET = 14;
                    static final int INT_POP_SET = 15;
                    static final int INT_PHY_SET = 16;
                    static final int INT_ECO_SET = 17;
                    static final int INT_GEN_PROD_SET = 18;
                    static final int INT_WGS_SET = 19;
                    static final int INT_NAMED_ANNOT = 20;
                    static final int INT_NAMED_ANNOT_PROD = 21;
                    static final int INT_READ_SET = 22;
                    static final int INT_PAIRED_END_READS = 23;
                    static final int INT_OTHER = 24;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("not-set", INT_NOT_SET),
                        new Enum("nuc-prot", INT_NUC_PROT),
                        new Enum("segset", INT_SEGSET),
                        new Enum("conset", INT_CONSET),
                        new Enum("parts", INT_PARTS),
                        new Enum("gibb", INT_GIBB),
                        new Enum("gi", INT_GI),
                        new Enum("genbank", INT_GENBANK),
                        new Enum("pir", INT_PIR),
                        new Enum("pub-set", INT_PUB_SET),
                        new Enum("equiv", INT_EQUIV),
                        new Enum("swissprot", INT_SWISSPROT),
                        new Enum("pdb-entry", INT_PDB_ENTRY),
                        new Enum("mut-set", INT_MUT_SET),
                        new Enum("pop-set", INT_POP_SET),
                        new Enum("phy-set", INT_PHY_SET),
                        new Enum("eco-set", INT_ECO_SET),
                        new Enum("gen-prod-set", INT_GEN_PROD_SET),
                        new Enum("wgs-set", INT_WGS_SET),
                        new Enum("named-annot", INT_NAMED_ANNOT),
                        new Enum("named-annot-prod", INT_NAMED_ANNOT_PROD),
                        new Enum("read-set", INT_READ_SET),
                        new Enum("paired-end-reads", INT_PAIRED_END_READS),
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
                    public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datea9acelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML descr(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Descr extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Descr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("descr4f8felemtype");
            
            /**
             * Gets the "Seq-descr" element
             */
            gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr getSeqDescr();
            
            /**
             * Sets the "Seq-descr" element
             */
            void setSeqDescr(gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr seqDescr);
            
            /**
             * Appends and returns a new empty "Seq-descr" element
             */
            gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr addNewSeqDescr();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqsetd342elemtype");
            
            /**
             * Gets array of all "Seq-entry" elements
             */
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry[] getSeqEntryArray();
            
            /**
             * Gets ith "Seq-entry" element
             */
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry getSeqEntryArray(int i);
            
            /**
             * Returns number of "Seq-entry" element
             */
            int sizeOfSeqEntryArray();
            
            /**
             * Sets array of all "Seq-entry" element
             */
            void setSeqEntryArray(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry[] seqEntryArray);
            
            /**
             * Sets ith "Seq-entry" element
             */
            void setSeqEntryArray(int i, gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry seqEntry);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-entry" element
             */
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry insertNewSeqEntry(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-entry" element
             */
            gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry addNewSeqEntry();
            
            /**
             * Removes the ith "Seq-entry" element
             */
            void removeSeqEntry(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML annot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Annot extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("annot1954elemtype");
            
            /**
             * Gets array of all "Seq-annot" elements
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] getSeqAnnotArray();
            
            /**
             * Gets ith "Seq-annot" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot getSeqAnnotArray(int i);
            
            /**
             * Returns number of "Seq-annot" element
             */
            int sizeOfSeqAnnotArray();
            
            /**
             * Sets array of all "Seq-annot" element
             */
            void setSeqAnnotArray(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] seqAnnotArray);
            
            /**
             * Sets ith "Seq-annot" element
             */
            void setSeqAnnotArray(int i, gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot seqAnnot);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-annot" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot insertNewSeqAnnot(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-annot" element
             */
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot addNewSeqAnnot();
            
            /**
             * Removes the ith "Seq-annot" element
             */
            void removeSeqAnnot(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet newInstance() {
              return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BioseqSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BioseqSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
