/*
 * An XML document type.
 * Localname: ArticleId
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ArticleIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one ArticleId(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ArticleIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument
{
    
    public ArticleIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTICLEID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ArticleId");
    
    
    /**
     * Gets the "ArticleId" element
     */
    public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId getArticleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
            target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().find_element_user(ARTICLEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArticleId" element
     */
    public void setArticleId(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId articleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
            target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().find_element_user(ARTICLEID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().add_element_user(ARTICLEID$0);
            }
            target.set(articleId);
        }
    }
    
    /**
     * Appends and returns a new empty "ArticleId" element
     */
    public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId addNewArticleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId target = null;
            target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId)get_store().add_element_user(ARTICLEID$0);
            return target;
        }
    }
    /**
     * An XML ArticleId(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ArticleIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId
    {
        
        public ArticleIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUBMED$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pubmed");
        private static final javax.xml.namespace.QName MEDLINE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "medline");
        private static final javax.xml.namespace.QName DOI$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "doi");
        private static final javax.xml.namespace.QName PII$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pii");
        private static final javax.xml.namespace.QName PMCID$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmcid");
        private static final javax.xml.namespace.QName PMCPID$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmcpid");
        private static final javax.xml.namespace.QName PMPID$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmpid");
        private static final javax.xml.namespace.QName OTHER$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "other");
        
        
        /**
         * Gets the "pubmed" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed getPubmed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed)get_store().find_element_user(PUBMED$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pubmed" element
         */
        public boolean isSetPubmed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBMED$0) != 0;
            }
        }
        
        /**
         * Sets the "pubmed" element
         */
        public void setPubmed(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed pubmed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed)get_store().find_element_user(PUBMED$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed)get_store().add_element_user(PUBMED$0);
                }
                target.set(pubmed);
            }
        }
        
        /**
         * Appends and returns a new empty "pubmed" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed addNewPubmed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed)get_store().add_element_user(PUBMED$0);
                return target;
            }
        }
        
        /**
         * Unsets the "pubmed" element
         */
        public void unsetPubmed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBMED$0, 0);
            }
        }
        
        /**
         * Gets the "medline" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline getMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline)get_store().find_element_user(MEDLINE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "medline" element
         */
        public boolean isSetMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDLINE$2) != 0;
            }
        }
        
        /**
         * Sets the "medline" element
         */
        public void setMedline(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline medline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline)get_store().find_element_user(MEDLINE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline)get_store().add_element_user(MEDLINE$2);
                }
                target.set(medline);
            }
        }
        
        /**
         * Appends and returns a new empty "medline" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline addNewMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline)get_store().add_element_user(MEDLINE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "medline" element
         */
        public void unsetMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDLINE$2, 0);
            }
        }
        
        /**
         * Gets the "doi" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi getDoi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi)get_store().find_element_user(DOI$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "doi" element
         */
        public boolean isSetDoi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOI$4) != 0;
            }
        }
        
        /**
         * Sets the "doi" element
         */
        public void setDoi(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi doi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi)get_store().find_element_user(DOI$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi)get_store().add_element_user(DOI$4);
                }
                target.set(doi);
            }
        }
        
        /**
         * Appends and returns a new empty "doi" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi addNewDoi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi)get_store().add_element_user(DOI$4);
                return target;
            }
        }
        
        /**
         * Unsets the "doi" element
         */
        public void unsetDoi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOI$4, 0);
            }
        }
        
        /**
         * Gets the "pii" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii getPii()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii)get_store().find_element_user(PII$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pii" element
         */
        public boolean isSetPii()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PII$6) != 0;
            }
        }
        
        /**
         * Sets the "pii" element
         */
        public void setPii(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii pii)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii)get_store().find_element_user(PII$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii)get_store().add_element_user(PII$6);
                }
                target.set(pii);
            }
        }
        
        /**
         * Appends and returns a new empty "pii" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii addNewPii()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii)get_store().add_element_user(PII$6);
                return target;
            }
        }
        
        /**
         * Unsets the "pii" element
         */
        public void unsetPii()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PII$6, 0);
            }
        }
        
        /**
         * Gets the "pmcid" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid getPmcid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid)get_store().find_element_user(PMCID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmcid" element
         */
        public boolean isSetPmcid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMCID$8) != 0;
            }
        }
        
        /**
         * Sets the "pmcid" element
         */
        public void setPmcid(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid pmcid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid)get_store().find_element_user(PMCID$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid)get_store().add_element_user(PMCID$8);
                }
                target.set(pmcid);
            }
        }
        
        /**
         * Appends and returns a new empty "pmcid" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid addNewPmcid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid)get_store().add_element_user(PMCID$8);
                return target;
            }
        }
        
        /**
         * Unsets the "pmcid" element
         */
        public void unsetPmcid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMCID$8, 0);
            }
        }
        
        /**
         * Gets the "pmcpid" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid getPmcpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid)get_store().find_element_user(PMCPID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmcpid" element
         */
        public boolean isSetPmcpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMCPID$10) != 0;
            }
        }
        
        /**
         * Sets the "pmcpid" element
         */
        public void setPmcpid(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid pmcpid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid)get_store().find_element_user(PMCPID$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid)get_store().add_element_user(PMCPID$10);
                }
                target.set(pmcpid);
            }
        }
        
        /**
         * Appends and returns a new empty "pmcpid" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid addNewPmcpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid)get_store().add_element_user(PMCPID$10);
                return target;
            }
        }
        
        /**
         * Unsets the "pmcpid" element
         */
        public void unsetPmcpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMCPID$10, 0);
            }
        }
        
        /**
         * Gets the "pmpid" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid getPmpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid)get_store().find_element_user(PMPID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmpid" element
         */
        public boolean isSetPmpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMPID$12) != 0;
            }
        }
        
        /**
         * Sets the "pmpid" element
         */
        public void setPmpid(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid pmpid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid)get_store().find_element_user(PMPID$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid)get_store().add_element_user(PMPID$12);
                }
                target.set(pmpid);
            }
        }
        
        /**
         * Appends and returns a new empty "pmpid" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid addNewPmpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid)get_store().add_element_user(PMPID$12);
                return target;
            }
        }
        
        /**
         * Unsets the "pmpid" element
         */
        public void unsetPmpid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMPID$12, 0);
            }
        }
        
        /**
         * Gets the "other" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other getOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other)get_store().find_element_user(OTHER$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "other" element
         */
        public boolean isSetOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHER$14) != 0;
            }
        }
        
        /**
         * Sets the "other" element
         */
        public void setOther(gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other)get_store().find_element_user(OTHER$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other)get_store().add_element_user(OTHER$14);
                }
                target.set(other);
            }
        }
        
        /**
         * Appends and returns a new empty "other" element
         */
        public gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other addNewOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other)get_store().add_element_user(OTHER$14);
                return target;
            }
        }
        
        /**
         * Unsets the "other" element
         */
        public void unsetOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHER$14, 0);
            }
        }
        /**
         * An XML pubmed(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubmedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pubmed
        {
            
            public PubmedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBMEDID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
            
            
            /**
             * Gets the "PubMedId" element
             */
            public java.math.BigInteger getPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger xgetPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PubMedId" element
             */
            public void setPubMedId(java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBMEDID$0);
                    }
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            public void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PUBMEDID$0);
                    }
                    target.set(pubMedId);
                }
            }
        }
        /**
         * An XML medline(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MedlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Medline
        {
            
            public MedlineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINEUID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "MedlineUID");
            
            
            /**
             * Gets the "MedlineUID" element
             */
            public java.math.BigInteger getMedlineUID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDLINEUID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "MedlineUID" element
             */
            public org.apache.xmlbeans.XmlInteger xgetMedlineUID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MEDLINEUID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "MedlineUID" element
             */
            public void setMedlineUID(java.math.BigInteger medlineUID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDLINEUID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDLINEUID$0);
                    }
                    target.setBigIntegerValue(medlineUID);
                }
            }
            
            /**
             * Sets (as xml) the "MedlineUID" element
             */
            public void xsetMedlineUID(org.apache.xmlbeans.XmlInteger medlineUID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MEDLINEUID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MEDLINEUID$0);
                    }
                    target.set(medlineUID);
                }
            }
        }
        /**
         * An XML doi(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DoiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Doi
        {
            
            public DoiImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DOI$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "DOI");
            
            
            /**
             * Gets the "DOI" element
             */
            public java.lang.String getDOI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DOI" element
             */
            public org.apache.xmlbeans.XmlString xgetDOI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "DOI" element
             */
            public void setDOI(java.lang.String doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOI$0);
                    }
                    target.setStringValue(doi);
                }
            }
            
            /**
             * Sets (as xml) the "DOI" element
             */
            public void xsetDOI(org.apache.xmlbeans.XmlString doi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOI$0);
                    }
                    target.set(doi);
                }
            }
        }
        /**
         * An XML pii(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PiiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pii
        {
            
            public PiiImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PII$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PII");
            
            
            /**
             * Gets the "PII" element
             */
            public java.lang.String getPII()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PII$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PII" element
             */
            public org.apache.xmlbeans.XmlString xgetPII()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PII$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PII" element
             */
            public void setPII(java.lang.String pii)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PII$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PII$0);
                    }
                    target.setStringValue(pii);
                }
            }
            
            /**
             * Sets (as xml) the "PII" element
             */
            public void xsetPII(org.apache.xmlbeans.XmlString pii)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PII$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PII$0);
                    }
                    target.set(pii);
                }
            }
        }
        /**
         * An XML pmcid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmcidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcid
        {
            
            public PmcidImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PMCID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PmcID");
            
            
            /**
             * Gets the "PmcID" element
             */
            public java.math.BigInteger getPmcID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "PmcID" element
             */
            public org.apache.xmlbeans.XmlInteger xgetPmcID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PMCID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PmcID" element
             */
            public void setPmcID(java.math.BigInteger pmcID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMCID$0);
                    }
                    target.setBigIntegerValue(pmcID);
                }
            }
            
            /**
             * Sets (as xml) the "PmcID" element
             */
            public void xsetPmcID(org.apache.xmlbeans.XmlInteger pmcID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PMCID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PMCID$0);
                    }
                    target.set(pmcID);
                }
            }
        }
        /**
         * An XML pmcpid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmcpidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmcpid
        {
            
            public PmcpidImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PMCPID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PmcPid");
            
            
            /**
             * Gets the "PmcPid" element
             */
            public java.lang.String getPmcPid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCPID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PmcPid" element
             */
            public org.apache.xmlbeans.XmlString xgetPmcPid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMCPID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PmcPid" element
             */
            public void setPmcPid(java.lang.String pmcPid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCPID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMCPID$0);
                    }
                    target.setStringValue(pmcPid);
                }
            }
            
            /**
             * Sets (as xml) the "PmcPid" element
             */
            public void xsetPmcPid(org.apache.xmlbeans.XmlString pmcPid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMCPID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PMCPID$0);
                    }
                    target.set(pmcPid);
                }
            }
        }
        /**
         * An XML pmpid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmpidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Pmpid
        {
            
            public PmpidImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PMPID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PmPid");
            
            
            /**
             * Gets the "PmPid" element
             */
            public java.lang.String getPmPid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMPID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PmPid" element
             */
            public org.apache.xmlbeans.XmlString xgetPmPid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMPID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PmPid" element
             */
            public void setPmPid(java.lang.String pmPid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMPID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMPID$0);
                    }
                    target.setStringValue(pmPid);
                }
            }
            
            /**
             * Sets (as xml) the "PmPid" element
             */
            public void xsetPmPid(org.apache.xmlbeans.XmlString pmPid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMPID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PMPID$0);
                    }
                    target.set(pmPid);
                }
            }
        }
        /**
         * An XML other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ArticleIdDocument.ArticleId.Other
        {
            
            public OtherImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
