/*
 * An XML document type.
 * Localname: Population-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PopulationDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Population-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PopulationDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PopulationDataDocument
{
    
    public PopulationDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POPULATIONDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Population-data");
    
    
    /**
     * Gets the "Population-data" element
     */
    public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData getPopulationData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData target = null;
            target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().find_element_user(POPULATIONDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Population-data" element
     */
    public void setPopulationData(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData populationData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData target = null;
            target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().find_element_user(POPULATIONDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData)get_store().add_element_user(POPULATIONDATA$0);
            }
            target.set(populationData);
        }
    }
    
    /**
     * Appends and returns a new empty "Population-data" element
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
     * An XML Population-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PopulationDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData
    {
        
        public PopulationDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POPULATION$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "population");
        private static final javax.xml.namespace.QName GENOTYPEFREQUENCY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genotype-frequency");
        private static final javax.xml.namespace.QName CHROMOSOMESTESTED$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "chromosomes-tested");
        private static final javax.xml.namespace.QName SAMPLEIDS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sample-ids");
        private static final javax.xml.namespace.QName ALLELEFREQUENCY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "allele-frequency");
        private static final javax.xml.namespace.QName FLAGS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "flags");
        
        
        /**
         * Gets the "population" element
         */
        public java.lang.String getPopulation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POPULATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "population" element
         */
        public org.apache.xmlbeans.XmlString xgetPopulation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POPULATION$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "population" element
         */
        public void setPopulation(java.lang.String population)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POPULATION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POPULATION$0);
                }
                target.setStringValue(population);
            }
        }
        
        /**
         * Sets (as xml) the "population" element
         */
        public void xsetPopulation(org.apache.xmlbeans.XmlString population)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POPULATION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POPULATION$0);
                }
                target.set(population);
            }
        }
        
        /**
         * Gets the "genotype-frequency" element
         */
        public double getGenotypeFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOTYPEFREQUENCY$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "genotype-frequency" element
         */
        public org.apache.xmlbeans.XmlDouble xgetGenotypeFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GENOTYPEFREQUENCY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "genotype-frequency" element
         */
        public boolean isSetGenotypeFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENOTYPEFREQUENCY$2) != 0;
            }
        }
        
        /**
         * Sets the "genotype-frequency" element
         */
        public void setGenotypeFrequency(double genotypeFrequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENOTYPEFREQUENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENOTYPEFREQUENCY$2);
                }
                target.setDoubleValue(genotypeFrequency);
            }
        }
        
        /**
         * Sets (as xml) the "genotype-frequency" element
         */
        public void xsetGenotypeFrequency(org.apache.xmlbeans.XmlDouble genotypeFrequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GENOTYPEFREQUENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(GENOTYPEFREQUENCY$2);
                }
                target.set(genotypeFrequency);
            }
        }
        
        /**
         * Unsets the "genotype-frequency" element
         */
        public void unsetGenotypeFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENOTYPEFREQUENCY$2, 0);
            }
        }
        
        /**
         * Gets the "chromosomes-tested" element
         */
        public java.math.BigInteger getChromosomesTested()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHROMOSOMESTESTED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "chromosomes-tested" element
         */
        public org.apache.xmlbeans.XmlInteger xgetChromosomesTested()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHROMOSOMESTESTED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "chromosomes-tested" element
         */
        public boolean isSetChromosomesTested()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHROMOSOMESTESTED$4) != 0;
            }
        }
        
        /**
         * Sets the "chromosomes-tested" element
         */
        public void setChromosomesTested(java.math.BigInteger chromosomesTested)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHROMOSOMESTESTED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHROMOSOMESTESTED$4);
                }
                target.setBigIntegerValue(chromosomesTested);
            }
        }
        
        /**
         * Sets (as xml) the "chromosomes-tested" element
         */
        public void xsetChromosomesTested(org.apache.xmlbeans.XmlInteger chromosomesTested)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHROMOSOMESTESTED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CHROMOSOMESTESTED$4);
                }
                target.set(chromosomesTested);
            }
        }
        
        /**
         * Unsets the "chromosomes-tested" element
         */
        public void unsetChromosomesTested()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHROMOSOMESTESTED$4, 0);
            }
        }
        
        /**
         * Gets the "sample-ids" element
         */
        public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds getSampleIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds target = null;
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds)get_store().find_element_user(SAMPLEIDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sample-ids" element
         */
        public boolean isSetSampleIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SAMPLEIDS$6) != 0;
            }
        }
        
        /**
         * Sets the "sample-ids" element
         */
        public void setSampleIds(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds sampleIds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds target = null;
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds)get_store().find_element_user(SAMPLEIDS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds)get_store().add_element_user(SAMPLEIDS$6);
                }
                target.set(sampleIds);
            }
        }
        
        /**
         * Appends and returns a new empty "sample-ids" element
         */
        public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds addNewSampleIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds target = null;
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds)get_store().add_element_user(SAMPLEIDS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "sample-ids" element
         */
        public void unsetSampleIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SAMPLEIDS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLELEFREQUENCY$8, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALLELEFREQUENCY$8, 0);
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
                return get_store().count_elements(ALLELEFREQUENCY$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLELEFREQUENCY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLELEFREQUENCY$8);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ALLELEFREQUENCY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ALLELEFREQUENCY$8);
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
                get_store().remove_element(ALLELEFREQUENCY$8, 0);
            }
        }
        
        /**
         * Gets the "flags" element
         */
        public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags getFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags target = null;
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags)get_store().find_element_user(FLAGS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "flags" element
         */
        public boolean isSetFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLAGS$10) != 0;
            }
        }
        
        /**
         * Sets the "flags" element
         */
        public void setFlags(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags flags)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags target = null;
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags)get_store().find_element_user(FLAGS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags)get_store().add_element_user(FLAGS$10);
                }
                target.set(flags);
            }
        }
        
        /**
         * Appends and returns a new empty "flags" element
         */
        public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags addNewFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags target = null;
                target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags)get_store().add_element_user(FLAGS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "flags" element
         */
        public void unsetFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLAGS$10, 0);
            }
        }
        /**
         * An XML sample-ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SampleIdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.SampleIds
        {
            
            public SampleIdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets array of all "Object-id" elements
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] getObjectIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OBJECTID$0, targetList);
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] result = new gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Object-id" element
             */
            public int sizeOfObjectIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBJECTID$0);
                }
            }
            
            /**
             * Sets array of all "Object-id" element
             */
            public void setObjectIdArray(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId[] objectIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(objectIdArray, OBJECTID$0);
                }
            }
            
            /**
             * Sets ith "Object-id" element
             */
            public void setObjectIdArray(int i, gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId insertNewObjectId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().insert_element_user(OBJECTID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Object-id" element
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
            
            /**
             * Removes the ith "Object-id" element
             */
            public void removeObjectId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBJECTID$0, i);
                }
            }
        }
        /**
         * An XML flags(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PopulationDataDocument$PopulationData$Flags.
         */
        public static class FlagsImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags
        {
            
            public FlagsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected FlagsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PopulationDataDocument$PopulationData$Flags$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PopulationDataDocument.PopulationData.Flags.Value
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
