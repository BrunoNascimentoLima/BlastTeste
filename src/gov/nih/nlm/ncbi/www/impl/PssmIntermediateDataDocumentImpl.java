/*
 * An XML document type.
 * Localname: PssmIntermediateData
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PssmIntermediateData(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PssmIntermediateDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument
{
    
    public PssmIntermediateDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PSSMINTERMEDIATEDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmIntermediateData");
    
    
    /**
     * Gets the "PssmIntermediateData" element
     */
    public gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData getPssmIntermediateData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData target = null;
            target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().find_element_user(PSSMINTERMEDIATEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PssmIntermediateData" element
     */
    public void setPssmIntermediateData(gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData pssmIntermediateData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData target = null;
            target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().find_element_user(PSSMINTERMEDIATEDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().add_element_user(PSSMINTERMEDIATEDATA$0);
            }
            target.set(pssmIntermediateData);
        }
    }
    
    /**
     * Appends and returns a new empty "PssmIntermediateData" element
     */
    public gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData addNewPssmIntermediateData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData target = null;
            target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().add_element_user(PSSMINTERMEDIATEDATA$0);
            return target;
        }
    }
    /**
     * An XML PssmIntermediateData(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PssmIntermediateDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData
    {
        
        public PssmIntermediateDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESFREQSPERPOS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "resFreqsPerPos");
        private static final javax.xml.namespace.QName WEIGHTEDRESFREQSPERPOS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "weightedResFreqsPerPos");
        private static final javax.xml.namespace.QName FREQRATIOS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "freqRatios");
        private static final javax.xml.namespace.QName INFORMATIONCONTENT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "informationContent");
        private static final javax.xml.namespace.QName GAPLESSCOLUMNWEIGHTS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gaplessColumnWeights");
        private static final javax.xml.namespace.QName SIGMA$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sigma");
        private static final javax.xml.namespace.QName INTERVALSIZES$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "intervalSizes");
        private static final javax.xml.namespace.QName NUMMATCHINGSEQS$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numMatchingSeqs");
        
        
        /**
         * Gets array of all "resFreqsPerPos" elements
         */
        public java.math.BigInteger[] getResFreqsPerPosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESFREQSPERPOS$0, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "resFreqsPerPos" element
         */
        public java.math.BigInteger getResFreqsPerPosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESFREQSPERPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "resFreqsPerPos" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetResFreqsPerPosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESFREQSPERPOS$0, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "resFreqsPerPos" element
         */
        public org.apache.xmlbeans.XmlInteger xgetResFreqsPerPosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RESFREQSPERPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "resFreqsPerPos" element
         */
        public int sizeOfResFreqsPerPosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESFREQSPERPOS$0);
            }
        }
        
        /**
         * Sets array of all "resFreqsPerPos" element
         */
        public void setResFreqsPerPosArray(java.math.BigInteger[] resFreqsPerPosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resFreqsPerPosArray, RESFREQSPERPOS$0);
            }
        }
        
        /**
         * Sets ith "resFreqsPerPos" element
         */
        public void setResFreqsPerPosArray(int i, java.math.BigInteger resFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESFREQSPERPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(resFreqsPerPos);
            }
        }
        
        /**
         * Sets (as xml) array of all "resFreqsPerPos" element
         */
        public void xsetResFreqsPerPosArray(org.apache.xmlbeans.XmlInteger[]resFreqsPerPosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resFreqsPerPosArray, RESFREQSPERPOS$0);
            }
        }
        
        /**
         * Sets (as xml) ith "resFreqsPerPos" element
         */
        public void xsetResFreqsPerPosArray(int i, org.apache.xmlbeans.XmlInteger resFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RESFREQSPERPOS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resFreqsPerPos);
            }
        }
        
        /**
         * Inserts the value as the ith "resFreqsPerPos" element
         */
        public void insertResFreqsPerPos(int i, java.math.BigInteger resFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RESFREQSPERPOS$0, i);
                target.setBigIntegerValue(resFreqsPerPos);
            }
        }
        
        /**
         * Appends the value as the last "resFreqsPerPos" element
         */
        public void addResFreqsPerPos(java.math.BigInteger resFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESFREQSPERPOS$0);
                target.setBigIntegerValue(resFreqsPerPos);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resFreqsPerPos" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewResFreqsPerPos(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(RESFREQSPERPOS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resFreqsPerPos" element
         */
        public org.apache.xmlbeans.XmlInteger addNewResFreqsPerPos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(RESFREQSPERPOS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resFreqsPerPos" element
         */
        public void removeResFreqsPerPos(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESFREQSPERPOS$0, i);
            }
        }
        
        /**
         * Gets array of all "weightedResFreqsPerPos" elements
         */
        public double[] getWeightedResFreqsPerPosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WEIGHTEDRESFREQSPERPOS$2, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "weightedResFreqsPerPos" element
         */
        public double getWeightedResFreqsPerPosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHTEDRESFREQSPERPOS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "weightedResFreqsPerPos" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetWeightedResFreqsPerPosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WEIGHTEDRESFREQSPERPOS$2, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "weightedResFreqsPerPos" element
         */
        public org.apache.xmlbeans.XmlDouble xgetWeightedResFreqsPerPosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WEIGHTEDRESFREQSPERPOS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "weightedResFreqsPerPos" element
         */
        public int sizeOfWeightedResFreqsPerPosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEIGHTEDRESFREQSPERPOS$2);
            }
        }
        
        /**
         * Sets array of all "weightedResFreqsPerPos" element
         */
        public void setWeightedResFreqsPerPosArray(double[] weightedResFreqsPerPosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(weightedResFreqsPerPosArray, WEIGHTEDRESFREQSPERPOS$2);
            }
        }
        
        /**
         * Sets ith "weightedResFreqsPerPos" element
         */
        public void setWeightedResFreqsPerPosArray(int i, double weightedResFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHTEDRESFREQSPERPOS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(weightedResFreqsPerPos);
            }
        }
        
        /**
         * Sets (as xml) array of all "weightedResFreqsPerPos" element
         */
        public void xsetWeightedResFreqsPerPosArray(org.apache.xmlbeans.XmlDouble[]weightedResFreqsPerPosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(weightedResFreqsPerPosArray, WEIGHTEDRESFREQSPERPOS$2);
            }
        }
        
        /**
         * Sets (as xml) ith "weightedResFreqsPerPos" element
         */
        public void xsetWeightedResFreqsPerPosArray(int i, org.apache.xmlbeans.XmlDouble weightedResFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WEIGHTEDRESFREQSPERPOS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(weightedResFreqsPerPos);
            }
        }
        
        /**
         * Inserts the value as the ith "weightedResFreqsPerPos" element
         */
        public void insertWeightedResFreqsPerPos(int i, double weightedResFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WEIGHTEDRESFREQSPERPOS$2, i);
                target.setDoubleValue(weightedResFreqsPerPos);
            }
        }
        
        /**
         * Appends the value as the last "weightedResFreqsPerPos" element
         */
        public void addWeightedResFreqsPerPos(double weightedResFreqsPerPos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHTEDRESFREQSPERPOS$2);
                target.setDoubleValue(weightedResFreqsPerPos);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "weightedResFreqsPerPos" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewWeightedResFreqsPerPos(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(WEIGHTEDRESFREQSPERPOS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "weightedResFreqsPerPos" element
         */
        public org.apache.xmlbeans.XmlDouble addNewWeightedResFreqsPerPos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(WEIGHTEDRESFREQSPERPOS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "weightedResFreqsPerPos" element
         */
        public void removeWeightedResFreqsPerPos(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEIGHTEDRESFREQSPERPOS$2, i);
            }
        }
        
        /**
         * Gets array of all "freqRatios" elements
         */
        public double[] getFreqRatiosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FREQRATIOS$4, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "freqRatios" element
         */
        public double getFreqRatiosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQRATIOS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "freqRatios" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetFreqRatiosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FREQRATIOS$4, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "freqRatios" element
         */
        public org.apache.xmlbeans.XmlDouble xgetFreqRatiosArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(FREQRATIOS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "freqRatios" element
         */
        public int sizeOfFreqRatiosArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FREQRATIOS$4);
            }
        }
        
        /**
         * Sets array of all "freqRatios" element
         */
        public void setFreqRatiosArray(double[] freqRatiosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(freqRatiosArray, FREQRATIOS$4);
            }
        }
        
        /**
         * Sets ith "freqRatios" element
         */
        public void setFreqRatiosArray(int i, double freqRatios)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQRATIOS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(freqRatios);
            }
        }
        
        /**
         * Sets (as xml) array of all "freqRatios" element
         */
        public void xsetFreqRatiosArray(org.apache.xmlbeans.XmlDouble[]freqRatiosArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(freqRatiosArray, FREQRATIOS$4);
            }
        }
        
        /**
         * Sets (as xml) ith "freqRatios" element
         */
        public void xsetFreqRatiosArray(int i, org.apache.xmlbeans.XmlDouble freqRatios)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(FREQRATIOS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(freqRatios);
            }
        }
        
        /**
         * Inserts the value as the ith "freqRatios" element
         */
        public void insertFreqRatios(int i, double freqRatios)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FREQRATIOS$4, i);
                target.setDoubleValue(freqRatios);
            }
        }
        
        /**
         * Appends the value as the last "freqRatios" element
         */
        public void addFreqRatios(double freqRatios)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREQRATIOS$4);
                target.setDoubleValue(freqRatios);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "freqRatios" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewFreqRatios(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(FREQRATIOS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "freqRatios" element
         */
        public org.apache.xmlbeans.XmlDouble addNewFreqRatios()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(FREQRATIOS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "freqRatios" element
         */
        public void removeFreqRatios(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FREQRATIOS$4, i);
            }
        }
        
        /**
         * Gets array of all "informationContent" elements
         */
        public double[] getInformationContentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFORMATIONCONTENT$6, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "informationContent" element
         */
        public double getInformationContentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONCONTENT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "informationContent" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetInformationContentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFORMATIONCONTENT$6, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "informationContent" element
         */
        public org.apache.xmlbeans.XmlDouble xgetInformationContentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INFORMATIONCONTENT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "informationContent" element
         */
        public int sizeOfInformationContentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFORMATIONCONTENT$6);
            }
        }
        
        /**
         * Sets array of all "informationContent" element
         */
        public void setInformationContentArray(double[] informationContentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(informationContentArray, INFORMATIONCONTENT$6);
            }
        }
        
        /**
         * Sets ith "informationContent" element
         */
        public void setInformationContentArray(int i, double informationContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONCONTENT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(informationContent);
            }
        }
        
        /**
         * Sets (as xml) array of all "informationContent" element
         */
        public void xsetInformationContentArray(org.apache.xmlbeans.XmlDouble[]informationContentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(informationContentArray, INFORMATIONCONTENT$6);
            }
        }
        
        /**
         * Sets (as xml) ith "informationContent" element
         */
        public void xsetInformationContentArray(int i, org.apache.xmlbeans.XmlDouble informationContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(INFORMATIONCONTENT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(informationContent);
            }
        }
        
        /**
         * Inserts the value as the ith "informationContent" element
         */
        public void insertInformationContent(int i, double informationContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INFORMATIONCONTENT$6, i);
                target.setDoubleValue(informationContent);
            }
        }
        
        /**
         * Appends the value as the last "informationContent" element
         */
        public void addInformationContent(double informationContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMATIONCONTENT$6);
                target.setDoubleValue(informationContent);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "informationContent" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewInformationContent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(INFORMATIONCONTENT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "informationContent" element
         */
        public org.apache.xmlbeans.XmlDouble addNewInformationContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(INFORMATIONCONTENT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "informationContent" element
         */
        public void removeInformationContent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFORMATIONCONTENT$6, i);
            }
        }
        
        /**
         * Gets array of all "gaplessColumnWeights" elements
         */
        public double[] getGaplessColumnWeightsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GAPLESSCOLUMNWEIGHTS$8, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "gaplessColumnWeights" element
         */
        public double getGaplessColumnWeightsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPLESSCOLUMNWEIGHTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "gaplessColumnWeights" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetGaplessColumnWeightsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GAPLESSCOLUMNWEIGHTS$8, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "gaplessColumnWeights" element
         */
        public org.apache.xmlbeans.XmlDouble xgetGaplessColumnWeightsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GAPLESSCOLUMNWEIGHTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "gaplessColumnWeights" element
         */
        public int sizeOfGaplessColumnWeightsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAPLESSCOLUMNWEIGHTS$8);
            }
        }
        
        /**
         * Sets array of all "gaplessColumnWeights" element
         */
        public void setGaplessColumnWeightsArray(double[] gaplessColumnWeightsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gaplessColumnWeightsArray, GAPLESSCOLUMNWEIGHTS$8);
            }
        }
        
        /**
         * Sets ith "gaplessColumnWeights" element
         */
        public void setGaplessColumnWeightsArray(int i, double gaplessColumnWeights)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPLESSCOLUMNWEIGHTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(gaplessColumnWeights);
            }
        }
        
        /**
         * Sets (as xml) array of all "gaplessColumnWeights" element
         */
        public void xsetGaplessColumnWeightsArray(org.apache.xmlbeans.XmlDouble[]gaplessColumnWeightsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gaplessColumnWeightsArray, GAPLESSCOLUMNWEIGHTS$8);
            }
        }
        
        /**
         * Sets (as xml) ith "gaplessColumnWeights" element
         */
        public void xsetGaplessColumnWeightsArray(int i, org.apache.xmlbeans.XmlDouble gaplessColumnWeights)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GAPLESSCOLUMNWEIGHTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gaplessColumnWeights);
            }
        }
        
        /**
         * Inserts the value as the ith "gaplessColumnWeights" element
         */
        public void insertGaplessColumnWeights(int i, double gaplessColumnWeights)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GAPLESSCOLUMNWEIGHTS$8, i);
                target.setDoubleValue(gaplessColumnWeights);
            }
        }
        
        /**
         * Appends the value as the last "gaplessColumnWeights" element
         */
        public void addGaplessColumnWeights(double gaplessColumnWeights)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAPLESSCOLUMNWEIGHTS$8);
                target.setDoubleValue(gaplessColumnWeights);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gaplessColumnWeights" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewGaplessColumnWeights(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(GAPLESSCOLUMNWEIGHTS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gaplessColumnWeights" element
         */
        public org.apache.xmlbeans.XmlDouble addNewGaplessColumnWeights()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(GAPLESSCOLUMNWEIGHTS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "gaplessColumnWeights" element
         */
        public void removeGaplessColumnWeights(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAPLESSCOLUMNWEIGHTS$8, i);
            }
        }
        
        /**
         * Gets array of all "sigma" elements
         */
        public double[] getSigmaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SIGMA$10, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sigma" element
         */
        public double getSigmaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGMA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "sigma" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetSigmaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SIGMA$10, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sigma" element
         */
        public org.apache.xmlbeans.XmlDouble xgetSigmaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SIGMA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "sigma" element
         */
        public int sizeOfSigmaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIGMA$10);
            }
        }
        
        /**
         * Sets array of all "sigma" element
         */
        public void setSigmaArray(double[] sigmaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sigmaArray, SIGMA$10);
            }
        }
        
        /**
         * Sets ith "sigma" element
         */
        public void setSigmaArray(int i, double sigma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGMA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(sigma);
            }
        }
        
        /**
         * Sets (as xml) array of all "sigma" element
         */
        public void xsetSigmaArray(org.apache.xmlbeans.XmlDouble[]sigmaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sigmaArray, SIGMA$10);
            }
        }
        
        /**
         * Sets (as xml) ith "sigma" element
         */
        public void xsetSigmaArray(int i, org.apache.xmlbeans.XmlDouble sigma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SIGMA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sigma);
            }
        }
        
        /**
         * Inserts the value as the ith "sigma" element
         */
        public void insertSigma(int i, double sigma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SIGMA$10, i);
                target.setDoubleValue(sigma);
            }
        }
        
        /**
         * Appends the value as the last "sigma" element
         */
        public void addSigma(double sigma)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGMA$10);
                target.setDoubleValue(sigma);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sigma" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewSigma(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(SIGMA$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sigma" element
         */
        public org.apache.xmlbeans.XmlDouble addNewSigma()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SIGMA$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "sigma" element
         */
        public void removeSigma(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIGMA$10, i);
            }
        }
        
        /**
         * Gets array of all "intervalSizes" elements
         */
        public java.math.BigInteger[] getIntervalSizesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTERVALSIZES$12, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "intervalSizes" element
         */
        public java.math.BigInteger getIntervalSizesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALSIZES$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "intervalSizes" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetIntervalSizesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTERVALSIZES$12, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "intervalSizes" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIntervalSizesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTERVALSIZES$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "intervalSizes" element
         */
        public int sizeOfIntervalSizesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERVALSIZES$12);
            }
        }
        
        /**
         * Sets array of all "intervalSizes" element
         */
        public void setIntervalSizesArray(java.math.BigInteger[] intervalSizesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(intervalSizesArray, INTERVALSIZES$12);
            }
        }
        
        /**
         * Sets ith "intervalSizes" element
         */
        public void setIntervalSizesArray(int i, java.math.BigInteger intervalSizes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALSIZES$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(intervalSizes);
            }
        }
        
        /**
         * Sets (as xml) array of all "intervalSizes" element
         */
        public void xsetIntervalSizesArray(org.apache.xmlbeans.XmlInteger[]intervalSizesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(intervalSizesArray, INTERVALSIZES$12);
            }
        }
        
        /**
         * Sets (as xml) ith "intervalSizes" element
         */
        public void xsetIntervalSizesArray(int i, org.apache.xmlbeans.XmlInteger intervalSizes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INTERVALSIZES$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(intervalSizes);
            }
        }
        
        /**
         * Inserts the value as the ith "intervalSizes" element
         */
        public void insertIntervalSizes(int i, java.math.BigInteger intervalSizes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTERVALSIZES$12, i);
                target.setBigIntegerValue(intervalSizes);
            }
        }
        
        /**
         * Appends the value as the last "intervalSizes" element
         */
        public void addIntervalSizes(java.math.BigInteger intervalSizes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALSIZES$12);
                target.setBigIntegerValue(intervalSizes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "intervalSizes" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewIntervalSizes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(INTERVALSIZES$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "intervalSizes" element
         */
        public org.apache.xmlbeans.XmlInteger addNewIntervalSizes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INTERVALSIZES$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "intervalSizes" element
         */
        public void removeIntervalSizes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERVALSIZES$12, i);
            }
        }
        
        /**
         * Gets array of all "numMatchingSeqs" elements
         */
        public java.math.BigInteger[] getNumMatchingSeqsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NUMMATCHINGSEQS$14, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "numMatchingSeqs" element
         */
        public java.math.BigInteger getNumMatchingSeqsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMMATCHINGSEQS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "numMatchingSeqs" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetNumMatchingSeqsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NUMMATCHINGSEQS$14, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "numMatchingSeqs" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumMatchingSeqsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMMATCHINGSEQS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "numMatchingSeqs" element
         */
        public int sizeOfNumMatchingSeqsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMMATCHINGSEQS$14);
            }
        }
        
        /**
         * Sets array of all "numMatchingSeqs" element
         */
        public void setNumMatchingSeqsArray(java.math.BigInteger[] numMatchingSeqsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(numMatchingSeqsArray, NUMMATCHINGSEQS$14);
            }
        }
        
        /**
         * Sets ith "numMatchingSeqs" element
         */
        public void setNumMatchingSeqsArray(int i, java.math.BigInteger numMatchingSeqs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMMATCHINGSEQS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(numMatchingSeqs);
            }
        }
        
        /**
         * Sets (as xml) array of all "numMatchingSeqs" element
         */
        public void xsetNumMatchingSeqsArray(org.apache.xmlbeans.XmlInteger[]numMatchingSeqsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(numMatchingSeqsArray, NUMMATCHINGSEQS$14);
            }
        }
        
        /**
         * Sets (as xml) ith "numMatchingSeqs" element
         */
        public void xsetNumMatchingSeqsArray(int i, org.apache.xmlbeans.XmlInteger numMatchingSeqs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMMATCHINGSEQS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(numMatchingSeqs);
            }
        }
        
        /**
         * Inserts the value as the ith "numMatchingSeqs" element
         */
        public void insertNumMatchingSeqs(int i, java.math.BigInteger numMatchingSeqs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NUMMATCHINGSEQS$14, i);
                target.setBigIntegerValue(numMatchingSeqs);
            }
        }
        
        /**
         * Appends the value as the last "numMatchingSeqs" element
         */
        public void addNumMatchingSeqs(java.math.BigInteger numMatchingSeqs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMMATCHINGSEQS$14);
                target.setBigIntegerValue(numMatchingSeqs);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "numMatchingSeqs" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewNumMatchingSeqs(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(NUMMATCHINGSEQS$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "numMatchingSeqs" element
         */
        public org.apache.xmlbeans.XmlInteger addNewNumMatchingSeqs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMMATCHINGSEQS$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "numMatchingSeqs" element
         */
        public void removeNumMatchingSeqs(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMMATCHINGSEQS$14, i);
            }
        }
    }
}
