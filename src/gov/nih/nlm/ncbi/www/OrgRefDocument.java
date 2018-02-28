/*
 * An XML document type.
 * Localname: Org-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.OrgRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Org-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface OrgRefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgRefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgreff6b6doctype");
    
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
     * An XML Org-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface OrgRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgref6cacelemtype");
        
        /**
         * Gets the "taxname" element
         */
        java.lang.String getTaxname();
        
        /**
         * Gets (as xml) the "taxname" element
         */
        org.apache.xmlbeans.XmlString xgetTaxname();
        
        /**
         * True if has "taxname" element
         */
        boolean isSetTaxname();
        
        /**
         * Sets the "taxname" element
         */
        void setTaxname(java.lang.String taxname);
        
        /**
         * Sets (as xml) the "taxname" element
         */
        void xsetTaxname(org.apache.xmlbeans.XmlString taxname);
        
        /**
         * Unsets the "taxname" element
         */
        void unsetTaxname();
        
        /**
         * Gets the "common" element
         */
        java.lang.String getCommon();
        
        /**
         * Gets (as xml) the "common" element
         */
        org.apache.xmlbeans.XmlString xgetCommon();
        
        /**
         * True if has "common" element
         */
        boolean isSetCommon();
        
        /**
         * Sets the "common" element
         */
        void setCommon(java.lang.String common);
        
        /**
         * Sets (as xml) the "common" element
         */
        void xsetCommon(org.apache.xmlbeans.XmlString common);
        
        /**
         * Unsets the "common" element
         */
        void unsetCommon();
        
        /**
         * Gets array of all "mod" elements
         */
        java.lang.String[] getModArray();
        
        /**
         * Gets ith "mod" element
         */
        java.lang.String getModArray(int i);
        
        /**
         * Gets (as xml) array of all "mod" elements
         */
        org.apache.xmlbeans.XmlString[] xgetModArray();
        
        /**
         * Gets (as xml) ith "mod" element
         */
        org.apache.xmlbeans.XmlString xgetModArray(int i);
        
        /**
         * Returns number of "mod" element
         */
        int sizeOfModArray();
        
        /**
         * Sets array of all "mod" element
         */
        void setModArray(java.lang.String[] modArray);
        
        /**
         * Sets ith "mod" element
         */
        void setModArray(int i, java.lang.String mod);
        
        /**
         * Sets (as xml) array of all "mod" element
         */
        void xsetModArray(org.apache.xmlbeans.XmlString[] modArray);
        
        /**
         * Sets (as xml) ith "mod" element
         */
        void xsetModArray(int i, org.apache.xmlbeans.XmlString mod);
        
        /**
         * Inserts the value as the ith "mod" element
         */
        void insertMod(int i, java.lang.String mod);
        
        /**
         * Appends the value as the last "mod" element
         */
        void addMod(java.lang.String mod);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mod" element
         */
        org.apache.xmlbeans.XmlString insertNewMod(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mod" element
         */
        org.apache.xmlbeans.XmlString addNewMod();
        
        /**
         * Removes the ith "mod" element
         */
        void removeMod(int i);
        
        /**
         * Gets the "db" element
         */
        gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db getDb();
        
        /**
         * True if has "db" element
         */
        boolean isSetDb();
        
        /**
         * Sets the "db" element
         */
        void setDb(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db db);
        
        /**
         * Appends and returns a new empty "db" element
         */
        gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db addNewDb();
        
        /**
         * Unsets the "db" element
         */
        void unsetDb();
        
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
         * Gets the "orgname" element
         */
        gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname getOrgname();
        
        /**
         * True if has "orgname" element
         */
        boolean isSetOrgname();
        
        /**
         * Sets the "orgname" element
         */
        void setOrgname(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname orgname);
        
        /**
         * Appends and returns a new empty "orgname" element
         */
        gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname addNewOrgname();
        
        /**
         * Unsets the "orgname" element
         */
        void unsetOrgname();
        
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Db extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Db.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("db5fc6elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db newInstance() {
                  return (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML orgname(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Orgname extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Orgname.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgnamede87elemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname newInstance() {
                  return (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef newInstance() {
              return (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.OrgRefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.OrgRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.OrgRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
