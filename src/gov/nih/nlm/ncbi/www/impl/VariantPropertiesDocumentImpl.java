/*
 * An XML document type.
 * Localname: VariantProperties
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.VariantPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one VariantProperties(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class VariantPropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument
{
    
    public VariantPropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML VariantProperties(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class VariantPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties
    {
        
        public VariantPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERSION$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "version");
        private static final javax.xml.namespace.QName RESOURCELINK$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "resource-link");
        private static final javax.xml.namespace.QName GENELOCATION$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gene-location");
        private static final javax.xml.namespace.QName EFFECT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "effect");
        private static final javax.xml.namespace.QName MAPPING$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mapping");
        private static final javax.xml.namespace.QName MAPWEIGHT$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "map-weight");
        private static final javax.xml.namespace.QName FREQUENCYBASEDVALIDATION$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "frequency-based-validation");
        private static final javax.xml.namespace.QName GENOTYPE$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genotype");
        private static final javax.xml.namespace.QName PROJECTDATA$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "project-data");
        private static final javax.xml.namespace.QName QUALITYCHECK$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "quality-check");
        private static final javax.xml.namespace.QName CONFIDENCE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "confidence");
        
        
        /**
         * Gets the "version" element
         */
        public java.math.BigInteger getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" element
         */
        public org.apache.xmlbeans.XmlInteger xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VERSION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "version" element
         */
        public void setVersion(java.math.BigInteger version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$0);
                }
                target.setBigIntegerValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlInteger version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VERSION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VERSION$0);
                }
                target.set(version);
            }
        }
        
        /**
         * Gets the "resource-link" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink getResourceLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink)get_store().find_element_user(RESOURCELINK$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resource-link" element
         */
        public boolean isSetResourceLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCELINK$2) != 0;
            }
        }
        
        /**
         * Sets the "resource-link" element
         */
        public void setResourceLink(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink resourceLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink)get_store().find_element_user(RESOURCELINK$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink)get_store().add_element_user(RESOURCELINK$2);
                }
                target.set(resourceLink);
            }
        }
        
        /**
         * Appends and returns a new empty "resource-link" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink addNewResourceLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink)get_store().add_element_user(RESOURCELINK$2);
                return target;
            }
        }
        
        /**
         * Unsets the "resource-link" element
         */
        public void unsetResourceLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCELINK$2, 0);
            }
        }
        
        /**
         * Gets the "gene-location" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation getGeneLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation)get_store().find_element_user(GENELOCATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "gene-location" element
         */
        public boolean isSetGeneLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENELOCATION$4) != 0;
            }
        }
        
        /**
         * Sets the "gene-location" element
         */
        public void setGeneLocation(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation geneLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation)get_store().find_element_user(GENELOCATION$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation)get_store().add_element_user(GENELOCATION$4);
                }
                target.set(geneLocation);
            }
        }
        
        /**
         * Appends and returns a new empty "gene-location" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation addNewGeneLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation)get_store().add_element_user(GENELOCATION$4);
                return target;
            }
        }
        
        /**
         * Unsets the "gene-location" element
         */
        public void unsetGeneLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENELOCATION$4, 0);
            }
        }
        
        /**
         * Gets the "effect" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect getEffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect)get_store().find_element_user(EFFECT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "effect" element
         */
        public boolean isSetEffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EFFECT$6) != 0;
            }
        }
        
        /**
         * Sets the "effect" element
         */
        public void setEffect(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect effect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect)get_store().find_element_user(EFFECT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect)get_store().add_element_user(EFFECT$6);
                }
                target.set(effect);
            }
        }
        
        /**
         * Appends and returns a new empty "effect" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect addNewEffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect)get_store().add_element_user(EFFECT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "effect" element
         */
        public void unsetEffect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EFFECT$6, 0);
            }
        }
        
        /**
         * Gets the "mapping" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping getMapping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping)get_store().find_element_user(MAPPING$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mapping" element
         */
        public boolean isSetMapping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPPING$8) != 0;
            }
        }
        
        /**
         * Sets the "mapping" element
         */
        public void setMapping(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping mapping)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping)get_store().find_element_user(MAPPING$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping)get_store().add_element_user(MAPPING$8);
                }
                target.set(mapping);
            }
        }
        
        /**
         * Appends and returns a new empty "mapping" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping addNewMapping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping)get_store().add_element_user(MAPPING$8);
                return target;
            }
        }
        
        /**
         * Unsets the "mapping" element
         */
        public void unsetMapping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPPING$8, 0);
            }
        }
        
        /**
         * Gets the "map-weight" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight getMapWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight)get_store().find_element_user(MAPWEIGHT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "map-weight" element
         */
        public boolean isSetMapWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPWEIGHT$10) != 0;
            }
        }
        
        /**
         * Sets the "map-weight" element
         */
        public void setMapWeight(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight mapWeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight)get_store().find_element_user(MAPWEIGHT$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight)get_store().add_element_user(MAPWEIGHT$10);
                }
                target.set(mapWeight);
            }
        }
        
        /**
         * Appends and returns a new empty "map-weight" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight addNewMapWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight)get_store().add_element_user(MAPWEIGHT$10);
                return target;
            }
        }
        
        /**
         * Unsets the "map-weight" element
         */
        public void unsetMapWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPWEIGHT$10, 0);
            }
        }
        
        /**
         * Gets the "frequency-based-validation" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation getFrequencyBasedValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation)get_store().find_element_user(FREQUENCYBASEDVALIDATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "frequency-based-validation" element
         */
        public boolean isSetFrequencyBasedValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FREQUENCYBASEDVALIDATION$12) != 0;
            }
        }
        
        /**
         * Sets the "frequency-based-validation" element
         */
        public void setFrequencyBasedValidation(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation frequencyBasedValidation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation)get_store().find_element_user(FREQUENCYBASEDVALIDATION$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation)get_store().add_element_user(FREQUENCYBASEDVALIDATION$12);
                }
                target.set(frequencyBasedValidation);
            }
        }
        
        /**
         * Appends and returns a new empty "frequency-based-validation" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation addNewFrequencyBasedValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation)get_store().add_element_user(FREQUENCYBASEDVALIDATION$12);
                return target;
            }
        }
        
        /**
         * Unsets the "frequency-based-validation" element
         */
        public void unsetFrequencyBasedValidation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FREQUENCYBASEDVALIDATION$12, 0);
            }
        }
        
        /**
         * Gets the "genotype" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype getGenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype)get_store().find_element_user(GENOTYPE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genotype" element
         */
        public boolean isSetGenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENOTYPE$14) != 0;
            }
        }
        
        /**
         * Sets the "genotype" element
         */
        public void setGenotype(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype genotype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype)get_store().find_element_user(GENOTYPE$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype)get_store().add_element_user(GENOTYPE$14);
                }
                target.set(genotype);
            }
        }
        
        /**
         * Appends and returns a new empty "genotype" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype addNewGenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype)get_store().add_element_user(GENOTYPE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "genotype" element
         */
        public void unsetGenotype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENOTYPE$14, 0);
            }
        }
        
        /**
         * Gets array of all "project-data" elements
         */
        public java.math.BigInteger[] getProjectDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROJECTDATA$16, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "project-data" element
         */
        public java.math.BigInteger getProjectDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROJECTDATA$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "project-data" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetProjectDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROJECTDATA$16, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "project-data" element
         */
        public org.apache.xmlbeans.XmlInteger xgetProjectDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROJECTDATA$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "project-data" element
         */
        public int sizeOfProjectDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROJECTDATA$16);
            }
        }
        
        /**
         * Sets array of all "project-data" element
         */
        public void setProjectDataArray(java.math.BigInteger[] projectDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(projectDataArray, PROJECTDATA$16);
            }
        }
        
        /**
         * Sets ith "project-data" element
         */
        public void setProjectDataArray(int i, java.math.BigInteger projectData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROJECTDATA$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(projectData);
            }
        }
        
        /**
         * Sets (as xml) array of all "project-data" element
         */
        public void xsetProjectDataArray(org.apache.xmlbeans.XmlInteger[]projectDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(projectDataArray, PROJECTDATA$16);
            }
        }
        
        /**
         * Sets (as xml) ith "project-data" element
         */
        public void xsetProjectDataArray(int i, org.apache.xmlbeans.XmlInteger projectData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROJECTDATA$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(projectData);
            }
        }
        
        /**
         * Inserts the value as the ith "project-data" element
         */
        public void insertProjectData(int i, java.math.BigInteger projectData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROJECTDATA$16, i);
                target.setBigIntegerValue(projectData);
            }
        }
        
        /**
         * Appends the value as the last "project-data" element
         */
        public void addProjectData(java.math.BigInteger projectData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROJECTDATA$16);
                target.setBigIntegerValue(projectData);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "project-data" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewProjectData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROJECTDATA$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "project-data" element
         */
        public org.apache.xmlbeans.XmlInteger addNewProjectData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROJECTDATA$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "project-data" element
         */
        public void removeProjectData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROJECTDATA$16, i);
            }
        }
        
        /**
         * Gets the "quality-check" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck getQualityCheck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck)get_store().find_element_user(QUALITYCHECK$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "quality-check" element
         */
        public boolean isSetQualityCheck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALITYCHECK$18) != 0;
            }
        }
        
        /**
         * Sets the "quality-check" element
         */
        public void setQualityCheck(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck qualityCheck)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck)get_store().find_element_user(QUALITYCHECK$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck)get_store().add_element_user(QUALITYCHECK$18);
                }
                target.set(qualityCheck);
            }
        }
        
        /**
         * Appends and returns a new empty "quality-check" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck addNewQualityCheck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck)get_store().add_element_user(QUALITYCHECK$18);
                return target;
            }
        }
        
        /**
         * Unsets the "quality-check" element
         */
        public void unsetQualityCheck()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALITYCHECK$18, 0);
            }
        }
        
        /**
         * Gets the "confidence" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence getConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence)get_store().find_element_user(CONFIDENCE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "confidence" element
         */
        public boolean isSetConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONFIDENCE$20) != 0;
            }
        }
        
        /**
         * Sets the "confidence" element
         */
        public void setConfidence(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence confidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence)get_store().find_element_user(CONFIDENCE$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence)get_store().add_element_user(CONFIDENCE$20);
                }
                target.set(confidence);
            }
        }
        
        /**
         * Appends and returns a new empty "confidence" element
         */
        public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence addNewConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence target = null;
                target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence)get_store().add_element_user(CONFIDENCE$20);
                return target;
            }
        }
        
        /**
         * Unsets the "confidence" element
         */
        public void unsetConfidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONFIDENCE$20, 0);
            }
        }
        /**
         * An XML resource-link(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$ResourceLink.
         */
        public static class ResourceLinkImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink
        {
            
            public ResourceLinkImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ResourceLinkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$ResourceLink$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.ResourceLink.Value
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
         * An XML gene-location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$GeneLocation.
         */
        public static class GeneLocationImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation
        {
            
            public GeneLocationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected GeneLocationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$GeneLocation$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.GeneLocation.Value
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
         * An XML effect(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Effect.
         */
        public static class EffectImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect
        {
            
            public EffectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected EffectImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Effect$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Effect.Value
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
         * An XML mapping(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Mapping.
         */
        public static class MappingImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping
        {
            
            public MappingImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected MappingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Mapping$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Mapping.Value
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
         * An XML map-weight(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$MapWeight.
         */
        public static class MapWeightImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight
        {
            
            public MapWeightImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected MapWeightImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$MapWeight$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.MapWeight.Value
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
         * An XML frequency-based-validation(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$FrequencyBasedValidation.
         */
        public static class FrequencyBasedValidationImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation
        {
            
            public FrequencyBasedValidationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected FrequencyBasedValidationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$FrequencyBasedValidation$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.FrequencyBasedValidation.Value
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
         * An XML genotype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Genotype.
         */
        public static class GenotypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype
        {
            
            public GenotypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected GenotypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Genotype$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Genotype.Value
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
         * An XML quality-check(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$QualityCheck.
         */
        public static class QualityCheckImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck
        {
            
            public QualityCheckImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected QualityCheckImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$QualityCheck$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.QualityCheck.Value
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
         * An XML confidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Confidence.
         */
        public static class ConfidenceImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence
        {
            
            public ConfidenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ConfidenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.VariantPropertiesDocument$VariantProperties$Confidence$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.VariantPropertiesDocument.VariantProperties.Confidence.Value
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
}
