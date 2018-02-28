/*
 * An XML document type.
 * Localname: Imprint
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ImprintDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Imprint(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface ImprintDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImprintDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("imprintf415doctype");
    
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
     * An XML Imprint(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Imprint extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imprint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("imprint7caaelemtype");
        
        /**
         * Gets the "date" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date getDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date date);
        
        /**
         * Appends and returns a new empty "date" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date addNewDate();
        
        /**
         * Gets the "volume" element
         */
        java.lang.String getVolume();
        
        /**
         * Gets (as xml) the "volume" element
         */
        org.apache.xmlbeans.XmlString xgetVolume();
        
        /**
         * True if has "volume" element
         */
        boolean isSetVolume();
        
        /**
         * Sets the "volume" element
         */
        void setVolume(java.lang.String volume);
        
        /**
         * Sets (as xml) the "volume" element
         */
        void xsetVolume(org.apache.xmlbeans.XmlString volume);
        
        /**
         * Unsets the "volume" element
         */
        void unsetVolume();
        
        /**
         * Gets the "issue" element
         */
        java.lang.String getIssue();
        
        /**
         * Gets (as xml) the "issue" element
         */
        org.apache.xmlbeans.XmlString xgetIssue();
        
        /**
         * True if has "issue" element
         */
        boolean isSetIssue();
        
        /**
         * Sets the "issue" element
         */
        void setIssue(java.lang.String issue);
        
        /**
         * Sets (as xml) the "issue" element
         */
        void xsetIssue(org.apache.xmlbeans.XmlString issue);
        
        /**
         * Unsets the "issue" element
         */
        void unsetIssue();
        
        /**
         * Gets the "pages" element
         */
        java.lang.String getPages();
        
        /**
         * Gets (as xml) the "pages" element
         */
        org.apache.xmlbeans.XmlString xgetPages();
        
        /**
         * True if has "pages" element
         */
        boolean isSetPages();
        
        /**
         * Sets the "pages" element
         */
        void setPages(java.lang.String pages);
        
        /**
         * Sets (as xml) the "pages" element
         */
        void xsetPages(org.apache.xmlbeans.XmlString pages);
        
        /**
         * Unsets the "pages" element
         */
        void unsetPages();
        
        /**
         * Gets the "section" element
         */
        java.lang.String getSection();
        
        /**
         * Gets (as xml) the "section" element
         */
        org.apache.xmlbeans.XmlString xgetSection();
        
        /**
         * True if has "section" element
         */
        boolean isSetSection();
        
        /**
         * Sets the "section" element
         */
        void setSection(java.lang.String section);
        
        /**
         * Sets (as xml) the "section" element
         */
        void xsetSection(org.apache.xmlbeans.XmlString section);
        
        /**
         * Unsets the "section" element
         */
        void unsetSection();
        
        /**
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub getPub();
        
        /**
         * True if has "pub" element
         */
        boolean isSetPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub addNewPub();
        
        /**
         * Unsets the "pub" element
         */
        void unsetPub();
        
        /**
         * Gets the "cprt" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt getCprt();
        
        /**
         * True if has "cprt" element
         */
        boolean isSetCprt();
        
        /**
         * Sets the "cprt" element
         */
        void setCprt(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt cprt);
        
        /**
         * Appends and returns a new empty "cprt" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt addNewCprt();
        
        /**
         * Unsets the "cprt" element
         */
        void unsetCprt();
        
        /**
         * Gets the "part-sup" element
         */
        java.lang.String getPartSup();
        
        /**
         * Gets (as xml) the "part-sup" element
         */
        org.apache.xmlbeans.XmlString xgetPartSup();
        
        /**
         * True if has "part-sup" element
         */
        boolean isSetPartSup();
        
        /**
         * Sets the "part-sup" element
         */
        void setPartSup(java.lang.String partSup);
        
        /**
         * Sets (as xml) the "part-sup" element
         */
        void xsetPartSup(org.apache.xmlbeans.XmlString partSup);
        
        /**
         * Unsets the "part-sup" element
         */
        void unsetPartSup();
        
        /**
         * Gets the "language" element
         */
        java.lang.String getLanguage();
        
        /**
         * Gets (as xml) the "language" element
         */
        org.apache.xmlbeans.XmlString xgetLanguage();
        
        /**
         * Sets the "language" element
         */
        void setLanguage(java.lang.String language);
        
        /**
         * Sets (as xml) the "language" element
         */
        void xsetLanguage(org.apache.xmlbeans.XmlString language);
        
        /**
         * Gets the "prepub" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub getPrepub();
        
        /**
         * True if has "prepub" element
         */
        boolean isSetPrepub();
        
        /**
         * Sets the "prepub" element
         */
        void setPrepub(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub prepub);
        
        /**
         * Appends and returns a new empty "prepub" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub addNewPrepub();
        
        /**
         * Unsets the "prepub" element
         */
        void unsetPrepub();
        
        /**
         * Gets the "part-supi" element
         */
        java.lang.String getPartSupi();
        
        /**
         * Gets (as xml) the "part-supi" element
         */
        org.apache.xmlbeans.XmlString xgetPartSupi();
        
        /**
         * True if has "part-supi" element
         */
        boolean isSetPartSupi();
        
        /**
         * Sets the "part-supi" element
         */
        void setPartSupi(java.lang.String partSupi);
        
        /**
         * Sets (as xml) the "part-supi" element
         */
        void xsetPartSupi(org.apache.xmlbeans.XmlString partSupi);
        
        /**
         * Unsets the "part-supi" element
         */
        void unsetPartSupi();
        
        /**
         * Gets the "retract" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract getRetract();
        
        /**
         * True if has "retract" element
         */
        boolean isSetRetract();
        
        /**
         * Sets the "retract" element
         */
        void setRetract(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract retract);
        
        /**
         * Appends and returns a new empty "retract" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract addNewRetract();
        
        /**
         * Unsets the "retract" element
         */
        void unsetRetract();
        
        /**
         * Gets the "pubstatus" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus getPubstatus();
        
        /**
         * True if has "pubstatus" element
         */
        boolean isSetPubstatus();
        
        /**
         * Sets the "pubstatus" element
         */
        void setPubstatus(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus pubstatus);
        
        /**
         * Appends and returns a new empty "pubstatus" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus addNewPubstatus();
        
        /**
         * Unsets the "pubstatus" element
         */
        void unsetPubstatus();
        
        /**
         * Gets the "history" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History getHistory();
        
        /**
         * True if has "history" element
         */
        boolean isSetHistory();
        
        /**
         * Sets the "history" element
         */
        void setHistory(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History history);
        
        /**
         * Appends and returns a new empty "history" element
         */
        gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History addNewHistory();
        
        /**
         * Unsets the "history" element
         */
        void unsetHistory();
        
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Date extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Date.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dateecf4elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pub6a13elemtype");
            
            /**
             * Gets the "Affil" element
             */
            gov.nih.nlm.ncbi.www.AffilDocument.Affil getAffil();
            
            /**
             * Sets the "Affil" element
             */
            void setAffil(gov.nih.nlm.ncbi.www.AffilDocument.Affil affil);
            
            /**
             * Appends and returns a new empty "Affil" element
             */
            gov.nih.nlm.ncbi.www.AffilDocument.Affil addNewAffil();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML cprt(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Cprt extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cprt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cprtcab5elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML prepub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Prepub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prepub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("prepubc8c0elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ImprintDocument$Imprint$Prepub$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value6807attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum SUBMITTED = Enum.forString("submitted");
                static final Enum IN_PRESS = Enum.forString("in-press");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_SUBMITTED = Enum.INT_SUBMITTED;
                static final int INT_IN_PRESS = Enum.INT_IN_PRESS;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.ImprintDocument$Imprint$Prepub$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_SUBMITTED
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
                    
                    static final int INT_SUBMITTED = 1;
                    static final int INT_IN_PRESS = 2;
                    static final int INT_OTHER = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("submitted", INT_SUBMITTED),
                        new Enum("in-press", INT_IN_PRESS),
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
                    public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML retract(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Retract extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Retract.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("retract7617elemtype");
            
            /**
             * Gets the "CitRetract" element
             */
            gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract getCitRetract();
            
            /**
             * Sets the "CitRetract" element
             */
            void setCitRetract(gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract citRetract);
            
            /**
             * Appends and returns a new empty "CitRetract" element
             */
            gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract addNewCitRetract();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pubstatus(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pubstatus extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pubstatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubstatus6e45elemtype");
            
            /**
             * Gets the "PubStatus" element
             */
            gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus getPubStatus();
            
            /**
             * Sets the "PubStatus" element
             */
            void setPubStatus(gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus pubStatus);
            
            /**
             * Appends and returns a new empty "PubStatus" element
             */
            gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus addNewPubStatus();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML history(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface History extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(History.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("historyfdaaelemtype");
            
            /**
             * Gets the "PubStatusDateSet" element
             */
            gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet getPubStatusDateSet();
            
            /**
             * Sets the "PubStatusDateSet" element
             */
            void setPubStatusDateSet(gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet pubStatusDateSet);
            
            /**
             * Appends and returns a new empty "PubStatusDateSet" element
             */
            gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet addNewPubStatusDateSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History newInstance() {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint newInstance() {
              return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.ImprintDocument.Imprint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.ImprintDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ImprintDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ImprintDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
