/*
 * An XML document type.
 * Localname: Variation-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.VariationRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Variation-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class VariationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument
{
    
    public VariationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Variation-ref");
    
    
    /**
     * Gets the "Variation-ref" element
     */
    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
            target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().find_element_user(VARIATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Variation-ref" element
     */
    public void setVariationRef(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
            target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().find_element_user(VARIATIONREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().add_element_user(VARIATIONREF$0);
            }
            target.set(variationRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Variation-ref" element
     */
    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
            target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().add_element_user(VARIATIONREF$0);
            return target;
        }
    }
    /**
     * An XML Variation-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class VariationRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef
    {
        
        public VariationRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName PARENTID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "parent-id");
        private static final javax.xml.namespace.QName SAMPLEID$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sample-id");
        private static final javax.xml.namespace.QName OTHERIDS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "other-ids");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName SYNONYMS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "synonyms");
        private static final javax.xml.namespace.QName DESCRIPTION$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "description");
        private static final javax.xml.namespace.QName PHENOTYPE$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "phenotype");
        private static final javax.xml.namespace.QName METHOD$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "method");
        private static final javax.xml.namespace.QName POPULATIONDATA$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "population-data");
        private static final javax.xml.namespace.QName VARIANTPROP$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "variant-prop");
        private static final javax.xml.namespace.QName VALIDATED$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "validated");
        private static final javax.xml.namespace.QName CLINICALTEST$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "clinical-test");
        private static final javax.xml.namespace.QName ALLELEORIGIN$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "allele-origin");
        private static final javax.xml.namespace.QName ALLELESTATE$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "allele-state");
        private static final javax.xml.namespace.QName ALLELEFREQUENCY$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "allele-frequency");
        private static final javax.xml.namespace.QName ISANCESTRALALLELE$32 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "is-ancestral-allele");
        private static final javax.xml.namespace.QName PUB$34 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName DATA$36 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        private static final javax.xml.namespace.QName CONSEQUENCE$38 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "consequence");
        private static final javax.xml.namespace.QName LOCATION$40 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "location");
        private static final javax.xml.namespace.QName EXTLOCS$42 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext-locs");
        private static final javax.xml.namespace.QName EXT$44 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        private static final javax.xml.namespace.QName SOMATICORIGIN$46 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "somatic-origin");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$0) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$0, 0);
            }
        }
        
        /**
         * Gets the "parent-id" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId getParentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId)get_store().find_element_user(PARENTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "parent-id" element
         */
        public boolean isSetParentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARENTID$2) != 0;
            }
        }
        
        /**
         * Sets the "parent-id" element
         */
        public void setParentId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId parentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId)get_store().find_element_user(PARENTID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId)get_store().add_element_user(PARENTID$2);
                }
                target.set(parentId);
            }
        }
        
        /**
         * Appends and returns a new empty "parent-id" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId addNewParentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId)get_store().add_element_user(PARENTID$2);
                return target;
            }
        }
        
        /**
         * Unsets the "parent-id" element
         */
        public void unsetParentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARENTID$2, 0);
            }
        }
        
        /**
         * Gets the "sample-id" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId getSampleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId)get_store().find_element_user(SAMPLEID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sample-id" element
         */
        public boolean isSetSampleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SAMPLEID$4) != 0;
            }
        }
        
        /**
         * Sets the "sample-id" element
         */
        public void setSampleId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId sampleId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId)get_store().find_element_user(SAMPLEID$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId)get_store().add_element_user(SAMPLEID$4);
                }
                target.set(sampleId);
            }
        }
        
        /**
         * Appends and returns a new empty "sample-id" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId addNewSampleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId)get_store().add_element_user(SAMPLEID$4);
                return target;
            }
        }
        
        /**
         * Unsets the "sample-id" element
         */
        public void unsetSampleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SAMPLEID$4, 0);
            }
        }
        
        /**
         * Gets the "other-ids" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds getOtherIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds)get_store().find_element_user(OTHERIDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "other-ids" element
         */
        public boolean isSetOtherIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHERIDS$6) != 0;
            }
        }
        
        /**
         * Sets the "other-ids" element
         */
        public void setOtherIds(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds otherIds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds)get_store().find_element_user(OTHERIDS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds)get_store().add_element_user(OTHERIDS$6);
                }
                target.set(otherIds);
            }
        }
        
        /**
         * Appends and returns a new empty "other-ids" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds addNewOtherIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds)get_store().add_element_user(OTHERIDS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "other-ids" element
         */
        public void unsetOtherIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHERIDS$6, 0);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$8) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$8);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$8, 0);
            }
        }
        
        /**
         * Gets array of all "synonyms" elements
         */
        public java.lang.String[] getSynonymsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SYNONYMS$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "synonyms" element
         */
        public java.lang.String getSynonymsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNONYMS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "synonyms" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetSynonymsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SYNONYMS$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "synonyms" element
         */
        public org.apache.xmlbeans.XmlString xgetSynonymsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNONYMS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "synonyms" element
         */
        public int sizeOfSynonymsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYNONYMS$10);
            }
        }
        
        /**
         * Sets array of all "synonyms" element
         */
        public void setSynonymsArray(java.lang.String[] synonymsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(synonymsArray, SYNONYMS$10);
            }
        }
        
        /**
         * Sets ith "synonyms" element
         */
        public void setSynonymsArray(int i, java.lang.String synonyms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNONYMS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(synonyms);
            }
        }
        
        /**
         * Sets (as xml) array of all "synonyms" element
         */
        public void xsetSynonymsArray(org.apache.xmlbeans.XmlString[]synonymsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(synonymsArray, SYNONYMS$10);
            }
        }
        
        /**
         * Sets (as xml) ith "synonyms" element
         */
        public void xsetSynonymsArray(int i, org.apache.xmlbeans.XmlString synonyms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNONYMS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(synonyms);
            }
        }
        
        /**
         * Inserts the value as the ith "synonyms" element
         */
        public void insertSynonyms(int i, java.lang.String synonyms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYNONYMS$10, i);
                target.setStringValue(synonyms);
            }
        }
        
        /**
         * Appends the value as the last "synonyms" element
         */
        public void addSynonyms(java.lang.String synonyms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNONYMS$10);
                target.setStringValue(synonyms);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "synonyms" element
         */
        public org.apache.xmlbeans.XmlString insertNewSynonyms(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SYNONYMS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "synonyms" element
         */
        public org.apache.xmlbeans.XmlString addNewSynonyms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYNONYMS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "synonyms" element
         */
        public void removeSynonyms(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYNONYMS$10, i);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$12) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$12);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$12);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$12, 0);
            }
        }
        
        /**
         * Gets the "phenotype" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype getPhenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype)get_store().find_element_user(PHENOTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "phenotype" element
         */
        public boolean isSetPhenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHENOTYPE$14) != 0;
            }
        }
        
        /**
         * Sets the "phenotype" element
         */
        public void setPhenotype(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype phenotype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype)get_store().find_element_user(PHENOTYPE$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype)get_store().add_element_user(PHENOTYPE$14);
                }
                target.set(phenotype);
            }
        }
        
        /**
         * Appends and returns a new empty "phenotype" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype addNewPhenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype)get_store().add_element_user(PHENOTYPE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "phenotype" element
         */
        public void unsetPhenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHENOTYPE$14, 0);
            }
        }
        
        /**
         * Gets the "method" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method getMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method)get_store().find_element_user(METHOD$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "method" element
         */
        public boolean isSetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METHOD$16) != 0;
            }
        }
        
        /**
         * Sets the "method" element
         */
        public void setMethod(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method)get_store().find_element_user(METHOD$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method)get_store().add_element_user(METHOD$16);
                }
                target.set(method);
            }
        }
        
        /**
         * Appends and returns a new empty "method" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method addNewMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method)get_store().add_element_user(METHOD$16);
                return target;
            }
        }
        
        /**
         * Unsets the "method" element
         */
        public void unsetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METHOD$16, 0);
            }
        }
        
        /**
         * Gets the "population-data" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData getPopulationData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData)get_store().find_element_user(POPULATIONDATA$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "population-data" element
         */
        public boolean isSetPopulationData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POPULATIONDATA$18) != 0;
            }
        }
        
        /**
         * Sets the "population-data" element
         */
        public void setPopulationData(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData populationData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData)get_store().find_element_user(POPULATIONDATA$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData)get_store().add_element_user(POPULATIONDATA$18);
                }
                target.set(populationData);
            }
        }
        
        /**
         * Appends and returns a new empty "population-data" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData addNewPopulationData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData)get_store().add_element_user(POPULATIONDATA$18);
                return target;
            }
        }
        
        /**
         * Unsets the "population-data" element
         */
        public void unsetPopulationData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POPULATIONDATA$18, 0);
            }
        }
        
        /**
         * Gets the "variant-prop" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp getVariantProp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp)get_store().find_element_user(VARIANTPROP$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "variant-prop" element
         */
        public boolean isSetVariantProp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VARIANTPROP$20) != 0;
            }
        }
        
        /**
         * Sets the "variant-prop" element
         */
        public void setVariantProp(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp variantProp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp)get_store().find_element_user(VARIANTPROP$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp)get_store().add_element_user(VARIANTPROP$20);
                }
                target.set(variantProp);
            }
        }
        
        /**
         * Appends and returns a new empty "variant-prop" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp addNewVariantProp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp)get_store().add_element_user(VARIANTPROP$20);
                return target;
            }
        }
        
        /**
         * Unsets the "variant-prop" element
         */
        public void unsetVariantProp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VARIANTPROP$20, 0);
            }
        }
        
        /**
         * Gets the "validated" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated getValidated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated)get_store().find_element_user(VALIDATED$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "validated" element
         */
        public boolean isSetValidated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATED$22) != 0;
            }
        }
        
        /**
         * Sets the "validated" element
         */
        public void setValidated(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated validated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated)get_store().find_element_user(VALIDATED$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated)get_store().add_element_user(VALIDATED$22);
                }
                target.set(validated);
            }
        }
        
        /**
         * Appends and returns a new empty "validated" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated addNewValidated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated)get_store().add_element_user(VALIDATED$22);
                return target;
            }
        }
        
        /**
         * Unsets the "validated" element
         */
        public void unsetValidated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATED$22, 0);
            }
        }
        
        /**
         * Gets the "clinical-test" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest getClinicalTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest)get_store().find_element_user(CLINICALTEST$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "clinical-test" element
         */
        public boolean isSetClinicalTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLINICALTEST$24) != 0;
            }
        }
        
        /**
         * Sets the "clinical-test" element
         */
        public void setClinicalTest(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest clinicalTest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest)get_store().find_element_user(CLINICALTEST$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest)get_store().add_element_user(CLINICALTEST$24);
                }
                target.set(clinicalTest);
            }
        }
        
        /**
         * Appends and returns a new empty "clinical-test" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest addNewClinicalTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest)get_store().add_element_user(CLINICALTEST$24);
                return target;
            }
        }
        
        /**
         * Unsets the "clinical-test" element
         */
        public void unsetClinicalTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLINICALTEST$24, 0);
            }
        }
        
        /**
         * Gets the "allele-origin" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin getAlleleOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin)get_store().find_element_user(ALLELEORIGIN$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "allele-origin" element
         */
        public boolean isSetAlleleOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLELEORIGIN$26) != 0;
            }
        }
        
        /**
         * Sets the "allele-origin" element
         */
        public void setAlleleOrigin(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin alleleOrigin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin)get_store().find_element_user(ALLELEORIGIN$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin)get_store().add_element_user(ALLELEORIGIN$26);
                }
                target.set(alleleOrigin);
            }
        }
        
        /**
         * Appends and returns a new empty "allele-origin" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin addNewAlleleOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin)get_store().add_element_user(ALLELEORIGIN$26);
                return target;
            }
        }
        
        /**
         * Unsets the "allele-origin" element
         */
        public void unsetAlleleOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLELEORIGIN$26, 0);
            }
        }
        
        /**
         * Gets the "allele-state" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState getAlleleState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState)get_store().find_element_user(ALLELESTATE$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "allele-state" element
         */
        public boolean isSetAlleleState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLELESTATE$28) != 0;
            }
        }
        
        /**
         * Sets the "allele-state" element
         */
        public void setAlleleState(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState alleleState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState)get_store().find_element_user(ALLELESTATE$28, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState)get_store().add_element_user(ALLELESTATE$28);
                }
                target.set(alleleState);
            }
        }
        
        /**
         * Appends and returns a new empty "allele-state" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState addNewAlleleState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState)get_store().add_element_user(ALLELESTATE$28);
                return target;
            }
        }
        
        /**
         * Unsets the "allele-state" element
         */
        public void unsetAlleleState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLELESTATE$28, 0);
            }
        }
        
        /**
         * Gets the "allele-frequency" element
         */
        public double getAlleleFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLELEFREQUENCY$30, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "allele-frequency" element
         */
        public org.apache.xmlbeans.XmlDouble xgetAlleleFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALLELEFREQUENCY$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "allele-frequency" element
         */
        public boolean isSetAlleleFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLELEFREQUENCY$30) != 0;
            }
        }
        
        /**
         * Sets the "allele-frequency" element
         */
        public void setAlleleFrequency(double alleleFrequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLELEFREQUENCY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLELEFREQUENCY$30);
                }
                target.setDoubleValue(alleleFrequency);
            }
        }
        
        /**
         * Sets (as xml) the "allele-frequency" element
         */
        public void xsetAlleleFrequency(org.apache.xmlbeans.XmlDouble alleleFrequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALLELEFREQUENCY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ALLELEFREQUENCY$30);
                }
                target.set(alleleFrequency);
            }
        }
        
        /**
         * Unsets the "allele-frequency" element
         */
        public void unsetAlleleFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLELEFREQUENCY$30, 0);
            }
        }
        
        /**
         * Gets the "is-ancestral-allele" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele getIsAncestralAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele)get_store().find_element_user(ISANCESTRALALLELE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "is-ancestral-allele" element
         */
        public boolean isSetIsAncestralAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISANCESTRALALLELE$32) != 0;
            }
        }
        
        /**
         * Sets the "is-ancestral-allele" element
         */
        public void setIsAncestralAllele(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele isAncestralAllele)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele)get_store().find_element_user(ISANCESTRALALLELE$32, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele)get_store().add_element_user(ISANCESTRALALLELE$32);
                }
                target.set(isAncestralAllele);
            }
        }
        
        /**
         * Appends and returns a new empty "is-ancestral-allele" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele addNewIsAncestralAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele)get_store().add_element_user(ISANCESTRALALLELE$32);
                return target;
            }
        }
        
        /**
         * Unsets the "is-ancestral-allele" element
         */
        public void unsetIsAncestralAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISANCESTRALALLELE$32, 0);
            }
        }
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub)get_store().find_element_user(PUB$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pub" element
         */
        public boolean isSetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUB$34) != 0;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub)get_store().find_element_user(PUB$34, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub)get_store().add_element_user(PUB$34);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub)get_store().add_element_user(PUB$34);
                return target;
            }
        }
        
        /**
         * Unsets the "pub" element
         */
        public void unsetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUB$34, 0);
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data)get_store().find_element_user(DATA$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data)get_store().find_element_user(DATA$36, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data)get_store().add_element_user(DATA$36);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data)get_store().add_element_user(DATA$36);
                return target;
            }
        }
        
        /**
         * Gets the "consequence" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence getConsequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence)get_store().find_element_user(CONSEQUENCE$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "consequence" element
         */
        public boolean isSetConsequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSEQUENCE$38) != 0;
            }
        }
        
        /**
         * Sets the "consequence" element
         */
        public void setConsequence(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence consequence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence)get_store().find_element_user(CONSEQUENCE$38, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence)get_store().add_element_user(CONSEQUENCE$38);
                }
                target.set(consequence);
            }
        }
        
        /**
         * Appends and returns a new empty "consequence" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence addNewConsequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence)get_store().add_element_user(CONSEQUENCE$38);
                return target;
            }
        }
        
        /**
         * Unsets the "consequence" element
         */
        public void unsetConsequence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSEQUENCE$38, 0);
            }
        }
        
        /**
         * Gets the "location" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location)get_store().find_element_user(LOCATION$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "location" element
         */
        public boolean isSetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATION$40) != 0;
            }
        }
        
        /**
         * Sets the "location" element
         */
        public void setLocation(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location)get_store().find_element_user(LOCATION$40, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location)get_store().add_element_user(LOCATION$40);
                }
                target.set(location);
            }
        }
        
        /**
         * Appends and returns a new empty "location" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location addNewLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location)get_store().add_element_user(LOCATION$40);
                return target;
            }
        }
        
        /**
         * Unsets the "location" element
         */
        public void unsetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATION$40, 0);
            }
        }
        
        /**
         * Gets the "ext-locs" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs getExtLocs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs)get_store().find_element_user(EXTLOCS$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ext-locs" element
         */
        public boolean isSetExtLocs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTLOCS$42) != 0;
            }
        }
        
        /**
         * Sets the "ext-locs" element
         */
        public void setExtLocs(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs extLocs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs)get_store().find_element_user(EXTLOCS$42, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs)get_store().add_element_user(EXTLOCS$42);
                }
                target.set(extLocs);
            }
        }
        
        /**
         * Appends and returns a new empty "ext-locs" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs addNewExtLocs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs)get_store().add_element_user(EXTLOCS$42);
                return target;
            }
        }
        
        /**
         * Unsets the "ext-locs" element
         */
        public void unsetExtLocs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTLOCS$42, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext)get_store().find_element_user(EXT$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ext" element
         */
        public boolean isSetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXT$44) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext)get_store().find_element_user(EXT$44, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext)get_store().add_element_user(EXT$44);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext)get_store().add_element_user(EXT$44);
                return target;
            }
        }
        
        /**
         * Unsets the "ext" element
         */
        public void unsetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXT$44, 0);
            }
        }
        
        /**
         * Gets the "somatic-origin" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin getSomaticOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin)get_store().find_element_user(SOMATICORIGIN$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "somatic-origin" element
         */
        public boolean isSetSomaticOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOMATICORIGIN$46) != 0;
            }
        }
        
        /**
         * Sets the "somatic-origin" element
         */
        public void setSomaticOrigin(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin somaticOrigin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin)get_store().find_element_user(SOMATICORIGIN$46, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin)get_store().add_element_user(SOMATICORIGIN$46);
                }
                target.set(somaticOrigin);
            }
        }
        
        /**
         * Appends and returns a new empty "somatic-origin" element
         */
        public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin addNewSomaticOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin target = null;
                target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin)get_store().add_element_user(SOMATICORIGIN$46);
                return target;
            }
        }
        
        /**
         * Unsets the "somatic-origin" element
         */
        public void unsetSomaticOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOMATICORIGIN$46, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
        }
        /**
         * An XML parent-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ParentIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ParentId
        {
            
            public ParentIdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
        }
        /**
         * An XML sample-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SampleIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SampleId
        {
            
            public SampleIdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets the "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Object-id" element
             */
            public void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Appends and returns a new empty "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    return target;
                }
            }
        }
        /**
         * An XML other-ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OtherIdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.OtherIds
        {
            
            public OtherIdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets array of all "Dbtag" elements
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DBTAG$0, targetList);
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Dbtag" element
             */
            public int sizeOfDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DBTAG$0);
                }
            }
            
            /**
             * Sets array of all "Dbtag" element
             */
            public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dbtagArray, DBTAG$0);
                }
            }
            
            /**
             * Sets ith "Dbtag" element
             */
            public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Dbtag" element
             */
            public void removeDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DBTAG$0, i);
                }
            }
        }
        /**
         * An XML phenotype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PhenotypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Phenotype
        {
            
            public PhenotypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PHENOTYPE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Phenotype");
            
            
            /**
             * Gets array of all "Phenotype" elements
             */
            public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype[] getPhenotypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PHENOTYPE$0, targetList);
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype[] result = new gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Phenotype" element
             */
            public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype getPhenotypeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().find_element_user(PHENOTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Phenotype" element
             */
            public int sizeOfPhenotypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PHENOTYPE$0);
                }
            }
            
            /**
             * Sets array of all "Phenotype" element
             */
            public void setPhenotypeArray(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype[] phenotypeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(phenotypeArray, PHENOTYPE$0);
                }
            }
            
            /**
             * Sets ith "Phenotype" element
             */
            public void setPhenotypeArray(int i, gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype phenotype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().find_element_user(PHENOTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(phenotype);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Phenotype" element
             */
            public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype insertNewPhenotype(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().insert_element_user(PHENOTYPE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Phenotype" element
             */
            public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype addNewPhenotype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().add_element_user(PHENOTYPE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Phenotype" element
             */
            public void removePhenotype(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PHENOTYPE$0, i);
                }
            }
        }
        /**
         * An XML method(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method
        {
            
            public MethodImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName E$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "E");
            
            
            /**
             * Gets array of all "E" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E[] getEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(E$0, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "E" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E getEArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E)get_store().find_element_user(E$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "E" element
             */
            public int sizeOfEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(E$0);
                }
            }
            
            /**
             * Sets array of all "E" element
             */
            public void setEArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E[] eArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(eArray, E$0);
                }
            }
            
            /**
             * Sets ith "E" element
             */
            public void setEArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E e)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E)get_store().find_element_user(E$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(e);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "E" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E insertNewE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E)get_store().insert_element_user(E$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "E" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E addNewE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E)get_store().add_element_user(E$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "E" element
             */
            public void removeE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(E$0, i);
                }
            }
            /**
             * An XML E(@http://www.ncbi.nlm.nih.gov).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Method$E.
             */
            public static class EImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E
            {
                
                public EImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected EImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName VALUE$0 = 
                    new javax.xml.namespace.QName("", "value");
                
                
                /**
                 * Gets the "value" attribute
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value.Enum getValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "value" attribute
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value xgetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value)get_store().find_attribute_user(VALUE$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "value" attribute
                 */
                public boolean isSetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VALUE$0) != null;
                    }
                }
                
                /**
                 * Sets the "value" attribute
                 */
                public void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value.Enum value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                      }
                      target.setEnumValue(value);
                    }
                }
                
                /**
                 * Sets (as xml) the "value" attribute
                 */
                public void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value)get_store().find_attribute_user(VALUE$0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value)get_store().add_attribute_user(VALUE$0);
                      }
                      target.set(value);
                    }
                }
                
                /**
                 * Unsets the "value" attribute
                 */
                public void unsetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VALUE$0);
                    }
                }
                /**
                 * An XML value(@).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Method$E$Value.
                 */
                public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Method.E.Value
                {
                    
                    public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
        /**
         * An XML population-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PopulationDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.PopulationData
        {
            
            public PopulationDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName POPULATIONDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Population-data");
            
            
            /**
             * Gets array of all "Population-data" elements
             */
            public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData[] getPopulationDataArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(POPULATIONDATA$0, targetList);
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData[] result = new gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Population-data" element
             */
            public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData getPopulationDataArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData target = null;
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().find_element_user(POPULATIONDATA$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Population-data" element
             */
            public int sizeOfPopulationDataArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(POPULATIONDATA$0);
                }
            }
            
            /**
             * Sets array of all "Population-data" element
             */
            public void setPopulationDataArray(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData[] populationDataArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(populationDataArray, POPULATIONDATA$0);
                }
            }
            
            /**
             * Sets ith "Population-data" element
             */
            public void setPopulationDataArray(int i, gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData populationData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData target = null;
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().find_element_user(POPULATIONDATA$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(populationData);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Population-data" element
             */
            public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData insertNewPopulationData(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData target = null;
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().insert_element_user(POPULATIONDATA$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Population-data" element
             */
            public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData addNewPopulationData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData target = null;
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().add_element_user(POPULATIONDATA$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Population-data" element
             */
            public void removePopulationData(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(POPULATIONDATA$0, i);
                }
            }
        }
        /**
         * An XML variant-prop(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class VariantPropImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.VariantProp
        {
            
            public VariantPropImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VARIANTPROPERTIES$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "VariantProperties");
            
            
            /**
             * Gets the "VariantProperties" element
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties getVariantProperties()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties)get_store().find_element_user(VARIANTPROPERTIES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "VariantProperties" element
             */
            public void setVariantProperties(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties variantProperties)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties)get_store().find_element_user(VARIANTPROPERTIES$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties)get_store().add_element_user(VARIANTPROPERTIES$0);
                    }
                    target.set(variantProperties);
                }
            }
            
            /**
             * Appends and returns a new empty "VariantProperties" element
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties addNewVariantProperties()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties)get_store().add_element_user(VARIANTPROPERTIES$0);
                    return target;
                }
            }
        }
        /**
         * An XML validated(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ValidatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated
        {
            
            public ValidatedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Validated$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Validated.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML clinical-test(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ClinicalTestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ClinicalTest
        {
            
            public ClinicalTestImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets array of all "Dbtag" elements
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DBTAG$0, targetList);
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Dbtag" element
             */
            public int sizeOfDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DBTAG$0);
                }
            }
            
            /**
             * Sets array of all "Dbtag" element
             */
            public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dbtagArray, DBTAG$0);
                }
            }
            
            /**
             * Sets ith "Dbtag" element
             */
            public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Dbtag" element
             */
            public void removeDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DBTAG$0, i);
                }
            }
        }
        /**
         * An XML allele-origin(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleOrigin.
         */
        public static class AlleleOriginImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin
        {
            
            public AlleleOriginImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AlleleOriginImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleOrigin$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleOrigin.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML allele-state(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleState.
         */
        public static class AlleleStateImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState
        {
            
            public AlleleStateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AlleleStateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$AlleleState$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.AlleleState.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML is-ancestral-allele(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IsAncestralAlleleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele
        {
            
            public IsAncestralAlleleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$IsAncestralAllele$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.IsAncestralAllele.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUB$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub");
            
            
            /**
             * Gets the "Pub" element
             */
            public gov.nih.nlm.ncbi.www.PubDocument.Pub getPub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pub" element
             */
            public void setPub(gov.nih.nlm.ncbi.www.PubDocument.Pub pub)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().add_element_user(PUB$0);
                    }
                    target.set(pub);
                }
            }
            
            /**
             * Appends and returns a new empty "Pub" element
             */
            public gov.nih.nlm.ncbi.www.PubDocument.Pub addNewPub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().add_element_user(PUB$0);
                    return target;
                }
            }
        }
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName UNKNOWN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "unknown");
            private static final javax.xml.namespace.QName NOTE$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "note");
            private static final javax.xml.namespace.QName UNIPARENTALDISOMY$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "uniparental-disomy");
            private static final javax.xml.namespace.QName INSTANCE$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "instance");
            private static final javax.xml.namespace.QName SET$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "set");
            private static final javax.xml.namespace.QName COMPLEX$10 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "complex");
            
            
            /**
             * Gets the "unknown" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown getUnknown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown)get_store().find_element_user(UNKNOWN$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "unknown" element
             */
            public boolean isSetUnknown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(UNKNOWN$0) != 0;
                }
            }
            
            /**
             * Sets the "unknown" element
             */
            public void setUnknown(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown unknown)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown)get_store().find_element_user(UNKNOWN$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown)get_store().add_element_user(UNKNOWN$0);
                    }
                    target.set(unknown);
                }
            }
            
            /**
             * Appends and returns a new empty "unknown" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown addNewUnknown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown)get_store().add_element_user(UNKNOWN$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "unknown" element
             */
            public void unsetUnknown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(UNKNOWN$0, 0);
                }
            }
            
            /**
             * Gets the "note" element
             */
            public java.lang.String getNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "note" element
             */
            public org.apache.xmlbeans.XmlString xgetNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "note" element
             */
            public boolean isSetNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NOTE$2) != 0;
                }
            }
            
            /**
             * Sets the "note" element
             */
            public void setNote(java.lang.String note)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$2);
                    }
                    target.setStringValue(note);
                }
            }
            
            /**
             * Sets (as xml) the "note" element
             */
            public void xsetNote(org.apache.xmlbeans.XmlString note)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$2);
                    }
                    target.set(note);
                }
            }
            
            /**
             * Unsets the "note" element
             */
            public void unsetNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NOTE$2, 0);
                }
            }
            
            /**
             * Gets the "uniparental-disomy" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy getUniparentalDisomy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy)get_store().find_element_user(UNIPARENTALDISOMY$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "uniparental-disomy" element
             */
            public boolean isSetUniparentalDisomy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(UNIPARENTALDISOMY$4) != 0;
                }
            }
            
            /**
             * Sets the "uniparental-disomy" element
             */
            public void setUniparentalDisomy(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy uniparentalDisomy)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy)get_store().find_element_user(UNIPARENTALDISOMY$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy)get_store().add_element_user(UNIPARENTALDISOMY$4);
                    }
                    target.set(uniparentalDisomy);
                }
            }
            
            /**
             * Appends and returns a new empty "uniparental-disomy" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy addNewUniparentalDisomy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy)get_store().add_element_user(UNIPARENTALDISOMY$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "uniparental-disomy" element
             */
            public void unsetUniparentalDisomy()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(UNIPARENTALDISOMY$4, 0);
                }
            }
            
            /**
             * Gets the "instance" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance getInstance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance)get_store().find_element_user(INSTANCE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "instance" element
             */
            public boolean isSetInstance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INSTANCE$6) != 0;
                }
            }
            
            /**
             * Sets the "instance" element
             */
            public void setInstance(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance instance)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance)get_store().find_element_user(INSTANCE$6, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance)get_store().add_element_user(INSTANCE$6);
                    }
                    target.set(instance);
                }
            }
            
            /**
             * Appends and returns a new empty "instance" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance addNewInstance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance)get_store().add_element_user(INSTANCE$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "instance" element
             */
            public void unsetInstance()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INSTANCE$6, 0);
                }
            }
            
            /**
             * Gets the "set" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set getSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set)get_store().find_element_user(SET$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "set" element
             */
            public boolean isSetSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SET$8) != 0;
                }
            }
            
            /**
             * Sets the "set" element
             */
            public void setSet(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set set)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set)get_store().find_element_user(SET$8, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set)get_store().add_element_user(SET$8);
                    }
                    target.set(set);
                }
            }
            
            /**
             * Appends and returns a new empty "set" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set addNewSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set)get_store().add_element_user(SET$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "set" element
             */
            public void unsetSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SET$8, 0);
                }
            }
            
            /**
             * Gets the "complex" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex getComplex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex)get_store().find_element_user(COMPLEX$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "complex" element
             */
            public boolean isSetComplex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(COMPLEX$10) != 0;
                }
            }
            
            /**
             * Sets the "complex" element
             */
            public void setComplex(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex complex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex)get_store().find_element_user(COMPLEX$10, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex)get_store().add_element_user(COMPLEX$10);
                    }
                    target.set(complex);
                }
            }
            
            /**
             * Appends and returns a new empty "complex" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex addNewComplex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex)get_store().add_element_user(COMPLEX$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "complex" element
             */
            public void unsetComplex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(COMPLEX$10, 0);
                }
            }
            /**
             * An XML unknown(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class UnknownImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Unknown
            {
                
                public UnknownImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
            /**
             * An XML uniparental-disomy(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class UniparentalDisomyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.UniparentalDisomy
            {
                
                public UniparentalDisomyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
            /**
             * An XML instance(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class InstanceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Instance
            {
                
                public InstanceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VARIATIONINST$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Variation-inst");
                
                
                /**
                 * Gets the "Variation-inst" element
                 */
                public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst getVariationInst()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().find_element_user(VARIATIONINST$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Variation-inst" element
                 */
                public void setVariationInst(gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst variationInst)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().find_element_user(VARIATIONINST$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().add_element_user(VARIATIONINST$0);
                      }
                      target.set(variationInst);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Variation-inst" element
                 */
                public gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst addNewVariationInst()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationInstDocument.VariationInst)get_store().add_element_user(VARIATIONINST$0);
                      return target;
                    }
                }
            }
            /**
             * An XML set(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class SetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set
            {
                
                public SetImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
                private static final javax.xml.namespace.QName VARIATIONS$2 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "variations");
                private static final javax.xml.namespace.QName NAME$4 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
                
                
                /**
                 * Gets the "type" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type)get_store().find_element_user(TYPE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "type" element
                 */
                public void setType(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type)get_store().find_element_user(TYPE$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type)get_store().add_element_user(TYPE$0);
                      }
                      target.set(type);
                    }
                }
                
                /**
                 * Appends and returns a new empty "type" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type addNewType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type)get_store().add_element_user(TYPE$0);
                      return target;
                    }
                }
                
                /**
                 * Gets the "variations" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations getVariations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations)get_store().find_element_user(VARIATIONS$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "variations" element
                 */
                public void setVariations(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations variations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations)get_store().find_element_user(VARIATIONS$2, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations)get_store().add_element_user(VARIATIONS$2);
                      }
                      target.set(variations);
                    }
                }
                
                /**
                 * Appends and returns a new empty "variations" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations addNewVariations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations)get_store().add_element_user(VARIATIONS$2);
                      return target;
                    }
                }
                
                /**
                 * Gets the "name" element
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" element
                 */
                public org.apache.xmlbeans.XmlString xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "name" element
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NAME$4) != 0;
                    }
                }
                
                /**
                 * Sets the "name" element
                 */
                public void setName(java.lang.String name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
                      }
                      target.setStringValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" element
                 */
                public void xsetName(org.apache.xmlbeans.XmlString name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Unsets the "name" element
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NAME$4, 0);
                    }
                }
                /**
                 * An XML type(@http://www.ncbi.nlm.nih.gov).
                 *
                 * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Data$Set$Type.
                 */
                public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type
                {
                    
                    public TypeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName VALUE$0 = 
                      new javax.xml.namespace.QName("", "value");
                    
                    
                    /**
                     * Gets the "value" attribute
                     */
                    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value.Enum getValue()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "value" attribute
                     */
                    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value xgetValue()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value target = null;
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value)get_store().find_attribute_user(VALUE$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "value" attribute
                     */
                    public boolean isSetValue()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(VALUE$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "value" attribute
                     */
                    public void setValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value.Enum value)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                        }
                        target.setEnumValue(value);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "value" attribute
                     */
                    public void xsetValue(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value value)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value target = null;
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value)get_store().find_attribute_user(VALUE$0);
                        if (target == null)
                        {
                          target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value)get_store().add_attribute_user(VALUE$0);
                        }
                        target.set(value);
                      }
                    }
                    
                    /**
                     * Unsets the "value" attribute
                     */
                    public void unsetValue()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(VALUE$0);
                      }
                    }
                    /**
                     * An XML value(@).
                     *
                     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariationRefDocument$VariationRef$Data$Set$Type$Value.
                     */
                    public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Type.Value
                    {
                      
                      public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML variations(@http://www.ncbi.nlm.nih.gov).
                 *
                 * This is a complex type.
                 */
                public static class VariationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Set.Variations
                {
                    
                    public VariationsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName VARIATIONREF$0 = 
                      new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Variation-ref");
                    
                    
                    /**
                     * Gets array of all "Variation-ref" elements
                     */
                    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef[] getVariationRefArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(VARIATIONREF$0, targetList);
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "Variation-ref" element
                     */
                    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRefArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().find_element_user(VARIATIONREF$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "Variation-ref" element
                     */
                    public int sizeOfVariationRefArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(VARIATIONREF$0);
                      }
                    }
                    
                    /**
                     * Sets array of all "Variation-ref" element
                     */
                    public void setVariationRefArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef[] variationRefArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(variationRefArray, VARIATIONREF$0);
                      }
                    }
                    
                    /**
                     * Sets ith "Variation-ref" element
                     */
                    public void setVariationRefArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().find_element_user(VARIATIONREF$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(variationRef);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Variation-ref" element
                     */
                    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef insertNewVariationRef(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().insert_element_user(VARIATIONREF$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Variation-ref" element
                     */
                    public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().add_element_user(VARIATIONREF$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "Variation-ref" element
                     */
                    public void removeVariationRef(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(VARIATIONREF$0, i);
                      }
                    }
                }
            }
            /**
             * An XML complex(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ComplexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Data.Complex
            {
                
                public ComplexImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
        /**
         * An XML consequence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ConsequenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence
        {
            
            public ConsequenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName UNKNOWN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "unknown");
            private static final javax.xml.namespace.QName SPLICING$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "splicing");
            private static final javax.xml.namespace.QName NOTE$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "note");
            private static final javax.xml.namespace.QName VARIATION$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "variation");
            private static final javax.xml.namespace.QName FRAMESHIFT$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "frameshift");
            private static final javax.xml.namespace.QName LOSSOFHETEROZYGOSITY$10 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loss-of-heterozygosity");
            
            
            /**
             * Gets array of all "unknown" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown[] getUnknownArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(UNKNOWN$0, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "unknown" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown getUnknownArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown)get_store().find_element_user(UNKNOWN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "unknown" element
             */
            public int sizeOfUnknownArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(UNKNOWN$0);
                }
            }
            
            /**
             * Sets array of all "unknown" element
             */
            public void setUnknownArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown[] unknownArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(unknownArray, UNKNOWN$0);
                }
            }
            
            /**
             * Sets ith "unknown" element
             */
            public void setUnknownArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown unknown)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown)get_store().find_element_user(UNKNOWN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(unknown);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "unknown" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown insertNewUnknown(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown)get_store().insert_element_user(UNKNOWN$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "unknown" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown addNewUnknown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown)get_store().add_element_user(UNKNOWN$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "unknown" element
             */
            public void removeUnknown(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(UNKNOWN$0, i);
                }
            }
            
            /**
             * Gets array of all "splicing" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing[] getSplicingArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SPLICING$2, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "splicing" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing getSplicingArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing)get_store().find_element_user(SPLICING$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "splicing" element
             */
            public int sizeOfSplicingArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPLICING$2);
                }
            }
            
            /**
             * Sets array of all "splicing" element
             */
            public void setSplicingArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing[] splicingArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(splicingArray, SPLICING$2);
                }
            }
            
            /**
             * Sets ith "splicing" element
             */
            public void setSplicingArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing splicing)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing)get_store().find_element_user(SPLICING$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(splicing);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "splicing" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing insertNewSplicing(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing)get_store().insert_element_user(SPLICING$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "splicing" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing addNewSplicing()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing)get_store().add_element_user(SPLICING$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "splicing" element
             */
            public void removeSplicing(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPLICING$2, i);
                }
            }
            
            /**
             * Gets array of all "note" elements
             */
            public java.lang.String[] getNoteArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NOTE$4, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "note" element
             */
            public java.lang.String getNoteArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "note" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetNoteArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NOTE$4, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "note" element
             */
            public org.apache.xmlbeans.XmlString xgetNoteArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "note" element
             */
            public int sizeOfNoteArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NOTE$4);
                }
            }
            
            /**
             * Sets array of all "note" element
             */
            public void setNoteArray(java.lang.String[] noteArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(noteArray, NOTE$4);
                }
            }
            
            /**
             * Sets ith "note" element
             */
            public void setNoteArray(int i, java.lang.String note)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(note);
                }
            }
            
            /**
             * Sets (as xml) array of all "note" element
             */
            public void xsetNoteArray(org.apache.xmlbeans.XmlString[]noteArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(noteArray, NOTE$4);
                }
            }
            
            /**
             * Sets (as xml) ith "note" element
             */
            public void xsetNoteArray(int i, org.apache.xmlbeans.XmlString note)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(note);
                }
            }
            
            /**
             * Inserts the value as the ith "note" element
             */
            public void insertNote(int i, java.lang.String note)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NOTE$4, i);
                    target.setStringValue(note);
                }
            }
            
            /**
             * Appends the value as the last "note" element
             */
            public void addNote(java.lang.String note)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$4);
                    target.setStringValue(note);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "note" element
             */
            public org.apache.xmlbeans.XmlString insertNewNote(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NOTE$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "note" element
             */
            public org.apache.xmlbeans.XmlString addNewNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "note" element
             */
            public void removeNote(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NOTE$4, i);
                }
            }
            
            /**
             * Gets array of all "variation" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation[] getVariationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(VARIATION$6, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "variation" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation getVariationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation)get_store().find_element_user(VARIATION$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "variation" element
             */
            public int sizeOfVariationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(VARIATION$6);
                }
            }
            
            /**
             * Sets array of all "variation" element
             */
            public void setVariationArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation[] variationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(variationArray, VARIATION$6);
                }
            }
            
            /**
             * Sets ith "variation" element
             */
            public void setVariationArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation variation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation)get_store().find_element_user(VARIATION$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(variation);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "variation" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation insertNewVariation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation)get_store().insert_element_user(VARIATION$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "variation" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation addNewVariation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation)get_store().add_element_user(VARIATION$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "variation" element
             */
            public void removeVariation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(VARIATION$6, i);
                }
            }
            
            /**
             * Gets array of all "frameshift" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift[] getFrameshiftArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(FRAMESHIFT$8, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "frameshift" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift getFrameshiftArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift)get_store().find_element_user(FRAMESHIFT$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "frameshift" element
             */
            public int sizeOfFrameshiftArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FRAMESHIFT$8);
                }
            }
            
            /**
             * Sets array of all "frameshift" element
             */
            public void setFrameshiftArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift[] frameshiftArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(frameshiftArray, FRAMESHIFT$8);
                }
            }
            
            /**
             * Sets ith "frameshift" element
             */
            public void setFrameshiftArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift frameshift)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift)get_store().find_element_user(FRAMESHIFT$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(frameshift);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "frameshift" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift insertNewFrameshift(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift)get_store().insert_element_user(FRAMESHIFT$8, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "frameshift" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift addNewFrameshift()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift)get_store().add_element_user(FRAMESHIFT$8);
                    return target;
                }
            }
            
            /**
             * Removes the ith "frameshift" element
             */
            public void removeFrameshift(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FRAMESHIFT$8, i);
                }
            }
            
            /**
             * Gets array of all "loss-of-heterozygosity" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity[] getLossOfHeterozygosityArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(LOSSOFHETEROZYGOSITY$10, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "loss-of-heterozygosity" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity getLossOfHeterozygosityArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity)get_store().find_element_user(LOSSOFHETEROZYGOSITY$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "loss-of-heterozygosity" element
             */
            public int sizeOfLossOfHeterozygosityArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOSSOFHETEROZYGOSITY$10);
                }
            }
            
            /**
             * Sets array of all "loss-of-heterozygosity" element
             */
            public void setLossOfHeterozygosityArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity[] lossOfHeterozygosityArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(lossOfHeterozygosityArray, LOSSOFHETEROZYGOSITY$10);
                }
            }
            
            /**
             * Sets ith "loss-of-heterozygosity" element
             */
            public void setLossOfHeterozygosityArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity lossOfHeterozygosity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity)get_store().find_element_user(LOSSOFHETEROZYGOSITY$10, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(lossOfHeterozygosity);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "loss-of-heterozygosity" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity insertNewLossOfHeterozygosity(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity)get_store().insert_element_user(LOSSOFHETEROZYGOSITY$10, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "loss-of-heterozygosity" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity addNewLossOfHeterozygosity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity)get_store().add_element_user(LOSSOFHETEROZYGOSITY$10);
                    return target;
                }
            }
            
            /**
             * Removes the ith "loss-of-heterozygosity" element
             */
            public void removeLossOfHeterozygosity(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOSSOFHETEROZYGOSITY$10, i);
                }
            }
            /**
             * An XML unknown(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class UnknownImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Unknown
            {
                
                public UnknownImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
            /**
             * An XML splicing(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class SplicingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Splicing
            {
                
                public SplicingImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
            /**
             * An XML variation(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class VariationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Variation
            {
                
                public VariationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VARIATIONREF$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Variation-ref");
                
                
                /**
                 * Gets the "Variation-ref" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().find_element_user(VARIATIONREF$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Variation-ref" element
                 */
                public void setVariationRef(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().find_element_user(VARIATIONREF$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().add_element_user(VARIATIONREF$0);
                      }
                      target.set(variationRef);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Variation-ref" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef)get_store().add_element_user(VARIATIONREF$0);
                      return target;
                    }
                }
            }
            /**
             * An XML frameshift(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class FrameshiftImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.Frameshift
            {
                
                public FrameshiftImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PHASE$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "phase");
                private static final javax.xml.namespace.QName XLENGTH$2 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "x-length");
                
                
                /**
                 * Gets the "phase" element
                 */
                public java.math.BigInteger getPhase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHASE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "phase" element
                 */
                public org.apache.xmlbeans.XmlInteger xgetPhase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PHASE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "phase" element
                 */
                public boolean isSetPhase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PHASE$0) != 0;
                    }
                }
                
                /**
                 * Sets the "phase" element
                 */
                public void setPhase(java.math.BigInteger phase)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHASE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHASE$0);
                      }
                      target.setBigIntegerValue(phase);
                    }
                }
                
                /**
                 * Sets (as xml) the "phase" element
                 */
                public void xsetPhase(org.apache.xmlbeans.XmlInteger phase)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PHASE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PHASE$0);
                      }
                      target.set(phase);
                    }
                }
                
                /**
                 * Unsets the "phase" element
                 */
                public void unsetPhase()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PHASE$0, 0);
                    }
                }
                
                /**
                 * Gets the "x-length" element
                 */
                public java.math.BigInteger getXLength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XLENGTH$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "x-length" element
                 */
                public org.apache.xmlbeans.XmlInteger xgetXLength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(XLENGTH$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "x-length" element
                 */
                public boolean isSetXLength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(XLENGTH$2) != 0;
                    }
                }
                
                /**
                 * Sets the "x-length" element
                 */
                public void setXLength(java.math.BigInteger xLength)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XLENGTH$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XLENGTH$2);
                      }
                      target.setBigIntegerValue(xLength);
                    }
                }
                
                /**
                 * Sets (as xml) the "x-length" element
                 */
                public void xsetXLength(org.apache.xmlbeans.XmlInteger xLength)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(XLENGTH$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(XLENGTH$2);
                      }
                      target.set(xLength);
                    }
                }
                
                /**
                 * Unsets the "x-length" element
                 */
                public void unsetXLength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(XLENGTH$2, 0);
                    }
                }
            }
            /**
             * An XML loss-of-heterozygosity(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class LossOfHeterozygosityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Consequence.LossOfHeterozygosity
            {
                
                public LossOfHeterozygosityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName REFERENCE$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "reference");
                private static final javax.xml.namespace.QName TEST$2 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "test");
                
                
                /**
                 * Gets the "reference" element
                 */
                public java.lang.String getReference()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "reference" element
                 */
                public org.apache.xmlbeans.XmlString xgetReference()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "reference" element
                 */
                public boolean isSetReference()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(REFERENCE$0) != 0;
                    }
                }
                
                /**
                 * Sets the "reference" element
                 */
                public void setReference(java.lang.String reference)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCE$0);
                      }
                      target.setStringValue(reference);
                    }
                }
                
                /**
                 * Sets (as xml) the "reference" element
                 */
                public void xsetReference(org.apache.xmlbeans.XmlString reference)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCE$0);
                      }
                      target.set(reference);
                    }
                }
                
                /**
                 * Unsets the "reference" element
                 */
                public void unsetReference()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(REFERENCE$0, 0);
                    }
                }
                
                /**
                 * Gets the "test" element
                 */
                public java.lang.String getTest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEST$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "test" element
                 */
                public org.apache.xmlbeans.XmlString xgetTest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEST$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "test" element
                 */
                public boolean isSetTest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TEST$2) != 0;
                    }
                }
                
                /**
                 * Sets the "test" element
                 */
                public void setTest(java.lang.String test)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEST$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEST$2);
                      }
                      target.setStringValue(test);
                    }
                }
                
                /**
                 * Sets (as xml) the "test" element
                 */
                public void xsetTest(org.apache.xmlbeans.XmlString test)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEST$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEST$2);
                      }
                      target.set(test);
                    }
                }
                
                /**
                 * Unsets the "test" element
                 */
                public void unsetTest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TEST$2, 0);
                    }
                }
            }
        }
        /**
         * An XML location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Location
        {
            
            public LocationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets the "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-loc" element
             */
            public void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    return target;
                }
            }
        }
        /**
         * An XML ext-locs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtLocsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.ExtLocs
        {
            
            public ExtLocsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EXTLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Ext-loc");
            
            
            /**
             * Gets array of all "Ext-loc" elements
             */
            public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc[] getExtLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EXTLOC$0, targetList);
                    gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc[] result = new gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Ext-loc" element
             */
            public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc getExtLocArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().find_element_user(EXTLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Ext-loc" element
             */
            public int sizeOfExtLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXTLOC$0);
                }
            }
            
            /**
             * Sets array of all "Ext-loc" element
             */
            public void setExtLocArray(gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc[] extLocArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(extLocArray, EXTLOC$0);
                }
            }
            
            /**
             * Sets ith "Ext-loc" element
             */
            public void setExtLocArray(int i, gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc extLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().find_element_user(EXTLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(extLoc);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Ext-loc" element
             */
            public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc insertNewExtLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().insert_element_user(EXTLOC$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Ext-loc" element
             */
            public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc addNewExtLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().add_element_user(EXTLOC$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Ext-loc" element
             */
            public void removeExtLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXTLOC$0, i);
                }
            }
        }
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USEROBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
            
            
            /**
             * Gets the "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "User-object" element
             */
            public void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    }
                    target.set(userObject);
                }
            }
            
            /**
             * Appends and returns a new empty "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    return target;
                }
            }
        }
        /**
         * An XML somatic-origin(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SomaticOriginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin
        {
            
            public SomaticOriginImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SOURCE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
            private static final javax.xml.namespace.QName CONDITION$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "condition");
            
            
            /**
             * Gets array of all "source" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source[] getSourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SOURCE$0, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "source" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source getSourceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source)get_store().find_element_user(SOURCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "source" element
             */
            public int sizeOfSourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SOURCE$0);
                }
            }
            
            /**
             * Sets array of all "source" element
             */
            public void setSourceArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source[] sourceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(sourceArray, SOURCE$0);
                }
            }
            
            /**
             * Sets ith "source" element
             */
            public void setSourceArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source source)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source)get_store().find_element_user(SOURCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(source);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "source" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source insertNewSource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source)get_store().insert_element_user(SOURCE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "source" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source addNewSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source)get_store().add_element_user(SOURCE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "source" element
             */
            public void removeSource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SOURCE$0, i);
                }
            }
            
            /**
             * Gets array of all "condition" elements
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition[] getConditionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CONDITION$2, targetList);
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition[] result = new gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "condition" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition getConditionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition)get_store().find_element_user(CONDITION$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "condition" element
             */
            public int sizeOfConditionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONDITION$2);
                }
            }
            
            /**
             * Sets array of all "condition" element
             */
            public void setConditionArray(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition[] conditionArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(conditionArray, CONDITION$2);
                }
            }
            
            /**
             * Sets ith "condition" element
             */
            public void setConditionArray(int i, gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition condition)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition)get_store().find_element_user(CONDITION$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(condition);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "condition" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition insertNewCondition(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition)get_store().insert_element_user(CONDITION$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "condition" element
             */
            public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition addNewCondition()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition target = null;
                    target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition)get_store().add_element_user(CONDITION$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "condition" element
             */
            public void removeCondition(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONDITION$2, i);
                }
            }
            /**
             * An XML source(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class SourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Source
            {
                
                public SourceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SUBSOURCE$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SubSource");
                
                
                /**
                 * Gets the "SubSource" element
                 */
                public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource getSubSource()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                      target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().find_element_user(SUBSOURCE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "SubSource" element
                 */
                public void setSubSource(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource subSource)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                      target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().find_element_user(SUBSOURCE$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().add_element_user(SUBSOURCE$0);
                      }
                      target.set(subSource);
                    }
                }
                
                /**
                 * Appends and returns a new empty "SubSource" element
                 */
                public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource addNewSubSource()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                      target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().add_element_user(SUBSOURCE$0);
                      return target;
                    }
                }
            }
            /**
             * An XML condition(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition
            {
                
                public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DESCRIPTION$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "description");
                private static final javax.xml.namespace.QName OBJECTID$2 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "object-id");
                
                
                /**
                 * Gets the "description" element
                 */
                public java.lang.String getDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "description" element
                 */
                public org.apache.xmlbeans.XmlString xgetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "description" element
                 */
                public boolean isSetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DESCRIPTION$0) != 0;
                    }
                }
                
                /**
                 * Sets the "description" element
                 */
                public void setDescription(java.lang.String description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                      }
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Sets (as xml) the "description" element
                 */
                public void xsetDescription(org.apache.xmlbeans.XmlString description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                      }
                      target.set(description);
                    }
                }
                
                /**
                 * Unsets the "description" element
                 */
                public void unsetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DESCRIPTION$0, 0);
                    }
                }
                
                /**
                 * Gets the "object-id" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId getObjectId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId)get_store().find_element_user(OBJECTID$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "object-id" element
                 */
                public boolean isSetObjectId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(OBJECTID$2) != 0;
                    }
                }
                
                /**
                 * Sets the "object-id" element
                 */
                public void setObjectId(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId objectId)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId)get_store().find_element_user(OBJECTID$2, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId)get_store().add_element_user(OBJECTID$2);
                      }
                      target.set(objectId);
                    }
                }
                
                /**
                 * Appends and returns a new empty "object-id" element
                 */
                public gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId addNewObjectId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId target = null;
                      target = (gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId)get_store().add_element_user(OBJECTID$2);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "object-id" element
                 */
                public void unsetObjectId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(OBJECTID$2, 0);
                    }
                }
                /**
                 * An XML object-id(@http://www.ncbi.nlm.nih.gov).
                 *
                 * This is a complex type.
                 */
                public static class ObjectIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef.SomaticOrigin.Condition.ObjectId
                {
                    
                    public ObjectIdImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName DBTAG$0 = 
                      new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
                    
                    
                    /**
                     * Gets array of all "Dbtag" elements
                     */
                    public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(DBTAG$0, targetList);
                        gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "Dbtag" element
                     */
                    public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                        target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "Dbtag" element
                     */
                    public int sizeOfDbtagArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(DBTAG$0);
                      }
                    }
                    
                    /**
                     * Sets array of all "Dbtag" element
                     */
                    public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(dbtagArray, DBTAG$0);
                      }
                    }
                    
                    /**
                     * Sets ith "Dbtag" element
                     */
                    public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                        target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(dbtag);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
                     */
                    public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                        target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "Dbtag" element
                     */
                    public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                        target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "Dbtag" element
                     */
                    public void removeDbtag(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(DBTAG$0, i);
                      }
                    }
                }
            }
        }
    }
}
