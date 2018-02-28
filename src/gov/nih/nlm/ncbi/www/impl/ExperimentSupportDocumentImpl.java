/*
 * An XML document type.
 * Localname: ExperimentSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ExperimentSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one ExperimentSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ExperimentSupportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExperimentSupportDocument
{
    
    public ExperimentSupportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPERIMENTSUPPORT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ExperimentSupport");
    
    
    /**
     * Gets the "ExperimentSupport" element
     */
    public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport getExperimentSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport target = null;
            target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().find_element_user(EXPERIMENTSUPPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExperimentSupport" element
     */
    public void setExperimentSupport(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport experimentSupport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport target = null;
            target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().find_element_user(EXPERIMENTSUPPORT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().add_element_user(EXPERIMENTSUPPORT$0);
            }
            target.set(experimentSupport);
        }
    }
    
    /**
     * Appends and returns a new empty "ExperimentSupport" element
     */
    public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport addNewExperimentSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport target = null;
            target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().add_element_user(EXPERIMENTSUPPORT$0);
            return target;
        }
    }
    /**
     * An XML ExperimentSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ExperimentSupportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport
    {
        
        public ExperimentSupportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "category");
        private static final javax.xml.namespace.QName EXPLANATION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "explanation");
        private static final javax.xml.namespace.QName PMIDS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmids");
        private static final javax.xml.namespace.QName DOIS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dois");
        
        
        /**
         * Gets the "category" element
         */
        public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category getCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "category" element
         */
        public boolean isSetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORY$0) != 0;
            }
        }
        
        /**
         * Sets the "category" element
         */
        public void setCategory(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category)get_store().find_element_user(CATEGORY$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category)get_store().add_element_user(CATEGORY$0);
                }
                target.set(category);
            }
        }
        
        /**
         * Appends and returns a new empty "category" element
         */
        public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category addNewCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category)get_store().add_element_user(CATEGORY$0);
                return target;
            }
        }
        
        /**
         * Unsets the "category" element
         */
        public void unsetCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORY$0, 0);
            }
        }
        
        /**
         * Gets the "explanation" element
         */
        public java.lang.String getExplanation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "explanation" element
         */
        public org.apache.xmlbeans.XmlString xgetExplanation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "explanation" element
         */
        public void setExplanation(java.lang.String explanation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLANATION$2);
                }
                target.setStringValue(explanation);
            }
        }
        
        /**
         * Sets (as xml) the "explanation" element
         */
        public void xsetExplanation(org.apache.xmlbeans.XmlString explanation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLANATION$2);
                }
                target.set(explanation);
            }
        }
        
        /**
         * Gets the "pmids" element
         */
        public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids getPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids)get_store().find_element_user(PMIDS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmids" element
         */
        public boolean isSetPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMIDS$4) != 0;
            }
        }
        
        /**
         * Sets the "pmids" element
         */
        public void setPmids(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids pmids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids)get_store().find_element_user(PMIDS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids)get_store().add_element_user(PMIDS$4);
                }
                target.set(pmids);
            }
        }
        
        /**
         * Appends and returns a new empty "pmids" element
         */
        public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids addNewPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids)get_store().add_element_user(PMIDS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "pmids" element
         */
        public void unsetPmids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMIDS$4, 0);
            }
        }
        
        /**
         * Gets the "dois" element
         */
        public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois getDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois)get_store().find_element_user(DOIS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dois" element
         */
        public boolean isSetDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOIS$6) != 0;
            }
        }
        
        /**
         * Sets the "dois" element
         */
        public void setDois(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois dois)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois)get_store().find_element_user(DOIS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois)get_store().add_element_user(DOIS$6);
                }
                target.set(dois);
            }
        }
        
        /**
         * Appends and returns a new empty "dois" element
         */
        public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois addNewDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois target = null;
                target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois)get_store().add_element_user(DOIS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "dois" element
         */
        public void unsetDois()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOIS$6, 0);
            }
        }
        /**
         * An XML category(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CategoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Category
        {
            
            public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EVIDENCECATEGORY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EvidenceCategory");
            
            
            /**
             * Gets the "EvidenceCategory" element
             */
            public gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory getEvidenceCategory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().find_element_user(EVIDENCECATEGORY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EvidenceCategory" element
             */
            public void setEvidenceCategory(gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory evidenceCategory)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().find_element_user(EVIDENCECATEGORY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().add_element_user(EVIDENCECATEGORY$0);
                    }
                    target.set(evidenceCategory);
                }
            }
            
            /**
             * Appends and returns a new empty "EvidenceCategory" element
             */
            public gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory addNewEvidenceCategory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory target = null;
                    target = (gov.nih.nlm.ncbi.www.EvidenceCategoryDocument.EvidenceCategory)get_store().add_element_user(EVIDENCECATEGORY$0);
                    return target;
                }
            }
        }
        /**
         * An XML pmids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmidsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Pmids
        {
            
            public PmidsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBMEDID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
            
            
            /**
             * Gets array of all "PubMedId" elements
             */
            public java.math.BigInteger[] getPubMedIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUBMEDID$0, targetList);
                    java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "PubMedId" element
             */
            public java.math.BigInteger getPubMedIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "PubMedId" elements
             */
            public org.apache.xmlbeans.XmlInteger[] xgetPubMedIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUBMEDID$0, targetList);
                    org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger xgetPubMedIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlInteger)target;
                }
            }
            
            /**
             * Returns number of "PubMedId" element
             */
            public int sizeOfPubMedIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PUBMEDID$0);
                }
            }
            
            /**
             * Sets array of all "PubMedId" element
             */
            public void setPubMedIdArray(java.math.BigInteger[] pubMedIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pubMedIdArray, PUBMEDID$0);
                }
            }
            
            /**
             * Sets ith "PubMedId" element
             */
            public void setPubMedIdArray(int i, java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Sets (as xml) array of all "PubMedId" element
             */
            public void xsetPubMedIdArray(org.apache.xmlbeans.XmlInteger[]pubMedIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pubMedIdArray, PUBMEDID$0);
                }
            }
            
            /**
             * Sets (as xml) ith "PubMedId" element
             */
            public void xsetPubMedIdArray(int i, org.apache.xmlbeans.XmlInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pubMedId);
                }
            }
            
            /**
             * Inserts the value as the ith "PubMedId" element
             */
            public void insertPubMedId(int i, java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PUBMEDID$0, i);
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Appends the value as the last "PubMedId" element
             */
            public void addPubMedId(java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBMEDID$0);
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger insertNewPubMedId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PUBMEDID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger addNewPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PUBMEDID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "PubMedId" element
             */
            public void removePubMedId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PUBMEDID$0, i);
                }
            }
        }
        /**
         * An XML dois(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DoisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport.Dois
        {
            
            public DoisImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DOI$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "DOI");
            
            
            /**
             * Gets array of all "DOI" elements
             */
            public java.lang.String[] getDOIArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DOI$0, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "DOI" element
             */
            public java.lang.String getDOIArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "DOI" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetDOIArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DOI$0, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "DOI" element
             */
            public org.apache.xmlbeans.XmlString xgetDOIArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "DOI" element
             */
            public int sizeOfDOIArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DOI$0);
                }
            }
            
            /**
             * Sets array of all "DOI" element
             */
            public void setDOIArray(java.lang.String[] doiArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(doiArray, DOI$0);
                }
            }
            
            /**
             * Sets ith "DOI" element
             */
            public void setDOIArray(int i, java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Sets (as xml) array of all "DOI" element
             */
            public void xsetDOIArray(org.apache.xmlbeans.XmlString[]doiArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(doiArray, DOI$0);
                }
            }
            
            /**
             * Sets (as xml) ith "DOI" element
             */
            public void xsetDOIArray(int i, org.apache.xmlbeans.XmlString doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(doi);
                }
            }
            
            /**
             * Inserts the value as the ith "DOI" element
             */
            public void insertDOI(int i, java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOI$0, i);
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Appends the value as the last "DOI" element
             */
            public void addDOI(java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOI$0);
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DOI" element
             */
            public org.apache.xmlbeans.XmlString insertNewDOI(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DOI$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DOI" element
             */
            public org.apache.xmlbeans.XmlString addNewDOI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOI$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DOI" element
             */
            public void removeDOI(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DOI$0, i);
                }
            }
        }
    }
}
