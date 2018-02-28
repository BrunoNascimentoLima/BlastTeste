/*
 * An XML document type.
 * Localname: Blast4-common-options-scoring
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-scoring(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsScoringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument
{
    
    public Blast4CommonOptionsScoringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSSCORING$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-scoring");
    
    
    /**
     * Gets the "Blast4-common-options-scoring" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring getBlast4CommonOptionsScoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring)get_store().find_element_user(BLAST4COMMONOPTIONSSCORING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-scoring" element
     */
    public void setBlast4CommonOptionsScoring(gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring blast4CommonOptionsScoring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring)get_store().find_element_user(BLAST4COMMONOPTIONSSCORING$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring)get_store().add_element_user(BLAST4COMMONOPTIONSSCORING$0);
            }
            target.set(blast4CommonOptionsScoring);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-scoring" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring addNewBlast4CommonOptionsScoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring)get_store().add_element_user(BLAST4COMMONOPTIONSSCORING$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-scoring(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsScoringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsScoringDocument.Blast4CommonOptionsScoring
    {
        
        public Blast4CommonOptionsScoringImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATRIXNAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "matrix-name");
        private static final javax.xml.namespace.QName GAPOPENINGPENALTY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gap-opening-penalty");
        private static final javax.xml.namespace.QName GAPEXTENSIONPENALTY$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gap-extension-penalty");
        private static final javax.xml.namespace.QName MATCHREWARD$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "match-reward");
        private static final javax.xml.namespace.QName MISMATCHPENALTY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mismatch-penalty");
        
        
        /**
         * Gets the "matrix-name" element
         */
        public java.lang.String getMatrixName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATRIXNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "matrix-name" element
         */
        public org.apache.xmlbeans.XmlString xgetMatrixName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATRIXNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "matrix-name" element
         */
        public boolean isSetMatrixName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATRIXNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "matrix-name" element
         */
        public void setMatrixName(java.lang.String matrixName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATRIXNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATRIXNAME$0);
                }
                target.setStringValue(matrixName);
            }
        }
        
        /**
         * Sets (as xml) the "matrix-name" element
         */
        public void xsetMatrixName(org.apache.xmlbeans.XmlString matrixName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATRIXNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATRIXNAME$0);
                }
                target.set(matrixName);
            }
        }
        
        /**
         * Unsets the "matrix-name" element
         */
        public void unsetMatrixName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATRIXNAME$0, 0);
            }
        }
        
        /**
         * Gets the "gap-opening-penalty" element
         */
        public java.math.BigInteger getGapOpeningPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPOPENINGPENALTY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gap-opening-penalty" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGapOpeningPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPOPENINGPENALTY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "gap-opening-penalty" element
         */
        public boolean isSetGapOpeningPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAPOPENINGPENALTY$2) != 0;
            }
        }
        
        /**
         * Sets the "gap-opening-penalty" element
         */
        public void setGapOpeningPenalty(java.math.BigInteger gapOpeningPenalty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPOPENINGPENALTY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAPOPENINGPENALTY$2);
                }
                target.setBigIntegerValue(gapOpeningPenalty);
            }
        }
        
        /**
         * Sets (as xml) the "gap-opening-penalty" element
         */
        public void xsetGapOpeningPenalty(org.apache.xmlbeans.XmlInteger gapOpeningPenalty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPOPENINGPENALTY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GAPOPENINGPENALTY$2);
                }
                target.set(gapOpeningPenalty);
            }
        }
        
        /**
         * Unsets the "gap-opening-penalty" element
         */
        public void unsetGapOpeningPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAPOPENINGPENALTY$2, 0);
            }
        }
        
        /**
         * Gets the "gap-extension-penalty" element
         */
        public java.math.BigInteger getGapExtensionPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPEXTENSIONPENALTY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gap-extension-penalty" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGapExtensionPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPEXTENSIONPENALTY$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "gap-extension-penalty" element
         */
        public boolean isSetGapExtensionPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAPEXTENSIONPENALTY$4) != 0;
            }
        }
        
        /**
         * Sets the "gap-extension-penalty" element
         */
        public void setGapExtensionPenalty(java.math.BigInteger gapExtensionPenalty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPEXTENSIONPENALTY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAPEXTENSIONPENALTY$4);
                }
                target.setBigIntegerValue(gapExtensionPenalty);
            }
        }
        
        /**
         * Sets (as xml) the "gap-extension-penalty" element
         */
        public void xsetGapExtensionPenalty(org.apache.xmlbeans.XmlInteger gapExtensionPenalty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPEXTENSIONPENALTY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GAPEXTENSIONPENALTY$4);
                }
                target.set(gapExtensionPenalty);
            }
        }
        
        /**
         * Unsets the "gap-extension-penalty" element
         */
        public void unsetGapExtensionPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAPEXTENSIONPENALTY$4, 0);
            }
        }
        
        /**
         * Gets the "match-reward" element
         */
        public java.math.BigInteger getMatchReward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHREWARD$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "match-reward" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMatchReward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATCHREWARD$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "match-reward" element
         */
        public boolean isSetMatchReward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MATCHREWARD$6) != 0;
            }
        }
        
        /**
         * Sets the "match-reward" element
         */
        public void setMatchReward(java.math.BigInteger matchReward)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHREWARD$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCHREWARD$6);
                }
                target.setBigIntegerValue(matchReward);
            }
        }
        
        /**
         * Sets (as xml) the "match-reward" element
         */
        public void xsetMatchReward(org.apache.xmlbeans.XmlInteger matchReward)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MATCHREWARD$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MATCHREWARD$6);
                }
                target.set(matchReward);
            }
        }
        
        /**
         * Unsets the "match-reward" element
         */
        public void unsetMatchReward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MATCHREWARD$6, 0);
            }
        }
        
        /**
         * Gets the "mismatch-penalty" element
         */
        public java.math.BigInteger getMismatchPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISMATCHPENALTY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "mismatch-penalty" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMismatchPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MISMATCHPENALTY$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "mismatch-penalty" element
         */
        public boolean isSetMismatchPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MISMATCHPENALTY$8) != 0;
            }
        }
        
        /**
         * Sets the "mismatch-penalty" element
         */
        public void setMismatchPenalty(java.math.BigInteger mismatchPenalty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISMATCHPENALTY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISMATCHPENALTY$8);
                }
                target.setBigIntegerValue(mismatchPenalty);
            }
        }
        
        /**
         * Sets (as xml) the "mismatch-penalty" element
         */
        public void xsetMismatchPenalty(org.apache.xmlbeans.XmlInteger mismatchPenalty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MISMATCHPENALTY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MISMATCHPENALTY$8);
                }
                target.set(mismatchPenalty);
            }
        }
        
        /**
         * Unsets the "mismatch-penalty" element
         */
        public void unsetMismatchPenalty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MISMATCHPENALTY$8, 0);
            }
        }
    }
}
