/*
 * An XML document type.
 * Localname: EvidenceBasis
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.EvidenceBasisDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one EvidenceBasis(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface EvidenceBasisDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvidenceBasisDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("evidencebasis31f3doctype");
    
    /**
     * Gets the "EvidenceBasis" element
     */
    gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis getEvidenceBasis();
    
    /**
     * Sets the "EvidenceBasis" element
     */
    void setEvidenceBasis(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis evidenceBasis);
    
    /**
     * Appends and returns a new empty "EvidenceBasis" element
     */
    gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis addNewEvidenceBasis();
    
    /**
     * An XML EvidenceBasis(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface EvidenceBasis extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EvidenceBasis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("evidencebasis13e6elemtype");
        
        /**
         * Gets the "programs" element
         */
        gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs getPrograms();
        
        /**
         * True if has "programs" element
         */
        boolean isSetPrograms();
        
        /**
         * Sets the "programs" element
         */
        void setPrograms(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs programs);
        
        /**
         * Appends and returns a new empty "programs" element
         */
        gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs addNewPrograms();
        
        /**
         * Unsets the "programs" element
         */
        void unsetPrograms();
        
        /**
         * Gets the "accessions" element
         */
        gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions getAccessions();
        
        /**
         * True if has "accessions" element
         */
        boolean isSetAccessions();
        
        /**
         * Sets the "accessions" element
         */
        void setAccessions(gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions accessions);
        
        /**
         * Appends and returns a new empty "accessions" element
         */
        gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions addNewAccessions();
        
        /**
         * Unsets the "accessions" element
         */
        void unsetAccessions();
        
        /**
         * An XML programs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Programs extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Programs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("programs1c71elemtype");
            
            /**
             * Gets array of all "Program-id" elements
             */
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId[] getProgramIdArray();
            
            /**
             * Gets ith "Program-id" element
             */
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId getProgramIdArray(int i);
            
            /**
             * Returns number of "Program-id" element
             */
            int sizeOfProgramIdArray();
            
            /**
             * Sets array of all "Program-id" element
             */
            void setProgramIdArray(gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId[] programIdArray);
            
            /**
             * Sets ith "Program-id" element
             */
            void setProgramIdArray(int i, gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId programId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Program-id" element
             */
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId insertNewProgramId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Program-id" element
             */
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId addNewProgramId();
            
            /**
             * Removes the ith "Program-id" element
             */
            void removeProgramId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs newInstance() {
                  return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Programs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML accessions(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Accessions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Accessions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("accessionsa0d1elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions newInstance() {
                  return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis.Accessions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis newInstance() {
              return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument.EvidenceBasis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.EvidenceBasisDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.EvidenceBasisDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
