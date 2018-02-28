/*
 * An XML document type.
 * Localname: Variation-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.VariationRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Variation-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface VariationRefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariationRefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variationref7ca5doctype");
    
    /**
     * Gets the "Variation-ref" element
     */
    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRef();
    
    /**
     * Sets the "Variation-ref" element
     */
    void setVariationRef(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef);
    
    /**
     * Appends and returns a new empty "Variation-ref" element
     */
    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef();
    
    /**
     * An XML Variation-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface VariationRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariationRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variationref054aelemtype");
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "parent-id" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId getParentId();
        
        /**
         * True if has "parent-id" element
         */
        boolean isSetParentId();
        
        /**
         * Sets the "parent-id" element
         */
        void setParentId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId parentId);
        
        /**
         * Appends and returns a new empty "parent-id" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId addNewParentId();
        
        /**
         * Unsets the "parent-id" element
         */
        void unsetParentId();
        
        /**
         * Gets the "sample-id" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId getSampleId();
        
        /**
         * True if has "sample-id" element
         */
        boolean isSetSampleId();
        
        /**
         * Sets the "sample-id" element
         */
        void setSampleId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId sampleId);
        
        /**
         * Appends and returns a new empty "sample-id" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId addNewSampleId();
        
        /**
         * Unsets the "sample-id" element
         */
        void unsetSampleId();
        
        /**
         * Gets the "other-ids" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds getOtherIds();
        
        /**
         * True if has "other-ids" element
         */
        boolean isSetOtherIds();
        
        /**
         * Sets the "other-ids" element
         */
        void setOtherIds(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds otherIds);
        
        /**
         * Appends and returns a new empty "other-ids" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds addNewOtherIds();
        
        /**
         * Unsets the "other-ids" element
         */
        void unsetOtherIds();
        
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
         * Gets array of all "synonyms" elements
         */
        java.lang.String[] getSynonymsArray();
        
        /**
         * Gets ith "synonyms" element
         */
        java.lang.String getSynonymsArray(int i);
        
        /**
         * Gets (as xml) array of all "synonyms" elements
         */
        org.apache.xmlbeans.XmlString[] xgetSynonymsArray();
        
        /**
         * Gets (as xml) ith "synonyms" element
         */
        org.apache.xmlbeans.XmlString xgetSynonymsArray(int i);
        
        /**
         * Returns number of "synonyms" element
         */
        int sizeOfSynonymsArray();
        
        /**
         * Sets array of all "synonyms" element
         */
        void setSynonymsArray(java.lang.String[] synonymsArray);
        
        /**
         * Sets ith "synonyms" element
         */
        void setSynonymsArray(int i, java.lang.String synonyms);
        
        /**
         * Sets (as xml) array of all "synonyms" element
         */
        void xsetSynonymsArray(org.apache.xmlbeans.XmlString[] synonymsArray);
        
        /**
         * Sets (as xml) ith "synonyms" element
         */
        void xsetSynonymsArray(int i, org.apache.xmlbeans.XmlString synonyms);
        
        /**
         * Inserts the value as the ith "synonyms" element
         */
        void insertSynonyms(int i, java.lang.String synonyms);
        
        /**
         * Appends the value as the last "synonyms" element
         */
        void addSynonyms(java.lang.String synonyms);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "synonyms" element
         */
        org.apache.xmlbeans.XmlString insertNewSynonyms(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "synonyms" element
         */
        org.apache.xmlbeans.XmlString addNewSynonyms();
        
        /**
         * Removes the ith "synonyms" element
         */
        void removeSynonyms(int i);
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" element
         */
        void unsetDescription();
        
        /**
         * Gets the "phenotype" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype getPhenotype();
        
        /**
         * True if has "phenotype" element
         */
        boolean isSetPhenotype();
        
        /**
         * Sets the "phenotype" element
         */
        void setPhenotype(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype phenotype);
        
        /**
         * Appends and returns a new empty "phenotype" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype addNewPhenotype();
        
        /**
         * Unsets the "phenotype" element
         */
        void unsetPhenotype();
        
        /**
         * Gets the "method" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method getMethod();
        
        /**
         * True if has "method" element
         */
        boolean isSetMethod();
        
        /**
         * Sets the "method" element
         */
        void setMethod(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method method);
        
        /**
         * Appends and returns a new empty "method" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method addNewMethod();
        
        /**
         * Unsets the "method" element
         */
        void unsetMethod();
        
        /**
         * Gets the "population-data" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData getPopulationData();
        
        /**
         * True if has "population-data" element
         */
        boolean isSetPopulationData();
        
        /**
         * Sets the "population-data" element
         */
        void setPopulationData(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData populationData);
        
        /**
         * Appends and returns a new empty "population-data" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData addNewPopulationData();
        
        /**
         * Unsets the "population-data" element
         */
        void unsetPopulationData();
        
        /**
         * Gets the "variant-prop" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp getVariantProp();
        
        /**
         * True if has "variant-prop" element
         */
        boolean isSetVariantProp();
        
        /**
         * Sets the "variant-prop" element
         */
        void setVariantProp(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp variantProp);
        
        /**
         * Appends and returns a new empty "variant-prop" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp addNewVariantProp();
        
        /**
         * Unsets the "variant-prop" element
         */
        void unsetVariantProp();
        
        /**
         * Gets the "validated" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated getValidated();
        
        /**
         * True if has "validated" element
         */
        boolean isSetValidated();
        
        /**
         * Sets the "validated" element
         */
        void setValidated(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated validated);
        
        /**
         * Appends and returns a new empty "validated" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated addNewValidated();
        
        /**
         * Unsets the "validated" element
         */
        void unsetValidated();
        
        /**
         * Gets the "clinical-test" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest getClinicalTest();
        
        /**
         * True if has "clinical-test" element
         */
        boolean isSetClinicalTest();
        
        /**
         * Sets the "clinical-test" element
         */
        void setClinicalTest(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest clinicalTest);
        
        /**
         * Appends and returns a new empty "clinical-test" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest addNewClinicalTest();
        
        /**
         * Unsets the "clinical-test" element
         */
        void unsetClinicalTest();
        
        /**
         * Gets the "allele-origin" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin getAlleleOrigin();
        
        /**
         * True if has "allele-origin" element
         */
        boolean isSetAlleleOrigin();
        
        /**
         * Sets the "allele-origin" element
         */
        void setAlleleOrigin(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin alleleOrigin);
        
        /**
         * Appends and returns a new empty "allele-origin" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin addNewAlleleOrigin();
        
        /**
         * Unsets the "allele-origin" element
         */
        void unsetAlleleOrigin();
        
        /**
         * Gets the "allele-state" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState getAlleleState();
        
        /**
         * True if has "allele-state" element
         */
        boolean isSetAlleleState();
        
        /**
         * Sets the "allele-state" element
         */
        void setAlleleState(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState alleleState);
        
        /**
         * Appends and returns a new empty "allele-state" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState addNewAlleleState();
        
        /**
         * Unsets the "allele-state" element
         */
        void unsetAlleleState();
        
        /**
         * Gets the "allele-frequency" element
         */
        double getAlleleFrequency();
        
        /**
         * Gets (as xml) the "allele-frequency" element
         */
        org.apache.xmlbeans.XmlDouble xgetAlleleFrequency();
        
        /**
         * True if has "allele-frequency" element
         */
        boolean isSetAlleleFrequency();
        
        /**
         * Sets the "allele-frequency" element
         */
        void setAlleleFrequency(double alleleFrequency);
        
        /**
         * Sets (as xml) the "allele-frequency" element
         */
        void xsetAlleleFrequency(org.apache.xmlbeans.XmlDouble alleleFrequency);
        
        /**
         * Unsets the "allele-frequency" element
         */
        void unsetAlleleFrequency();
        
        /**
         * Gets the "is-ancestral-allele" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele getIsAncestralAllele();
        
        /**
         * True if has "is-ancestral-allele" element
         */
        boolean isSetIsAncestralAllele();
        
        /**
         * Sets the "is-ancestral-allele" element
         */
        void setIsAncestralAllele(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele isAncestralAllele);
        
        /**
         * Appends and returns a new empty "is-ancestral-allele" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele addNewIsAncestralAllele();
        
        /**
         * Unsets the "is-ancestral-allele" element
         */
        void unsetIsAncestralAllele();
        
        /**
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub getPub();
        
        /**
         * True if has "pub" element
         */
        boolean isSetPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub addNewPub();
        
        /**
         * Unsets the "pub" element
         */
        void unsetPub();
        
        /**
         * Gets the "data" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data getData();
        
        /**
         * Sets the "data" element
         */
        void setData(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data addNewData();
        
        /**
         * Gets the "consequence" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence getConsequence();
        
        /**
         * True if has "consequence" element
         */
        boolean isSetConsequence();
        
        /**
         * Sets the "consequence" element
         */
        void setConsequence(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence consequence);
        
        /**
         * Appends and returns a new empty "consequence" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence addNewConsequence();
        
        /**
         * Unsets the "consequence" element
         */
        void unsetConsequence();
        
        /**
         * Gets the "location" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location getLocation();
        
        /**
         * True if has "location" element
         */
        boolean isSetLocation();
        
        /**
         * Sets the "location" element
         */
        void setLocation(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location location);
        
        /**
         * Appends and returns a new empty "location" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location addNewLocation();
        
        /**
         * Unsets the "location" element
         */
        void unsetLocation();
        
        /**
         * Gets the "ext-locs" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs getExtLocs();
        
        /**
         * True if has "ext-locs" element
         */
        boolean isSetExtLocs();
        
        /**
         * Sets the "ext-locs" element
         */
        void setExtLocs(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs extLocs);
        
        /**
         * Appends and returns a new empty "ext-locs" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs addNewExtLocs();
        
        /**
         * Unsets the "ext-locs" element
         */
        void unsetExtLocs();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * Gets the "somatic-origin" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin getSomaticOrigin();
        
        /**
         * True if has "somatic-origin" element
         */
        boolean isSetSomaticOrigin();
        
        /**
         * Sets the "somatic-origin" element
         */
        void setSomaticOrigin(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin somaticOrigin);
        
        /**
         * Appends and returns a new empty "somatic-origin" element
         */
        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin addNewSomaticOrigin();
        
        /**
         * Unsets the "somatic-origin" element
         */
        void unsetSomaticOrigin();
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id9081elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML parent-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ParentId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParentId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("parentid21d4elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sample-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SampleId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SampleId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sampleid14d4elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML other-ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface OtherIds extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtherIds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("otherids7db1elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML phenotype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Phenotype extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Phenotype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("phenotypef1deelemtype");
            
            /**
             * Gets array of all "Phenotype" elements
             */
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype[] getPhenotypeArray();
            
            /**
             * Gets ith "Phenotype" element
             */
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype getPhenotypeArray(int i);
            
            /**
             * Returns number of "Phenotype" element
             */
            int sizeOfPhenotypeArray();
            
            /**
             * Sets array of all "Phenotype" element
             */
            void setPhenotypeArray(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype[] phenotypeArray);
            
            /**
             * Sets ith "Phenotype" element
             */
            void setPhenotypeArray(int i, gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype phenotype);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Phenotype" element
             */
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype insertNewPhenotype(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Phenotype" element
             */
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype addNewPhenotype();
            
            /**
             * Removes the ith "Phenotype" element
             */
            void removePhenotype(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML method(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Method extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Method.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("methodeb47elemtype");
            
            /**
             * Gets array of all "E" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E[] getEArray();
            
            /**
             * Gets ith "E" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E getEArray(int i);
            
            /**
             * Returns number of "E" element
             */
            int sizeOfEArray();
            
            /**
             * Sets array of all "E" element
             */
            void setEArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E[] eArray);
            
            /**
             * Sets ith "E" element
             */
            void setEArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E e);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "E" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E insertNewE(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "E" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E addNewE();
            
            /**
             * Removes the ith "E" element
             */
            void removeE(int i);
            
            /**
             * An XML E(@http://www.ncbi.nlm.nih.gov).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Method$E.
             */
            public interface E extends org.apache.xmlbeans.XmlInteger
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(E.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("eef36elemtype");
                
                /**
                 * Gets the "value" attribute
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value.Enum getValue();
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value xgetValue();
                
                /**
                 * True if has "value" attribute
                 */
                boolean isSetValue();
                
                /**
                 * Sets the "value" attribute
                 */
                void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value.Enum value);
                
                /**
                 * Sets (as xml) the "value" attribute
                 */
                void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value value);
                
                /**
                 * Unsets the "value" attribute
                 */
                void unsetValue();
                
                /**
                 * An XML value(@).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Method$E$Value.
                 */
                public interface Value extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value207dattrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum UNKNOWN = Enum.forString("unknown");
                    static final Enum BAC_ACGH = Enum.forString("bac-acgh");
                    static final Enum COMPUTATIONAL = Enum.forString("computational");
                    static final Enum CURATED = Enum.forString("curated");
                    static final Enum DIGITAL_ARRAY = Enum.forString("digital-array");
                    static final Enum EXPRESSION_ARRAY = Enum.forString("expression-array");
                    static final Enum FISH = Enum.forString("fish");
                    static final Enum FLANKING_SEQUENCE = Enum.forString("flanking-sequence");
                    static final Enum MAPH = Enum.forString("maph");
                    static final Enum MCD_ANALYSIS = Enum.forString("mcd-analysis");
                    static final Enum MLPA = Enum.forString("mlpa");
                    static final Enum OEA_ASSEMBLY = Enum.forString("oea-assembly");
                    static final Enum OLIGO_ACGH = Enum.forString("oligo-acgh");
                    static final Enum PAIRED_END = Enum.forString("paired-end");
                    static final Enum PCR = Enum.forString("pcr");
                    static final Enum QPCR = Enum.forString("qpcr");
                    static final Enum READ_DEPTH = Enum.forString("read-depth");
                    static final Enum ROMA = Enum.forString("roma");
                    static final Enum RT_PCR = Enum.forString("rt-pcr");
                    static final Enum SAGE = Enum.forString("sage");
                    static final Enum SEQUENCE_ALIGNMENT = Enum.forString("sequence-alignment");
                    static final Enum SEQUENCING = Enum.forString("sequencing");
                    static final Enum SNP_ARRAY = Enum.forString("snp-array");
                    static final Enum SNP_GENOYTYPING = Enum.forString("snp-genoytyping");
                    static final Enum SOUTHERN = Enum.forString("southern");
                    static final Enum WESTERN = Enum.forString("western");
                    static final Enum OPTICAL_MAPPING = Enum.forString("optical-mapping");
                    static final Enum OTHER = Enum.forString("other");
                    
                    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                    static final int INT_BAC_ACGH = Enum.INT_BAC_ACGH;
                    static final int INT_COMPUTATIONAL = Enum.INT_COMPUTATIONAL;
                    static final int INT_CURATED = Enum.INT_CURATED;
                    static final int INT_DIGITAL_ARRAY = Enum.INT_DIGITAL_ARRAY;
                    static final int INT_EXPRESSION_ARRAY = Enum.INT_EXPRESSION_ARRAY;
                    static final int INT_FISH = Enum.INT_FISH;
                    static final int INT_FLANKING_SEQUENCE = Enum.INT_FLANKING_SEQUENCE;
                    static final int INT_MAPH = Enum.INT_MAPH;
                    static final int INT_MCD_ANALYSIS = Enum.INT_MCD_ANALYSIS;
                    static final int INT_MLPA = Enum.INT_MLPA;
                    static final int INT_OEA_ASSEMBLY = Enum.INT_OEA_ASSEMBLY;
                    static final int INT_OLIGO_ACGH = Enum.INT_OLIGO_ACGH;
                    static final int INT_PAIRED_END = Enum.INT_PAIRED_END;
                    static final int INT_PCR = Enum.INT_PCR;
                    static final int INT_QPCR = Enum.INT_QPCR;
                    static final int INT_READ_DEPTH = Enum.INT_READ_DEPTH;
                    static final int INT_ROMA = Enum.INT_ROMA;
                    static final int INT_RT_PCR = Enum.INT_RT_PCR;
                    static final int INT_SAGE = Enum.INT_SAGE;
                    static final int INT_SEQUENCE_ALIGNMENT = Enum.INT_SEQUENCE_ALIGNMENT;
                    static final int INT_SEQUENCING = Enum.INT_SEQUENCING;
                    static final int INT_SNP_ARRAY = Enum.INT_SNP_ARRAY;
                    static final int INT_SNP_GENOYTYPING = Enum.INT_SNP_GENOYTYPING;
                    static final int INT_SOUTHERN = Enum.INT_SOUTHERN;
                    static final int INT_WESTERN = Enum.INT_WESTERN;
                    static final int INT_OPTICAL_MAPPING = Enum.INT_OPTICAL_MAPPING;
                    static final int INT_OTHER = Enum.INT_OTHER;
                    
                    /**
                     * Enumeration value class for gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Method$E$Value.
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
                      static final int INT_BAC_ACGH = 2;
                      static final int INT_COMPUTATIONAL = 3;
                      static final int INT_CURATED = 4;
                      static final int INT_DIGITAL_ARRAY = 5;
                      static final int INT_EXPRESSION_ARRAY = 6;
                      static final int INT_FISH = 7;
                      static final int INT_FLANKING_SEQUENCE = 8;
                      static final int INT_MAPH = 9;
                      static final int INT_MCD_ANALYSIS = 10;
                      static final int INT_MLPA = 11;
                      static final int INT_OEA_ASSEMBLY = 12;
                      static final int INT_OLIGO_ACGH = 13;
                      static final int INT_PAIRED_END = 14;
                      static final int INT_PCR = 15;
                      static final int INT_QPCR = 16;
                      static final int INT_READ_DEPTH = 17;
                      static final int INT_ROMA = 18;
                      static final int INT_RT_PCR = 19;
                      static final int INT_SAGE = 20;
                      static final int INT_SEQUENCE_ALIGNMENT = 21;
                      static final int INT_SEQUENCING = 22;
                      static final int INT_SNP_ARRAY = 23;
                      static final int INT_SNP_GENOYTYPING = 24;
                      static final int INT_SOUTHERN = 25;
                      static final int INT_WESTERN = 26;
                      static final int INT_OPTICAL_MAPPING = 27;
                      static final int INT_OTHER = 28;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("unknown", INT_UNKNOWN),
                          new Enum("bac-acgh", INT_BAC_ACGH),
                          new Enum("computational", INT_COMPUTATIONAL),
                          new Enum("curated", INT_CURATED),
                          new Enum("digital-array", INT_DIGITAL_ARRAY),
                          new Enum("expression-array", INT_EXPRESSION_ARRAY),
                          new Enum("fish", INT_FISH),
                          new Enum("flanking-sequence", INT_FLANKING_SEQUENCE),
                          new Enum("maph", INT_MAPH),
                          new Enum("mcd-analysis", INT_MCD_ANALYSIS),
                          new Enum("mlpa", INT_MLPA),
                          new Enum("oea-assembly", INT_OEA_ASSEMBLY),
                          new Enum("oligo-acgh", INT_OLIGO_ACGH),
                          new Enum("paired-end", INT_PAIRED_END),
                          new Enum("pcr", INT_PCR),
                          new Enum("qpcr", INT_QPCR),
                          new Enum("read-depth", INT_READ_DEPTH),
                          new Enum("roma", INT_ROMA),
                          new Enum("rt-pcr", INT_RT_PCR),
                          new Enum("sage", INT_SAGE),
                          new Enum("sequence-alignment", INT_SEQUENCE_ALIGNMENT),
                          new Enum("sequencing", INT_SEQUENCING),
                          new Enum("snp-array", INT_SNP_ARRAY),
                          new Enum("snp-genoytyping", INT_SNP_GENOYTYPING),
                          new Enum("southern", INT_SOUTHERN),
                          new Enum("western", INT_WESTERN),
                          new Enum("optical-mapping", INT_OPTICAL_MAPPING),
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
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value newValue(java.lang.Object obj) {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value) type.newValue( obj ); }
                      
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value newInstance() {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML population-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PopulationData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PopulationData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("populationdataeae0elemtype");
            
            /**
             * Gets array of all "Population-data" elements
             */
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData[] getPopulationDataArray();
            
            /**
             * Gets ith "Population-data" element
             */
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData getPopulationDataArray(int i);
            
            /**
             * Returns number of "Population-data" element
             */
            int sizeOfPopulationDataArray();
            
            /**
             * Sets array of all "Population-data" element
             */
            void setPopulationDataArray(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData[] populationDataArray);
            
            /**
             * Sets ith "Population-data" element
             */
            void setPopulationDataArray(int i, gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData populationData);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Population-data" element
             */
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData insertNewPopulationData(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Population-data" element
             */
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData addNewPopulationData();
            
            /**
             * Removes the ith "Population-data" element
             */
            void removePopulationData(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML variant-prop(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface VariantProp extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VariantProp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variantpropad11elemtype");
            
            /**
             * Gets the "VariantProperties" element
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties getVariantProperties();
            
            /**
             * Sets the "VariantProperties" element
             */
            void setVariantProperties(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties variantProperties);
            
            /**
             * Appends and returns a new empty "VariantProperties" element
             */
            gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties addNewVariantProperties();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML validated(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Validated extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Validated.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("validatedaec4elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Validated$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valueb89dattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Validated$Value.
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
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML clinical-test(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ClinicalTest extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalTest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("clinicaltestc2c2elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML allele-origin(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleOrigin.
         */
        public interface AlleleOrigin extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlleleOrigin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("alleleorigindc4celemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleOrigin$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value51a5attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum GERMLINE = Enum.forString("germline");
                static final Enum SOMATIC = Enum.forString("somatic");
                static final Enum INHERITED = Enum.forString("inherited");
                static final Enum PATERNAL = Enum.forString("paternal");
                static final Enum MATERNAL = Enum.forString("maternal");
                static final Enum DE_NOVO = Enum.forString("de-novo");
                static final Enum BIPARENTAL = Enum.forString("biparental");
                static final Enum UNIPARENTAL = Enum.forString("uniparental");
                static final Enum NOT_TESTED = Enum.forString("not-tested");
                static final Enum TESTED_INCONCLUSIVE = Enum.forString("tested-inconclusive");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_GERMLINE = Enum.INT_GERMLINE;
                static final int INT_SOMATIC = Enum.INT_SOMATIC;
                static final int INT_INHERITED = Enum.INT_INHERITED;
                static final int INT_PATERNAL = Enum.INT_PATERNAL;
                static final int INT_MATERNAL = Enum.INT_MATERNAL;
                static final int INT_DE_NOVO = Enum.INT_DE_NOVO;
                static final int INT_BIPARENTAL = Enum.INT_BIPARENTAL;
                static final int INT_UNIPARENTAL = Enum.INT_UNIPARENTAL;
                static final int INT_NOT_TESTED = Enum.INT_NOT_TESTED;
                static final int INT_TESTED_INCONCLUSIVE = Enum.INT_TESTED_INCONCLUSIVE;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleOrigin$Value.
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
                    static final int INT_GERMLINE = 2;
                    static final int INT_SOMATIC = 3;
                    static final int INT_INHERITED = 4;
                    static final int INT_PATERNAL = 5;
                    static final int INT_MATERNAL = 6;
                    static final int INT_DE_NOVO = 7;
                    static final int INT_BIPARENTAL = 8;
                    static final int INT_UNIPARENTAL = 9;
                    static final int INT_NOT_TESTED = 10;
                    static final int INT_TESTED_INCONCLUSIVE = 11;
                    static final int INT_OTHER = 12;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("germline", INT_GERMLINE),
                        new Enum("somatic", INT_SOMATIC),
                        new Enum("inherited", INT_INHERITED),
                        new Enum("paternal", INT_PATERNAL),
                        new Enum("maternal", INT_MATERNAL),
                        new Enum("de-novo", INT_DE_NOVO),
                        new Enum("biparental", INT_BIPARENTAL),
                        new Enum("uniparental", INT_UNIPARENTAL),
                        new Enum("not-tested", INT_NOT_TESTED),
                        new Enum("tested-inconclusive", INT_TESTED_INCONCLUSIVE),
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
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML allele-state(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleState.
         */
        public interface AlleleState extends org.apache.xmlbeans.XmlInteger
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlleleState.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("allelestate2687elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleState$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value220eattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum UNKNOWN = Enum.forString("unknown");
                static final Enum HOMOZYGOUS = Enum.forString("homozygous");
                static final Enum HETEROZYGOUS = Enum.forString("heterozygous");
                static final Enum HEMIZYGOUS = Enum.forString("hemizygous");
                static final Enum NULLIZYGOUS = Enum.forString("nullizygous");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_HOMOZYGOUS = Enum.INT_HOMOZYGOUS;
                static final int INT_HETEROZYGOUS = Enum.INT_HETEROZYGOUS;
                static final int INT_HEMIZYGOUS = Enum.INT_HEMIZYGOUS;
                static final int INT_NULLIZYGOUS = Enum.INT_NULLIZYGOUS;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleState$Value.
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
                    static final int INT_HOMOZYGOUS = 2;
                    static final int INT_HETEROZYGOUS = 3;
                    static final int INT_HEMIZYGOUS = 4;
                    static final int INT_NULLIZYGOUS = 5;
                    static final int INT_OTHER = 6;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("unknown", INT_UNKNOWN),
                        new Enum("homozygous", INT_HOMOZYGOUS),
                        new Enum("heterozygous", INT_HETEROZYGOUS),
                        new Enum("hemizygous", INT_HEMIZYGOUS),
                        new Enum("nullizygous", INT_NULLIZYGOUS),
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
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML is-ancestral-allele(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface IsAncestralAllele extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsAncestralAllele.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("isancestralallele40f6elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$IsAncestralAllele$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value8f8fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$IsAncestralAllele$Value.
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
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pub1d33elemtype");
            
            /**
             * Gets the "Pub" element
             */
            gov.nih.nlm.ncbi.www.PubDocument.Pub getPub();
            
            /**
             * Sets the "Pub" element
             */
            void setPub(gov.nih.nlm.ncbi.www.PubDocument.Pub pub);
            
            /**
             * Appends and returns a new empty "Pub" element
             */
            gov.nih.nlm.ncbi.www.PubDocument.Pub addNewPub();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("datad490elemtype");
            
            /**
             * Gets the "unknown" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown getUnknown();
            
            /**
             * True if has "unknown" element
             */
            boolean isSetUnknown();
            
            /**
             * Sets the "unknown" element
             */
            void setUnknown(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown unknown);
            
            /**
             * Appends and returns a new empty "unknown" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown addNewUnknown();
            
            /**
             * Unsets the "unknown" element
             */
            void unsetUnknown();
            
            /**
             * Gets the "note" element
             */
            java.lang.String getNote();
            
            /**
             * Gets (as xml) the "note" element
             */
            org.apache.xmlbeans.XmlString xgetNote();
            
            /**
             * True if has "note" element
             */
            boolean isSetNote();
            
            /**
             * Sets the "note" element
             */
            void setNote(java.lang.String note);
            
            /**
             * Sets (as xml) the "note" element
             */
            void xsetNote(org.apache.xmlbeans.XmlString note);
            
            /**
             * Unsets the "note" element
             */
            void unsetNote();
            
            /**
             * Gets the "uniparental-disomy" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy getUniparentalDisomy();
            
            /**
             * True if has "uniparental-disomy" element
             */
            boolean isSetUniparentalDisomy();
            
            /**
             * Sets the "uniparental-disomy" element
             */
            void setUniparentalDisomy(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy uniparentalDisomy);
            
            /**
             * Appends and returns a new empty "uniparental-disomy" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy addNewUniparentalDisomy();
            
            /**
             * Unsets the "uniparental-disomy" element
             */
            void unsetUniparentalDisomy();
            
            /**
             * Gets the "instance" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance getInstance();
            
            /**
             * True if has "instance" element
             */
            boolean isSetInstance();
            
            /**
             * Sets the "instance" element
             */
            void setInstance(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance instance);
            
            /**
             * Appends and returns a new empty "instance" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance addNewInstance();
            
            /**
             * Unsets the "instance" element
             */
            void unsetInstance();
            
            /**
             * Gets the "set" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set getSet();
            
            /**
             * True if has "set" element
             */
            boolean isSetSet();
            
            /**
             * Sets the "set" element
             */
            void setSet(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set set);
            
            /**
             * Appends and returns a new empty "set" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set addNewSet();
            
            /**
             * Unsets the "set" element
             */
            void unsetSet();
            
            /**
             * Gets the "complex" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex getComplex();
            
            /**
             * True if has "complex" element
             */
            boolean isSetComplex();
            
            /**
             * Sets the "complex" element
             */
            void setComplex(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex complex);
            
            /**
             * Appends and returns a new empty "complex" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex addNewComplex();
            
            /**
             * Unsets the "complex" element
             */
            void unsetComplex();
            
            /**
             * An XML unknown(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Unknown extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Unknown.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("unknownf81aelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML uniparental-disomy(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface UniparentalDisomy extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UniparentalDisomy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("uniparentaldisomy7dbfelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML instance(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Instance extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Instance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("instance7dbfelemtype");
                
                /**
                 * Gets the "Variation-inst" element
                 */
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst getVariationInst();
                
                /**
                 * Sets the "Variation-inst" element
                 */
                void setVariationInst(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst variationInst);
                
                /**
                 * Appends and returns a new empty "Variation-inst" element
                 */
                gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst addNewVariationInst();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML set(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Set extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Set.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("set9d02elemtype");
                
                /**
                 * Gets the "type" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type getType();
                
                /**
                 * Sets the "type" element
                 */
                void setType(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type type);
                
                /**
                 * Appends and returns a new empty "type" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type addNewType();
                
                /**
                 * Gets the "variations" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations getVariations();
                
                /**
                 * Sets the "variations" element
                 */
                void setVariations(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations variations);
                
                /**
                 * Appends and returns a new empty "variations" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations addNewVariations();
                
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
                 * An XML type(@http://www.ncbi.nlm.nih.gov).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Data$Set$Type.
                 */
                public interface Type extends org.apache.xmlbeans.XmlInteger
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("typeb1ecelemtype");
                    
                    /**
                     * Gets the "value" attribute
                     */
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value.Enum getValue();
                    
                    /**
                     * Gets (as xml) the "value" attribute
                     */
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value xgetValue();
                    
                    /**
                     * True if has "value" attribute
                     */
                    boolean isSetValue();
                    
                    /**
                     * Sets the "value" attribute
                     */
                    void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value.Enum value);
                    
                    /**
                     * Sets (as xml) the "value" attribute
                     */
                    void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value value);
                    
                    /**
                     * Unsets the "value" attribute
                     */
                    void unsetValue();
                    
                    /**
                     * An XML value(@).
                     *
                     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Data$Set$Type$Value.
                     */
                    public interface Value extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valued2c5attrtype");
                      
                      org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                      void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                      
                      static final Enum UNKNOWN = Enum.forString("unknown");
                      static final Enum COMPOUND = Enum.forString("compound");
                      static final Enum PRODUCTS = Enum.forString("products");
                      static final Enum HAPLOTYPE = Enum.forString("haplotype");
                      static final Enum GENOTYPE = Enum.forString("genotype");
                      static final Enum MOSAIC = Enum.forString("mosaic");
                      static final Enum INDIVIDUAL = Enum.forString("individual");
                      static final Enum POPULATION = Enum.forString("population");
                      static final Enum ALLELES = Enum.forString("alleles");
                      static final Enum PACKAGE = Enum.forString("package");
                      static final Enum OTHER = Enum.forString("other");
                      
                      static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                      static final int INT_COMPOUND = Enum.INT_COMPOUND;
                      static final int INT_PRODUCTS = Enum.INT_PRODUCTS;
                      static final int INT_HAPLOTYPE = Enum.INT_HAPLOTYPE;
                      static final int INT_GENOTYPE = Enum.INT_GENOTYPE;
                      static final int INT_MOSAIC = Enum.INT_MOSAIC;
                      static final int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
                      static final int INT_POPULATION = Enum.INT_POPULATION;
                      static final int INT_ALLELES = Enum.INT_ALLELES;
                      static final int INT_PACKAGE = Enum.INT_PACKAGE;
                      static final int INT_OTHER = Enum.INT_OTHER;
                      
                      /**
                       * Enumeration value class for gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Data$Set$Type$Value.
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
                        static final int INT_COMPOUND = 2;
                        static final int INT_PRODUCTS = 3;
                        static final int INT_HAPLOTYPE = 4;
                        static final int INT_GENOTYPE = 5;
                        static final int INT_MOSAIC = 6;
                        static final int INT_INDIVIDUAL = 7;
                        static final int INT_POPULATION = 8;
                        static final int INT_ALLELES = 9;
                        static final int INT_PACKAGE = 10;
                        static final int INT_OTHER = 11;
                        
                        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                            new org.apache.xmlbeans.StringEnumAbstractBase.Table
                        (
                          new Enum[]
                          {
                            new Enum("unknown", INT_UNKNOWN),
                            new Enum("compound", INT_COMPOUND),
                            new Enum("products", INT_PRODUCTS),
                            new Enum("haplotype", INT_HAPLOTYPE),
                            new Enum("genotype", INT_GENOTYPE),
                            new Enum("mosaic", INT_MOSAIC),
                            new Enum("individual", INT_INDIVIDUAL),
                            new Enum("population", INT_POPULATION),
                            new Enum("alleles", INT_ALLELES),
                            new Enum("package", INT_PACKAGE),
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
                        public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value newValue(java.lang.Object obj) {
                          return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value) type.newValue( obj ); }
                        
                        public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value newInstance() {
                          return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type newInstance() {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML variations(@http://www.ncbi.nlm.nih.gov).
                 *
                 * This is a complex type.
                 */
                public interface Variations extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Variations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variationsb926elemtype");
                    
                    /**
                     * Gets array of all "Variation-ref" elements
                     */
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef[] getVariationRefArray();
                    
                    /**
                     * Gets ith "Variation-ref" element
                     */
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRefArray(int i);
                    
                    /**
                     * Returns number of "Variation-ref" element
                     */
                    int sizeOfVariationRefArray();
                    
                    /**
                     * Sets array of all "Variation-ref" element
                     */
                    void setVariationRefArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef[] variationRefArray);
                    
                    /**
                     * Sets ith "Variation-ref" element
                     */
                    void setVariationRefArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Variation-ref" element
                     */
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef insertNewVariationRef(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Variation-ref" element
                     */
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef();
                    
                    /**
                     * Removes the ith "Variation-ref" element
                     */
                    void removeVariationRef(int i);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations newInstance() {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML complex(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Complex extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Complex.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("complexcdf4elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML consequence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Consequence extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Consequence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("consequencebc79elemtype");
            
            /**
             * Gets array of all "unknown" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown[] getUnknownArray();
            
            /**
             * Gets ith "unknown" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown getUnknownArray(int i);
            
            /**
             * Returns number of "unknown" element
             */
            int sizeOfUnknownArray();
            
            /**
             * Sets array of all "unknown" element
             */
            void setUnknownArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown[] unknownArray);
            
            /**
             * Sets ith "unknown" element
             */
            void setUnknownArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown unknown);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "unknown" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown insertNewUnknown(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "unknown" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown addNewUnknown();
            
            /**
             * Removes the ith "unknown" element
             */
            void removeUnknown(int i);
            
            /**
             * Gets array of all "splicing" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing[] getSplicingArray();
            
            /**
             * Gets ith "splicing" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing getSplicingArray(int i);
            
            /**
             * Returns number of "splicing" element
             */
            int sizeOfSplicingArray();
            
            /**
             * Sets array of all "splicing" element
             */
            void setSplicingArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing[] splicingArray);
            
            /**
             * Sets ith "splicing" element
             */
            void setSplicingArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing splicing);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "splicing" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing insertNewSplicing(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "splicing" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing addNewSplicing();
            
            /**
             * Removes the ith "splicing" element
             */
            void removeSplicing(int i);
            
            /**
             * Gets array of all "note" elements
             */
            java.lang.String[] getNoteArray();
            
            /**
             * Gets ith "note" element
             */
            java.lang.String getNoteArray(int i);
            
            /**
             * Gets (as xml) array of all "note" elements
             */
            org.apache.xmlbeans.XmlString[] xgetNoteArray();
            
            /**
             * Gets (as xml) ith "note" element
             */
            org.apache.xmlbeans.XmlString xgetNoteArray(int i);
            
            /**
             * Returns number of "note" element
             */
            int sizeOfNoteArray();
            
            /**
             * Sets array of all "note" element
             */
            void setNoteArray(java.lang.String[] noteArray);
            
            /**
             * Sets ith "note" element
             */
            void setNoteArray(int i, java.lang.String note);
            
            /**
             * Sets (as xml) array of all "note" element
             */
            void xsetNoteArray(org.apache.xmlbeans.XmlString[] noteArray);
            
            /**
             * Sets (as xml) ith "note" element
             */
            void xsetNoteArray(int i, org.apache.xmlbeans.XmlString note);
            
            /**
             * Inserts the value as the ith "note" element
             */
            void insertNote(int i, java.lang.String note);
            
            /**
             * Appends the value as the last "note" element
             */
            void addNote(java.lang.String note);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "note" element
             */
            org.apache.xmlbeans.XmlString insertNewNote(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "note" element
             */
            org.apache.xmlbeans.XmlString addNewNote();
            
            /**
             * Removes the ith "note" element
             */
            void removeNote(int i);
            
            /**
             * Gets array of all "variation" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation[] getVariationArray();
            
            /**
             * Gets ith "variation" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation getVariationArray(int i);
            
            /**
             * Returns number of "variation" element
             */
            int sizeOfVariationArray();
            
            /**
             * Sets array of all "variation" element
             */
            void setVariationArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation[] variationArray);
            
            /**
             * Sets ith "variation" element
             */
            void setVariationArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation variation);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "variation" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation insertNewVariation(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "variation" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation addNewVariation();
            
            /**
             * Removes the ith "variation" element
             */
            void removeVariation(int i);
            
            /**
             * Gets array of all "frameshift" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift[] getFrameshiftArray();
            
            /**
             * Gets ith "frameshift" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift getFrameshiftArray(int i);
            
            /**
             * Returns number of "frameshift" element
             */
            int sizeOfFrameshiftArray();
            
            /**
             * Sets array of all "frameshift" element
             */
            void setFrameshiftArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift[] frameshiftArray);
            
            /**
             * Sets ith "frameshift" element
             */
            void setFrameshiftArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift frameshift);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "frameshift" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift insertNewFrameshift(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "frameshift" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift addNewFrameshift();
            
            /**
             * Removes the ith "frameshift" element
             */
            void removeFrameshift(int i);
            
            /**
             * Gets array of all "loss-of-heterozygosity" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity[] getLossOfHeterozygosityArray();
            
            /**
             * Gets ith "loss-of-heterozygosity" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity getLossOfHeterozygosityArray(int i);
            
            /**
             * Returns number of "loss-of-heterozygosity" element
             */
            int sizeOfLossOfHeterozygosityArray();
            
            /**
             * Sets array of all "loss-of-heterozygosity" element
             */
            void setLossOfHeterozygosityArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity[] lossOfHeterozygosityArray);
            
            /**
             * Sets ith "loss-of-heterozygosity" element
             */
            void setLossOfHeterozygosityArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity lossOfHeterozygosity);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "loss-of-heterozygosity" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity insertNewLossOfHeterozygosity(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "loss-of-heterozygosity" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity addNewLossOfHeterozygosity();
            
            /**
             * Removes the ith "loss-of-heterozygosity" element
             */
            void removeLossOfHeterozygosity(int i);
            
            /**
             * An XML unknown(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Unknown extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Unknown.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("unknown69afelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML splicing(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Splicing extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Splicing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicingf30eelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML variation(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Variation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Variation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variationb638elemtype");
                
                /**
                 * Gets the "Variation-ref" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRef();
                
                /**
                 * Sets the "Variation-ref" element
                 */
                void setVariationRef(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef);
                
                /**
                 * Appends and returns a new empty "Variation-ref" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML frameshift(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Frameshift extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Frameshift.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("frameshift2d0aelemtype");
                
                /**
                 * Gets the "phase" element
                 */
                java.math.BigInteger getPhase();
                
                /**
                 * Gets (as xml) the "phase" element
                 */
                org.apache.xmlbeans.XmlInteger xgetPhase();
                
                /**
                 * True if has "phase" element
                 */
                boolean isSetPhase();
                
                /**
                 * Sets the "phase" element
                 */
                void setPhase(java.math.BigInteger phase);
                
                /**
                 * Sets (as xml) the "phase" element
                 */
                void xsetPhase(org.apache.xmlbeans.XmlInteger phase);
                
                /**
                 * Unsets the "phase" element
                 */
                void unsetPhase();
                
                /**
                 * Gets the "x-length" element
                 */
                java.math.BigInteger getXLength();
                
                /**
                 * Gets (as xml) the "x-length" element
                 */
                org.apache.xmlbeans.XmlInteger xgetXLength();
                
                /**
                 * True if has "x-length" element
                 */
                boolean isSetXLength();
                
                /**
                 * Sets the "x-length" element
                 */
                void setXLength(java.math.BigInteger xLength);
                
                /**
                 * Sets (as xml) the "x-length" element
                 */
                void xsetXLength(org.apache.xmlbeans.XmlInteger xLength);
                
                /**
                 * Unsets the "x-length" element
                 */
                void unsetXLength();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML loss-of-heterozygosity(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface LossOfHeterozygosity extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LossOfHeterozygosity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("lossofheterozygosity3b8eelemtype");
                
                /**
                 * Gets the "reference" element
                 */
                java.lang.String getReference();
                
                /**
                 * Gets (as xml) the "reference" element
                 */
                org.apache.xmlbeans.XmlString xgetReference();
                
                /**
                 * True if has "reference" element
                 */
                boolean isSetReference();
                
                /**
                 * Sets the "reference" element
                 */
                void setReference(java.lang.String reference);
                
                /**
                 * Sets (as xml) the "reference" element
                 */
                void xsetReference(org.apache.xmlbeans.XmlString reference);
                
                /**
                 * Unsets the "reference" element
                 */
                void unsetReference();
                
                /**
                 * Gets the "test" element
                 */
                java.lang.String getTest();
                
                /**
                 * Gets (as xml) the "test" element
                 */
                org.apache.xmlbeans.XmlString xgetTest();
                
                /**
                 * True if has "test" element
                 */
                boolean isSetTest();
                
                /**
                 * Sets the "test" element
                 */
                void setTest(java.lang.String test);
                
                /**
                 * Sets (as xml) the "test" element
                 */
                void xsetTest(org.apache.xmlbeans.XmlString test);
                
                /**
                 * Unsets the "test" element
                 */
                void unsetTest();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Location.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("location5e1belemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ext-locs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ExtLocs extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtLocs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("extlocs5cc5elemtype");
            
            /**
             * Gets array of all "Ext-loc" elements
             */
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc[] getExtLocArray();
            
            /**
             * Gets ith "Ext-loc" element
             */
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc getExtLocArray(int i);
            
            /**
             * Returns number of "Ext-loc" element
             */
            int sizeOfExtLocArray();
            
            /**
             * Sets array of all "Ext-loc" element
             */
            void setExtLocArray(gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc[] extLocArray);
            
            /**
             * Sets ith "Ext-loc" element
             */
            void setExtLocArray(int i, gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc extLoc);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Ext-loc" element
             */
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc insertNewExtLoc(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Ext-loc" element
             */
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc addNewExtLoc();
            
            /**
             * Removes the ith "Ext-loc" element
             */
            void removeExtLoc(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ext0657elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML somatic-origin(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SomaticOrigin extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SomaticOrigin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("somaticoriginf29belemtype");
            
            /**
             * Gets array of all "source" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source[] getSourceArray();
            
            /**
             * Gets ith "source" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source getSourceArray(int i);
            
            /**
             * Returns number of "source" element
             */
            int sizeOfSourceArray();
            
            /**
             * Sets array of all "source" element
             */
            void setSourceArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source[] sourceArray);
            
            /**
             * Sets ith "source" element
             */
            void setSourceArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source source);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "source" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source insertNewSource(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "source" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source addNewSource();
            
            /**
             * Removes the ith "source" element
             */
            void removeSource(int i);
            
            /**
             * Gets array of all "condition" elements
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition[] getConditionArray();
            
            /**
             * Gets ith "condition" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition getConditionArray(int i);
            
            /**
             * Returns number of "condition" element
             */
            int sizeOfConditionArray();
            
            /**
             * Sets array of all "condition" element
             */
            void setConditionArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition[] conditionArray);
            
            /**
             * Sets ith "condition" element
             */
            void setConditionArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition condition);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "condition" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition insertNewCondition(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "condition" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition addNewCondition();
            
            /**
             * Removes the ith "condition" element
             */
            void removeCondition(int i);
            
            /**
             * An XML source(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Source extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("source6d44elemtype");
                
                /**
                 * Gets the "SubSource" element
                 */
                gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource getSubSource();
                
                /**
                 * Sets the "SubSource" element
                 */
                void setSubSource(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource subSource);
                
                /**
                 * Appends and returns a new empty "SubSource" element
                 */
                gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource addNewSubSource();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML condition(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public interface Condition extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Condition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("conditionce74elemtype");
                
                /**
                 * Gets the "description" element
                 */
                java.lang.String getDescription();
                
                /**
                 * Gets (as xml) the "description" element
                 */
                org.apache.xmlbeans.XmlString xgetDescription();
                
                /**
                 * True if has "description" element
                 */
                boolean isSetDescription();
                
                /**
                 * Sets the "description" element
                 */
                void setDescription(java.lang.String description);
                
                /**
                 * Sets (as xml) the "description" element
                 */
                void xsetDescription(org.apache.xmlbeans.XmlString description);
                
                /**
                 * Unsets the "description" element
                 */
                void unsetDescription();
                
                /**
                 * Gets the "object-id" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId getObjectId();
                
                /**
                 * True if has "object-id" element
                 */
                boolean isSetObjectId();
                
                /**
                 * Sets the "object-id" element
                 */
                void setObjectId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId objectId);
                
                /**
                 * Appends and returns a new empty "object-id" element
                 */
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId addNewObjectId();
                
                /**
                 * Unsets the "object-id" element
                 */
                void unsetObjectId();
                
                /**
                 * An XML object-id(@http://www.ncbi.nlm.nih.gov).
                 *
                 * This is a complex type.
                 */
                public interface ObjectId extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("objectid273felemtype");
                    
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
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId newInstance() {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition newInstance() {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin newInstance() {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef newInstance() {
              return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.VariationRefDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.VariationRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.VariationRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
