/*
 * An XML document type.
 * Localname: Pubdesc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubdescDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Pubdesc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PubdescDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PubdescDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubdesc999adoctype");
    
    /**
     * Gets the "Pubdesc" element
     */
    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc getPubdesc();
    
    /**
     * Sets the "Pubdesc" element
     */
    void setPubdesc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc pubdesc);
    
    /**
     * Appends and returns a new empty "Pubdesc" element
     */
    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc addNewPubdesc();
    
    /**
     * An XML Pubdesc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Pubdesc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pubdesc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubdesc6574elemtype");
        
        /**
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub getPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub addNewPub();
        
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
         * Gets the "fig" element
         */
        java.lang.String getFig();
        
        /**
         * Gets (as xml) the "fig" element
         */
        org.apache.xmlbeans.XmlString xgetFig();
        
        /**
         * True if has "fig" element
         */
        boolean isSetFig();
        
        /**
         * Sets the "fig" element
         */
        void setFig(java.lang.String fig);
        
        /**
         * Sets (as xml) the "fig" element
         */
        void xsetFig(org.apache.xmlbeans.XmlString fig);
        
        /**
         * Unsets the "fig" element
         */
        void unsetFig();
        
        /**
         * Gets the "num" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num getNum();
        
        /**
         * True if has "num" element
         */
        boolean isSetNum();
        
        /**
         * Sets the "num" element
         */
        void setNum(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num num);
        
        /**
         * Appends and returns a new empty "num" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num addNewNum();
        
        /**
         * Unsets the "num" element
         */
        void unsetNum();
        
        /**
         * Gets the "numexc" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc getNumexc();
        
        /**
         * True if has "numexc" element
         */
        boolean isSetNumexc();
        
        /**
         * Sets the "numexc" element
         */
        void setNumexc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc numexc);
        
        /**
         * Appends and returns a new empty "numexc" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc addNewNumexc();
        
        /**
         * Unsets the "numexc" element
         */
        void unsetNumexc();
        
        /**
         * Gets the "poly-a" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA getPolyA();
        
        /**
         * True if has "poly-a" element
         */
        boolean isSetPolyA();
        
        /**
         * Sets the "poly-a" element
         */
        void setPolyA(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA polyA);
        
        /**
         * Appends and returns a new empty "poly-a" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA addNewPolyA();
        
        /**
         * Unsets the "poly-a" element
         */
        void unsetPolyA();
        
        /**
         * Gets the "maploc" element
         */
        java.lang.String getMaploc();
        
        /**
         * Gets (as xml) the "maploc" element
         */
        org.apache.xmlbeans.XmlString xgetMaploc();
        
        /**
         * True if has "maploc" element
         */
        boolean isSetMaploc();
        
        /**
         * Sets the "maploc" element
         */
        void setMaploc(java.lang.String maploc);
        
        /**
         * Sets (as xml) the "maploc" element
         */
        void xsetMaploc(org.apache.xmlbeans.XmlString maploc);
        
        /**
         * Unsets the "maploc" element
         */
        void unsetMaploc();
        
        /**
         * Gets the "seq-raw" element
         */
        java.lang.String getSeqRaw();
        
        /**
         * Gets (as xml) the "seq-raw" element
         */
        org.apache.xmlbeans.XmlString xgetSeqRaw();
        
        /**
         * True if has "seq-raw" element
         */
        boolean isSetSeqRaw();
        
        /**
         * Sets the "seq-raw" element
         */
        void setSeqRaw(java.lang.String seqRaw);
        
        /**
         * Sets (as xml) the "seq-raw" element
         */
        void xsetSeqRaw(org.apache.xmlbeans.XmlString seqRaw);
        
        /**
         * Unsets the "seq-raw" element
         */
        void unsetSeqRaw();
        
        /**
         * Gets the "align-group" element
         */
        java.math.BigInteger getAlignGroup();
        
        /**
         * Gets (as xml) the "align-group" element
         */
        org.apache.xmlbeans.XmlInteger xgetAlignGroup();
        
        /**
         * True if has "align-group" element
         */
        boolean isSetAlignGroup();
        
        /**
         * Sets the "align-group" element
         */
        void setAlignGroup(java.math.BigInteger alignGroup);
        
        /**
         * Sets (as xml) the "align-group" element
         */
        void xsetAlignGroup(org.apache.xmlbeans.XmlInteger alignGroup);
        
        /**
         * Unsets the "align-group" element
         */
        void unsetAlignGroup();
        
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
         * Gets the "reftype" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype getReftype();
        
        /**
         * True if has "reftype" element
         */
        boolean isSetReftype();
        
        /**
         * Sets the "reftype" element
         */
        void setReftype(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype reftype);
        
        /**
         * Appends and returns a new empty "reftype" element
         */
        gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype addNewReftype();
        
        /**
         * Unsets the "reftype" element
         */
        void unsetReftype();
        
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pub52ddelemtype");
            
            /**
             * Gets the "Pub-equiv" element
             */
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv getPubEquiv();
            
            /**
             * Sets the "Pub-equiv" element
             */
            void setPubEquiv(gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv pubEquiv);
            
            /**
             * Appends and returns a new empty "Pub-equiv" element
             */
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv addNewPubEquiv();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML num(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Num extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Num.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("numb566elemtype");
            
            /**
             * Gets the "Numbering" element
             */
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering();
            
            /**
             * Sets the "Numbering" element
             */
            void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering);
            
            /**
             * Appends and returns a new empty "Numbering" element
             */
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML numexc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Numexc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Numexc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("numexce0daelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Numexc$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value8021attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Numexc$Value.
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
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML poly-a(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PolyA extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PolyA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("polya8eb0elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$PolyA$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value2df7attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$PolyA$Value.
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
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML reftype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Reftype.
         */
        public interface Reftype extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reftype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("reftype122delemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Reftype$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value5bc6attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum SEQ = Enum.forString("seq");
                static final Enum SITES = Enum.forString("sites");
                static final Enum FEATS = Enum.forString("feats");
                static final Enum NO_TARGET = Enum.forString("no-target");
                
                static final int INT_SEQ = Enum.INT_SEQ;
                static final int INT_SITES = Enum.INT_SITES;
                static final int INT_FEATS = Enum.INT_FEATS;
                static final int INT_NO_TARGET = Enum.INT_NO_TARGET;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Reftype$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_SEQ
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
                    
                    static final int INT_SEQ = 1;
                    static final int INT_SITES = 2;
                    static final int INT_FEATS = 3;
                    static final int INT_NO_TARGET = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("seq", INT_SEQ),
                        new Enum("sites", INT_SITES),
                        new Enum("feats", INT_FEATS),
                        new Enum("no-target", INT_NO_TARGET),
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
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc newInstance() {
              return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PubdescDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PubdescDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PubdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
