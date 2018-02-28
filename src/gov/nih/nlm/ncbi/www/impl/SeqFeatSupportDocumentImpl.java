/*
 * An XML document type.
 * Localname: SeqFeatSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqFeatSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqFeatSupportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatSupportDocument
{
    
    public SeqFeatSupportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQFEATSUPPORT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatSupport");
    
    
    /**
     * Gets the "SeqFeatSupport" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport getSeqFeatSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().find_element_user(SEQFEATSUPPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqFeatSupport" element
     */
    public void setSeqFeatSupport(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport seqFeatSupport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().find_element_user(SEQFEATSUPPORT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().add_element_user(SEQFEATSUPPORT$0);
            }
            target.set(seqFeatSupport);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqFeatSupport" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport addNewSeqFeatSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport)get_store().add_element_user(SEQFEATSUPPORT$0);
            return target;
        }
    }
    /**
     * An XML SeqFeatSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqFeatSupportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport
    {
        
        public SeqFeatSupportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXPERIMENT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "experiment");
        private static final javax.xml.namespace.QName INFERENCE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "inference");
        private static final javax.xml.namespace.QName MODELEVIDENCE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "model-evidence");
        
        
        /**
         * Gets the "experiment" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment getExperiment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment)get_store().find_element_user(EXPERIMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "experiment" element
         */
        public boolean isSetExperiment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPERIMENT$0) != 0;
            }
        }
        
        /**
         * Sets the "experiment" element
         */
        public void setExperiment(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment experiment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment)get_store().find_element_user(EXPERIMENT$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment)get_store().add_element_user(EXPERIMENT$0);
                }
                target.set(experiment);
            }
        }
        
        /**
         * Appends and returns a new empty "experiment" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment addNewExperiment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment)get_store().add_element_user(EXPERIMENT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "experiment" element
         */
        public void unsetExperiment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPERIMENT$0, 0);
            }
        }
        
        /**
         * Gets the "inference" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference getInference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference)get_store().find_element_user(INFERENCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inference" element
         */
        public boolean isSetInference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFERENCE$2) != 0;
            }
        }
        
        /**
         * Sets the "inference" element
         */
        public void setInference(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference inference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference)get_store().find_element_user(INFERENCE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference)get_store().add_element_user(INFERENCE$2);
                }
                target.set(inference);
            }
        }
        
        /**
         * Appends and returns a new empty "inference" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference addNewInference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference)get_store().add_element_user(INFERENCE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "inference" element
         */
        public void unsetInference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFERENCE$2, 0);
            }
        }
        
        /**
         * Gets the "model-evidence" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence getModelEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence)get_store().find_element_user(MODELEVIDENCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "model-evidence" element
         */
        public boolean isSetModelEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODELEVIDENCE$4) != 0;
            }
        }
        
        /**
         * Sets the "model-evidence" element
         */
        public void setModelEvidence(gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence modelEvidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence)get_store().find_element_user(MODELEVIDENCE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence)get_store().add_element_user(MODELEVIDENCE$4);
                }
                target.set(modelEvidence);
            }
        }
        
        /**
         * Appends and returns a new empty "model-evidence" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence addNewModelEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence)get_store().add_element_user(MODELEVIDENCE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "model-evidence" element
         */
        public void unsetModelEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODELEVIDENCE$4, 0);
            }
        }
        /**
         * An XML experiment(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExperimentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Experiment
        {
            
            public ExperimentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EXPERIMENTSUPPORT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ExperimentSupport");
            
            
            /**
             * Gets array of all "ExperimentSupport" elements
             */
            public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport[] getExperimentSupportArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EXPERIMENTSUPPORT$0, targetList);
                    gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport[] result = new gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ExperimentSupport" element
             */
            public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport getExperimentSupportArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().find_element_user(EXPERIMENTSUPPORT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ExperimentSupport" element
             */
            public int sizeOfExperimentSupportArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXPERIMENTSUPPORT$0);
                }
            }
            
            /**
             * Sets array of all "ExperimentSupport" element
             */
            public void setExperimentSupportArray(gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport[] experimentSupportArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(experimentSupportArray, EXPERIMENTSUPPORT$0);
                }
            }
            
            /**
             * Sets ith "ExperimentSupport" element
             */
            public void setExperimentSupportArray(int i, gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport experimentSupport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().find_element_user(EXPERIMENTSUPPORT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(experimentSupport);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ExperimentSupport" element
             */
            public gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport insertNewExperimentSupport(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ExperimentSupportDocument.ExperimentSupport)get_store().insert_element_user(EXPERIMENTSUPPORT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ExperimentSupport" element
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
             * Removes the ith "ExperimentSupport" element
             */
            public void removeExperimentSupport(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXPERIMENTSUPPORT$0, i);
                }
            }
        }
        /**
         * An XML inference(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class InferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.Inference
        {
            
            public InferenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INFERENCESUPPORT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "InferenceSupport");
            
            
            /**
             * Gets array of all "InferenceSupport" elements
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport[] getInferenceSupportArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFERENCESUPPORT$0, targetList);
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport[] result = new gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "InferenceSupport" element
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport getInferenceSupportArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().find_element_user(INFERENCESUPPORT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "InferenceSupport" element
             */
            public int sizeOfInferenceSupportArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFERENCESUPPORT$0);
                }
            }
            
            /**
             * Sets array of all "InferenceSupport" element
             */
            public void setInferenceSupportArray(gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport[] inferenceSupportArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(inferenceSupportArray, INFERENCESUPPORT$0);
                }
            }
            
            /**
             * Sets ith "InferenceSupport" element
             */
            public void setInferenceSupportArray(int i, gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport inferenceSupport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().find_element_user(INFERENCESUPPORT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(inferenceSupport);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "InferenceSupport" element
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport insertNewInferenceSupport(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().insert_element_user(INFERENCESUPPORT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "InferenceSupport" element
             */
            public gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport addNewInferenceSupport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.InferenceSupportDocument.InferenceSupport)get_store().add_element_user(INFERENCESUPPORT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "InferenceSupport" element
             */
            public void removeInferenceSupport(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFERENCESUPPORT$0, i);
                }
            }
        }
        /**
         * An XML model-evidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ModelEvidenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatSupportDocument.SeqFeatSupport.ModelEvidence
        {
            
            public ModelEvidenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MODELEVIDENCESUPPORT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ModelEvidenceSupport");
            
            
            /**
             * Gets array of all "ModelEvidenceSupport" elements
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport[] getModelEvidenceSupportArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MODELEVIDENCESUPPORT$0, targetList);
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport[] result = new gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ModelEvidenceSupport" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport getModelEvidenceSupportArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().find_element_user(MODELEVIDENCESUPPORT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ModelEvidenceSupport" element
             */
            public int sizeOfModelEvidenceSupportArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MODELEVIDENCESUPPORT$0);
                }
            }
            
            /**
             * Sets array of all "ModelEvidenceSupport" element
             */
            public void setModelEvidenceSupportArray(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport[] modelEvidenceSupportArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(modelEvidenceSupportArray, MODELEVIDENCESUPPORT$0);
                }
            }
            
            /**
             * Sets ith "ModelEvidenceSupport" element
             */
            public void setModelEvidenceSupportArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport modelEvidenceSupport)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().find_element_user(MODELEVIDENCESUPPORT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(modelEvidenceSupport);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceSupport" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport insertNewModelEvidenceSupport(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().insert_element_user(MODELEVIDENCESUPPORT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceSupport" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport addNewModelEvidenceSupport()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().add_element_user(MODELEVIDENCESUPPORT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ModelEvidenceSupport" element
             */
            public void removeModelEvidenceSupport(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MODELEVIDENCESUPPORT$0, i);
                }
            }
        }
    }
}
