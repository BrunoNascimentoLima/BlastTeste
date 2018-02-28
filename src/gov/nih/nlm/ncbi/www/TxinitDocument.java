/*
 * An XML document type.
 * Localname: Txinit
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TxinitDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Txinit(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface TxinitDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TxinitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txinit5cb2doctype");
    
    /**
     * Gets the "Txinit" element
     */
    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit getTxinit();
    
    /**
     * Sets the "Txinit" element
     */
    void setTxinit(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit txinit);
    
    /**
     * Appends and returns a new empty "Txinit" element
     */
    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit addNewTxinit();
    
    /**
     * An XML Txinit(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Txinit extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Txinit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txinit1a62elemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
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
         * Gets the "gene" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene getGene();
        
        /**
         * True if has "gene" element
         */
        boolean isSetGene();
        
        /**
         * Sets the "gene" element
         */
        void setGene(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene gene);
        
        /**
         * Appends and returns a new empty "gene" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene addNewGene();
        
        /**
         * Unsets the "gene" element
         */
        void unsetGene();
        
        /**
         * Gets the "protein" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein getProtein();
        
        /**
         * True if has "protein" element
         */
        boolean isSetProtein();
        
        /**
         * Sets the "protein" element
         */
        void setProtein(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein protein);
        
        /**
         * Appends and returns a new empty "protein" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein addNewProtein();
        
        /**
         * Unsets the "protein" element
         */
        void unsetProtein();
        
        /**
         * Gets array of all "rna" elements
         */
        java.lang.String[] getRnaArray();
        
        /**
         * Gets ith "rna" element
         */
        java.lang.String getRnaArray(int i);
        
        /**
         * Gets (as xml) array of all "rna" elements
         */
        org.apache.xmlbeans.XmlString[] xgetRnaArray();
        
        /**
         * Gets (as xml) ith "rna" element
         */
        org.apache.xmlbeans.XmlString xgetRnaArray(int i);
        
        /**
         * Returns number of "rna" element
         */
        int sizeOfRnaArray();
        
        /**
         * Sets array of all "rna" element
         */
        void setRnaArray(java.lang.String[] rnaArray);
        
        /**
         * Sets ith "rna" element
         */
        void setRnaArray(int i, java.lang.String rna);
        
        /**
         * Sets (as xml) array of all "rna" element
         */
        void xsetRnaArray(org.apache.xmlbeans.XmlString[] rnaArray);
        
        /**
         * Sets (as xml) ith "rna" element
         */
        void xsetRnaArray(int i, org.apache.xmlbeans.XmlString rna);
        
        /**
         * Inserts the value as the ith "rna" element
         */
        void insertRna(int i, java.lang.String rna);
        
        /**
         * Appends the value as the last "rna" element
         */
        void addRna(java.lang.String rna);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rna" element
         */
        org.apache.xmlbeans.XmlString insertNewRna(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rna" element
         */
        org.apache.xmlbeans.XmlString addNewRna();
        
        /**
         * Removes the ith "rna" element
         */
        void removeRna(int i);
        
        /**
         * Gets the "expression" element
         */
        java.lang.String getExpression();
        
        /**
         * Gets (as xml) the "expression" element
         */
        org.apache.xmlbeans.XmlString xgetExpression();
        
        /**
         * True if has "expression" element
         */
        boolean isSetExpression();
        
        /**
         * Sets the "expression" element
         */
        void setExpression(java.lang.String expression);
        
        /**
         * Sets (as xml) the "expression" element
         */
        void xsetExpression(org.apache.xmlbeans.XmlString expression);
        
        /**
         * Unsets the "expression" element
         */
        void unsetExpression();
        
        /**
         * Gets the "txsystem" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem getTxsystem();
        
        /**
         * Sets the "txsystem" element
         */
        void setTxsystem(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem txsystem);
        
        /**
         * Appends and returns a new empty "txsystem" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem addNewTxsystem();
        
        /**
         * Gets the "txdescr" element
         */
        java.lang.String getTxdescr();
        
        /**
         * Gets (as xml) the "txdescr" element
         */
        org.apache.xmlbeans.XmlString xgetTxdescr();
        
        /**
         * True if has "txdescr" element
         */
        boolean isSetTxdescr();
        
        /**
         * Sets the "txdescr" element
         */
        void setTxdescr(java.lang.String txdescr);
        
        /**
         * Sets (as xml) the "txdescr" element
         */
        void xsetTxdescr(org.apache.xmlbeans.XmlString txdescr);
        
        /**
         * Unsets the "txdescr" element
         */
        void unsetTxdescr();
        
        /**
         * Gets the "txorg" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg getTxorg();
        
        /**
         * True if has "txorg" element
         */
        boolean isSetTxorg();
        
        /**
         * Sets the "txorg" element
         */
        void setTxorg(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg txorg);
        
        /**
         * Appends and returns a new empty "txorg" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg addNewTxorg();
        
        /**
         * Unsets the "txorg" element
         */
        void unsetTxorg();
        
        /**
         * Gets the "mapping-precise" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise getMappingPrecise();
        
        /**
         * True if has "mapping-precise" element
         */
        boolean isSetMappingPrecise();
        
        /**
         * Sets the "mapping-precise" element
         */
        void setMappingPrecise(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise mappingPrecise);
        
        /**
         * Appends and returns a new empty "mapping-precise" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise addNewMappingPrecise();
        
        /**
         * Unsets the "mapping-precise" element
         */
        void unsetMappingPrecise();
        
        /**
         * Gets the "location-accurate" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate getLocationAccurate();
        
        /**
         * True if has "location-accurate" element
         */
        boolean isSetLocationAccurate();
        
        /**
         * Sets the "location-accurate" element
         */
        void setLocationAccurate(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate locationAccurate);
        
        /**
         * Appends and returns a new empty "location-accurate" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate addNewLocationAccurate();
        
        /**
         * Unsets the "location-accurate" element
         */
        void unsetLocationAccurate();
        
        /**
         * Gets the "inittype" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype getInittype();
        
        /**
         * True if has "inittype" element
         */
        boolean isSetInittype();
        
        /**
         * Sets the "inittype" element
         */
        void setInittype(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype inittype);
        
        /**
         * Appends and returns a new empty "inittype" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype addNewInittype();
        
        /**
         * Unsets the "inittype" element
         */
        void unsetInittype();
        
        /**
         * Gets the "evidence" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence getEvidence();
        
        /**
         * True if has "evidence" element
         */
        boolean isSetEvidence();
        
        /**
         * Sets the "evidence" element
         */
        void setEvidence(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence evidence);
        
        /**
         * Appends and returns a new empty "evidence" element
         */
        gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence addNewEvidence();
        
        /**
         * Unsets the "evidence" element
         */
        void unsetEvidence();
        
        /**
         * An XML gene(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Gene extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gene.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genea453elemtype");
            
            /**
             * Gets array of all "Gene-ref" elements
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef[] getGeneRefArray();
            
            /**
             * Gets ith "Gene-ref" element
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef getGeneRefArray(int i);
            
            /**
             * Returns number of "Gene-ref" element
             */
            int sizeOfGeneRefArray();
            
            /**
             * Sets array of all "Gene-ref" element
             */
            void setGeneRefArray(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef[] geneRefArray);
            
            /**
             * Sets ith "Gene-ref" element
             */
            void setGeneRefArray(int i, gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef geneRef);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Gene-ref" element
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef insertNewGeneRef(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Gene-ref" element
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef addNewGeneRef();
            
            /**
             * Removes the ith "Gene-ref" element
             */
            void removeGeneRef(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML protein(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Protein extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Protein.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("protein0411elemtype");
            
            /**
             * Gets array of all "Prot-ref" elements
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef[] getProtRefArray();
            
            /**
             * Gets ith "Prot-ref" element
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef getProtRefArray(int i);
            
            /**
             * Returns number of "Prot-ref" element
             */
            int sizeOfProtRefArray();
            
            /**
             * Sets array of all "Prot-ref" element
             */
            void setProtRefArray(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef[] protRefArray);
            
            /**
             * Sets ith "Prot-ref" element
             */
            void setProtRefArray(int i, gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef protRef);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Prot-ref" element
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef insertNewProtRef(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Prot-ref" element
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef addNewProtRef();
            
            /**
             * Removes the ith "Prot-ref" element
             */
            void removeProtRef(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML txsystem(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Txsystem extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Txsystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txsysteme671elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$Txsystem$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value85b8attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum POL_1 = Enum.forString("pol1");
                static final Enum POL_2 = Enum.forString("pol2");
                static final Enum POL_3 = Enum.forString("pol3");
                static final Enum BACTERIAL = Enum.forString("bacterial");
                static final Enum VIRAL = Enum.forString("viral");
                static final Enum RNA = Enum.forString("rna");
                static final Enum ORGANELLE = Enum.forString("organelle");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_POL_1 = Enum.INT_POL_1;
                static final int INT_POL_2 = Enum.INT_POL_2;
                static final int INT_POL_3 = Enum.INT_POL_3;
                static final int INT_BACTERIAL = Enum.INT_BACTERIAL;
                static final int INT_VIRAL = Enum.INT_VIRAL;
                static final int INT_RNA = Enum.INT_RNA;
                static final int INT_ORGANELLE = Enum.INT_ORGANELLE;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$Txsystem$Value.
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
                    static final int INT_POL_1 = 2;
                    static final int INT_POL_2 = 3;
                    static final int INT_POL_3 = 4;
                    static final int INT_BACTERIAL = 5;
                    static final int INT_VIRAL = 6;
                    static final int INT_RNA = 7;
                    static final int INT_ORGANELLE = 8;
                    static final int INT_OTHER = 9;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("pol1", INT_POL_1),
                        new Enum("pol2", INT_POL_2),
                        new Enum("pol3", INT_POL_3),
                        new Enum("bacterial", INT_BACTERIAL),
                        new Enum("viral", INT_VIRAL),
                        new Enum("rna", INT_RNA),
                        new Enum("organelle", INT_ORGANELLE),
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
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML txorg(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Txorg extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Txorg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txorgedaeelemtype");
            
            /**
             * Gets the "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef();
            
            /**
             * Sets the "Org-ref" element
             */
            void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef);
            
            /**
             * Appends and returns a new empty "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mapping-precise(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface MappingPrecise extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MappingPrecise.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mappingprecise412aelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$MappingPrecise$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value3403attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$MappingPrecise$Value.
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
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML location-accurate(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface LocationAccurate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationAccurate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("locationaccuratebcdaelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$LocationAccurate$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value5d73attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$LocationAccurate$Value.
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
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML inittype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Inittype extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inittype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("inittype54c8elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$Inittype$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuef40fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum SINGLE = Enum.forString("single");
                static final Enum MULTIPLE = Enum.forString("multiple");
                static final Enum REGION = Enum.forString("region");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_SINGLE = Enum.INT_SINGLE;
                static final int INT_MULTIPLE = Enum.INT_MULTIPLE;
                static final int INT_REGION = Enum.INT_REGION;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$Inittype$Value.
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
                    static final int INT_SINGLE = 2;
                    static final int INT_MULTIPLE = 3;
                    static final int INT_REGION = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("single", INT_SINGLE),
                        new Enum("multiple", INT_MULTIPLE),
                        new Enum("region", INT_REGION),
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
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML evidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Evidence extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Evidence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("evidence7815elemtype");
            
            /**
             * Gets array of all "Tx-evidence" elements
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence[] getTxEvidenceArray();
            
            /**
             * Gets ith "Tx-evidence" element
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence getTxEvidenceArray(int i);
            
            /**
             * Returns number of "Tx-evidence" element
             */
            int sizeOfTxEvidenceArray();
            
            /**
             * Sets array of all "Tx-evidence" element
             */
            void setTxEvidenceArray(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence[] txEvidenceArray);
            
            /**
             * Sets ith "Tx-evidence" element
             */
            void setTxEvidenceArray(int i, gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence txEvidence);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Tx-evidence" element
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence insertNewTxEvidence(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Tx-evidence" element
             */
            gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence addNewTxEvidence();
            
            /**
             * Removes the ith "Tx-evidence" element
             */
            void removeTxEvidence(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence newInstance() {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit newInstance() {
              return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.TxinitDocument.Txinit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.TxinitDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.TxinitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.TxinitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
