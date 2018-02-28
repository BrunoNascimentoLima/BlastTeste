/*
 * An XML document type.
 * Localname: Medline-entry
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineEntryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Medline-entry(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface MedlineEntryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedlineEntryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medlineentrya0f1doctype");
    
    /**
     * Gets the "Medline-entry" element
     */
    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry getMedlineEntry();
    
    /**
     * Sets the "Medline-entry" element
     */
    void setMedlineEntry(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry medlineEntry);
    
    /**
     * Appends and returns a new empty "Medline-entry" element
     */
    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry addNewMedlineEntry();
    
    /**
     * An XML Medline-entry(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface MedlineEntry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedlineEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medlineentry35e2elemtype");
        
        /**
         * Gets the "uid" element
         */
        java.math.BigInteger getUid();
        
        /**
         * Gets (as xml) the "uid" element
         */
        org.apache.xmlbeans.XmlInteger xgetUid();
        
        /**
         * True if has "uid" element
         */
        boolean isSetUid();
        
        /**
         * Sets the "uid" element
         */
        void setUid(java.math.BigInteger uid);
        
        /**
         * Sets (as xml) the "uid" element
         */
        void xsetUid(org.apache.xmlbeans.XmlInteger uid);
        
        /**
         * Unsets the "uid" element
         */
        void unsetUid();
        
        /**
         * Gets the "em" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em getEm();
        
        /**
         * Sets the "em" element
         */
        void setEm(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em em);
        
        /**
         * Appends and returns a new empty "em" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em addNewEm();
        
        /**
         * Gets the "cit" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit getCit();
        
        /**
         * Sets the "cit" element
         */
        void setCit(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit cit);
        
        /**
         * Appends and returns a new empty "cit" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit addNewCit();
        
        /**
         * Gets the "abstract" element
         */
        java.lang.String getAbstract();
        
        /**
         * Gets (as xml) the "abstract" element
         */
        org.apache.xmlbeans.XmlString xgetAbstract();
        
        /**
         * True if has "abstract" element
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" element
         */
        void setAbstract(java.lang.String xabstract);
        
        /**
         * Sets (as xml) the "abstract" element
         */
        void xsetAbstract(org.apache.xmlbeans.XmlString xabstract);
        
        /**
         * Unsets the "abstract" element
         */
        void unsetAbstract();
        
        /**
         * Gets the "mesh" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh getMesh();
        
        /**
         * True if has "mesh" element
         */
        boolean isSetMesh();
        
        /**
         * Sets the "mesh" element
         */
        void setMesh(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh mesh);
        
        /**
         * Appends and returns a new empty "mesh" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh addNewMesh();
        
        /**
         * Unsets the "mesh" element
         */
        void unsetMesh();
        
        /**
         * Gets the "substance" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance getSubstance();
        
        /**
         * True if has "substance" element
         */
        boolean isSetSubstance();
        
        /**
         * Sets the "substance" element
         */
        void setSubstance(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance substance);
        
        /**
         * Appends and returns a new empty "substance" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance addNewSubstance();
        
        /**
         * Unsets the "substance" element
         */
        void unsetSubstance();
        
        /**
         * Gets the "xref" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref getXref();
        
        /**
         * True if has "xref" element
         */
        boolean isSetXref();
        
        /**
         * Sets the "xref" element
         */
        void setXref(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref xref);
        
        /**
         * Appends and returns a new empty "xref" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref addNewXref();
        
        /**
         * Unsets the "xref" element
         */
        void unsetXref();
        
        /**
         * Gets array of all "idnum" elements
         */
        java.lang.String[] getIdnumArray();
        
        /**
         * Gets ith "idnum" element
         */
        java.lang.String getIdnumArray(int i);
        
        /**
         * Gets (as xml) array of all "idnum" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIdnumArray();
        
        /**
         * Gets (as xml) ith "idnum" element
         */
        org.apache.xmlbeans.XmlString xgetIdnumArray(int i);
        
        /**
         * Returns number of "idnum" element
         */
        int sizeOfIdnumArray();
        
        /**
         * Sets array of all "idnum" element
         */
        void setIdnumArray(java.lang.String[] idnumArray);
        
        /**
         * Sets ith "idnum" element
         */
        void setIdnumArray(int i, java.lang.String idnum);
        
        /**
         * Sets (as xml) array of all "idnum" element
         */
        void xsetIdnumArray(org.apache.xmlbeans.XmlString[] idnumArray);
        
        /**
         * Sets (as xml) ith "idnum" element
         */
        void xsetIdnumArray(int i, org.apache.xmlbeans.XmlString idnum);
        
        /**
         * Inserts the value as the ith "idnum" element
         */
        void insertIdnum(int i, java.lang.String idnum);
        
        /**
         * Appends the value as the last "idnum" element
         */
        void addIdnum(java.lang.String idnum);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "idnum" element
         */
        org.apache.xmlbeans.XmlString insertNewIdnum(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "idnum" element
         */
        org.apache.xmlbeans.XmlString addNewIdnum();
        
        /**
         * Removes the ith "idnum" element
         */
        void removeIdnum(int i);
        
        /**
         * Gets array of all "gene" elements
         */
        java.lang.String[] getGeneArray();
        
        /**
         * Gets ith "gene" element
         */
        java.lang.String getGeneArray(int i);
        
        /**
         * Gets (as xml) array of all "gene" elements
         */
        org.apache.xmlbeans.XmlString[] xgetGeneArray();
        
        /**
         * Gets (as xml) ith "gene" element
         */
        org.apache.xmlbeans.XmlString xgetGeneArray(int i);
        
        /**
         * Returns number of "gene" element
         */
        int sizeOfGeneArray();
        
        /**
         * Sets array of all "gene" element
         */
        void setGeneArray(java.lang.String[] geneArray);
        
        /**
         * Sets ith "gene" element
         */
        void setGeneArray(int i, java.lang.String gene);
        
        /**
         * Sets (as xml) array of all "gene" element
         */
        void xsetGeneArray(org.apache.xmlbeans.XmlString[] geneArray);
        
        /**
         * Sets (as xml) ith "gene" element
         */
        void xsetGeneArray(int i, org.apache.xmlbeans.XmlString gene);
        
        /**
         * Inserts the value as the ith "gene" element
         */
        void insertGene(int i, java.lang.String gene);
        
        /**
         * Appends the value as the last "gene" element
         */
        void addGene(java.lang.String gene);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gene" element
         */
        org.apache.xmlbeans.XmlString insertNewGene(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gene" element
         */
        org.apache.xmlbeans.XmlString addNewGene();
        
        /**
         * Removes the ith "gene" element
         */
        void removeGene(int i);
        
        /**
         * Gets the "pmid" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid getPmid();
        
        /**
         * True if has "pmid" element
         */
        boolean isSetPmid();
        
        /**
         * Sets the "pmid" element
         */
        void setPmid(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid pmid);
        
        /**
         * Appends and returns a new empty "pmid" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid addNewPmid();
        
        /**
         * Unsets the "pmid" element
         */
        void unsetPmid();
        
        /**
         * Gets array of all "pub-type" elements
         */
        java.lang.String[] getPubTypeArray();
        
        /**
         * Gets ith "pub-type" element
         */
        java.lang.String getPubTypeArray(int i);
        
        /**
         * Gets (as xml) array of all "pub-type" elements
         */
        org.apache.xmlbeans.XmlString[] xgetPubTypeArray();
        
        /**
         * Gets (as xml) ith "pub-type" element
         */
        org.apache.xmlbeans.XmlString xgetPubTypeArray(int i);
        
        /**
         * Returns number of "pub-type" element
         */
        int sizeOfPubTypeArray();
        
        /**
         * Sets array of all "pub-type" element
         */
        void setPubTypeArray(java.lang.String[] pubTypeArray);
        
        /**
         * Sets ith "pub-type" element
         */
        void setPubTypeArray(int i, java.lang.String pubType);
        
        /**
         * Sets (as xml) array of all "pub-type" element
         */
        void xsetPubTypeArray(org.apache.xmlbeans.XmlString[] pubTypeArray);
        
        /**
         * Sets (as xml) ith "pub-type" element
         */
        void xsetPubTypeArray(int i, org.apache.xmlbeans.XmlString pubType);
        
        /**
         * Inserts the value as the ith "pub-type" element
         */
        void insertPubType(int i, java.lang.String pubType);
        
        /**
         * Appends the value as the last "pub-type" element
         */
        void addPubType(java.lang.String pubType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pub-type" element
         */
        org.apache.xmlbeans.XmlString insertNewPubType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pub-type" element
         */
        org.apache.xmlbeans.XmlString addNewPubType();
        
        /**
         * Removes the ith "pub-type" element
         */
        void removePubType(int i);
        
        /**
         * Gets the "mlfield" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield getMlfield();
        
        /**
         * True if has "mlfield" element
         */
        boolean isSetMlfield();
        
        /**
         * Sets the "mlfield" element
         */
        void setMlfield(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield mlfield);
        
        /**
         * Appends and returns a new empty "mlfield" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield addNewMlfield();
        
        /**
         * Unsets the "mlfield" element
         */
        void unsetMlfield();
        
        /**
         * Gets the "status" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status getStatus();
        
        /**
         * True if has "status" element
         */
        boolean isSetStatus();
        
        /**
         * Sets the "status" element
         */
        void setStatus(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status status);
        
        /**
         * Appends and returns a new empty "status" element
         */
        gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status addNewStatus();
        
        /**
         * Unsets the "status" element
         */
        void unsetStatus();
        
        /**
         * An XML em(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Em extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Em.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ema726elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cita41celemtype");
            
            /**
             * Gets the "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArt();
            
            /**
             * Sets the "Cit-art" element
             */
            void setCitArt(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt);
            
            /**
             * Appends and returns a new empty "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt addNewCitArt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mesh(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Mesh extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mesh.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mesh2cebelemtype");
            
            /**
             * Gets array of all "Medline-mesh" elements
             */
            gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh[] getMedlineMeshArray();
            
            /**
             * Gets ith "Medline-mesh" element
             */
            gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh getMedlineMeshArray(int i);
            
            /**
             * Returns number of "Medline-mesh" element
             */
            int sizeOfMedlineMeshArray();
            
            /**
             * Sets array of all "Medline-mesh" element
             */
            void setMedlineMeshArray(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh[] medlineMeshArray);
            
            /**
             * Sets ith "Medline-mesh" element
             */
            void setMedlineMeshArray(int i, gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh medlineMesh);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-mesh" element
             */
            gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh insertNewMedlineMesh(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-mesh" element
             */
            gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh addNewMedlineMesh();
            
            /**
             * Removes the ith "Medline-mesh" element
             */
            void removeMedlineMesh(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML substance(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Substance extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Substance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("substance8bbeelemtype");
            
            /**
             * Gets array of all "Medline-rn" elements
             */
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn[] getMedlineRnArray();
            
            /**
             * Gets ith "Medline-rn" element
             */
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn getMedlineRnArray(int i);
            
            /**
             * Returns number of "Medline-rn" element
             */
            int sizeOfMedlineRnArray();
            
            /**
             * Sets array of all "Medline-rn" element
             */
            void setMedlineRnArray(gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn[] medlineRnArray);
            
            /**
             * Sets ith "Medline-rn" element
             */
            void setMedlineRnArray(int i, gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn medlineRn);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-rn" element
             */
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn insertNewMedlineRn(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-rn" element
             */
            gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn addNewMedlineRn();
            
            /**
             * Removes the ith "Medline-rn" element
             */
            void removeMedlineRn(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Xref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("xrefb319elemtype");
            
            /**
             * Gets array of all "Medline-si" elements
             */
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi[] getMedlineSiArray();
            
            /**
             * Gets ith "Medline-si" element
             */
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi getMedlineSiArray(int i);
            
            /**
             * Returns number of "Medline-si" element
             */
            int sizeOfMedlineSiArray();
            
            /**
             * Sets array of all "Medline-si" element
             */
            void setMedlineSiArray(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi[] medlineSiArray);
            
            /**
             * Sets ith "Medline-si" element
             */
            void setMedlineSiArray(int i, gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi medlineSi);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-si" element
             */
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi insertNewMedlineSi(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-si" element
             */
            gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi addNewMedlineSi();
            
            /**
             * Removes the ith "Medline-si" element
             */
            void removeMedlineSi(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmid extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmid7c56elemtype");
            
            /**
             * Gets the "PubMedId" element
             */
            java.math.BigInteger getPubMedId();
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger xgetPubMedId();
            
            /**
             * Sets the "PubMedId" element
             */
            void setPubMedId(java.math.BigInteger pubMedId);
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mlfield(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Mlfield extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mlfield.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mlfield0489elemtype");
            
            /**
             * Gets array of all "Medline-field" elements
             */
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField[] getMedlineFieldArray();
            
            /**
             * Gets ith "Medline-field" element
             */
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField getMedlineFieldArray(int i);
            
            /**
             * Returns number of "Medline-field" element
             */
            int sizeOfMedlineFieldArray();
            
            /**
             * Sets array of all "Medline-field" element
             */
            void setMedlineFieldArray(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField[] medlineFieldArray);
            
            /**
             * Sets ith "Medline-field" element
             */
            void setMedlineFieldArray(int i, gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField medlineField);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-field" element
             */
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField insertNewMedlineField(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-field" element
             */
            gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField addNewMedlineField();
            
            /**
             * Removes the ith "Medline-field" element
             */
            void removeMedlineField(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML status(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineEntryDocument$MedlineEntry$Status.
         */
        public interface Status extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("status4370elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineEntryDocument$MedlineEntry$Status$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value3037attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum PUBLISHER = Enum.forString("publisher");
                static final Enum PREMEDLINE = Enum.forString("premedline");
                static final Enum MEDLINE = Enum.forString("medline");
                
                static final int INT_PUBLISHER = Enum.INT_PUBLISHER;
                static final int INT_PREMEDLINE = Enum.INT_PREMEDLINE;
                static final int INT_MEDLINE = Enum.INT_MEDLINE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.MedlineEntryDocument$MedlineEntry$Status$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_PUBLISHER
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
                    
                    static final int INT_PUBLISHER = 1;
                    static final int INT_PREMEDLINE = 2;
                    static final int INT_MEDLINE = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("publisher", INT_PUBLISHER),
                        new Enum("premedline", INT_PREMEDLINE),
                        new Enum("medline", INT_MEDLINE),
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
                    public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status newInstance() {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry newInstance() {
              return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.MedlineEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.MedlineEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
