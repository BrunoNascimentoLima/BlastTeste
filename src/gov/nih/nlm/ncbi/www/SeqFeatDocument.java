/*
 * An XML document type.
 * Localname: Seq-feat
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-feat(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqFeatDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqFeatDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqfeat9cbedoctype");
    
    /**
     * Gets the "Seq-feat" element
     */
    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat getSeqFeat();
    
    /**
     * Sets the "Seq-feat" element
     */
    void setSeqFeat(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat seqFeat);
    
    /**
     * Appends and returns a new empty "Seq-feat" element
     */
    gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat addNewSeqFeat();
    
    /**
     * An XML Seq-feat(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqFeat extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqFeat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqfeata2a2elemtype");
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "data" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data getData();
        
        /**
         * Sets the "data" element
         */
        void setData(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data addNewData();
        
        /**
         * Gets the "partial" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial getPartial();
        
        /**
         * True if has "partial" element
         */
        boolean isSetPartial();
        
        /**
         * Sets the "partial" element
         */
        void setPartial(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial partial);
        
        /**
         * Appends and returns a new empty "partial" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial addNewPartial();
        
        /**
         * Unsets the "partial" element
         */
        void unsetPartial();
        
        /**
         * Gets the "except" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except getExcept();
        
        /**
         * True if has "except" element
         */
        boolean isSetExcept();
        
        /**
         * Sets the "except" element
         */
        void setExcept(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except except);
        
        /**
         * Appends and returns a new empty "except" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except addNewExcept();
        
        /**
         * Unsets the "except" element
         */
        void unsetExcept();
        
        /**
         * Gets the "comment" element
         */
        java.lang.String getComment();
        
        /**
         * Gets (as xml) the "comment" element
         */
        org.apache.xmlbeans.XmlString xgetComment();
        
        /**
         * True if has "comment" element
         */
        boolean isSetComment();
        
        /**
         * Sets the "comment" element
         */
        void setComment(java.lang.String comment);
        
        /**
         * Sets (as xml) the "comment" element
         */
        void xsetComment(org.apache.xmlbeans.XmlString comment);
        
        /**
         * Unsets the "comment" element
         */
        void unsetComment();
        
        /**
         * Gets the "product" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product getProduct();
        
        /**
         * True if has "product" element
         */
        boolean isSetProduct();
        
        /**
         * Sets the "product" element
         */
        void setProduct(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product product);
        
        /**
         * Appends and returns a new empty "product" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product addNewProduct();
        
        /**
         * Unsets the "product" element
         */
        void unsetProduct();
        
        /**
         * Gets the "location" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location getLocation();
        
        /**
         * Sets the "location" element
         */
        void setLocation(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location location);
        
        /**
         * Appends and returns a new empty "location" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location addNewLocation();
        
        /**
         * Gets the "qual" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual getQual();
        
        /**
         * True if has "qual" element
         */
        boolean isSetQual();
        
        /**
         * Sets the "qual" element
         */
        void setQual(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual qual);
        
        /**
         * Appends and returns a new empty "qual" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual addNewQual();
        
        /**
         * Unsets the "qual" element
         */
        void unsetQual();
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * Gets the "cit" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit getCit();
        
        /**
         * True if has "cit" element
         */
        boolean isSetCit();
        
        /**
         * Sets the "cit" element
         */
        void setCit(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit cit);
        
        /**
         * Appends and returns a new empty "cit" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit addNewCit();
        
        /**
         * Unsets the "cit" element
         */
        void unsetCit();
        
        /**
         * Gets the "exp-ev" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv getExpEv();
        
        /**
         * True if has "exp-ev" element
         */
        boolean isSetExpEv();
        
        /**
         * Sets the "exp-ev" element
         */
        void setExpEv(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv expEv);
        
        /**
         * Appends and returns a new empty "exp-ev" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv addNewExpEv();
        
        /**
         * Unsets the "exp-ev" element
         */
        void unsetExpEv();
        
        /**
         * Gets the "xref" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref getXref();
        
        /**
         * True if has "xref" element
         */
        boolean isSetXref();
        
        /**
         * Sets the "xref" element
         */
        void setXref(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref xref);
        
        /**
         * Appends and returns a new empty "xref" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref addNewXref();
        
        /**
         * Unsets the "xref" element
         */
        void unsetXref();
        
        /**
         * Gets the "dbxref" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref getDbxref();
        
        /**
         * True if has "dbxref" element
         */
        boolean isSetDbxref();
        
        /**
         * Sets the "dbxref" element
         */
        void setDbxref(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref dbxref);
        
        /**
         * Appends and returns a new empty "dbxref" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref addNewDbxref();
        
        /**
         * Unsets the "dbxref" element
         */
        void unsetDbxref();
        
        /**
         * Gets the "pseudo" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo getPseudo();
        
        /**
         * True if has "pseudo" element
         */
        boolean isSetPseudo();
        
        /**
         * Sets the "pseudo" element
         */
        void setPseudo(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo pseudo);
        
        /**
         * Appends and returns a new empty "pseudo" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo addNewPseudo();
        
        /**
         * Unsets the "pseudo" element
         */
        void unsetPseudo();
        
        /**
         * Gets the "except-text" element
         */
        java.lang.String getExceptText();
        
        /**
         * Gets (as xml) the "except-text" element
         */
        org.apache.xmlbeans.XmlString xgetExceptText();
        
        /**
         * True if has "except-text" element
         */
        boolean isSetExceptText();
        
        /**
         * Sets the "except-text" element
         */
        void setExceptText(java.lang.String exceptText);
        
        /**
         * Sets (as xml) the "except-text" element
         */
        void xsetExceptText(org.apache.xmlbeans.XmlString exceptText);
        
        /**
         * Unsets the "except-text" element
         */
        void unsetExceptText();
        
        /**
         * Gets the "ids" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids getIds();
        
        /**
         * True if has "ids" element
         */
        boolean isSetIds();
        
        /**
         * Sets the "ids" element
         */
        void setIds(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids ids);
        
        /**
         * Appends and returns a new empty "ids" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids addNewIds();
        
        /**
         * Unsets the "ids" element
         */
        void unsetIds();
        
        /**
         * Gets the "exts" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts getExts();
        
        /**
         * True if has "exts" element
         */
        boolean isSetExts();
        
        /**
         * Sets the "exts" element
         */
        void setExts(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts exts);
        
        /**
         * Appends and returns a new empty "exts" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts addNewExts();
        
        /**
         * Unsets the "exts" element
         */
        void unsetExts();
        
        /**
         * Gets the "support" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support getSupport();
        
        /**
         * True if has "support" element
         */
        boolean isSetSupport();
        
        /**
         * Sets the "support" element
         */
        void setSupport(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support support);
        
        /**
         * Appends and returns a new empty "support" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support addNewSupport();
        
        /**
         * Unsets the "support" element
         */
        void unsetSupport();
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id7699elemtype");
            
            /**
             * Gets the "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatId();
            
            /**
             * Sets the "Feat-id" element
             */
            void setFeatId(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId);
            
            /**
             * Appends and returns a new empty "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datab168elemtype");
            
            /**
             * Gets the "SeqFeatData" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData getSeqFeatData();
            
            /**
             * Sets the "SeqFeatData" element
             */
            void setSeqFeatData(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData seqFeatData);
            
            /**
             * Appends and returns a new empty "SeqFeatData" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData addNewSeqFeatData();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML partial(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Partial extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Partial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("partial534felemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Partial$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value9aa8attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Partial$Value.
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
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Partial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML except(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Except extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Except.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("except2717elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Except$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value109eattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Except$Value.
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
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Except) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML product(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Product extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("product5f3delemtype");
            
            /**
             * Gets the "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
            
            /**
             * Sets the "Seq-loc" element
             */
            void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Location extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Location.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("location9cb3elemtype");
            
            /**
             * Gets the "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
            
            /**
             * Sets the "Seq-loc" element
             */
            void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML qual(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Qual extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Qual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("qualcfcdelemtype");
            
            /**
             * Gets array of all "Gb-qual" elements
             */
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual[] getGbQualArray();
            
            /**
             * Gets ith "Gb-qual" element
             */
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual getGbQualArray(int i);
            
            /**
             * Returns number of "Gb-qual" element
             */
            int sizeOfGbQualArray();
            
            /**
             * Sets array of all "Gb-qual" element
             */
            void setGbQualArray(gov.nih.nlm.ncbi.www.GbQualDocument.GbQual[] gbQualArray);
            
            /**
             * Sets ith "Gb-qual" element
             */
            void setGbQualArray(int i, gov.nih.nlm.ncbi.www.GbQualDocument.GbQual gbQual);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Gb-qual" element
             */
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual insertNewGbQual(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Gb-qual" element
             */
            gov.nih.nlm.ncbi.www.GbQualDocument.GbQual addNewGbQual();
            
            /**
             * Removes the ith "Gb-qual" element
             */
            void removeGbQual(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Qual) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ext extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ext1fefelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML cit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Cit extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citb15celemtype");
            
            /**
             * Gets the "Pub-set" element
             */
            gov.nih.nlm.ncbi.www.PubSetDocument.PubSet getPubSet();
            
            /**
             * Sets the "Pub-set" element
             */
            void setPubSet(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet pubSet);
            
            /**
             * Appends and returns a new empty "Pub-set" element
             */
            gov.nih.nlm.ncbi.www.PubSetDocument.PubSet addNewPubSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Cit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML exp-ev(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ExpEv extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExpEv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("expev5a5felemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$ExpEv$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value43e6attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum EXPERIMENTAL = Enum.forString("experimental");
                static final Enum NOT_EXPERIMENTAL = Enum.forString("not-experimental");
                
                static final int INT_EXPERIMENTAL = Enum.INT_EXPERIMENTAL;
                static final int INT_NOT_EXPERIMENTAL = Enum.INT_NOT_EXPERIMENTAL;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$ExpEv$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_EXPERIMENTAL
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
                    
                    static final int INT_EXPERIMENTAL = 1;
                    static final int INT_NOT_EXPERIMENTAL = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("experimental", INT_EXPERIMENTAL),
                        new Enum("not-experimental", INT_NOT_EXPERIMENTAL),
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
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.ExpEv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Xref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("xrefe899elemtype");
            
            /**
             * Gets array of all "SeqFeatXref" elements
             */
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref[] getSeqFeatXrefArray();
            
            /**
             * Gets ith "SeqFeatXref" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref getSeqFeatXrefArray(int i);
            
            /**
             * Returns number of "SeqFeatXref" element
             */
            int sizeOfSeqFeatXrefArray();
            
            /**
             * Sets array of all "SeqFeatXref" element
             */
            void setSeqFeatXrefArray(gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref[] seqFeatXrefArray);
            
            /**
             * Sets ith "SeqFeatXref" element
             */
            void setSeqFeatXrefArray(int i, gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref seqFeatXref);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SeqFeatXref" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref insertNewSeqFeatXref(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SeqFeatXref" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref addNewSeqFeatXref();
            
            /**
             * Removes the ith "SeqFeatXref" element
             */
            void removeSeqFeatXref(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML dbxref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Dbxref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dbxref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dbxrefa497elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Dbxref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pseudo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pseudo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pseudo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pseudo507celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Pseudo$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value3a03attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDocument$SeqFeat$Pseudo$Value.
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
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Pseudo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ids.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("idsb8c6elemtype");
            
            /**
             * Gets array of all "Feat-id" elements
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId[] getFeatIdArray();
            
            /**
             * Gets ith "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatIdArray(int i);
            
            /**
             * Returns number of "Feat-id" element
             */
            int sizeOfFeatIdArray();
            
            /**
             * Sets array of all "Feat-id" element
             */
            void setFeatIdArray(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId[] featIdArray);
            
            /**
             * Sets ith "Feat-id" element
             */
            void setFeatIdArray(int i, gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId insertNewFeatId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId();
            
            /**
             * Removes the ith "Feat-id" element
             */
            void removeFeatId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Ids) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML exts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Exts extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Exts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("exts3a30elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Exts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML support(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Support extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Support.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("support9a1delemtype");
            
            /**
             * Gets the "SeqFeatSupport" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport getSeqFeatSupport();
            
            /**
             * Sets the "SeqFeatSupport" element
             */
            void setSeqFeatSupport(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport seqFeatSupport);
            
            /**
             * Appends and returns a new empty "SeqFeatSupport" element
             */
            gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport addNewSeqFeatSupport();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat.Support) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqFeatDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
