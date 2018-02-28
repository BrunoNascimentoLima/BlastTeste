/*
 * An XML document type.
 * Localname: Bioseq
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BioseqDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Bioseq(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface BioseqDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioseqDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseq9af5doctype");
    
    /**
     * Gets the "Bioseq" element
     */
    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseq();
    
    /**
     * Sets the "Bioseq" element
     */
    void setBioseq(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq);
    
    /**
     * Appends and returns a new empty "Bioseq" element
     */
    gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq addNewBioseq();
    
    /**
     * An XML Bioseq(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Bioseq extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bioseq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseq75c2elemtype");
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id getId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id addNewId();
        
        /**
         * Gets the "descr" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr getDescr();
        
        /**
         * True if has "descr" element
         */
        boolean isSetDescr();
        
        /**
         * Sets the "descr" element
         */
        void setDescr(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr descr);
        
        /**
         * Appends and returns a new empty "descr" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr addNewDescr();
        
        /**
         * Unsets the "descr" element
         */
        void unsetDescr();
        
        /**
         * Gets the "inst" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst getInst();
        
        /**
         * Sets the "inst" element
         */
        void setInst(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst inst);
        
        /**
         * Appends and returns a new empty "inst" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst addNewInst();
        
        /**
         * Gets the "annot" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot getAnnot();
        
        /**
         * True if has "annot" element
         */
        boolean isSetAnnot();
        
        /**
         * Sets the "annot" element
         */
        void setAnnot(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot annot);
        
        /**
         * Appends and returns a new empty "annot" element
         */
        gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot addNewAnnot();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("iddd39elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Descr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("descra96felemtype");
            
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
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Descr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML inst(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Inst extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inst.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("inst1d24elemtype");
            
            /**
             * Gets the "Seq-inst" element
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst getSeqInst();
            
            /**
             * Sets the "Seq-inst" element
             */
            void setSeqInst(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst seqInst);
            
            /**
             * Appends and returns a new empty "Seq-inst" element
             */
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst addNewSeqInst();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Inst) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("annot0834elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot newInstance() {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq.Annot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq newInstance() {
              return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.BioseqDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.BioseqDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.BioseqDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
