/*
 * An XML document type.
 * Localname: Blast4-common-options
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument
{
    
    public Blast4CommonOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options");
    
    
    /**
     * Gets the "Blast4-common-options" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions getBlast4CommonOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().find_element_user(BLAST4COMMONOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options" element
     */
    public void setBlast4CommonOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions blast4CommonOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().find_element_user(BLAST4COMMONOPTIONS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().add_element_user(BLAST4COMMONOPTIONS$0);
            }
            target.set(blast4CommonOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions addNewBlast4CommonOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().add_element_user(BLAST4COMMONOPTIONS$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions
    {
        
        public Blast4CommonOptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERCENTIDENTITY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "percent-identity");
        private static final javax.xml.namespace.QName EVALUE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "evalue");
        private static final javax.xml.namespace.QName WORDSIZE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "word-size");
        private static final javax.xml.namespace.QName HITLISTSIZE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "hitlist-size");
        private static final javax.xml.namespace.QName DBRESTRICTION$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db-restriction");
        private static final javax.xml.namespace.QName QUERYFILTERING$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "query-filtering");
        private static final javax.xml.namespace.QName NUCLQUERYOPTIONS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "nucl-query-options");
        private static final javax.xml.namespace.QName SCORINGOPTIONS$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "scoring-options");
        private static final javax.xml.namespace.QName PHIPATTERN$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "phi-pattern");
        private static final javax.xml.namespace.QName EFFSEARCHSPACE$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "eff-search-space");
        private static final javax.xml.namespace.QName COMPBASEDSTATISTICS$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comp-based-statistics");
        
        
        /**
         * Gets the "percent-identity" element
         */
        public double getPercentIdentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTIDENTITY$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "percent-identity" element
         */
        public org.apache.xmlbeans.XmlDouble xgetPercentIdentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PERCENTIDENTITY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "percent-identity" element
         */
        public boolean isSetPercentIdentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERCENTIDENTITY$0) != 0;
            }
        }
        
        /**
         * Sets the "percent-identity" element
         */
        public void setPercentIdentity(double percentIdentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTIDENTITY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTIDENTITY$0);
                }
                target.setDoubleValue(percentIdentity);
            }
        }
        
        /**
         * Sets (as xml) the "percent-identity" element
         */
        public void xsetPercentIdentity(org.apache.xmlbeans.XmlDouble percentIdentity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PERCENTIDENTITY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PERCENTIDENTITY$0);
                }
                target.set(percentIdentity);
            }
        }
        
        /**
         * Unsets the "percent-identity" element
         */
        public void unsetPercentIdentity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERCENTIDENTITY$0, 0);
            }
        }
        
        /**
         * Gets the "evalue" element
         */
        public double getEvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUE$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "evalue" element
         */
        public org.apache.xmlbeans.XmlDouble xgetEvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EVALUE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "evalue" element
         */
        public boolean isSetEvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVALUE$2) != 0;
            }
        }
        
        /**
         * Sets the "evalue" element
         */
        public void setEvalue(double evalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVALUE$2);
                }
                target.setDoubleValue(evalue);
            }
        }
        
        /**
         * Sets (as xml) the "evalue" element
         */
        public void xsetEvalue(org.apache.xmlbeans.XmlDouble evalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EVALUE$2);
                }
                target.set(evalue);
            }
        }
        
        /**
         * Unsets the "evalue" element
         */
        public void unsetEvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVALUE$2, 0);
            }
        }
        
        /**
         * Gets the "word-size" element
         */
        public java.math.BigInteger getWordSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORDSIZE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "word-size" element
         */
        public org.apache.xmlbeans.XmlInteger xgetWordSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WORDSIZE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "word-size" element
         */
        public boolean isSetWordSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORDSIZE$4) != 0;
            }
        }
        
        /**
         * Sets the "word-size" element
         */
        public void setWordSize(java.math.BigInteger wordSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORDSIZE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORDSIZE$4);
                }
                target.setBigIntegerValue(wordSize);
            }
        }
        
        /**
         * Sets (as xml) the "word-size" element
         */
        public void xsetWordSize(org.apache.xmlbeans.XmlInteger wordSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(WORDSIZE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(WORDSIZE$4);
                }
                target.set(wordSize);
            }
        }
        
        /**
         * Unsets the "word-size" element
         */
        public void unsetWordSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORDSIZE$4, 0);
            }
        }
        
        /**
         * Gets the "hitlist-size" element
         */
        public java.math.BigInteger getHitlistSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HITLISTSIZE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "hitlist-size" element
         */
        public org.apache.xmlbeans.XmlInteger xgetHitlistSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(HITLISTSIZE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "hitlist-size" element
         */
        public boolean isSetHitlistSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HITLISTSIZE$6) != 0;
            }
        }
        
        /**
         * Sets the "hitlist-size" element
         */
        public void setHitlistSize(java.math.BigInteger hitlistSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HITLISTSIZE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HITLISTSIZE$6);
                }
                target.setBigIntegerValue(hitlistSize);
            }
        }
        
        /**
         * Sets (as xml) the "hitlist-size" element
         */
        public void xsetHitlistSize(org.apache.xmlbeans.XmlInteger hitlistSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(HITLISTSIZE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(HITLISTSIZE$6);
                }
                target.set(hitlistSize);
            }
        }
        
        /**
         * Unsets the "hitlist-size" element
         */
        public void unsetHitlistSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HITLISTSIZE$6, 0);
            }
        }
        
        /**
         * Gets the "db-restriction" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction getDbRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction)get_store().find_element_user(DBRESTRICTION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "db-restriction" element
         */
        public boolean isSetDbRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBRESTRICTION$8) != 0;
            }
        }
        
        /**
         * Sets the "db-restriction" element
         */
        public void setDbRestriction(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction dbRestriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction)get_store().find_element_user(DBRESTRICTION$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction)get_store().add_element_user(DBRESTRICTION$8);
                }
                target.set(dbRestriction);
            }
        }
        
        /**
         * Appends and returns a new empty "db-restriction" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction addNewDbRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction)get_store().add_element_user(DBRESTRICTION$8);
                return target;
            }
        }
        
        /**
         * Unsets the "db-restriction" element
         */
        public void unsetDbRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBRESTRICTION$8, 0);
            }
        }
        
        /**
         * Gets the "query-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering getQueryFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering)get_store().find_element_user(QUERYFILTERING$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "query-filtering" element
         */
        public boolean isSetQueryFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYFILTERING$10) != 0;
            }
        }
        
        /**
         * Sets the "query-filtering" element
         */
        public void setQueryFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering queryFiltering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering)get_store().find_element_user(QUERYFILTERING$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering)get_store().add_element_user(QUERYFILTERING$10);
                }
                target.set(queryFiltering);
            }
        }
        
        /**
         * Appends and returns a new empty "query-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering addNewQueryFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering)get_store().add_element_user(QUERYFILTERING$10);
                return target;
            }
        }
        
        /**
         * Unsets the "query-filtering" element
         */
        public void unsetQueryFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYFILTERING$10, 0);
            }
        }
        
        /**
         * Gets the "nucl-query-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions getNuclQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions)get_store().find_element_user(NUCLQUERYOPTIONS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "nucl-query-options" element
         */
        public boolean isSetNuclQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUCLQUERYOPTIONS$12) != 0;
            }
        }
        
        /**
         * Sets the "nucl-query-options" element
         */
        public void setNuclQueryOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions nuclQueryOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions)get_store().find_element_user(NUCLQUERYOPTIONS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions)get_store().add_element_user(NUCLQUERYOPTIONS$12);
                }
                target.set(nuclQueryOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "nucl-query-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions addNewNuclQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions)get_store().add_element_user(NUCLQUERYOPTIONS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "nucl-query-options" element
         */
        public void unsetNuclQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUCLQUERYOPTIONS$12, 0);
            }
        }
        
        /**
         * Gets the "scoring-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions getScoringOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions)get_store().find_element_user(SCORINGOPTIONS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "scoring-options" element
         */
        public boolean isSetScoringOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORINGOPTIONS$14) != 0;
            }
        }
        
        /**
         * Sets the "scoring-options" element
         */
        public void setScoringOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions scoringOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions)get_store().find_element_user(SCORINGOPTIONS$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions)get_store().add_element_user(SCORINGOPTIONS$14);
                }
                target.set(scoringOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "scoring-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions addNewScoringOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions)get_store().add_element_user(SCORINGOPTIONS$14);
                return target;
            }
        }
        
        /**
         * Unsets the "scoring-options" element
         */
        public void unsetScoringOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORINGOPTIONS$14, 0);
            }
        }
        
        /**
         * Gets the "phi-pattern" element
         */
        public java.lang.String getPhiPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHIPATTERN$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phi-pattern" element
         */
        public org.apache.xmlbeans.XmlString xgetPhiPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHIPATTERN$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "phi-pattern" element
         */
        public boolean isSetPhiPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHIPATTERN$16) != 0;
            }
        }
        
        /**
         * Sets the "phi-pattern" element
         */
        public void setPhiPattern(java.lang.String phiPattern)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHIPATTERN$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHIPATTERN$16);
                }
                target.setStringValue(phiPattern);
            }
        }
        
        /**
         * Sets (as xml) the "phi-pattern" element
         */
        public void xsetPhiPattern(org.apache.xmlbeans.XmlString phiPattern)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHIPATTERN$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHIPATTERN$16);
                }
                target.set(phiPattern);
            }
        }
        
        /**
         * Unsets the "phi-pattern" element
         */
        public void unsetPhiPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHIPATTERN$16, 0);
            }
        }
        
        /**
         * Gets the "eff-search-space" element
         */
        public double getEffSearchSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFSEARCHSPACE$18, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "eff-search-space" element
         */
        public org.apache.xmlbeans.XmlDouble xgetEffSearchSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFSEARCHSPACE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "eff-search-space" element
         */
        public boolean isSetEffSearchSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EFFSEARCHSPACE$18) != 0;
            }
        }
        
        /**
         * Sets the "eff-search-space" element
         */
        public void setEffSearchSpace(double effSearchSpace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFSEARCHSPACE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFSEARCHSPACE$18);
                }
                target.setDoubleValue(effSearchSpace);
            }
        }
        
        /**
         * Sets (as xml) the "eff-search-space" element
         */
        public void xsetEffSearchSpace(org.apache.xmlbeans.XmlDouble effSearchSpace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFSEARCHSPACE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EFFSEARCHSPACE$18);
                }
                target.set(effSearchSpace);
            }
        }
        
        /**
         * Unsets the "eff-search-space" element
         */
        public void unsetEffSearchSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EFFSEARCHSPACE$18, 0);
            }
        }
        
        /**
         * Gets the "comp-based-statistics" element
         */
        public java.math.BigInteger getCompBasedStatistics()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPBASEDSTATISTICS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "comp-based-statistics" element
         */
        public org.apache.xmlbeans.XmlInteger xgetCompBasedStatistics()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COMPBASEDSTATISTICS$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "comp-based-statistics" element
         */
        public boolean isSetCompBasedStatistics()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPBASEDSTATISTICS$20) != 0;
            }
        }
        
        /**
         * Sets the "comp-based-statistics" element
         */
        public void setCompBasedStatistics(java.math.BigInteger compBasedStatistics)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPBASEDSTATISTICS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPBASEDSTATISTICS$20);
                }
                target.setBigIntegerValue(compBasedStatistics);
            }
        }
        
        /**
         * Sets (as xml) the "comp-based-statistics" element
         */
        public void xsetCompBasedStatistics(org.apache.xmlbeans.XmlInteger compBasedStatistics)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COMPBASEDSTATISTICS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COMPBASEDSTATISTICS$20);
                }
                target.set(compBasedStatistics);
            }
        }
        
        /**
         * Unsets the "comp-based-statistics" element
         */
        public void unsetCompBasedStatistics()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPBASEDSTATISTICS$20, 0);
            }
        }
        /**
         * An XML db-restriction(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbRestrictionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.DbRestriction
        {
            
            public DbRestrictionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSDBRESTRICTION$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-db-restriction");
            
            
            /**
             * Gets the "Blast4-common-options-db-restriction" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction getBlast4CommonOptionsDbRestriction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().find_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-common-options-db-restriction" element
             */
            public void setBlast4CommonOptionsDbRestriction(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction blast4CommonOptionsDbRestriction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().find_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().add_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0);
                    }
                    target.set(blast4CommonOptionsDbRestriction);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-common-options-db-restriction" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction addNewBlast4CommonOptionsDbRestriction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().add_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0);
                    return target;
                }
            }
        }
        /**
         * An XML query-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueryFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.QueryFiltering
        {
            
            public QueryFilteringImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSQUERYFILTERING$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-query-filtering");
            
            
            /**
             * Gets the "Blast4-common-options-query-filtering" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering getBlast4CommonOptionsQueryFiltering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-common-options-query-filtering" element
             */
            public void setBlast4CommonOptionsQueryFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering blast4CommonOptionsQueryFiltering)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0);
                    }
                    target.set(blast4CommonOptionsQueryFiltering);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-common-options-query-filtering" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering addNewBlast4CommonOptionsQueryFiltering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0);
                    return target;
                }
            }
        }
        /**
         * An XML nucl-query-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NuclQueryOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.NuclQueryOptions
        {
            
            public NuclQueryOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-nucleotide-query");
            
            
            /**
             * Gets the "Blast4-common-options-nucleotide-query" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery getBlast4CommonOptionsNucleotideQuery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().find_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-common-options-nucleotide-query" element
             */
            public void setBlast4CommonOptionsNucleotideQuery(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery blast4CommonOptionsNucleotideQuery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().find_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().add_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0);
                    }
                    target.set(blast4CommonOptionsNucleotideQuery);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-common-options-nucleotide-query" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery addNewBlast4CommonOptionsNucleotideQuery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().add_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0);
                    return target;
                }
            }
        }
        /**
         * An XML scoring-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ScoringOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions.ScoringOptions
        {
            
            public ScoringOptionsImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
