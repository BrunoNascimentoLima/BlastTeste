/*
 * An XML document type.
 * Localname: OrgName
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.OrgNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one OrgName(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface OrgNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgname5e9bdoctype");
    
    /**
     * Gets the "OrgName" element
     */
    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName getOrgName();
    
    /**
     * Sets the "OrgName" element
     */
    void setOrgName(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName orgName);
    
    /**
     * Appends and returns a new empty "OrgName" element
     */
    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName addNewOrgName();
    
    /**
     * An XML OrgName(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface OrgName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgname6236elemtype");
        
        /**
         * Gets the "name" element
         */
        gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name getName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name name);
        
        /**
         * Appends and returns a new empty "name" element
         */
        gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name addNewName();
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * Gets the "attrib" element
         */
        java.lang.String getAttrib();
        
        /**
         * Gets (as xml) the "attrib" element
         */
        org.apache.xmlbeans.XmlString xgetAttrib();
        
        /**
         * True if has "attrib" element
         */
        boolean isSetAttrib();
        
        /**
         * Sets the "attrib" element
         */
        void setAttrib(java.lang.String attrib);
        
        /**
         * Sets (as xml) the "attrib" element
         */
        void xsetAttrib(org.apache.xmlbeans.XmlString attrib);
        
        /**
         * Unsets the "attrib" element
         */
        void unsetAttrib();
        
        /**
         * Gets the "mod" element
         */
        gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod getMod();
        
        /**
         * True if has "mod" element
         */
        boolean isSetMod();
        
        /**
         * Sets the "mod" element
         */
        void setMod(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod mod);
        
        /**
         * Appends and returns a new empty "mod" element
         */
        gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod addNewMod();
        
        /**
         * Unsets the "mod" element
         */
        void unsetMod();
        
        /**
         * Gets the "lineage" element
         */
        java.lang.String getLineage();
        
        /**
         * Gets (as xml) the "lineage" element
         */
        org.apache.xmlbeans.XmlString xgetLineage();
        
        /**
         * True if has "lineage" element
         */
        boolean isSetLineage();
        
        /**
         * Sets the "lineage" element
         */
        void setLineage(java.lang.String lineage);
        
        /**
         * Sets (as xml) the "lineage" element
         */
        void xsetLineage(org.apache.xmlbeans.XmlString lineage);
        
        /**
         * Unsets the "lineage" element
         */
        void unsetLineage();
        
        /**
         * Gets the "gcode" element
         */
        java.math.BigInteger getGcode();
        
        /**
         * Gets (as xml) the "gcode" element
         */
        org.apache.xmlbeans.XmlInteger xgetGcode();
        
        /**
         * True if has "gcode" element
         */
        boolean isSetGcode();
        
        /**
         * Sets the "gcode" element
         */
        void setGcode(java.math.BigInteger gcode);
        
        /**
         * Sets (as xml) the "gcode" element
         */
        void xsetGcode(org.apache.xmlbeans.XmlInteger gcode);
        
        /**
         * Unsets the "gcode" element
         */
        void unsetGcode();
        
        /**
         * Gets the "mgcode" element
         */
        java.math.BigInteger getMgcode();
        
        /**
         * Gets (as xml) the "mgcode" element
         */
        org.apache.xmlbeans.XmlInteger xgetMgcode();
        
        /**
         * True if has "mgcode" element
         */
        boolean isSetMgcode();
        
        /**
         * Sets the "mgcode" element
         */
        void setMgcode(java.math.BigInteger mgcode);
        
        /**
         * Sets (as xml) the "mgcode" element
         */
        void xsetMgcode(org.apache.xmlbeans.XmlInteger mgcode);
        
        /**
         * Unsets the "mgcode" element
         */
        void unsetMgcode();
        
        /**
         * Gets the "div" element
         */
        java.lang.String getDiv();
        
        /**
         * Gets (as xml) the "div" element
         */
        org.apache.xmlbeans.XmlString xgetDiv();
        
        /**
         * True if has "div" element
         */
        boolean isSetDiv();
        
        /**
         * Sets the "div" element
         */
        void setDiv(java.lang.String div);
        
        /**
         * Sets (as xml) the "div" element
         */
        void xsetDiv(org.apache.xmlbeans.XmlString div);
        
        /**
         * Unsets the "div" element
         */
        void unsetDiv();
        
        /**
         * Gets the "pgcode" element
         */
        java.math.BigInteger getPgcode();
        
        /**
         * Gets (as xml) the "pgcode" element
         */
        org.apache.xmlbeans.XmlInteger xgetPgcode();
        
        /**
         * True if has "pgcode" element
         */
        boolean isSetPgcode();
        
        /**
         * Sets the "pgcode" element
         */
        void setPgcode(java.math.BigInteger pgcode);
        
        /**
         * Sets (as xml) the "pgcode" element
         */
        void xsetPgcode(org.apache.xmlbeans.XmlInteger pgcode);
        
        /**
         * Unsets the "pgcode" element
         */
        void unsetPgcode();
        
        /**
         * An XML name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Name extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("name4f5delemtype");
            
            /**
             * Gets the "binomial" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial getBinomial();
            
            /**
             * True if has "binomial" element
             */
            boolean isSetBinomial();
            
            /**
             * Sets the "binomial" element
             */
            void setBinomial(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial binomial);
            
            /**
             * Appends and returns a new empty "binomial" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial addNewBinomial();
            
            /**
             * Unsets the "binomial" element
             */
            void unsetBinomial();
            
            /**
             * Gets the "virus" element
             */
            java.lang.String getVirus();
            
            /**
             * Gets (as xml) the "virus" element
             */
            org.apache.xmlbeans.XmlString xgetVirus();
            
            /**
             * True if has "virus" element
             */
            boolean isSetVirus();
            
            /**
             * Sets the "virus" element
             */
            void setVirus(java.lang.String virus);
            
            /**
             * Sets (as xml) the "virus" element
             */
            void xsetVirus(org.apache.xmlbeans.XmlString virus);
            
            /**
             * Unsets the "virus" element
             */
            void unsetVirus();
            
            /**
             * Gets the "hybrid" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid getHybrid();
            
            /**
             * True if has "hybrid" element
             */
            boolean isSetHybrid();
            
            /**
             * Sets the "hybrid" element
             */
            void setHybrid(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid hybrid);
            
            /**
             * Appends and returns a new empty "hybrid" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid addNewHybrid();
            
            /**
             * Unsets the "hybrid" element
             */
            void unsetHybrid();
            
            /**
             * Gets the "namedhybrid" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid getNamedhybrid();
            
            /**
             * True if has "namedhybrid" element
             */
            boolean isSetNamedhybrid();
            
            /**
             * Sets the "namedhybrid" element
             */
            void setNamedhybrid(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid namedhybrid);
            
            /**
             * Appends and returns a new empty "namedhybrid" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid addNewNamedhybrid();
            
            /**
             * Unsets the "namedhybrid" element
             */
            void unsetNamedhybrid();
            
            /**
             * Gets the "partial" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial getPartial();
            
            /**
             * True if has "partial" element
             */
            boolean isSetPartial();
            
            /**
             * Sets the "partial" element
             */
            void setPartial(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial partial);
            
            /**
             * Appends and returns a new empty "partial" element
             */
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial addNewPartial();
            
            /**
             * Unsets the "partial" element
             */
            void unsetPartial();
            
            /**
             * An XML binomial(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Binomial extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Binomial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("binomial7752elemtype");
                
                /**
                 * Gets the "BinomialOrgName" element
                 */
                gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName getBinomialOrgName();
                
                /**
                 * Sets the "BinomialOrgName" element
                 */
                void setBinomialOrgName(gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName binomialOrgName);
                
                /**
                 * Appends and returns a new empty "BinomialOrgName" element
                 */
                gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName addNewBinomialOrgName();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial newInstance() {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML hybrid(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Hybrid extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hybrid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("hybridebc5elemtype");
                
                /**
                 * Gets the "MultiOrgName" element
                 */
                gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName getMultiOrgName();
                
                /**
                 * Sets the "MultiOrgName" element
                 */
                void setMultiOrgName(gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName multiOrgName);
                
                /**
                 * Appends and returns a new empty "MultiOrgName" element
                 */
                gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName addNewMultiOrgName();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid newInstance() {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML namedhybrid(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Namedhybrid extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Namedhybrid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("namedhybrid935celemtype");
                
                /**
                 * Gets the "BinomialOrgName" element
                 */
                gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName getBinomialOrgName();
                
                /**
                 * Sets the "BinomialOrgName" element
                 */
                void setBinomialOrgName(gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName binomialOrgName);
                
                /**
                 * Appends and returns a new empty "BinomialOrgName" element
                 */
                gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName addNewBinomialOrgName();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid newInstance() {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Partial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("partial02d0elemtype");
                
                /**
                 * Gets the "PartialOrgName" element
                 */
                gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName getPartialOrgName();
                
                /**
                 * Sets the "PartialOrgName" element
                 */
                void setPartialOrgName(gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName partialOrgName);
                
                /**
                 * Appends and returns a new empty "PartialOrgName" element
                 */
                gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName addNewPartialOrgName();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial newInstance() {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name newInstance() {
                  return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mod(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Mod extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mod45a4elemtype");
            
            /**
             * Gets array of all "OrgMod" elements
             */
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod[] getOrgModArray();
            
            /**
             * Gets ith "OrgMod" element
             */
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod getOrgModArray(int i);
            
            /**
             * Returns number of "OrgMod" element
             */
            int sizeOfOrgModArray();
            
            /**
             * Sets array of all "OrgMod" element
             */
            void setOrgModArray(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod[] orgModArray);
            
            /**
             * Sets ith "OrgMod" element
             */
            void setOrgModArray(int i, gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod orgMod);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "OrgMod" element
             */
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod insertNewOrgMod(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "OrgMod" element
             */
            gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod addNewOrgMod();
            
            /**
             * Removes the ith "OrgMod" element
             */
            void removeOrgMod(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod newInstance() {
                  return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName newInstance() {
              return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.OrgNameDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.OrgNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.OrgNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
