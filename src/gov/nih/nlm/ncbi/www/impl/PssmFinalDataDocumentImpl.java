/*
 * An XML document type.
 * Localname: PssmFinalData
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmFinalDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PssmFinalData(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PssmFinalDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmFinalDataDocument
{
    
    public PssmFinalDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PSSMFINALDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmFinalData");
    
    
    /**
     * Gets the "PssmFinalData" element
     */
    public gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData getPssmFinalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData target = null;
            target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().find_element_user(PSSMFINALDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PssmFinalData" element
     */
    public void setPssmFinalData(gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData pssmFinalData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData target = null;
            target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().find_element_user(PSSMFINALDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().add_element_user(PSSMFINALDATA$0);
            }
            target.set(pssmFinalData);
        }
    }
    
    /**
     * Appends and returns a new empty "PssmFinalData" element
     */
    public gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData addNewPssmFinalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData target = null;
            target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().add_element_user(PSSMFINALDATA$0);
            return target;
        }
    }
    /**
     * An XML PssmFinalData(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PssmFinalDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData
    {
        
        public PssmFinalDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCORES$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "scores");
        private static final javax.xml.namespace.QName LAMBDA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lambda");
        private static final javax.xml.namespace.QName KAPPA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "kappa");
        private static final javax.xml.namespace.QName H$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "h");
        private static final javax.xml.namespace.QName SCALINGFACTOR$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "scalingFactor");
        private static final javax.xml.namespace.QName LAMBDAUNGAPPED$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lambdaUngapped");
        private static final javax.xml.namespace.QName KAPPAUNGAPPED$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "kappaUngapped");
        private static final javax.xml.namespace.QName HUNGAPPED$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "hUngapped");
        
        
        /**
         * Gets array of all "scores" elements
         */
        public java.math.BigInteger[] getScoresArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCORES$0, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "scores" element
         */
        public java.math.BigInteger getScoresArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "scores" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetScoresArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCORES$0, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "scores" element
         */
        public org.apache.xmlbeans.XmlInteger xgetScoresArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SCORES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "scores" element
         */
        public int sizeOfScoresArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORES$0);
            }
        }
        
        /**
         * Sets array of all "scores" element
         */
        public void setScoresArray(java.math.BigInteger[] scoresArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(scoresArray, SCORES$0);
            }
        }
        
        /**
         * Sets ith "scores" element
         */
        public void setScoresArray(int i, java.math.BigInteger scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(scores);
            }
        }
        
        /**
         * Sets (as xml) array of all "scores" element
         */
        public void xsetScoresArray(org.apache.xmlbeans.XmlInteger[]scoresArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(scoresArray, SCORES$0);
            }
        }
        
        /**
         * Sets (as xml) ith "scores" element
         */
        public void xsetScoresArray(int i, org.apache.xmlbeans.XmlInteger scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SCORES$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(scores);
            }
        }
        
        /**
         * Inserts the value as the ith "scores" element
         */
        public void insertScores(int i, java.math.BigInteger scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCORES$0, i);
                target.setBigIntegerValue(scores);
            }
        }
        
        /**
         * Appends the value as the last "scores" element
         */
        public void addScores(java.math.BigInteger scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORES$0);
                target.setBigIntegerValue(scores);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scores" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewScores(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(SCORES$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scores" element
         */
        public org.apache.xmlbeans.XmlInteger addNewScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SCORES$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "scores" element
         */
        public void removeScores(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORES$0, i);
            }
        }
        
        /**
         * Gets the "lambda" element
         */
        public double getLambda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAMBDA$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lambda" element
         */
        public org.apache.xmlbeans.XmlDouble xgetLambda()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LAMBDA$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "lambda" element
         */
        public void setLambda(double lambda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAMBDA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAMBDA$2);
                }
                target.setDoubleValue(lambda);
            }
        }
        
        /**
         * Sets (as xml) the "lambda" element
         */
        public void xsetLambda(org.apache.xmlbeans.XmlDouble lambda)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LAMBDA$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LAMBDA$2);
                }
                target.set(lambda);
            }
        }
        
        /**
         * Gets the "kappa" element
         */
        public double getKappa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAPPA$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "kappa" element
         */
        public org.apache.xmlbeans.XmlDouble xgetKappa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(KAPPA$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "kappa" element
         */
        public void setKappa(double kappa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAPPA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KAPPA$4);
                }
                target.setDoubleValue(kappa);
            }
        }
        
        /**
         * Sets (as xml) the "kappa" element
         */
        public void xsetKappa(org.apache.xmlbeans.XmlDouble kappa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(KAPPA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(KAPPA$4);
                }
                target.set(kappa);
            }
        }
        
        /**
         * Gets the "h" element
         */
        public double getH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(H$6, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "h" element
         */
        public org.apache.xmlbeans.XmlDouble xgetH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(H$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "h" element
         */
        public void setH(double h)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(H$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(H$6);
                }
                target.setDoubleValue(h);
            }
        }
        
        /**
         * Sets (as xml) the "h" element
         */
        public void xsetH(org.apache.xmlbeans.XmlDouble h)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(H$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(H$6);
                }
                target.set(h);
            }
        }
        
        /**
         * Gets the "scalingFactor" element
         */
        public java.math.BigInteger getScalingFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALINGFACTOR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "scalingFactor" element
         */
        public org.apache.xmlbeans.XmlInteger xgetScalingFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SCALINGFACTOR$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scalingFactor" element
         */
        public void setScalingFactor(java.math.BigInteger scalingFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALINGFACTOR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALINGFACTOR$8);
                }
                target.setBigIntegerValue(scalingFactor);
            }
        }
        
        /**
         * Sets (as xml) the "scalingFactor" element
         */
        public void xsetScalingFactor(org.apache.xmlbeans.XmlInteger scalingFactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SCALINGFACTOR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SCALINGFACTOR$8);
                }
                target.set(scalingFactor);
            }
        }
        
        /**
         * Gets the "lambdaUngapped" element
         */
        public double getLambdaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAMBDAUNGAPPED$10, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lambdaUngapped" element
         */
        public org.apache.xmlbeans.XmlDouble xgetLambdaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LAMBDAUNGAPPED$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "lambdaUngapped" element
         */
        public boolean isSetLambdaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LAMBDAUNGAPPED$10) != 0;
            }
        }
        
        /**
         * Sets the "lambdaUngapped" element
         */
        public void setLambdaUngapped(double lambdaUngapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAMBDAUNGAPPED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAMBDAUNGAPPED$10);
                }
                target.setDoubleValue(lambdaUngapped);
            }
        }
        
        /**
         * Sets (as xml) the "lambdaUngapped" element
         */
        public void xsetLambdaUngapped(org.apache.xmlbeans.XmlDouble lambdaUngapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LAMBDAUNGAPPED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LAMBDAUNGAPPED$10);
                }
                target.set(lambdaUngapped);
            }
        }
        
        /**
         * Unsets the "lambdaUngapped" element
         */
        public void unsetLambdaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LAMBDAUNGAPPED$10, 0);
            }
        }
        
        /**
         * Gets the "kappaUngapped" element
         */
        public double getKappaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAPPAUNGAPPED$12, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "kappaUngapped" element
         */
        public org.apache.xmlbeans.XmlDouble xgetKappaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(KAPPAUNGAPPED$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "kappaUngapped" element
         */
        public boolean isSetKappaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KAPPAUNGAPPED$12) != 0;
            }
        }
        
        /**
         * Sets the "kappaUngapped" element
         */
        public void setKappaUngapped(double kappaUngapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KAPPAUNGAPPED$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KAPPAUNGAPPED$12);
                }
                target.setDoubleValue(kappaUngapped);
            }
        }
        
        /**
         * Sets (as xml) the "kappaUngapped" element
         */
        public void xsetKappaUngapped(org.apache.xmlbeans.XmlDouble kappaUngapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(KAPPAUNGAPPED$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(KAPPAUNGAPPED$12);
                }
                target.set(kappaUngapped);
            }
        }
        
        /**
         * Unsets the "kappaUngapped" element
         */
        public void unsetKappaUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KAPPAUNGAPPED$12, 0);
            }
        }
        
        /**
         * Gets the "hUngapped" element
         */
        public double getHUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUNGAPPED$14, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "hUngapped" element
         */
        public org.apache.xmlbeans.XmlDouble xgetHUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(HUNGAPPED$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "hUngapped" element
         */
        public boolean isSetHUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HUNGAPPED$14) != 0;
            }
        }
        
        /**
         * Sets the "hUngapped" element
         */
        public void setHUngapped(double hUngapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUNGAPPED$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HUNGAPPED$14);
                }
                target.setDoubleValue(hUngapped);
            }
        }
        
        /**
         * Sets (as xml) the "hUngapped" element
         */
        public void xsetHUngapped(org.apache.xmlbeans.XmlDouble hUngapped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(HUNGAPPED$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(HUNGAPPED$14);
                }
                target.set(hUngapped);
            }
        }
        
        /**
         * Unsets the "hUngapped" element
         */
        public void unsetHUngapped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HUNGAPPED$14, 0);
            }
        }
    }
}
